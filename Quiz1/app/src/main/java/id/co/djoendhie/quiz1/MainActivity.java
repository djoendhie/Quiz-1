package id.co.djoendhie.quiz1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String Nama = "Ihsan";
    String NIS = "220213123731";
    String Alamat = "Jl.rambutan no 53";
    String Kota = "Payakmbuh";
    String Kode = "16340";
    String Telp = "085364118281";
    String HP = "085364118281";
    String Email = "ihaandjoe68@Gmail.com";

    TextView txtNama, txtNIS, txtAlamat, txtTelp, txtHP, txtKota, txtKodepos, txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNama = (TextView)findViewById(R.id.txtNama);
        txtNIS = (TextView)findViewById(R.id.txtNIS);
        txtAlamat = (TextView)findViewById(R.id.txtAlamat);
        txtKota = (TextView)findViewById(R.id.txtKota);
        txtKodepos = (TextView)findViewById(R.id.txtKodepos);
        txtTelp = (TextView)findViewById(R.id.txtTelp);
        txtHP = (TextView)findViewById(R.id.txtHP);
        txtEmail = (TextView)findViewById(R.id.txtEmail);



        txtNama.setText("Hy, " + Nama);
        txtNIS.setText(NIS);
        txtAlamat.setText(Alamat);
        txtKota.setText(Kota);
        txtKodepos.setText(Kode);
        txtTelp.setText(Telp);
        txtHP.setText(HP);
        txtEmail.setText(Email);


    }
}
