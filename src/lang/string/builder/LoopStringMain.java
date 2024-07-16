package lang.string.builder;

public class LoopStringMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

//        String result = "";
        for (int i = 0; i < 100000; i++) {
//            result += "Hello Java";
            sb.append("Hello Java");
        }

        long endTime = System.currentTimeMillis();

        String result = sb.toString();
        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime) + "ms");
    }
}

/*
StringBuilder vs StringBuffer
 */