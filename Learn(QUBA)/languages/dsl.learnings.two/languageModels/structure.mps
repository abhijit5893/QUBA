<?xml version="1.0" encoding="UTF-8"?>
<model modelUID="r:c1781274-f425-49d4-90f5-198f93ac4992(dsl.learnings.two.structure)" version="2">
  <persistence version="8" />
  <language namespace="c72da2b9-7cce-4447-8389-f407dc1158b7(jetbrains.mps.lang.structure)" />
  <devkit namespace="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  <import index="tpce" modelUID="r:00000000-0000-4000-0000-011c89590292(jetbrains.mps.lang.structure.structure)" version="0" implicit="yes" />
  <import index="tpck" modelUID="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" version="0" implicit="yes" />
  <import index="jr99" modelUID="r:c1781274-f425-49d4-90f5-198f93ac4992(dsl.learnings.two.structure)" version="2" implicit="yes" />
  <import index="5705" modelUID="r:383fb5e6-6ee7-46da-b277-1b3a20f736b3(dsl.Learnings.one.structure)" version="6" implicit="yes" />
  <import index="4fqr" modelUID="r:fa713d69-08ea-4732-b1f2-cb07f9e103ef(jetbrains.mps.execution.util.structure)" version="-1" implicit="yes" />
  <import index="tpee" modelUID="r:00000000-0000-4000-0000-011c895902ca(jetbrains.mps.baseLanguage.structure)" version="4" implicit="yes" />
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="2879066684745170211" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="DDL" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="question bank login" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="2879066684745170879" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="body" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="477391940631261805" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="4fqr.4666195181811081429" resolveInfo="IMainClass" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752135403" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="5705.196434024752135315" resolveInfo="AbstractCommand_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="2879066684745170876" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Insert" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="create question" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1102350216416266947" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="type" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1102350216408970517" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="Answer" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="196434024752454282" resolveInfo="Answer_intf" />
    </node>
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="1274436477531998051" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="images" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="6301226679266842776" resolveInfo="InsertPicture_intf" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745172263" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="Question" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745172268" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="Subject" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745172272" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="Difficulty" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454280" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="2879066684745170881" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Update" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="modify question" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745200495" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="question_number" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745200497" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="set_field" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745208300" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="set_value" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454318" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="2879066684745172174" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="ViewAll" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454320" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="2879066684745186346" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="EmptyLine" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454278" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="2879066684745217910" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Delete" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="remove question" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="2879066684745217962" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="question_number" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454276" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="5201233245347013663" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="SearchBy" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="search by category" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="5201233245347019190" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="context" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="5201233245347019192" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="value" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1102350216415485636" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="count" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454316" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="1102350216408925207" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="WordAnswer" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="Word" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="196434024752728660" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="answerString" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454322" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752454282" resolveInfo="Answer_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4903500976601398169" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Report" />
    <property name="conceptAlias" nameId="tpce.5092175715804935370" value="show report" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1475003049268063995" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="list1" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1475003049268063997" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="list2" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="1475003049268064000" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="list3" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454314" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752453719" resolveInfo="DDLBLOCK_intf" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="4982939136950874919" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="SubjectReference" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="4982939136950874999" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="subject" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="1" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="tpee.1070475926800" resolveInfo="StringLiteral" />
    </node>
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="8604482642922115996" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="MultipleChoiceAnswer" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="linkDeclaration" roleId="tpce.1071489727083" type="tpce.LinkDeclaration" typeId="tpce.1071489288298" id="8604482642922116034" nodeInfo="ig">
      <property name="metaClass" nameId="tpce.1071599937831" value="aggregation" />
      <property name="role" nameId="tpce.1071599776563" value="choice_list" />
      <property name="sourceCardinality" nameId="tpce.1071599893252" value="0..n" />
      <link role="target" roleId="tpce.1071599976176" targetNodeId="tpee.1070475926800" resolveInfo="StringLiteral" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8604482642922116029" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="no_of_choices" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657062" resolveInfo="integer" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="8604482642922116031" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="optional_choices" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983657063" resolveInfo="boolean" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="196434024752724887" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="answerString" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="196434024752454312" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="196434024752454282" resolveInfo="Answer_intf" />
    </node>
  </root>
  <root type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="196434024752453719" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="DDLBLOCK_intf" />
  </root>
  <root type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="196434024752454282" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Answer_intf" />
  </root>
  <root type="tpce.ConceptDeclaration" typeId="tpce.1071489090640" id="6301226679266522023" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="Image" />
    <link role="extends" roleId="tpce.1071489389519" targetNodeId="tpck.1133920641626" resolveInfo="BaseConcept" />
    <node role="implements" roleId="tpce.1169129564478" type="tpce.InterfaceConceptReference" typeId="tpce.1169127622168" id="6301226679266845052" nodeInfo="ig">
      <link role="intfc" roleId="tpce.1169127628841" targetNodeId="6301226679266842776" resolveInfo="InsertPicture_intf" />
    </node>
  </root>
  <root type="tpce.InterfaceConceptDeclaration" typeId="tpce.1169125989551" id="6301226679266842776" nodeInfo="ig">
    <property name="name" nameId="tpck.1169194664001" value="InsertPicture_intf" />
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="6301226679266842785" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="basepath" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
    <node role="propertyDeclaration" roleId="tpce.1071489727084" type="tpce.PropertyDeclaration" typeId="tpce.1071489288299" id="6301226679266842786" nodeInfo="ig">
      <property name="name" nameId="tpck.1169194664001" value="picture" />
      <link role="dataType" roleId="tpce.1082985295845" targetNodeId="tpck.1082983041843" resolveInfo="string" />
    </node>
  </root>
</model>

