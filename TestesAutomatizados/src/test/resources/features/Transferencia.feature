#language: pt
#enconding: UTF-8

Funcionalidade: Transferencia

@transferencia
Cenario: Transferencias
Quando clicar no botao transferencia
Entao a tela de transferencia sera exibida
Quando informar o numero da conta "123"
E informar o digito da conta "123"
E informar o valor da trasnferencia "100"
E informar a descricao "teste de transferencia"
E clicar no botao transferir agora 
Entao o sistema exibe mensagem de erro
E clico no botao para fechar mensagem
E clicar no botao voltar
Entao o sistema exibe a tela principal

@pagamentos
Cenario: verificar pagamentos
Quando eu clicar no botao pagamentos
Entao o sistema exibe mensagem de funcionalidade em desenvolvimento
E clicar no botao fechar
Entao o sistema exibe o menu principal

@extrato
Cenario: verificar extrato da conta
Quando eu clicar no botao extrato
Entao o extrato sera exibido para o usuario
Quando eu clicar no botao voltar
Entao a tela principal sera exibida

@saque
Cenario: realizar saque
Quando clicar no botao saque
Entao o sistema exibe mensagem de funcionalidade indisponivel
E clicar no botao fechar3
Entao o sistema exibe o menu

@deslogar
Cenario: sair do sistema
Quando clico no botao sair
Entao o sistema volta para tela de login
