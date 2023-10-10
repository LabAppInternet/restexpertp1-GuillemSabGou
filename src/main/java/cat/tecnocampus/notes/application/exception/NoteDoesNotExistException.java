package cat.tecnocampus.notes.application.exception;

public class NoteDoesNotExistException extends RuntimeException {
    public NoteDoesNotExistException(String e) {
        super(e);
    }
}

