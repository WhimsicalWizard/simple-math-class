package com.subham;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.EventListener;
import java.util.InputMismatchException;
import java.util.Scanner;

public class operator {
    math m1 = new math();
protected int a, b,c;
    public void work(){

       start();

        }


    private void start() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+':
             c=   m1.add(a,b);
                break;
            case '-':
               c= m1.substract(a,b);
                break;
            case '*':
               c= m1.multiply(a,b);
                break;
            case '/':
              c=  m1.divide(a,b);
                break;

            default:
              throw  new InputMismatchException("please enter operator");

        }
        System.out.println(c);


    }

}
