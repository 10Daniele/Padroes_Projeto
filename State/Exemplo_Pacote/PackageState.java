public abstract class PackageState{
    private Package pkg;

    public Package getPackage(){
        return this.pkg;
    }

    public PackageState(Package pkg){
        this.pkg = pkg;
    }

    public abstract void printStatus();
    public abstract void previousState();
    public abstract void nextState();
}