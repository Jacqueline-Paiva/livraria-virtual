# 📚 Livraria Virtual

Projeto simples de Livraria Virtual desenvolvido com:
- Java 17
- Spring Boot 3.1.5
- Jakarta EE (CDI + JSF)
- PrimeFaces
- Banco de dados H2 (arquivo local)
- Maven

---

## ✨ Funcionalidades

- ✅ Cadastrar novos livros
- ✅ Editar livros cadastrados
- ✅ Excluir livros
- ✅ Listar livros na Home
- ✅ Botão de navegação para Home
- ✅ Preço de livros com duas casas decimais (ex: 39,90)


```text
livraria/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/livraria/
│   │   │       ├── controller/
│   │   │       │   └── LivroController.java
│   │   │       ├── model/
│   │   │       │   └── Livro.java
│   │   │       ├── repository/
│   │   │       │   └── LivroRepository.java
│   │   │       ├── service/
│   │   │       │   └── LivroService.java
│   │   │       └── LivrariaApplication.java
│   │   └── resources/
│   │       ├── META-INF/resources/
│   │       ├── cadastro-livro.xhtml
│   │       ├── livros.xhtml
│   │       ├── application.properties
│   │       ├── web.xml
│   │       └── webapp/
│   │           └── WEB-INF/
│   │               └── beans.xml
├── pom.xml
```


## 🚀 Como rodar o projeto localmente

1. **Clone o repositório:**

```bash
git clone https://github.com/Jacqueline-Paiva/livraria-virtual


# Instale as dependências
mvn clean install

# Execute o projeto
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081

Abra no navegador:
👉 http://localhost:8081/livros.xhtml

💾 Acesso ao banco H2
URL: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:file:./data/livraria-db

📋 Baseline Final
Versão: v1.0.0
Status: Finalizada e Funcional
Descrição:
Aplicação de cadastro de livros funcional com JSF, PrimeFaces e Spring Boot, permitindo cadastro, edição, exclusão e navegação entre páginas, utilizando banco de dados H2 em arquivo local.

👩‍💻 Autor
Jacqueline — Projeto desenvolvido como parte de estudos de Spring Boot + JSF.

📄 Licença
Projeto de demonstração. Uso livre para fins didáticos.

