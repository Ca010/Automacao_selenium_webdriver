package stepsDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.GooglePesquisaPage;

public class EverisTestsSteps extends GooglePesquisaPage {

	@Dado("que o usuario acesse o google")
	public void que_o_usuario_acesse_o_google() {
		acessarUrlGoogle();
		
	}

	@E("digite na barra de pesquisa {string}")
	public void digite_na_barra_de_pesquisa(String string) {
		buscaBarraDePesquisa("everis");
	}

	@Quando("ele clicar na pesquisa com o nome de everis")
	public void ele_clicar_na_pesquisa_com_o_nome_de_everis() {
		linkHomeEveris();
	}

	@Entao("validar que a home foi carregada")
	public void validar_que_a_home_foi_carregada() {
		validaUrlEveris();

	}


	@Dado("que o usuario acesse o site da everis")
	public void que_o_usuario_acesse_o_site_da_everis() {
		acessarUrlEveris();

	}

	@E("clica no botao about us")
	public void clica_no_botao_about_us() {
		linkAboutUs();
	}

	@Quando("carregar a pagina")
	public void carregar_a_pagina() {
		urlEveris();
	}

	@Entao("validar o titulo about us")
	public void validar_o_titulo_about_us() {
		tituloAboutUs();
	}
}