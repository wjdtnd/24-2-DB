package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagementController {
    private static ArrayList<BookDTO> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void createBook() {
        BookDTO book = new BookDTO();
        System.out.println("<<도서 추가>>\n" +
                "================================\n");

        System.out.print("책의 제목을 입력해주세요: ");
        book.setInputTitle(scanner.nextLine());

        System.out.print("책의 저자명을 입력해주세요: ");
        book.setInputAuthor(scanner.nextLine());

        System.out.print("책의 출판사를 입력해주세요: ");
        book.setInputPublisher(scanner.nextLine());

        System.out.print("책의 가격을 입력해주세요: ");
        book.setInputPrice(scanner.nextLine());

        System.out.print("책의 장르를 입력해주세요: ");
        book.setInputGenre(scanner.nextLine());

        System.out.print("책의 페이지 수를 입력해주세요: ");
        book.setInputPage(scanner.nextLine());

        System.out.print("책의 언어를 입력해주세요: ");
        book.setInputLanguage(scanner.nextLine());

        System.out.print("책의 ISBN을 입력해주세요: ");
        book.setInputISBN(scanner.nextLine());

        System.out.print("책의 초판발행년도를 입력해주세요: ");
        book.setInputYear(scanner.nextLine());

        System.out.print("책의 전자책 등록 여부를 입력해주세요 (Yes/No): ");
        String inputBooleanStr = scanner.nextLine();
        book.setInputBoolean(inputBooleanStr.equalsIgnoreCase("Yes"));

        books.add(book);
        System.out.println("도서가 추가되었습니다.");
    }

    public static void readBook() {
        System.out.println("<<도서 목록>>\n" +
                "================================");
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        // 모든 도서의 정보를 출력
        for (int i = 0; i < books.size(); i++) {
            BookDTO book = books.get(i);
            System.out.println("책 " + (i + 1) + ": ");
            System.out.println(" - 제목: " + book.getInputTitle());
            System.out.println(" - 저자: " + book.getInputAuthor());
            System.out.println(" - 출판사: " + book.getInputPublisher());
            System.out.println(" - 가격: " + book.getInputPrice());
            System.out.println(" - 장르: " + book.getInputGenre());
            System.out.println(" - 페이지 수: " + book.getInputPage());
            System.out.println(" - 언어: " + book.getInputLanguage());
            System.out.println(" - ISBN: " + book.getInputISBN());
            System.out.println(" - 발행년도: " + book.getInputYear());
            System.out.println(" - 전자책 여부: " + (book.isInputBoolean() ? "Yes" : "No"));
            System.out.println("================================");
        }
    }

    private static void displayBookTitles() {
        System.out.println("<<도서 목록>>\n" +
                "================================");
        if (books.isEmpty()) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }

        // 각 도서의 제목만 출력
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". 제목: " + books.get(i).getInputTitle());
        }
        System.out.println("================================");
    }

    public static void updateBook() {
        System.out.println("<<도서 정보 변경>>\n" +
                "================================\n");

        displayBookTitles(); // 제목만 표시하여 수정할 책 선택
        System.out.println("수정할 책의 인덱스를 입력해주세요 (1부터 시작): ");
        int bookIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (bookIndex < 0 || bookIndex >= books.size()) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        System.out.println("수정할 정보를 선택해주세요: \n" +
                "[0] 책 제목 [1] 저자명 [2] 출판사 [3] 가격 [4] 장르 [5] 페이지 수 [6] 언어 [7] ISBN [8] 발행년도 [9] 전자책 여부");
        int updateNum = scanner.nextInt();
        scanner.nextLine();

        System.out.print("수정할 내용을 입력해주세요: ");
        String updateInfo = scanner.nextLine();

        switch (updateNum) {
            case 0:
                books.get(bookIndex).setInputTitle(updateInfo);
                break;
            case 1:
                books.get(bookIndex).setInputAuthor(updateInfo);
                break;
            case 2:
                books.get(bookIndex).setInputPublisher(updateInfo);
                break;
            case 3:
                books.get(bookIndex).setInputPrice(updateInfo);
                break;
            case 4:
                books.get(bookIndex).setInputGenre(updateInfo);
                break;
            case 5:
                books.get(bookIndex).setInputPage(updateInfo);
                break;
            case 6:
                books.get(bookIndex).setInputLanguage(updateInfo);
                break;
            case 7:
                books.get(bookIndex).setInputISBN(updateInfo);
                break;
            case 8:
                books.get(bookIndex).setInputYear(updateInfo);
                break;
            case 9:
                boolean inputBoolean = updateInfo.equalsIgnoreCase("Yes");
                books.get(bookIndex).setInputBoolean(inputBoolean);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        System.out.println("정보가 수정되었습니다.");
    }

    public static void deleteBook() {
        System.out.println("<<도서 삭제>>\n" +
                "================================\n");

        displayBookTitles(); // 제목만 표시하여 삭제할 책 선택
        System.out.println("삭제할 책의 인덱스를 입력해주세요 (1부터 시작): ");
        int bookIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (bookIndex < 0 || bookIndex >= books.size()) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        books.remove(bookIndex);
        System.out.println("도서가 삭제되었습니다.");
    }
}
