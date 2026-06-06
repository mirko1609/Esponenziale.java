import java.util.Scanner;

public class esponenziale{
	public static void main(String[] args){
		
		int base = 0;
		int espo = 0;
		int base1 = 0;
		int espo1 = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci la base: ");
		base = input.nextInt();
		base1 += base;
		System.out.print("Inserisci l'esponente: ");
		espo += input.nextInt();
		espo1 += espo;
		
		if(espo < 1){
			System.out.println("Impossibile eseguire per esponenti minori di 1");
		}
		
		while(espo1 > 1){
			base *= base1;
			espo1 -=1;
			
			if(espo1 == 1){
				System.out.println("Risultato: " + base);
				
				
				break;
			}
		}
		input.close();
	}
}
			
		
