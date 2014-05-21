package dsl.Learnings.one.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

@Generated
public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_6623894086606623676(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("qp", null);
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597049987(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597405823(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("subject", null);
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597405832(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6623894086605025612(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("type", null);
  }

  public static Object propertyMacro_GetPropertyValue_6623894086606041314(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_3586797488951598536(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), "choices");
  }

  public static Object propertyMacro_GetPropertyValue_5593897793173849988(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7607300039655965043(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(_context.getNode(), "mark", true), "positive_mark");
  }

  public static Object propertyMacro_GetPropertyValue_7607300039655992221(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(SLinkOperations.getTarget(_context.getNode(), "mark", true), "negative_mark");
  }

  public static Object propertyMacro_GetPropertyValue_1474237814134356563(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597778283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("qp", null);
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597979037(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "list", true)).count();
  }

  public static Object propertyMacro_GetPropertyValue_4903500976598902445(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597546724(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "difficulty");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976597548461(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "count");
  }

  public static Object propertyMacro_GetPropertyValue_6396140610406378952(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getBoolean(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.QTYPE", false, false), "choices");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976599720915(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "list", true)).count();
  }

  public static Object propertyMacro_GetPropertyValue_4903500976599631333(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976599108393(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("type", null);
  }

  public static Object propertyMacro_GetPropertyValue_4903500976600544200(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "list", true)).count();
  }

  public static Object propertyMacro_GetPropertyValue_4903500976600662125(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_4903500976600750240(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("lsub", null);
  }

  public static Object propertyMacro_GetPropertyValue_4680510462752657735(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_4680510462752814490(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_4680510462752821771(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object propertyMacro_GetPropertyValue_4680510462752827056(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "text");
  }

  public static Object referenceMacro_GetReferent_6623894086606662346(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "QPDec");
  }

  public static Object referenceMacro_GetReferent_6623894086607525998(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "QPDec");
  }

  public static Object referenceMacro_GetReferent_6623894086607528340(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "QPDec");
  }

  public static Object referenceMacro_GetReferent_7607300039655875581(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.SetQP", false, false) != null ? _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.SetQP", false, false), "QPDec") : _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.RepeatQuestionPaper", false, false), "RepeatQPDec"));
  }

  public static Object referenceMacro_GetReferent_7751232820941182152(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.SetQP", false, false) != null ? _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.SetQP", false, false), "QPDec") : _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.RepeatQuestionPaper", false, false), "RepeatQPDec"));
  }

  public static Object referenceMacro_GetReferent_4903500976597795803(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "RepeatQPDec");
  }

  public static Object referenceMacro_GetReferent_4903500976597811116(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "RepeatQPDec");
  }

  public static Object referenceMacro_GetReferent_4903500976597811127(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "RepeatQPDec");
  }

  public static Object referenceMacro_GetReferent_4903500976597497694(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.SetQP", false, false) != null ? _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.SetQP", false, false), "QPDec") : _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.RepeatQuestionPaper", false, false), "RepeatQPDec"));

  }

  public static Object referenceMacro_GetReferent_4903500976597529340(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.QTYPE", false, false) != null ? _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.QTYPE", false, false), "TypeDec") : _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.RepeatType", false, false), "RepeatTypeDec"));

  }

  public static Object referenceMacro_GetReferent_4903500976597535791(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.Subject", false, false) != null ? _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.Subject", false, false), "subjectDec") : _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "dsl.Learnings.one.structure.RepeatSubject", false, false), "RepeatSubDec"));
  }

  public static SNode sourceNodeQuery_6623894086607804308(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_6623894086607041836(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_6623894086605439492(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static Iterable sourceNodesQuery_5593897793173688032(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(SLinkOperations.getTarget(_context.getNode(), "body", true), "commands_body", true);
  }

  public static Iterable sourceNodesQuery_4903500976597457129(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "Field", true);
  }

  public static Iterable sourceNodesQuery_5593897793173440593(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "commands", true);
  }

  public static Iterable sourceNodesQuery_5593897793173727641(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "commands_body", true);
  }

  public static Iterable sourceNodesQuery_6623894086605283569(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "commands_body", true);
  }

  public static Iterable sourceNodesQuery_6623894086606839627(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "commands_body", true);
  }

  public static Iterable sourceNodesQuery_4903500976598910610(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "list", true);
  }

  public static Iterable sourceNodesQuery_4903500976597334449(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "body", true);
  }

  public static Iterable sourceNodesQuery_4903500976599626086(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "list", true);
  }

  public static Iterable sourceNodesQuery_4903500976599138020(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "body", true);
  }

  public static Iterable sourceNodesQuery_4903500976600659847(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "list", true);
  }

  public static Iterable sourceNodesQuery_4903500976600713440(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "body", true);
  }
}
