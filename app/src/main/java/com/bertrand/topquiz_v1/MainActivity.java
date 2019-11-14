package com.bertrand.topquiz_v1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView refTextePrincipal, refTexteCompteur; // @+id/activity_main_texte_principal
    private EditText refInput;
    private Button refBtnJouer, refBtnRaz;
    private int compteur=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // création des Balises
        refTextePrincipal = (TextView) findViewById(R.id.activity_main_texte_principal);
        refTexteCompteur = (TextView) findViewById(R.id.activity_main_texte_compteur);
        refInput = (EditText) findViewById(R.id.activity_main_input);
        refBtnJouer = (Button) findViewById(R.id.activity_main_btn_jouer);
        refBtnRaz = (Button) findViewById(R.id.activity_main_btn_raz);

        // initialisation
        refBtnJouer.setEnabled(false);
        refBtnRaz.setEnabled(false);


        // création des listener
        refInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().length() !=0 ){
                    refBtnJouer.setEnabled(true);
                }
                else {
                    refBtnJouer.setEnabled(false);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        refBtnJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 compteur++;
                refBtnRaz.setEnabled(true);
                if(compteur <= 1){
                    refTexteCompteur.setText(String.valueOf(compteur) + "clic");
                }else {
                    refTexteCompteur.setText(String.valueOf(compteur)  + " clics");
                }
            }
        });

        refBtnRaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                refBtnJouer.setEnabled(false);
                refBtnRaz.setEnabled(false);
                refInput.setText("");
            }
        });

    }
}
