# Padrão Factory Method

### Pattern Name and Classification

Pattern Name: Factory Method

Classification: Padrão criacional

### Intent

A intenção do padrão Factory Method é reduzir o acoplamento entre classes, utilizando o princício da responsabilidade única, atribuindo essa função à um único ponto, sendo que em um cenário com diferentes classes, o padrão auxilia na implementação e em um futuro crescimento do número de classes (mas as classes devem possuir uma certa correlação).

### Motivation

Com este padrão, os objetos serão criados na Fábrica, sendo que o construtor de todos os objetos estará alocado em um único lugar, de forma a encapsular a criação dos mesmos. Deste modo, as subclasses que deverão tomar a decisão de quais objetos deverão ser criados.

### Applicability

Este padrão pode ser utilizado quando há a necessidade de criar uma estrutura complexa de classes, sendo que essas classes tem "intenções" semenhantes. Para isso, o Factory Method utiliza-se de hierarquia e encapsulamento para facilitar a criação dessas classes. Como exemplo, temos uma classe abstrata chocolate, que é a base para a criação de outras classes. 

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/FactoryMethod/imagem.png)

No Factory Method, chocolate seria uma classe abstrata que possui uma estrutura padrão, e meio amargo, branco e ao leite são classes que podem se basear ou e modificar comportamentos da classe abstrata. Com essa estrutura, o crescimento do sistema passa a ser algo mais simplificado. Caso fosse necessário implementar a classe de um novo chocolate, como por exemplo o chocolate rubi, bastaria incluir essa classe e informar a classe FabricaChocolates sobre essa mudança.

### Structure

A estrutura do padrão Factory Method é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/FactoryMethod/Structure.png)

### Participants

Client: classe que irá depender da interface IProduct

Creator: essa classe irá definir um método Factory Mathod, que deverá retornar os produtos concretos que foram criados.

IProduct: é uma interface ou classe abstrata que irá definir o "modelo" dos objetos que serão criados pelo Factory (obejtos serão produzidos pelo Creator).

ProductX: são os produtos que podem ser criados, baseando-se na interface IProduct, ou seja, é aqui que a interface IProduct será utilizada (os produtos deverão seguir o modelo da interface).

### Sample Code

Exemplo de uma fábrica de chocolates: [Fábrica de Chocolates](https://github.com/10Daniele/Padroes_Projeto/tree/master/FactoryMethod/Exemplo_Tipos_Chocolate)

O exemplo acima trata-se da fábrica de chocolates, que possui a classe FabricaChocolate, que seria a classe Credor, a classe abstrata Chocolate, que contém como base o tipo de chocolate e o número de calorias (métodos) e as classes AoLeite, MeioAmargo e Branco, que seriam as ProductX, que extendem Chocolate. Deste modo, temos o funcionamento do padrão Factory Method, sendo que ao adicionar Chocolates, a classe FabricaChcolate não será afetada e não precisará ser alterada por conta da pouca acoplação entre o produto e sua fábrica.
