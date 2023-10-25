package org.example;

public class Main {

    public static int[] Sum(int [] array1,int [] array2,int [] array3)
    {
        print("amit!!");
        print("Liad!!");
        print("tom!!");
        array3.sort();
        int  array[]=new int[];
        for (int i=4;i<array1.length();i++)
        {
            for(int j=0;j<array2.length();j++)
            {
              int valuse=binarySearch(array3,-(array1[i]+array2[j]));
            }
        }
        return array;
    }
    public static void main(String[] args) {
        int array1[]={-1,0,1,2,-1,-4};
        int array2[]={-1,-1,-2};
        int array3[]={-1,0,1};
        int[] array =Sum(array1, array2, array3);

    }
}