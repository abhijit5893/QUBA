package QPManifest.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.runtime.PropertyConstraintsDescriptor;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.base.BasePropertyConstraintsDescriptor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.smodel.IScope;
import QPManifest.behavior.ViewManifest_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ViewManifest_Constraints extends BaseConstraintsDescriptor {
  public ViewManifest_Constraints() {
    super("QPManifest.structure.ViewManifest");
  }

  @Override
  protected Map<String, PropertyConstraintsDescriptor> getNotDefaultProperties() {
    Map<String, PropertyConstraintsDescriptor> properties = new HashMap();
    properties.put("title", new BasePropertyConstraintsDescriptor("title", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "title";
        return ViewManifest_Behavior.call_getTitle_6582483045192465798(node);
      }

      @Override
      public boolean hasOwnSetter() {
        return true;
      }

      @Override
      public void setValue(SNode node, String propertyValue, IScope scope) {
        String propertyName = "title";
        SPropertyOperations.set(node, "title", "a");
      }
    });
    properties.put("subject", new BasePropertyConstraintsDescriptor("subject", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "subject";
        return ViewManifest_Behavior.call_getSubject_6582483045192466790(node);
      }
    });
    properties.put("author", new BasePropertyConstraintsDescriptor("author", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "author";
        return ViewManifest_Behavior.call_getAuthor_6582483045193075131(node);
      }
    });
    properties.put("duration", new BasePropertyConstraintsDescriptor("duration", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "duration";
        return ViewManifest_Behavior.call_getDuration_6582483045193077341(node);
      }
    });
    properties.put("exam_heading", new BasePropertyConstraintsDescriptor("exam_heading", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "exam_heading";
        return ViewManifest_Behavior.call_getExamTitle_6582483045193076645(node);
      }
    });
    properties.put("institute", new BasePropertyConstraintsDescriptor("institute", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "institute";
        return ViewManifest_Behavior.call_getInstition_6582483045193075764(node);
      }
    });
    properties.put("instructions", new BasePropertyConstraintsDescriptor("instructions", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "instructions";
        return ViewManifest_Behavior.call_getInstructions_6582483045193078432(node);
      }
    });
    properties.put("keywords", new BasePropertyConstraintsDescriptor("keywords", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "keywords";
        return ViewManifest_Behavior.call_getKeywords_6582483045192467596(node);
      }
    });
    properties.put("max_marks", new BasePropertyConstraintsDescriptor("max_marks", this) {
      @Override
      public boolean hasOwnGetter() {
        return true;
      }

      @Override
      public Object getValue(SNode node, IScope scope) {
        String propertyName = "max_marks";
        return ViewManifest_Behavior.call_getMaxMarks_6582483045193078014(node);
      }
    });
    return properties;
  }
}
