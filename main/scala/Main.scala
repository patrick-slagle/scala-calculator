import javafx.{fxml => jfxf, scene => jfxs}

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.Scene
import scalafxml.core.{FXMLView, NoDependencyResolver}


object Main extends JFXApp {

  val resource = getClass.getResource("scala/calculator.fxml")
  val root = FXMLView(resource, NoDependencyResolver)

  stage = new JFXApp.PrimaryStage {
    scene = new Scene(root) {
      stylesheets = List(getClass.getResource("/scala/css/calculator.css").toExternalForm)
    }
  }
}
    

