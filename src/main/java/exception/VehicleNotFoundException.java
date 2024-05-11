
package exception;
import java.io.Serializable;
public class VehicleNotFoundException extends Exception implements Serializable  {
	private static final long serialVersionUID = 1L;
    public VehicleNotFoundException(String message) {
        super(message);
    }
}
