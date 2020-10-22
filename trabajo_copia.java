import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class trabajo_copia {

	public static void limpiar(int lineas){ //Función para limpiar la consola.
		for (int i=0; i < lineas; i++){
			System.out.println("");
			}
	}
	public static int aleatorio(int a){ //Función para un entero aleatorio.
int c= (int)(Math.random()*a);
return c;
}

/*public static String devolverPais() throws IOException{ //Función para determinar un país aleatorio.
		int numPais;

		String cadena, pais;

		FileReader miArchivo = new FileReader("Paises.csv"); //Clase que nos permite realizar lecturas de archivos de texto..
		BufferedReader archivoLeido=new BufferedReader(miArchivo);//Permite leer texto de un InputStream de una forma sencilla. Permite leer caracteres, arrays y líneas.
		

		numPais=(int)(Math.random()*26+1); //Número aleatorio para determinar la posición de un país.

		//   System.out.println("Num pais; " + numPais);

		pais="";
				
		while((cadena = archivoLeido.readLine())!=null && pais.equals("")) { //Lectura del archivo
        	 
        	 

        	 String[] vector=cadena.split(","); //Separar la cadena en un vector según las comas.

        	    // System.out.println(cadena);
     
    
        
            

        	 if (numPais==Integer.parseInt(vector[0])){// //Si el número aleatorio equivale a la posicion 0 del vector, la posición 1 será el nombre de ese pais.
        	 		// System.out.println("el tamaño del vector es: "+vector.length+"\nLa Pos 0: "+vector[0]+ " \nEl vector "+ Arrays.toString(vector));
        	 		pais=vector[1];   
        	 		//System.out.println("El pais es:" + pais);    	 		
        	 }

      	}
      	archivoLeido.close();

      

      		return pais;

	}*/

	public static String[] devolverPosicion() throws IOException{
		int numPais;
		 
		

		String cadena, pais, posicion;

		

		FileReader miArchivo = new FileReader("Paises.csv"); //Clase que nos permite realizar lecturas de archivos de texto..
		BufferedReader archivoLeido=new BufferedReader(miArchivo);//Permite leer texto de un InputStream de una forma sencilla. Permite leer caracteres, arrays y líneas.
		
		numPais=(int)(Math.random()*26+1); //Número aleatorio para determinar la posición de un país.
		
		posicion="";
		pais="";
		
		
				
		while((cadena = archivoLeido.readLine())!=null && pais.equals("")) {
        	 
        	 

        	 String[] vector=cadena.split(",");

        	    // System.out.println(cadena);
     
    	 if (numPais==Integer.parseInt(vector[0])){// //Si el número aleatorio equivale a la posicion 0 del vector, la posición 1 será el nombre de ese pais.
        	 		// System.out.println("el tamaño del vector es: "+vector.length+"\nLa Pos 0: "+vector[0]+ " \nEl vector "+ Arrays.toString(vector));
        	 		pais=vector[1]; 
        	 		posicion=vector[0];

        	 		 
        	 		//System.out.println("El pais es:" + pais);    	 		
        	 }

      	}
      	archivoLeido.close();

      		String[] vector_1= {posicion, pais};

      		return vector_1;

	}






	public static void felicitacion(){


		int tipo= (int)((Math.random()*10)+1);

		switch(tipo){

			case 1:

				System.out.println(ConsoleColors.GREEN+"__________.__                .__                  .__          ._.");
				System.out.println(ConsoleColors.GREEN+"\\______   \\__| ____   ____   |  |__   ____   ____ |  |__   ____| |");
				System.out.println(ConsoleColors.GREEN+" |    |  _/  |/ __ \\ /    \\  |  |  \\_/ __ \\_/ ___\\|  |  \\ /  _ \\ |");
				System.out.println(ConsoleColors.GREEN+" |    |   \\  \\  ___/|   |  \\ |   Y  \\  ___/\\  \\___|   Y  (  <_> )|");
				System.out.println(ConsoleColors.GREEN+" |______  /__|\\___  >___|  / |___|  /\\___  >\\___  >___|  /\\____/__");
				System.out.println(ConsoleColors.GREEN+"        \\/        \\/     \\/       \\/     \\/     \\/     \\/       \\/");

			break;

			case 2:

				System.out.println(ConsoleColors.GREEN+"___________                   .__                 __        ._.");
				System.out.println(ConsoleColors.GREEN+"\\_   _____/__  ___ ____  ____ |  |   ____   _____/  |_  ____| |");
				System.out.println(ConsoleColors.GREEN+" |    __)_\\  \\/  // ___\\/ __ \\|  | _/ __ \\ /    \\   __\\/ __ \\ |");
				System.out.println(ConsoleColors.GREEN+" |        \\>    <\\  \\__\\  ___/|  |_\\  ___/|   |  \\  | \\  ___/\\|");
				System.out.println(ConsoleColors.GREEN+"/_______  /__/\\_  \\___  >___  >____/\\___  >___|  /__|  \\___  >_");
				System.out.println(ConsoleColors.GREEN+"        \\/      \\/    \\/    \\/          \\/     \\/          \\/\\/	");;
			break;

			case 3:

				System.out.println(ConsoleColors.GREEN+"__________               _____              __          ");
				System.out.println(ConsoleColors.GREEN+"\\______   \\ ____________/ ____\\____   _____/  |_  ____  ");
				System.out.println(ConsoleColors.GREEN+" |     ___// __ \\_  __ \\   __\\/ __ \\_/ ___\\   __\\/  _ \\ ");
				System.out.println(ConsoleColors.GREEN+" |    |   \\  ___/|  | \\/|  | \\  ___/\\  \\___|  | (  <_> )");
				System.out.println(ConsoleColors.GREEN+" |____|    \\___  >__|   |__|  \\___  >\\___  >__|  \\____/ ");
				System.out.println(ConsoleColors.GREEN+"               \\/                 \\/     \\/            			");

			break;


			case 4:

				System.out.println(ConsoleColors.GREEN+"   _____                 __________.__             ._.");
				System.out.println(ConsoleColors.GREEN+"  /     \\  __ __ ___.__. \\______   \\__| ____   ____| |");
				System.out.println(ConsoleColors.GREEN+" /  \\ /  \\|  |  <   |  |  |    |  _/  |/ __ \\ /    \\ |");
				System.out.println(ConsoleColors.GREEN+"/    Y    \\  |  /\\___  |  |    |   \\  \\  ___/|   |  \\|");
				System.out.println(ConsoleColors.GREEN+"\\____|__  /____/ / ____|  |______  /__|\\___  >___|  /_");
				System.out.println(ConsoleColors.GREEN+"        \\/       \\/              \\/        \\/     \\/\\/			");

			break;

			case 5:

				System.out.println(ConsoleColors.GREEN+"___________                       .__              _____              __             ._.");
				System.out.println(ConsoleColors.GREEN+"\\_   _____/______   ____   ______ |  |   ____     /     \\   ____     |__| ___________| |");
				System.out.println(ConsoleColors.GREEN+" |    __)_\\_  __ \\_/ __ \\ /  ___/ |  |  /  _ \\   /  \\ /  \\_/ __ \\    |  |/  _ \\_  __ \\ |");
				System.out.println(ConsoleColors.GREEN+" |        \\|  | \\/\\  ___/ \\___ \\  |  |_(  <_> ) /    Y    \\  ___/    |  (  <_> )  | \\/\\|");
				System.out.println(ConsoleColors.GREEN+"/_______  /|__|    \\___  >____  > |____/\\____/  \\____|__  /\\___  >\\__|  |\\____/|__|   __");
				System.out.println(ConsoleColors.GREEN+"        \\/             \\/     \\/                        \\/     \\/\\______|             \\/");

			break;

			case 6:
				
				System.out.println(ConsoleColors.GREEN+" _______  .__            ._.");
				System.out.println(ConsoleColors.GREEN+" \\      \\ |__| ____  ____| |");
				System.out.println(ConsoleColors.GREEN+" /   |   \\|  |/ ___\\/ __ \\ |");
				System.out.println(ConsoleColors.GREEN+"/    |    \\  \\  \\__\\  ___/\\|");
				System.out.println(ConsoleColors.GREEN+"\\____|__  /__|\\___  >___  >_");
				System.out.println(ConsoleColors.GREEN+"        \\/        \\/    \\/\\/");		
				
			break;

			case 7:

				System.out.println(ConsoleColors.GREEN+" __      __      __      __._.");
				System.out.println(ConsoleColors.GREEN+"/  \\    /  \\____/  \\    /  \\ |");
				System.out.println(ConsoleColors.GREEN+"\\   \\/\\/   /  _ \\   \\/\\/   / |");
				System.out.println(ConsoleColors.GREEN+" \\        (  <_> )        / \\|");
				System.out.println(ConsoleColors.GREEN+"  \\__/\\  / \\____/ \\__/\\  /  __");
				System.out.println(ConsoleColors.GREEN+"       \\/              \\/   \\/");	
			break;

			case 8:

				System.out.println(ConsoleColors.GREEN+"___________              ___________           ._.");
				System.out.println(ConsoleColors.GREEN+"\\_   _____/__________    \\_   _____/__________ | |");
				System.out.println(ConsoleColors.GREEN+" |    __)_\\____ \\__  \\    |    __)_\\____ \\__  \\| |");
				System.out.println(ConsoleColors.GREEN+" |        \\  |_> > __ \\_  |        \\  |_> > __ \\\\|");
				System.out.println(ConsoleColors.GREEN+"/_______  /   __(____  / /_______  /   __(____  /_");
				System.out.println(ConsoleColors.GREEN+"        \\/|__|       \\/          \\/|__|       \\/\\/");			

			break;

			case 9:

				System.out.println(ConsoleColors.GREEN+"_________                                   __        ._.");
				System.out.println(ConsoleColors.GREEN+"\\_   ___ \\  __________________  ____  _____/  |_  ____| |");
				System.out.println(ConsoleColors.GREEN+"/    \\  \\/ /  _ \\_  __ \\_  __ \\/ __ \\/ ___\\   __\\/  _ \\ |");
				System.out.println(ConsoleColors.GREEN+"\\     \\___(  <_> )  | \\/|  | \\|  ___|  \\___|  | (  <_> )|");
				System.out.println(ConsoleColors.GREEN+" \\______  /\\____/|__|   |__|   \\___  >___  >__|  \\____/__");
				System.out.println(ConsoleColors.GREEN+"        \\/                         \\/    \\/            \\/");	
				
			break;


			default:

			System.out.println(ConsoleColors.GREEN+"___________           ._.");
			System.out.println(ConsoleColors.GREEN+"\\_   _____/ __________| |");
			System.out.println(ConsoleColors.GREEN+" |    __)_ /  ___/  _ \\ |");
			System.out.println(ConsoleColors.GREEN+" |        \\\\___ (  <_> )|");
			System.out.println(ConsoleColors.GREEN+"/_______  /____  >____/__");
			System.out.println(ConsoleColors.GREEN+"        \\/     \\/      \\/");

			break;


		}



	}


	public static void incorrecto(){


		int tipo= (int)((Math.random()*5)+1);

		switch(tipo){

			case 1:

				System.out.println(ConsoleColors.RED+".___                                               __          ");
				System.out.println(ConsoleColors.RED+"|   | ____   ____  __________________  ____  _____/  |_  ____  ");
				System.out.println(ConsoleColors.RED+"|   |/    \\_/ ___\\/  _ \\_  __ \\_  __ \\/ __ \\/ ___\\   __\\/  _ \\ ");
				System.out.println(ConsoleColors.RED+"|   |   |  \\  \\__(  <_> )  | \\/|  | \\|  ___|  \\___|  | (  <_> )");
				System.out.println(ConsoleColors.RED+"|___|___|  /\\___  >____/|__|   |__|   \\___  >___  >__|  \\____/ ");
				System.out.println(ConsoleColors.RED+"         \\/     \\/                        \\/    \\/             ");

			break;

			case 2:


				System.out.println(ConsoleColors.RED+".___        __                 __               .___                                                ");
				System.out.println(ConsoleColors.RED+"|   | _____/  |_  ____   _____/  |______      __| _/____     ____  __ __  _______  ______           ");
				System.out.println(ConsoleColors.RED+"|   |/    \\   __\\/ __ \\ /    \\   __\\__  \\    / __ |/ __ \\   /    \\|  |  \\/ __ \\  \\/ /  _ \\     ");
				System.out.println(ConsoleColors.RED+"|   |   |  \\  | \\  ___/|   |  \\  |  / __ \\_ / /_/ \\  ___/  |   |  \\  |  |  ___/\\   (  <_> )         ");
				System.out.println(ConsoleColors.RED+"|___|___|  /__|  \\___  >___|  /__| (____  / \\____ |\\___  > |___|  /____/ \\___  >\\_/ \\____/ /\\ /\\ /\\ ");
				System.out.println(ConsoleColors.RED+"         \\/          \\/     \\/          \\/       \\/    \\/       \\/           \\/            \\/ \\/ \\/ ");
			break;

			case 3:

				
				System.out.println(ConsoleColors.RED+"________  .__                   ._.");
				System.out.println(ConsoleColors.RED+"\\_____  \\ |  |__     ____   ____| |");
				System.out.println(ConsoleColors.RED+" /   |   \\|  |  \\   /    \\ /  _ \\ |");
				System.out.println(ConsoleColors.RED+"/    |    \\   Y  \\ |   |  (  <_> )|");
				System.out.println(ConsoleColors.RED+"\\_______  /___|  / |___|  /\\____/__");
				System.out.println(ConsoleColors.RED+"        \\/     \\/       \\/       \\/");

			break;


			case 4:

				System.out.println(ConsoleColors.RED+" ____ ___             ._.");
				System.out.println(ConsoleColors.RED+"|    |   \\_____  _____| |");
				System.out.println(ConsoleColors.RED+"|    |   |____ \\/  ___/ |");
				System.out.println(ConsoleColors.RED+"|    |  /|  |_> >___ \\ \\|");
				System.out.println(ConsoleColors.RED+"|______/ |   __/____  >__");
				System.out.println(ConsoleColors.RED+"         |__|       \\/ \\/");

			break;

			


			default:

			System.out.println(ConsoleColors.RED+"________   __                                       ");
			System.out.println(ConsoleColors.RED+"\\_____  \\_/  |_____________    ___  __ ____ ________");
			System.out.println(ConsoleColors.RED+" /   |   \\   __\\_  __ \\__  \\   \\  \\/ // __ \\\\___   /");
			System.out.println(ConsoleColors.RED+"/    |    \\  |  |  | \\// __ \\_  \\   /\\  ___/ /    / ");
			System.out.println(ConsoleColors.RED+"\\_______  /__|  |__|  (____  /   \\_/  \\___  >_____ \\");
			System.out.println(ConsoleColors.RED+"        \\/                 \\/             \\/      \\/");

			break;


		}



	}

	

public static void bandera(int a, int contador){
String[] bandera= ConsoleFile.read("javas/recursos/info_banderas.csv");


if (a==1) {

	switch(contador){
		case 1:
			for (int j=0;j<10 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=0;j<20 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=0;j<10 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=10;j<20 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=0;j<20 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:
			for (int j=0;j<20 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
	}
}

if (a==2) {

	switch(contador){
		case 1 :
			for (int j=20;j<30 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			
		}

		break;

		case 2:
			for (int j=20;j<40 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=20;j<30 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=30;j<40 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=20;j<40 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;


		default:

	for (int j=20;j<40 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}
	}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}


if (a==3) {

	switch(contador){
		case 1:
			for (int j=40;j<50 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=40;j<60 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=40;j<50 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=50;j<60 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=40;j<60 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
		default:

	for (int j=40;j<60 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==4) {
		switch(contador){
		case 1:
			for (int j=60;j<70 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=60;j<80 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=60;j<70 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=70;j<80 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=60;j<80 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
		default:

	for (int j=60;j<80 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
			case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==5) {

	switch(contador){
		case 1:
			for (int j=80;j<90 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=80;j<100 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=80;j<90 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=90;j<100 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=80;j<100 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=80;j<100 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
			case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==6) {


	switch(contador){
		case 1:
			for (int j=100;j<110 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=100;j<120 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=100;j<110 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=110;j<120 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=100;j<120 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:
	for (int j=100;j<120 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==7) {

	switch(contador){
		case 1:
			for (int j=120;j<130 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=120;j<140 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=120;j<130 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		
				}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=130;j<140 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=120;j<140 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:


	for (int j=120;j<140 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}

if (a==8) {

	switch(contador){
		case 1:
			for (int j=140;j<150 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=140;j<160 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=140;j<150 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=150;j<160 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=140;j<160 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:
	for (int j=140;j<160 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==9) {

switch(contador){
		case 1:
			for (int j=160;j<170 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=160;j<180 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=160;j<170 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=170;j<180 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=160;j<180 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=160;j<180 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==10) {

	switch(contador){
		case 1:
			for (int j=180;j<190 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=180;j<200 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=180;j<190 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=190;j<200 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=180;j<200 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=180;j<200 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
		
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==11) {

	switch(contador){
		case 1:
			for (int j=200;j<210 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=200;j<220 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=200;j<210 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=210;j<220 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=200;j<220 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;


		default:


	for (int j=200;j<220 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
					case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==12) {

	switch(contador){
		case 1:
			for (int j=220;j<230 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=220;j<240 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=220;j<230 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=230;j<240 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=220;j<240 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
		default:



	for (int j=220;j<240 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==13) {

	switch(contador){
		case 1:
			for (int j=240;j<250 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=240;j<260 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=240;j<250 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=250;j<260 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=240;j<260 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
		default:


	for (int j=240;j<260 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==14) {

	switch(contador){
		case 1:
			for (int j=260;j<270 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=260;j<280 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=260;j<270 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=270;j<280 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=260;j<280 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=260;j<280 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
			case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==15) {


	switch(contador){
		case 1:
			for (int j=280;j<290 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=280;j<300 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=300;j<290 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=290;j<300 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=280;j<300 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
		default:

	for (int j=280;j<300 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==16) {

	switch(contador){
		case 1:
			for (int j=300;j<310 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=300;j<320 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=300;j<310 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=310;j<320 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=300;j<320 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:
	for (int j=300;j<320 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==17) {

switch(contador){
		case 1:
			for (int j=320;j<330 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=320;j<340 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=320;j<330 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=330;j<340 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=320;j<340 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:


	for (int j=320;j<340 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==18) {

	switch(contador){
		case 1:
			for (int j=340;j<350 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=340;j<360 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=340;j<350 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=350;j<360 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=340;j<360 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=340;j<360 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}	
break;
}
}
if (a==19) {

	switch(contador){
		case 1:
			for (int j=360;j<370 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=360;j<380 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=360;j<370 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=370;j<380 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=360;j<380 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;	
						}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=360;j<380 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==20) {


	switch(contador){
		case 1:
			for (int j=380;j<390 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=380;j<400 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=380;j<390 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=390;j<400 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=380;j<400 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
		default:

	for (int j=380;j<400 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==21) {

	switch(contador){
		case 1:
			for (int j=400;j<410 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=400;j<420 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=400;j<410 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=410;j<420 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=400;j<420 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=400;j<420 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==22) {

	switch(contador){
		case 1:
			for (int j=420;j<430 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=420;j<440 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=420;j<430 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=430;j<440 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=420;j<440 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
	


		default:


	for (int j=420;j<440 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==23) {

	switch(contador){
		case 1:
			for (int j=440;j<450 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=440;j<460 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=440;j<450 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=450;j<460 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=440;j<460 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

	for (int j=440;j<460 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}break;
}
}
if (a==24) {

	switch(contador){
		case 1:
			for (int j=460;j<470 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=460;j<480 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=460;j<470 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=470;j<480 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=460;j<480 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

	default:


	for (int j=460;j<480 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==25) {


	switch(contador){
		case 1:
			for (int j=480;j<490 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=480;j<500 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length/2 ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=480;j<490 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=490;j<500 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

					for (int s=0;s<separador.length/2 ;s++ ) {

						switch(separador[s]){

							case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;


				}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		case 4:
	
			for (int j=480;j<500 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

					switch(separador[s]){

						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;
default:


for (int j=480;j<500 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
						case "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+"  ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+"  ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+"  ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+"  ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+"  ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+"  ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+"  ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+"  ");
						break;
		}
}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}

}
	

public static void miniJuego(){ //Función para el minijuego
int num1,num2,num3,num4,num5,choto,choto1,resultado1,resultado, count;
for(count=1; count<200;count++){ //Generar números aleatorios en rangos diferentes.
	num1=(int)((Math.random()*10)+1);
	num2=(int)((Math.random()*10)+1);
	num3=(int)((Math.random()*10)+1);
	num4=(int)((Math.random()*3)+1);
	num5=(int)((Math.random()*4)+1);
	if(num4==1){
		choto=num1+num2-num3;
			if(num5==1){
				System.out.println(ConsoleColors.GREEN_BRIGHT+"        	 	                    -----------------------------------------"+ConsoleColors.RESET);
				System.out.println("                     	      	      	   "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"    "+num1+" + "+" __ "+"-"+" __ "+"= "+choto+ConsoleColors.GREEN_BRIGHT+"                 |"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"        	 	                    -----------------------------------------"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el primer numero que falta: "+ConsoleColors.RESET);
				resultado1= ConsoleInput.getInt();
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el segundo  numero que falta: "+ConsoleColors.RESET);
				resultado= ConsoleInput.getInt();
				choto1=num1+resultado1-resultado;
					if(choto1==choto){
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Eres el mejor"+ConsoleColors.RESET);
					}else{
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Sigue intentando"+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Quedaste en el nivel: "+count+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El resultado correcto es: "+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 1 es: "+num1+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 2 es: "+num2+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 3 es: "+num3+ConsoleColors.RESET);

						break;
					}
				}
			if(num5==2){
			    System.out.println(ConsoleColors.GREEN_BRIGHT+"          	 	                  -----------------------------------------"+ConsoleColors.RESET);
				System.out.println("                      	      	          "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"    "+"__"+" + "+num2+" - "+"__"+"= "+choto+ConsoleColors.GREEN_BRIGHT+"                 |"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"         	 	                   -----------------------------------------"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el primer numero que falta: "+ConsoleColors.RESET);
				resultado1= ConsoleInput.getInt();
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el segundo  numero que falta: "+ConsoleColors.RESET);
				resultado= ConsoleInput.getInt();
				choto1=resultado1+num2-resultado;
					if(choto1==choto){
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Eres el mejor"+ConsoleColors.RESET);
					}else{
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Sigue intentando"+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Quedaste en el nivel: "+count+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El resultado correcto es: "+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 1 es: "+num1+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 2 es: "+num2+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 3 es: "+num3+ConsoleColors.RESET);
						break;
					}
				}
			if(num5==3){
				System.out.println(ConsoleColors.GREEN_BRIGHT+"        	   	                  -----------------------------------------"+ConsoleColors.RESET);
				System.out.println("                    	      	   "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"    "+"__"+" + "+"___"+" - "+num3+"= "+choto+ConsoleColors.GREEN_BRIGHT+"                   |"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"        	  	                   -----------------------------------------"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el primer numero que falta: "+ConsoleColors.RESET);
				resultado1= ConsoleInput.getInt();
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el segundo  numero que falta: "+ConsoleColors.RESET);
				resultado= ConsoleInput.getInt();
				choto1=resultado1+resultado-num3;
					if(choto1==choto){
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Eres el mejor"+ConsoleColors.RESET);
					}else{
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Sigue intentando"+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Quedaste en el nivel: "+count+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El resultado correcto es: "+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 1 es: "+num1+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 2 es: "+num2+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 3 es: "+num3+ConsoleColors.RESET);
						break;
					}
				}
	}else{
		choto=num1-num2+num3;
		if(num5==1){
			    System.out.println(ConsoleColors.GREEN_BRIGHT+"          	  	          -----------------------------------------"+ConsoleColors.RESET);
				System.out.println("                     	      	  "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"    "+num1+" - "+" __ "+"+"+" __ "+"= "+choto+ConsoleColors.GREEN_BRIGHT+"                   |"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"     	       	                  -----------------------------------------"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el primer numero que falta: "+ConsoleColors.RESET);
				resultado1= ConsoleInput.getInt();
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el segundo  numero que falta: "+ConsoleColors.RESET);
				resultado= ConsoleInput.getInt();
				choto1=num1-resultado1+resultado;
					if(choto1==choto){
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Eres el mejor"+ConsoleColors.RESET);
					}else{
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Sigue intentando"+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Quedaste en el nivel: "+count+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El resultado correcto es: "+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 1 es: "+num1+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 2 es: "+num2+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 3 es: "+num3+ConsoleColors.RESET);
						break;
					}
				}
			if(num5==2){

				System.out.println(ConsoleColors.GREEN_BRIGHT+"      		      	                 -----------------------------------------"+ConsoleColors.RESET);
				System.out.println("                   	  	      	 "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"    "+"__"+" - "+num2+" + "+"__"+"= "+choto+ConsoleColors.GREEN_BRIGHT+"                     |"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                 	 	         -----------------------------------------"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el primer numero que falta: "+ConsoleColors.RESET);
				resultado1= ConsoleInput.getInt();
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el segundo  numero que falta: "+ConsoleColors.RESET);
				resultado= ConsoleInput.getInt();
				choto1=resultado1-num2+resultado;
					if(choto1==choto){
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Eres el mejor"+ConsoleColors.RESET);
					}else{
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Sigue intentando"+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Quedaste en el nivel: "+count+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El resultado correcto es: "+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 1 es: "+num1+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 2 es: "+num2+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 3 es: "+num3+ConsoleColors.RESET);
						break;
					}
				}
			if(num5==3){

				System.out.println(ConsoleColors.GREEN_BRIGHT+"             	               	         -----------------------------------------"+ConsoleColors.RESET);
				System.out.println("                            	  	  "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"    "+"__"+" - "+"___"+" + "+num3+"= "+choto+ConsoleColors.GREEN_BRIGHT+"                   |"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"           	      	                 -----------------------------------------"+ConsoleColors.RESET);
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el primer numero que falta: "+ConsoleColors.RESET);
				resultado1= ConsoleInput.getInt();
				System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Escribe el segundo  numero que falta: "+ConsoleColors.RESET);
				resultado= ConsoleInput.getInt();
				choto1=resultado1-resultado+num3;
					if(choto1==choto){
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Eres el mejor"+ConsoleColors.RESET);
					}else{
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Sigue intentando"+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"Quedaste en el nivel: "+count+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El resultado correcto es: "+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 1 es: "+num1+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 2 es: "+num2+ConsoleColors.RESET);
						System.out.println(ConsoleColors.GREEN_BRIGHT+"                                  "+"El numero 3 es: "+num3+ConsoleColors.RESET);
						break;
					}
				}
			}
		}
	}


	




	public static void preg() throws IOException{ //Función para mostrar preguntas y respuestas aleatorias según el pais de la función anterior.

		    int i;

			String preguntas[][], cadena;
			
			preguntas = new String[5][5]; //Crear matriz para preguntas.


			String pais;

			String vector_2[] = devolverPosicion();
			pais=vector_2[1];

			//System.out.println("El pais a buscar es: " + pais);

			FileReader miArchivo = new FileReader("PaisesPreguntas.csv"); //Clase que nos permite realizar lecturas de archivos de texto..
			BufferedReader archivoLeido=new BufferedReader(miArchivo);//Permite leer texto de un InputStream de una forma sencilla. Permite leer caracteres, arrays y líneas.
					

			//lleno la matriz de vacios 
			for(int m=0; m<5; m++ ){

				for(int n=0; n<5; n++){
						preguntas[m][n]=" ";
				}
			}

			while((cadena = archivoLeido.readLine())!=null ) {
	        	         	 
	        	 String[] vector=cadena.split(",");

	        	// System.out.println("Cadena: " + cadena);//imprimo la linea del archivo

				if(pais.equals(vector[0])){ //Si el retorno del pais es igual al nombre en el segundo archivo

					boolean esta= false; //Para determinar si un espacio del vector está ocupado.
	        		
	        		i=(int)(Math.random()*5); // Definir posicion aleatoria vacía paras ser llenada.

	        		//System.out.println("i: " + i);//imprimo la i

	        	 	while (!esta) {

	        	 		//System.out.println("contenido matriz " + preguntas[i][0]);

	        	 		if(preguntas[i][0].equals(" ")){

	        	 			//System.out.println("Cadena: " + cadena);//imprimo la liena del archivo

			        	 	preguntas[i][0]=vector[1];//El número se asigna a la matriz i,0
							preguntas[i][1]=vector[2];//La pregunta se asigna a i,1
							preguntas[i][2]=vector[3];//La respuesta correcta se asigna a i,2
							preguntas[i][3]=vector[4];//La segunda opción se asigna a i,3
							preguntas[i][4]=vector[5];//La otra opcion falsa se asigna a i,4

							
							esta=true;
							//System.out.println("encontró una posición vacia" + i);//comentar
	        	 		}
	        	 		
	        	 		i=(int)(Math.random()*5); //Asigna posicion aleatoria nuevamente.

	        	 		//System.out.println("i: " + i);//imprimo la i
	        	 		
	        	 	}
				}
			}

			
			System.out.println();
			System.out.println();
			
			for(int m=0; m<5; m++ ){//Punto de control.

				for(int n=0; n<5; n++){
						//System.out.print(preguntas[m][n] + " ");
				}
				System.out.println();
			}		


			//inicia el juego

			//cambio el orden de las respuestas
			String preguntas2[][];
			preguntas2 = new String[5][5];
			
			

			for(int m=0; m<5; m++ ){

				for(int n=0; n<5; n++){
						preguntas2[m][n]=" ";
				}
			}


			for(int m=0; m<5; m++ ){

				for(int n=0; n<5; n++){
						
						if (n==0 || n==1) {
							preguntas2[m][n]=preguntas[m][n];
						}

						else {
							
									boolean esta= false;	
									
									i=(int)(Math.random()*3)+2;	
										
								//	System.out.println("i : " + i);
									
									while (!esta) {
										
										if(preguntas2[m][i].equals(" ")){
												
												preguntas2[m][i]=preguntas[m][n];
												esta=true;
												//System.out.println("encontr?una posici? vacia" + i);//comentar
										}
										
										i=(int)(Math.random()*3)+2;	
									//	System.out.println("i : " + i);
									}
						}
					
				}
				
			}	


			//System.out.println();
			//System.out.println();

			for(int m=0; m<5; m++ ){//Punto de control

				for(int n=0; n<5; n++){
						//System.out.print(preguntas2[m][n] + " ");
				}
				//System.out.println();
			}	

			String rta="";
			int correcta=0;
			int score =0;
			int incorrecta=0;
			int posicionF= Integer.parseInt(vector_2[0]);
			boolean estaEnJuego=true;
			

			i=0;


			while (estaEnJuego) {


			System.out.println();
			System.out.println("Pregunta: " + preguntas[i][1]);
			System.out.println();

			
		//	for(int m=0; m<5; m++ ){

				for(int n=2; n<5; n++){

						System.out.print(preguntas2[i][n] + " ");
					}
				
				System.out.println();
    			//System.out.print("Opciones: " + preguntas2[][]);
    			Scanner reader= new Scanner(System.in);
    			rta = reader.nextLine();
			    
    			if(rta.equals(preguntas[i][2])){

    				correcta= correcta + 1;
    				if(correcta!=0){

    					bandera(posicionF,correcta);
    					limpiar(2);
    				}
    				felicitacion();
    				
    				score = score + 50;
    				limpiar(5);



    				//código para imprimir la bandera

    				if (correcta==4) {
			    		//System.out.println("YOU WIN!!");
			    		estaEnJuego=false;
System.out.println(ConsoleColors.CYAN_BRIGHT+"     "+"_____.___.________   ____ ___   __      __.___ _______ ._."+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"     "+"\\__  |   |\\_____  \\ |    |   \\ /  \\    /  \\   |\\      \\| |"+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"     "+" /   |   | /   |   \\|    |   / \\   \\/\\/   /   |/   |   \\ |"+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"     "+" \\____   |/    |    \\    |  /   \\        /|   /    |    \\|"+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"     "+" / ______|\\_______  /______/     \\__/\\  / |___\\____|__  /_"+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"     "+" \\/               \\/                  \\/              \\/\\/"+ConsoleColors.RESET);
		    		}

    			}
    			else{
    				incorrecto();
    				incorrecta= incorrecta + 1;
    				score = score -50;

    				limpiar(5);


    				if (rta.equals("x")){
System.out.println(ConsoleColors.PURPLE_BRIGHT+"       "+"  _________      .__  .__          __               .___     .__         __                             "+ConsoleColors.RESET);
System.out.println(ConsoleColors.PURPLE_BRIGHT+"       "+" /   _____/____  |  | |__| _______/  |_  ____     __| _/____ |  |       |__|__ __   ____   ____   ____  "+ConsoleColors.RESET);
System.out.println(ConsoleColors.PURPLE_BRIGHT+"       "+" \\_____  \\\\__  \\ |  | |  |/  ___/\\   __\\/ __ \\   / __ |/ __ \\|  |       |  |  |  \\_/ __ \\ / ___\\ /  _ \\ "+ConsoleColors.RESET);
System.out.println(ConsoleColors.PURPLE_BRIGHT+"       "+" /        \\/ __ \\|  |_|  |\\___ \\  |  | \\  ___/  / /_/ \\  ___/|  |__     |  |  |  /\\  ___// /_/  >  <_> )"+ConsoleColors.RESET);
System.out.println(ConsoleColors.PURPLE_BRIGHT+"       "+"/_______  (____  /____/__/____  > |__|  \\___  > \\____ |\\___  >____/ /\\__|  |____/  \\___  >___  / \\____/ "+ConsoleColors.RESET);
System.out.println(ConsoleColors.PURPLE_BRIGHT+"       "+"        \\/     \\/             \\/            \\/       \\/    \\/       \\______|           \\/_____/         "+ConsoleColors.RESET);
			    		estaEnJuego=false;

		    		}

		    		else if(incorrecta==2) {
System.out.println(ConsoleColors.RED+"      "+"  ________                                                  "+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED+"      "+" /  _____/_____    _____   ____     _______  __ ___________ "+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED+"      "+"/   \\  ___\\__  \\  /     \\_/ __ \\   /  _ \\  \\/ // __ \\_  __ \\"+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED+"      "+"\\    \\_\\  \\/ __ \\|  Y Y  \\  ___/  (  <_> )   /\\  ___/|  | \\/"+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED+"      "+" \\______  (____  /__|_|  /\\___  >  \\____/ \\_/  \\___  >__|   "+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED+"      "+"        \\/     \\/      \\/     \\/                   \\/       "+ConsoleColors.RESET); 
estaEnJuego=false;



		    		}
    			}
		   //}

				i=i+1;



		    System.out.println("Score: " + score + "        Correct: " + correcta + "        Incorrect: " + incorrecta);




		}
    }



public static void main(String args[]) throws IOException{  //Función principal. Sale menú.

 int decision=0;
 int bucle=1;
 int decision2=0;

 int decision3=0;


System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"            ___________						   "+ConsoleColors.RESET+"                        "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"           / |       | |						  "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"        ,' ,'         \\/',_    __                                    "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET); 
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"     ,'__/             |    ',|  \"'-,,,,,,,                          "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"   ,/  _|',            |                |   \\                        "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"   |  |   |',           \\               |    \\                       "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"   |__|   |  ',          ',             |     \\                      "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);         
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"  /       |     ',        ,_\"\"\"\"\"---'-_,'______\\                     "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+" /        |        ',,_-'\"    |        |        ',                   "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);             
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"|_________|         |         /        |        / ',,'\"\"\"\"|          "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);                      
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"|__  |        ,____/         |        _|       /    |___  /          "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);                      
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"'\\___|      ,'_,'|_,-,_______|         |       /      , '/           "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);                     
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"  \\,' _', _/  ,, ,',|        |          \\       |   '\" ,'            "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);                    
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"   \\ / |_ ,  |  \\||||       ,' |      ,'|    _\"\"    |,'              "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);                  
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"    ' ,'  ', |  ||||| __ ,'   _|_ ,'    |    |\"\"---/                 "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);               
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"       ' ,\"\"\"','\"\"\"\"\"\" |     /           \\\"\"\"|    /                  "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);              
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                      |_____|_      __''\"    \\   |                   "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);             
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                     |  |  /  \"\"\"\"\"\"   |      \\ /                    "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);            
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                      \\ / |            |       /                     "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);           
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                       \\--'            |      /                      "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);          
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                       |   \\__        _|__    |                      "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);          
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                       |      |__     |   ',,,|                      "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);          
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                       |         |____|   /   |                      "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);          
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                       /         _|    ,,'_   |                      "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);          
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                      |__________|___,'  ,,' /                       "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);         
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                       \\      ---'    \\,/  ,'                        "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);        
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                        \\     |    ,,,' \\_/                          "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);      
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                         |    |_,''      |/                          "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);      
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                         |    |       []_|                           "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);     
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                          \\___'        /                             "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);   
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                           \\       __,'                              "+ConsoleColors.RESET+"                         "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);  
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                       "+ConsoleColors.PURPLE_BRIGHT+"                            \\_____/  			      "+ConsoleColors.RESET+"                             "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
        
do{
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                               .----------------.  .----------------.  .-----------------. .----------------.                        "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | .--------------. || .--------------. || .--------------. || .--------------. |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | | ____    ____ | || |  _________   | || | ____  _____  | || | _____  _____ | |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | ||_   \\  /   _|| || | |_   ___  |  | || ||_   \\|_   _| | || ||_   _||_   _|| |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | |  |   \\/   |  | || |   | |_  \\_|  | || |  |   \\ | |   | || |  | |    | |  | |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | |  | |\\  /| |  | || |   |  _|  _   | || |  | |\\ \\| |   | || |  | '    ' |  | |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | | _| |_\\/_| |_ | || |  _| |___/ |  | || | _| |_\\   |_  | || |   \\ `--' /   | |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | ||_____||_____|| || | |_________|  | || ||_____|\\____| | || |    `.__.'    | |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | |              | || |              | || |              | || |              | |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                              | '--------------' || '--------------' || '--------------' || '--------------' |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+"                               '----------------'  '----------------'  '----------------'  '----------------'                        "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                                                                                                                                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+" 1. minijuego                                                                 "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+" 2. Ander papichulo                                                           "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+" 3. Juego banderas                                                            "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+" 4. salir del menu                                                            "+ConsoleColors.GREEN_BRIGHT+"|"+ConsoleColors.RESET+"                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"      "+ConsoleColors.PURPLE_BRIGHT+"________                        .___                                       __                                 _________        "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"      "+ConsoleColors.PURPLE_BRIGHT+"\\_____  \\   __ __   ____      __| _/  ____    ______  ____  _____         |__| __ __    ____  _____   _______ \\_____   \\       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"      "+ConsoleColors.PURPLE_BRIGHT+" /  / \\  \\ |  |  \\_/ __ \\    / __ | _/ __ \\  /  ___/_/ __ \\ \\__  \\        |  ||  |  \\  / ___\\ \\__  \\  \\_  __ \\   /   __/       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"      "+ConsoleColors.PURPLE_BRIGHT+"/   \\_/.  \\|  |  /\\  ___/   / /_/ | \\  ___/  \\___ \\ \\  ___/  / __ \\_      |  ||  |  / / /_/  > / __ \\_ |  | \\/  |   |          "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"      "+ConsoleColors.PURPLE_BRIGHT+"\\_____\\ \\_/|____/  \\___  >  \\____ |  \\___  >/____  > \\___  >(____  /  /\\__|  ||____/  \\___  / (____  / |__|     |___|          "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"      "+ConsoleColors.PURPLE_BRIGHT+"       \\__>            \\/        \\/      \\/      \\/      \\/      \\/   \\______|       /_____/       \\/           <___>          "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 decision= ConsoleInput.getInt();
 
 switch(decision){
 
 case 1:
 System.out.println();
 limpiar(56);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88888888888888888888888888888888888888888888888888888888888888888888888                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88.._|      | `-.  | `.  -_-_ _-_  _-  _- -_ -  .'|   |.'|     |  _..88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88   `-.._  |    |`!  |`.  -_ -__ -_ _- _-_-  .'  |.;'   |   _.!-'|  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88      | `-!._  |  `;!  ;. _______________ ,'| .-' |   _!.i'     |  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88..__  |     |`-!._ | `.| |_______________||.\"'|  _!.;'   |     _|..88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88   |``\"..__ |    |`\";.| i|_|MMMMMMMMMMM|_|'| _!-|   |   _|..-|'    88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88   |      |``--..|_ | `;!|l|MMoMMMMoMMM|1|.'j   |_..!-'|     |     88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88   |      |    |   |`-,!_|_|MMMMP'YMMMM|_||.!-;'  |    |     |     88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88___|______|____!.,.!,.!,!|d|MMMo * loMM|p|,!,.!.,.!..__|_____|_____88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88      |     |    |  |  | |_|MMMMb,dMMMM|_|| |   |   |    |      |  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88      |     |    |..!-;'i|r|MPYMoMMMMoM|r| |`-..|   |    |      |  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88      |    _!.-j'  | _!,\"|_|M<>MMMMoMMM|_||!._|  `i-!.._ |      |  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88     _!.-'|    | _.\"|  !;|1|MbdMMoMMMMM|l|`.| `-._|    |``-.._  |  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88..-i'     |  _.''|  !-| !|_|MMMoMMMMoMM|_|.|`-. | ``._ |     |``\"..88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88   |      |.|    |.|  !| |u|MoMMMMoMMMM|n||`. |`!   | `\".    |     88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88   |  _.-'  |  .'  |.' |/|_|MMMMoMMMMoM|_|! |`!  `,.|    |-._|     88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88  _!\"'|     !.'|  .'| .'|[@]MMMMMMMMMMM[@] \\|  `. | `._  |   `-._  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88-'    |   .'   |.|  |/| /                 \\|`.  |`!    |.|      |`-88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88      |_.'|   .' | .' |/                   \\  \\ |  `.  | `._-Lee|  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88     .'   | .'   |/|  /                     \\ |`!   |`.|    `.  |  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            88  _.'     !'|   .' | /                       \\|  `  |  `.    |`.|  88                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                            8888888888888888888888888888888888888888888888888888888888888888(FL)888                     "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 
  System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"			  ----------------------------------------------------------------------------------------	      "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
  System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                    "+ConsoleColors.PURPLE_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.GREEN_BRIGHT+"               .__         .__      __                                                "+ConsoleColors.PURPLE_BRIGHT+"|"+"            "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET); 
 System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                    "+ConsoleColors.PURPLE_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.GREEN_BRIGHT+"       _____  |__|  ____  |__|    |__| __ __   ____     ____    ____                  "+ConsoleColors.PURPLE_BRIGHT+"|"+"            "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                    "+ConsoleColors.PURPLE_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.GREEN_BRIGHT+"      /     \\ |  | /    \\ |  |    |  ||  |  \\_/ __ \\   / ___\\  /  _ \\                 "+ConsoleColors.PURPLE_BRIGHT+"|"+"            "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                    "+ConsoleColors.PURPLE_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.GREEN_BRIGHT+"     |  Y Y  \\|  ||   |  \\|  |    |  ||  |  /\\  ___/  / /_/  >(  <_> )                "+ConsoleColors.PURPLE_BRIGHT+"|"+"            "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                    "+ConsoleColors.PURPLE_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.GREEN_BRIGHT+"     |__|_|  /|__||___|  /|__|/\\__|  ||____/  \\___  > \\___  /  \\____/                 "+ConsoleColors.PURPLE_BRIGHT+"|"+"            "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"                    "+ConsoleColors.PURPLE_BRIGHT+"|"+ConsoleColors.RESET+ConsoleColors.GREEN_BRIGHT+"           \\/          \\/     \\______|            \\/ /_____/                          "+ConsoleColors.PURPLE_BRIGHT+"|"+"            "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+ConsoleColors.PURPLE_BRIGHT+"			  ----------------------------------------------------------------------------------------	      "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
 System.out.println(ConsoleColors.GREEN_BRIGHT+"			          ¿Que te parece si comenzamos?, 0 para \"si\", 1 para \"no\""+ConsoleColors.RESET);
decision3=ConsoleInput.getInt();
switch(decision3){
 case 0:
limpiar(2);
miniJuego();
break;
case 1:
bucle=0;
break;
} 
 break;
 
 case 2: 
 System.out.println();
 System.out.println("Ander eres un severo papucho");
 
 break;	
 case 3: 
 limpiar(56);
System.out.println(ConsoleColors.RED_BRIGHT+"                        _____                       .__  __  .__         _____.__                       "+ConsoleColors.RESET); 
System.out.println(ConsoleColors.RED_BRIGHT+"                     _/ ____\\_ __  ____    __  _  _|__|/  |_|  |__    _/ ____\\  | _____     ____  ______"+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED_BRIGHT+"                     \\   __\\  |  \\/    \\   \\ \\/ \\/ /  \\   __\\  |  \\   \\   __\\|  | \\__  \\   / ___\\/  ___/"+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED_BRIGHT+"                      |  | |  |  /   |  \\   \\     /|  ||  | |   Y  \\   |  |  |  |__/ __ \\_/ /_/  >___ \\ "+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED_BRIGHT+"                      |__| |____/|___|  /    \\/\\_/ |__||__| |___|  /   |__|  |____(____  /\\___  /____  >"+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED_BRIGHT+"                                      \\/                         \\/                    \\//_____/     \\/"+ConsoleColors.RESET); 
System.out.println(ConsoleColors.RED_BRIGHT+"          ---------------------------------------------------------------------------------------------------------------------");
System.out.println("          "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" Descripción:                                                                                                      "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET);
System.out.println("          "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" Este maravilloso y entretenido juego consiste en llevar acabo una serie de preguntas, estas preguntas apareceran  "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" \n          "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" en pantalla junto con unas opciones, debes elegir la respuesta que te parezca correcta, así se irá llenando la    "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" \n          "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" bandera poco a poco e iras acumulando puntos.                                                                     "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" \n          "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET+" psdt: si fallas disminuiran tus puntos y la bandera dejará de llenarse.                                           "+ConsoleColors.RED_BRIGHT+"|"+ConsoleColors.RESET);
System.out.println(ConsoleColors.RED_BRIGHT+"          ---------------------------------------------------------------------------------------------------------------------");
System.out.println("                                      ¿Comenzar?, presiona 0 para \"Si\" o 1 para \"No\" ");
limpiar(12);
 decision2= ConsoleInput.getInt();
switch(decision2){

case 0:
 limpiar(56);
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                            _-o#&&*''''?d:>b\\_              "+ConsoleColors.RESET);     
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                        _o/\"`         dMF9MMMMMHo_          "+ConsoleColors.RESET); 
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                     .o&#'         \"MbHMMMMMMMMMMMHo.       "+ConsoleColors.RESET);  
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                   .o\"\"           vodM*$&&HMMMMMMMMMM?.     "+ConsoleColors.RESET);    
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                  ,'              $M&ood,~'`(&##MMMMMMH\\    "+ConsoleColors.RESET);    
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                 /               ,MMMMMMM#b?#bobMMMMHMMML   "+ConsoleColors.RESET);   
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                &              ?MMMMMMMMMMMMMMMMM7MMM$R*Hk  "+ConsoleColors.RESET);     
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                               ?$.            :MMMMMMMMMMMMMMMMMMM/HMMM|`*L "+ConsoleColors.RESET);    
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              |               |MMMMMMMMMMMMMMMMMMMMbMH'   T,"+ConsoleColors.RESET);       
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              $H#:            `*MMMMMMMMMMMMMMMMMMMMb#}'  `?"+ConsoleColors.RESET);     
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              ]MMH#             \"\"*\"\"\"\"*#MMMMMMMMMMMMM'    -"+ConsoleColors.RESET);     
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              MMMMMb_                   |MMMMMMMMMMMP'     :"+ConsoleColors.RESET); 
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              HMMMMMMMHo                 `MMMMMMMMMT       ."+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              ?MMMMMMMMP                  9MMMMMMMM}       -"+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                              -?MMMMMMM                  |MMMMMMMMM?,d-    '"+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                               :|MMMMMM-                 `MMMMMMMT .M|.   : "+ConsoleColors.RESET);   
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                .9MMM[                    &MMMMM*' `'    .  "+ConsoleColors.RESET);    
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                 :9MMk                    `MMM#\"        -   "+ConsoleColors.RESET);
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                   &M}                     `          .-    "+ConsoleColors.RESET);   
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                    `&.                             .       "+ConsoleColors.RESET);     
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                      `~,                         ./        "+ConsoleColors.RESET);     
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                          . _                  .-           "+ConsoleColors.RESET);      
System.out.println(ConsoleColors.CYAN_BRIGHT+"                                                            '`--._,dd###pp=\"\"'              "+ConsoleColors.RESET);
System.out.println();
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          *****"+"        _____                       .__  __  .__         _____.__                                 "+ConsoleColors.GREEN_BRIGHT+"*****          "+ConsoleColors.RESET); 
System.out.println(ConsoleColors.GREEN_BRIGHT+"          *****"+"     _/ ____\\_ __  ____    __  _  _|__|/  |_|  |__    _/ ____\\  | _____     ____  ______          "+ConsoleColors.GREEN_BRIGHT+"*****          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          *****"+"     \\   __\\  |  \\/    \\   \\ \\/ \\/ /  \\   __\\  |  \\   \\   __\\|  | \\__  \\   / ___\\/  ___/          "+ConsoleColors.GREEN_BRIGHT+"*****          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          *****"+"      |  | |  |  /   |  \\   \\     /|  ||  | |   Y  \\   |  |  |  |__/ __ \\_/ /_/  >___ \\           "+ConsoleColors.GREEN_BRIGHT+"*****          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          *****"+"      |__| |____/|___|  /    \\/\\_/ |__||__| |___|  /   |__|  |____(____  /\\___  /____  >          "+ConsoleColors.GREEN_BRIGHT+"*****          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          *****"+"                      \\/                         \\/                    \\//_____/     \\/           "+ConsoleColors.GREEN_BRIGHT+"*****          "+ConsoleColors.RESET); 
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          "+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"          ************************************************************************************************************          ");
limpiar(5);
preg();






case 1:



}

 
 break;	
 
 case 4:
 bucle=0;
 break;	

 default:
 System.out.println("Opcion no disponible");
 bucle=0;
 break;
 
 }
 System.out.println();
 System.out.println(ConsoleColors.PURPLE_BRIGHT+"¿Otra opcion?, digita 0 para \"Si\" o digita 1 para \"No\" "+ConsoleColors.RESET);

 bucle=ConsoleInput.getInt();
 switch(bucle){
 	case 0:
 	System.out.println("¡¡¡Continuemos!!!!");
 	bucle=1;
 	break;

 	case 1:
 	System.out.println();
 	System.out.println("Esta bien, Gracias por jugar con nosotros");
 	bucle=0;
 	break;

 	default:
 	System.out.println("Opcion no disponible");
 	bucle=0;
 	break;
 }
 limpiar(56);
 }while(bucle==1);
 

 }

 }



