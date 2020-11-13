public class DescontoTransferencia implements Desconto{
    public double aplicarDesconto(double mensalidade){
        return mensalidade * 0.8;
    }
}
