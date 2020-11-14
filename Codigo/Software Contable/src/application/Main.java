/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {
	
	// ----------------------------------------------------------------------------------
	
	// RELACIONES CON OTRAS CLASES
	
	private ControladoraPrincipal controladora;
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR
	
	public Main() {
		
		controladora = new ControladoraPrincipal();
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO START EN LA CLASE MAIN
	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("panelPrincipal.fxml"));

			fxmlLoader.setController(controladora);
			
			Parent root = fxmlLoader.load();
			
			Scene scene = new Scene(root);
			
			primaryStage.setScene(scene);
			
			primaryStage.setTitle("Registros contables");
			
			primaryStage.show();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO MAIN EN LA CLASE MAIN
	
	public static void main(String[] args) {
		
		launch(args);
		
	}
	
	// ----------------------------------------------------------------------------------
	
}
