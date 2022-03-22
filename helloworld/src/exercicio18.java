import java.util.Scanner;

import java.lang.Math;

public class exercicio18 {
        public static void main(String[] args) {
            Scanner keyboard=new Scanner(System.in);

            int numero;

            System.out.println("Digite um numero: ");
            numero=keyboard.nextInt();
            System.out.print("Digitos individuais: ");
            char[] digitos=(String.valueOf(numero)).toCharArray();
            for(int i =0; i<digitos.length;i++){
                System.out.print(digitos[i]+" ");
            }
        }

}
