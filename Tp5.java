package tp_algo_base_java;

import java.util.Random;
import java.util.Scanner;

public class Tp5 {
	public static Scanner sc;

	public static void dix() {
		int i=0;
		while (i<10){
			System.out.println(i);
			i++;
		}
	}

	public static void nPremiersEntiers(int n) {
		int i=0;
		while (i<n) {
			System.out.println(i);
			i++;
		}
	}

	public static void nPremiersCarres(int n) {
		int i=0; 
		while(i<n) {
			System.out.println(i*i);
			i++;
		}
	}

	public static void nPremiersPairs(int n) {
		int i=0;
		while (i<n) {
			if (i%2==0) System.out.println(i*i);
			i++;
		}
	}

	public static void nPremiersImpairs(int n) {
		int i=0;
		while (i<n) {
			if (i%2==1) System.out.println(i*i);
			i++;
		}
	}

	public static void dixFoisCoucou() {
		int i=0;
		while (i<10) {
			System.out.println("Coucou !");
			i++;
		}
	}

	public static void nFoisCoucou(int n) {
		int i=0;
		while (i<n) {
			System.out.println("Coucou !");
			i++;
		}
	}

	public static int sommeNPremiersEntiers(int n) {
		int res=0, i=0;
		while (i<n) {
			res = res + i;
			i++;
		}
		return res;
	}

	public static int sommeNPremiersCarres(int n) {
		int res=0, i=0;
		while (i<n) {
			res = res + i*i;
			i++;
		}
		return res;
	}

	public static int sommeNPremiersPairs(int n) {
		int res=0, i=0;
		while (i<n) {
			if (i%2==0) res = res + i;
			i++;
		}
		return res;
	}

	public static int sommeNPremiersImpairs(int n) {
		int res=0, i=0;
		while (i<n) {
			if (i%2==1) res = res + i;
			i++;
		}
		return res;
	}

	public static int sommeNPremiersPairsCarres(int n) {
		int res=0, i=0;
		while (i<n) {
			if (i%2==0) res = res + i*i;
			i++;
		}
		return res;
	}

	public static int toto(int n) {
		int res=0, i=0;
		while (i<n) {
			if (i%3==0) res = res + i;
			i++;
		}
		return res;
	}

	public static int toto2(int n, int k) {
		int res=0, i=0;
		while (i<n) {
			if (i%k==0) res = res + i;
			i++;
		}
		return res;
	}

	public static int toto3() {
		int res=0, i=1;
		while (i<=100) {
			res +=i;
			i++;
		}
		return res;
	}

	public static int toto4(int a, int b) {
		int res=0, i=a;
		while (i<=b) {
			res +=i;
			i++;
		}
		return res;
	}	

	public static void exercice17() {
		String input = "";
		while(!input.equals("q")) {
			System.out.println("?");
			input = sc.next();
		}
		System.out.println("Fin !");
	}

	public static void exercice18() {
	    Random rand = new Random();
	    int min=1, max=100;
		int nbMystere = rand.nextInt((max - min) + 1) + min;;
		int input = 0;
		while(input != nbMystere) {
			System.out.println("?");
			input = sc.nextInt();
			if (input < nbMystere) System.out.println("Trop petit !");
			if (input > nbMystere) System.out.println("Trop grand !");
		}
		System.out.println("Trouvé !");
	}
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);

		dix();
		nPremiersEntiers(11);
		nPremiersCarres(11);
		nPremiersPairs(11);
		nPremiersImpairs(11);
		dixFoisCoucou();
		nFoisCoucou(11);
		System.out.println(sommeNPremiersEntiers(11));
		System.out.println(sommeNPremiersCarres(11));
		System.out.println(sommeNPremiersPairs(11));
		System.out.println(sommeNPremiersImpairs(11));
		System.out.println(sommeNPremiersPairsCarres(11));
		System.out.println(toto(10));
		System.out.println(toto2(11, 5));
		System.out.println(toto3());
		System.out.println(toto4(1, 100));
		
		exercice17();
		exercice18();
		
		sc.close();
	}

}
