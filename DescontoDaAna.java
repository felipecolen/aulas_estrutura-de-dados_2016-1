package descontodaana;

import java.util.Scanner;

public class DescontoDaAna {

    public static void main(String[] args) {
    
        int continua = 1;
        while (continua == 1) {            
            
            System.out.println("Qual o valor total da compra?");
            float valordacompra, resultado;
            int desconto;

            Scanner entrada = new Scanner(System.in);
            
            valordacompra = entrada.nextFloat();
            
            System.out.println("Digite a porcentagem de desconto");
            desconto = entrada.nextInt();

            resultado = valordacompra - (valordacompra * desconto / 100);

            System.out.println("Seu desconto foi de: R$" + (valordacompra * desconto / 100) + ".O valor a pagar é: R$" + resultado);
//            System.out.printf("Seu desconto foi de: %d. O valor a pagar é: %f", desconto, resultado);
            
            System.out.println("Você quer continuar? Digite 1 para SIM ou 0 para não.");
            continua = entrada.nextInt();
            
            while(continua != 1 && continua != 0){
                System.out.println("Digite 1 ou 0");
                continua = entrada.nextInt();
            }
        }
    }
}
