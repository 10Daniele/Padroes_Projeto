public class FabricaLaranja implements FabricaAbstrata{
    @Override
    public colarAbstrato criaColar(){
        return new ColarLaranja();
    }
    
    @Override
    public brincoAbstrato criaBrinco(){ 
        return new BrincoLaranja();
    }
}