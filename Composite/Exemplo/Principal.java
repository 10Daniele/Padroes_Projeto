class Principal{
    public static void main(String[] args){
        try{
            Component component = new Pasta("Raiz");
            component.adicionar(new Arquivo("Arquivo100", 100));
            component.adicionar(new Arquivo("Arquivo101", 50));
            
            Component subPasta = new Pasta("subPasta"); 
            component.adicionar(subPasta);
            component.adicionar(new Arquivo("Arquivo500", 100));
            component.adicionar(new Arquivo("Arquivo501", 50));
            component.adicionar(new Arquivo("Arquivo502", 150));
            
            float tamanhoTotal = component.getTamanho();
            System.out.println("Tamanho total: "+ tamanhoTotal);
            component.lista(0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
