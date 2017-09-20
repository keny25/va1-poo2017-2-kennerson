package br.unincor.controle;

import java.util.ArrayList;
import java.util.List;

import br.unincor.exception.EvolucaoException;
import br.unincor.view.*;
import br.unincor.model.*;
import br.unincor.controle.*;

public class Main {

	public static void main(String[] args) {
		Usuario gui = new Usuario();	
		
		gui.recebeInteiro("Entre com a quantidade de pokemons");
		
		List<Pokemon> listaPokemon = new ArrayList<Pokemon>();
		///Pokemon p = new Pokemon(nome, tipo, peso, altura);
		
		for (int i = 0; i < listaPokemon.size(); i++) {
			
		}
	}

}
