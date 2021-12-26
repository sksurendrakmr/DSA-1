/**
 * Big O is a way of comparing two sets of code.
 * It's a way to compare codes mathematically. About how efficient they run.
 *
 * Time Complexity (Not measured based on time...🤔🥺)
 * It is measured in the number of operations that it takes to complete something.
 *
 * Space Complexity
 * E.g. Let's say code one runs very fast, but it takes up a lot of memory when it runs and
 * maybe code 2, even though it takes much longer to finish, maybe it takes up less memory.
 *
 * So, if preserving memory space is the most important priority, and we don't mind having
 * some extra time complexity than code 2 is better.
 *
 */

/**
 * When we are dealing with time and space complexity, we have three letters :-
 * 1) Omega (used to find best case)
 * 2) Theta (used to find average case)
 * 3) Big O (used to find worst case)
 */

/**
 * O(1) > O(log n) > O(n) > O(n^2)
 *
 */

public class Complexity {
    public static void main(String[] args) {
        printItems(10);
    }

    //O(n)
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    // n + n => O(2n) => O(n) (Lets say we passed 10 then it will run 20 times( i.e. 2n))
    public static void printItemsTwice(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(n);
        }
        for (int j = 0; j < n; j++) {
            System.out.println(n);
        }
    }

    //n * n => O(n^2)
    //O(n^n) === O(n)
    public static void printNumberMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }

    //Drop Non Dominants
    //O(n^2) + O(n) === O(n^2 + n) === O(n^2)
    public static void print(int n) {
        //O(n^2)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
        //O(n)
        for (int k = 0; k < n; k++) {
            System.out.println(k);
        }
    }

    /**
     *Irrespective of n is 100 or 1 Billions, there only going to be 1 operation i.e. addition
     * Thus, O(1) => As n grows, the number of operation will stay the same (i.e. constant).
     * O(1) => constant
     */
    public static int addItems(int n) {
        return n + n;
    }
}
