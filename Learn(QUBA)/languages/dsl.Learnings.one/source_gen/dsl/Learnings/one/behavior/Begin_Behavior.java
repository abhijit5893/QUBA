package dsl.Learnings.one.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import Library.newlib.QuestionBank;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public class Begin_Behavior {
  public static void init(SNode thisNode) {
  }

  public static void call_SetPath_3446418624918884710(SNode thisNode) {
    System.out.print("PAthSET");
    String data = "trial data";
    QuestionBank qb = new QuestionBank();
    try {
      qb.xmlTool.CreateXMLFile();

      QuestionBank.setPath();

    } catch (Exception e) {
    }

  }

  public static List<String> call_aaa_3446418624919377822(SNode thisNode) {
    List<String> l = ListSequence.fromList(new LinkedList<String>());
    Begin_Behavior.call_SetPath_3446418624918884710(thisNode);
    ListSequence.fromList(l).addElement("aaa");
    ListSequence.fromList(l).addElement("eee");
    return l;
  }
}