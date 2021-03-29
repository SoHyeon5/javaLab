package sec04.exam01_objects;

import java.util.Comparator;
import java.util.Objects;

public class CompareExample {

	public static void main(String[] args) {
		
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(2);
		
		int result1 = Objects.compare(s1, s2, new StudentComparator());
		System.out.println(result1); // 0 (s1 == s2)
		
		int result2 = Objects.compare(s1, s3, new StudentComparator());
		System.out.println(result2); // -1 (s1 < s3)
		
		int result3 = Objects.compare(s3, s1, new StudentComparator());
		System.out.println(result3); // 1 (s3 > s1)

	}
	
	// 정적 멤버 클래스
	static class Student {
		int sno;
		Student(int sno) {
			this.sno = sno;
		}
	}
	
	static class StudentComparator implements Comparator<Student> {

		@Override
		public int compare(Student a, Student b) {
			return Integer.compare(a.sno, b.sno);
		}
		
	}

}
