# Padrão Template Method

### Pattern Name and Classification

Pattern Name: Template Method

Classification: Padrão comportamental

### Intent

Criar uma super classe esqueleto (classe preincipal), com o template method e subclasses, que poderão sobrescrever e alterar a ordem das etapas inseridas na classe principal.

### Motivation

O padrão de projeto Template Method permite o reaproveitamento de métodos quando as subclasses possuem estruturas parecidas, tendo uma classe principal com métodos que poderão ser utilizados e aproveitados pelas classes "filhas". 

### Applicability

Com foi dito acima, template method utiliza uma classe esqueleto e outras subclasses que utilizarão métodos dessa classe esqueleto. Abaixo, temos a exemplificação de uma possível utilização do template method:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/TemplateMethod/imagem.jpg)

Para se fazer sucos, utilizamos diversos ingredientes. Porém, alguns deles podem ser comuns entre alguns tipos de suco, como água, gelo, açúcar. O template method surge para evitar a criação do mesmo código diversas vezes, sendo que sem o template, teríamos que criar os métodos água, gelo, açúcar cada vez que precisássemos criar um novo tipo de suco que utilizasse estes ingredientes. 

Cada subclasse pode utilizar apenas métodos que serão necessários para si, não sendo obrigatório utilizar todos os métodos da classe principal. Um exemplo é o suco de melancia, que não irá precisar de água para ser preparado, ou o suco de laranja, que não precisa de açúcar. Cada uma dessas classes utiliza apenas o que realmente é importante para si.

No exemplo, temos a classe principal **Suco**, que contem ingredientes que podem ser utilizados e o template method de preparar suco. Já as subclasses **Laranja**, **Melancia** e **Limão** possuem os ingredientes necessários para o suco e o método de preparar suco (provenientes da classe Suco).

### Structure

A estrutura do padrão Template Method é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/TemplateMethod/Structure.png)

### Participants

FrameworkClass: nesta classe, o template method é definido. Este template terá a função de chamar os demais métodos em determinada ordem. 

ApplicationClass: esta classe pode sobrescrever as etapas especificadas na FrameworkClass sempre que necessário.

### Sample Code

Exemplo de sucos e seus ingredientes: [Sucos](https://github.com/10Daniele/Padroes_Projeto/tree/master/TemplateMethod/Exemplo_Suco)


