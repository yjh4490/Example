package Chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner S = new Scanner(System.in);
		// �Էº�
		while (true) { // "�׸�"�� �Էµɶ����� �Է��� �ݺ�
			System.out.println("���� �̸�, �α� >> "); // Korea 5000
			// Scanner�� �Է¹������� �����濡 ����
			String nation = S.next();
			// �����濡 �׸��̶�� ���ڰ� ������ �극��ũ(equals)

			if (nation.equals("�׸�")) {
				break; // �Է³�
			}	
				// �α��� �Է� �޾� population�����濡 ���� Scanner.nextlnt();
				int population = S.nextInt();
				// nations.put
				nations.put(nation, S.nextInt()); // �ؽø� �����̸��� �α����� ����
			}
		

		// �α��˻���
		while (true) {
			System.out.println("�α� �˻��� ������� �Է��ϼ��� >>");
			// Scanner�� �Է¹���
			String nation = S.next();

			// �����濡 �׸��̶�� ���ڰ� ������ �극��ũ(equals)
			if (nation.equals("�׸�")) {
				break;
			}
			// nations.get���� �α� �����ؼ� ���濡 ����
			else {
				Integer n = nations.get(nation);
				if (n == null) {
					System.out.println(nation + " ����� �����ϴ�.");
				} else {
					System.out.println(n);
				}
			}
		}

	}

}
