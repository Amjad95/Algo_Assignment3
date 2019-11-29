package task8;

public class PersonTestDrive {
    public final static int MAX_N = 1000000;

    public static void main(String[] args) {
        Person[] people;
        long start1;
        long ende1;

        System.out.println("Radix Sort:");
        for (int n = 100; n <= MAX_N; n *= 10) {
            people = Person.generatePersonList(n);

            start1 = System.nanoTime();
            Person.taxIdSort(people);
            ende1 = System.nanoTime();

            System.out.printf("n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);
        }
        System.out.println("- done -");

        System.out.println("java.util.Arrays.sort:");
        for (int n = 100; n <= MAX_N; n *= 10) {
            people = Person.generatePersonList(n);

            start1 = System.nanoTime();
            java.util.Arrays.sort(people);
            ende1 = System.nanoTime();

            System.out.printf("n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);
        }
        System.out.println("- done -");
    }
}
