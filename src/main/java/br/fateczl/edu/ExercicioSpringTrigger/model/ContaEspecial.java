package br.fateczl.edu.ExercicioSpringTrigger.model;

public class ContaEspecial extends ContaBancaria implements ISaque{
	float limite;
	
	@Override
	public float sacar(float valor) throws Exception{
		this.saldo = this.saldo - valor;
		return valor;
	}
}
