public class Arquivo extends Component{
    private float tamanho;
    
    public Arquivo(String nome, float tamanho){
        super(nome);
        this.tamanho=tamanho;
    }
    
    public float getTamanho(){
        return tamanho;
    }
}
