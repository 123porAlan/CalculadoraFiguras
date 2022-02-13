import java.util.Scanner;
/**
 * Esta clase es la ejecutabler y sirve como menu para la calculadora de figuras
 * @author Alan Bellon
 * @version 1.0.0
 */
public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	
	//Estas variables nos van a a servir para el while para que se repita una accion cuando el usuario 
	// no cometas error 
	int numeraso = 1;
	int numero = -1;
	//Este while sirve para iniciar o apagar la calculadora 
	while(numero == -1){
	    
	    try{
		System.out.println("<<Bienvenido a la calculadora de figuras>>>");
		System.out.println("NOTA: esta calculadora sirve para calcular el area y perimetro de figuras basicas ");
		System.out.println("Opcion 1: Iniciar"); 
		System.out.println("Opcion 2: Salir");
		System.out.print("R: ");
		numero = sc.nextInt();
		if(numero == 1){
			int numerito = 1;
			while(numerito == 1){
		    System.out.println("¿De que figura deseas calcular su perimetro y area?");
		    System.out.println("Opcion 1: Circulo");
		    System.out.println("Opcion 2: Cuadrado");
		    System.out.println("Opcion 3: Rectangulo");
		    System.out.println("Opcion 4: Triangulo equilatero");
		    System.out.print("R: ");
		    numero = sc.nextInt();
		    if(numero == 1){
			Circulo figu1 = new Circulo();
			System.out.println("Ingresa el radio del circulo");
			figu1.setRadio(sc.nextDouble());
			
			System.out.println("Este es el area de tu circulo");
			System.out.println(figu1.calcularArea());
			System.out.println("Este es el perimetro de tu circulo");
			System.out.println(figu1.calcularPerimetro());
			numerito = 2;
			while (numeraso == 1){
			System.out.println("¿Desea Calcular otra figura?" + "\n 1. Si" + " \n 2. No");
			System.out.print("R: ");
			numerito = sc.nextInt();
			if(numerito >2 || numerito <1){
				numeraso = 1;
			  } 	 else{
				  numeraso = 3;
			  }
			}
		        
		    } else if(numero == 2){
			Cuadrado figu2 = new Cuadrado();
			System.out.println("Ingresa el cuanto mide el lado del cuadrado");
			figu2.setLado(sc.nextDouble());
			
			System.out.println("Este es el area de tu cuadrado");
			System.out.println(figu2.calcularArea());
			System.out.println("Este es el perimetro de tu cuadrado");
			System.out.println(figu2.calcularPerimetro());
			numerito = 2;
			while (numeraso == 1){
			System.out.println("¿Desea Calcular otra figura?" + "\n 1. Si" + " \n 2. No");
			System.out.print("R: ");
			numerito = sc.nextInt();
			if(numerito >2 || numerito <1){
				numeraso = 1;
			  } else{
				  numeraso = 3;
			  }
			
			}
		    } else if (numero == 3){
			Rectangulo figu3 = new Rectangulo();
			System.out.println("Ingresa la base del rectangulo");
			figu3.setBase(sc.nextDouble());
			System.out.println("Ingresa la altura del rectangulo");
			figu3.setAltura(sc.nextDouble());
			
			System.out.println("Este es el area de tu rectangulo");
			System.out.println(figu3.calcularArea());
			System.out.println("Este es el perimetro de tu rectangulo");
			System.out.println(figu3.calcularPerimetro());
			numerito = 2;
			while (numeraso == 1){
			System.out.println("¿Desea Calcular otra figura?" + "\n 1. Si" + " \n 2. No");
			System.out.print("R: ");
			numerito = sc.nextInt();
			if(numerito >2 || numerito <1){
				numeraso = 1;
			  } else{
				  numeraso = 3;
			  }
			}
		        
		    } else if(numero == 4){
		        Triangulo figu4 = new Triangulo();
			System.out.println("Ingresa la base del Triangulo equilatero");
			figu4.setBase(sc.nextDouble());
			System.out.println("Ingresa la altura del Triangulo");
			figu4.setAltura(sc.nextDouble());
			
			System.out.println("Este es el area de tu Trinagulo");
			System.out.println(figu4.calcularArea());
			System.out.println("Este es el perimetro de tu Trinagulo");
			System.out.println(figu4.calcularPerimetro());
			numerito = 2;
			
			while (numeraso == 1){
			System.out.println("¿Desea Calcular otra figura?" + "\n 1. Si" + " \n 2. No");
			System.out.print("R: ");
			numerito = sc.nextInt();
		      if(numerito >2 || numerito <1){
				numeraso = 1;
			  } else{
				  numeraso = 3;
			  }
			}
		    } else{
			System.out.println("No hay una opcion con ese numero");
			numerito = 1;
		    }
	
		   
			System.out.println("Saliendo del sistema...");
		        	
			
		}
		
		
		} else if(numero == 2){
		    System.out.println("Saliendo del sistema...");
		} else{
		   System.out.println("Opcion incorrecta");
			numero = -1;
		}
	
			
		} catch(Exception e) {
		    System.out.println("El valor ingresado no es un numero, vuelve a intentarlo");
			numero = -1;
		    sc.next(); //con esto evitamos que se cicle cuando ponemos algo que no sea un -1
		    //limpia el buffer y continua

		}
	
	}
    
    }
}
