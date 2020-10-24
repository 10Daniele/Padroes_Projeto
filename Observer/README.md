# Padrão Observer

### Pattern Name and Classification

Pattern Name: Observer

Classification: Padrão comportamental

### Intent

A intenção deste padrão é promover a comunicação entre classes, notificando-as quando algum evento ocorre.

### Motivation

O padrão observer possui uma classe que será observada por outras classes, e essas classes observadoras ficarão aguardando até que a classe observada realize alguma mudança de estado, sendo que quando isso ocorrer, as classes que estão observando serão notificadas. Uma das características deste padrão é não manter as classes com baixo acoplamento, a fim de facilitar o encapsulamento do código.

### Applicability

Utiliza-se o padrão Observer quando é necessário "avisar" várias classes sobre determinado evento que ocorre em outra classe X. Para evitar que as classes que precisam ser avisadas verifiquem constantemente a classe X, temos o auxílio do padrão Observer. No exemplo abaixo, temos a conversão da moeda real para outras moedas. O nosso evento é a troca do valor em Real.

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Observer/imagem.png)

Sem o padrão Observer, as classes que realizam as conversões precisariam verificar constantemente a classe principal para confirmar se o valor em real foi alterado. Com este padrão, as classes receberão uma notificação apenas no momento da mudança de estado.

### Structure

A estrutura do padrão Observer é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Observer/Structure.png)

### Participants

Subject: nesta classe consnta os eventos e seus estados, que serão captados pela interface Observer.
 
Observer: é uma interface responsável por notificar os observadores concretos quando ocorre alguma mudança de estado. Nesta interface, existem os métodos que serão úteis para os ConcreteObservers.

ConcreteObserverX: são as classes que receberão a notificação da classe Subject, através da interface Observer e realização alguma ação a partir desta notificação. 

### Sample Code

Exemplo de conversão de moedas: [Convertendo Moedas](https://github.com/10Daniele/Padroes_Projeto/tree/master/Observer/Exemplos_Converter_Moeda)
