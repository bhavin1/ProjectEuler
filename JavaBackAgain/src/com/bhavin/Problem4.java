/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bhavin;

import java.util.ArrayList;

/**
 *
 *
 *
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author bhavin
 */
public class Problem4 {
    
    public static int digitA = 5;
    public static int digitB = 5;
    public int product = 0;
    public String palindrome = "";
    public ArrayList list;
    
    public Problem4(int inputA, int inputB){
        
        list = new ArrayList();
        String tempPalin = "";
        
        
        for(int i = 1; i <= digitA; i++)
        {
            for(int j = 1; j <= digitB; j++){
                product = i * j;
                //System.out.println(i + " * " + j + " = " + product);
                list.add(product);
            }
        }
        System.out.println(list);
    }
    
    public int listMinipulator()
    {
        
        return 0;
    }
    
    public static void main(String[] args) {
        new Problem4(digitA, digitB);
    }
}
