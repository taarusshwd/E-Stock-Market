package companydata.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ipo {
	
	@Id
	private int id;
	private Date close_date_time;
	private Date open_date_time;
	private String remarks;
	private double share_price;
	private int total_shares;
	@OneToOne(mappedBy = "ipo")
	private Company company;

	public Ipo() {
		
	}
	
	public Ipo(int id, Date close_date_time, Date open_date_time, String remarks, double share_price,
			int total_shares, Company company) {
		super();
		this.id = id;
		this.close_date_time = close_date_time;
		this.open_date_time = open_date_time;
		this.remarks = remarks;
		this.share_price = share_price;
		this.total_shares = total_shares;
		this.company = company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getClose_date_time() {
		return close_date_time;
	}
	public void setClose_date_time(Date close_date_time) {
		this.close_date_time = close_date_time;
	}
	public Date getOpen_date_time() {
		return open_date_time;
	}
	public void setOpen_date_time(Date open_date_time) {
		this.open_date_time = open_date_time;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public double getShare_price() {
		return share_price;
	}
	public void setShare_price(double share_price) {
		this.share_price = share_price;
	}
	public int getTotal_shares() {
		return total_shares;
	}
	public void setTotal_shares(int total_shares) {
		this.total_shares = total_shares;
	}
	
}
