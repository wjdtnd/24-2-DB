package ch11.ex_11_1_2_3;

public class G24 implements Alarm, Phone, Message {
    @Override
    public void playMusic(String musicTitle) {
        System.out.println(musicTitle + "음악을 재생한다.");
    }

    @Override
    public void beep() {
        System.out.println("beep 음이 삐삐삐삐--- 발생한다.");
    }

    @Override
    public void sendMessage(String content) {
        System.out.println(content + "메시지를 전송한다.");
    }

    @Override
    public void receiveMessage(String content) {
        System.out.println(content + "메시지를 받는다.");
    }

    @Override
    public void callPhone(String phoneNumber) {
        System.out.println(phoneNumber + "로 전화를 건다.");
    }

    @Override
    public void receivePhone(String phoneNumber) {
        System.out.println(phoneNumber + "의 전화를 받는다.");
    }


}
