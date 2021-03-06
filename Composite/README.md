# Padrão Composite

### Pattern Name and Classification

Pattern Name: Composite

Classification: Padrão estrutural

### Intent

Realizar o tratamento de nós folhas e composições de forma semelhante, como se cada um deles fosse um objeto individualizado.

### Motivation

O padrão de projeto Composite possui como pressuposto organizar objetos em modelo árvore, partindo de um eixo principal e acoplando outros objetos semelhantes.

### Applicability

Este padrão é como uma hierarquia, sendo que o eixo principal é algo mais complexo e partindo dele, temos outros objetos que podem ser tão complexos quanto o principal ou objetos de complexidades menores (composite e leaf). 

A partir de composites (objeto complexo), temos outros objetos que podem ser outros composites ou leafs. A leaf (folha) não pode abrigar componentes dentro, pois são estruturas mais simples, portanto, quando temos uma folha, significa que não existem mais camadas. 

Para uma melhor compreensão, temos o seguinte exemplo:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Composite/imagem.jpg)

No sistema acima, temos as pastas e arquivos. As pastas podem conter arquivos e também podem conter outras pastas. Porém, quando chegamos ao nível de arquivos, não existe a possibilidade de incluir mais pastas ou arquivos, portando, finaliza-se a profundidade deste “ramo”. Este padrão propõe tornar todos os objetos semelhantes, de modo a facilitar a obtenção de dados entre o que está na “base” da árvore e o que está nas folhas.

### Structure

A estrutura do padrão Composite é a seguinte:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Composite/Structure.png)

### Participants

Component: é a estrutura que aloca os componentes comuns entre elementos complexos e elementos mais simples. É o local de declaração da interface de acesso e gerenciamento dos componentes filhos.

Leaf: é o componente que não possui sub-elementos, ou seja, não tem filhos. É nesta classe que são definidos os comportamentos da estrutura mais básica do sistema.

Client: classe que manipulará os outros componentes.

Composite: elemento que possui filhos, que delegará funções para os mesmos.

### Sample Code

Exemplo tratado em aula de arquivos e pastas: [Arquivos e Pastas](https://github.com/10Daniele/Padroes_Projeto/tree/master/Composite/Exemplo)

Exemplo de árvore de maçã: [Maçã e Galho](https://github.com/10Daniele/Padroes_Projeto/tree/master/Composite/Exemplo_Maca)

Os exeplos acima demonstram o comportamento do padrão Composite. No exemplo de arquivos e pastas, temos as pastas, que são estruturas mais compostas e os arquivos, que são estruturas mais simples, sendo que a pasta herda características do arquivo. No exemplo da árvore de maçã, o galho é a estrutura composta e a maçã e a estrutura simples. Galho herda características da maçã.

