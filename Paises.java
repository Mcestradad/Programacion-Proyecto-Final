
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

class Paises {
	//public static void main(String args[]) throws IOException{
	public static String devolverPais() throws IOException{
		int numPais;

		String cadena, pais;

		FileReader miArchivo = new FileReader("Paises.csv"); //Clase que nos permite realizar lecturas de archivos de texto..
		BufferedReader archivoLeido=new BufferedReader(miArchivo);//Permite leer texto de un InputStream de una forma sencilla. Permite leer caracteres, arrays y líneas.
		

		numPais=(int)(Math.random()*26+1);

		

		pais="";
				
		while((cadena = archivoLeido.readLine())!=null && pais.equals("")) {
        	 
        	 

        	 String[] vector=cadena.split(",");

        	


        	 if (numPais==Integer.parseInt(vector[0])){

        	 		pais=vector[1];       	 		
        	 }

      	}
      	archivoLeido.close();

      

      		return pais;

	}




}
