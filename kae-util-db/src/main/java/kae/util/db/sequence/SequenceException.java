package kae.util.db.sequence;

public class SequenceException extends Exception {

  public SequenceException() {}

  public SequenceException(String message) {
    super(message);
  }

  public SequenceException(String message, Throwable cause) {
    super(message, cause);
  }

  public SequenceException(Throwable cause) {
    super(cause);
  }
}
