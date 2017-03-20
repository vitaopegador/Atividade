
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual o valor do produto");
        float valor = input.nextFloat();
        System.out.println("O produto é importado ou nacional (N ou I)");
        String decisao = input.next();
        if (decisao.toUpperCase().equals("N") && (valor <1000)) {
            System.out.println("O valor a ser pago é de "+(valor*1.10)+"com imposto de 10%");
            System.out.println("o imposto foi de "+((valor*1.10)-valor));
        }else if (decisao.toUpperCase().equals("N") && (valor >=1000)) {
            System.out.println("O valor a ser pago é de "+(valor*1.15)+"com imposto de 15%");
            System.out.println("o imposto foi de "+((valor*1.15)-valor));
        }else if (decisao.toUpperCase().equals("I")) { 
            System.out.println("O valor a ser pago é de "+(valor*1.50)+"com imposto de 50%");
            System.out.println("o imposto foi de "+((valor*1.50)-valor));
        }        
    }
    
}
