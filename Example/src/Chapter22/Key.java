package Chapter22;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number=number;
	}

	// hashcode �������̵�(�������� �ּҸ� ���Ը���)
	@Override
	public int hashCode() {
		
		return number;
	}

	// equals �������̵�(������ �ּҸ� ���Ը���)
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
