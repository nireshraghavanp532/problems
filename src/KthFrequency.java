/*package whatever //do not write package name here */
/*Geek hosted a coding competition, some of the questions were easy and some of them were hard. You are given an array arr of positive integers of size N and an integer K, arr[i] represents the hardness of each problem of geeks' contest. Among those N numbers, your task is to find the numbers which appear more than K times and print them in increasing order. If no number appears more than K times then print -1.

Example:

Input:
3
3 1
5 5 6
6 1
2 2 3 3 4 4
4 2
1 2 2 3

Output:
5
2 3 4
-1

Explanation:
Test case 1: The only problem with hardness 5 appears more than once.
Input:
1. The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
2. The first line of each test case contains two space-separated integers N and K.
3. The second line contains N space-separated positive integers represents array arr.

Output: For each test case, print the maximum number of chocolates you can collect

Constraints:
1. 1 <= T <= 10
2. 1 <= K, N <= 100000
3. 1 <= arr[i] <= 10^9*/
import java.util.*;
import java.lang.*;
import java.io.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class KthFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Number of problems
            int k = scanner.nextInt(); // Threshold

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            findHardProblems(arr, k);
        }
    }

    private static void findHardProblems(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> result = new TreeSet<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > k) {
                result.add(entry.getKey());
            }
        }

        if (result.isEmpty()) {
            System.out.println("-1");
        }
        else {
            for (int num : result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
