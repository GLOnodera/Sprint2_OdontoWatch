# Projeto OdontoWatch

## Descrição Geral

O **OdontoWatch** é uma solução tecnológica voltada para a melhoria da experiência dos pacientes e a eficiência das práticas odontológicas. O aplicativo oferece funcionalidades para o registro de consultas, monitoramento de hábitos de higiene bucal e integração com análise preditiva, visando a redução de custos e a sustentabilidade do negócio.

## Funcionalidades

### 1. Agenda de Procedimentos e Visitas ao Dentista
- **Registro de Consultas:** Permite que o paciente registre suas visitas ao dentista, como limpezas, extrações e outros procedimentos. O aplicativo calcula o tempo desde a última consulta e envia notificações lembrando o paciente de agendar um novo check-up após um período determinado (ex: 6 meses).
- **Sugestão de Próximas Visitas:** Com base na análise preditiva, o app sugere uma data ideal para o próximo acompanhamento, considerando o histórico do paciente e o risco de problemas futuros.

### 2. Monitoramento dos Hábitos de Higiene Bucal
- **Registro de Escovação:** Permite que o paciente registre manualmente quando escovou os dentes, mantendo um histórico desses registros.
- **Notificações para Lembrar de Escovar os Dentes:** O app envia lembretes em horários específicos para que o paciente não esqueça de escovar os dentes.
- **Relatórios de Hábitos:** Gera relatórios com gráficos mostrando quantas vezes o paciente escovou os dentes por dia, semana ou mês.

### 3. Integração com Análise Preditiva
- **Prevenção de Problemas:** O app integra um modelo preditivo que avalia o risco de desenvolvimento de cáries e gengivites, sugerindo ações preventivas.
- **Histórico do Paciente:** Fornece ao dentista uma visão completa do histórico de higiene bucal e consultas do paciente.

### 4. Funcionalidades Adicionais
- **Personalização:** O paciente pode personalizar o app para receber lembretes em horários específicos.
- **Educação Bucal:** O app oferece dicas sobre saúde bucal, como técnicas de escovação e a importância do uso do fio dental.
- **Integração com Wearables:** Integra-se com dispositivos como smartwatches para enviar notificações e monitorar comportamentos.

## Integrantes do Projeto

- [Gabriel Leal Onodera RM553779](#)
- [Atila Rebolo Moita da Costa RM552650](#)
- [Gabriel Artacho Plasa Moreira RM553527](#)

## Projeto Java

### 1. Descrição

Este projeto é uma aplicação Java desenvolvida com Spring Boot, que visa gerenciar consultas odontológicas e monitorar hábitos de higiene bucal. A aplicação utiliza conceitos de Programação Orientada a Objetos (POO) e JPA para persistência de dados em um banco de dados relacional (Oracle).

### 2. Funcionalidades

- **Registro de Consultas:** Permite ao paciente registrar suas visitas ao dentista.
- **Listagem de Consultas:** O paciente pode listar todas as suas consultas registradas.
- **Notificações:** O app pode enviar notificações ao paciente com base em suas visitas e hábitos de higiene.

## 3. Instruções de Como Rodar a Aplicação

### 3.1 Pré-requisitos

- Java 17+
- Maven 3.6+
- Banco de Dados Oracle ou outro SGBD relacional configurado

### 3.2 Passos para Executar

**Clone o Repositório**
```bash
git clone https://github.com/GLOnodera/Sprint2_OdontoWatch.git
cd Sprint2_OdontoWatch
```
### 3.3 Configure o Banco de Dados

No arquivo `src/main/resources/application.properties`, configure as credenciais do banco de dados Oracle:

```properties
spring.datasource.url=jdbc:oracle:thin:@SEU_HOST:1521:SEU_DSN
spring.datasource.username=SEU_USERNAME
spring.datasource.password=SUA_SENHA
spring.jpa.hibernate.ddl-auto=update
```
### 3.4 Execute a Aplicação
Para rodar a aplicação, utilize o Maven:
```bash
mvn spring-boot:run
```
### 3.5 Listagem de Endpoints
3.5.1 GET /consultas
Retorna a lista de todas as consultas registradas.

3.5.2 POST /consultas
Cria uma nova consulta.

3.5.3 GET /consultas/{id}
Retorna uma consulta específica pelo ID.

3.5.4 PUT /consultas/{id}
Atualiza os dados de uma consulta específica.

3.5.5 DELETE /consultas/{id}
Remove uma consulta específica pelo ID.

3.5.6 GET /higiene-bucal
Retorna o histórico de hábitos de higiene bucal registrados.

3.5.7 POST /higiene-bucal
Registra uma nova atividade de higiene bucal (escovação, fio dental, etc.).

3.5.8 GET /notificacoes
Retorna as notificações de lembretes configurados para o paciente.

3.5.9 POST /notificacoes
Configura uma nova notificação de lembrete de escovação ou consulta odontológica.
