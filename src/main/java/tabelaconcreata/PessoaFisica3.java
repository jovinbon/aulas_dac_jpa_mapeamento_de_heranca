package tabelaconcreata;

import javax.persistence.Entity;

@Entity
public class PessoaFisica3 extends Pessoa3{
	
	private String cpf_cnpj;
	
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}


}
