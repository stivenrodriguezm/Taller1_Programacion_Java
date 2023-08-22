import java.util.Scanner;

public class AñosBisiestos {

    public static void main(String[] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un año: ");
        year = sc.nextInt();

        if(year%100 == 0 && year%400 == 0){
            System.out.println(year+" es bisiesto");
        } else if(year%100 == 0 && year%400 != 0){
            System.out.println(year+" no es bisiesto");
        } else if(year%4 == 0){
            System.out.println(year+" es bisiesto");
        } else {
            System.out.println(year+" no es bisiesto");
        }
    }
}
