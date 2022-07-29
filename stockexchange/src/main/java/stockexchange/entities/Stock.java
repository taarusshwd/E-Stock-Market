package stockexchange.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stock {

	@Id
	private int id;
	private double close_price;
	private double company_turnover;
	private Date date;
	private Date date_time;
	private double open_price;
	private int company_id;
	private int stock_exchange;
	
	public Stock() {
		
	}
	
	public Stock(int id, double close_price, double company_turnover, Date date, Date date_time, double open_price,
			int company_id, int stock_exchange) {
		super();
		this.id = id;
		this.close_price = close_price;
		this.company_turnover = company_turnover;
		this.date = date;
		this.date_time = date_time;
		this.open_price = open_price;
		this.company_id = company_id;
		this.stock_exchange = stock_exchange;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getClose_price() {
		return close_price;
	}
	public void setClose_price(double close_price) {
		this.close_price = close_price;
	}
	public double getCompany_turnover() {
		return company_turnover;
	}
	public void setCompany_turnover(double company_turnover) {
		this.company_turnover = company_turnover;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public double getOpen_price() {
		return open_price;
	}
	public void setOpen_price(double open_price) {
		this.open_price = open_price;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getStock_exchange() {
		return stock_exchange;
	}
	public void setStock_exchange(int stock_exchange) {
		this.stock_exchange = stock_exchange;
	}
	
	
}
