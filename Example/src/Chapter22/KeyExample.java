package Chapter22;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {	
		
		//HashMap : Key ���� �ָ� value���� ��ȯ���ִ� �޼ҵ�
	HashMap<Key, String> hashmap = new HashMap<Key, String>();
	
	
	// �ĺ�Ű "new Key(1)"��"ȫ�浿"�� ������
	hashmap.put(new Key(1),"ȫ�浿");
		
		
	// �ĺ�Ű "new Key(1)"��"ȫ�浿"�� ������
	String value = hashmap.get(new Key(1));
	System.out.println(value);
	
	}
}