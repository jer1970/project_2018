package project.gui;


import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import project.controller.Controller;
import project.entities.Customer;
import project.entities.Product;

public class Tab1 {
	private Button btnCreate;
	private TextField txtName;
	private TextField txtAddress;
	private Label lblCustDetails;
	private Label lblName;
	private Label lblAddress;
	private Button btnCustomer;
	private Label lblId;
	private TextField txtId;
	private HBox hbxCustomer;
	
	private Label lblFindCust;
	private TextField txtFindCust;
	private Button btnFindCust;
	private HBox hbxFind;
	
	private Button btnDelete;
	private Label lblUpdateName;
	private Label lblUpdateAddress;
	private TextField txtUpdateName;
	private TextField txtUpdateAddress; 
	private Button btnUpdate;	
	private HBox hbxUpdate;
	
	private VBox vbxListView;
	private StackPane layout;
	private Controller control;
	public TableView<Product> dataTable;
	public ObservableList<Product> dataList;
	
	public void start() throws Exception {
		Color color;
		BackgroundFill fill;
		Background background;
		
		control = new Controller();
		
		lblCustDetails = new Label("Enter new customer details");
		lblCustDetails.setTextFill(Color.web("#f4e913"));
		lblName = new Label("Name");
		lblName.setTextFill(Color.web("#f4e913"));
		lblAddress = new Label("Address");
		lblAddress.setTextFill(Color.web("#f4e913"));
		txtName = new TextField();
		txtName.setMaxSize(100, 10);
		txtAddress = new TextField();
		txtAddress.setMaxSize(100, 10);
		btnCustomer = new Button("Create Customer");
		btnCustomer.setOnAction( e-> control.createCustomer(txtId, txtName.getText(), txtAddress.getText()));
		lblId = new Label("new Id");
		lblId.setTextFill(Color.web("#f4e913"));
		txtId = new TextField();
		txtId.setMaxSize(50, 10);
		hbxCustomer = new HBox(10);
		hbxCustomer.setMaxSize(580, 30);
		hbxCustomer.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;" + "-fx-border-color: black;");
		hbxCustomer.setAlignment(Pos.CENTER);
		hbxCustomer.setPadding(new Insets(10));
		hbxCustomer.getChildren().addAll(lblName, txtName, lblAddress, txtAddress, btnCustomer, lblId, txtId);
		
		lblFindCust = new Label("Find Customer:  Enter Customer Id");
		lblFindCust.setTextFill(Color.web("#f4e913"));
		txtFindCust = new TextField();
		txtFindCust.setMaxSize(60, 10);
		btnFindCust = new Button("Find");
		btnFindCust.setOnAction(e -> control.findCustomer(txtUpdateName, txtUpdateAddress,txtFindCust.getText()));
		hbxFind = new HBox(10);
		hbxFind.setMaxSize(580, 30);
		hbxFind.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;" + "-fx-border-color: black;");
		hbxFind.setAlignment(Pos.CENTER);
		hbxFind.setPadding(new Insets(10));
		hbxFind.getChildren().addAll(lblFindCust, txtFindCust, btnFindCust);
		
		lblUpdateName =new Label("Name");
		lblUpdateName.setTextFill(Color.web("#f4e913"));
		txtUpdateName = new TextField();
		txtUpdateName.setMaxSize(100, 10);
		lblUpdateAddress = new Label("Address");
		lblUpdateAddress.setTextFill(Color.web("#f4e913"));
		txtUpdateAddress = new TextField();
		txtUpdateAddress.setMaxSize(100, 10);
		btnUpdate = new Button("Update");
		btnUpdate.setOnAction(e -> control.updateCustomer(txtUpdateName.getText(), txtUpdateAddress.getText(), txtFindCust.getText()));
		btnDelete = new Button("Delete");
		btnDelete.setOnAction(e -> control.deleteCustomer(txtFindCust.getText()));
		hbxUpdate = new HBox(10);
		hbxUpdate.setMaxSize(580, 30);
		hbxUpdate.setStyle("-fx-border-style: solid inside;" + "-fx-border-width: 2;" + "-fx-border-color: black;");
		hbxUpdate.setAlignment(Pos.CENTER);
		hbxUpdate.setPadding(new Insets(10));
		hbxUpdate.getChildren().addAll(lblUpdateName, txtUpdateName, lblUpdateAddress, txtUpdateAddress, btnUpdate, btnDelete);
		
		dataTable = new TableView<Product>();
		dataTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		//dataTable.setMinSize(400, 200);
		dataTable.setMaxHeight(200);
		dataTable.setMinWidth(500);
		
		dataTable.setEditable(true);
		 
//		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        
		vbxListView = new VBox();
		vbxListView.setPadding(new Insets(20, 20, 20, 20));
		//vbxListView.setMinSize(300, 200);
		vbxListView.getChildren().addAll(lblCustDetails,hbxCustomer, hbxFind, hbxUpdate, dataTable);
		
		layout = new StackPane();
		//StackPane.setAlignment(hbxCustomer, Pos.TOP_CENTER);
		//StackPane.setAlignment(vbxListView, Pos.BASELINE_CENTER);
		// colour the background of the layout
		color = Color.web("#151382");
		fill = new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY);
		background = new Background(fill);
		layout.setBackground(background);
		layout.setPadding(new Insets(10));
		layout.getChildren().add(vbxListView);
//		BorderPane root = new BorderPane();
//		root.getChildren().add(vbxListView);
	}
	public StackPane getLayout() {
		return layout;
	}
	public Button getBtnCustomer() {
		return btnCustomer;
	}
	public void setBtnCustomer(Button btnCustomer) {
		this.btnCustomer = btnCustomer;
	}
	public TextField getTxtName() {
		return txtName;
	}
	public TextField getTxtAddress() {
		return txtAddress;
	}
}
