# 🎬 ScreenMatch

Uma aplicação Java desenvolvida para consultar informações de filmes e séries utilizando a API pública da **OMDb**.

O projeto foi desenvolvido durante meus estudos de Java, com foco em Programação Orientada a Objetos, consumo de APIs REST, manipulação de JSON e organização de código em camadas.

---

## 📸 Demonstração

### Menu da aplicação

> Adicione aqui um print da tela inicial.

### Busca de um título

> Adicione aqui um print mostrando uma busca.

### Exportação para JSON

> Adicione aqui um print mostrando o arquivo gerado.

### Vídeo

Você também pode adicionar um GIF da aplicação ou anexar um vídeo no repositório.

---

## ✨ Funcionalidades

- 🔎 Buscar filmes e séries pelo título
- 🌐 Consumir dados da API OMDb
- 📄 Converter respostas JSON para objetos Java utilizando Gson
- 📋 Listar os títulos pesquisados durante a execução
- 💾 Exportar os resultados para um arquivo JSON
- ⚠️ Tratamento de exceções para erros de comunicação e dados inválidos
- ⚙️ Validação da configuração da API antes da execução

---

## 🏛 Arquitetura

O projeto foi organizado em camadas para facilitar manutenção e reutilização do código.

```text
src
└── br.com.alura.screenmatch
    │
    ├── app
    │   ├── Principal.java
    │   ├── Aplicacao.java
    │   └── Menu.java
    │
    ├── client
    │   └── OmdbClient.java
    │
    ├── config
    │   └── ApiConfig.java
    │
    ├── dto
    │
    ├── exception
    │
    ├── mapper
    │
    ├── model
    │
    ├── service
    │
    └── util
```

---

## 🛠 Tecnologias utilizadas

- Java 21
- Gson 2.14.0
- Java HttpClient
- API REST
- IntelliJ IDEA
- Git
- GitHub

---

## 📦 Dependências

A biblioteca Gson está disponível na pasta:

```text
libs/gson-2.14.0.jar
```

Caso sua IDE não reconheça automaticamente a biblioteca, basta adicioná-la ao classpath do projeto.

---

## 🔑 Configuração

Este projeto utiliza a API pública da **OMDb**.

1. Solicite gratuitamente uma chave:

https://www.omdbapi.com/apikey.aspx

2. Abra o arquivo:

```text
src/br/com/alura/screenmatch/config/ApiConfig.java
```

3. Substitua:

```java
public static final String API_KEY = "SUA_CHAVE_DA_API";
```

pela sua chave.

---

## ▶️ Executando

Execute a classe:

```text
Principal.java
```

Será exibido o menu:

```text
===============================
      ScreenMatch
===============================

1 - Buscar título
2 - Listar títulos pesquisados
3 - Salvar em JSON
0 - Sair
```

---

## 📚 Conceitos aplicados

Durante o desenvolvimento foram utilizados conceitos como:

- Programação Orientada a Objetos
- Encapsulamento
- Collections
- Consumo de APIs REST
- DTO
- Mapper
- Separação de responsabilidades
- Tratamento de exceções
- Manipulação de JSON
- Organização em camadas

---

## 🚀 Próximas melhorias

- Persistência em banco de dados
- Testes unitários
- Maven
- Interface gráfica
- Histórico permanente de pesquisas
- Busca por gênero e diretor

---

## 👨‍💻 Autor

**Áquila Oliveira**

Estudante de Análise e Desenvolvimento de Sistemas (IFSP)

- LinkedIn: https://www.linkedin.com/in/aquila-oliveira
- GitHub: https://github.com/SEU_USUARIO
