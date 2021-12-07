package generation.org.lojagamer.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O produto não pode estar em branco.")
	@NotNull(message = "O produto deve conter caracteres")
	@Size(min=5, max=200, message = "O produto deve ter no mínimo 5 catcacteres e no máximo 200 caracteres")
	private String produto;
	
	@NotBlank(message = "A descrição não pode estar em branco.")
	@NotNull(message = "A descrição deve conter caracteres")
	@Size(min=5, max=2000, message = "A descrição deve ter no mínimo 5 catcacteres e no máximo 2000 caracteres")
	private String descricao;
	
	@NotNull(message = "A quantidade deve conter um número inteiro")
	private int quantidade;
	
	@NotNull(message = "O preço deve conter caracteres")
	private BigDecimal preco;
	
	@NotBlank(message = "A foto não pode estar em branco.")
	@NotNull(message = "A foto deve conter uma URL")
	private String foto;
	
	@UpdateTimestamp
	private LocalDate data;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


}
