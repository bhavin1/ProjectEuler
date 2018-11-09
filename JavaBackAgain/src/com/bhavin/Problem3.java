/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhavin;

/**
 *The prime factors of 13195 are 5, 7, 13 and 29.
  What is the largest prime factor of the number 600851475143 ?
* @author bhavin
 */
public class Problem3 {
    
    public static int testNumber = 13195;
    public int[] ray;
    
    public Problem3(int n){
        ray = new int[n+1];
        for(int i = 1; i <= n; i++){
            if((n % 1 == 0) && (n % i == 0)){
                ray[i] = i;
            }
            System.out.println(ray[i]);
        }
//        for(int j = 0; j < ray.length; j++){
//            System.out.println("Prime factors of " + n + " is: "+ ray[j]);
//        }
    }
    
    public static void main(String[] args) {
        Problem3 primefactors = new Problem3(testNumber);
    }
}
