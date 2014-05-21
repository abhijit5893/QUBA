package dsl.Learnings.one.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import dsl.Learnings.one.behavior.Difficulty_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Difficulty_Constraints extends BaseConstraintsDescriptor {
  public Difficulty_Constraints() {
    super("dsl.Learnings.one.structure.Difficulty");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("difficulty", new BasePropertyConstraintsDescriptor("difficulty", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "difficulty";
        {
          List<String> valid_list = ListSequence.fromList(new LinkedList<String>());
          if ((SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false) != null) && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false) != null) {
            valid_list = Difficulty_Behavior.call_getMenu_7751232820940420515(node, SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false), "name"), SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false), "name"));
          }
          if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false) != null && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatSubject", false, false) != null) {
            List<String> tempa1 = ListSequence.fromList(new LinkedList<String>());
            List<String> tempa2 = ListSequence.fromList(new LinkedList<String>());
            for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatSubject", false, false), "list", true))) {
              ListSequence.fromList(tempa2).addElement(SPropertyOperations.getString(i, "value"));
            }
            ListSequence.fromList(tempa1).addElement(SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false), "name"));
            valid_list = Difficulty_Behavior.call_getLoopMenu_4272570878830918522(node, tempa1, tempa2);
          }
          if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false) != null && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false) != null) {
            List<String> tempa1 = ListSequence.fromList(new LinkedList<String>());
            List<String> tempa2 = ListSequence.fromList(new LinkedList<String>());
            for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false), "list", true))) {
              ListSequence.fromList(tempa2).addElement(SPropertyOperations.getString(i, "value"));
            }
            ListSequence.fromList(tempa1).addElement(SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false), "name"));
            valid_list = Difficulty_Behavior.call_getLoopMenu_4272570878830918522(node, tempa2, tempa1);
          }
          if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false) != null && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatSubject", false, false) != null) {
            List<String> tempa1 = ListSequence.fromList(new LinkedList<String>());
            for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false), "list", true))) {
              ListSequence.fromList(tempa1).addElement(SPropertyOperations.getString(i, "value"));
            }
            List<String> tempa2 = ListSequence.fromList(new LinkedList<String>());
            for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatSubject", false, false), "list", true))) {
              ListSequence.fromList(tempa2).addElement(SPropertyOperations.getString(i, "value"));
            }
            valid_list = Difficulty_Behavior.call_getLoopMenu_4272570878830918522(node, tempa1, tempa2);
          }

          for (int i = 0; i < ListSequence.fromList(valid_list).count(); i++) {
            if ((SPropertyOperations.getString(propertyValue)).equalsIgnoreCase(ListSequence.fromList(valid_list).getElement(i))) {
              return true;
            }
          }
          return false;
        }
      }
    });
    return properties;
  }
}
