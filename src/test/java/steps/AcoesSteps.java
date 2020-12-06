package steps;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.Keys;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.AcoesPages;

public class AcoesSteps {

	private String acao;
	private AcoesPages acoesPage = new AcoesPages();

	@Quando("preencho o campo pesquisa {string}")
	public void preenchoOCampoPesquisa(String acao) {
		this.acao = acao;
		acoesPage.preenchePesquisa(acao);
	}

	@Quando("envio a tecla Enter")
	public void envioATeclaEnter() {
		acoesPage.preenchePesquisa(Keys.ENTER);

	}

	@Entao("exibe o valor da acao")
	public void exibeOValorDaAcao() throws IOException {
		System.out.println(acao + " o valor atual: R$" + acoesPage.getValorAcao());
		String[] valores = acoesPage.getValorAcao().split(",");
		// System.out.println(valores);
		assertEquals("Casas decimais esperadas:", 2, valores[1].length());
	}

}
