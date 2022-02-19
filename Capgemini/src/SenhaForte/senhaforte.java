package SenhaForte;
import java.util.Scanner;

public class senhaforte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String senha, nome;
	Scanner sn = new Scanner(System.in);
	System.out.println("Informe seu nome: ");
	nome = sn.next();
	System.out.println("Digite sua senha: ");
	senha = sn.next();
	int senhaLenght = senha.length();
    if(senhaLenght < 6){
        System.out.println("Por favor, use no minimo 6 digitos.");
    }
    int maiusculas = 0, minusculas = 0, numeros = 0, caracter = 0;
    for (int i = 0; i < senha.length(); i++) { // para todos os caracteres da string
        char c = senha.charAt(i); // pegar o caractere
            if (Character.isUpperCase(c)) {
                maiusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                numeros++;
            } else {
                caracter++;
            }            
     }
    if(maiusculas < 1){
        System.out.println("Por favor, use uma letra maiuscula.");
    }
    if(minusculas < 1){
        System.out.println("Por favor, use uma letra minuscula.");
    }
    if(numeros < 1){
        System.out.println("Por favor, use um numero.");
    }
    if(caracter < 1){
        System.out.println("Por favor, use um caracter.");
    }
    if(senhaLenght >= 6 && maiusculas >= 1 && minusculas >= 1 &&  numeros >= 1  && caracter >= 1){
        System.out.println("\nSenha aceita!");
    }
	}
}