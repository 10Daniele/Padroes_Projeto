import java.util.Scanner;

class Main{
    public static void main(String[] args){
        try{
            Scanner teclado = new Scanner(System.in);
            String proxNome;
            
            ListaEntrada object = ListaEntrada.getInstance();
            
            String conteudo = object.lerLista();
            System.out.println(conteudo);
            
            System.out.println("\nDigite o próximo nome a ser incluso na listagem: ");
            proxNome=teclado.nextLine();
            
            conteudo += proxNome;
            conteudo += "  |  ";

            object.incluiLista(conteudo);

            conteudo = object.lerLista();
            System.out.println(conteudo);
        }
        catch (Exception erro){
            erro.printStackTrace();
        }
    }
}