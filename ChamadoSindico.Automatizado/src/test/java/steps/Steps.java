package steps;

import java.io.IOException;

import browsers.Browsers;
import elementos.elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {
	Browsers browsers = new Browsers();
	Metodos metodos = new Metodos();
	elementos elementos = new elementos();
	@Given("que esteja na home {string}")
	public void que_esteja_na_home(String site) {
	  browsers.abrirNavegador(site);
	}

	@Given("clico em clientes")
	public void clico_em_clientes() {
	    metodos.clicar(elementos.clientes);
	}
	
	
	@Given("clico em Abra aqui seu chamado")
	public void clico_em_abra_aqui_seu_chamado() {
		metodos.clicar(elementos.chamado);
	   
	}

	@Given("clico em Sou Síndico")
	public void clico_em_sou_síndico() {
		metodos.clicar(elementos.sindico);
	 
	}

	@Given("seleciono as informações")
	public void seleciono_as_informações() throws InterruptedException {
		metodos.clicar(elementos.estado);
		metodos.escrever(elementos.sp, "São Paulo");
		metodos.submit(elementos.sp);
		Thread.sleep(5000);
		metodos.clicar(elementos.cidadeClicar);
		Thread.sleep(2000);
		metodos.escrever(elementos.cidade, "São Paulo");
		metodos.baixo(elementos.cidade);
		metodos.submit(elementos.cidade);
		Thread.sleep(5000);
		metodos.clicar(elementos.residencial);
		Thread.sleep(2000);
		metodos.escrever(elementos.area, "Area");
		Thread.sleep(2000);
		metodos.submit(elementos.area);
	    
	}

	@When("clico em avançar")
	public void clico_em_avançar() {
		 metodos.clicar(elementos.avancar);
	}

	@When("preecho todas as informações")
	public void preecho_todas_as_informações() {
		metodos.clicar(elementos.nome);
		metodos.escrever(elementos.nome, "Tânia Lara Barbosa");
		metodos.clicar(elementos.cpf);
		metodos.escrever(elementos.cpf, "666.933.581-44 ");
		metodos.clicar(elementos.telefone);
		metodos.escrever(elementos.telefone, "(51) 99799-4468");
		metodos.clicar(elementos.email);
		metodos.escrever(elementos.email, "tania_barbosa@ctlive.com.br");
	   
	}

	@Then("Site abre chamado.")
	public void site_abre_chamado() throws IOException, InterruptedException {
		Thread.sleep(3000);
		metodos.submit(elementos.avancar2);
		metodos.tirarPrint("evidencia");
	}

}
