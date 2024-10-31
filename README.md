
# Adocão 🐾


<img align="right" width=120 src="https://media.tenor.com/_l_5p1vtSE0AAAAM/chiens-funnyanimals.gif">

<p> <b>Adocão</b> é um backend para gerenciar o cadastro de animais disponíveis para adoção.  A ideia é centralizar informações</p>
<p>básicas sobre os animais, como nome, espécie, raça e sexo, para auxiliar em processos de adoção. </p>

<br><br>

## Funcionalidades ✨

- **Cadastro de Animais**: Registra novos animais no sistema.
- **Consulta de Animais**: Exibe a lista completa de animais cadastrados.



## Tecnologias Utilizadas 🛠️

- **Java 17**
- **Spring Boot 3.3.5**
- **Spring Data JPA**: Para integração com o banco de dados.
- **Lombok**: Simplificação do código Java com anotações.
- **Bean Validation**: Para validação de dados.
- **PostgreSQL Driver**: Conexão com banco de dados PostgreSQL.



## Estrutura de Dados 📋

Cada animal possui os seguintes atributos:

- **ID**: Identificador único do animal
- **Nome**: Nome do animal
- **Espécie**: Tipo (ex.: cão, gato)
- **Raça**: Raça do animal
- **Sexo**: Sexo do animal



## Endpoints 🌐

| Método | Endpoint    | Descrição                               |
|--------|-------------|-----------------------------------------|
| GET    | `/animals`  | Retorna a lista de todos os animais    |
| POST   | `/animals`  | Cadastra um novo animal                |



## Exemplo de Requisição 🐶

### Criar um novo animal (POST `/animais`)

```json
{
    "nome": "Bobby",
    "especie": "Cão",
    "raca": "Labrador",
    "sexo": "Macho"
}
```

### Retornar todos os animais (GET `/animais`)

Retorna a lista com todos os animais cadastrados.
