package generation.org.farmaciadobem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank(message = "A categoria não pode estar em branco.")
	@Size(min=5, max=200, message = "A descrição deve ter no mínimo 5 catcacteres e no máximo 200 caracteres")
	private String codigo;
	
	@NotBlank(message = "A descrição não pode estar em branco.")
	@Size(min=5, max=2000, message = "A descrição deve ter no mínimo 5 catcacteres e no máximo 2000 caracteres")
	private String descricao;
	
	@NotBlank(message = "A categoria não pode estar em branco.")
	@Size(min=5, max=2000, message = "A Categoria deve ter no mínimo 5 catcacteres e no máximo 200 caracteres")
	private String controle;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List <Produto> produto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
}
