# Padrão Strategy

### Pattern Name and Classification

Pattern Name: Strategy

Classification: Padrão comportamental

### Intent

O padrão Strategy possui como intenção criar um "intercâmbio" entre classes, de modo a criar diversas estratégias para determinada situação, ou seja, um problema tem várias soluções, e o padrão Strategy permite a criação de classes com essas soluções estratégicas. 

### Motivation

Este padrão torna o crescimento do sistema algo mais viável, de forma a organizar as estratégias em classes e permitindo que novas possibilidades sejam inclusas de maneira mais simples.

### Applicability

Como exemplo para este padrão, podemos citar as formas de descontos que um hotel oferece para bebês e crianças. Para isso, é necessário criar estratégias de diferentes possibilidades de desconto de acordo com as idades. 

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Strategy/imagem.jpg)

Com o padrão Strategy, cria-se uma classe para cada alterantiva possível, fazendo com que seja possível intercambiar entre as classes dependendo de cada situação. Caso seja necessário incluir novas estratégias e ampliar o sistema, este padrão permite essa ampliação, sem precisar modificar as classes de estratégias que já estão em funcionamento. 

Em Sample Code temos o exemplo concretizado do hotel, que possui três crianças, e cada uma delas enquadra-se em uma estratégia diferente, sendo que sua diária varia de acordo com a categoria a qual ela se encaixa.

### Structure

A estrutura do padrão Strategy é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Strategy/Structure.png)

### Participants

Context: classe que reponsável por dfinir e manter uma referência para uma das classes concretas, através da comunicação com a interface Strategy.

Strategy: interface que contém informações comuns para a classe ConcreteStrategy.

ConcreteStrategy: classes com diversas variações (cada classe com sua variação prória), baseando-se na interface Strategy.

### Sample Code

Exemplo tratado em aula desconto para alunos: [Desconto de Aluno](https://github.com/10Daniele/Padroes_Projeto/tree/master/Strategy/Exemplo_Desconto_Aluno)

Exemplo de desconto de hotel para crianças: [Desconto para Crianças](https://github.com/10Daniele/Padroes_Projeto/tree/master/Strategy/Exemplo_Desconto_Hotel)

Acima, temos o exemplo que foi abrodado em aula, que trata-se de diferentes possibilidades de deconto da mensalidade de uma faculdade. O outro é o exemplo do hotel, que oferece desconto aos hóspedes crianças, sendo que cada faixa etária apresenta uma estratégia de desconto diferente. Temos DescontoAteDois, DescontoAteCinco e DescontoAteOito, que são as classes de estratégia concreta, que baseiam-se na interface Desconto, e temos também a classe contexto CalculaDiaria.
