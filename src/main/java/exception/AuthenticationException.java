package exception;
import java.io.Serializable;

public class AuthenticationException extends Exception implements Serializable {

    private static final long serialVersionUID = 1L;

    public AuthenticationException(String message) {
        super(message);
    }
}
