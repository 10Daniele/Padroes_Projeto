public class StateSolicitado extends PackageState{
    public StateSolicitado(Package pkg){
        super(pkg);
    }

    public void printStatus(){
        System.out.println("Pacote Solicitado");
    }

    public void previousState(){
        System.out.println("Já está no primeiro estado");  
    }

    public void nextState(){
        System.out.println("Transicionado para o próximo estado");
        this.getPackage().setState(new StatePago(this.getPackage()));
    }
}