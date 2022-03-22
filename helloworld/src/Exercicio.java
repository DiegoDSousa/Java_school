import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class Exercicio {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        double raio,area;

        System.out.println("Qual o raio do circulo? ");
        raio=keyboard.nextDouble();
        area=2*Math.PI*raio;

        System.out.println("A area do circulo e: "+area);

    }
}
