class Main {
  public static void main(String[] args) {
        try {
          Component component = new Galho("Raiz");
          component.add(new Maca("Maça", 1));
          component.add(new Maca("Maça", 1));

          Component macaTopo = new Galho("Tronco");
          component.add(macaTopo);  
          macaTopo.add(new Maca("Maça", 1));
          macaTopo.add(new Maca("Maça", 1));
          macaTopo.add(new Maca("Maça", 1));
          
         
          component.add(new Maca("Maça", 1));
          component.add(new Maca("Maça", 1));
          
          component.add(macaTopo); 
          macaTopo.add(new Maca("Maça", 1));
          macaTopo.add(new Maca("Maça", 1));
          
          float totalMacas = component.getMaca();
          System.out.println("Total de maçãs: " + totalMacas);
          component.list(0);
        }
        catch (Exception e) {
          e.printStackTrace();
        }
    }
}