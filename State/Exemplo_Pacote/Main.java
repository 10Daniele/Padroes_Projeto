class Main{
    public static void main(String[] args){
        Package pkg = new Package("Histórico do Pacote");
        System.out.println("\n--- Histórico do Pacote ---\n");
        pkg.printStatus();        
        pkg.previousState();
        pkg.printStatus();    
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();    
    }
}