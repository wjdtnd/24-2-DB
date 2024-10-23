//package Library;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class BookManagementController {
//    private static Random scanner;
//
//    public static String createBook() {
//        ArrayList<String> books = new ArrayList<String>();
//
//        System.out.println("<<도서 추가>>\n" +
//                            "================================\n");
//
//        System.out.println("책의 제목을 입력해주세요. : ");
//        String inputTitle = scanner.nextLine();
//        books.add(inputTitle);
//
//        System.out.println("책의 저자명을 입력해주세요. : ");
//        String inputAuthor = scanner.nextLine();
//        books.add(inputAuthor);
//
//        System.out.println("책의 출판사를 입력해주세요. : ");
//        String inputPublisher = scanner.nextLine();
//        books.add(inputPublisher);
//
//        System.out.println("책의 가격을 입력해주세요. : ");
//        String inputPrice = scanner.nextLine();
//        books.add(inputPrice);
//
//        System.out.println("책의 장르를 입력해주세요. : ");
//        String inputGenre = scanner.nextLine();
//        books.add(inputGenre);
//
//        System.out.println("책의 페이지 수를 입력해주세요. : ");
//        String inputPage = scanner.nextLine();
//        books.add(inputPage);
//
//        System.out.println("책의 언어 입력해주세요. : ");
//        String inputLanguage = scanner.nextLine();
//        books.add(inputLanguage);
//
//        System.out.println("책의 ISBN을 입력해주세요. : ");
//        String inputISBN = scanner.nextLine();
//        books.add(inputISBN);
//
//        System.out.println("책의 초판발행년도를 입력해주세요. : ");
//        String inputYear = scanner.nextLine();
//        books.add(inputYear);
//
//        System.out.println("책의 전차책 등록 여부 입력해주세요. : ");
//        String inputBoolean = scanner.nextLine();
//        books.add(inputBoolean);
//    }
//
//
//
//    public static String readBook() {
//        System.out.println("<<도서 조회>>\n" +
//                           "================================\n");
//        for(int i=0;i<books.size();i++){
//            System.out.printf("%s ",books.get(i));
//        }
//    }
//
//
//    public static String updateBook() {
//        System.out.println("<<도서 정보 변경>>\n" +
//                          "================================\n");
//
//        System.out.println("수정할 정보를 선택하여주세요. : \n" +
//                            "[0] 책 제목 [1] 저자명 [2] 출판사 [3] 가격 [4] 장르 [5" +
//                "" +
//                "" +
//                "" +
//                "" +
//                "" +
//                "] 페이지 수 [6] 언어 [7] ISBN [8] 발행년도 [9] 전차책 여부");
//        int updateNum = scanner.nextInt();
//
//        System.out.println("수정할 정보를 입력하여주세요. : ");
//        String updateInfo = scanner.nextLine();
//        books.set(updateNum,updateInfo);
//    }
//
//    public static String deleteBook() {
//        System.out.println("<<도서 삭제>>\n" +
//                          "================================\n");
//
//        System.out.println("수정할 책을 선택하여주세요. : \n" +
//                "[0] 책 제목 [1] 저자명 [2] 출판사 [3] 가격 [4] 장르 [5] 페이지 수 [6] 언어 [7] ISBN [8] 발행년도 [9] 전차책 여부");
//        int updateNum = scanner.nextInt();
//    }
//
//}
