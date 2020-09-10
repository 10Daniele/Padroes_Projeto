# Padrão Composite

     O padrão de projeto Composite possui como pressuposto organizar objetos em modelo árvore, partindo de um eixo principal e acoplando outros objetos semelhantes. É como uma hierarquia, sendo que o eixo principal é algo mais complexo e partindo dele, temos outros objetos que podem ser tão complexos quanto o principal ou objetos de complexidades menores (composite e leaf). 
     A partir de composites (objeto complexo), temos outros objetos que podem ser outros composites ou leafs. A leaf (folha) não pode abrigar componentes dentro, pois são estruturas mais simples, portanto, quando temos uma folha, significa que não existem mais camadas. 
     Para uma melhor compreensão, temos o seguinte exemplo:

