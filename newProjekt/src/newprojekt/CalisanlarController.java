/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newprojekt;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author arsla
 */
public class CalisanlarController implements Initializable {



    @FXML
    private TableView<CalisanlarController> calisan_table;
  
    @FXML
    private TableColumn<CalisanlarController, String> calisan_id;
    @FXML
    private TableColumn<CalisanlarController, String> calisan_seviye;
    @FXML
    private TableColumn<CalisanlarController, String> calisan_ad;
    @FXML
    private TableColumn<CalisanlarController, String> calisan_soyad;
    @FXML
    private ComboBox<String> combo_box;
    @FXML
    private Button ekle_btt;
    @FXML
    private Button sil_btt;
    @FXML
    private Button duzenle_btt;
    @FXML
    private Button kaydet_btt;
    @FXML
    private Button geri;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
                
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        if(event.getSource()== geri){
            try {
                Node node=(Node) event.getSource();
                Stage stage=(Stage) node.getScene().getWindow();
                stage.close();
            
                Scene scene=new Scene(FXMLLoader.load(getClass().getResource("/newprojekt/FXMLDocument.fxml")));
                stage.setScene(scene);
                stage.show();
            }   catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }



}

