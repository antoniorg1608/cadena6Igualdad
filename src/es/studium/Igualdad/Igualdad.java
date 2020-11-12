package es.studium.Igualdad;

import java.util.Scanner;

public class Igualdad
{

	public static void main(String[] args)
	{
		String cadena1, cadena2;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca una cadena:");
		cadena1 = teclado.nextLine();
		System.out.println("Introduzca otra cadena:");
		cadena2 = teclado.nextLine();
		teclado.close();
		if (cadena1.equals(cadena2))
		{
			System.out.println("Son iguales");
		} 
		else
		{
			System.out.println("Son distintas");
		}
	}

}
