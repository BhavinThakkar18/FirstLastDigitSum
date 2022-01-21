package com.company;

import java.util.Enumeration;

public class Main {

    public static int sumFirstAndLastDigit(int number)
    {
        int firstDigit=0;
        int lastDigit=0;
        int digit=0;
        if(number<0)
        {
            return -1;
        }
        else if(number>=0 && number<=9)
        {
            return 2*number;
        }
        firstDigit=number%10;
        while(number>=10)
        {
            digit=number%10;
            number=number/10;

        }
        lastDigit=number%10;
        return firstDigit+lastDigit;

    }
    public static boolean hasSharedDigit(int a, int b)
    {
        int[] array1=new int[10];
        int[] array2=new int[10];
        if(a<10 || a>99 || b<10 || b>99)
        {
            return false;
        }
        int d=0;
        while(a>0)
        {
            d=a%10;
            array1[d]=1;
            a/=10;
        }
        d=0;
        while(b>0)
        {
            d=b%10;
            array2[d]=1;
            b/=10;
        }
        for(int i=1;i<10;i++)
        {
            if(array1[i]==1 && array2[i]==1) {
                return true;
            }

        }
        return false;
    }
    public static boolean hasSameLastDigit(int a,int b,int c)
    {
        if(a<10 || b<10 || c<10 || a>1000 || b>1000 || c>1000)
        {
            return false;
        }
        int d1=a%10;
        int d2=b%10;
        int d3=c%10;
        if(d1!=d2 && d2!=d3 && d1!=d3)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
    public static int getEvenDigitSum(int number)
    {
        int sum=0;
       int d=0;
       if(number<0)
       {
           return -1;
       }
       while(number>0)
       {

           d=number%10;
           if(d%2==0)
           {
               sum+=d;
           }
           number/=10;

       }
       return sum;

    }
    public static void main(String[] args) {
//	// write your code here
//        System.out.println(sumFirstAndtLastDigit(252));
//        System.out.println(sumFirsAndtLastDigit(257));
//        System.out.println(sumFirsAndtLastDigit(0));
//        System.out.println(sumFirsAndtLastDigit(5));
//        System.out.println(sumFirsAndtLastDigit(10));
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println(getEvenDigitSum(252));
//        System.out.println(getEvenDigitSum(-252));
//        System.out.println(hasSharedDigit(12,23));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(15,55));
//        System.out.println(hasSharedDigit(12,43));
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
    }
}
