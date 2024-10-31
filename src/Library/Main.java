package Library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // BookManagementView 객체 생성
        BookManagementView view = new BookManagementView();
        view.printTitle();

        while (true) {
            // 메뉴 출력
            System.out.println("메뉴를 선택하세요: \n" +
                    "[1] 도서 추가\n" +
                    "[2] 도서 조회\n" +
                    "[3] 도서 수정\n" +
                    "[4] 도서 삭제\n" +
                    "[5] 종료");

            // 사용자에게 입력을 요청
            int inputNum = 0;
            try {
                inputNum = scanner.nextInt();
                scanner.nextLine();  // nextInt() 후의 개행 문자 처리
            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                scanner.nextLine(); // 버퍼 비우기
                continue; // 잘못된 입력인 경우 반복문 시작
            }

            // 메뉴 선택 후 처리
            switch (inputNum) {
                case 1:
                    BookManagementController.createBook();
                    break;
                case 2:
                    BookManagementController.readBook();
                    break;
                case 3:
                    BookManagementController.updateBook();
                    break;
                case 4:
                    BookManagementController.deleteBook();
                    break;
                case 5:
                    view.printFooter();  // 프로그램 종료
                    return;  // 프로그램 종료
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    continue;  // 잘못된 입력인 경우 반복문 시작
            }

            // 유효한 입력 후 중간 메뉴 출력
            view.printMiddle();
        }
    }
}
