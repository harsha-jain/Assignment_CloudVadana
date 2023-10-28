package org.example.JavaAssignment_3;

import java.util.Scanner;

public class Solution {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str=sc.nextLine();
        PanagramSentence panagramSentence=new PanagramSentence();
        boolean result=panagramSentence.Panagram(str);
        if(result==true){
            System.out.println("The given sentence is panagram sentence");
        }
        else {
            System.out.println("The given sentence is not panagram sentence");
        }
    }
}
