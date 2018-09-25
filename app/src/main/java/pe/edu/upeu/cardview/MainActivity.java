package pe.edu.upeu.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import Openhelper.Persona;
import Openhelper.SQLite_OpenHelper;

public class MainActivity extends AppCompatActivity {
    TextView txtNomb,txtApelli,txtdirec,txttele;
    Button btnagre;
    SQLite_OpenHelper helper = new SQLite_OpenHelper(this ,"persona",null,1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNomb=(TextView)findViewById(R.id.edtNombre);
        txtApelli=(TextView) findViewById(R.id.edtApellido);
        txtdirec=(TextView)findViewById(R.id.edtDireccion);
        txttele=(TextView)findViewById(R.id.edtTelefono);
    }
}
