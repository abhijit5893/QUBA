package dsl.learnings.two.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;

public class ConstraintsAspectDescriptor implements jetbrains.mps.smodel.runtime.ConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  public ConstraintsDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_2qnle6_a0a0b, fqName)) {
      case 4:
        return new SubjectReference_Constraints();
      case 3:
        return new Report_Constraints();
      case 0:
        return new Delete_Constraints();
      case 5:
        return new Update_Constraints();
      case 1:
        return new Insert_Constraints();
      case 2:
        return new MultipleChoiceAnswer_Constraints();
      default:
        // todo: illegal in some cases? 
        return new BaseConstraintsDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_2qnle6_a0a0b = new String[]{"dsl.learnings.two.structure.Delete", "dsl.learnings.two.structure.Insert", "dsl.learnings.two.structure.MultipleChoiceAnswer", "dsl.learnings.two.structure.Report", "dsl.learnings.two.structure.SubjectReference", "dsl.learnings.two.structure.Update"};
}
