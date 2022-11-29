package fr.gsb.gsbrvdr;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.layout.GridPane;
import javafx.util.Callback;
import javafx.util.Pair;

import java.util.Optional;

public class VueConnexion extends Dialog<Pair<String,String>> {

    public VueConnexion() {
        super();
        this.setTitle("Authentification");
        this.setHeaderText("Saisir vos données de connexion");
    }
}


      /*  Dialog matricule = new Dialog("matricule");

        getDialogPane().setContent(matricule, 0, 1);

        Dialog mdp = new Dialog("mdp");

        ButtonType btnOui = new ButtonType("Oui", ButtonBar.ButtonData.OK_DONE);

        ButtonType btnNon = new ButtonType("Non", ButtonBar.ButtonData.CANCEL_CLOSE);

        getDialogPane().getButtonTypes().addAll(btnOui,btnNon); */


     /*   setResultConverter(
                new Callback<ButtonType, Pair<String, String>>() {
                    @Override
                    public Pair<String, String> call(ButtonType typeBouton) {
                        if (typeBouton == ButtonTypeOKDone){
                            return new Pair<String, String>(matricule, mdp);
                        }
                        return null;
                    }
                }
        );

    }


}
*/

