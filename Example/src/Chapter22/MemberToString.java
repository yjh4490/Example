package Chapter22;

public class MemberToString {
	private String id;
	private String name;
	
	public MemberToString(String id, String name) {
		this.id=id; this.name=name;
	}
	@Override
	public String toString() {
		return id + " : " + name;
	}
	
	
}
