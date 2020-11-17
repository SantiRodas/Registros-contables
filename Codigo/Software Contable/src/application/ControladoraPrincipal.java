/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package application;

import exceptions.InsufficientInformationException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import model.Company;
import model.Controller;

public class ControladoraPrincipal {
	
	// ----------------------------------------------------------------------------------
	
	// RELACIONES CON LA CLASE CONTROLADORA DEL MODELO
	
	private Controller controladora;
	
	// ----------------------------------------------------------------------------------
	
	// METODO CONSTRUCTOR DE LE CONTROLADORA PRINCIPAL (UI)
	
	public ControladoraPrincipal() {
		
		
		
	}

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA PRIMERA PANTALLA
	
    @FXML
    private Tab empresa;

	@FXML
	private TextField agregarNombreEmpresa;

	@FXML
	private TextField agregarNITEmpresa;

	@FXML
	private TextField agregarDireccionEmpresa;

	@FXML
	private TextField agregarTelefonoEmpresa;

	@FXML
	private ChoiceBox<String> agregarTipoEmpresa;

	@FXML
	private Button botonAgregarEmpresa;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA SEGUNDA PANTALLA
	
    @FXML
    private Tab cuenta;

	@FXML
	private TextField agregarCodigoCuenta;

	@FXML
	private TextField agregarNombreCuenta;

	@FXML
	private ChoiceBox<String> grupoCuenta;

	@FXML
	private Button botonAgregarCuenta;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA TERCERA PANTALLA
	
    @FXML
    private Tab terceraPersona;

	@FXML
	private TextField agregarNombrePersona;

	@FXML
	private TextField agregarIdentificacionPersona;

	@FXML
	private TextField agregarCelularPersona;

	@FXML
	private RadioButton naturalRB;

	@FXML
	private RadioButton juridicaRB;

	@FXML
	private Button botonAgregarPersona;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA CUARTA PANTALLA
	
    @FXML
    private Tab agregarRegistro;

	@FXML
	private TextField agregarCodigoRegistro;

	@FXML
	private TextField agregarNombreRegistro;

	@FXML
	private TextField agregarMonedaRegistro;

	@FXML
	private Button botonAgregarRegistro;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA QUINTA PANTALLA
	
    @FXML
    private Tab editarRegistro;

	@FXML
	private TextField codigoEditarRegitro;

	@FXML
	private CheckBox nombreCB;

	@FXML
	private CheckBox cantidadCB;

	@FXML
	private TextField nombreEditarRegistro;

	@FXML
	private TextField cantidadEditarRegistro;

	@FXML
	private Button botonEditarRegistro;

	@FXML
	private Button botonValidarRegistro;
	
	// ----------------------------------------------------------------------------------
	
	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA SEXTA PANTALLA
	
    @FXML
    private Tab salida;
	
	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UNA EMPRESA

	@FXML
	void agregarEmpresa(ActionEvent event) {

		try {

			String NIT = agregarNITEmpresa.getText();

			String name = agregarNombreEmpresa.getText();

			String direccion = agregarDireccionEmpresa.getText();

			String telefono = agregarTelefonoEmpresa.getText();

			String tipoEmpresa = agregarTipoEmpresa.getValue();
			
			if(NIT.isEmpty() || name.isEmpty() || direccion.isEmpty() ||
			telefono.isEmpty() || tipoEmpresa.isEmpty()) {
				
				throw new InsufficientInformationException();
				
			} else {
				
				Company company = new Company(NIT, name, direccion, telefono, tipoEmpresa);
				
				controladora.setCompany(company);
				
				confirmacion();
				
				cuenta.setDisable(false);
				
				empresa.setDisable(true);
				
			}

		} catch(InsufficientInformationException e1) {
			
			errorDatosVacios();

		}

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UNA CUENTA

	@FXML
	void agregarCuenta(ActionEvent event) {

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UNA PERSONA

	@FXML
	void agregarPersona(ActionEvent event) {

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UN REGISTRO

	@FXML
	void agregarRegistro(ActionEvent event) {

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA EDITAR UN REGISTRO

	@FXML
	void editarRegistro(ActionEvent event) {

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA VALIDAR UN REGISTRO

	@FXML
	void validarRegistro(ActionEvent event) {

	}

	// ----------------------------------------------------------------------------------
	
	// MENSAJE DE CONFIRMACION
	
	public void confirmacion() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Informacion");
		alert.setHeaderText(null);
		alert.setContentText("Se agrego correctamente la compa�ia");

		alert.showAndWait();
		
	}

	// ----------------------------------------------------------------------------------
	
	// MENSAJE DE ERROR CUANDO LOS DATOS ESTAN VACIOS
	
	public void errorDatosVacios() {
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Lo sentimos");
		alert.setHeaderText("No se agrego correctamente la compa�ia");
		alert.setContentText("Verifique si todos los campos estan digitados");

		alert.showAndWait();
		
	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO INITIALIZE
	
	@FXML
	public void initialize() {
		
		controladora = new Controller(null);
		
		cuenta.setDisable(true);
		terceraPersona.setDisable(true);
		agregarRegistro.setDisable(true);
		editarRegistro.setDisable(true);
		salida.setDisable(true);
		
		agregarTipoEmpresa.getItems().add("Manufactura");
		agregarTipoEmpresa.getItems().add("Servicio");
		agregarTipoEmpresa.getItems().add("Comercio");
		
<<<<<<< HEAD
=======
		controladora=new Controller(null);
		
		grupoCuenta.getItems().add("Activos");
		grupoCuenta.getItems().add("Pasivos");
		grupoCuenta.getItems().add("Patrimonio");
		grupoCuenta.getItems().add("Ingresos");
		grupoCuenta.getItems().add("Gastos");
		
		
>>>>>>> 9dc8ff0f3c5dbb77a905aaa015729d50cf3e6eae
	}
	
	// ----------------------------------------------------------------------------------

}
