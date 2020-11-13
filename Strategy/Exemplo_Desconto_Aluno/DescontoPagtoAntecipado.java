public class DescontoPagtoAntecipado implements Desconto{
    public double aplicarDesconto(double mensalidade){
        return mensalidade * 0.9;
    }
}