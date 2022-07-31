
# Clínica Veterínaria - Desafio API

Este é o projeto de uma API que contém os CRUDs de médicos veterinários, clientes, pets e o registro de antendimentos.

## Como rodar o projeto
Baixe o projeto, entre no arquivo application prorpeties e mude as configurações de acordo com seu banco de dados. Em seguida, rode o projeto. Abra o navegador em `http://localhost:8080/swagger-ui.html`. Então role até achar a seção "ppopular-banco-controller" e execute o método POST. Assim o banco de dados será populado.
## Configurações de Segurança
Para realizar todas as requisições, tirando de popular o banco de dados, é necessário fazer LOGIN. Lembre-se: só será possível ralizar o login depois de popular o banco. Uma vez que o banco for populado, você pode fazer outra requisição. Ao tentar executá-la, um pop-up vai aparecer na tela pedido usuário e senha. Coloqe `aaa@gft.com` no campo "usuário" e `1111` no campo "senha." Uma vez que o LOGIN for feito, você poderá usar todas as requisições caso o navegador guarde seu status de logado ou pode ser qee tenha que fazer o login novamente. É importante mencionar que sempre que um novo veterinário for cadastrado, seu email será
 seu nome de usúario e seu registro será sua senha. Então ele também poderá fazer login e está apto a fazer requisições

## Documentação da API


Todos os endpoints e quais são seus parâmetros também podem ser acessados no link `http://localhost:8080/swagger-ui.html`. Aqui está uma descrição deles:
#### Em veterinario-controller

| Requisição   | parâmetros       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `GET` | sem parâmetros | Retorna todos os veterinários. |
| `GET` | `id` | Retorna o veterinario correspondente ao id informado. |
| `POST` | Objeto em Json (descrito na próxima seção) | Salva o veterinário informado.
| `PUT` | `id` e Objeto em Json (descrito na próxima seção) |  Atualiza o veterinário correspondente ao id informado. |
| `Delete` | `id` |  Exclui o veterinário da lista, mas ainda estará presente nos registros |

#### Em cliente-controller

| Requisição   | parâmetros       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `GET` | sem parâmetros | Retorna todos os clientes. |
| `GET` | `id` | Retorna o cliente correspondente ao id informado. |
| `POST` | Objeto em Json (descrito na próxima seção) | Salva o cliente informado.
| `PUT` | `id` e Objeto em Json (descrito na próxima seção) |  Atualiza o cliente correspondente ao id informado. |
| `Delete` | `id` |  Exclui o cliente da lista, mas ainda estará presente nos registros |

#### Em cachorro-controller

| Requisição   | parâmetros       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `GET` | sem parâmetros | Retorna todos os cachorros. |
| `GET` | `id` | Retorna o cachorro correspondente ao id informado. |
| `POST` | Objeto em Json (descrito na próxima seção) | Salva o cachorro informado.
| `PUT` | `id` e Objeto em Json (descrito na próxima seção) |  Atualiza o cachorro correspondente ao id informado. |
| `Delete` | `id` |  Exclui o cachorro da lista, mas ainda estará presente nos registros |

#### Em atendimento-controller

| Requisição   | parâmetros       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `GET` | sem parâmetros | Retorna todos os atendimentos. |
| `POST` | Objeto em Json (descrito na próxima seção) | Salva o atendimento informado.









# Corpo dos Objetos Json

### Para Veterinário 
```http
{
  "nome": "string",
  "registro": "string",
  "email": "string",
  "telefone": "string"
}
```

### Para Cliente
```http
{
  "nome": "string",
  "cpf": "string",
  "email": "string",
  "telefone": "string",
  "registroCliente": "string"
}
```
### Para Cachorro
```http
  {
  "nome": "string",
  "raca": "string",
  "carteirinha": "string",
  "tutor": inteiro
}
```

### Para Atendimento
```http

{
  "tutorId": inteiro,
  "cachorroId": inteiro,
  "veterinarioId": inteiro,
  "dados": {
    "peso": "string",
    "altura": "string",
    "idade": "string"
  },
  "comentarios": "string",
  "dataEHora": "dd/MM/yyyy HH:mm"
}

```

# Exceeds 
Adicionei o Swagger. Cada cliente tem sua lista de chachorros e atendimentos.