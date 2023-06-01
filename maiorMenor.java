import java.util.Scanner;
public class maiorMenor{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int valor1, valor2;
        System.out.println("Digite o primeiro valor:");
        valor1=leia.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2=leia.nextInt();
        if(valor1>valor2){
            System.out.println("O primeiro valor que é "+valor1+" é maior doque o segundo que é "+valor2);
        }else{
            System.out.println("O segundo valor que é "+valor2+" é maior doque o primeiro que é "+valor1);

        }

}
}