package dsl.learnings.two.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import java.util.List;
import Library.newlib.QuestionBank;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;

public class Insert_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<String> call_getValueMenu_2334151094746209184(SNode thisNode, String context) {
    QuestionBank qb = new QuestionBank();
    List<String> resList = ListSequence.fromList(new LinkedList<String>());
    try {
      String[] result = qb.searchByMenu(context);
      for (int i = 0; i < result.length; i++) {
        ListSequence.fromList(resList).addElement(result[i]);
      }
    } catch (Exception e) {
    }
    return resList;
  }
}
