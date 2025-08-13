# Strategy - Exemplos

## Rotas em Aplicativos de Navegação

Contexto: Aplicativos de GPS permitem diferentes estratégias de roteamento (mais rápido, mais curto, evitar pedágios).

Strategy Interface: RoteamentoStrategy

Implementações:

* RotaMaisRapida

* RotaMaisCurta

* RotaSemPedagios

Uso: O usuário escolhe a preferência e o app aplica a estratégia correspondente.

## Chatbots com Respostas Variáveis

Contexto: Um chatbot pode mudar o tom da conversa (formal, descontraído, técnico) dependendo do público.

Strategy Interface: RespostaStrategy

Implementações:

* RespostaFormal

* RespostaInformal

* RespostaTecnica

Uso: O bot escolhe o tipo de resposta com base no contexto ou perfil do usuário.

## Validação de Dados

Contexto: Validações diferentes para tipos de entrada (CPF, CNPJ, E-mail, Telefone).

Strategy Interface: ValidadorStrategy

Implementações:

* ValidadorCPF

* ValidadorCNPJ

* ValidadorEmail

Uso: Sistema escolhe o validador com base no tipo de dado.


## Tocadores de Mídia com Diferentes Codecs

Contexto: Um reprodutor de mídia pode usar diferentes estratégias para decodificar áudio ou vídeo.

Strategy Interface: CodecStrategy

Implementações:

* MP3Codec

* AACCodec

* FLACCodec

Uso: O player usa a estratégia de codec certa para o formato do arquivo.


## Temas de Interface (UI) em Aplicações

Contexto: Diferentes temas aplicáveis a uma interface (claro, escuro, alto contraste).

Strategy Interface: TemaUI

Implementações:

* TemaClaro

* TemaEscuro

* TemaAltoContraste

Uso: A aplicação muda dinamicamente o tema conforme a preferência do usuário.


## Sistemas de Monitoramento e Alertas

Contexto: Estratégias diferentes de notificação (e-mail, SMS, push).

Strategy Interface: AlertaStrategy

Implementações:

* AlertaEmail

* AlertaSMS

* AlertaPushNotification

* Uso: O sistema aplica a estratégia conforme o tipo de evento ou gravidade.

## Correção Automática de Provas

Contexto: Correção pode ser feita por critérios diferentes (múltipla escolha, discursiva, redação com rubricas).

Strategy Interface: CorrecaoStrategy

Implementações:

CorrecaoMultiplaEscolha

CorrecaoDiscursiva

CorrecaoRedacao

Uso: A plataforma educacional escolhe a estratégia com base no tipo de avaliação.


## Regras de Negócio Variáveis por País ou Região

Contexto: Um sistema global precisa adaptar regras de negócio (faturamento, contratos, impostos).

Strategy Interface: RegraNegocioStrategy

Implementações:

* RegraBrasil

* RegraEUA

* RegraEuropa

Uso: Aplicação escolhe a regra com base na localização do cliente ou operação.


## Filtros de Spam em Sistemas de E-mail

Contexto: Diferentes estratégias de detecção de spam (palavras-chave, listas negras, machine learning).

Strategy Interface: FiltroSpamStrategy

Implementações:

* FiltroPalavrasChave

* FiltroBlacklist

* FiltroML

Uso: O servidor pode alternar a estratégia conforme o tipo de ameaça ou carga.

## Sistemas de Recomendação

Contexto: Plataformas (como e-commerce ou streaming) usam diferentes estratégias para recomendar conteúdo.

Strategy Interface: RecomendacaoStrategy

Implementações:

* RecomendacaoBaseadaEmUsuario

* RecomendacaoBaseadaEmItem

* RecomendacaoHibrida

Uso: Estratégia muda com base no histórico do usuário ou disponibilidade de dados.
