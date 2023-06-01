import java.util.Scanner;
public class tresValores {
public static Scanner leia=new Scanner(System.in);
public static void main(String args[]){
int meio, menor, maior ,temp;
    System.out.println("Digite o primeiro número: ");
    menor=leia.nextInt();
    System.out.println("Digite o segundo número: ");
    meio=leia.nextInt();
    System.out.println("Digite o terceiro número: ");
    maior=leia.nextInt();
if(meio < menor){
    temp=menor;
    menor=meio;
    meio=temp;
   }
   
   if(maior < menor){
    temp=menor;
    menor=maior;
    maior=temp;
   }
   
   if(maior < meio){
    temp=meio;
    meio=maior;
    maior=temp;
   }
   
   System.out.println(menor + "-"+ meio +"-"+ maior) ;
}}