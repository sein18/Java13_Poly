# 다형성(Polymorphism)

* __다형성__ : 객체지향 프로그래밍의 3대 특징 중 하나로 ‘여러 개의 형태를 갖는다’는 의미이다. 하나의 행동으로 여러 가지 일을 수행하는 개념이며, 상속을 이용한 기술로 부모 타입으로부터 파생된 여러 가지 타입의 자식 객체를 부모 클래스 타입 하나로 다룰 수 있는 기술이다.



* __업 캐스팅(Up Casting)__

  * 상속 관계에 있는 부모, 자식 클래스 간에 부모타입의 참조형 변수가 모든 자식 타입의 객체 주소를 받을 수 있다.

  ```java
  //sonata 클래스는 Car 클래스의 후손
  Car c = new Sonata();
  //Sonata클래스형에서 Car클래스형으로 바뀜
  
  //자식 객체의 주소를 전달받은 부모타입의 참조변수를 통해서 사용할 수 있는 후손의 정보는
  //원래 부모타입이었던 멤버만 참조 가능
  ```

* __다운 캐스팅(Down Casting)__

  * 자식 객체의 주소를 받은 부모 참조형 변수를 가지고 자식의 멤버를 참조해야 할 경우, 부모 클래스 타입의 참조형 변수를 자식 클래스 타입으로 형 변환하는 것이며, 자동으로 처리되지 않기 때문에 반드시 후손 타입 명시해서 형 변환이다.

  ```java
  //Sonata 클래스는 Car 클래스의 후손
  Car c = new Sonata();
  ((Sonata)c).moveSonata();
  
  //클래스 간의 형 변환은 반드시 상속 관계에 있는 클래스끼리만 가능
  ```

---



* __instanceof 연산자__

  * 현재 참조형 변수가 어떤 클래스 형의 객체 주소를 참조하고 있는지 확인 할 때 사용 클래스 타입이 맞으면 true, 맞지 않으면 false 반환해준다.

  ```java
  if(레퍼런스 instanceof 클래스타입) {
  //true일때 처리할 내용, 해당 클래스 타입으로 down casting
  }
  //true일때 실행
  if(c instanceof Sonata) {
  ((Sonata)c).moveSonata();
  } else if (c instanceof Avante){
  ((Avante)c).moveAvante();
  } else if (c instanceof Grandure){
  ((Grandure)c).moveGrandure();
  }
  ```

---



* __객체배열과 다형성__

  * 다형성을 이용하여 상속 관계에 있는 하나의 부모 클래스 타입의 배열 공간에 여러 종류의 자식 클래스 객체들을 저장이 가능하다. 

  ```java
  Car[] carArr = new Car[5];
  
  carArr[0] = new Sonata();
  carArr[1] = new Avante();
  carArr[2] = new Grandure();
  carArr[3] = new Spark();
  carArr[4] = new Morning();
  ```

  

* __매개변수와 다형성__

  * 다형성을 이용하여 메소드 호출 시 부모타입의 변수 하나만 사용해 자식 타입의 객체를 받을 수 있다.

  ```java
  public void execute() {
  driveCar(new Sonata()); 
  driveCar(new Avante());
  driveCar(new Grandure());
  }
  public void driveCar(Car c) {}
  ```



---

* __추상 클래스__

  1. 미완성 클래스(abstract 키워드 사용)  : 자체적으로 객체 생성 불가 → 반드시 상속하여 객체 생성 
  2. abstract 메소드가 포함된 클래스는 반드시 abstract 클래스 abstract 메소드가 없어도 abstract 클래스 선언 가능
  3. 클래스 내에 일반 변수, 메소드 포함 가능
  4. 객체 생성은 안되지만 참조형 변수 타입으로는 사용 가능

* __인터페이스__

  * 상수형 필드와 추상 메소드만을 작성할 수 있는 추상 클래스의 변형체이다.
  * 메소드의 통일성을 부여하기 위해 추상 메소드만 따로 모아놓은 것으로 상속 시 인터페이스 내에 정의된 모든 추상메소드 구현해야 한다.
  * __특징__
    * 모든 인터페이스의 메소드는 묵시적으로 public이고 abstract
    * 변수는 묵시적으로 public static final 따라서 인터페이스 변수의 값 변경 시도 시 컴파일 시 에러 발생
    * 객체 생성은 안되나 참조형 변수로는 가능

  ```java
  [접근제한자] interface 인터페이스명 {
  //상수도 멤버로 포함할 수 있음
  public static final 자료형 변수명 = 초기값;
  
  //추상 메소드만 선언 가능
  [public abstract] 반환자료형 메소드명([자료형 매개변수]);
  //public abstract가 생략되기 때문에
  //오버라이딩 시 반드시 public 표기해야 함
  }
  
  ```

  

* __추상클래스와 인터페이스__

|  __구분__   |     __추상 클래스__      |     __인터페이스__     |
| :---------: | :----------------------: | :--------------------: |
|    상속     |        단일 상속         |       다중 상속        |
|    구현     |       extends 사용       |    implements 사용     |
| 추상 메소드 | abstract 메소드 0개 이상 | 모든 메소드는 abstract |
|  abstract   |       명시적 사용        |  묵시적으로 abstract   |
|    객체     |      객체 생성 불가      |     객체 생성 불가     |
|    용도     |        참조 타입         |       참조 타입        |