package com.subham;

public class math {
  static int x=2,y=1;
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void substract(int a, int b){
        System.out.println(a-b);
    }
    public void divide(int a, int b){
        System.out.println(a/b);
    }
    public void multiply(int a, int b){
        System.out.println(a*b);
    }  public void compare(int a, int b){
       if(a>b){
           System.out.println(a +" is greater");
       }else
           System.out.println(b + " is greater");
    }
    public void print(){
        System.out.println(x);
    }

}
