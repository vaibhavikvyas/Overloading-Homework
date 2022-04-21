package com.company;

public class Overload {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        String S1 = "Vaibhavi";
        String S2 = "Vyas";

        sum(a,b);
        sum(S1,S2);
        sum (a);

    }
    public static void sum(int n, int m)
    {
        System.out.println(n+m);
    }

    public static void sum(String str1, String str2)
    {
        System.out.println(str1+str2);
    }

    public static void sum(int p)
    {
        System.out.println("You have passed value  "+ p);
    }
}
