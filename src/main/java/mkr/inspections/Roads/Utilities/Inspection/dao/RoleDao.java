package mkr.inspections.Roads.Utilities.Inspection.dao;


import mkr.inspections.Roads.Utilities.Inspection.Domain.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
