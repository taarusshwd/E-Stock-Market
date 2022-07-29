package com.stockmarket.sectorservice.Obsolete;
//package com.stockmarket.sectorservice.services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.stockmarket.sectorservice.entities.CompanyList;
//import com.stockmarket.sectorservice.repositories.CompanyRepository;
//
//@Service
//public class CompanyService {
//	@Autowired
//	private CompanyRepository companyRepository;
//	
//	public List<CompanyList> getAllCompanies(Integer sectorId){
//		List<CompanyList> companies = new ArrayList<>();
//		companyRepository.findBySectorId(sectorId)
//		.forEach(companies::add);
//		return companies;
//	}
//	public Optional<CompanyList> getCompany(Integer id) {
//		return companyRepository.findById(id);
//	}
//	public CompanyList addCompany(CompanyList company) {
//		return companyRepository.save(company);
//	}
//	public CompanyList updateCompany(CompanyList company) {
//		return companyRepository.save(company);
//	}
//	public void deleteCompany(Integer id) {
//		companyRepository.deleteById(id);
//	}
//}
