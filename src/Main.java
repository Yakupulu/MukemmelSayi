import java.util.Scanner;

/*      Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
       ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse
      “mükemmel sayı değildir.” ifadelerini ekrana yazan program
 */


public class Main {
    public static void main(String[] args) {
        int number;
        int total=0;

        Scanner inp=new Scanner(System.in);
        System.out.print("Sayi giriniz:");
        number=inp.nextInt();

        for (int i=1;i<number;i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total==number){
            System.out.println(number+" bir mukemmel sayidir.");
        }else {
            System.out.println(number+" bir mukemmel sayi degildir.");
        }
    }
}
