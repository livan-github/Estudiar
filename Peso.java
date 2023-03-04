import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int peso;
        
        System.out.println("Introduzca su peso(kg): ");
        peso = entrada.nextInt();

        if(peso > 80)
        {
            System.out.println("Usted tiene sobre peso");
        }
        else if(peso < 85 && peso > 35)
        {
            System.out.println("Usted tiene un peso normal");
        }else
        {
            System.out.println("Usted tiene bajo peso");
        }
    }
    
}
