package Service.ServiceImpl;

import Package1.model.Company;
import Package1.model.Group;

public class GroupService implements GroupServiceMethod{
    private CompanyServiceImpl companyService;

    public GroupService(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    public CompanyServiceImpl getCompanyService() {
        return companyService;
    }

    public void setCompanyService(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    @Override
    public Group[] saveGroup(Long companyId, Group... groups) {
        Company company=companyService.getCompanyById(companyId);
        company.setGroups(groups);
        return company.getGroups();
    }

    @Override
    public Group getById(Long id) {
        return null;
    }

    @Override
    public Group[] getAllGroupsByCompanyId(Long companyId) {
        return new Group[0];
    }

    @Override
    public Group updateGroupByName(String name, Group group) {
        return null;
    }

    @Override
    public String deleteGroupByCompanyId(Long companyId, Long groupId) {
        return null;
    }
}
