# Padrão State

### Pattern Name and Classification

Pattern Name: State

Classification: Padrão comportamental

### Intent

O padrão State busca criar uma máquina de estado, implementando classes para cada estado possível, sendo que cada estado irá conter um determinado comportamento que será executado pelo objeto.

### Motivation

Este padrão possui uma interface State, que contém alguns atributos pré-definidos. Estes atributos necessáriamente serão utilizados nos estados que determinado objeto pode adquirir. Com isso, torna-se possível fazer o gerenciamento de estados, possibilitando determinado comportamento para um objeto de acordo com seu estado atual. Podemos dizer também que uma das principais motivações desse padrão, é reduzir a complexidade ciclomática do programa, ou seja, reduzir caminhos independentes que o sistema pode ter.

### Applicability

Como dito acima, utilizamos o padrão State quando precisamos que um objeto execute determinada tarefa de acordo com seu estado. Portanto, temos o exemplo do processo de fabricação de um cupcake. 

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/State/imagem.jpg)

Nas classes de estado concreto (no exemplo são as classes StatePreparandoMassa, StateAssando, StateEsfriando e a StateCobertura), temos conexões que permitem ir para o próximo estado ou retornar para o estado anterior, ou seja, quando o objeto estiver com o estado StateAssando, ele poderá avançar para o StateEsfriando ou retornar para o StatePreparandoMassa, garantindo o gerenciamento de cada estado e suas funcionalidades.

Sem o padrão State, 

### Structure

A estrutura do padrão State é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/State/Structure.png)

### Participants

Context: é a classe responsável por definir, através da inerface State, qual é o estado atual do objeto.

State: interface que contém os métodos que servirão com responsabilidades e ordens dos estados do objeto.

ConcreteState: classes que irão efetivamente implementar a interface estado e seus métodos de forma concreta. 

### Sample Code

Exemplo dos Cupcakes: [Fabricando Cupcakes](https://github.com/10Daniele/Padroes_Projeto/tree/master/State/Exemplo_Cupcake)

Exemplo abordado em aula: [Caminho do Pacote](https://github.com/10Daniele/Padroes_Projeto/tree/master/State/Exemplo_Pacote)

