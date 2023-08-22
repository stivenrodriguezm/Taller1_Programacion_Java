import java.util.Scanner;

public class Letra_o_numero {

    public static void main(String[] args){
        char caracter;
        int representacion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un caracter: ");
        caracter = sc.next().charAt(0);

        representacion = (int) caracter;

        if(representacion >= 48 && representacion <= 57){
            System.out.println("Es un numero");
        } else if (representacion >= 65 && representacion <= 90){
            System.out.println("Es letra mayuscula");
        } else if (representacion >= 97 && representacion <= 122){
            System.out.println("Es letra minuscula");
        } else {
            System.out.println("No es letra ni número");
        }
    }
}
