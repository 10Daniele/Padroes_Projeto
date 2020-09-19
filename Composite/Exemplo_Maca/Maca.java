public class Maca extends Component {
    private float qtde;
     
    public Maca(String name, float qtde) {
        super(name);
        this.qtde = qtde;
    }
 
    public float getMaca() {
        return qtde;
    }
}