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
import java.util.Map;

import exceptions.InformationExistsException;
import exceptions.InsufficientAccountsExcetion;
import exceptions.InsufficientInformationException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Account;
import model.AccountSummary;
import model.AccountSummaryTableModel;
import model.Company;
import model.Controller;
import model.TestBalanceTableModel;
import model.ThirdParty;
import model.Transaction;
import model.TransactionTableModel;
import modules.ReportsModule;

public class ControladoraPrincipal {

	// ----------------------------------------------------------------------------------

	// RELACIONES CON LA CLASE CONTROLADORA DEL MODELO

	private Controller controladora;

	private ObservableList<TransactionTableModel> transactionTableModels;

	private ObservableList<TestBalanceTableModel> testBalanceTableModels;

	private ObservableList<AccountSummaryTableModel> assetsGeneralBalanceTableModels;

	private ObservableList<AccountSummaryTableModel> liaAndNetGeneralBalanceTableModels;

	private ObservableList<AccountSummaryTableModel> helper;

	// ----------------------------------------------------------------------------------

	// METODO CONSTRUCTOR DE LE CONTROLADORA PRINCIPAL (UI)

	public ControladoraPrincipal() {

		// TODO VA AQUI

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
	private CheckBox validacionCuenta1;

	@FXML
	private CheckBox validacionCuenta2;

	@FXML
	private CheckBox validacionCuenta3;

	@FXML
	private ComboBox<Account> cuenta1;

	@FXML
	private ComboBox<Account> cuenta2;

	@FXML
	private ComboBox<Account> cuenta3;

	@FXML
	private TextField agregarMonedaRegistro1;

	@FXML
	private TextField agregarMonedaRegistro2;

	@FXML
	private TextField agregarMonedaRegistro3;

	@FXML
	private ComboBox<ThirdParty> personaInvolucrada;

	@FXML
	private Button botonAgregarRegistro;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA QUINTA PANTALLA

	@FXML
	private Tab registros;

	@FXML
	private TableView<TransactionTableModel> tablaDeRegistros;

	@FXML
	private TableColumn<TransactionTableModel, String> nrt;

	@FXML
	private TableColumn<TransactionTableModel, String> nt;

	@FXML
	private TableColumn<TransactionTableModel, String> c1t;

	@FXML
	private TableColumn<TransactionTableModel, Double> v1t;

	@FXML
	private TableColumn<TransactionTableModel, String> c2t;

	@FXML
	private TableColumn<TransactionTableModel, Double> v2t;

	@FXML
	private TableColumn<TransactionTableModel, String> c3t;

	@FXML
	private TableColumn<TransactionTableModel, Double> v3t;

	@FXML
	private TableColumn<TransactionTableModel, String> tpp;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA SEXTA PANTALLA

	@FXML
	private Tab balancePrueba;

	@FXML
	private TableView<TestBalanceTableModel> balanceTabla;

	@FXML
	private TableColumn<TestBalanceTableModel, String> columnaCuenta;

	@FXML
	private TableColumn<TestBalanceTableModel, Double> columnaEntrada;

	@FXML
	private TableColumn<TestBalanceTableModel, Double> columnaSalida;

	@FXML
	private Label entradaTotal;

	@FXML
	private Label salidaTotal;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA SEPTIMA PANTALLA

	@FXML
	private Tab balanceGeneral;

	// TABLA DE LA IZQUIERDA EN LA PANTALLA ASIGNADA

	@FXML
	private TableView<AccountSummaryTableModel> tablaIzquierda;

	@FXML
	private TableColumn<AccountSummaryTableModel, String> c1Izquierda;

	@FXML
	private TableColumn<AccountSummaryTableModel, Double> c2Izquierda;

	// TABLA DE LA DERECHA EN LA PANTALLA ASIGNADA

	@FXML
	private TableView<AccountSummaryTableModel> tablaDerecha;

	@FXML
	private TableColumn<AccountSummaryTableModel, String> c1Derecha;

	@FXML
	private TableColumn<AccountSummaryTableModel, Double> c2Derecha;

	// ----------------------------------------------------------------------------------

	// POSIBLES ACCIONES QUE SE UTILIZAN EN LA OCTAVA PANTALLA

	@FXML
	private Tab s3;

	@FXML
	private TableView<AccountSummaryTableModel> tablaCuantasRsesultados;

	@FXML
	private TableColumn<AccountSummaryTableModel, String> columnaCuentaResultados;

	@FXML
	private TableColumn<AccountSummaryTableModel, String> columnaValor;

	@FXML
	private Label ingresoTotal;

	@FXML
	private Label gastosTotales;

	@FXML
	private CheckBox cbReserva;

	@FXML
	private CheckBox cbImpuesto;

	@FXML
	private TextField tfReserva;

	@FXML
	private TextField tfImpuesto;

	@FXML
	private Label utilidadesTotales;

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

			if(NIT.isEmpty() || NIT.length() != 13 || name.isEmpty() || direccion.isEmpty() ||
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
	void agregarCuenta(ActionEvent event) throws InformationExistsException {

		try {

			String codigo = agregarCodigoCuenta.getText();

			String nombre = agregarNombreCuenta.getText();

			String grupo = grupoCuenta.getValue();

			if(codigo.isEmpty() || nombre.isEmpty() || grupo.isEmpty()) {

				throw new InsufficientInformationException();

			} else {

				Account cuenta=new Account(codigo, nombre, grupo);

				controladora.getCompany().agregarCuenta(cuenta);

				agregarCodigoCuenta.setText("");

				agregarNombreCuenta.setText("");

				confirmacion();

				terceraPersona.setDisable(false);

				cargarCuentas(cuenta);

			}

		} catch(InsufficientInformationException e1) {

			errorDatosVacios();

		} catch(InformationExistsException e2) {

			errorDatosExistentes();

			/*
			 * SE DEBE DE ATRAPAR UN NULL POINTER POR QUE SE ESTA USANDO UN CHOICE BOX.
			 * ENTONCES, POR MEDIO DE ESTA ACCION VERIFICAMOS SI EL USUARIO SELECCIONO O NO 
			 * ESTA OPCION TAN IMPORTANTE EN EL SISTEMA.
			 */

		} catch(NullPointerException e3) {

			errorDatosVacios();

		}

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UNA PERSONA

	@FXML
	void agregarPersona(ActionEvent event) throws InformationExistsException {

		try {

			String codigo = agregarIdentificacionPersona.getText();

			String nombre = agregarNombrePersona.getText();

			String telefono = agregarCelularPersona.getText();

			if(codigo.isEmpty() || nombre.isEmpty() || telefono.isEmpty()) {

				throw new InsufficientInformationException();

			} else {

				ThirdParty persona = new ThirdParty(nombre, codigo, telefono);

				controladora.getCompany().agregarPersona(persona);

				agregarIdentificacionPersona.setText("");

				agregarNombrePersona.setText("");

				agregarCelularPersona.setText("");

				confirmacion();

				personaInvolucrada.getItems().add(persona);

				agregarRegistro.setDisable(false);

			}

		} catch(InsufficientInformationException e1) {

			errorDatosVacios();

		} catch(InformationExistsException e2) {

			errorDatosExistentes();

		}

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION PARA CARGAR LA INFORMACION DE LA CUENTA

	void cargarCuentas(Account cuenta) {

		cuenta1.getItems().add(cuenta);
		cuenta2.getItems().add(cuenta);
		cuenta3.getItems().add(cuenta);

	}

	// ----------------------------------------------------------------------------------

	// METODO ON ACTION EVENT PARA AGREGAR UN REGISTRO

	@FXML
	void agregarRegistro(ActionEvent event) throws InformationExistsException, InsufficientAccountsExcetion {

		try {

			// ARRAYLIST QUE SE UTILIZAN PARA CREAR UN REGISTRO

			ArrayList<Account> cuentas = new ArrayList<Account>();

			ArrayList<Double> valores = new ArrayList<Double>();

			// VARIABLES DE JAVAFX PREDETERMINADAS

			String numeroRegistro = agregarCodigoRegistro.getText();

			String nombreRegistro = agregarNombreRegistro.getText();

			// VERIFICAMOS LA VALIDACION DE LA CUENTA 1

			if(validacionCuenta1.isSelected()) {

				cuentas.add(cuenta1.getValue());

				String v1 = agregarMonedaRegistro1.getText();

				Double valor1 = Double.parseDouble(v1);

				valores.add(valor1);

			}

			// VERIFICAMOS LA VALIDACION DE LA CUENTA 2

			if(validacionCuenta2.isSelected()) {

				cuentas.add(cuenta2.getValue());

				String v2 = agregarMonedaRegistro2.getText();

				Double valor2 = Double.parseDouble(v2);

				valores.add(valor2);

			}

			// VERIFICAMOS LA VALIDACION DE LA CUENTA 3

			if(validacionCuenta3.isSelected()) {

				cuentas.add(cuenta3.getValue());

				String v3 = agregarMonedaRegistro3.getText();

				Double valor3 = Double.parseDouble(v3);

				valores.add(valor3);

			}

			// CREAMOS LA TERCERA PERSONA INVLUCRADA

			ThirdParty terceraPersona = personaInvolucrada.getValue();

			// SE HACE LAS ULTIMAS VERIFICACIONES PARA AGREGAR UN REGISTRO

			if(numeroRegistro.isEmpty() || nombreRegistro.isEmpty()) {

				throw new InsufficientInformationException();

			} else if(cuentas.size() < 2 || valores.size() < 2) {

				throw new InsufficientAccountsExcetion();

			} else {

				// CREAMOS EL REGISTRO Y LO AGREGAMOS EN EL SISTEMA

				Transaction registro = new Transaction(numeroRegistro, nombreRegistro, cuentas, valores, terceraPersona);

				controladora.getCompany().agregarRegistro(registro);

				// LIMPIAMOS EL NOMBRE Y EL REGISTRO DEL SISTEMA

				agregarNombreRegistro.setText("");

				agregarCodigoRegistro.setText("");

				// VERIFICAMOS TODO LO RELACIONADO CON LA CUENTA 1

				validacionCuenta1.setSelected(false);

				cuenta1.setDisable(true);

				agregarMonedaRegistro1.setDisable(true);

				agregarMonedaRegistro1.setText("");

				// VERIFICAMOS TODO LO RELACIONADO CON LA CUENTA 2

				validacionCuenta2.setSelected(false);

				cuenta2.setDisable(true);

				agregarMonedaRegistro2.setDisable(true);

				agregarMonedaRegistro2.setText("");

				// VERIFICAMOS TODO LA RELACIONADO CON LA CUENTA 3

				validacionCuenta3.setSelected(false);

				cuenta3.setDisable(true);

				agregarMonedaRegistro3.setDisable(true);

				agregarMonedaRegistro3.setText("");

				// MENSAJE DE CONFIRMACION Y VISIBILIDAD DE LA SIGUIENTE VENTANA

				registros.setDisable(false);

				balancePrueba.setDisable(false);

				balanceGeneral.setDisable(false);

				confirmacion();

				//AGREGAR DATOS A TABLA

				TransactionTableModel model = TransactionTableModel.fromTransaction(registro);

				transactionTableModels.add(model);

				tablaDeRegistros.setItems(transactionTableModels);

				tablaDeRegistros.refresh();

				//ACTUALIZAR BALANCE DE PRUEBA

				Map<String, double[]> map = ReportsModule.testBalance(controladora.getCompany().getRegistros());

				double[] totals = map.get("Total");

				map.remove("Total");

				entradaTotal.setText(totals[0] + "");

				salidaTotal.setText(totals[1] + "");

				ArrayList<TestBalanceTableModel> list = TestBalanceTableModel.fromMap(map);

				balanceTabla.setItems(FXCollections.observableArrayList(list));

				balanceTabla.refresh();

				//ACTUALIZAR BALANCE GENERAL

				ArrayList<ArrayList<AccountSummary>> groups=ReportsModule.generalBalance(controladora.getCompany().getRegistros());

				ArrayList<AccountSummaryTableModel> assets=AccountSummaryTableModel.generateAssetsList(groups.get(0));

				ArrayList<AccountSummaryTableModel> liaAndNet=AccountSummaryTableModel.generateLiabilitiesAndNetworthList(groups.get(1), groups.get(2));

				tablaIzquierda.setItems(FXCollections.observableArrayList(assets));

				tablaDerecha.setItems(FXCollections.observableArrayList(liaAndNet));

				tablaDerecha.refresh();

				tablaIzquierda.refresh();

				//ACTUAIZAR ESTADO DE RESULTADOS

				s3.setDisable(false);

				ArrayList<ArrayList<AccountSummary>> helperGruops=ReportsModule.generalResultados(controladora.getCompany().getRegistros());

				ArrayList<AccountSummaryTableModel> icoAndExp = AccountSummaryTableModel.generateIcoAndExp(helperGruops.get(0), helperGruops.get(1), ingresoTotal, gastosTotales);

				tablaCuantasRsesultados.setItems(FXCollections.observableArrayList(icoAndExp));

				tablaCuantasRsesultados.refresh();

			}

			// DIFERENTES CATCH QUE SE LE HACEN A DIFERENTES EXCEPCIONES

		} catch(InsufficientInformationException e1) {

			errorDatosVacios();

		} catch(InsufficientAccountsExcetion e2) {

			errorCuentasInsuficientes();

		} catch(NumberFormatException e3) {

			errorDatosVacios();

		} catch(InformationExistsException e4) {

			errorDatosExistentes();

		}

	}

	// ----------------------------------------------------------------------------------
	
	// METODO PARA CAMBIAR DISABLE IMPUESTO

	@FXML
	public void impuesto(ActionEvent event) {

		tfImpuesto.setDisable(false);

	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO PARA CAMBIAR DISABLE RESERVA

	@FXML
	public void reserva(ActionEvent event) {

		tfReserva.setDisable(false);

	}
	
	// ----------------------------------------------------------------------------------
	
	// METODO BT PARA CALULCAR LA UTILIDAD TOTAL
	
	@FXML
	void btCalcularUtilidadTotal(ActionEvent event) {

		int impuestoP = 0;
		
		int reservaP = 0;

		try {
			
			if(cbImpuesto.isSelected()) {

				impuestoP = Integer.parseInt(tfImpuesto.getText());

			}
			
			if(cbReserva.isSelected()) {

				reservaP = Integer.parseInt(tfReserva.getText());

			}
			
		}catch(NumberFormatException e) {

			errorDatosVacios();

		}

		double utilidad = Double.parseDouble(ingresoTotal.getText())+Double.parseDouble(gastosTotales.getText());

		double impuesto = (utilidad)*(impuestoP * 0.01); 

		double reserva = (utilidad)*(reservaP * 0.01);

		double utilidadTotalHelper = utilidad-impuesto-reserva;

		utilidadesTotales.setText(utilidadTotalHelper+"");

		tfImpuesto.setDisable(true);
		
		tfReserva.setDisable(true);

	}

	// ----------------------------------------------------------------------------------

	// VALIDACION PARA LA CUENTA 1

	@FXML
	void vc1(ActionEvent event) {

		if(validacionCuenta1.isSelected()) {

			cuenta1.setDisable(false);

			agregarMonedaRegistro1.setDisable(false);

		} else {

			cuenta1.setDisable(true);

			agregarMonedaRegistro1.setDisable(true);

		}

	}

	// ----------------------------------------------------------------------------------

	// VALIDACION PARA LA CUENTA 2

	@FXML
	void vc2(ActionEvent event) {

		if(validacionCuenta2.isSelected()) {

			cuenta2.setDisable(false);

			agregarMonedaRegistro2.setDisable(false);

		} else {

			cuenta2.setDisable(true);

			agregarMonedaRegistro2.setDisable(true);

		}

	}

	// ----------------------------------------------------------------------------------

	// VALIDACION PARA LA CUENTA 3

	@FXML
	void vc3(ActionEvent event) {

		if(validacionCuenta3.isSelected()) {

			cuenta3.setDisable(false);

			agregarMonedaRegistro3.setDisable(false);

		} else {

			cuenta3.setDisable(true);

			agregarMonedaRegistro3.setDisable(true);

		}

	}

	// ----------------------------------------------------------------------------------

	// MENSAJE DE CONFIRMACION

	public void confirmacion() {

		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Informacion");
		alert.setHeaderText(null);
		alert.setContentText("Se agrego correctamente al sistema");

		alert.showAndWait();

	}

	// ----------------------------------------------------------------------------------

	// MENSAJE DE ERROR CUANDO LOS DATOS ESTAN VACIOS

	public void errorDatosVacios() {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Lo sentimos");
		alert.setHeaderText("No se agrego correctamente");
		alert.setContentText("Verifique si todos los campos estan bien digitados");

		alert.showAndWait();

	}

	// ----------------------------------------------------------------------------------

	// MENSAJE DE ERROR CUANDO LOS DATOS YA EXISTAN

	public void errorDatosExistentes() {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Lo sentimos");
		alert.setHeaderText("No se agrego correctamente");
		alert.setContentText("Los datos digitados ya existen en el sistema");

		alert.showAndWait();

	}

	// ----------------------------------------------------------------------------------

	// MENSAJE DE ERROR CUANDO NO HAY CUENTAS SUFICIENTES

	public void errorCuentasInsuficientes() {

		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Lo sentimos");
		alert.setHeaderText("No se agrego correctamente");
		alert.setContentText("Por favor seleccione mas cuentas");

		alert.showAndWait();

	}

	// ----------------------------------------------------------------------------------

	// METODO INITIALIZE

	@FXML
	public void initialize() {

		// ******************************************************************************

		controladora = new Controller(null);

		// ******************************************************************************

		transactionTableModels= FXCollections.observableArrayList(
				//new TransactionTableModel("a", "a", "a", 1.0, "a", 1.0, "a", 1.0, "a")
				);

		nrt.setCellValueFactory(new PropertyValueFactory<>("Nrt"));
		nt.setCellValueFactory(new PropertyValueFactory<>("Nt"));
		c1t.setCellValueFactory(new PropertyValueFactory<>("C1t"));
		v1t.setCellValueFactory(new PropertyValueFactory<>("V1t"));
		c2t.setCellValueFactory(new PropertyValueFactory<>("C2t"));
		v2t.setCellValueFactory(new PropertyValueFactory<>("V2t"));
		c3t.setCellValueFactory(new PropertyValueFactory<>("C3t"));
		v3t.setCellValueFactory(new PropertyValueFactory<>("V3t"));
		tpp.setCellValueFactory(new PropertyValueFactory<>("Tpp"));
		tablaDeRegistros.setItems(transactionTableModels);


		// ******************************************************************************

		testBalanceTableModels= FXCollections.observableArrayList();
		columnaCuenta.setCellValueFactory(new PropertyValueFactory<>("ColumnaCuenta"));
		columnaEntrada.setCellValueFactory(new PropertyValueFactory<>("ColumnaEntrada"));
		columnaSalida.setCellValueFactory(new PropertyValueFactory<>("ColumnaSalida"));
		balanceTabla.setItems(testBalanceTableModels);

		// ******************************************************************************

		assetsGeneralBalanceTableModels=FXCollections.observableArrayList();
		liaAndNetGeneralBalanceTableModels=FXCollections.observableArrayList();
		c1Izquierda.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
		c2Izquierda.setCellValueFactory(new PropertyValueFactory<>("Valor"));
		c1Derecha.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
		c2Derecha.setCellValueFactory(new PropertyValueFactory<>("Valor"));
		tablaIzquierda.setItems(assetsGeneralBalanceTableModels);
		tablaDerecha.setItems(liaAndNetGeneralBalanceTableModels);

		// ******************************************************************************

		helper = FXCollections.observableArrayList();
		columnaCuentaResultados.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
		columnaValor.setCellValueFactory(new PropertyValueFactory<>("Valor"));

		tablaCuantasRsesultados.setItems(helper);

		// ******************************************************************************

		cuenta.setDisable(true);
		terceraPersona.setDisable(true);
		agregarRegistro.setDisable(true);
		registros.setDisable(true);
		balancePrueba.setDisable(true);
		balanceGeneral.setDisable(true);
		s3.setDisable(true);

		// ******************************************************************************

		agregarTipoEmpresa.getItems().add("Comercio");
		agregarTipoEmpresa.getItems().add("Manufactura");
		agregarTipoEmpresa.getItems().add("Servicio");

		// ******************************************************************************

		grupoCuenta.getItems().add("Activos");
		grupoCuenta.getItems().add("Gastos");
		grupoCuenta.getItems().add("Ingresos");
		grupoCuenta.getItems().add("Pasivos");
		grupoCuenta.getItems().add("Patrimonio");

		// ******************************************************************************

		tfReserva.setDisable(true);
		tfImpuesto.setDisable(true);


	}

	// ----------------------------------------------------------------------------------
	
}
