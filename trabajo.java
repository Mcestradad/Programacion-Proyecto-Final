

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
				System.out.println(num1+" + "+" __ "+"-"+" __ "+"= "+choto);
				System.out.println("Escribe el primer numero que falta: ");
				resultado1= ConsoleInput.getInt();
				System.out.println("Escribe el segundo  numero que falta: ");
				resultado= ConsoleInput.getInt();
				choto1=num1+resultado1-resultado;
					if(choto1==choto){
						System.out.println("Eres el mejor");
					}else{
						System.out.println("Sigue intentando");
						System.out.println("Quedaste en el nivel: "+count);
						System.out.println("El resultado correcto es: ");
						System.out.println("El numero 1 es: "+num1);
						System.out.println("El numero 2 es: "+num2);
						System.out.println("El numero 3 es: "+num3);
						break;
					}
				}
			if(num5==2){
				System.out.println("__"+" + "+num2+" - "+"__"+"= "+choto);
				System.out.println("Escribe el primer numero que falta: ");
				resultado1= ConsoleInput.getInt();
				System.out.println("Escribe el segundo  numero que falta: ");
				resultado= ConsoleInput.getInt();
				choto1=resultado1+num2-resultado;
					if(choto1==choto){
						System.out.println("Eres el mejor");
					}else{
						System.out.println("Sigue intentando");
						System.out.println("Quedaste en el nivel: "+count);
						System.out.println("El resultado correcto es: ");
						System.out.println("El numero 1 es: "+num1);
						System.out.println("El numero 2 es: "+num2);
						System.out.println("El numero 3 es: "+num3);
						break;
					}
				}
			if(num5==3){
				System.out.println("__"+" + "+"___"+" - "+num3+"= "+choto);
				System.out.println("Escribe el primer numero que falta: ");
				resultado1= ConsoleInput.getInt();
				System.out.println("Escribe el segundo  numero que falta: ");
				resultado= ConsoleInput.getInt();
				choto1=resultado1+resultado-num3;
					if(choto1==choto){
						System.out.println("Eres el mejor");
					}else{
						System.out.println("Sigue intentando");
						System.out.println("Quedaste en el nivel: "+count);
						System.out.println("El resultado correcto es: ");
						System.out.println("El numero 1 es: "+num1);
						System.out.println("El numero 2 es: "+num2);
						System.out.println("El numero 3 es: "+num3);
						break;
					}
				}
	}else{
		choto=num1-num2+num3;
		if(num5==1){
				System.out.println(num1+" - "+" __ "+"+"+" __ "+"= "+choto);
				System.out.println("Escribe el primer numero que falta: ");
				resultado1= ConsoleInput.getInt();
				System.out.println("Escribe el segundo  numero que falta: ");
				resultado= ConsoleInput.getInt();
				choto1=num1-resultado1+resultado;
					if(choto1==choto){
						System.out.println("Eres el mejor");
					}else{
						System.out.println("Sigue intentando");
						System.out.println("Quedaste en el nivel: "+count);
						System.out.println("El resultado correcto es: ");
						System.out.println("El numero 1 es: "+num1);
						System.out.println("El numero 2 es: "+num2);
						System.out.println("El numero 3 es: "+num3);
						break;
					}
				}
			if(num5==2){
				System.out.println("__"+" - "+num2+" + "+"__"+"= "+choto);
				System.out.println("Escribe el primer numero que falta: ");
				resultado1= ConsoleInput.getInt();
				System.out.println("Escribe el segundo  numero que falta: ");
				resultado= ConsoleInput.getInt();
				choto1=resultado1-num2+resultado;
					if(choto1==choto){
						System.out.println("Eres el mejor");
					}else{
						System.out.println("Sigue intentando");
						System.out.println("Quedaste en el nivel: "+count);
						System.out.println("El resultado correcto es: ");
						System.out.println("El numero 1 es: "+num1);
						System.out.println("El numero 2 es: "+num2);
						System.out.println("El numero 3 es: "+num3);
						break;
					}
				}
			if(num5==3){
				System.out.println("__"+" - "+"___"+" + "+num3+"= "+choto);
				System.out.println("Escribe el primer numero que falta: ");
				resultado1= ConsoleInput.getInt();
				System.out.println("Escribe el segundo  numero que falta: ");
				resultado= ConsoleInput.getInt();
				choto1=resultado1-resultado+num3;
					if(choto1==choto){
						System.out.println("Eres el mejor");
					}else{
						System.out.println("Sigue intentando");
						System.out.println("Quedaste en el nivel: "+count);
						System.out.println("El resultado correcto es: ");
						System.out.println("El numero 1 es: "+num1);
						System.out.println("El numero 2 es: "+num2);
						System.out.println("El numero 3 es: "+num3);
						break;
					}
				}
			}
		}
	}
