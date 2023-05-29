import Package1.model.Company;
import Package1.model.Group;
import Service.CompanyService;
import Service.ServiceImpl.CompanyServiceImpl;
import Service.ServiceImpl.GroupService;

import java.time.LocalDate;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CompanyServiceImpl companyService=new CompanyServiceImpl();
        System.out.println(companyService.createCompany(new Company(1L, "Peaksoft", "grajdanskaya 127", "Kyrgyzstan"), new Company(2l, "itrun", "fdgds125", "kitay")));
        System.out.println("----------------------------------------------");
        System.out.println(Arrays.toString(companyService.getAllCompanies()));
        System.out.println("-----------------------------------------------");
        System.out.println(companyService.getCompanyById(2L));
        System.out.println("------------------------------------------------");
        System.out.println(companyService.updateCompany(2L, new Company(3L, "secom", "dvvsv", "vssvv")));
        System.out.println("-------------------------------------------------");
        System.out.println(Arrays.toString(companyService.getAllCompanies()));
        System.out.println("-------------------------*********************-------------------------");
//        System.out.println(Arrays.toString(companyService.deleteCompany(1L)));



        System.out.println("********************************************************************");

        GroupService groupService=new GroupService(companyService);
        System.out.println(Arrays.toString(groupService.saveGroup(1L, new Group(55L, "java-10", LocalDate.of(2002, 5, 8)))));


    }
}