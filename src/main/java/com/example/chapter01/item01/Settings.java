package com.example.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance 사용한다
 * @see #getInstance()
 */

// 셋팅 객체의 생성을 통제하고 싶을 때
public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;

    // 생성자가 private 이면 상속을 받을 수 없음
//    private Settings() {};

    // 정적과 동적을 같이 사용하게되면 정적 생성 메서드의 경우 문서에서 묻힐 수 있기 때문에
    // of, create 명시적 이름으로 사용해서 예방하자 하지만 가장 좋은건 구체적인 문서화를 하자
    public Settings() {};
    public Settings(boolean useAutoSteering, boolean useABS, Difficulty difficulty){
        this.useAutoSteering = useAutoSteering;
        this.useABS = useABS;
        this.difficulty = difficulty;
    }

    private static final Settings SETTINGS = new Settings();

    public static Settings getInstance() {
        return SETTINGS;
    }

}
