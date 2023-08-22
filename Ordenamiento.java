import java.util.Scanner;
public class Ordenamiento {
    public static void main (String[] args){
        int numero1, numero2, numero3, numero4, posicion1=0, posicion2=0, posicion3=0, posicion4=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        numero1 = sc.nextInt();
        System.out.println("Ingresa otro número: ");
        numero2 = sc.nextInt();
        System.out.println("Ingresa otro número: ");
        numero3 = sc.nextInt();
        System.out.println("Ingresa otro número: ");
        numero4 = sc.nextInt();

        if (numero1<numero2 && numero1<numero3 && numero1<numero4){
            posicion1 = numero1;
            if (numero2<numero3 && numero2 < numero4) {
                posicion2 = numero2;
                if (numero3 < numero4){
                    posicion3 = numero3;
                    posicion4 = numero4;
                } else {
                    posicion3 = numero4;
                    posicion4 = numero3;
                }
            } else if (numero3<numero2 && numero3 < numero4){
                posicion2 = numero3;
                if (numero2 < numero4){
                    posicion3 = numero2;
                    posicion4 = numero4;
                } else {
                    posicion3 = numero4;
                    posicion4 = numero2;
                }
            } else if (numero4<numero2 && numero4 < numero3) {
                posicion2 = numero4;
                if (numero2 < numero3) {
                    posicion3 = numero2;
                    posicion4 = numero3;
                } else{
                    posicion3 = numero3;
                    posicion4 = numero2;
                }
            }
        } else if (numero2<numero1 && numero2<numero3 && numero2<numero4){
            posicion1 = numero2;
            if (numero1<numero3 && numero1<numero4) {
                posicion2 = numero1;
                if (numero3 < numero4){
                    posicion3 = numero3;
                    posicion4 = numero4;
                } else {
                    posicion3 = numero4;
                    posicion4 = numero3;
                }
            } else if (numero3<numero1 && numero3<numero4){
                posicion2 = numero3;
                if (numero1 < numero4){
                    posicion3 = numero1;
                    posicion4 = numero4;
                } else {
                    posicion3 = numero4;
                    posicion4 = numero1;
                }
            } else if (numero4<numero1 && numero4 < numero3) {
                posicion2 = numero4;
                if (numero1 < numero3) {
                    posicion3 = numero1;
                    posicion4 = numero3;
                } else{
                    posicion3 = numero3;
                    posicion4 = numero1;
                }
            }
        } else if (numero3<numero1 && numero3<numero2 && numero3<numero4){
            posicion1 = numero3;
            if (numero1<numero2 && numero1<numero4) {
                posicion2 = numero1;
                if (numero2 < numero4){
                    posicion3 = numero2;
                    posicion4 = numero4;
                } else {
                    posicion3 = numero4;
                    posicion4 = numero2;
                }
            } else if (numero2<numero1 && numero2<numero4){
                posicion2 = numero2;
                if (numero1 < numero4){
                    posicion3 = numero1;
                    posicion4 = numero4;
                } else {
                    posicion3 = numero4;
                    posicion4 = numero1;
                }
            } else if (numero4<numero1 && numero4 < numero2) {
                posicion2 = numero4;
                if (numero1 < numero2) {
                    posicion3 = numero1;
                    posicion4 = numero2;
                } else{
                    posicion3 = numero2;
                    posicion4 = numero1;
                }
            }
        } else if (numero4<numero1 && numero4<numero2 && numero4<numero3){
            posicion1 = numero4;
            if (numero1<numero2 && numero1<numero3) {
                posicion2 = numero1;
                if (numero2 < numero3){
                    posicion3 = numero2;
                    posicion4 = numero3;
                } else {
                    posicion3 = numero3;
                    posicion4 = numero2;
                }
            } else if (numero2<numero1 && numero2<numero3){
                posicion2 = numero2;
                if (numero2 < numero3){
                    posicion3 = numero1;
                    posicion4 = numero3;
                } else {
                    posicion3 = numero3;
                    posicion4 = numero1;
                }
            } else if (numero3<numero1 && numero3 < numero2) {
                posicion2 = numero3;
                if (numero1 < numero2) {
                    posicion3 = numero1;
                    posicion4 = numero2;
                } else{
                    posicion3 = numero2;
                    posicion4 = numero1;
                }
            }
        }
        System.out.println(posicion1+", "+posicion2+", "+posicion3+", "+posicion4);
    }
}
