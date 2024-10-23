//package Library;
//
//import java.util.Random;
//
//public class Main {
//    private static Random scanner;
//
//    public static void main(String[] args) {
//        while(true) {
//            System.out.println("================================\n" +
//                    "도서관리 시스템에 오신걸 환영합니다.\n" +
//                    "원하시는 메뉴를 선택하여 주세요.\n" +
//                    "[1번] 도서 추가하기 [2번] 등록된 도서 조회하기\n" +
//                    "[3번] 도서 정보 변경하기 [4번] 도서 삭제하기 [5번] 프로그램 종료하기");
//
//            int inputNum = scanner.nextInt();
//
//            switch (inputNum) {
//                case 1:
//                    createBook();
//                    continue;
//
//                case 2:
//                    readBook();
//                    continue;
//
//                case 3:
//                    updateBook();
//                    continue;
//
//                case 4:
//                    deleteBook();
//                    continue;
//
//                case 5:
//                    System.out.println("프로그램이 종료됩니다. 이용해주셔서 감사합니다.\n");
//                    break;
//
//                default:
//                    throw new IllegalStateException("Unexpected value: " + inputNum);
//            }
//        }
//
//    }
//}
