/**
 * name: Jeremy Staunton
 * Id:R00158317
 * class: sd2
 * COMP7013
 */
package project.gui;

//import java.sql.DriverManager;
//import java.sql.ResultSetMetaData;
//import java.util.ArrayList;
//
import javafx.application.Application;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.geometry.Insets;
//import javafx.scene.Group;
import javafx.scene.Scene;
//import javafx.scene.control.SelectionMode;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import project.entities.Product;
import project.services.Populate;

public class Main extends Application{
	private Tab tab1 = new Tab();
	private Tab tab2 = new Tab();
	private Tab tab3 = new Tab();
	
	public Tab1 tb1;
	public Stage stage;
	
	public static void main(String[] args) throws Exception{
		launch(args);
	}
	public void start(Stage primaryStage) throws Exception {
		
		Populate pop = new Populate();
		pop.populate();
				stage = primaryStage;
				stage.setWidth(700);
		        stage.setHeight(500);
		        
		        TabPane tbPane = new TabPane();
				tab1.setText("Customer");
				tb1 = new Tab1(); 
				tb1.start( );
		        tab1.setContent(tb1.getLayout());
		        tbPane.getTabs().add(tab1);
				

		        Scene scene = new Scene(tbPane, 600, 400);
//				Scene scene = new Scene(new Group());
//				((Group) scene.getRoot()).getChildren().addAll(vbxListView);
				//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				
				primaryStage.setScene(scene);
				primaryStage.show();
	}
}

//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/veg?user=root&password=password&useSSL=true&serverTimezone=GMT" );
//System.out.println ("Database connection established");
//statement = con.createStatement ();
//
//resultSet = statement.executeQuery ("SELECT * FROM employee");
//
//ResultSetMetaData md = resultSet.getMetaData();
//int numberOfColumns = md.getColumnCount(); 
//
//
//ArrayList<TableColumn<Product, String>> list = new ArrayList<TableColumn<Product, String>>();
//for ( int i = 0; i < numberOfColumns; i++ ){
//	TableColumn<Product, String> tc = new TableColumn<Product, String>(md.getColumnName(i+1));
//	tc.setCellValueFactory(new PropertyValueFactory<Product, String>((md.getColumnName(i+1))));
//	list.add(i, tc);
//	dataTable.getColumns().add(list.get(i));
//}	    	           
//dataList = FXCollections.observableArrayList();
//while ( resultSet.next() ) 
//{
//  // for ( int i = 0; i < numberOfColumns; i++ ){
//	   //list.get(i).setCellValueFactory(new PropertyValueFactory((md.getColumnName(i+1))));
//
//	   //dataList = FXCollections.observableArrayList();
//	   dataList.add(new Product(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6)));
//	   System.out.println(dataList.get(0));
//   //}
//}
//
//dataTable.setItems(dataList);
