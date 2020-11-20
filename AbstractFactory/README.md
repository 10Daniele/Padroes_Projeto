# Padrão Abstract Factory

### Pattern Name and Classification

Pattern Name: Abstract Factory

Classification: Padrão criacional

### Intent


### Motivation


### Applicability


![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/AbstractFactory/imagem.png)

No Factory Method, chocolate seria uma classe abstrata que possui uma estrutura padrão, e meio amargo, branco e ao leite são classes que podem se basear ou e modificar comportamentos da classe abstrata. Com essa estrutura, o crescimento do sistema passa a ser algo mais simplificado. Caso fosse necessário implementar a classe de um novo chocolate, como por exemplo o chocolate rubi, bastaria incluir essa classe e informar a classe FabricaChocolates sobre essa mudança.

### Structure

A estrutura do padrão Abstract Factory é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/AbstractFactory/Structure.png)

### Participants

Client: 

AbstractFactory:

ConcreteFactoryX:

AbstractProductY:

ProductYX:

### Sample Code

Exemplo de fábricas de colares e brincos: [Fábricas](https://github.com/10Daniele/Padroes_Projeto/tree/master/AbstractFactory/Exemplo_Joias)

