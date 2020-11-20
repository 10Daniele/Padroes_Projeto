class Main{
    public static void main(String[] args){    
        Chocolate choc1 = FabricaChocolate.getChocolate(0);
        System.out.println(choc1.getTipo());   
        System.out.println("Calorias: " + choc1.getCalorias());
        System.out.println("\n");
        
        Chocolate choc2 = FabricaChocolate.getChocolate(1);
        System.out.println(choc2.getTipo());   
        System.out.println("Calorias: " + choc2.getCalorias());
        System.out.println("\n");
        
        Chocolate choc3 = FabricaChocolate.getChocolate(2);
        System.out.println(choc3.getTipo());   
        System.out.println("Calorias: " + choc3.getCalorias());
        System.out.println("\n");
    } 
}