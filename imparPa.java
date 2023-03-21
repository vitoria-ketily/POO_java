import java.util.Scanner;
public class imparPa{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
int i ;
System.out.println("Digite um número: ");
i=leia.nextInt();
 metodo(i);
    }

 public static void metodo(int i){

 if(i%2==1){
System.out.println( i+ " falso ");
}else{
System.out.println (i+ "verdadeiro");
}
    }}