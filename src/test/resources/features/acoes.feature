#language:pt
@exibevaloracao
Funcionalidade: Exibir valores de acoes

  Contexto: 
    Dado que esteja na pagina "https://www.google.com.br"

  @buscaAcao
  Cenario: Buscar acao no google: 
    Quando preencho o campo pesquisa "SANB11"
    E envio a tecla Enter
    Entao exibe o valor da acao

  @esquemaCenario
  Esquema do Cenario: <cenario> <acoes>
    Quando preencho o campo pesquisa "<acoes>"
    E envio a tecla Enter
    Entao exibe o valor da acao

    Exemplos: 
      | cenario    | acoes |
      | Busca acao | Itsa4 |
 #     | Busca acao | Movi3 |
 #    | Busca acao | Oibr3 |
 #     | Busca acao | MGLU3 |
