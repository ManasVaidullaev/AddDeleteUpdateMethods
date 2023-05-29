package Service.ServiceImpl;

import Package1.model.Group;

public interface GroupServiceMethod {
    Group[]saveGroup(Long companyId, Group... groups);
    Group getById(Long id);
    Group[]getAllGroupsByCompanyId(Long companyId);
    Group updateGroupByName(String name,Group group);
    String deleteGroupByCompanyId(Long companyId,Long groupId);
}
