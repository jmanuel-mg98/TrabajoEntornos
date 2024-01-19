package trabajoEntornos;

import java.util.Scanner;

public class TrabajoEntorno1 {

	public static void main(String[] args) {
		int contador = 1,num,suma=0,cuenta0=0,sumaMenos=0,totalMenos=0;
		double media;
		Scanner sc = new Scanner(System.in);
			while(contador <= 10) {
			System.out.print("Introduzca un número:");
			num = sc.nextInt();
			if(num > 0) {
				suma = suma+num;
			} else if (num < 0) {
			sumaMenos=sumaMenos+num;
			totalMenos++;
			} else {
				cuenta0++;
			}
			contador++;
		}
			if (totalMenos!=0) {
				media=sumaMenos/totalMenos;
			}
			media=0;
			
		System.out.println("la suma de los positivos es: "+suma);
		System.out.println("la media de los negativos es: "+media);
		System.out.println("la cantidad de 0 escrtitos es: "+cuenta0);
	}

}	
