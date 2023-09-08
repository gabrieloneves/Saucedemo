package steps;

import io.cucumber.java.en.Given;
import runner.Executa;

public class Testes {

	@Given("que esteja no site {string}")
	public void queEstejaNoSite(String string) {
		Executa.abrirNavegador(string);
	}

}
