package Reference;

 class Example {   

    /* object 선언 */
   private static Example m_theInstance = null;

   private Example() {
   }
   
   /** 
    * Create and Get Instance
    * applied Singleton Pattern.
    */
   public static Example getInstance() {
       if (m_theInstance == null)
           m_theInstance = new Example();
       return m_theInstance;        
   }
}


public class SingleToneDemo {



}
/*

생성자를 private으로 선언하면 new 로 생성할 수 없게 되고,
 public static 으로 선언한 getInstance() 메소드를 통해서만 객체에 접근 가능하게 만들어 준다.
 
 
   Singleton(싱글톤) 방식은 프로젝트에서 데이터베이스 연결등의 공용 자원 접근에 이런 방식의
    static 적용하면 효율을 높일 수 있는 한 방법이 될 수 있다.

또다른 예로, 절대 변하지 않는 값을 final static으로 선언하면 GC(Gabage Collection)의
 대상이 되지도 않고 클래스 로딩시 메모리에 적재되어 있으므로 효율을 높여 성능향상에 도움이 된다.


*/