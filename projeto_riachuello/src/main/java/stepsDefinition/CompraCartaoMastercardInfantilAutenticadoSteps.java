package stepsDefinition;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pages.CompraCartaoInfantilValidoPage;

public class CompraCartaoMastercardInfantilAutenticadoSteps {
	CompraCartaoInfantilValidoPage compraCartaoInfantilValidoPage = new CompraCartaoInfantilValidoPage();

	@Dado("que o usuario adicione o produto a sacola")
	public void que_o_usuario_adicione_o_produto_a_sacola() {
		compraCartaoInfantilValidoPage.clicarIrOpcaoInfantil();
		compraCartaoInfantilValidoPage.clicarOpcaoProdutoInfantil();
	}

	@Quando("clicar o botao finalizar compra")
	public void clicar_o_botao_finalizar_compra() {

	}

	@Quando("clicar botao opcao de entrega")
	public void clicar_botao_opcao_de_entrega() {

	}

	@Quando("clicar no campo numero do cartao")
	public void clicar_no_campo_numero_do_cartao() {

	}

	@Quando("preencho numero cartao como “{int} {int} {int} {int}”")
	public void preencho_numero_cartao_como(Integer int1, Integer int2, Integer int3, Integer int4) {

	}

	@Quando("preencho nome impresso no cartao com “Fernanda C Lima”")
	public void preencho_nome_impresso_no_cartao_com_fernanda_c_lima() {

	}

	@Quando("preencho validade cartao com “{int}”")
	public void preencho_validade_cartao_com(Integer int1) {

	}

	@Quando("preencho cvv com “{int}”")
	public void preencho_cvv_com(Integer int1) {

	}

	@Quando("clicar botao parcelamento")
	public void clicar_botao_parcelamento() {

	}

	@Quando("clicar botao opção parcelamento")
	public void clicar_botao_opção_parcelamento() {

	}

	@Entao("clicar botao finalizar compra")
	public void clicar_botao_finalizar_compra() {

	}

}
