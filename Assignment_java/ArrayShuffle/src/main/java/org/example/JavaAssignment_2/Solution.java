package org.example.JavaAssignment_2;

import java.util.Scanner;

public class Solution extends RomanToInteger {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String RoamnStr=sc.next();
        RomanToInteger ri=new RomanToInteger();
        int result= ri.romanInt(RoamnStr);
        System.out.println(result);
    }
}
