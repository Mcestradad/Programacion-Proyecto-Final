

public class funcionbFinal{





public static int aleatorio(int a){

int c= (int)(Math.random()*a);


return c;

}

public static void bandera(int a){
String[] bandera= ConsoleFile.read("recursos/info_banderas.csv");
int contador;
contador=ConsoleInput.getInt();
if (a==1) {

	switch(contador){
		case 1:
			for (int j=0;j<10 ;j++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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

						ccase "1":
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;					}
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
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
						System.out.print(ConsoleColors.RED_BACKGROUND+" ");
						break;
						case "2":
						System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
						break;
						case "3":
						System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
						break;
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
		}
}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}

if (a==26) {

	switch(contador){
		case 1:
			for (int j=500;j<510 ;j++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=500;j<520 ;j++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=500;j<510 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=510;j<520 ;j++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=500;j<520 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

for (int j=500;j<520 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
		}
}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	
}
break;
}
}
if (a==27) {

	switch(contador){
		case 1:
			for (int j=520;j<530 ;j++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
					}
				}

			System.out.print(ConsoleColors.RESET);
			System.out.println();

			}

		break;

		case 2:
			for (int j=520;j<540 ;j++ ) {

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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
				}
			}
			System.out.print(ConsoleColors.RESET);
			System.out.println();

		}


		break;

		case 3:
			for (int j=520;j<530 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length;s++ ) {


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
						case "4":
						System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
						break;
						case "5":
						System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
						break;
						case "6":
						System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
						break;
						case "7":
						System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
						break;
						case "8":
						System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
						break;
					}
				}
				System.out.print(ConsoleColors.RESET);
				System.out.println();

			}

			for (int j=530;j<540 ;j++ ) {

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
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
			case "6":
			System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
			break;
			case "7":
			System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
						}
					}
					System.out.print(ConsoleColors.RESET);
					System.out.println();


				}


		break;


		case 4:
	
			for (int j=520;j<540 ;j++ ) {

				String[] separador= bandera[j].split(";"); 

				for (int s=0;s<separador.length ;s++ ) {

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
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
			case "6":
			System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
			break;
			case "7":
			System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
					}
				}

				System.out.print(ConsoleColors.RESET);
				System.out.println();
		}
		break;

		default:

for (int j=520;j<540 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
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
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
			case "6":
			System.out.print(ConsoleColors.PURPLE_BACKGROUND+" ");
			break;
			case "7":
			System.out.print(ConsoleColors.CYAN_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
		}
}
break;
}

}
	public static void main(String[] args) {

		int b;
		b= ConsoleInput.getInt();

		bandera(b);












	}
}