import java.util.List;
public class CalculadoraMensalidade{
    public double calcularMensalidade(double mensalidade, List<Desconto> descontos){
        double valorFinal = mensalidade;
        for (Desconto desconto : descontos){
            valorFinal = desconto.aplicarDesconto(valorFinal);      
        }
        return valorFinal;

    }
} 