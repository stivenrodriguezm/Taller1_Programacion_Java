import java.util.Scanner;

public class Division {

    public static void main(String[] args){
        int dividendo, divisor;
        double mod;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el dividendo: ");
        dividendo = sc.nextInt();
        System.out.println("Ingresa el divisor: ");
        divisor = sc.nextInt();

        mod = (double) dividendo%divisor;

        if(mod==0){
            System.out.println("La division es exacta");
            System.out.println("Cociente: "+divisor);
            System.out.println("Residuo: 0");
        } else {
            System.out.println("La division no es exacta");
            System.out.println("Cociente: "+dividendo/divisor);
            System.out.println("Residuo: "+mod);
        }
    }
}
