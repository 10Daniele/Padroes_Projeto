public class StatePago extends PackageState{
    public StatePago(Package pkg){
        super(pkg);
    }

    public void printStatus(){
        System.out.println("Pacote Pago");
    }

    public void previousState(){
        System.out.println("Voltando para o estado anterior");
        this.getPackage().setState(new StateSolicitado(this.getPackage()));
    }

    public void nextState(){
        System.out.println("Transicionado para o próximo estado");
        this.getPackage().setState(new StateEnviado(this.getPackage()));
    }
}