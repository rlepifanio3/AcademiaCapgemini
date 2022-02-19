package escada;
import java.util.Scanner;

public class Escada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	int qtd;
    Scanner escada = new Scanner(System.in);
    System.out.print("Digite a quantidade de degraus: ");
    qtd = escada.nextInt();
    
    int i, m;
    for (i = 1; i <= qtd; i++) {
        for (m = 1; m <= i; m++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }

}
