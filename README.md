# Cafe-Literario

# How to
1º Irá acessar sua conta AWS
2º Irá criar um Security Group com duas regras de entrada: 1 do tipo SSH na porta 22 (padrão) e 1 do tipo TCP na porta 8080 e você pode escolher quem poderá fazer requisição a essas regras através do `source`
3º Irá criar finalizar criando o Security Group
4º Você irá acessar Instance em EC2 ainda
5º Irá clicar em Launch Instance para criar uma nova instância
6º Irá escolher um nome para instância, lembrando que ele deve ser único
7º Escolha o Sistema Operacional (eu utilizei Ubunto)
8º Escolha o tipo da instância, as configurações que você quer nela
9º Crie uma `Key Pair` para poder acessar sua Instância através do terminal ou putty
10º O tipo da Key será RSA
11º **CASO UTILIZE PUTTY** criar a Key Pair em formato .ppk
12º Após criar sua Key Pair, você irá selecionar o Security Group que foi criado
13º Irá concluir a criação da instância clicando em Launch Instance

Com sua EC2 criada e utilizando as ferramentas Putty e WinScp, iremos acessar ela agora e passar o build do projeto para dentro da EC2

14º Ao entrar no Putty, em Host Name você irá colocar seu public DNS que se encontra dentro da sua instância no botão de Connect
15º Em seguida irá colocar sua autenticação em Category > Connection > SSH > Auth > Credentials
16º Dentro de credentials você irá procurar pelo seu arquivo chave (Key Pair) e adicionará em `Private key file for authentication`
17º E assim finalizará a conexão clicando em Open
18º Dentro da EC2 vamos fazer os devidos preparativos rodando os comandos
```
sudo apt-get update
sudo apt install openjdk-17-jre
```
obs: você pode rodar `java --version` para verificar se foi instalado corretamente
19º Tudo funcionando normalmente você irá transferiar o arquivo .jar gerado após o build pelo maven
20º Utilizando o WinScp você fará o acesso da sua máquina adicionando o host dela e o usuário, você pode encontrar esses dados em Connect lá na sua EC2, o usuário será o nome que vem antes do @
21º após passar os dados você irá clicar em Login
22º Após abrir terá dois lados o WinScp, o esquerdo é da sua máquina fisíca e direito sua máquina virtual
23º No lado esquerdo você irá procurar pelo build gerado pelo maven
24º Irá arrastar para o lado direito e esperar fazer a transferência para máquina virtual
25º Lá no putty você pode rodar o comando `ls` para verificar se passou realmente
26º Você irá rodar o comando java -jar <nome do build do arquivo>.jar e assim irá rodar a api
27º Agora você pode fazer testes passando sua Public Ipv4 Address na porta 8080 e o caminho do controller
