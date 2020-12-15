Feature: fluxo de compra produto infantil usuario autenticado

  Scenario: compra com cartao de credito valido Mastercard
    Given que o usuario adicione o produto a sacola
    When clicar o botao finalizar compra
    And clicar botao opcao de entrega
    And clicar no campo numero do cartao
    And preencho numero cartao como �<numero_cartao>�
    And preencho nome impresso no cartao com �<nome_impresso_cartao>�
    And preencho validade cartao com �<validade_cartao>�
    And preencho cvv com �<cvv>�
    And clicar botao parcelamento
    And clicar botao op��o parcelamento
    Then clicar botao finalizar compra

    Example:
      | numero_cartao       | nome_impresso_cartao | validade_cartao | cvv |
      | 5306 0311 8114 9563 | Fernanda C Lima      | 1121            | 596 |
