package dsl.Learnings.one.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.AggregationCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPartExt;
import jetbrains.mps.lang.editor.generator.internal.PrimaryReplaceChildMenuCellMenuPart;

public class TYPEBlock_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_paqhgs_a(editorContext, node);
  }

  private EditorCell createCollection_paqhgs_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_paqhgs_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createRefNodeList_paqhgs_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createRefNodeList_paqhgs_a0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new TYPEBlock_Editor.commands_bodyListHandler_paqhgs_a0(node, "commands_body", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_commands_body");
    Style style = new StyleImpl();
    style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
    editorCell.getStyle().putAll(style);
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private static class commands_bodyListHandler_paqhgs_a0 extends RefNodeListHandler {
    public commands_bodyListHandler_paqhgs_a0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return this.nodeFactory(listOwner, editorContext);
    }

    public SNode nodeFactory(SNode node, EditorContext editorContext) {
      return SConceptOperations.createNewNode("dsl.Learnings.one.structure.EmptyLineType", null);
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
        elementCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new AggregationCellContext(listOwner, elementNode, super.getLinkDeclaration()), new SubstituteInfoPartExt[]{new TYPEBlock_Editor.TYPEBlock_commands_body_cellMenu_paqhgs_a0a0()}));
      }
    }
  }

  public static class TYPEBlock_commands_body_cellMenu_paqhgs_a0a0 extends PrimaryReplaceChildMenuCellMenuPart {
    public TYPEBlock_commands_body_cellMenu_paqhgs_a0a0() {
    }
  }
}
