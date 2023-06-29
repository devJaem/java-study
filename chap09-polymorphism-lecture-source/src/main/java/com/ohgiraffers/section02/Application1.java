package com.ohgiraffers.section02;

public class Application1 {

    public static void main(String[] args) {

        //추상메소드를 0개 이상 포함하는 클래스는 추상클래스
        //클래스 선언부에 abstranct 명시
        //인스턴스 생성불가
        //상송받은 하위 클래스를 이용해서 인스턴스 생성
        //반드시 후손이 오버라이딩

        //사용이유
        //오버라이딩의 강제성을 활용 여러 클래스를 그룹화 하여
        // 필수기능을 정의하여 일관된 인터페이스 제공 가능

        //단점
        //다른 클래스 상송받고있는 클래스는를 작성시 추가상속이 불가
        //위의 경우 인터페이스라는 매커니즘을 활용한다

//        Product product= new Product(); 인스턴스 생성 불가
        Product smartPhone= new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);
        //SmartPhone이면서 동시에 Product 만족함

        Product product= new SmartPhone();
        //레퍼런스 타입 활용 가능

        product.abstMethod();
        //동적바인딩 동작

        product.nonStaticMethod();
        //추상클래스 메소드 호출가능

        Product.staticMethod();
        //static 메소드는 사용가능(인스턴스 생성 불필요)

    }
}

