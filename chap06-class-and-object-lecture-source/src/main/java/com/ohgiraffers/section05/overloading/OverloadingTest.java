package com.ohgiraffers.section05.overloading;

public class OverloadingTest {

    //오버로딩 (Overloading)
    //동일한 이름의 생성자는 한클래스 내에서 작성 불가능
    //그러나, 매개변수 타입, 갯수, 순서에 따라 서로 다른 메소드나 생성자로 인식됨
    //따라서 동일한 이름의 생성자나 메소드를 작성할수 있기도 함

    //사용이유
    //매개변수의 종류별로 다른동작을 해야하는 경우.
    //동일한 기능인데 매개변수에 따라 이름을 다르게 정의시 복잡하고 관리가 어려움.

    //조건
    //동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를 다르게 작성
    //한 클래스 내에 동일한 이름이 여러개 작성됨

    //메소드의 시그니처
    //method(int num) 부분
    //접근제한자나 반환형은 오버로딩의 성립요건이 아님.

    public void test() {}

    //public void test() {}  //에러발생
    //	private void test() {}//에러발생	//접근제한자는 메소드 시그니처에 해당하지 않는다.
    //	public int test() { return 0; }	//에러발생	//반환형은 메소드 시그니처에 해당하지 않는다.

    public void test(int num) {}
    //	public void test(int num2) {}	//에러발생	//매개변수의 이름은 메소드 시그니처에 영향을 주지 않는다.

    //매개변수 갯수, 타입, 순서는 성립된다
    public void test(int num1, int num2) {}
    public void test(int num, String name) {}
    public void test(String name, int num) {}

}
