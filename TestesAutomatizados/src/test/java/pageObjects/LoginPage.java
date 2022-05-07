package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginPage {
	
	
	public void botaoRegistrar() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div[3]/button[2]")).click();
	}
	public void informarEmail(String email) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[2]/input")).sendKeys(email);
	}
	public void informarNome(String nome) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[3]/input")).sendKeys(nome);
	}
	public void informarSenha(String senha) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[4]/div/input")).sendKeys(senha);
	}
	public void confirmarSenha(String confirmarSenha) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[2]/form/div[5]/div/input")).sendKeys(confirmarSenha);
	}	

	public void botaoCadastrar() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/button")).click();
	}
	
	public void botaoFechar() {
		driver.findElement(By.xpath("//*[@id=\"btnCloseModal\"]")).click();
	}
	
	public void informarEmailCadastrado(String email) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[1]/input")).sendKeys(email);
	}
	public void informarSenhaCadastrada(String senha) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div[1]/form/div[2]/div/input")).sendKeys(senha);
	}
	public void botaoAcessar() {
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/form/div[3]/button[1]")).click();
	}
	
}
