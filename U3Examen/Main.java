
package u3examen;

import java.util.Scanner;
import u3examen.ColaDinamica;
import u3examen.ColaVIP;

public class Main {

    
        Scanner leer = new Scanner(System.in);
	int opc;
	
	public void Main() {
		
		boolean rep = true;
		String [] cliente = {"V.I.P.","Cliente común"};
		
		int turno = 1;
		int numero = 0;
		int opc;
		//Instancias
		ColaVIP cv = new ColaVIP();
		ColaDinamica cd = new ColaDinamica();
	
		while(rep) {
		System.out.println("\n");
		System.out.println("Colas Dinámicas ");
		System.out.println(" 1.- Nuevo Cliente ");
		System.out.println(" 2.- Pasar a Ventanilla ");
		System.out.println(" 3.- Mostrar Colas ");
		System.out.println(" 4.- Salir ");
		opc = leer.nextInt();
		
		switch (opc) {
		case 1:
			
				numero = (int)(Math.random() * 2);
				if(numero == 0) {
					cv.Empujar(cliente[0], turno++);
					
					
				}else {
					cd.Empujar(cliente[1],turno++);
					
								
			}
				cv.MostrarCola();
				cd.MostrarCola();
			
		break;
		case 2:
			String []Ventanilla = new String [3];
			
			for(int i = 0; i < 3; i++ ) {
				if(!cv.EstaVacia()) {
				//Ventanilla[i] = cv.SacarUnElemento();
				cv.SacarCola();
				
				}else {
					//Ventanilla[i] = cd.SacarUnElemento();
					cd.SacarCola();
				}
				
			}		
		break;
		case 3:
			cd.MostrarCola();
			System.out.println();
			cv.MostrarCola();
		break;
		case 4:
			rep = false;
			System.out.println("Gracias por utilizar el programa!");
		break;
		

		default:
			System.out.println("Opcion Invalida :/ ");
			break;
		}
	}
    }
    
}
