package br.com.fiap.modelo;

public class Endereco {

	private String logradouro;
	private int numero;
	private String bairro;
	private String municipio;
	
	public void setLogradouro (String logradouro){
		this.logradouro = logradouro;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public void setMunicipio(String municipio){
		this.municipio = municipio;
	}
	
	public String getLogradouro(){
		return logradouro;
	}
	public int getNumero(){
		return numero;
	}
	public String getBairro(){
		return bairro;
	}
	public String getMunicipio(){
		return municipio;
	}
}
