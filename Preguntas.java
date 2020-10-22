import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Preguntas{
    
	public static void main(String args[]) throws IOException{

		    int i;

			String preguntas[][], cadena;
			
			preguntas = new String[5][5]; //Crear matriz para preguntas.


			String pais;
			pais=Paises.devolverPais();

			//System.out.println("El pais a buscar es: " + pais);

			FileReader miArchivo = new FileReader("PreguntasPaises.csv"); //Clase que nos permite realizar lecturas de archivos de texto..
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


			System.out.println();
			System.out.println();

			for(int m=0; m<5; m++ ){

				for(int n=0; n<5; n++){
						//System.out.print(preguntas2[m][n] + " ");
				}
				System.out.println();
			}	

			String rta="";
			int correcta=0;
			int score =0;
			int incorrecta=0;

			System.out.println("Score: " + score + "        Correct: " + correcta + "        Incorrect: " + incorrecta);
			System.out.println("Pregunta: " + preguntas[0][1]);
			for(int m=3; m<5; m++ ){

				for(int n=0; n<5; n++){
						System.out.print(preguntas2[m][n] + " ");
				}
				System.out.println();
			//System.out.print("Opciones: " + preguntas2[][]);
			Scanner reader= new Scanner(System.in);
			rta = reader.nextLine();
			
			}	
			/**if(rta==vector[2]){
				correcta= correcta + 1;
				score = score + 50;
			}
			else{
				correcta= correcta + 1;
				score = score -50;
			}**/


		}
}