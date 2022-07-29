package companydata.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String ceo;
	private String brief;
	private String board_of_directors;
	private String code;
	private int contant_id;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="ipo_id", unique = true)	
	private Ipo ipo;
	private int stock_exchange_id;
	private Integer sector_id;
	
	public Company() {
	}
	
	public Company(int id, String name, String ceo, String brief, String code, int contant_id, Ipo ipo,
			int stock_exchange_id, int sector_id, String board_of_directors) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
		this.brief = brief;
		this.code = code;
		this.contant_id = contant_id;
		this.ipo = ipo;
		this.stock_exchange_id = stock_exchange_id;
		this.sector_id = sector_id;
		this.board_of_directors = board_of_directors;
	}
	public String getBoard_of_directors() {
		return board_of_directors;
	}

	public void setBoard_of_directors(String board_of_directors) {
		this.board_of_directors = board_of_directors;
	}

	public Ipo getIpo() {
		return ipo;
	}

	public void setIpo(Ipo ipo) {
		this.ipo = ipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public Integer getSector_id() {
		return sector_id;
	}

	public void setSector_id(Integer sector_id) {
		this.sector_id = sector_id;
	}

	public int getContant_id() {
		return contant_id;
	}

	public void setContant_id(int contant_id) {
		this.contant_id = contant_id;
	}

	public int getStock_exchange_id() {
		return stock_exchange_id;
	}

	public void setStock_exchange_id(int stock_exchange_id) {
		this.stock_exchange_id = stock_exchange_id;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
}