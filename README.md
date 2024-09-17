# Conversor de Moedas

Este projeto é um conversor de moedas desenvolvido em Java, que utiliza a API do ExchangeRate para obter taxas de câmbio atualizadas. O programa permite ao usuário escolher entre várias opções de conversão de moedas e exibe o valor convertido de forma clara e formatada.

## Funcionalidades

- **Menu Interativo**: O usuário pode escolher entre seis opções de conversão de moedas.
- **Conversões Disponíveis**:
  - Real Brasileiro (BRL) para Dólar (USD)
  - Dólar (USD) para Real Brasileiro (BRL)
  - Euro (EUR) para Real Brasileiro (BRL)
  - Real Brasileiro (BRL) para Euro (EUR)
  - Libra Esterlina (GBP) para Real Brasileiro (BRL)
  - Real Brasileiro (BRL) para Libra Esterlina (GBP)
- **Tratamento de Exceções**: O programa lida com entradas inválidas e erros de conexão com a API.
- **Saída Formatada**: O valor convertido é exibido dentro de uma "caixinha" de asteriscos para melhor visualização.

## Tecnologias Utilizadas

- **Linguagem**: Java
- **API**: ExchangeRate
- **Biblioteca**: Gson para manipulação de JSON

## Como Utilizar

1. Clone o repositório:
    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    ```

2. Navegue até o diretório do projeto:
    ```bash
    cd seu-repositorio
    ```

3. Compile o projeto:
    ```bash
    javac -cp gson-2.8.6.jar:. Main.java CurrencyConverter.java SpecificConverter.java CurrencyConverterFactory.java ExchangeRateService.java ExchangeRateResponse.java
    ```

4. Execute o projeto:
    ```bash
    java -cp gson-2.8.6.jar:. Main
    ```

## Exemplo de Uso

Ao executar o programa, o usuário verá o seguinte menu:

Escolha a opção que deseja converter:

1 - Real Brasileiro para Dólar 2 - Dólar para Real Brasileiro 3 - Euro para Real Brasileiro 4 - Real Brasileiro para Euro 5 - Libra Esterlina para Real Brasileiro 6 - Real Brasileiro para Libra Esterlina 7 - Sair

Digite a opção desejada:
Após escolher uma opção e inserir o valor a ser convertido, o programa exibirá a saída formatada, por exemplo:

Valor digitado: 100.00 [BRL] correspondente ao valor de 20.00 [USD] *

## Estrutura do Projeto

- **Program.java**: Classe principal que exibe o menu e gerencia a interação com o usuário.
- **CurrencyConverter.java**: Classe abstrata base para conversão de moedas.
- **CurrencyConverterFactory.java**: Fábrica para criar instâncias de conversores específicos.
- **ExchangeRateService.java**: Classe responsável por fazer a chamada à API do ExchangeRate.
- **ExchangeRateResponse.java**: Classe para mapear a resposta da API.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

