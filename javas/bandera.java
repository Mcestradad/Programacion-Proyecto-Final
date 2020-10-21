public class bandera{
	public static void main(String[] args) {
		String[] bandera= ConsoleFile.read("recursos/info_banderas.csv");
		String respuesta;
		String a="a";
	    String b="b";
	    String c="c";
	    String d="d";


	System.out.println();
	System.out.println();
	System.out.println("¿quien fue maria teresa de calcuta?");
	System.out.println("a) tu vieja");
	System.out.println("b) mi gfa");
	System.out.println("c) tu gfavieja");
	System.out.println("d) mi gfaviejorra");
	System.out.println("Ingrese la letra segun tu respuesta");
	respuesta=ConsoleInput.getString();
	
	switch(respuesta){

		case "a":

		for (int j=0;j<14 ;j++ ) {

String[] separador= bandera[j].split(";"); 

	for (int s=0;s<separador.length/2 ;s++ ) {

		switch(separador[s]){

			case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "2":
			System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
	}

System.out.print(ConsoleColors.RESET);
	System.out.println();

}

		break;

		case "b":
		System.out.println("lindo");
		break;
		case "c":
		System.out.println("lindo");
		break;
		case "d":
		System.out.println("lindo");
		break;


	}












	



	}
}