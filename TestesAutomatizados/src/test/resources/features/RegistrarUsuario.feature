#language: pt
#enconding: UTF-8

Funcionalidade: registrar 

@registrarUsuario
Cenario: Registrar
Quando eu clicar no botao Registrar
E informar email "teste@gmail.com"
E informar nome "Tester"
E informar senha "Tester123"
E confirmar a senha "Tester123"
E clicar no botao cadastrar
E clicar no botao fechar

@login
Cenario: Logar
Quando digitar email "teste@gmail.com"
E digitar senha "Tester123"
E clicar no botao Acessar
Entao o sistema exibe o usuario logado