public static void main(String args[]) {

 int decision=0;
 int bucle=1;
 int decision2=0;

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
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              | 1. minijuego                                                                 |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              | 2. Ander papichulo                                                           |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              | 3. Juego banderas                                                            |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
System.out.println(ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET+"                              | 4. salir del menu                                                            |                       "+ConsoleColors.GREEN_BRIGHT+"******"+ConsoleColors.RESET);
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
 System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"          .__         .__      __                                "+ConsoleColors.GREEN_BRIGHT+""); 
 System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"  _____  |__|  ____  |__|    |__| __ __   ____     ____    ____  "+ConsoleColors.GREEN_BRIGHT+"");
 System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+" /     \\ |  | /    \\ |  |    |  ||  |  \\_/ __ \\   / ___\\  /  _ \\ "+ConsoleColors.GREEN_BRIGHT+"");
 System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"|  Y Y  \\|  ||   |  \\|  |    |  ||  |  /\\  ___/  / /_/  >(  <_> )"+ConsoleColors.GREEN_BRIGHT+"");
 System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"|__|_|  /|__||___|  /|__|/\\__|  ||____/  \\___  > \\___  /  \\____/ "+ConsoleColors.GREEN_BRIGHT+"");
 System.out.println(ConsoleColors.GREEN_BRIGHT+"*"+"      \\/          \\/     \\______|            \\/ /_____/          "+ConsoleColors.GREEN_BRIGHT+"");
 limpiar(8)
 miniJuego();
 
 break;
 
 case 2: 
 System.out.println();
 System.out.println("Ander eres un severo papucho");
 
 break;	
 case 3: 
 limpiar(56);
System.out.println("   _____                       .__  __  .__         _____.__                       "); 
System.out.println("_/ ____\\_ __  ____    __  _  _|__|/  |_|  |__    _/ ____\\  | _____     ____  ______");
System.out.println("\\   __\\  |  \\/    \\   \\ \\/ \\/ /  \\   __\\  |  \\   \\   __\\|  | \\__  \\   / ___\\/  ___/");
System.out.println(" |  | |  |  /   |  \\   \\     /|  ||  | |   Y  \\   |  |  |  |__/ __ \\_/ /_/  >___ \\ ");
System.out.println(" |__| |____/|___|  /    \\/\\_/ |__||__| |___|  /   |__|  |____(____  /\\___  /____  >");
System.out.println("                 \\/                         \\/                    \\//_____/     \\/"); 
System.out.println("Este maravilloso y entretenido juego consiste en llevar acabo una serie de preguntas \n estas preguntas apareceran en pantalla junto con unas opciones, debes elegir la respuesta que te parezca correcta \n así se irá llenando la bandera poco a poco e iras acumulando puntos \n si fallas disminuiran tus puntos y la bandera irá desapareciendo. ");

System.out.println("¿Comenzar?, presiona 0 para \"Si\" o 1 para \"No\" ");
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
 System.out.println("¿Otra opcion?, digita 0 para \"Si\" o digita 1 para \"No\" ");
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



