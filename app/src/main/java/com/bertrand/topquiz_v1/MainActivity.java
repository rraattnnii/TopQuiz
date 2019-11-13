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

    private TextView refTextePrincipal; // @+id/activity_main_texte_principal
    private EditText refInput;
    private Button refBtnJouer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // création des Balises
        refTextePrincipal = (TextView) findViewById(R.id.activity_main_texte_principal);
        refInput = (EditText) findViewById(R.id.activity_main_input);
        refBtnJouer = (Button) findViewById(R.id.activity_main_btn_jouer);


        // initialisation
        refBtnJouer.setEnabled(false);
        // getRefBtnRaz.setEnabled(false);   // apres v1



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



            }
        });

    }
}
