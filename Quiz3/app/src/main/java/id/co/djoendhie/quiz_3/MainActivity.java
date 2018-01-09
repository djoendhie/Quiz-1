package id.co.djoendhie.quiz_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName, etJob, etEmployer, etSalary;
    TextView txtHasil;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHasil = (TextView) findViewById(R.id.txthasil);
        etName= (EditText) findViewById(R.id.etName);
        etJob= (EditText) findViewById(R.id.etJob);
        etEmployer= (EditText) findViewById(R.id.etEmployer);
        etSalary = (EditText) findViewById(R.id.etSalary);
        button = (Button) findViewById(R.id.button);

        // axse btn submet
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // ngambl nla dar et et td
                String nName = etName.getText().toString();
                String nJob = etJob.getText().toString();
                String nEmployer = etEmployer.getText().toString();
                String nSalary = etSalary.getText().toString();

                // menamplxan hasl x txt vew
                txtHasil.setText("Hallo , " + nName + " " + nJob + " " + nEmployer + " " + nSalary);

            }
        });

    }
}
