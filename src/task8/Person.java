package task8;

import java.util.ArrayList;
import java.util.Random;

public class Person implements Comparable<Person> {
    private String name;
    private String taxID; // key = 11 digit tax ID (german Steuer ID)

    public static final int ID_LENGTH = 11;

    public Person(String name, String taxID) {
        this.name = name;
        this.taxID = taxID;
    }

    public String getId() {

        return taxID;
    }

    public String toString() {

        return name + ", ID: " + taxID;
    }

    @Override
    public int compareTo(Person other) {

        return taxID.compareTo(other.taxID);
    }

    public static Person[] taxIdSort(Person[] alist) {
        for (int i = 10; i >= 0; --i) {
            alist = putElementsIntoBuckets(i, alist);
        }
        return alist;
    }

    private static Person[] putElementsIntoBuckets(int index, Person[] alist) {
        int arrayLength = alist.length;
        String taxIdAsString;

        //declaring buckets
        ArrayList<ArrayList<Person>> buckets = new ArrayList<>();
        for (int k = 0; k < 10; ++k) {
            buckets.add(new ArrayList<>());
        }

        //Putting the element into the buckets according to the index value
        for (Person person : alist) {
            taxIdAsString = person.getId();
            switch (taxIdAsString.charAt(index)) {
                case '0':
                    buckets.get(0).add(person);
                    break;
                case '1':
                    buckets.get(1).add(person);
                    break;
                case '2':
                    buckets.get(2).add(person);
                    break;
                case '3':
                    buckets.get(3).add(person);
                    break;
                case '4':
                    buckets.get(4).add(person);
                    break;
                case '5':
                    buckets.get(5).add(person);
                    break;
                case '6':
                    buckets.get(6).add(person);
                    break;
                case '7':
                    buckets.get(7).add(person);
                    break;
                case '8':
                    buckets.get(8).add(person);
                    break;
                case '9':
                    buckets.get(9).add(person);
                    break;
                default:
            }
        }

        //Collect the buckets
        alist = new Person[arrayLength];
        int count = 0;
        for (ArrayList<Person> arrayList : buckets) {
            for (Person person : arrayList) {
                if (count < arrayLength) {
                    alist[count] = person;
                    ++count;
                }
            }
        }
        return alist;
    }

    /**
     * generates randomly an array containing the specified number of persons with
     * random tax IDs
     */
    public static Person[] generatePersonList(int number) {
        Person[] aliste = new Person[number];

        Random rand = new Random();

        for (int i = 0; i < aliste.length; i++) {
            String name = "Article_" + i;
            // generate random tax ID
            String taxID = "";
            for (int pos = 0; pos < ID_LENGTH; pos++) {
                taxID += rand.nextInt(10);
            }

            aliste[i] = new Person(name, taxID);
        }

        return aliste;
    }

}
