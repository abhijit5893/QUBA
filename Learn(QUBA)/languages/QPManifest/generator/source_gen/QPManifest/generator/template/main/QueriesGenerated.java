package QPManifest.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import java.net.URLEncoder;

@Generated
public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_4353184072324499231(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "field");
  }

  public static Object propertyMacro_GetPropertyValue_4353184072324500115(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "field").equals("instructions")) {
      try {
        return URLEncoder.encode(SPropertyOperations.getString(_context.getNode(), "value"), "UTF-8");
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    return SPropertyOperations.getString(_context.getNode(), "value");
  }
}
