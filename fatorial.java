import java.util.Scanner;
public class fatorial{
public static Scanner leia=new Scanner(System.in);
public static void main(String args[]){
    int num;
System.out.println("Digite o número que você quer saber o fatorial: ");
num=leia.nextInt();
    int mult=1;
	for(int i=num; i>1; i--){		
	    mult=mult*i;
	}
System.out.print(num+ "!= " +mult);

}}