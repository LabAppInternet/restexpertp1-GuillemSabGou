package cat.tecnocampus.notes.apiRest.frontendException;

import cat.tecnocampus.notes.application.exception.NoteDoesNotExistException;
import cat.tecnocampus.notes.application.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExceptionHandlingAdvice {

    @ResponseBody
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "User not found")
    String objectNotFoundHandler(Exception ex) {
        return ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(NoteDoesNotExistException.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Note does not exist")
    String noteDoesNotExist(Exception ex) {
        return ex.getMessage();
    }
}
