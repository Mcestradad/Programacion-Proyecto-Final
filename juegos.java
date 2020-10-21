import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Preguntas{
    

public static void main (String args[])throws IOException{

	    int numPregunta;

		String cadena, pregunta, pais;
		pais=Paises.devolverPais();

		FileReader miArchivo = new FileReader("PreguntasPaises.csv"); //Clase que nos permite realizar lecturas de archivos de texto..
		BufferedReader archivoLeido=new BufferedReader(miArchivo);//Permite leer texto de un InputStream de una forma sencilla. Permite leer caracteres, arrays y líneas.
		
 		pregunta="";
				
		while((cadena = archivoLeido.readLine())!=null && pregunta.equals("")) {
        	 
        	 // System.out.println(cadena);

        	 String[] vector=cadena.split(",");

			System.out.println("el tamaño del vector es: "+vector.length+"\nLa Pos 0: "+vector[0]+ " \nEl vector "+ Arrays.toString(vector));
	}
}
}