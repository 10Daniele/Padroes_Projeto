public class StateCobertura extends CupcakeState{
    public StateCobertura(Cupcake cupcake){
        super(cupcake);
    }

    public void printStatus(){
        System.out.println("Colocando a cobertura");
    }

    public void previousState(){
        System.out.println("Transicionado para o próximo estado");
        this.getCupcake().setState(new StateEsfriando(this.getCupcake()));
    }

    public void nextState(){
        System.out.println("Já estamos na última etapa!");
    }
}