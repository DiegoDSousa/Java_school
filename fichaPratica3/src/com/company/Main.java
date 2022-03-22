//exercicio aula 2 de POO-java
package com.company;
import java.util.Scanner;
import java.lang.Math.*;

public class Main {

    public static void main(String[] args) {

	    System.out.println("Digite um numero:");
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        System.out.println("======================================");
        //alinha a
        int counter=0;
        while((counter*counter)<number){
            System.out.println(counter*counter);
            counter++;
        }
        //alinha b
        System.out.println("======================================");
        counter=0;
        while(counter<number) {
            if ((counter % 10) == 0 && counter != 0) {
                System.out.println(counter);
            }
            counter++;
        }
        //alinha c
        System.out.println("======================================");
        counter=0;

        while(counter<number){
            int x=(int) Math.pow(2,counter);
            if(x<number){
                System.out.println(x);
            }
            counter++;
        }
    }
}
