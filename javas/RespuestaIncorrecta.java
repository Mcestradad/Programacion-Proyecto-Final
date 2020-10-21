
public class RespuestaIncorrecta{




	public static void felicitacion(){


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


	

	public static void main(String[] args) {

			
		incorrecto();
								

	}
}