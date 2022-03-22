import java.util.Scanner;

/* Exercicio3
  a=1 2 3 4 5 6 7 8 9
  b=1 3 5 7 9
  c=10 9 8 7 6 5 4 3 2
  d= 0 1 2 3 4 5 6 7 8 9
  e= 1 2 4 8
  f=2 4 6 8

  Exercicio4
  a=10
  b=10
  c=10
  d=22 *
  e=0  *
  f=11 
  g=9  *

* */
public class exercicio3 {
    public static void main(String[] args) {
        System.out.print("a) ");
        for(int i=1;i<10;i++){System.out.print(i+" ");}
        System.out.println(" ");

        System.out.print("b) ");
        for(int i=1;i<10;i+=2){System.out.print(i+" ");}
        System.out.println(" ");

        System.out.print("c) ");
        for(int i=10;i>1;i--){System.out.print(i+" ");}
        System.out.println(" ");

        System.out.print("d) ");
        for(int i=0;i<10;i++){System.out.print(i+" ");}
        System.out.println(" ");

        System.out.print("e) ");
        for(int i=1;i<10;i=i*2){System.out.print(i+" ");}
        System.out.println(" ");

        System.out.print("f) ");
        for(int i=1;i<10;i++){if(i%2==0){System.out.print(i+" ");}}
        System.out.println(" ");

        System.out.println("=========================");

        System.out.print("a) ");
        int count=0;
        for(int i=1;i<=10;i++){count++;}
        System.out.print(count);
        System.out.println(" ");

        System.out.print("b) ");
        count=0;
        for(int i=0;i<10;i++){count++;}
        System.out.print(count);
        System.out.println(" ");

        System.out.print("c) ");
        count=0;
        for(int i=10;i>0;i--){count++;}
        System.out.print(count);
        System.out.println(" ");

        System.out.print("d) ");
        count=0;
        for(int i=-10;i<=10;i++){count++;}
        System.out.print(count);
        System.out.println(" ");

        System.out.print("e) ");
        count=0;
        for(int i=10;i>=0;i++){count++;}
        System.out.print(count);
        System.out.println(" ");

        System.out.print("f) ");
        count=0;
        for(int i=-10;i<=10;i+=2){count++;}
        System.out.print(count);
        System.out.println(" ");

        System.out.print("g) ");
        count=0;
        for(int i=-10;i<=10;i+=3){count++;}
        System.out.print(count);
        System.out.println(" ");





    }
}
