package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Driver;

public class AcoesPages {
	
	public void preenchePesquisa(CharSequence...valores) {
		String inpPesquisa = "input[title='Pesquisar']";
		WebElement pesquisar; 
		
		pesquisar = Driver.driver.findElement(By.cssSelector(inpPesquisa)); 
		pesquisar.sendKeys(valores);
		
	}
	
	public String getValorAcao() {
		String spanValor = "span[jsname ='vWLAgc']";
		String valoracao = Driver.driver.findElement(By.cssSelector(spanValor)).getText();
		return valoracao; 
	}

}
