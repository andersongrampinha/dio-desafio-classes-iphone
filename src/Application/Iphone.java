package Application;

import java.util.Scanner;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	public void ligar() {
		System.out.println("Fazendo ligação...");
	}

	public void atender() {
		System.out.println("Atendendo ligação...");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}
	
	public void tocarMusica() {
		System.out.println("Tocando música...");
	}

	public void pausarMusica() {
		System.out.println("Pausando música...");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música...");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página...");
	}

	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba...");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}


	public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		Iphone iphone = new Iphone();
		int opcao = -1;
		
		while (opcao != 0) {
		
			System.out.println("Selecione uma opção no menu: \n +" + 
			                   "1: Fazer ligação \n +" + 
					           "2: Atender ligação \n +" + 
			                   "3: Iniciar correio de voz \n +" + 
					           "4: Selecionar música \n +" + 
			                   "5: Tocar música \n +" + 
					           "6: Pausar música \n +" + 
			                   "7: Exibir página web \n +" + 
					           "8: Abrir nova aba \n +" + 
			                   "9: Atualizar página \n +" + 
					           "0: Desligar");
			
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				iphone.ligar();
				Thread.sleep(1000);
				break;
			case 2:
				iphone.atender();
				Thread.sleep(1000);
				break;
			case 3:
				iphone.iniciarCorreioVoz();
				Thread.sleep(900);
				break;
			case 4:
				iphone.selecionarMusica();
				Thread.sleep(900);
				break;
			case 5:
				iphone.tocarMusica();
				Thread.sleep(900);
				break;
			case 6:
				iphone.pausarMusica();
				Thread.sleep(900);
				break;
			case 7:
				iphone.exibirPagina();
				Thread.sleep(900);
				break;
			case 8:
				iphone.adicionarNovaAba();
				Thread.sleep(900);
				break;
			case 9:
				iphone.atualizarPagina();
				Thread.sleep(900);
				break;
			case 0:
				System.out.println("Desligando o aparelho...");
				Thread.sleep(800);
				break;
			default:
				System.out.println("Opção inválida. Insira um número de 0 a 9.");
				Thread.sleep(900);
			}
		}
		
		scan.close();
		
	}

}
