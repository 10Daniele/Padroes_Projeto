# Padrão Singleton

### Pattern Name and Classification

Pattern Name: Singleton

Classification: Padrão criacional

### Intent

A intenção do padrão Singleton é garantir que exista apenas uma determinada instância de uma classe, ou seja, não existirá mais instâncias, o que permite que haja um ponto de acesso global para essa instância criada. 

### Motivation

Com este padrão, nenhuma outra classe do sistema terá acesso à instância da classe Singleton, de modo a ser possível controlar a meneira que essa classe será instaciada, sendo seu contrutor privado e sua instância pública. Também será posível evitar problemas de referênca da instância, visto que sua utilização será controlada.

### Applicability

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Singleton/imagem.jpg)

### Structure

A estrutura do padrão Singleton é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Singleton/Structure.png)

### Participants

Singleton: Nesta classe é declarado o getInstance, um método "chave", ou seja, é a única maneira de se acessar o objeto singleton. A classe Singleton é a única dese padrão.

Client: É a classe que irá utilizar o Singleton (no exemplo a seguir, a classe cliente é a Main). Esta classe utilizará apenas a instância da classe Singleton.

### Sample Code

Exemplo de uma lista de entrada: [Lista de Entrada](https://github.com/10Daniele/Padroes_Projeto/tree/master/Singleton/ListaEntrada)
