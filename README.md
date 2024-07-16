# TaskMaster

TaskMaster é uma aplicação Java EE para gerenciamento de tarefas, utilizando JSF, PrimeFaces, JPA/Hibernate, EJB e CDI, implantada no servidor de aplicação WildFly. O projeto também utiliza Docker para facilitar a configuração e execução do ambiente.

## Requisitos

- JDK 8 ou superior
- Maven 3.6 ou superior
- WildFly 21 ou superior
- MySQL 8 ou superior
- Docker (opcional, mas recomendado para execução simplificada)

## Configuração

### 1. Configuração do Banco de Dados

1. Instale o MySQL.
2. Crie um banco de dados chamado `taskmaster`:

```sql
CREATE DATABASE taskmaster;
