/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhavin;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * @author bhavin
 */
public class Problem1 {
    
    public int sum = 0;
    
    public Problem1(int n){
        
        for(int i = 1; i < n; i++)
        {
            if((i % 3 == 0) || (i % 5 == 0))
            {
                sum += i;
            }
        }
        System.out.println("The Sum of the multiples of 3 & 5 are: " + sum);
    }
    public static void main(String args[]){
        Problem1 p1 = new Problem1(1000);
    }
}
