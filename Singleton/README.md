# Padrão Singleton

### Pattern Name and Classification

Pattern Name: Singleton

Classification: Padrão criacional

### Intent

A intenção do padrão Singleton é garantir que exista apenas uma determinada instância de uma classe, ou seja, não existirá mais instâncias, o que permite que haja um ponto de acesso global para essa instância criada. 

### Motivation

Com este padrão, nenhuma outra classe do sistema terá acesso à instância da classe Singleton, de modo a ser possível controlar a meneira que essa classe será instaciada, sendo seu contrutor privado e sua instância pública. Também será posível evitar problemas de referênca da instância, visto que sua utilização será controlada.

### Applicability

O padrão Singleton é bastante utilizado quando é necessário um controle de acesso, como em um banco de dados ou em um arquivo. O exemplo abaixo demonstra como funciona a questão do controle de acesso:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Singleton/imagem.jpg)

Podemos perceber que apenas a pessoa que está controlando a lista de entrada terá acesso ao arquivo, garantindo a integridade dos dados, pois apenas ela possui o conector de acesso à classe Singleton. Neste exemplo, temos a "Lais" que deseja entrar em uma sala, mas para isso, precisa dizer seu nome na entrada, que é controlada por uma pessoa responsável. 

Sem o padão Singleton, outra pessoa poderia acessar o arquivo a partir de outra instância, comprometendo a integridade dos dados, sendo que caso uma Pessoa X e uma Pessoa Y estejam acessando o arquivo, e que a X inclua um nome e logo em seguida a Y também inclua um nome, o nome da incluso pela Pessoa X se perderia no processo, visto que Y estava com uma versão "desatualizada" do arquivo.

Portando o Design Pattern Singleton auxilia no controle de acesso à uma instância, adquirindo um maior controle de acesso e impedindo possíveis perdas de dados e inconsistências.

### Structure

A estrutura do padrão Singleton é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Singleton/Structure.png)

### Participants

Singleton: nesta classe é declarado o getInstance, um método "chave", ou seja, é a única maneira de se acessar o objeto singleton. A classe Singleton é a única dese padrão.

Client: é a classe que irá utilizar o Singleton (no exemplo a seguir, a classe cliente é a Main). Esta classe utilizará apenas a instância da classe Singleton.

### Sample Code

Exemplo da lista de entrada: [Lista de Entrada](https://github.com/10Daniele/Padroes_Projeto/tree/master/Singleton/ListaEntrada)
