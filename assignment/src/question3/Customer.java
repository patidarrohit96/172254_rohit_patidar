package question3;


public class Customer {
	String name;
	boolean member;
	public Customer() {
		this.member=false;
	}
    public Customer(String name, boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }
	public Customer(String name) {
		this.name=name;
	}
	public boolean isMember() {
		return this.member;
	}
	public void setMember(boolean member) {
		this.member = member;
	}
	String memberType;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMemberType() {
		return this.memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	@Override
	public String toString() {
		return "DiscountRate [name=" + name + ", member=" + member + ", memberType=" + memberType + "]";
	}
}
