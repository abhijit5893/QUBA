package dsl.learnings.two.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.net.URLEncoder;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

@Generated
public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_1102350216415518486(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "context");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216415525035(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216415643253(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SPropertyOperations.getString(_context.getNode(), "count") != null ? SPropertyOperations.getString(_context.getNode(), "count") : "");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216416182853(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "question_number");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216416588842(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "question_number");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216416592375(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "set_field");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216416597468(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "set_field").equalsIgnoreCase("image")) {
      try {
        return URLEncoder.encode(SPropertyOperations.getString(_context.getNode(), "set_value"), "UTF-8");
      } catch (Exception e) {
      }
    }
    return SPropertyOperations.getString(_context.getNode(), "set_value");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216417103487(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("q", null);
  }

  public static Object propertyMacro_GetPropertyValue_3586797488957649982(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("ans", null);
  }

  public static Object propertyMacro_GetPropertyValue_1102350216417153631(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "Question");
  }

  public static Object propertyMacro_GetPropertyValue_1102350216417182819(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "Subject");
  }

  public static Object propertyMacro_GetPropertyValue_2334151094746166476(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "Difficulty");
  }

  public static Object propertyMacro_GetPropertyValue_3586797488957331488(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.Insert", false, false), "type");
  }

  public static Object propertyMacro_GetPropertyValue_3586797488957356576(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "answerString");
  }

  public static Object propertyMacro_GetPropertyValue_2334151094744240167(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return (SPropertyOperations.getString(_context.getNode(), "list2") != null ? (SPropertyOperations.getString(_context.getNode(), "list3") != null ? 3 : 2) : 1);
  }

  public static Object propertyMacro_GetPropertyValue_1475003049268196537(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "list1");
  }

  public static Object propertyMacro_GetPropertyValue_2334151094744334863(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "list2");
  }

  public static Object propertyMacro_GetPropertyValue_2334151094744336242(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "list3");
  }

  public static Object propertyMacro_GetPropertyValue_9127247475772837160(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "no_of_choices");
  }

  public static Object propertyMacro_GetPropertyValue_3586797488959476589(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("s", null);
  }

  public static Object propertyMacro_GetPropertyValue_3586797488957669749(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("choice_iterator", null);
  }

  public static Object propertyMacro_GetPropertyValue_3586797488958905032(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_3586797488958844049(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.MultipleChoiceAnswer", false, false), "no_of_choices");
  }

  public static Object propertyMacro_GetPropertyValue_1393502119160988878(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.Insert", false, false), "type");
  }

  public static Object propertyMacro_GetPropertyValue_1393502119161001740(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "answerString");
  }

  public static Object propertyMacro_GetPropertyValue_1393502119161008946(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "no_of_choices");
  }

  public static Object propertyMacro_GetPropertyValue_1393502119161019414(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "optional_choices");
  }

  public static Object propertyMacro_GetPropertyValue_486052063160916749(final IOperationContext operationContext, final PropertyMacroContext _context) {
    try {
      return URLEncoder.encode(SPropertyOperations.getString(_context.getNode(), "picture"), "UTF-8");

    } catch (Exception e) {
    }
    return SPropertyOperations.getString(_context.getNode(), "picture");
  }

  public static Object referenceMacro_GetReferent_3586797488958251944(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "answerField");
  }

  public static Object referenceMacro_GetReferent_1102350216417126610(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "QuestionFieldREference");
  }

  public static Object referenceMacro_GetReferent_1102350216416912465(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "QuestionFieldREference");
  }

  public static Object referenceMacro_GetReferent_3586797488957365318(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.Insert", false, false), "answerField");
  }

  public static Object referenceMacro_GetReferent_3586797488958949898(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.MultipleChoiceAnswer", false, false), "choiceField");
  }

  public static Object referenceMacro_GetReferent_3586797488959512927(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.MultipleChoiceAnswer", false, false), "choicesArrayField");
  }

  public static Object referenceMacro_GetReferent_3586797488958923875(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.MultipleChoiceAnswer", false, false), "choiceField");
  }

  public static Object referenceMacro_GetReferent_3586797488957302278(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.Insert", false, false), "answerField");
  }

  public static Object referenceMacro_GetReferent_3586797488959519259(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "choicesArrayField");
  }

  public static Object referenceMacro_GetReferent_486052063159559560(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.learnings.two.structure.Insert", false, false), "QuestionFieldREference");
  }

  public static SNode sourceNodeQuery_7300777354387386182(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "Answer", true);
  }

  public static SNode sourceNodeQuery_486052063160483698(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "images", true);
  }

  public static Iterable sourceNodesQuery_6264484870202487870(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "body", true);
  }

  public static Iterable sourceNodesQuery_3586797488958853547(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "choice_list", true);
  }
}
