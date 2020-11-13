public class DescontoBaixaRenda implements Desconto{
    public double aplicarDesconto(double mensalidade){
        return mensalidade * 0.5;
    }
}