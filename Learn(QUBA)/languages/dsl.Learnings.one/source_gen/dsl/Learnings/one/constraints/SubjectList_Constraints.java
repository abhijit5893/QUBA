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
import dsl.Learnings.one.behavior.SubjectList_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SubjectList_Constraints extends BaseConstraintsDescriptor {
  public SubjectList_Constraints() {
    super("dsl.Learnings.one.structure.SubjectList");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("value", new BasePropertyConstraintsDescriptor("value", this) {
      @Override
      public boolean hasOwnValidator() {
        return true;
      }

      @Override
      public boolean validateValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "value";
        {
          List<String> valid_list = ListSequence.fromList(new LinkedList<String>());
          if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false) != null) {
            valid_list = SubjectList_Behavior.call_getMenu_4272570878829838961(node, SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false), "name"));
          }
          if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false) != null) {
            List<String> temp = ListSequence.fromList(new LinkedList<String>());
            for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false), "list", true))) {
              ListSequence.fromList(temp).addElement(SPropertyOperations.getString(i, "value"));
            }
            valid_list = SubjectList_Behavior.call_getMenu_7751232820941264588(node, temp);
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
