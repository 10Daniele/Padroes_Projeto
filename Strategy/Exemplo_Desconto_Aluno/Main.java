import java.util.List;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        
        System.out.println("Calcula desconto de aluno\n");
        Aluno a1 = new Aluno("João");
        
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade();
    
        List<Desconto> descontos = new ArrayList<Desconto>();
        descontos.add(new DescontoBaixaRenda());   
    
        double m1 = calculadora.calcularMensalidade(1000.0, descontos);
        a1.setMensalidade(m1);
    
        System.out.println("Aluno " + a1.getName());
        System.out.println("Mensalidade " + a1.getMensalidade());
    
        //descontos.set(0, new DescontoPagtoAntecipado());  
        descontos.add(new DescontoTransferencia());   
    
        double m2 = calculadora.calcularMensalidade(1000.0, descontos);
        a1.setMensalidade(m2);
    
        System.out.println("Aluno " + a1.getName());
        System.out.println("Mensalidade " + a1.getMensalidade());
    
        descontos.set(0, new DescontoPagtoAntecipado());   
    
        double m3 = calculadora.calcularMensalidade(1000.0, descontos);
        a1.setMensalidade(m3);
    
        System.out.println("Aluno " + a1.getName());
        System.out.println("Mensalidade " + a1.getMensalidade());
    }
}
