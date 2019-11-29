package task4;

public class SortTestDrive {
    public final static int MAX_N = 100000;
    public static void main(String [] args) {
        measureRuntimeMode();
    }

    public static void measureRuntimeMode() {
        double[] an;
        long start1;
        long ende1;
        for (int n = 10; n <= MAX_N; n *= 10) {

            // generate array with random data
            an = Sort.generateTestData(n);

            // Bubble Sort
            start1 = System.nanoTime();
            Sort.bubblesort(an);
            ende1 = System.nanoTime();

            // print results
            System.out.printf("Bubble Sort:    " + "n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);

            // Selection Sort
            start1 = System.nanoTime();
            Sort.selectionsort(an);
            ende1 = System.nanoTime();

            // print results
            System.out.printf("Selection Sort: " + "n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);

            // Insertion Sort
            start1 = System.nanoTime();
            Sort.insertionsort(an);
            ende1 = System.nanoTime();

            // print results
            System.out.printf("Insertion Sort: " + "n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);

            // Heap Sort
            start1 = System.nanoTime();
            Sort.heapsort(an);
            ende1 = System.nanoTime();

            // print results
            System.out.printf("Heap Sort:      " + "n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);

            // Quick Sort
            start1 = System.nanoTime();
            Sort.quicksort(an);
            ende1 = System.nanoTime();

            // print results
            System.out.printf("Quick Sort:     " + "n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);

            //Merge Sort
            start1 = System.nanoTime();
            Sort.mergesort(an);
            ende1 = System.nanoTime();

            // print results
            System.out.printf("Merge Sort:     " + "n = %8d | runtime: %8.2f ms %n", n, (ende1 - start1) / 1e6);

            System.out.println("- done -");
        }
    }
}
