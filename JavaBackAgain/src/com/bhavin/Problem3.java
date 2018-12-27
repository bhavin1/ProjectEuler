/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhavin;

import java.util.ArrayList;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime
 * factor of the number 600851475143 ?
 *
 * @author bhavin
 */
public class Problem3 {

    /**
     *
     */
    public static long testNumber = 600851475143L;
    public ArrayList factorList;

    public Problem3(long n) {
        
        factorList = new ArrayList();
//        int counter = 1;
//        do
//        {
//            if((n % counter == 0) && (counter % counter == 0))
//            {
//                System.out.println(counter);
//                counter++;
//                //factorList.add(i);
//            }
//        }while(counter <= n);
        
        for(int i = 2; i <= n; i++)
        {
            if((n % i == 0)&& (i % i == 0))
            {
                System.out.println(i);
                //factorList.add(i);
            }
        }

        //System.out.println(testList);
        //System.out.println(factorList);
    }

    public static void main(String[] args) {
        new Problem3(testNumber);
    }
}



//public static long testNumber = 13451L;
//    public ArrayList factorList;
//    public ArrayList testList;
//
//    public Problem3(long n) {
//        factorList = new ArrayList();
//        testList = new ArrayList();
//        long counter = testNumber;
//        
//        do {
//
//            if ((testNumber % counter) == 0 && (testNumber % counter) == 0) {
//                factorList.add(counter);
//            }
//            counter--;
//        } while (counter > 0);
//
//        //System.out.println(testList);
//        System.out.println(factorList);
//    }
//
//    public static void main(String[] args) {
//        new Problem3(testNumber);
//    }