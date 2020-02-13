import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주소 : ");
//		next()  :	단어 단위 입력,	키보드 버퍼의 문자열으 공백이 나오기 전 까지 읽어들인다.
//		nextLine() 	: 	줄 단위 입력, 키보드 버퍼가 비어있으면 입력을 요구하며 대기하고 비어있지 않으면 키보드 버퍼의 전체 내용을 읽어들인다.
//		문자열을 제외한 나머지 데이터는 next자료형() 메소드를 사용해서 입력받는다.
		
		
		String address = scanner.nextLine();
		System.out.println("이름 : ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + address + "에 삽니다.");
		
		
		
		
	}

}
