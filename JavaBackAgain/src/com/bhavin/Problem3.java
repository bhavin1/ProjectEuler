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
    public ArrayList primeList;
    public ArrayList testList;

    public Problem3(long n) {
        primeList = new ArrayList();
        testList = new ArrayList();
        long counter = testNumber;
        
        do {

            if ((testNumber % counter) == 0 && (testNumber % counter) == 0) {
                primeList.add(counter);
            }
            counter--;
        } while (counter > 0);

        //System.out.println(testList);
        System.out.println(primeList);
    }

    public static void main(String[] args) {
        new Problem3(testNumber);
    }
}
