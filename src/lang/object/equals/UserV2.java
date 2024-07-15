package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // equals 메서드를 오버라이딩(재정의) 하면, 동등성 비교를 할 수 있음
//    @Override
//    public boolean equals(Object obj) {
//        // equals()는 Object 타입을 매개변수로 사용하기 때문에 객체의 특정 값을 사용하려면 다운캐스팅 필요
//
//        UserV2 user = (UserV2) obj;
//        return id.equals(user.id); // 문자열 비교는 equals() 메서드 사용
//    }


    // generate(Alt + Insert) -> equals() and hashCode() 선택
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }


}
