package stepsDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.FloresHomePage;
import pages.FloresModalPages;

public class CadastroUsuariosSteps {

    FloresHomePage floresHomePage = new FloresHomePage();
    FloresModalPages floresModalPages = new FloresModalPages();

    @Dado("que estou na area de cadastro do site flores online")
    public void que_estou_na_area_de_cadastro_do_site_flores_online() {
        floresHomePage.clicaBotaoEntrar();
        floresModalPages.clicarLinkCadastrar();
    }

    @Quando("preenche o email como {string}")
    public void preenche_o_email_como(String email) {
        floresModalPages.preencherEmail(email);
    }

    @Quando("preencho o nome como {string}")
    public void preencho_o_nome_como(String nome) {
        floresModalPages.preencherNome(nome);
    }

    @Quando("preencho o telefone como {string}")
    public void preencho_o_telefone_como(String telefone) {
        floresModalPages.preencherTelefone(telefone);
    }

    @Quando("preencho a senha com o valor {string}")
    public void preencho_a_senha_com_o_valor(String senha) {
        floresModalPages.preencherSenha(senha);
    }

    @Quando("clico em cadastrar")
    public void clico_em_cadastrar() {
        floresModalPages.clicarCadastrar();
    }

    @Entao("o usuario aparece com o login efetuado na pagina")
    public void o_usuario_aparece_com_o_login_efetuado_na_pagina() {
        floresHomePage.validarMenuMinhaConta();
    }

}
