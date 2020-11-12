public class Cupcake{
    private String name;
    private CupcakeState etapa;

    public void setState(CupcakeState novaEtapa){
        this.etapa = novaEtapa;
    } 

    public Cupcake(String name){
        this.name = name;   
        this.etapa = new StatePreparandoMassa(this); 
    }

    public void previousState(){
        this.etapa.previousState();
    } 

    public void nextState(){
        this.etapa.nextState();
    }

    public void printStatus(){
        this.etapa.printStatus();
    }
}