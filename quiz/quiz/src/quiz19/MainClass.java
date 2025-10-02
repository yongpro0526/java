package quiz19;

public class MainClass {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        // 학생 추가
        manager.addStudent("2025001", "홍길동");
        manager.addStudent("2025002", "이순신");
        manager.addStudent("2025003", "유관순");

        // 학생 조회
        System.out.println("조회(2025001): " + manager.getStudent("2025001")); // 홍길동
        System.out.println("조회(9999999): " + manager.getStudent("9999999")); // 없습니다.

        // 전체 학생 출력
        System.out.println("\n=== 전체 학생 목록 ===");
        manager.printAllStudents();

        // 학생 삭제
        System.out.println("\n삭제(2025002): " + manager.removeStudent("2025002")); // true
        System.out.println("삭제(9999999): " + manager.removeStudent("9999999")); // false

        // 전체 학생 수
        System.out.println("\n현재 학생 수: " + manager.getStudentCount());

        // 최종 학생 목록 출력
        System.out.println("\n=== 최종 학생 목록 ===");
        manager.printAllStudents();
    }
}
