# Padrão Composite

### Pattern Name and Classification

Pattern Name: Composite

Classification: Padrão estrutural

### Intent

### Motivation

### Applicability

O padrão de projeto Composite possui como pressuposto organizar objetos em modelo árvore, partindo de um eixo principal e acoplando outros objetos semelhantes. É como uma hierarquia, sendo que o eixo principal é algo mais complexo e partindo dele, temos outros objetos que podem ser tão complexos quanto o principal ou objetos de complexidades menores (composite e leaf). 

A partir de composites (objeto complexo), temos outros objetos que podem ser outros composites ou leafs. A leaf (folha) não pode abrigar componentes dentro, pois são estruturas mais simples, portanto, quando temos uma folha, significa que não existem mais camadas. 

Para uma melhor compreensão, temos o seguinte exemplo:

![imagem](https://github.com/10Daniele/Padroes_Projeto/blob/master/Composite/imagem.jpg)

No sistema acima, temos as pastas e arquivos. As pastas podem conter arquivos e também podem conter outras pastas. Porém, quando chegamos ao nível de arquivos, não existe a possibilidade de incluir mais pastas ou arquivos, portando, finaliza-se a profundidade deste “ramo”. Este padrão propõe tornar todos os objetos semelhantes, de modo a facilitar a obtenção de dados entre o que está na “base” da árvore e o que está nas folhas.

### Structure



### Participants

Component:

Leaf:

Client:

Composite:

### Sample Code

Exemplo tratado em aula:

Exemplo de criado:

