public class StateEnviado extends PackageState{
    public StateEnviado(Package pkg){
        super(pkg);
    }

    public void printStatus(){
        System.out.println("Pacote Enviado");
    }

    public void previousState(){
        System.out.println("Voltando para o estado anterior");
        this.getPackage().setState(new StatePago(this.getPackage()));
    }

    public void nextState(){
        System.out.println("Transicionado para o próximo estado");
        this.getPackage().setState(new StateRecebido(this.getPackage()));
    }
}