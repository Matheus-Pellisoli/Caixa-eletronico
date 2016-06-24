
public class Caxa {
	static double resto = 0;
	static double nota_100 = 0;
	static double nota_50 = 0;
	static double nota_20 = 0;
	static double nota_10 = 0;
	static double nota_2 = 0;
	
	
	static void notas(double valor){
		resto = valor;
		while (resto >= 100) {
			if (resto >= 100) {
				resto = resto - 100;
				nota_100 ++;
			}
		}
		while (resto >= 50) {
			if (resto >= 50) {
				resto = resto - 50;
				nota_50 ++;
			}
		}
		while (resto >= 20) {
			if (resto >= 20) {
				resto = resto - 20;
				nota_20 ++;
			}
		}
		while (resto >= 10) {
			if (resto >= 10) {
				resto = resto - 10;
				nota_10 ++;
			}
		}
		while (resto >= 2) {
			if (resto >= 2) {
				resto = resto - 2;
				nota_2 ++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		notas(688);
		System.out.println("Notas de 100:"+ nota_100);
		System.out.println("Notas de 50:"+ nota_50);
		System.out.println("Notas de 20:"+ nota_20);
		System.out.println("Notas de 10:"+ nota_10);
		System.out.println("Notas de 2:"+ nota_2);
	
	}
	}


