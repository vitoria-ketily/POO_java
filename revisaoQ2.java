import java.util.Scanner;
public class revisaoQ2{
public static Scanner leia=new Scanner(System.in);
public static void main(String args[]){
    int nota1, nota2, nota3, nota4, media;
    System.out.println("Escreva a primeira nota:");
    nota1=leia.nextInt();
    System.out.println("Escreva a segunda nota:");
    nota2=leia.nextInt();
    System.out.println("Escreva a terceira nota:");
    nota3=leia.nextInt();
    System.out.println("Escreva a quarta nota:");
    nota4=leia.nextInt();
    media=(nota1+nota2+nota3+nota4)/4;
    System.out.println("A média das notas é: " + media);

    
}}