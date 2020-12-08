package pages;

import core.CommonsBasePage;
import org.openqa.selenium.By;

public class FloresModalPages extends CommonsBasePage {
    By linkCadastrar = By.linkText("Cadastre-se");
    By inputEmail = By.name("email_lp");
    By inputNome = By.name("nome_lp");
    By inputTelefone = By.name("telefone_lp");
    By inputSenha = By.name("senha_lp");
    By buttonCadastrar = By.id("btnMain");

    public void clicarLinkCadastrar() {
        clicarElemento(linkCadastrar);
    }

    public void preencherEmail(String email) {
        enviarTextoElemento(inputEmail, email);
    }

    public void preencherNome(String nome) {
        enviarTextoElemento(inputNome, nome);
    }

    public void preencherTelefone(String telefone) {
        enviarTextoElemento(inputTelefone, telefone);
    }

    public void preencherSenha(String senha) {
        enviarTextoElemento(inputSenha, senha);
    }

    public void clicarCadastrar() {
        clicarElemento(buttonCadastrar);
    }
}
