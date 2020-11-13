public class DescontoAteOito implements Desconto{
    public double aplicarDesconto(Hospede hospede, double diaria){    
        if(hospede.getAteOito()){
            return diaria*0.4;
        }
        else{
            return 0;
        }
    }
}