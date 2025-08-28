Ex:

* Controle de Automação Residencial

* Controle de Rotas para Ambiente Web

<!--
[Códigos Aula](https://github.com/IgorAvilaPereira/ppp2024_2sem/tree/main/codigos/Command)

**Códigos:**

[Controle](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/controle_command)

[Framework Web](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/spark_command/spark_command)

[Código - Vídeos](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command)

[Código Aula](https://github.com/IgorAvilaPereira/ppp2023_1sem/tree/main/codigos/ControleUniversal)

[Código 1 - Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command260923)

[Código 2 - Aula](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command260923_2)
-->


O padrão de projeto Command possui várias características que o tornam uma escolha valiosa em muitos cenários de desenvolvimento de software:

* **Desacoplamento:** Separa o objeto que solicita a ação (invoker) do objeto que realiza a ação (receiver), promovendo um design mais modular e flexível.
* **Extensibilidade:** Facilita a adição de novos comandos sem alterar o código existente, seguindo o princípio aberto/fechado (Open/Closed Principle).
* **Reversibilidade:** Permite implementar facilmente operações de desfazer (undo) e refazer (redo), armazenando o histórico de comandos executados.
* **Composição:** Comandos podem ser compostos em comandos mais complexos, permitindo a criação de macros ou sequências de operações.
* **Registro e Log:** Facilita o registro e a auditoria de operações, já que cada comando pode ser registrado com detalhes específicos sobre a ação realizada.
* **Flexibilidade:** Permite parametrizar objetos com diferentes solicitações, tornando o sistema mais adaptável a mudanças.


Embora o padrão de projeto Command tenha muitas vantagens, ele também apresenta algumas características negativas que devem ser consideradas:

* **Complexidade Adicional:** A implementação do padrão Command pode adicionar complexidade ao código, especialmente em sistemas simples onde o padrão pode ser desnecessário.
* **Sobrecarga de Objetos:** Pode resultar em um grande número de classes e objetos, já que cada comando geralmente requer sua própria classe concreta.
* **Manutenção:** Com o aumento do número de comandos, a manutenção do código pode se tornar mais difícil, exigindo mais esforço para gerenciar e atualizar os comandos.
* **Desempenho:** Em sistemas com muitos comandos, o armazenamento e a execução de comandos podem impactar o desempenho, especialmente se houver necessidade de registrar ou desfazer muitas operações.
* **Overhead de Memória:** O armazenamento de estados para permitir operações de desfazer (undo) pode consumir uma quantidade significativa de memória, dependendo da complexidade das operações e da frequência com que são realizadas.

Essas desvantagens não anulam os benefícios do padrão Command, mas é importante considerá-las ao decidir se este padrão é adequado para o seu projeto específico.


* [Vídeo Aula Completa (Opção 2)](https://youtu.be/ze1xocE67gE)


**Vídeos - Command:**

* [Playlist](https://youtube.com/playlist?list=PLvT8P1q6jMWfpG66pRqDaeRYncXzP7BEK)

* [Teoria](https://youtu.be/-vtUkJbzbf4)

* [Prática](https://youtu.be/NKWNPbzFO8k)

* [Trabalho](https://youtu.be/bKhafM8rieI)

<!--* [Código Vídeos](https://github.com/IgorAvilaPereira/ppp2024_1sem/tree/main/codigos/Command)

**Material Complementar - Encontro Síncrono - Command - 04/11/21:**

* [Vídeo](https://youtu.be/_BKMkDZkt_g)

* [Código](https://github.com/IgorAvilaPereira/aps2022_1sem/tree/main/codigos/encontro-sincrono-0411211)
-->


**Material Complementar:**

* https://medium.com/xp-inc/design-patterns-parte-16-command-9c73af726c9c
* https://fjp.at/design-patterns/command
* https://www.codeprimers.com/command-design-pattern/





[Baixar todo o material da aula](https://download-directory.github.io/?url=http://github.com/IgorAvilaPereira/ppp2025_1sem/tree/main/./04_command)
