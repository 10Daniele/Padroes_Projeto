# Padrão Abstract Factory

### Pattern Name and Classification

Pattern Name: Abstract Factory

Classification: Padrão criacional

### Intent

Este padrão possui a capacidade de agrupar os objetos de acordo com algumas características definidas ("famílias"), de modo a facilitar a implementação quando tem-se variedades de instâncias. Utilizando interfaces, o sistema consegue diminuir o acoplamento entre objetos (mesmo que esses objetos possuam características parecidas), 

### Motivation



### Applicability


![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/AbstractFactory/imagem.png)


### Structure

A estrutura do padrão Abstract Factory é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/AbstractFactory/Structure.png)

### Participants

Client: classe que conecta-se com as interfaces (AbstractFactory e AbstractProductY).

AbstractFactory: interface que servirá de base para classes de fábricas concretas.

ConcreteFactoryX: é a classe que tem como função instanciar os produtos, seguindo o modelo da fábrica abstrata.

AbstractProductY: interfaces que servirão de referência para alguns produtos específicos (produtos com carcterísicas semelhantes irão utilizar determinada classe abstrata como referência).

ProductYX: são considerados os produtos concretos, implementados a partir da interface AbstractProductY, que são "agrupados" de acordo com suas características.

### Sample Code

Exemplo de fábricas de colares e brincos: [Fábricas](https://github.com/10Daniele/Padroes_Projeto/tree/master/AbstractFactory/Exemplo_Joias)

