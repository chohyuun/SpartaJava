package Week03;

public class Car {
    String company; // 자동차 회사
    String model; // 자동차 모델
    String color; // 자동차 색상
    double price; // 자동차 가격
    double speed;  // 자동차 속도 , km/h
    char gear; // 기어의 상태, P,R,N,D
    boolean lights; // 자동차 조명의 상태

    // 생성자
    public Car() {
        // 기본 생성자(생략 가능)
    }

    // method
    double gasPedal(double kmh) {
        speed = kmh;
        return speed;
    }

    double brakePedal() {
        speed = 0;
        return speed;
    }

    char changeGear(char type) {
        gear = type;
        return gear;
    }

    boolean onOffLight () {
        lights = !lights;
        return lights;
    }

    void horn() {
        System.out.println("빵빵!");
    }


}
