package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.jquery.jQuery
import org.scalajs.dom
import dom.document

import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    println("setupUI")
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World!</p>")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    jQuery("body").append("<p>" + text + "</p>")
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!!")
  }
}
