public class funcionb{

public static int aleatorio(int a){

int c= (int)(Math.random()*a);

return c;

}

public static int bandera(int a){
String[] bandera= ConsoleFile.read("recursos/info_banderas.csv");
if (a==1) {
	for (int j=0;j<20 ;j++ ) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}

if (a==2) {
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
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==3) {
	for (int j=40;j<60 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==4) {
	for (int j=60;j<80 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
			case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==5) {
	for (int j=80;j<100 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
			case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==6) {
	for (int j=100;j<120 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==7) {
	for (int j=120;j<140 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==8) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==9) {
	for (int j=160;j<180 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
					case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
		
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==10) {
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
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
		}
		
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==11) {
	for (int j=200;j<220 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
					case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==12) {
	for (int j=220;j<240 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==13) {
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
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==14) {
	for (int j=260;j<280 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
			case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==15) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==16) {
	for (int j=300;j<320 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==17) {
	for (int j=320;j<340 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
			case "8":
			System.out.print(ConsoleColors.BLACK_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==18) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==19) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==20) {
	for (int j=380;j<400 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "2":
			System.out.print(ConsoleColors.BLUE_BACKGROUND+" ");
			break;
			case "3":
			System.out.print(ConsoleColors.WHITE_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==21) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==22) {
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
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==23) {
	for (int j=440;j<460 ;j++ ) {
		String[] separador= bandera[j].split(";"); 
	for (int s=0;s<separador.length;s++ ) {
		switch(separador[s]){
		case "1":
			System.out.print(ConsoleColors.RED_BACKGROUND+" ");
			break;
			case "4":
			System.out.print(ConsoleColors.YELLOW_BACKGROUND+" ");
			break;
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==24) {
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
			case "5":
			System.out.print(ConsoleColors.GREEN_BACKGROUND+" ");
			break;
		}
	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
if (a==25) {
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
		}

	System.out.print(ConsoleColors.RESET);
	System.out.println();
	}
}
}
return;
}
	public static void main(String[] args) {

		bandera(aleatorio(26));












	}
}