import java.text.DecimalFormat;
public class ConverteDolar extends Observer{
    public ConverteDolar(Subject subject){
        this.subject = subject;
        this.subject.juntar(this);
    }

    @Override
    public void update(){
        DecimalFormat F = new DecimalFormat("0.00");
        System.out.println("Valor em dólar: " + F.format(subject.getEstado()/5.61)); 
    }
}