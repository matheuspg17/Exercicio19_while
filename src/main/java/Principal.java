
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String frase;
        int numero, i = 0;
        
        System.out.print("Digite sua frase: ");
        frase = leia.nextLine();
        
        System.out.print("Digite quantas vezes a frase será repetida: ");
        numero = leia.nextInt();
        
        while (i < numero){
            System.out.println(frase);
            i++; 
        }
    }
}
