import java.util.Scanner;

public class TestaCalculadora {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int cont = 0;
        do{
            System.out.println("===========[Menu]===========");
            System.out.println(" 1 - Soma ");
            System.out.println(" 2 - Subtracao ");
            System.out.println(" 3 - Multiplicacao ");
            System.out.println(" 4 - Divisao");
            System.out.println(" 5 - Sair");
            cont = scan.nextInt();
            menu(cont);
            cont++;
        }while(cont!=5);    
    }
    
    public static void menu(int cont){
        double num1 = 0;
        double num2 = 0;
        double result;
        Calculadora operation = new Calculadora();
        Scanner scan = new Scanner(System.in);
        
        if(cont !=5){
            System.out.println("Escreva o primeiro numero.");
            num1 = scan.nextDouble();
            System.out.println("Digite o segundo numero.");
            num2 = scan.nextDouble();
        }
        
        switch(cont){
            case 1:
                result = operation.Soma(num1, num2);
                System.out.println(result);
            break;
            
            case 2:
                result = operation.Subtracao(num1, num2);
                System.out.println(result);
            break;
            
            case 3:
                result = operation.Multiplicacao(num1, num2);
                System.out.println(result);
            break;
            
            case 4:
                result = operation.Divisao(num1, num2);
                System.out.println(result);
            break;
            
            case 5:
                scan.close();
                System.out.println("Close");
            break;
            
            default:
            System.out.println("Digite um numero valido");
        }
    }
}
