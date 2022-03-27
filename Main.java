package com.subham;

public class Main extends math{

    public static void main(String[] args) {
	// write your code here
        String t = "Java";
        for (int i=0; i<10000; i++){
            t = t + "Tpoint";
        }

        long startTime = System.currentTimeMillis();
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
    }
}
