import java.util.Scanner;
public class intervaloEsoma{
public static Scanner leia=new Scanner(System.in);
public static void main(String args[]){
    int num1, num2;
    int caso=0;
    System.out.println("Digite o número mais baixo: ");
    num1=leia.nextInt();
    System.out.println("Digite o número mais alto: ");
    num2=leia.nextInt();
    num1+=1;
    for(;num1 < num2; num1++){
        System.out.println("O intervalo é: "+ num1);
        caso+=num1;
    }
    System.out.println("A soma dos números é: " +caso);
}}