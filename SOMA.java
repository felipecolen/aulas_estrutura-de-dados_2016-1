import java.util.Scanner;

public class SOMA {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int qtd, resultado = 0;
        qtd = input.nextInt();
        
        while (qtd > 0) {            
            resultado += input.nextInt();
            qtd -= 1;
        }
        System.out.println(resultado);
    }
}
