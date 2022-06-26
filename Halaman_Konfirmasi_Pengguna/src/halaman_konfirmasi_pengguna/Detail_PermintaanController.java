package halaman_konfirmasi_pengguna;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

public class Detail_PermintaanController implements Initializable {

    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfNomorT;
    @FXML
    private TextField tfDomisili;
    @FXML
    private ChoiceBox cebUrgensi;

    @FXML
    private void tolakButton(ActionEvent event) {
        System.out.println("hapus button telah dipilih");
        System.out.println("");
        System.out.println("permntaan ditolak");

    }

    @FXML
    private void setujuButton(ActionEvent event) {
        System.out.println("setuju button telah dipilih");
        System.out.println("");
        System.out.println("permintaan diseteujui");

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cebUrgensi.setValue("Urgensi");
        cebUrgensi.getItems().addAll("3 hari", "2 hari", "hari ini", "Darurat");
        cebUrgensi.getValue().toString();
    }

}
