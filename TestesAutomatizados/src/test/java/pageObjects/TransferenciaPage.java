package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;

public class TransferenciaPage {
	
	public void botaoTransferencia() {
		driver.findElement(By.xpath("//*[@id=\"btn-TRANSFERÊNCIA\"]/span/img")).click();
	}
	public void numConta(String numConta) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[1]/input")).sendKeys(numConta);
	}
	public void digitoConta(String digitoConta) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[1]/div[2]/input")).sendKeys(digitoConta);
	}
	public void valorTransferencia(String valorTransferencia) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[2]/input")).sendKeys(valorTransferencia);
	}
	public void descricao(String descricao) {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/div[3]/input")).sendKeys(descricao);
	}
	public void botaoTransferir() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/form/button")).click();
	}
	public void botaoFechar() {
		driver.findElement(By.xpath("//*[@id=\"btnCloseModal\"]")).click();
	}
	public void botaoVoltar() {
		driver.findElement(By.xpath("//*[@id=\"btnBack\"]")).click();
	}
	public void botaoPagamentos() {
		driver.findElement(By.xpath("//*[@id=\"btn-PAGAMENTOS\"]/span/img")).click();
	}
	public void botaoFecharJanela() {
		driver.findElement(By.xpath("/html/body/div/div/div[5]/div/div[2]/a")).click();
	}
	public void botaoExtrato() {
		driver.findElement(By.xpath("//*[@id=\"btn-EXTRATO\"]")).click();
	}
	public void botaoVoltar2() {
		driver.findElement(By.xpath("//*[@id=\"btnBack\"]")).click();
	}
	public void botaoSaque() {
		driver.findElement(By.xpath("//*[@id=\"btn-SAQUE\"]/span/img")).click();
	}
	public void botaoFechar3() {
		driver.findElement(By.xpath("//*[@id=\"btnCloseModal\"]")).click();
	}
	public void botaoSair() {
		driver.findElement(By.xpath("//*[@id=\"btnExit\"]")).click();
	}
	
}
