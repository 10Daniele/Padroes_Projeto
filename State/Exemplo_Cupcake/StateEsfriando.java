public class StateEsfriando extends CupcakeState{
    public StateEsfriando(Cupcake cupcake){
        super(cupcake);
    }

    public void printStatus(){
        System.out.println("Esfriando os cupcakes");
    }

    public void previousState(){
        System.out.println("Voltando uma etapa");
        this.getCupcake().setState(new StateAssando(this.getCupcake()));
    }

    public void nextState(){
        System.out.println("Passando para a próxima etapa!");
        this.getCupcake().setState(new StateCobertura(this.getCupcake()));
    }
}