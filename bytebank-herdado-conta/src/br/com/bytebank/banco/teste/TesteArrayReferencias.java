package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;


public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//int[]idades= new int [5];
		Conta[] referencias = new Conta[5];
		
		System.out.println(referencias.length);
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);//cria o objeto
		referencias[0] = cc1;//o objeto foi indetificado na posicao apontada
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		//Object referenciaGenerica = contas[1];
		//System.out.println(referenciaGenerica.getNumero());
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		

	}

}
