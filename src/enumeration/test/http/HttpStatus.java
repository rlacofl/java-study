package enumeration.test.http;

public enum HttpStatus {

    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");


    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code) {
        // ENUM 꺼내기
        HttpStatus[] values = values();
        for (HttpStatus status : values) {
            // ENUM의 code와 인수로 넘어와서 입력받은 code가 같으면 해당 ENUM 반환
            if (status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    // 200 ~ 299
    public boolean isSuccess() {
        return code >= 200 && code <= 299;
    }

    // 조회 getter
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
}
