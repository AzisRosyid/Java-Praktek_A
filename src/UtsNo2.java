import java.util.Scanner;
	public class UtsNo2 {
	public static void main(String[] args){	
		Scanner scn = new Scanner(System.in);
		System.out.println("================================================================");
		System.out.println(" PROGRAM MENGHITUNG AKAR-AKAR PERSAMAAN KUADRAT (PK) X1 DA X2 ");
		System.out.println("================================================================");
		System.out.println(" PK : ax^2 + bx + c = 0 ");
		System.out.println("--------------------------------");

		//deklarasi nilai a,b,c, dan determinan
		int a,D,b, c;
		double x1, x2;
		System.out.println(" Masukan/input :");
		System.out.printf(" Nilai Konstanta a = ");
		a = scn.nextInt();
		System.out.printf(" Nilai Konstanta b = ");
		b = scn.nextInt();
		System.out.printf(" Nilai Konstanta c = ");
		c = scn.nextInt();

		//mendefiniskan Determinan
		D = (b*b)-(4*a*c);
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println(" PK = "+a+"x^2 "+b+"x "+c+" = 0");
		System.out.println(" Memiliki nilai D = "+D);
		if (D<0){
			x1 = (-b + Math.sqrt(D))/(2*a);
			x2 = (-b - Math.sqrt(D))/(2*a);
			System.out.println("X1 = "+x1);
			System.out.println("X2 = "+x2);
		}else if(D==0){
			x1 = x2 = (-b + Math.sqrt(D))/(2*a);
			System.out.println("X1 = "+x1);
			System.out.println("X2 = "+x2);
		}else{
			System.out.println(" Akar Imaginer ");
		}

		System.out.println("================================================================");
	}
}