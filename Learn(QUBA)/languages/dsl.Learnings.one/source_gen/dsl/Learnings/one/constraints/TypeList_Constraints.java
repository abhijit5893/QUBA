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
import dsl.Learnings.one.behavior.TypeList_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class TypeList_Constraints extends BaseConstraintsDescriptor {
  public TypeList_Constraints() {
    super("dsl.Learnings.one.structure.TypeList");
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
          valid_list = TypeList_Behavior.call_getMenu_7751232820940800221(node);
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
