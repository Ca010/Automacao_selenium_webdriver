Feature: fluxo de compra produto infantil usuario autenticado

  Scenario: compra com cartao de credito valido Mastercard
    Given que o usuario adicione o produto a sacola
    When clicar o botao finalizar compra
    And clicar botao opcao de entrega
    And clicar no campo numero do cartao
    And preencho numero cartao como У<numero_cartao>Ф
    And preencho nome impresso no cartao com У<nome_impresso_cartao>Ф
    And preencho validade cartao com У<validade_cartao>Ф
    And preencho cvv com У<cvv>Ф
    And clicar botao parcelamento
    And clicar botao opзгo parcelamento
    Then clicar botao finalizar compra

    Example:
      | numero_cartao       | nome_impresso_cartao | validade_cartao | cvv |
      | 5306 0311 8114 9563 | Fernanda C Lima      | 1121            | 596 |
