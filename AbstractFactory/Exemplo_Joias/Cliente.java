public class Cliente{
    private colarAbstrato Colar;
    private brincoAbstrato Brinco;

    public Cliente(FabricaAbstrata fabrica){
        Colar = fabrica.criaColar();
        Brinco = fabrica.criaBrinco();
    }

    public void executar(){
        Brinco.interagir(Colar);
    }
}
 