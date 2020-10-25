class Main {
   public static void main(String[] args) {
      Subject subject = new Subject();

      new HexaObserver(subject);
      new OctalObserver(subject);
      new BinaryObserver(subject);

      System.out.println("First state change: 20");	
      subject.setState(20);
      System.out.println("Second state change: 55");	
      subject.setState(55);
   }
}