package Exception;

import java.io.IOException;

/**
 * @author Stepan Morgachev
 * @date 20.09.2023 18:32
 */
public class DoNotAddMore10Elements extends Exception{
    public DoNotAddMore10Elements(){
        super();
    }

    public DoNotAddMore10Elements(String message){
        super(message);
    }

    public DoNotAddMore10Elements(String message, Throwable cause) {
        super(message, cause);
    }

    public DoNotAddMore10Elements(Throwable cause) {
        super(cause);
    }

    public DoNotAddMore10Elements(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String getMessage() {
        return "-----" + super.getMessage() + "-----";
    }
}
