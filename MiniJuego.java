/* Es un minijuego que te pregunta dos numeros para poder completar un operación simple entre tres números, cuando pierdes suelta la respuesta correcta y el nivel donde te quedaste*/

public class MiniJuego{

	
		
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


	public static void main(String[] args) {

		miniJuego();

	}

}