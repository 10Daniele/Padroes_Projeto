import java.util.List;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){    
        System.out.println("CALCULANDO DESCONTOS DE HOSPEDAGEM");
        
        double valDiaria = 300;
        //Criança 1 ------------------------------------------------
        Hospede crianca1 = new Hospede("Ana", "Juliana");
        crianca1.setAteDois(true);
    
        List<Desconto> descontos = new ArrayList<Desconto>();
        descontos.add(new DescontoAteDois());
        CalculaDiaria calcular = new CalculaDiaria(descontos);        

        System.out.println("\nCriança 1 ------");
        System.out.println("Nome da Criança: " + crianca1.getNomeCrianca());
        System.out.println("Nome do Responsável: " + crianca1.getNomeResponsavel());
        System.out.println("Valor da diária com o desconto: R$" + calcular.obterValorDiaria(crianca1, valDiaria));
        
        //Criança 2 ------------------------------------------------
        Hospede crianca2 = new Hospede("Marcos", "Miguel");
        crianca2.setAteCinco(true);
    
        descontos = new ArrayList<Desconto>();
        descontos.add(new DescontoAteCinco());
        calcular = new CalculaDiaria(descontos);
      
        System.out.println("\nCriança 2 ------");
        System.out.println("Nome da Criança: " + crianca2.getNomeCrianca());
        System.out.println("Nome do Responsável: " + crianca2.getNomeResponsavel());
        System.out.println("Valor da diária com o desconto: R$" + calcular.obterValorDiaria(crianca2,valDiaria));
        
        //Criança 3 ------------------------------------------------
        Hospede crianca3 = new Hospede("Lucas", "Maria");
        crianca3.setAteOito(true);
    
        descontos = new ArrayList<Desconto>();
        descontos.add(new DescontoAteOito());
        calcular = new CalculaDiaria(descontos);

        System.out.println("\nCriança 3 ------");
        System.out.println("Nome da Criança: " + crianca3.getNomeCrianca());
        System.out.println("Nome do Responsável: " + crianca3.getNomeResponsavel());
        System.out.println("Valor da diária com o desconto: R$" + calcular.obterValorDiaria(crianca3, valDiaria));
    }  
}