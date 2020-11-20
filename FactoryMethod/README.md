# Padrão Factory Method

### Pattern Name and Classification

Pattern Name: Factory Method

Classification: Padrão criacional

### Intent

A intenção do padrão Factory Method é reduzir o acoplamento entre classes, utilizando o princício da responsabilidade única, atribuindo essa função à um único ponto, sendo que em um cenário com diferentes classes, o padrão auxilia na implementação e em um futuro crescimento do número de classes (mas as classes devem possuir uma certa correlação).

### Motivation

Com este padrão, os objetos serão criados na Fábrica, sendo que o construtor de todos os objetos estará alocado em um único lugar, de forma a encapsular a criação dos mesmos. Deste modo, as subclasses que deverão tomar a decisão de quais objetos deverão ser criados.

### Applicability

Este padrão pode ser utilizado quando há a necessidade de criar uma estrutura complexa de classes, sendo que essas classes tem "intenções" semenhantes. Para isso, o Factory Method utiliza-se de hierarquia e encapsulamento para facilitar a criação dessas classes. Como exemplo, temos uma interface chocolate, que é a base para a criação de outras classes. 

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/FactoryMethod/imagem.png)



### Structure

A estrutura do padrão Factory Method é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/FactoryMethod/Structure.png)

### Participants

Client: classe que irá depender da interface IProduct

Creator: essa classe irá definir um método Factory Mathod, que deverá retornar os produtos concretos que foram criados.

IProduct: é uma interface que irá definir o "modelo" dos objetos que serão criados pelo Factory (obejtos serão produzidos pelo Creator).

ProductX: são os produtos que podem ser criados, baseando-se na interface IProduct, ou seja, é aqui que a interface IProduct será utilizada (os produtos deverão seguir o modelo da interface).

### Sample Code

Exemplo de uma fábrica de chocolates: [Fábrica de Chocolates](https://github.com/10Daniele/Padroes_Projeto/tree/master/FactoryMethod/Exemplo_Tipos_Chocolate)

