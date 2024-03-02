package uml.desafios;

import java.util.Scanner;

public class Operators {

	static Scanner sc = new Scanner(System.in);

	//Uncomment os blocos de codigo para teste ☺ 
	
	public static void main(String[] args) {
//		System.out.println("Logical Ops\nDigite um numero:");
//		int x = sc.nextInt();
//		System.out.println("Digite outro numero:");
//		int y = sc.nextInt();
//		logicalOps(x, y);
		
//		System.out.println("Simple Maths\nDigite um numero:");
//		int x = sc.nextInt();
//		System.out.println("Digite outro numero:");
//		int y = sc.nextInt();
//		simpleMaths(x, y);
		
//		System.out.println("Modulus\nDigite um numero:");
//		int x = sc.nextInt();
//		System.out.println("Digite outro numero:");
//		int y = sc.nextInt();
//		System.out.println(modulus(x, y));
		
		incrDecr();
	}

	public static void logicalOps(int a, int b) {
		if (a > 0 && b > 0) {
			System.out.println("Os dois números são positivos");
		} else if (a < 0 && b < 0) {
			System.out.println("Os dois números são negativos");
		} else if (a == 0 || b == 0) {
			System.out.println("Um dos números é zero // 0");
		} else if (a < 0 | b < 0) {
			System.out.println("Um dos números é negativo");
		}
	}

	public static void simpleMaths(int a, int b) {
		int soma = a+b;
		System.out.println("A soma de "+a+" + "+b+" é: "+soma);
		int subtracao = a-b;
		System.out.println("A diferença de "+a+" - "+b+" é: "+subtracao);
		int divisao = a/b;
		System.out.println("A quociente de "+a+" / "+b+" é: "+divisao);
		int multiplicacao = a*b;
		System.out.println("O produto de "+a+" x "+b+" é: "+multiplicacao);
		
	}
	public static boolean modulus(int a, int b) {
		if(a % b == 0) {
			System.out.println(a+" é multiplo de "+b);
			return true;
		}
		System.out.println(a+" não é multiplo de "+b);
		return false;
	}

	public static void incrDecr() {
		int x=0, w=0, y=0, z=0;
		System.out.println(++x); // vai imprimir 1 pois é pré incrementado
		System.out.println(x++);// vai imprimir 1 pois é pós incrementado mas a variavél x agora tem o valor de 2
		System.out.println(x);// imprime 2
		System.out.println(--x);//imprime 1 pois é pré decrementado
		System.out.println(x--);//vai imprimir 1 pois é pós decrementado mas a variavél x agora tem o valor de 0
		System.out.println(x);//imprime 0
		w=20;
		x=10;
		y=-5;
		z=0;
		System.out.println( w == x && y != z ); //imprime false pois o operador AND && só retorna True quando os dois lados da expressão são true
		System.out.println( w == x || y != z ); //imprime true pois o operador OR || só retorna  false quando os dois lados da expressão sao false
		System.out.println( ! ( w == (x + z) ) );// imprime true pois a expressão ( w == (x + z) ) retorna false e o operador ! inverte o valor de false para true
	}

	
}
