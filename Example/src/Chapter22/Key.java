package Chapter22;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	// hashcode 오버라이딩(물리적인 주소를 같게만듬)
	@Override
	public int hashCode() {
		
		return number;
	}

	// equals 오버라이딩(논리적인 주소를 같게만듬)
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
		Key compareKey = (Key)obj;
		if(this.number==compareKey.number) {
		return true;	
		}
	}
		return false;
	}
	
	
	
}
