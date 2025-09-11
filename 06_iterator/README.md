
**Iterator**

Algumas linguagens de programação permitem que classes e objetos containers, ou seja, objetos que agrupam outros objetos, possam ser iteradosatravés do foreach sem a necessidade  de   expor   a   estrutura   interna,   seus   índices   e   sua   implementação. Eles   são   Conhecidos   como  objetos iteráveis, ou objetos que disponibilizam um Iterador (Iterator).

**Intenção**

Disponibilizar   os   objetos   agregados   para   consulta   através   de   iteração   sem   revelar   a  estrutura interna ou preocupar­se com ela.

**Motivação**

Por   vezes   temos   objetos   tem   que   agregam   coleções   internas   as   quais   não   queremos  revelar, ou seja, permitir que clientes externos modifiquem ou conheçam a estrutura desta lista.

**Aplicabilidade**

Utilize o padrão Iterator quando sua coleção tiver uma estrutura de dados complexa por debaixo dos panos, mas você quer esconder a complexidade dela de seus clientes (seja por motivos de conveniência ou segurança).

O iterador encapsula os detalhes de se trabalhar com uma estrutura de dados complexa, fornecendo ao cliente vários métodos simples para acessar os elementos da coleção. Embora essa abordagem seja muito conveniente para o cliente, ela também protege a coleção de ações descuidadas ou maliciosas que o cliente poderia fazer se estivesse trabalhando com as coleções diretamente.

<!--
[Slides](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/iterator.pdf)


[Códigos Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/iterator)


[Código Aula](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/CanaisTvCabo)

[Trabalho 6 (Iterator) ](https://github.com/IgorAvilaPereira/ppp2024_2sem/wiki/Trabalhos#trabalho-6)
-->

<!--[Exemplo - Aula](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/Iterator)-->
**Iterator no Java:**

Exemplos de uso: O padrão é muito comum no código Java. Muitos frameworks e bibliotecas o usam para fornecer uma maneira padrão de percorrer suas coleções.

Aqui estão alguns exemplos das principais bibliotecas Java:

Todas as implementações de [java.util.Iterator](http://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html) (também [java.util.Scanner](http://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)).

Todas as implementações de [java.util.Enumeration](http://docs.oracle.com/javase/8/docs/api/java/util/Enumeration.html).

Identificação: O iterador é fácil de reconhecer pelos métodos de navegação (como next, previous e outros). O código cliente que usa iteradores pode não ter acesso direto à coleção que está sendo percorrida.

* https://refactoring.guru/pt-br/design-patterns/iterator/java/example

* https://www.w3schools.com/java/java_iterator.asp

**Material Complementar:**

* https://refactoring.guru/pt-br/design-patterns/iterator

* https://brizeno.wordpress.com/2011/09/15/mao-na-massa-iterator/

* https://www.devmedia.com.br/padrao-de-projeto-iterator-em-java-conceitos-funcionamento-e-aplicacao-pratica/28748#:~:text=O%20padr%C3%A3o%20Iterator%20permite%20o,a%20responsabilidade%20onde%20deveria%20estar.


<br><br>[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/ppp2025_2sem/tree/main/06_iterator) <br><br>
&nbsp;
