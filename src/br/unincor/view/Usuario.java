package br.unincor.view;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * Nesta classe você deve tratar exceção
 * em todos os métodos que podem vir a lançar
 * exceções por entrada incorreta do usuário. 
 *
 */
public class Usuario {

	public void exibeMsg(String texto) {
		JOptionPane.showMessageDialog(null, texto, "MENSAGEM", JOptionPane.INFORMATION_MESSAGE);
	}

	public void exibeMsgErro(String texto) {
		JOptionPane.showMessageDialog(null, texto, "ERRO", JOptionPane.ERROR_MESSAGE);
	}

	public void exibeMsgDebug(String texto) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		System.out.println(sdf.format(new Date()) + " - [DEBUG] " + texto);
	}

	public Integer recebeInteiro(String texto) {
		try {
			return Integer.parseInt(JOptionPane.showInputDialog(texto));			
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public Long recebeLong(String texto) {
			try {
				return Long.parseLong(JOptionPane.showInputDialog(texto));
			} catch (Exception e) {
				exibeMsg("Entrada inválida!");
			}
			return null;
	}

	public Double recebeDouble(String texto) {
		try {
			return Double.parseDouble(JOptionPane.showInputDialog(texto));
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public Float recebeFloat(String texto) {
		try {
			return Float.parseFloat(JOptionPane.showInputDialog(texto));
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public Boolean recebeBoolean(String texto) {
		try {
			int resposta = JOptionPane.showConfirmDialog(null, texto);
			if(resposta == JOptionPane.YES_OPTION)
				return Boolean.TRUE;
			return Boolean.FALSE;
		} catch (Exception e) {
			exibeMsg("Entrada inválida!");
		}
		return null;
	}

	public String recebeTexto(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
}
