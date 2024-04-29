package br.fateczl.edu.ExercicioSpringTrigger.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ContaBancaria implements ISaque{
	String nomeCliente;
	int numConta;
	float saldo;
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
	
	@Override
	public float sacar(float valor) throws Exception{
		
		try {
			if(valor - this.saldo < 0) {
				throw new Exception("Saldo insuficiente");
			}else {
				this.saldo = this.saldo - valor;
				return valor;
			}
		} catch (Exception e) {			
			return (Float) null;
		}
	}
}
