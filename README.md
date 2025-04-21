# 📚 Livraria Virtual - Spring Boot + JSF + PrimeFaces

Sistema de gestão de livros desenvolvido com Spring Boot e JSF (PrimeFaces), com banco de dados H2 e interface web simples e funcional. Projeto desenvolvido para fins didáticos e demonstração de baseline em aplicações Java Web.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot 3.1.5
- Spring Data JPA
- JSF (Jakarta Faces)
- PrimeFaces
- H2 Database
- Maven
- Tomcat (via Spring Boot embutido)

---

## 🧩 Funcionalidades

- Cadastro de livros com título, autor e preço
- Listagem de livros cadastrados
- Edição e exclusão de livros
- Navegação entre páginas com JSF
- Interface reativa com PrimeFaces
- Banco H2 persistente em arquivo

## 🛠️ Como Executar

```bash
# Clone o repositório
git clone https://github.com/Jacqueline-Paiva/livraria-virtual
cd livraria-virtual

# Instale as dependências
mvn clean install

# Execute o projeto
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8081

Abra no navegador:
👉 http://localhost:8081/livros.xhtml

💾 Acesso ao banco H2
URL: http://localhost:8081/h2-console

JDBC URL: jdbc:h2:file:./data/livraria-db

📄 Licença
Projeto de demonstração. Uso livre para fins didáticos.

