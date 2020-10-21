public class FuncionBandera{


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

		for (int j=0;j<9 ;j++ ) {

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
		}
	}

System.out.print(ConsoleColors.RESET);
	System.out.println();

}

		break;

		case "b":
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
		}
	}
System.out.print(ConsoleColors.RESET);
	System.out.println();

}


		break;
		case "c":
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
		}
	}
	System.out.print(ConsoleColors.RESET);
	System.out.println();


}


		break;
		case "d":

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
		}
	}
	System.out.print(ConsoleColors.RESET);
	System.out.println();

}
		break;


	}












	



	}
}