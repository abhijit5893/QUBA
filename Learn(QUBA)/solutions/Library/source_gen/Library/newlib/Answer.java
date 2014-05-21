package Library.newlib;

/*Generated by MPS */


public class Answer {

  /**
   * Answer belongs to the model layer. It has two variables namely Answer type and the corresponding answer key
   */
  private String type;
  private String keyAnswer;



  /**
   * Argument constructor
   */
  public Answer(String type, String keyAnswer) {
    this.type = type;
    this.keyAnswer = keyAnswer;
  }

  public String getKeyAnswer() {
    return keyAnswer;
  }

  public void setKeyAnswer(String keyAnswer) {
    this.keyAnswer = keyAnswer;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }
}