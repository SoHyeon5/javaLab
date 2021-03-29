package sec03.exam01_equals;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) { // equals 메소드를 주소값 비교가 아닌 문자열 비교로 바꾸기
		if(obj instanceof Member) {
			Member member = (Member) obj; // 강제타입변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
	
	

}
