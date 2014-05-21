package dsl.Learnings.one.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import dsl.Learnings.one.behavior.Difficulty_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class Difficulty_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_1nyfco_a(editorContext, node);
  }

  private EditorCell createCollection_1nyfco_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_1nyfco_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createConstant_1nyfco_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_1nyfco_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_1nyfco_c0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_1nyfco_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_1nyfco_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "difficulty level");
    editorCell.setCellId("Constant_1nyfco_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_1nyfco_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("difficulty");
    provider.setNoTargetText("<no difficulty>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_difficulty");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new Difficulty_Editor.Difficulty_difficulty_cellMenu_1nyfco_a0b0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class Difficulty_difficulty_cellMenu_1nyfco_a0b0 extends AbstractCellMenuPart_PropertyValues {
    public Difficulty_difficulty_cellMenu_1nyfco_a0b0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      if ((SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false) != null) && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false) != null) {
        return Difficulty_Behavior.call_getMenu_7751232820940420515(node, SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false), "name"), SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false), "name"));
      }
      if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false) != null && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatSubject", false, false) != null) {
        List<String> tempa1 = ListSequence.fromList(new LinkedList<String>());
        List<String> tempa2 = ListSequence.fromList(new LinkedList<String>());
        for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatSubject", false, false), "list", true))) {
          ListSequence.fromList(tempa2).addElement(SPropertyOperations.getString(i, "value"));
        }
        ListSequence.fromList(tempa1).addElement(SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.QTYPE", false, false), "name"));
        return Difficulty_Behavior.call_getLoopMenu_4272570878830918522(node, tempa1, tempa2);
      }
      if (SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false) != null && SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false) != null) {
        List<String> tempa1 = ListSequence.fromList(new LinkedList<String>());
        List<String> tempa2 = ListSequence.fromList(new LinkedList<String>());
        for (SNode i : ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.RepeatType", false, false), "list", true))) {
          ListSequence.fromList(tempa2).addElement(SPropertyOperations.getString(i, "value"));
        }
        ListSequence.fromList(tempa1).addElement(SPropertyOperations.getString(SNodeOperations.getAncestor(node, "dsl.Learnings.one.structure.Subject", false, false), "name"));
        return Difficulty_Behavior.call_getLoopMenu_4272570878830918522(node, tempa2, tempa1);
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
        return Difficulty_Behavior.call_getLoopMenu_4272570878830918522(node, tempa1, tempa2);
      }


      return null;
    }
  }

  private EditorCell createConstant_1nyfco_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "number of questions");
    editorCell.setCellId("Constant_1nyfco_c0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_1nyfco_d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("count");
    provider.setNoTargetText("<no count>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_count");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
}
