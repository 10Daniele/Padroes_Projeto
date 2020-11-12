class Main{
    public static void main(String[] args){
        Cupcake cupcake = new Cupcake("Cupcake");
        System.out.println("Preparando um cupcake!\n");
        cupcake.printStatus();        
        cupcake.previousState();
        cupcake.printStatus();        
        cupcake.nextState();
        cupcake.printStatus();
        cupcake.nextState();
        cupcake.printStatus();
        cupcake.previousState();
        cupcake.printStatus();  
        cupcake.previousState();
        cupcake.printStatus();
        cupcake.nextState();
        cupcake.printStatus();
        cupcake.nextState();
        cupcake.printStatus();
        cupcake.nextState();
        cupcake.printStatus();
        cupcake.nextState();
        cupcake.printStatus();
    }
}