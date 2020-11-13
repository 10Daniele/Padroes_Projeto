import java.util.List;
import java.util.ArrayList;

public class CalculaDiaria{  
    private List<Desconto> descontos = new ArrayList<Desconto>();

    public CalculaDiaria(List<Desconto> descontos) {
        this.descontos = descontos;
    }

    public double obterValorDiaria(Hospede hospede, double diaria) {
        double valorFinal = diaria;
        for(Desconto d : descontos) {    
            valorFinal = valorFinal - (d.aplicarDesconto(hospede, valorFinal));
        }
        return valorFinal;
    }  
}