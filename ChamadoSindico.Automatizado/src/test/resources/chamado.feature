#Author: jose.penteado15@gmail.com

Feature: Abrir chamado como sindico com sucesso
Eu como usuario quero abrir chamado para ter um atendimento



  Scenario: Abrir chamado com sucesso
 Given que esteja na home "https://www.mrv.com.br/"
 And clico em clientes
And clico em Abra aqui seu chamado
And clico em Sou Síndico
And seleciono as informações
When clico em avançar
And preecho todas as informações
And clico em avançar
Then Site abre chamado.
 