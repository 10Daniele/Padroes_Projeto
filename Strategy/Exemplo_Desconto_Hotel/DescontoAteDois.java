public class DescontoAteDois implements Desconto{  
    public double aplicarDesconto(Hospede hospede, double diaria){    
        if(hospede.getAteDois()){
            return diaria*0.8;
        }
        else{
            return 0;
        }
    }
}