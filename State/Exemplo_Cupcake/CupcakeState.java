public abstract class CupcakeState{
    private Cupcake cupcake;

    public Cupcake getCupcake(){
        return this.cupcake;
    }

    public CupcakeState(Cupcake cupcake){
        this.cupcake = cupcake;
    }

    public abstract void printStatus();
    public abstract void previousState();
    public abstract void nextState();
}