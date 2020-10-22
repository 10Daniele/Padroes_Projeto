import java.text.DecimalFormat;
public class ConvertePeso extends Observer{
    public ConvertePeso(Subject subject){
        this.subject = subject;
        this.subject.juntar(this);
    }

    @Override
    public void update(){
        DecimalFormat F = new DecimalFormat("0.00");
        System.out.println("Valor em peso: " + F.format(subject.getEstado()/0.072)); 
    }
}