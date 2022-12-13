# Portfolio-SimpleMail-JSF
Aplicação de um Site Pessoal feito com o Java Server Faces e Glassfish. 

- A tela Home contem uma foto e uma bio simples;
- A tela de Conhecimentos/Habilidades contem uma estrutura como tabela 
informando pelo menos 6 tecnologias que domino e suas imagens.
- A tela Contato incorpora um mapa do Google com minha localidade e um 
formulário para envio de e-mail para contato.

### Como executa:
Baixe a aplicação e abra no compilador de sua preferência.<br>
Certifique se as bibliotecas estão no projeto:<br>
- commons-email-1.4.jar
- mail-1.4.7.jar
<br>Obs: Para que possamos manda e-mail com Java essas duas Libs são necessárias<br>
Na classe PerfilBean é necessário acrestar seu e-mail (usei o gmail) e senha na função "enviarEmail". Deixei expecificado (Onde está escrito "Colocar seu email aqui" e "Colocar sua senha")<br>
Outra observação importante, nosso e-mail bloqueia que alguns app menos seguros nos envie e-mails, portanto para utilizar essas funcionalidade,
necessáriamente você precisa desabilitar essa opção de segurança<br>
Como fazer no gmail:<br>
- Entre em sua conta;
- Em seu perfil vá até "Gerenciar sua conta Google";
- Vá em "Segurança" e procure "Acesso a app menos seguro";
- Essa opção estara desativada, ative-a;
Dica: Utilize um e-mail que não use muito e mude sua senha para que não fique exposta.<br>

Exemplo de como ficou meu site:<br>
[Portfolio.webm](https://user-images.githubusercontent.com/61753234/207423008-49c45867-b7ef-41c9-9c0d-ba8f0db7a3f0.webm)


