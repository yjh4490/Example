package Chapter23;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner S = new Scanner(System.in);
		// 입력부
		while (true) { // "그만"이 입력될때까지 입력을 반복
			System.out.println("나라 이름, 인구 >> "); // Korea 5000
			// Scanner로 입력받은것을 변수방에 저장
			String nation = S.next();
			// 변수방에 그만이라는 문자가 들어오면 브레이크(equals)

			if (nation.equals("그만")) {
				break; // 입력끝
			}	
				// 인구를 입력 받아 population변수방에 저장 Scanner.nextlnt();
				int population = S.nextInt();
				// nations.put
				nations.put(nation, S.nextInt()); // 해시맵 나라이름과 인구값이 저장
			}
		

		// 인구검색부
		while (true) {
			System.out.println("인구 검색할 나라명을 입력하세요 >>");
			// Scanner로 입력받음
			String nation = S.next();

			// 변수방에 그만이라는 문자가 들어오면 브레이크(equals)
			if (nation.equals("그만")) {
				break;
			}
			// nations.get으로 인구 추출해서 변방에 저장
			else {
				Integer n = nations.get(nation);
				if (n == null) {
					System.out.println(nation + " 나라는 없습니다.");
				} else {
					System.out.println(n);
				}
			}
		}

	}

}
