## Tipos de Proxy

* **Proxy Remoto (Remote Proxy):** Imagine que você precisa acessar um objeto que reside em um servidor diferente. O proxy remoto atua como um representante local desse objeto. Ele recebe suas chamadas e as encaminha para o objeto real no servidor remoto, cuidando de toda a comunicação de rede. Isso esconde a complexidade da comunicação distribuída do cliente.

* **Proxy Virtual (Virtual Proxy):** Sabe quando você tem um objeto pesado que não precisa ser carregado imediatamente? O proxy virtual entra em cena! Ele cria um objeto "placeholder" leve inicialmente. Somente quando você realmente precisa usar o objeto real, o proxy o carrega sob demanda. Isso pode melhorar significativamente o desempenho inicial da sua aplicação. Pense em carregar imagens grandes em uma página web: o proxy virtual pode exibir um espaço reservado até que a imagem seja realmente necessária.

* **Proxy de Proteção (Protection Proxy):** Este tipo de proxy controla o acesso ao objeto real com base em permissões. Ele verifica se o cliente tem os direitos necessários para interagir com o objeto. É como um guarda de segurança que decide quem pode entrar em um determinado local.

* **Proxy Inteligente (Smart Proxy ou Reference Counting Proxy):** Esse proxy adiciona funcionalidades extras quando uma referência ao objeto real é feita. Um exemplo comum é a contagem de referências. O proxy pode rastrear quantos objetos estão referenciando o objeto real e desalocá-lo da memória quando não houver mais referências. Outra aplicação seria adicionar um comportamento de "lock" antes de acessar o objeto para garantir o acesso exclusivo.
