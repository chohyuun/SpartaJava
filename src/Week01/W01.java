package Week01;
// JDK(Java Development Kit) 역할
// 1. compiler: .java -> .class
// 2. JRE : Java Runtime Environment(자바 실행 환경)
// 3. JDB : Java Debugger -> debugging
//
// public : 클랙스 경로 외부에서 접근 가능 한지 여부 ( public : 실행 가능 )
public class W01 {
//     main method : java에서 가장 먼저 실행 됨
//     static : 이 프로그램 실행 시 무조건 실행 -> 앱 실행 시 한번만 정의 OR static 끼리 호출 가능
//
//     void: return 값이 없음
//     String[] args: 매개변수
    public static void main(String[] args) {
//        System.out.println(7); // int
//        System.out.println(3); // int
//        System.out.println(3.14); // float
//        System.out.println("java"); // string

        // 변수(변하는 저장 공간), 상수(한 번 정해지면 변하지 않는 저장 공간)
        // type name : 변수 선언
        // final type name : 상수 선언

        // data type
        // 기본형 : 논리형(boolean), 문자형(char), 정수형(byte, short, int, long: 표현 범위 차이), 실수형(float, double; 값 구분자로 f를 뒤에 붙임(접미사))
        // 참조형 : 문자열(String), 그 외(Object, Array, List)
        // 래퍼 클래스 변수(Wrapper Class) : 기본형 변수를 클래스로 한번 랩핑 한 변수

        boolean flag = true; // 논리형
        final boolean flag1 = false; // 상수

        char alphabet = 'A'; // 문자형

        byte byteNum = 127; // -128 ~ 127
        short shortNum = 32767; // -32,768 ~ 32,767
        int intNum = 4325652;
        long longNum = 2354362L;

        float floatNum = 3.14f; // 4byte
        double doubleNum = 3.1654376734; // 8byte

        String helloWorld = "Hello World"; // 맨 뒤에 \0(널 문자) 들어감

        int[] a = {1, 2, 3}; // array 선언

//        System.out.println(Arrays.toString(a)); // array는 Arrays.toString()으로 호출

        // Wrapper Class
        // Integer num = new Integer(a); // boxing(new Wrapper() 방식은 이제 사용 안함)
        int numberWrapping = 22;
        Integer num = numberWrapping; // boxing

        System.out.println(num); // unBoxing
    }
}
