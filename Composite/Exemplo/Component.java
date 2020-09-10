public abstract class Component{
    private String nome;
    
    public Component(String nome){
        this.nome=nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public abstract float getTamanho();
    
    //prof = profundidade
    public void lista(int prof){
        String vazio = "";
        for (int i=0; i<prof;i++){
            vazio += ' ';
        }
        vazio = vazio + '|';
        
        System.out.println(vazio + nome); 
    }
    
    public void adicionar(Component g) throws Exception{
        throw new Exception();
    }
    
    public void remover(Component g) throws Exception{
        throw new Exception();
    }
    
    public Component getFilho(int i) throws Exception{
        throw new Exception();
    }
}
