package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("hello World");
        //System.out.print("testando a diferenca");
        //System.out.print("entre os dois");
        //formacao de grupos
        Scanner keyboard=new Scanner(System.in);

        int totalCria, tamanhoGR,numeroGR;
        System.out.println("Incira a quantidade criancas: ");

        totalCria=keyboard.nextInt();

        //tamanho de cada grupo e ler o valor
        System.out.println("Qual o numero total de grupos: ");
        tamanhoGR=keyboard.nextInt();

        //calcular o numero de grupos
        numeroGR=totalCria/tamanhoGR;

        //calcular numero de criancas sem grupo

        //apresentar o resultado
        System.out.println("o numero de elementos em cada grupo e: " + numeroGR);
        System.out.println("ficam de fora, "+totalCria%tamanhoGR+" crianca/as");
    }
}
