package OrganizationType.model;

public class OrganizationType {
protected String typecode;
protected String typeame;
public OrganizationType() {
	super();
	// TODO Auto-generated constructor stub
}
public OrganizationType(String typecode, String typeame) {
	super();
	this.typecode = typecode;
	this.typeame = typeame;
}
public String getTypecode() {
	return typecode;
}
public void setTypecode(String typecode) {
	this.typecode = typecode;
}
public String getTypeame() {
	return typeame;
}
public void setTypeame(String typeame) {
	this.typeame = typeame;
}


}
