package dsl.Learnings.one.sandbox.test;

/*Generated by MPS */

import javax.swing.SwingUtilities;
import Library.newlib.QuestionBank;
import Library.newlib.QuestionPaper;

public class Begin {


  public Begin() throws Exception {



  }

  public static void main(String[] args) throws Exception {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        try {
          QuestionBank qb = new QuestionBank();
          int ti;
          int si;
          int di;
          int temptype;
          int tempsub;
          int tempdiff;
          String subject;
          String qp_code;
          String[] codes;
          String[] types;
          String[] subjects;
          String[] difficulties;

          QuestionPaper qp_a0;
          qp_code = "A";
          qp_a0 = new QuestionPaper(qp_code);
          System.out.println("Section" + "A");
          String type_a0a0a0 = "Word";
          boolean show_choices = false;
          String subject_a0a0a0a0 = "a";
          qp_a0.prepare(type_a0a0a0, subject_a0a0a0a0, "1", "1", false);
          qp_a0.getmarks(0, 0);
          qp_a0.pushSection("A");
          qp_a0.showPaper(qp_a0.code);

        } catch (Exception e) {
        }
      }
    });
  }


}