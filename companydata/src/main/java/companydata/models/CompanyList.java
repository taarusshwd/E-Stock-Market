package companydata.models;

import java.util.List;

public class CompanyList {
	private Integer sectorId;
	private List<String> company_list;
	
	public CompanyList() {}

	public CompanyList(Integer sectorId, List<String> company_list) {
		super();
		this.sectorId = sectorId;
		this.company_list = company_list;
	}

	public Integer getSectorId() {
		return sectorId;
	}

	public void setSectorId(Integer sectorId) {
		this.sectorId = sectorId;
	}

	public List<String> getCompany_list() {
		return company_list;
	}

	public void setCompany_list(List<String> company_list) {
		this.company_list = company_list;
	}
	
}
