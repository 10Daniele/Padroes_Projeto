import java.util.ArrayList;
import java.util.List;
public class Galho extends Component {
    protected List<Component> list = new ArrayList<>(); 
    
    public Galho(String name) {
        super(name);
    }
    
    public void add(Component g) {
        list.add(g);
    }
 
    public void remove(Component g) {
        list.remove(g);
    }
 
    public Component getChild(int i) {
        return (Component) list.get(i);
    }
    
    public float getMaca() {
        float totalMacas = 0;
        for (Component f : list) {
            totalMacas = totalMacas + f.getMaca();
        } 
        return totalMacas;
    }

    public void list(int depth) {
      for (Component f : list) {
            f.list(depth + 1);
        }        
    }
}
