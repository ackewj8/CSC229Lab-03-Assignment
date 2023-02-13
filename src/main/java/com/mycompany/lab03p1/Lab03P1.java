/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab03p1;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/CSC229Lab-03-Assignment.git
 */
public class Lab03P1 {
    
    public static int getLargest(int arr[], int sz) {
        
        int iterate1 = 0; // O(1)
        int iterate2 = 0; // O(1)
        int largest = 0; // O(1)
        
        // while loop has a runtime complexity of O(N)
        while (iterate1 < sz - 1) { // O(1) if iterate1 < sz - 1 (Best case runtime)
            // O(N) (worst case runtime)
            iterate2++; // iterate2 is increased by 1 N times
            if (iterate2 == sz) { // Executed once if true: O(1)
                iterate1++; // iterate1 is increased by 1 N times
                iterate2 = iterate1;
                continue;
            }
            int product = arr[iterate1] * arr[iterate2]; 
            if (product > largest) // Executed once if true: O(1)
                largest = product;
        }
        return largest; // O(1)
        /*
        f(N) = O(1) + O(1) + O(1) + O(1) + O(1) + O(N) = O(N)
        Best Case Runtime: 1 + 1 + 1 + 1 + 1 = O(1)
        Worst Case Runtime: 1 + 1 + 1 + O(N)
        The highest power in the array is O(N)
        Runtime complexity is O(N), a linear time function.
        */
    }
    
}
