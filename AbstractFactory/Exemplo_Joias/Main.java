public class Main{
    public static void main(String[] args) {
        FabricaAbstrata f1;
        f1 = new FabricaAzul();
        Cliente c1 = new Cliente(f1);
        c1.executar();
        
        FabricaAbstrata f2;
        f2 = new FabricaLaranja();
        Cliente c2 = new Cliente(f2);
        c2.executar();
        
    } 
} 