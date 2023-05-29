package Service;

import Package1.model.Company;

public interface CompanyService {
    String createCompany(Company... company);
    Company[] getAllCompanies();
    Company getCompanyById(Long id);
    Company updateCompany(Long oldCompanyId, Company newCompany);
    Company[] deleteCompany(Long id);

}
