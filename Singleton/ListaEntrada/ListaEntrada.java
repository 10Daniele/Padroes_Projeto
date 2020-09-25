import java.io.*; 
import java.util.Scanner;

public final class ListaEntrada{
    private static ListaEntrada instance = null;
   
    static{
        try{
            instance = new ListaEntrada();
        }
        catch(Exception erro){
            erro.printStackTrace();
         }
    }

    private static final String filename = "ListaEntrada.txt";
    private File listaEntrada = null;

    private ListaEntrada() throws IOException {
         listaEntrada = new File(filename);
         if (listaEntrada.createNewFile()) {
             System.out.println("O arquivo  " + listaEntrada.getName() + "foi criado!");             
         } 
         else{
             System.out.println("\nO arquivo já existe!");
             System.out.println("Lista atual: ");
         }
    }

    public static ListaEntrada getInstance(){     
        return instance;
    }

    public String lerLista() throws FileNotFoundException{
        Scanner ler = null;
        try{
            ler = new Scanner(listaEntrada);    
            String conteudo = "";
            while (ler.hasNextLine()){
                String data = ler.nextLine();
                conteudo = conteudo + data;
            }
            return conteudo;
        }
        finally{
            if (ler != null){
                ler.close();
            }       
        }    
    }

    public void incluiLista(String conteudo){
        try{
            FileWriter incluir = new FileWriter(filename);
            incluir.write(conteudo);
            incluir.close();
            System.out.println("\nPessoa listada com sucesso!");
        }
        catch (IOException erro2){
            System.out.println("\nErro ao incluir pessoa na lista!");
            erro2.printStackTrace();
        }
    }
}