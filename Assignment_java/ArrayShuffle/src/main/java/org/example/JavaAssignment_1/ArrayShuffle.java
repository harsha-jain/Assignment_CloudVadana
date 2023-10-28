package org.example.JavaAssignment_1;

import java.util.Random;

public class ArrayShuffle {
    public int[] shuffleArray(int[] shuffledarray){
        int n=shuffledarray.length;
        Random random=new Random();
        for (int i=n-1;i>0;i--){
            int res=random.nextInt(i+1);

            int temp=shuffledarray[i];
            shuffledarray[i]=shuffledarray[res];
            shuffledarray[res]=temp;
        }
        return shuffledarray;
    }
}
