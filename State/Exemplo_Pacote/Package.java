public class Package{
    private String name;
    private PackageState state;

    public void setState(PackageState newState){
        this.state = newState;
    } 

    public Package(String name){
        this.name = name;   
        this.state = new StateSolicitado(this);
    }

    public void previousState(){
        this.state.previousState();
    } 

    public void nextState(){
        this.state.nextState();
    }

    public void printStatus(){
        this.state.printStatus();
    }
}