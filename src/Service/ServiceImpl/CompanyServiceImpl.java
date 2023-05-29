package Service.ServiceImpl;

import Package1.model.Company;
import Service.CompanyService;

public class CompanyServiceImpl implements CompanyService {

    private Company[]companies;



    @Override
    public String createCompany(Company... company) {
        Company[]companies1;
        if (companies==null){
            this.companies=company;
        }else {
            companies1=new Company[companies.length+company.length];
            for (int i = 0; i < companies.length; i++) {
                companies1[i]=companies[i];
            }
            companies=companies1;
        }
        return "Succesfully saived";
    }

    @Override
    public Company[] getAllCompanies() {
        return companies;
    }

    @Override
    public Company getCompanyById(Long id) {
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].getId()==id){
                return companies[i];
            }

        }
        return null;
    }

    @Override
    public Company updateCompany(Long oldCompanyId, Company newCompany) {
      Company company1=getCompanyById(oldCompanyId);
      company1.setName(newCompany.getName());
      company1.setCountry(newCompany.getCountry());
      company1.setAdress(newCompany.getAdress());
      company1.setGroups(newCompany.getGroups());
      company1.setInstructors(newCompany.getInstructors());
      company1.setStudents(newCompany.getStudents());
        return company1;
    }

    @Override
    public Company[] deleteCompany(Long id) {
        Company company=getCompanyById(id);
        for (int i = 0; i < companies.length; i++) {
            if (companies[i].equals(company)){
                companies[i]=null;
            }

        }
        return companies;
    }
}
