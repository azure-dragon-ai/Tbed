package cn.hjhai.exception;

/**
 * @author Peter Zhang
 * @version 1.0
 * @date 2023/8/14 10:19
 */
public class CodeException extends RuntimeException {

    public CodeException() {
    }

    public CodeException(String message) {
        super(message);
    }

    public CodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CodeException(Throwable cause) {
        super(cause);
    }

    public CodeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
