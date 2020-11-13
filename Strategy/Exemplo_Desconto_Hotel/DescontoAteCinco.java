public class DescontoAteCinco implements Desconto{
    public double aplicarDesconto(Hospede hospede, double diaria){    
        if(hospede.getAteCinco()){
            return diaria*0.65;
        }
        else{
            return 0;
        }
    }
}