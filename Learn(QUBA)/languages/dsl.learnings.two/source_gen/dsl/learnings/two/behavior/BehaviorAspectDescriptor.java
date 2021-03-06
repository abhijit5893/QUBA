package dsl.learnings.two.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BehaviorDescriptor;
import java.util.Arrays;
import jetbrains.mps.smodel.runtime.interpreted.BehaviorAspectInterpreted;

public class BehaviorAspectDescriptor implements jetbrains.mps.smodel.runtime.BehaviorAspectDescriptor {
  public BehaviorAspectDescriptor() {
  }

  public BehaviorDescriptor getDescriptor(String fqName) {
    switch (Arrays.binarySearch(stringSwitchCases_846f5o_a0a0b, fqName)) {
      case 0:
        return new DDL_BehaviorDescriptor();
      case 4:
        return new Insert_BehaviorDescriptor();
      case 9:
        return new Update_BehaviorDescriptor();
      case 10:
        return new ViewAll_BehaviorDescriptor();
      case 2:
        return new EmptyLine_BehaviorDescriptor();
      case 1:
        return new Delete_BehaviorDescriptor();
      case 7:
        return new SearchBy_BehaviorDescriptor();
      case 11:
        return new WordAnswer_BehaviorDescriptor();
      case 6:
        return new Report_BehaviorDescriptor();
      case 8:
        return new SubjectReference_BehaviorDescriptor();
      case 5:
        return new MultipleChoiceAnswer_BehaviorDescriptor();
      case 3:
        return new Image_BehaviorDescriptor();
      default:
        return BehaviorAspectInterpreted.getInstance().getDescriptor(fqName);
    }
  }

  private static String[] stringSwitchCases_846f5o_a0a0b = new String[]{"dsl.learnings.two.structure.DDL", "dsl.learnings.two.structure.Delete", "dsl.learnings.two.structure.EmptyLine", "dsl.learnings.two.structure.Image", "dsl.learnings.two.structure.Insert", "dsl.learnings.two.structure.MultipleChoiceAnswer", "dsl.learnings.two.structure.Report", "dsl.learnings.two.structure.SearchBy", "dsl.learnings.two.structure.SubjectReference", "dsl.learnings.two.structure.Update", "dsl.learnings.two.structure.ViewAll", "dsl.learnings.two.structure.WordAnswer"};
}
