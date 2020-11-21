# Padrão Abstract Factory

### Pattern Name and Classification

Pattern Name: Abstract Factory

Classification: Padrão criacional

### Intent

Este padrão possui a capacidade de agrupar os objetos de acordo com algumas características definidas ("famílias"), de modo a facilitar a implementação quando tem-se variedades de instâncias. Utilizando interfaces, o sistema consegue diminuir o acoplamento entre objetos (mesmo que esses objetos possuam características parecidas), 

### Motivation

Como motivação, este padrão busca o isolamento dos objetos, mas sem separá-los completamente através do uso de interfaces e encapsulamento. Caso novos agrupamentos sejam necessários, com o Abstract Factory o crescimento do sistema é algo mais simples.

### Applicability

Para melhor expicar o padrão Abstract Factory, temos o seguinte exemplo:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/AbstractFactory/imagem.png)

Temos uma fábrica de brincos e colares, disponíveis nas cores azul e laranja. Com o padrão, conseguimos separar esses objetos por categoria, sendo que cada categoria será uma interface (no caso, teremos as interfaces colarAbstrato e brincoAbtsrato). Com isso, temos a interface FabricaAbstrata, que é base para a criação das classes FabricaAzul e FabricaLaranja. Deste modo, teremos objetos fracamente acoplados, mas sem perderem essa dependência entre si, ou seja, o colar azul "sabe" que faz parte da fábrica azul, do mesmo modo que o brinco laranja tem esse conhecimento. 

De um modo geral, como dito anterirmente, o Abstract Factory auxilia a instanciação de objetos que possuem características semelhantes e possibilita uma acoplação fraca dessas instâncias. Atualmete, com os novos frameworks disponíveis, este padrão pode ser substituído por estes frameworks.  

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

No exemplo da fábrica, temos as classes FabricaAzul e FabricaLaranja como ConcreteFactory, que implementam a interface FabricaAbstrata. Estas classes irão instanciar os produtos, sendo que a classe FabricaAzul instancia ColarAzul e BrincoAzul e a FabricaLaranja instancia ColarLaranja e BrincoLaranja. Este exemplo mostra como os objetos podem estar fracamente acoplados, e ao mesmo tempo dependentes um do outro, de modo a mostrar qual produto combina com qual (brinco azul combina com colar azul, da mesma forma que o brinco laranja combina com colar laranja).
