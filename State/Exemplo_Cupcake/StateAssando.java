public class StateAssando extends CupcakeState{
    public StateAssando(Cupcake cupcake){
        super(cupcake);
    }

    public void printStatus(){
        System.out.println("Assando os cupcakes!");
    }

    public void previousState(){
        System.out.println("Voltando uma etapa");
        this.getCupcake().setState(new StatePreparandoMassa(this.getCupcake()));
    }

    public void nextState(){
        System.out.println("Passando para a próxima etapa!");
        this.getCupcake().setState(new StateEsfriando(this.getCupcake()));
    }
}