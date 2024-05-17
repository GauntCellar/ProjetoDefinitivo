package br.tec.abrindoportas.model;

import javax.swing.JOptionPane;

/*
 * MCV - Model
 */
public class PeopleModel {
	
	 String firstName;
	 String lastName;
	 String cpf;
	 int idade;
	 String endereco;
	 String cidade;
	
	
	public PeopleModel() {
		super();
	}

	public PeopleModel(String firstName, String lastName, String cpf, int idade, String endereco, double salario, String cidade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.cpf = cpf;
		this.idade = idade;
		this.endereco = endereco;
		this.cidade = cidade;
	}

	public String getFirsName() {
		return firstName;
	}

	public void setFirsName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	@Override
	public void tipoPeople() {
		System.out.println(this.firstName + "Voçê é um tipo de pessoa obesa.");
	}


	@Override
	public String toString() {
		return "People [firstName=" + firstName 
				                + ", lastName=" + lastName 
				                + ", cpf=" + cpf 
				                + ", idade=" + idade
				                + ", endereco=" + endereco 
				                + ", cidade=" + cidade + "]";
				                
	}
}

		

