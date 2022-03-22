import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        int firsthour,secondhour,diference;

        System.out.println("Digite o primeiro horario: ");
        firsthour=keyboard.nextInt();

        System.out.println("Digite o segundo horario: ");
        secondhour=keyboard.nextInt();

        diference=Math.abs(firsthour-secondhour);
        int hour=(int) diference/100;
        int minut= diference-hour*100;
        System.out.println("A diferenca e de "+ hour+" horas "+minut+" minutos");

    }

}