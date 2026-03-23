# Aprendendo Spring Framework

Repositório que sera atualizado conforme vou aprendendo a utilizar o Spring
## End Points

#### Hello World

```http
  GET /message/hello
```

#### Mensagem customizada

```http
  GET /message/custom/{message}
```

### Sistema de Chamados

#### Abrir chamado

```http
  Post /api/chamado
```
```json
{
  "title" : "titulo",
  "descricao" : "descrição"
}
```
#### Buscar todos chamados

```http
  Get /api/chamado
```
#### Buscar chamados por id

```http
  Get /api/chamado/{id}
```
#### Deletar chamado

```http
  Delete /api/chamado/{id}
```
#### Atualizar chamado

```http
  Patch /api/chamado/{id}
```