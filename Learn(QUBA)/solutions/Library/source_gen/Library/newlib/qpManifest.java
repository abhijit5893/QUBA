package Library.newlib;

/*Generated by MPS */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import javax.xml.transform.dom.DOMSource;
import java.io.File;
import org.w3c.dom.Element;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import javax.swing.JOptionPane;
import org.w3c.dom.NodeList;
import javax.xml.xpath.XPathConstants;
import java.net.URLDecoder;

public class qpManifest {
  /*package*/ String title;
  /*package*/ String subject;
  /*package*/ String keywords;
  /*package*/ String author;
  /*package*/ String creator;
  /*package*/ String examType;
  /*package*/ String time;
  /*package*/ String maxMarks;
  /*package*/ String instructions;
  /*package*/ DocumentBuilderFactory documentBuilderFactory;
  /*package*/ DocumentBuilder documentBuilder;
  /*package*/ Document document;
  /*package*/ DOMSource source;
  /*package*/ String QPPATH;
  /*package*/ File fp;
  /*package*/ Element root;
  /*package*/ StreamResult result;
  /*package*/ TransformerFactory transformerFactory;
  /*package*/ Transformer transformer;
  /*package*/ XPath xpath;
  /*package*/ XPathExpression expr;
  /*package*/ XPathFactory xpathfactory;

  public qpManifest() {
    try {
      this.title = "";
      this.subject = "";
      this.keywords = "";
      this.author = "";
      this.creator = "";
      this.examType = "";
      this.time = "";
      this.maxMarks = "";
      this.instructions = "";
      this.QPPATH = manifest.getQPManifest();
      CreateXMLFile();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public boolean QuesManifestExists() {
    return fp.exists();
  }

  public void CreateXMLFile() throws Exception {
    fp = new File(QPPATH);
    if (fp.createNewFile()) {
      result = new StreamResult(fp);
      documentBuilderFactory = DocumentBuilderFactory.newInstance();
      documentBuilder = documentBuilderFactory.newDocumentBuilder();
      document = documentBuilder.newDocument();
      Element rootElement = document.createElement("root");
      document.appendChild(rootElement);
      Element Etitle = document.createElement("title");
      rootElement.appendChild(Etitle);
      Element Esubject = document.createElement("subject");
      rootElement.appendChild(Esubject);
      Element Ekeywords = document.createElement("keywords");
      rootElement.appendChild(Ekeywords);
      Element Eauthor = document.createElement("author");
      rootElement.appendChild(Eauthor);
      Element Ecreator = document.createElement("creator");
      rootElement.appendChild(Ecreator);
      Element EexamType = document.createElement("examtype");
      rootElement.appendChild(EexamType);
      Element Etime = document.createElement("time");
      rootElement.appendChild(Etime);
      Element EmaxMarks = document.createElement("maxmarks");
      rootElement.appendChild(EmaxMarks);
      Element Einstructions = document.createElement("instructions");
      rootElement.appendChild(Einstructions);
      result = new StreamResult(fp);
      source = new DOMSource(document);
      transformerFactory = TransformerFactory.newInstance();
      transformer = transformerFactory.newTransformer();
      transformer.transform(source, result);
      JOptionPane.showMessageDialog(null, "XML File created");
    }
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void doc_init() throws Exception {
    fp = new File(QPPATH);
    result = new StreamResult(fp);
    documentBuilderFactory = DocumentBuilderFactory.newInstance();
    documentBuilder = documentBuilderFactory.newDocumentBuilder();
  }

  public void transform_init() throws Exception {
    result = new StreamResult(fp);
    source = new DOMSource(document);
    transformerFactory = TransformerFactory.newInstance();
    transformer = transformerFactory.newTransformer();
  }

  public void xpath_init() {
    result = new StreamResult(fp);
    xpathfactory = XPathFactory.newInstance();
    xpath = xpathfactory.newXPath();
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getKeywords() {
    return keywords;
  }

  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public String getExamType() {
    return examType;
  }

  public void setExamType(String examType) {
    this.examType = examType;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getMaxMarks() {
    return maxMarks;
  }

  public void setMaxMarks(String maxMarks) {
    this.maxMarks = maxMarks;
  }

  public String getInstructions() {
    return instructions;
  }

  public void setInstructions(String instructions) {
    this.instructions = instructions;
  }

  public String getString(String name) {
    try {
      String xpathQuery;
      Element chd;
      doc_init();
      document = documentBuilder.parse(fp);
      root = document.getDocumentElement();
      xpath_init();
      xpathQuery = "//root";
      expr = xpath.compile(xpathQuery);
      NodeList temp = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
      Element tempf = (Element) temp.item(0);
      return tempf.getElementsByTagName(name).item(0).getTextContent();
    } catch (Exception ex) {
      ex.printStackTrace();
      return "";
    }
  }

  public void update(String name, String value) {
    try {
      if (name.equals("instructions")) {
        value = URLDecoder.decode(value, "UTF-8");
      }
      String xpathQuery;
      Element chd;
      doc_init();
      document = documentBuilder.parse(fp);
      root = document.getDocumentElement();
      xpath_init();
      xpathQuery = "//root";
      expr = xpath.compile(xpathQuery);
      NodeList temp = (NodeList) expr.evaluate(document, XPathConstants.NODESET);
      Element tempf = (Element) temp.item(0);
      tempf.getElementsByTagName(name).item(0).setTextContent(value);
      transform_init();
      transformer.transform(source, result);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }


}
