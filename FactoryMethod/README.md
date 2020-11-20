# Padrão Factory Method

### Pattern Name and Classification

Pattern Name: Factory Method

Classification: Padrão criacional

### Intent


### Motivation


### Applicability

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

