package Week01;// 숫자 -> 문자
// import : in + port

public class W02 {

    public static void main(String[] args) {
        // 숫자를 문자로 변환
//      Scanner sc = new Scanner(System.in);
//
//      int asciiNumber = sc.nextInt(); // 입력
//      char ch = (char) asciiNumber; // 문자로 형변환을 해주면 숫자에 맞는 문자로 표현됩니다.
//
//      System.out.println(ch);

        // 문자를 숫자로 변환
        // 문자 -> 숫자
//        Scanner sc = new Scanner(System.in);
//
//        char letter = sc.nextLine().charAt(0); // 첫번째 글자만 받아오기위해 charAt(0) 메서드를 사용합니다.
//        int asciiNumber = (int) letter; // 숫자로 형변환을 해주면 저장되어있던 아스키 숫자값으로 표현됩니다.
//
//        System.out.println(asciiNumber);

        // 참조형 변수 -> 주소형 변수
        // 원본의 주소값을 저장(heap 영역 주소를 저장)
        // 기본형 변수 : 원본 값은 stack 에 저장(정적으로 할당된 메모리)
        // heap : 동적으로 할당괸 메모리

        // 형 변환 : 변수의 타입을 바꾸는 방법
        // 명시적 형 변환 : (변경할 타입) 변수
        // 강제 형 변환(캐스팅) : 큰타입에서 작은타입으로 변환 시 값 손실이 생김

        // 자동 형 변환 : byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
        // 작은 크기의 타입이 큰 크기의 타입과 계산될 때 자동으로 큰 크기의 타입으로 변환됨

    }

}