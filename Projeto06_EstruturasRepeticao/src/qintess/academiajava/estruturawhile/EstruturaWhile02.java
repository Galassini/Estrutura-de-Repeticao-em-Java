package qintess.academiajava.estruturawhile;

import javax.swing.JOptionPane;

public class EstruturaWhile02 {
	public static void main(String[] args) {
		/*
		 * Neste programa, o usuario fornece uma certa quantidade de numeros
		 * Cada numero que ele informar, sera apresentado na tela.
		 * Se o usuario digitar o numero 0(zero), a estrutura de repiti��o termina.
		 */
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero: "));
			if(numero == 0) {
				break;
			}
			System.out.println(numero);
		}
		System.out.println("----------FIM DO PROGRAMA----------------");
	}

}
