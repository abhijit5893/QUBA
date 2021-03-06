package dsl.learnings.two.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
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
import dsl.learnings.two.behavior.Report_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Report_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_p0otws_a(editorContext, node);
  }

  private EditorCell createCollection_p0otws_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_p0otws_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_p0otws_a0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_p0otws_b0(editorContext, node));
    if (renderingCondition_p0otws_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_p0otws_c0(editorContext, node));
    }
    if (renderingCondition_p0otws_a3a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_p0otws_d0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createComponent_p0otws_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    return editorCell;
  }

  private EditorCell createProperty_p0otws_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("list1");
    provider.setNoTargetText("<no list1>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_list1");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new Report_Editor.Report_list1_cellMenu_p0otws_a0b0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  public static class Report_list1_cellMenu_p0otws_a0b0 extends AbstractCellMenuPart_PropertyValues {
    public Report_list1_cellMenu_p0otws_a0b0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return Report_Behavior.call_getMenu_1475003049267352357(node);
    }
  }

  private EditorCell createProperty_p0otws_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("list2");
    provider.setNoTargetText("<next filter>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_list2");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new Report_Editor.Report_list2_cellMenu_p0otws_a0c0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_p0otws_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "list1") != null;
  }

  public static class Report_list2_cellMenu_p0otws_a0c0 extends AbstractCellMenuPart_PropertyValues {
    public Report_list2_cellMenu_p0otws_a0c0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return Report_Behavior.call_Menu_1475003049268302347(node, SPropertyOperations.getString(node, "list1"));
    }
  }

  private EditorCell createProperty_p0otws_d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("list3");
    provider.setNoTargetText("<next filter>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_list3");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPartExt[]{new Report_Editor.Report_list3_cellMenu_p0otws_a0d0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_p0otws_a3a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "list2") != null;
  }

  public static class Report_list3_cellMenu_p0otws_a0d0 extends AbstractCellMenuPart_PropertyValues {
    public Report_list3_cellMenu_p0otws_a0d0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      return Report_Behavior.call_Menu_1475003049268429457(node, SPropertyOperations.getString(node, "list1"), SPropertyOperations.getString(node, "list2"));
    }
  }
}
