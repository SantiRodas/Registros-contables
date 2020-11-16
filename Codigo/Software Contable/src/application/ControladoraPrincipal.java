/*
 * CONTABILIDAD Y COSTOS
 * PROYECTO FINAL SOBRE REGISTROS CONTABLES
 * 
 * - SANTIAGO RODAS RODRIGUEZ
 * - KEVIN ANDRES FERNANDEZ
 * - GERMAN CARVAJAL
 */

package application;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.Account;
import model.Company;
import model.ThirdParty;
import model.Transaction;

public class ControladoraPrincipal {
	
	//Contenedora de compañias
	private ArrayList<Company> companies;
	//Contenedora de tipos de compañias
	private static final String[] companyTypes= {"Manufactura","Servicios","Mixto","?"};
	private static final String[] accountGroups= {"Activos","Pasivos","Patrimonio","Ingresos","Egresos"};
	
	@FXML
    public void initialize() {
		companies=new ArrayList<Company>();
		agregarTipoEmpresa.setItems(FXCollections.observableList(Arrays.asList(companyTypes)));
    }
	

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA PRIMERA PANTALLA

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
	private TextField agregarCodigoCuenta;

	@FXML
	private TextField agregarNombreCuenta;

	@FXML
	private ToggleGroup naturaleza;

	@FXML
	private RadioButton activoRB;

	@FXML
	private RadioButton pasivoRB;

	@FXML
	private ChoiceBox<String> grupoCuenta;

	@FXML
	private ToggleGroup tipo;

	@FXML
	private RadioButton balanceRB;

	@FXML
	private RadioButton resultadoRB;

	@FXML
	private Button botonAgregarCuenta;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA TERCERA PANTALLA

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
	private TextField agregarCodigoRegistro;

	@FXML
	private TextField agregarNombreRegistro;

	@FXML
	private TextField agregarMonedaRegistro;

	@FXML
	private Button botonAgregarRegistro;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA CUARTA PANTALLA

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

	// METODO ON ACTION EVENT PARA AGREGAR UNA EMPRESA

	@FXML
	void agregarEmpresa(ActionEvent event) {
		
		Company comp=new Company(agregarNombreEmpresa.getText(), agregarNITEmpresa.getText(), agregarDireccionEmpresa.getText(), agregarTelefonoEmpresa.getText(), agregarTipoEmpresa.getValue(), new ArrayList<Transaction>(), new ArrayList<Account>(), new ArrayList<ThirdParty>());
		companies.add(comp);

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UNA CUENTA

	@FXML
	void agregarCuenta(ActionEvent event) {

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UN GRUPO

	@FXML
	void agregarGrupo(ActionEvent event) {

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

}
