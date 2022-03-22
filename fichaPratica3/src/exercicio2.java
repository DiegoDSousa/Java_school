
import java.util.Scanner;
import java.lang.Math.*;

public class exercicio2 {

    public static void main(String[] args) {
        System.out.println("======================================");
        int counter = 0,somapar=0,quadrados=0,a=2,b=100,somaimpar=0;

        while(counter<=100){
            //alinha a
            if((counter%a)==0 && counter>=a){
                somapar+=counter;
            }
            //alinha b
            quadrados+=(int) Math.pow(counter,a);

            //alinha c
            if((counter%a)!=0 && counter>=a && counter<=b){
                somaimpar+=counter;
            }
            //alinga d

            counter++;
        }
        System.out.println("A soma de todos os numeros pares de "+a+" ate "+b+" e "+somapar);
        System.out.println("A soma de todos os quadrados de "+a+" ate "+b+" e "+quadrados);
        System.out.println("A soma de todos os numeros impares de "+a+" ate "+b+" e "+somaimpar);
        //alinha c
        System.out.println("===============================");
        somaimpar=0;
        System.out.println("Digite um numero: ");
        Scanner in=new Scanner(System.in);
        int number= in.nextInt();
        char [] digitos=(String.valueOf(number)).toCharArray();
        System.out.print("A Soma dos digitos, ");
        for(int i=0;i<digitos.length;i++){
            if(digitos[i]%2!=0){
                somaimpar+=Integer.parseInt(String.valueOf(digitos[i]));
                System.out.print(digitos[i]+" ");
            }
        }
        System.out.println("e "+somaimpar);



    }
}