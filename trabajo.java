import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class trabajo {

	public static void limpiar(int lineas){
		for (int i=0; i < lineas; i++){
			System.out.println("");
			}
	}
	public static int aleatorio(int a){
int c= (int)(Math.random()*a);
return c;
}

public static void miniJuego(){
int num1,num2,num3,num4,num5,choto,choto1,resultado1,resultado, count;
for(count=1; count<200;count++){
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


	public static String devolverPais() throws IOException{
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

	}




	public static void preg() throws IOException{

		    int i;

			String preguntas[][], cadena;
			
			preguntas = new String[5][5]; //Crear matriz para preguntas.


			String pais;

			pais=devolverPais();

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
    				
    				System.out.println("Correcto");
    				correcta= correcta + 1;
    				score = score + 50;
    				limpiar(8);

    				//código para imprimir la bandera

    				if (correcta==4) {
			    		//System.out.println("YOU WIN!!");
			    		estaEnJuego=false;
			    		System.out.println("vsgd");
		    		}

    			}
    			else{
    				System.out.println("Incorrecto");
    				incorrecta= incorrecta + 1;
    				score = score -50;

    				limpiar(8);


    				if (incorrecta==2) {
			    		System.out.println("Game Over");
			    		estaEnJuego=false;

		    		}

		    		else if(rta.equals("x")){
			    		System.out.println("Saliste del juego.");
			    		estaEnJuego=false;



		    		}
    			}
		   //}

				i=i+1;



		    System.out.println("Score: " + score + "        Correct: " + correcta + "        Incorrect: " + incorrecta);




		}
    }



public static void main(String args[]) throws IOException{

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
System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"   _____                       .__  __  .__         _____.__                       "+ConsoleColors.GREEN_BRIGHT+"*"); 
System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"_/ ____\\_ __  ____    __  _  _|__|/  |_|  |__    _/ ____\\  | _____     ____  ______"+ConsoleColors.GREEN_BRIGHT+"*");
System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"\\   __\\  |  \\/    \\   \\ \\/ \\/ /  \\   __\\  |  \\   \\   __\\|  | \\__  \\   / ___\\/  ___/"+ConsoleColors.GREEN_BRIGHT+"*");
System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+" |  | |  |  /   |  \\   \\     /|  ||  | |   Y  \\   |  |  |  |__/ __ \\_/ /_/  >___ \\ "+ConsoleColors.GREEN_BRIGHT+"*");
System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+" |__| |____/|___|  /    \\/\\_/ |__||__| |___|  /   |__|  |____(____  /\\___  /____  >"+ConsoleColors.GREEN_BRIGHT+"*");
System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"                 \\/                         \\/                    \\//_____/     \\/"+ConsoleColors.GREEN_BRIGHT+"*"); 
limpiar(15);
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



