<h1 align="center">
 DIO - Trilha Java Básico
</h1>

<h2 align="center">
 POO Desafio
</h2>

<h2 align="center">
 <b><i>Modelagem e Diagramação de um Componente iPhone</i></b>
</h2>

<p align="center">
	<img alt="Tamanho do código no GitHub em bytes" src="https://img.shields.io/github/languages/code-size/andersongrampinha/dio-desafio-classes-iphone?color=6272a4" />
	<img alt="Linguagem principal" src="https://img.shields.io/github/languages/top/andersongrampinha/dio-desafio-classes-iphone?color=6272a4"/>
</p>

## 💡 Sobre o projeto

Com base no vídeo de lançamento do iPhone de 2007, foi elaborado o diagrama das classes e interfaces utilizando a ferramenta UML on line https://mermaid.live/,  

Em seguida, foram implementadas as classes e interfaces no formato de arquivos `.java`.
 
 ## Diagrama UML (Mermaid)
```mermaid
classDiagram

Iphone --|> ReprodutorMusical
Iphone --|> AparelhoTelefonico
Iphone --|> NavegadorInternet

class Iphone

class ReprodutorMusical{
    <<interface>>
    +tocarMusica() void
    +pausarMusica() void
    +selecionarMusica(String musica)
}

class AparelhoTelefonico{
    <<interface>>
    +ligar() void
    +atender() void
    +iniciarCorrreioVoz() void
}

class NavegadorInternet{
    <<interface>>
    +exibirPagina() void
    +adicionarNovaAba() void
    +atualizarPagina() void
}
```

## Descrição das Interfaces e Classes

### ReprodutorMusical

* Responsável por implementar a funcionalidade de reprodução de arquivos de áudio. Ela possui métodos como `tocarMusica()`, `pausarMusica()`, e `selecionarMusica()`.

### AparelhoTelefonico

* Responsável por implementar a funcionalidade de um telefone. Ela possui métodos como `ligar()`, `atender()`, e `iniciarCorreioVoz()`.

### NavegadorInternet

* Responsável por implementar a funcionalidade de um navegador web. Ela possui métodos como `exibirPagina()`, `adicionarNovaAba()`, e `atualizarPagina()`.


##  🔧 Tecnologias
![JAVA](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
  
## 🔗 Referências
- Videoaulas do Bootcamp na plataforma da DIO


## ✅ Feedback

Caso tenha algum feedback, entre em contato!

<a href="https://www.linkedin.com/in/anderson-grampinha/" target="_blank"><img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank"></a>
<a href = "mailto:andersongrampinha@gmail.com"><img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white"></a> 

<p align="center"> Desenvolvido por Anderson Oaski Grampinha </p>
