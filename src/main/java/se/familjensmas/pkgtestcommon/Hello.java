package se.familjensmas.pkgtestcommon;

@SuppressWarnings("unused")
public class Hello {

  public static String world() {
    return com.google.common.html.HtmlEscapers.htmlEscaper().escape("World");
  }

}
