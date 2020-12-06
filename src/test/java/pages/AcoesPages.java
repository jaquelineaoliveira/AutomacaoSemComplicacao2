package pages;


import java.io.IOException;

import core.Driver;
import maps.AcoesMap;

public class AcoesPages {
	private AcoesMap acoesMap = new AcoesMap();

/*	public void preenchePesquisa2(CharSequence... valores) {
		String inpPesquisa = "input[title='Pesquisar']";
		WebElement pesquisar;

		pesquisar = Driver.driver.findElement(By.cssSelector(inpPesquisa));
		pesquisar.sendKeys(valores);	

	}

	public String getValorAcao2() {
		String spanValor = "span[jsname ='vWLAgc']";
		String valoracao = Driver.driver.findElement(By.cssSelector(spanValor)).getText();
		return valoracao;
	}*/ 

	public void preenchePesquisa(CharSequence... valores) {
		acoesMap.inpPesquisa.sendKeys(valores);

	}

	public String getValorAcao() throws IOException {
		Driver.printScreen("Valor acao");
		return acoesMap.spanValor.getText();
		
	}
}
