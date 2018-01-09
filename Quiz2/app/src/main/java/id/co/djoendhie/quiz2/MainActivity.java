package id.co.djoendhie.quiz2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtHasil;
    EditText etNama, etNis, etuser, etMajor;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHasil = (TextView) findViewById(R.id.txtHasil);
        etuser = (EditText) findViewById(R.id.etUser);
        etNama = (EditText) findViewById(R.id.etName);
        etNis = (EditText) findViewById(R.id.etNis);
        etMajor = (EditText) findViewById(R.id.etMajor);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // ngambl nla dar et et td
                String nNama = etNama.getText().toString();
                String nUser = etuser.getText().toString();
                String nNis = etNis.getText().toString();
                String nMajor = etMajor.getText().toString();

                // menamplxan hasl x txt vew
                txtHasil.setText("Data: " + nNama +  " "  + nNis + " " + nUser + " " + nMajor);

            }
        });



    }
}
