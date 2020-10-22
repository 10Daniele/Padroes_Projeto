class Main{
    public static void main(String[] args){
        Subject subject = new Subject();

        new ConverteDolar(subject);
        new ConverteEuro(subject);
        new ConverteLibra(subject);
        new ConvertePeso(subject);
    
        System.out.println("CONVERTENDO MOEDAS"); 
        System.out.println("\n20 reais");
        subject.setEstado(20);
        
        System.out.println("\n2 reais");
        subject.setEstado(2);
        
        System.out.println("\n100 reais");
        subject.setEstado(100);
    } 
}