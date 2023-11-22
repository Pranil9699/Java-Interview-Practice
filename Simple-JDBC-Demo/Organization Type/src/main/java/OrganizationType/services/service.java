package OrganizationType.services;

import OrganizationType.model.OrganizationType;
import OrganizationType.repository.repository;
public class service {

	public static void saving(OrganizationType org_class) {
		repository.saving(org_class);	
	}
	
	public static void updating(OrganizationType org_class,String oldcode, String oldname) {
		repository.updating(org_class,oldcode,oldname);
	}
	
}
