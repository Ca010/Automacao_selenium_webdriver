# language: pt

Funcionalidade: Realizar cadastro  de usuario em site flores online

Esquema do Cenario: Cadastro de usuario
Dado que estou na area de cadastro do site flores online
Quando preenche o email como "<email>"
E preencho o nome como "<nome>"
E preencho o telefone como "<telefone>"
E preencho a senha com o valor "<senha>"
E clico em cadastrar
Entao o usuario aparece com o login efetuado na pagina

Exemplos:
| email         | nome          |   telefone    | senha    |
|abc@abc.com    |Joaozinho um   | 11956238596   |   123456 |
|aaa@aaa.com    |Joaozinho dois | 11974526398   |   123456 |
|abc@abc.com    |Joaozinho tres | 11956238596   |   123456 |
