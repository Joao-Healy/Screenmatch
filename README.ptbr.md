# Screenmatch

Aplicação Java de console que busca filmes e séries por título usando a [API do OMDb](https://www.omdbapi.com/), converte a resposta JSON em objetos Java e salva os resultados das buscas em um arquivo.

## Funcionalidades

- Busca qualquer título de forma interativa; digite `sair` para encerrar
- Obtém dados de filmes/séries da API do OMDb usando `HttpClient`
- Converte JSON em objetos Java com Gson
- Modela os títulos com classes OOP (`Titulo`, `TituloOmdb`)
- Salva todos os títulos buscados em `filmes.json`
- Codifica o texto da busca na URL, então títulos com espaços, acentos e caracteres especiais funcionam (ex.: "Star Wars", "Amélie")
- Trata entradas inválidas e erros de conversão sem travar o programa

## Tecnologias

Java 23 · Gson · Java `HttpClient` · IntelliJ IDEA · Git/GitHub

## Como executar

1. Clone o repositório: `git clone https://github.com/Joao-Healy/Screenmatch.git`
2. Obtenha uma chave de API gratuita em https://www.omdbapi.com/apikey.aspx
3. Defina a chave como uma variável de ambiente chamada `API_KEY` (no IntelliJ: Run > Edit Configurations > Environment variables > `API_KEY=sua_chave`)
4. Execute `PrincipalBusca` e digite um título para buscar

A chave é lida da variável de ambiente e nunca fica armazenada no código.

## O que aprendi

- Modelagem de classes com OOP e records do Java
- Consumo de uma API REST com `HttpClient` e conversão de JSON com Gson
- Gravação de resultados em arquivo
- Depuração: corrigi um erro em títulos com espaços codificando a entrada com `URLEncoder`
- Manter segredos fora do controle de versão (variáveis de ambiente + `.gitignore`)