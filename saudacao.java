import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class saudacao {
    
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = "";
        nome = leia.next();
        String saudacao = "";
        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        LocalDateTime agora = LocalDateTime.now();

        leia.close();

        if(agora.getHour() >=0 && agora.getHour() <12){
            saudacao = "Bom dia";
        }else if(agora.getHour() >=12 && agora.getHour() <18){
            saudacao = "Boa tarde";
        }else if(agora.getHour() >=18 && agora.getHour() <24){
            saudacao = "Boa noite";
        }else{


        }
        System.out.println("Olá " + nome + " " + saudacao + " " );
    }
}

