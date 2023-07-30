## BattleCruzer Development LAB의 구조

# 구조
- 자바, 프로젝트, 핵심이 되는 프로그램의 프로젝트를 일종의 'ship' (='BattleCruzer Development LAB') 으로 생각

- 각각의 기본클래스나 자바에서 기본으로 제공하는것에대하여는
도구 생각(String : StringBuilder, String : split..)

- 특정한 프로그램에서 고유의 클래스들은 일종의 부품으로 생각
(HttpServletRequest, Mapper..)

- BattleCruzer = 도구 + 부품 

# StringBuilder(lab1/PtStringBuilder)
## 기본 개념 
```text
StringBuilder의 기본 개념
1. 가변성을 가진 문자열을 다루기 위해 사용되는 클래스
2. 문자열을 연결하거나 수정할때 String과 비교하였을때, 효율이 높음
3.
StringBuilder (가변성 : mutable) <--> String(불변성 :immutable)
```

```java
     // [사용법과 활용]
        StringBuilder sb = new StringBuilder(); // sb객체생성

        // 문자열 추가 1
        sb.append("hello, "); // "hello, "
        sb.append("world!"); // "hello, world"
        System.out.println("결과 1: " + sb.toString());

        System.out.println("====================================================");

        // 문자열 추가 2
        sb.append(" ").append("My demian is here :)");

        System.out.println("====================================================");

        // 문자열 삽입
        sb.insert(7, "wonderful");
        System.out.println("결과 2: " + sb.toString());

        System.out.println("====================================================");

        // 문자열 삭제
        sb.delete(0, 7);
        System.out.println("결과 3: " + sb.toString());

        System.out.println("====================================================");

        // 문자열 역순으로 반환
        sb.reverse();
        System.out.println("결과 4: " + sb.toString());
        sb.reverse();
        System.out.println("결과 5: " + sb.toString());

        System.out.println("====================================================");

        // 문자열 치환 
         sb.replace(16, 18, "vv");
         System.out.println("결과 6: " + sb.toString());

```
