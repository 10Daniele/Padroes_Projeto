import java.util.ArrayList;
import java.util.List;
public class Pasta extends Component{
    protected List<Component> lista = new ArrayList<>();
    
    public Pasta(String nome){
        super(nome);
    }
    
    public void adicionar(Component g){
        lista.add(g);
    }
    
    public void remover(Component g){
        lista.remove(g);
    }
    
    public Component getFilho(int i){
        return (Component) lista.get(i);
    }
    
    public float getTamanho(){
        float tamanhoTotal=0;
        for(Component f : lista){
            tamanhoTotal = tamanhoTotal + f.getTamanho();
        }
        return tamanhoTotal;
    }
    
    public void lista(int prof){
        for(Component f : lista){
            f.lista(prof+1);
        }
    }
}
