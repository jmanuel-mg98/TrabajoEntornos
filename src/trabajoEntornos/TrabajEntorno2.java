package trabajoEntornos;


import java.util.Random;
import java.util.Scanner;

public class TrabajEntorno2 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        while (true) {
	            System.out.println("Elije: 1 - Piedra, 2 - Papel, 3 - Tijera, 0 - Salir");
	            int eleccionUsuario = scanner.nextInt();

	            if (eleccionUsuario == 0) {
	                System.out.println("¡Gracias por jugar! Adiós.");
	                break;
	            }

	            if (eleccionUsuario < 1 || eleccionUsuario > 3) {
	                System.out.println("Opción inválida. Por favor, elige nuevamente.");
	                continue;
	            }

	            int eleccionMaquina = random.nextInt(3) + 1;

	            System.out.println("La máquina elige: " + obtenerTexto(eleccionMaquina));
	            System.out.println("Tú eliges: " + obtenerTexto(eleccionUsuario));

	            determinarGanador(eleccionUsuario, eleccionMaquina);
	        }

	        scanner.close();
	    }

	    private static String obtenerTexto(int eleccion) {
	        switch (eleccion) {
	            case 1:
	                return "Piedra";
	            case 2:
	                return "Papel";
	            case 3:
	                return "Tijera";
	            default:
	                return "Desconocido";
	        }
	    }

	    private static void determinarGanador(int usuario, int maquina) {
	        if (usuario == maquina) {
	            System.out.println("¡Empate!");
	        } else if ((usuario == 1 && maquina == 3) || (usuario == 2 && maquina == 1) || (usuario == 3 && maquina == 2)) {
	            System.out.println("¡Ganaste!");
	        } else {
	            System.out.println("¡Perdiste!");
	        }

	}

}
