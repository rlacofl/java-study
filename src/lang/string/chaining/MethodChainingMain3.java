package lang.string.chaining;

public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        // 반환된 참조값을 활용해서 메서드 연결 (메서드 체이닝 기법)
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);

        // StringBuilder가 메서드 체이닝 기법 사용 (자기 자신을 계속 반환)
        StringBuilder sb = new StringBuilder();
        String string = sb.append("A").append("B").append("C").append("D")
            .insert(4, "Java")
            .delete(4, 8)
            .reverse()
            .toString();

        System.out.println("string = " + string);
    }
}
