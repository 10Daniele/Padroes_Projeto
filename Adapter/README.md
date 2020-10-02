# Padrão Adapter

### Pattern Name and Classification

Pattern Name: Adapter

Classification: Padrão estrutural

### Intent

A intenção deste padrão é permitir que classes com interfaces imcompatíveis consigam colaborar e trabalhar juntas.

### Motivation

Criação de uma classe adaptadora, que realiza a conversão de uma interface de forma organizada (encapsulando e escondendo os aspectos complexos dessa adaptação), para que essa interface possa ser utilizada e vista pela classe Cliente.

### Applicability

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Adapter/imagem.jpg)

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
