# Padrão Strategy

### Pattern Name and Classification

Pattern Name: Strategy

Classification: Padrão comportamental

### Intent

O padrão Strategy possui como intenção criar um "intercâmbio" entre classes, de modo a criar diversas estratégias para determinada situação, ou seja, um problema tem várias soluções, e o padrão Strategy permite a criação de classes com essas soluções estratégicas. 

### Motivation

Este padrão torna o crescimento do sistema algo mais viável, de forma a organizar as estratégias em classes e permitindo que novas possibilidades sejam inclusas de maneira mais simples.

### Applicability


![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Strategy/imagem.jpg)


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

