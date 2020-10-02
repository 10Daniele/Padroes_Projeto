# Padrão Adapter

### Pattern Name and Classification

Pattern Name: Adapter

Classification: Padrão estrutural

### Intent

A intenção deste padrão é permitir que classes com interfaces imcompatíveis consigam colaborar e trabalhar juntas.

### Motivation

Criação de uma classe adaptadora, que realiza a conversão de uma interface de forma organizada (encapsulando e escondendo os aspectos complexos dessa adaptação), para que essa interface possa ser utilizada e vista pela classe Cliente.

### Applicability

O padrão adapter, como dito anteriormente, utiliza uma classe que realiza as apadtações necessárias para que a classe Cliente possa acessar uma interface diferente da interface padrão. Para melhor compreensão, temos o exemplo de uma fábrica de blusas. 

Quando a fábrica foi fundada, eram fabricadas apenas blusas regatas. Porém, com o passar dos anos, sentiu-se a necessidade da fábrica evoluir e começar a produzir blusas com mangas. Cada blusa possui um molde, mas o sistema (a princípio) não consegue entender o molde da blusa com manga, pois é proveniente de uma classe diferente.

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Adapter/imagem.jpg)

Então, foi preciso criar um adaptador para que o sistema consiga compreender e utilizar o molde de blusa com manga. 

O mesmo problema ocorre quando queremos colocar um plugue de 3 pinos em uma tomada que permite apenas 2. É necessário a intervenção de um adaptador, para que a tomada possa ser utilizada pelo usuário. 

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Adapter/imagem2.jpg)

Portanto, o padrão adapter tem essa função essencial em programas que precisam acessar classes e interfaces inacessíveis utilizando "herança múltipla para gerar o adaptador a partir de uma subclasse".

### Structure

A estrutura do padrão Adapter é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Adapter/Structure.png)

Uma das variações do padrão Adapter é o Adapter de Classe, que possui a seguinte estrutura:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Adapter/Structure_Classe.png)

### Participants

Target: é a interface responsável por definir um domínio que será utilizado pela classe Client.

Client: esta classe visualiza apenas a interface Target. 

Adaptee: é inacessível à classe Client. Consta uma interface ou contrato que precisarão ser adaptados (não seriam utilizadas caso não existisse a classe Adapter)

Adapter: classe que realiza a adaptação do Adaptee, para que possa ser utilizado pela interface Target, tornando-o acessível.

### Sample Code

Exemplo de uma fábrica de blusas: [Fábrica de Blusas](https://github.com/10Daniele/Padroes_Projeto/tree/master/Adapter/Exemplo_FabricaBlusas)

Exemplo de adaptador de tomada (exemplo tratado em aula): [Adaptador de Tomada](https://github.com/10Daniele/Padroes_Projeto/tree/master/Adapter/Exemplo_AdaptadorTomada)

No exemplo da fábrica, temos o padrão adapter. A classe Main é a classe cliente, que possui acesso à interface Molde (Target). Essa interface reconhece a classe MoldeBlusaRegata, mas não reconhe a classe MoldeBlusaManga. Portanto, utilizamos o AdaptadorMangas que realiza as adequações para que a classe MoldeBlusaManga possa ser utilizada.

Já o exemplo de adaptador de tomada é uma demonstração das variações do adapter (adapter de classe), que foi vista em aula, que utilizamos um adaptador para conseguir utilizar um plugue de 3 pinos em uma tomada de 2. 
