public class Edu_Inheritance {
    public static void main(String[] args){
        Dog dog = new Dog("poppy");
        System.out.println(dog.getName());
    }
}

class Animal {
    private String name;
    //클래스 외부에서 건드리지 못하게 접근 지정자로 제한

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

class Dog extends Animal{
    //Animal 클래스를 상속 받음
    //기능 또한 받음.
    //해당 클래스에 메소드를 추가하면 이는 기능 확장
    //다중 상속은 자바에서 지원하지 않음

    Dog(String name){
        this.setName(name);
    }
    //생성자 사용
    //메소드 명이 클래스 명과 동일하고 리턴 자료형을 정의하지 않는 메소드를 생성자라고 함
    //void 도 사용하지 않음.
}