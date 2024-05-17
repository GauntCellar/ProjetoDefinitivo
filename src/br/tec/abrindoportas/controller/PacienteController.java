package br.tec.abrindoportas.controller;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.PacienteModel;

public class PacienteController {
	
	public void create() {
		//BLOCO de Declaração de Variáveis
		PacienteModel pacienteModel = new PacienteModel();
		
		//BLOCO - Entrada de dados
		pacienteModel.setFirsName(JOptionPane.showInputDialog(null, "Digite o primeiro nome:" ));
		pacienteModel.setExame(JOptionPane.showInputDialog(null, "Voçê precisa do seguinte exame: "));
		//BLOCO - Saída de dados
		pacienteModel.tipoPeople();
		JOptionPane.showMessageDialog(null, pacienteModel);
	}
}
