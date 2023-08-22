
import java.util.Scanner;
public class SetDeTenis {
    public static void main(String[] args) {
        int jugador_a, jugador_b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa los juegos ganados por el jugador A: ");
        jugador_a = sc.nextInt();
        System.out.println("Ingresa los juegos ganados por el jugador B: ");
        jugador_b = sc.nextInt();
        if (jugador_a >= 7 && (jugador_b + 2) < jugador_a) {
            System.out.println("Juego inválido");
        } else if (jugador_b >= 7 && (jugador_a + 2) < jugador_b) {
            System.out.println("Juego inválido");
        } else if (jugador_a>=6 && jugador_b+2 <= jugador_a) {
            System.out.println("Jugador A ha ganado");
        } else if (jugador_b>=6 && (jugador_a+2) <= jugador_b) {
            System.out.println("Jugador B ha ganado");
        } else if (jugador_a<6 && jugador_b<6) {
            System.out.println("El juego aún no termina");
        } else if (jugador_a>=5 && jugador_b>=6 && (jugador_b+2>jugador_a || jugador_b<jugador_a+2)) {
            System.out.println("El juego aún no termina");
        }
    }
}