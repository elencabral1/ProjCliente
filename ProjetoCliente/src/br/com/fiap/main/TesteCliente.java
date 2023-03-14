package br.com.fiap.main;

import br.com.fiap.modelo.Cliente;
import br.com.fiap.modelo.Endereco;
import br.com.fiap.modelo.Produto;

public class TesteCliente {

	public static void main(String[] args) {

		Cliente objCliente = new Cliente ();
		Endereco objEndereco = new Endereco();
		Produto objProduto = new Produto();

		objCliente.setNome("Elen Cabral");
		objCliente.setIdade(18);
		objCliente.setPeso(63);
		objCliente.setEndereco(objEndereco);
		
		objEndereco.setLogradouro("Rua");
		objEndereco.setNumero(203);
		objEndereco.setBairro("Prosperidade");
		objEndereco.setMunicipio("Scs");
		
		objProduto.setTipo("Tenis");
		objProduto.setMarca("Nike");
		
		
		System.out.println("Nome: " + objCliente.getNome()+ 
				"\nIdade: " + objCliente.getIdade() + 
				"\nPeso: " + objCliente.getPeso()+ 
				"\nEndereco: " + objCliente.getEndereco()+ 
				"\nLogradouro: " + objEndereco.getLogradouro()+ 
				"\nNumero: " + objEndereco.getNumero()+ 
				"\nBairro: " + objEndereco.getBairro()+ 
				"\nMunicipio: " + objEndereco.getMunicipio() +
				"\nMarca: " + objProduto.getMarca()+ 
				"\nTipo: " + objProduto.getTipo());
		
	}

}
