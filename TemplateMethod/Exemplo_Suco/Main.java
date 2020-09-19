import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int op;
        
        System.out.println("Escolha o suco que deseja fazer: ");
        System.out.println("1- Limão");
        System.out.println("2- Melancia");
        System.out.println("3- Laranja");
        
        op = input.nextInt();
        
        switch (op){
            case 1:
               System.out.println("\nSuco de Limão!");
               Suco sucoLimao = new Limao();
               sucoLimao.prepararSuco();
               break;
            case 2:
               System.out.println("\nSuco de Melancia!");
               Suco sucoMelancia = new Melancia();
               sucoMelancia.prepararSuco();
               break;
            case 3:
               System.out.println("\nSuco de Laranja!");
               Suco sucoLaranja = new Laranja();
               sucoLaranja.prepararSuco();
               break;
            default:
                System.out.println("Valor inválido!");
        }
    }
}
