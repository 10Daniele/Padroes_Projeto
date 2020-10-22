import java.text.DecimalFormat;
public class ConverteLibra extends Observer{
    public ConverteLibra(Subject subject){
        this.subject = subject;
        this.subject.juntar(this);
    }

    @Override
    public void update(){
        DecimalFormat F = new DecimalFormat("0.00");
        System.out.println("Valor em libra: " + F.format(subject.getEstado()/7.37)); 
    }
} 