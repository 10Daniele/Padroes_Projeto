# Padrão Memento

### Pattern Name and Classification

Pattern Name: Memento

Classification: Padrão comportamental

### Intent

A intenção deste padrão de projeto é criar uma forma de "backup" de estados de um objeto, permitindo que o programa possua uma recuperação, caso ocorram possíveis erros. 

### Motivation

O padrão memento permite que determinado estado de um objeto seja salvo, sempre buscando o não comprometimento dos princípios de encapsulamento. Para que isso seja possível, são criados certos pontos de restauração no código, de modo a salvar esses pontos-chave em forma de pilha (a cada ponto de restauração, o estado é enviado para essa pilha ordenada). 

### Applicability

Este padrão é utilizado quando há a necessidade de salvar certos estados de um objeto. O exemplo abaixo retrata o funcionamento de um saldo de determinada conta bancária. O usuário pode realizar saques e depósitos. Para uma maior segurança, viu-se a necessidade de salvar, criar um histórico da movimentação desse saldo, portanto, o padão memento foi utilizado para permitir que os estados do saldo fossem salvos.

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Memento/imagem.png)

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Memento/imagem2.png)

### Structure

A estrutura do padrão Adapter é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Memento/Structure.png)

### Participants

Memento:

Originator: 

Caretaker:

### Sample Code



