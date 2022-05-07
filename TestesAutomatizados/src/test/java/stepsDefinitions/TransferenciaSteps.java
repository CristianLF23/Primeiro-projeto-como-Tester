package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TransferenciaPage;

import static utils.Utils.*;

public class TransferenciaSteps {
	
	TransferenciaPage lp = new TransferenciaPage();
	
	@Quando("clicar no botao transferencia")
	public void clicarNoBotaoTransferencia() {
		lp.botaoTransferencia();
	}
	@Entao("a tela de transferencia sera exibida")
	public void aTelaDeTransferenciaSeraExibida() {
	    
	}
	@Quando("informar o numero da conta {string}")
	public void informarONumeroDaConta(String numConta) {
		lp.numConta(numConta);
	}
	@Quando("informar o digito da conta {string}")
	public void informarODigitoDaConta(String digitoConta) {
		lp.digitoConta(digitoConta);
	}
	@Quando("informar o valor da trasnferencia {string}")
	public void informarOValorDaTrasnferencia(String valorTransferencia) {
		lp.valorTransferencia(valorTransferencia);
	}
	@Quando("informar a descricao {string}")
	public void informarADescricao(String descricao) {
		lp.descricao(descricao);
	}
	@Quando("clicar no botao transferir agora")
	public void clicarNoBotaoTransferirAgora() {
		lp.botaoTransferir();
	}
	@Entao("o sistema exibe mensagem de erro")
	public void oSistemaExibeMensagemDeErro() { 
	}
	
	@Entao("clico no botao para fechar mensagem")
	public void clicoNoBotaoParaFecharMensagem() {
	    lp.botaoFechar();
	}
	
	@Entao("clicar no botao voltar")
	public void clicarNoBotaoVoltar() {
	    lp.botaoVoltar();
	}
	
	@Entao("o sistema exibe a tela principal")
	public void oSistemaExibeATelaPrincipal() {
	   
	}
	
	@Quando("eu clicar no botao pagamentos")
	public void euClicarNoBotaoPagamentos() {
		lp.botaoPagamentos();
	}
	@Entao("o sistema exibe mensagem de funcionalidade em desenvolvimento")
	public void oSistemaExibeMensagemDeFuncionalidadeEmDesenvolvimento() {
		lp.botaoFecharJanela();
	}
	@Entao("o sistema exibe o menu principal")
	public void oSistemaExibeOMenuPrincipal() {  
	}
	@Quando("eu clicar no botao extrato")
	public void euClicarNoBotaoExtrato() {
	    lp.botaoExtrato();
	}
	@Entao("o extrato sera exibido para o usuario")
	public void oExtratoSeraExibidoParaOUsuario() {
	    
	}
	@Quando("eu clicar no botao voltar")
	public void euClicarNoBotaoVoltar() {
	    lp.botaoVoltar2();;
	}
	@Entao("a tela principal sera exibida")
	public void aTelaPrincipalSeraExibida() {
	    
	}
	@Quando("clicar no botao saque")
	public void clicarNoBotaoSaque() {
	    lp.botaoSaque();
	}
	@Entao("o sistema exibe mensagem de funcionalidade indisponivel")
	public void oSistemaExibeMensagemDeFuncionalidadeIndisponivel() {
	    
	}
	@Entao("clicar no botao fechar3")
	public void clicarNoBotaoFechar3() {
	    lp.botaoFechar3();
	}
	@Entao("o sistema exibe o menu")
	public void oSistemaExibeOMenu() {
	    
	}
	@Quando("clico no botao sair")
	public void clicoNoBotOSair() {
		lp.botaoSair();
	}
	@Entao("o sistema volta para tela de login")
	public void oSistemaVoltaParaTelaDeLogin() {
	   
	}
	
}

	

