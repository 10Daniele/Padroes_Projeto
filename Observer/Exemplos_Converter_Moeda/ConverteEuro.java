import java.text.DecimalFormat;
public class ConverteEuro extends Observer{
    public ConverteEuro(Subject subject){
        this.subject = subject;
        this.subject.juntar(this);
    }

    @Override
    public void update(){      
        DecimalFormat F = new DecimalFormat("0.00");
        System.out.println("Valor em euro: " + F.format(subject.getEstado()/6.65)); 
    }
}