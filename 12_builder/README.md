<!--
[Slides](https://github.com/IgorAvilaPereira/ppp2024_2sem/raw/main/slides/builder.pdf)

[Códigos](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/Builder)
-->

* Builder1: Classe Builder Interna

* Builder2: Classe Builder Externa

* Builder3: Classe Builder Gerada por Loombok

* Builder4: Classe Builder Gerada por Immutables

<!--https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/builder-->

<!--
**Exemplos:**

[Builder - Na Mão](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder)

[Builder - com uso da IDE](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder2)

[Builder - Loombok (adição de código no código compilado .class)](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder3)

[Builder - Immutables (gerando código)](https://github.com/IgorAvilaPereira/ppp2023_2sem/tree/main/codigos/PizzaBuilder4)

[Código - Interno, Externo, Immutables](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/builder1)

[Código - Lombok](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/builder2)

[Exemplo - Builder interno](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_0)

[Exemplo - Builder externo](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_1)

[Exemplo - Builder gerado pelo Netbeans](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_3)

[Exemplo - Builder com Annotations](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/AulaBuilder081122_4)

* **obs:** @Builder.Construtor (no construtor)

[Exemplo - Projeto JAVA/JDBC com Maven](https://github.com/IgorAvilaPereira/ppp2022_2sem/tree/main/codigos/projetojdbc_maven)

* **obs:** não precisa instalar nada. Somente executar e configurar parâmetros de conexão no projeto.


[Trabalho 9 - Builder](https://github.com/IgorAvilaPereira/ppp2024_2sem/wiki/Trabalhos)
-->

**Vídeos - Padrão Builder:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWdB86pCAuABYqMpIUef2cHx)

* [Teoria](https://youtu.be/vTWUZeibG7Y)

* [Prática](https://youtu.be/GTwGikvZcps)

<!--
* [Código](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/Builder)
-->

* **annotations** https://mvnrepository.com/artifact/org.immutables/builder/2.9.2
* **annotations** https://mvnrepository.com/artifact/org.immutables/value/2.9.2

```xml
<dependencies>

<!-- https://mvnrepository.com/artifact/org.immutables/builder -->
<dependency>
    <groupId>org.immutables</groupId>
    <artifactId>builder</artifactId>
    <version>2.10.0-rc0</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.immutables/value -->
<dependency>
    <groupId>org.immutables</groupId>
    <artifactId>value</artifactId>
    <version>2.10.0-rc0</version>
    <scope>provided</scope>
</dependency>

</dependencies>

```

* **compilação** https://projectlombok.org/features/Builder

**Material Complementar:**

* [Vídeo](https://www.youtube.com/watch?v=l-ouMkReapo&ab_channel=Prof.ManoelCampos)
* [Código do Vídeo](https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/04-builder)
* [Teoria](https://github.com/manoelcampos/padroes-projetos/tree/master/criacionais/04-builder)
* https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
* https://www.linkedin.com/pulse/conhe%C3%A7a-o-padr%C3%A3o-de-projeto-builder-matheus-pieropan-nvvof/?trackingId=7SSjaUrXvRxDAOqV7LlQtw%3D%3D
* https://mballem.com/post/simplificando-com-builder-pattern/
* https://precisoestudarsempre.blogspot.com/2015/08/virando-um-pedreiro-de-software-padrao.html

&nbsp;
[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/ppp2025_2sem/tree/main/./12_builder)
