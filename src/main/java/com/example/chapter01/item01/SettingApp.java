package com.example.chapter01.item01;

public class SettingApp {

    public static void main(String[] args) {
        Settings settings1 = Settings.getInstance();
        Settings settings2 = Settings.getInstance();

        //동일한 해시코드를 가지는 것을 알 수 있음
        System.out.println(settings1);
        System.out.println(settings2);

        // Boolean 매개 변수로 미리 생성된 객체를 반환
        Boolean.valueOf(false);

        // 플라이웨이트 패턴의 경우 (ex.폰트) 미리 만들어 놓은 객체를 사용하기 때문
    }
}
