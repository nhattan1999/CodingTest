package codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest {

    static Scanner sc = new Scanner(System.in);

    public static void shortestWord() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine() + " ";
        int count = 0;
        int min = 256;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                if (min > count) {
                    min = count;
                }
                count = 0;
            }
        }
        System.out.println(min);
    }

    public static void formatWord() {
        System.out.print("Enter a string: ");
        String s = sc.nextLine().trim();
        String s1 = " ";
        int n = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s1.charAt(n - 1) != s.charAt(i)) {
                s1 += s.charAt(i);
                n++;
            }
        }
        System.out.println(s1.trim());
    }

    public static void findUniqueNumber() {
        System.out.print("Enter size of a list: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        int max = 0;
        System.out.println("Enter a list of integer numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (max < a[i]) {
                max = a[i];
            }
        }
        long[] b = new long[max + 1];
        Arrays.fill(b, 0);
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        for (int i = 0; i <= max; i++) {
            if (b[i] == 1) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void getSpiralMatrix() {
        System.out.print("Enter number of each edge: ");
        int n = sc.nextInt();

        double[][] a = new double[n][n];
        System.out.println("Enter value of elements of a matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextDouble();
            }
        }
        double[] b = new double[n * n];

        int m = n;
        int count = 0;
        int tmp = 0;
        while (count < n * n) {
            for (int i = tmp; i < m; i++) {
                b[count] = a[i][tmp];
                count++;
            }
            for (int i = tmp + 1; i < m; i++) {
                b[count] = a[m - 1][i];
                count++;
            }
            for (int i = m - 2; i >= tmp; i--) {
                b[count] = a[i][m - 1];
                count++;
            }
            for (int i = m - 2; i >= tmp + 1; i--) {
                b[count] = a[tmp][i];
                count++;
            }
            m--;
            tmp++;
        }
        for (int i = 0; i < n * n; i++) {
            System.out.print(b[i] + " ");
        }

    }

    public static void main(String[] args) {
        System.out.println("\tList questions");
        System.out.println("1. Find the shortest word");
        System.out.println("2. Format a string");
        System.out.println("3. Find unique number");
        System.out.println("4. Get spiral matrix");
        System.out.println("\nEnter a number in 1->4: ");
        Scanner scl = new Scanner(System.in);
        int choice = scl.nextInt();
                
        switch (choice) {
            case 1: {
                shortestWord();
                break;
            }
            case 2: {
                formatWord();
                break;
            }
            case 3: {
                findUniqueNumber();
                break;
            }
            case 4: {
                getSpiralMatrix();
                break;
            }
            default:
                System.out.println("You entered a number outside of the range. Please try again!!!");
        }

    }

}
