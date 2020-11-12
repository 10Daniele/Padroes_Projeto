public class StatePreparandoMassa extends CupcakeState{
    public StatePreparandoMassa(Cupcake cupcake){
        super(cupcake);
    }

    public void printStatus(){
        System.out.println("Preparando massa!");
    }

    public void previousState(){
        System.out.println("Já estamos na primeira etapa do processo!");  
    }

    public void nextState(){
        System.out.println("Passando para a próxima etapa!");
        this.getCupcake().setState(new StateAssando(this.getCupcake())); 
    }
}