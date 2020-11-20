public class FabricaAzul implements FabricaAbstrata{
    @Override
    public colarAbstrato criaColar(){
        return new ColarAzul(); 
    }
    
    @Override
    public brincoAbstrato criaBrinco(){
        return new BrincoAzul();
    }
}