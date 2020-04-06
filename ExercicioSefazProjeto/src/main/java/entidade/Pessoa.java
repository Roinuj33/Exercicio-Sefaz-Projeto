package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
		
	@Column(name="nome")
	private String nome;
	
	@Id	
	@Column(name="cpf")
	private String cpf;
	
	@Column(name="idade")
	private int idade;
	
	@Column(name="sexo")
	private String sexo;
	
	@Column(name="senha")
	private String senha;
	
	@OneToMany(mappedBy="pessoa", cascade= CascadeType.ALL) 
	private List<Livro> livros;
	
		
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	
}
