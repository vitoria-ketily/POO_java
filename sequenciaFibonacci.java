import java.util.Scanner;
public class sequenciaFibonacci{
public static Scanner leia=new Scanner(System.in);
public static void main(String args[]){
    int a, b, aux, repetir;
    a=1;
    b=0;
    
    System.out.println("Digite a quantidade que quer repetir na sequência fibonacci: ");
    repetir=leia.nextInt();
    for(int i=0; i<repetir; i++){
        System.out.println(a);
        aux=a;
        a=a+b;
        b=aux;
        }

}}