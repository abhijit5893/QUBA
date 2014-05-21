package dsl.Learnings.one.editor;

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
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.AggregationCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.PrimaryReplaceChildMenuCellMenuPart;

public class RepeatType_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_e5h1vf_a(editorContext, node);
  }

  private EditorCell createCollection_e5h1vf_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_e5h1vf_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_e5h1vf_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e5h1vf_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e5h1vf_c0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_e5h1vf_d0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e5h1vf_e0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e5h1vf_f0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_e5h1vf_g0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e5h1vf_h0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_e5h1vf_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "jetbrains.mps.lang.core.editor.alias");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    return editorCell;
  }

  private EditorCell createConstant_e5h1vf_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "with");
    editorCell.setCellId("Constant_e5h1vf_b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.TEXT_COLOR, StyleRegistry.getInstance().getSimpleColor(MPSColors.blue));
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e5h1vf_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_e5h1vf_c0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_e5h1vf_d0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new RepeatType_Editor.listListHandler_e5h1vf_d0(node, "list", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_list");
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class listListHandler_e5h1vf_d0 extends RefNodeListHandler {
    public listListHandler_e5h1vf_d0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }

  private EditorCell createConstant_e5h1vf_e0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_e5h1vf_e0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e5h1vf_f0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_e5h1vf_f0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_e5h1vf_g0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new RepeatType_Editor.bodyListHandler_e5h1vf_g0(node, "body", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_body");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, true);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class bodyListHandler_e5h1vf_g0 extends RefNodeListHandler {
    public bodyListHandler_e5h1vf_g0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        if (elementNode != null) {
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        elementCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new AggregationCellContext(listOwner, elementNode, super.getLinkDeclaration()), new SubstituteInfoPartExt[]{new RepeatType_Editor.RepeatType_body_cellMenu_e5h1vf_a0g0()}));
      }
    }
  }

  public static class RepeatType_body_cellMenu_e5h1vf_a0g0 extends PrimaryReplaceChildMenuCellMenuPart {
    public RepeatType_body_cellMenu_e5h1vf_a0g0() {
    }
  }

  private EditorCell createConstant_e5h1vf_h0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_e5h1vf_h0");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
