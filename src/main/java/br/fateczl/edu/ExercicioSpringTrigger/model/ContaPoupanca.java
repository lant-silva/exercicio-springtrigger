package br.fateczl.edu.ExercicioSpringTrigger.model;

public class ContaPoupanca extends ContaBancaria{
	int diaRendimento;
	
	public void calcularNovoSaldo(float taxa) {
		this.saldo = this.saldo * (1 + taxa);
	}
}
