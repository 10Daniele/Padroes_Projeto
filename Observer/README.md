# Padrão Observer

### Pattern Name and Classification

Pattern Name: Observer

Classification: Padrão comportamental

### Intent

A intenção deste padrão é promover a comunicação entre classes, notificando-as quando algum evento ocorre.

### Motivation

O padrão observer possui uma classe que será observada por outras classes, e essas classes observadoras ficarão aguardando até que a classe observada realize alguma mudança de estado, sendo que quando isso ocorrer, as classes que estão observando serão notificadas. Uma das características deste padrão é não manter as classes com baixo acoplamento, a fim de facilitar o encapsulamento do código.

### Applicability



![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Observer/imagem.png)


### Structure

A estrutura do padrão Observer é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Observer/Structure.png)

### Participants

Subject: nesta classe consnta os eventos e seus estados, que serão captados pela interface Observer.
 
Observer: é uma interface responsável por notificar os observadores concretos quando ocorre alguma mudança de estado. Nesta interface, existem os métodos que serão úteis para os ConcreteObservers.

ConcreteObserverX: são as classes que receberão a notificação da classe Subject, através da interface Observer e realização alguma ação a partir desta notificação. 

### Sample Code

Exemplo de conversão de moedas: [Convertendo Moedas](https://github.com/10Daniele/Padroes_Projeto/tree/master/Observer/Exemplos_Converter_Moeda)
