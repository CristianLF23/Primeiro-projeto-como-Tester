package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
		LoginPage lp = new LoginPage();

		@Quando("eu clicar no botao Registrar")
		public void euClicarNoBotaoRegistrar() {
		    lp.botaoRegistrar();
		}
		@Quando("informar email {string}")
		public void informarEmail(String email) {
		    lp.informarEmail(email);
		}
		@Quando("informar nome {string}")
		public void informarNome(String nome) {
			lp.informarNome(nome);
		}
		@Quando("informar senha {string}")
		public void informarSenha(String senha) {
			lp.informarSenha(senha);
		}
		@Quando("confirmar a senha {string}")
		public void confirmarASenha(String senha) {
			lp.confirmarSenha(senha);
		}
		@Quando("clicar no botao cadastrar")
		public void clicarNoBotaoCadastrar() {
			 lp.botaoCadastrar();
		}
		
		@Quando("clicar no botao fechar")
		public void clicarNoBotaoFechar() {
			 lp.botaoFechar();
		}
		
		//Login após cadastro abaixo:
		
		@Quando("digitar email {string}")
		public void informarEmailCadastrado(String email) {
			lp.informarEmailCadastrado(email);
		}
		@Quando("digitar senha {string}")
		public void informarSenhaCadastrada(String senha) {
			lp.informarSenhaCadastrada(senha);
		}
		@Quando("clicar no botao Acessar")
		public void clicarNoBotaoAcessar() {
			lp.botaoAcessar();
		}
		@Entao("o sistema exibe o usuario logado")
		public void oSistemaExibeOUsuarioLogado() {
			assertEquals("home__Text-sc-1auj767-9 jjmPHj", driver.findElement(By.className("home__Text-sc-1auj767-9 jjmPHj")).getText()); 
		}	
		
		
		
		
		
}
