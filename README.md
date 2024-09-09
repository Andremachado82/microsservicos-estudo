# Curso de Microsserviços
- ministrado pelo @BoualiAli - canal youtube: https://www.youtube.com/@BoualiAli

## **Seção 1** - Introdução
- O que você vai aprender neste curso:
  - Arquitetura de microsserviços
  - Comunicação entre microsserviços
  - Ferramentas e tecnologias como Eureka, Apache Kafka, API Gateway, Spring Cloud, Keycloak, etc.
  - Boas práticas e padrões arquiteturais para microsserviços

## **Seção 2** - Introdução à arquitetura de microsserviços
- **O que são microsserviços?**
  - Explicação sobre a arquitetura de microsserviços, como funciona e sua diferença para monolitos.
  
- **Princípios fundamentais da arquitetura de microsserviços**
  - Modularidade, independência, escalabilidade, e comunicação via APIs.

- **Benefícios da arquitetura de microsserviços**
  - Facilidade de escalabilidade, manutenção, e deploy independente.

- **Padrões de arquitetura de microsserviços**
  - Exemplos de padrões comuns como API Gateway, Event-Driven, etc.

## **Seção 3** - Visão geral da aplicação
- Apresentação do projeto que será desenvolvido ao longo do curso.

## Arquitetura: 

![Captura de tela de 2024-09-09 17-30-02](https://github.com/user-attachments/assets/cc0ea15d-d6b8-4757-a192-a30b2a4f7176)

## Diagrama de classes:

![Captura de tela de 2024-09-09 17-30-15](https://github.com/user-attachments/assets/1ae35819-304e-4a97-86d6-92529cd4700f)

## Classes de domínio:

![Captura de tela de 2024-09-09 17-30-55](https://github.com/user-attachments/assets/71672cbb-3e35-4987-bc68-3b33e03031be)

## **Seção 4** - Inicializando a aplicação
- **Passos**:
  - Criar monorepositório no GitHub.
  - Criar microsserviços: Cliente, Pedido, Pagamento, Notificação.
  - Configurar docker-compose e rodar os containers.

## **Seção 5** - Servidor de configuração
- **Motivo**: Explicar por que usar um servidor de configuração centralizado.
- **Passos**:
  - Criar e configurar o servidor de configuração.
  - Adicionar configuração do microsserviço de Cliente.

## **Seção 6** - Implementar o microsserviço de Cliente
- **Passos**:
  - Ler configurações do servidor de configuração.
  - Criar entidade Cliente, repositório, DTOs, serviço e controlador.

## **Seção 7** - Implementar o microsserviço de Pedido
- Seguir a mesma estrutura da Seção 6, aplicando ao microsserviço de Pedido.

## **Seção 8** - Implementar o microsserviço de Pagamento
- Seguir a mesma estrutura da Seção 6, aplicando ao microsserviço de Pagamento.

## **Seção 9** - Comunicação entre Microsserviços via HTTP
- **Ferramentas**:
  - Usar `RestTemplate` e `OpenFeign` para comunicação entre serviços.
  - Comparar as duas abordagens.
  - Testar a comunicação.

## **Seção 10** - Descoberta de serviços com Eureka
- **Conceitos**:
  - O que é descoberta de serviços e por que é necessária.
- **Passos**:
  - Criar `discovery-service` com Eureka.
  - Atualizar microsserviços para registrar no discovery-service.
  - Rodar e testar a aplicação.

## **Seção 11** - Gateway API
- **Conceitos**: O que é um Gateway e sua importância.
- **Passos**:
  - Criar `api-gateway`, adicionar rotas e testar.
  - Exercícios: Adicionar e externalizar rotas.

## **Seção 12** - Serviço de Notificação e Java Mail
- **Ferramentas**:
  - Configurar MailDev para testes de email.
- **Passos**:
  - Criar serviço de notificação.
  - Consumir topicos do Apache Kafka e enviar emails para pedidos e pagamentos.

## **Seção 13** - Rastreamento distribuído
- **Ferramentas**: Zipkin.
- **Passos**:
  - Configurar Zipkin para rastreamento de requests.

## **Seção 17** - Documentação distribuída
- Expor a documentação dos serviços via API Gateway.
