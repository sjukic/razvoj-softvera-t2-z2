package ba.unsa.etf.rs.tut2zad2;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    public TextField unosBroja;
    public TextArea ispisBrojeva;


    public void sumaCifara(ActionEvent actionEvent) {
        int n = Integer.parseInt(unosBroja.getText());
        String izlazni = new String();
        for(int i=1; i<=n; i++){
            int j = i, suma=0;
            while(j!=0){
                suma = suma + (j%10);
                j=j/10;
            }
            if(i%suma == 0){
                izlazni = izlazni + Integer.toString(i) + " ";
            }
        }
        ispisBrojeva.setText(izlazni);
    }
}
