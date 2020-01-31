package pip.com.moutainadventure.aplikasipendakian;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class pendakianActivity extends AppCompatActivity {


    //TODO 1 DEKLARASI VIEW
    EditText etnamapeserta,etttl,etnotelp,etjk,etalamat;
    Button btlihat,bthapus;

    AlertDialog.Builder builderAlert;
    String namapeserta,ttl,jkelamin,alamat;
    int notelp;
    Intent kirimdata;
    Bundle pakagependakian;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendakian);


        //Todo 2 inisialisasi view
        etnamapeserta =(EditText) findViewById(R.id.editnamapeserta);
        etttl = (EditText) findViewById(R.id.editttl);
        etnotelp = (EditText) findViewById(R.id.editnotelp);
        etjk = (EditText) findViewById(R.id.editjk);
        etalamat =(EditText)findViewById(R.id.editalamat);
        btlihat = (Button) findViewById(R.id.buttonview);
        bthapus = (Button) findViewById(R.id.buttonhapus);

        //Todo 3 Implementasi View

        btlihat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namapeserta =etnamapeserta.getText().toString();
                ttl =etttl.getText().toString();
                notelp = Integer.parseInt(etnotelp.getText().toString());
                jkelamin =etjk.getText().toString();
                alamat =etalamat.getText().toString();

                builderAlert = new AlertDialog.Builder(pendakianActivity.this);
                builderAlert
                        .setTitle("informasi")
                        .setMessage("FORMULIR PENDAKIAN \nNama peserta :"
                                + namapeserta +"\nTempat,Tanggal lahir anda :" + ttl + "\nNomor telpon :"
                                + notelp + "\njenis Kelamin :" + jkelamin + "\nAlamat lengkap :" + alamat)
                        .setPositiveButton("Kirim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                pakagependakian = new Bundle();
                                pakagependakian.putString("NamaPeserta",namapeserta);
                                pakagependakian.putString("TempatTinggalLahir",ttl);
                                pakagependakian.putInt("NomorTelepon",notelp);
                                pakagependakian.putString("Jeniskelamin",jkelamin);
                                pakagependakian.putString("AlamatLengkap",alamat);
                                kirimdata = new Intent(pendakianActivity.this,detail_pendakian.class);
                                kirimdata.putExtras(pakagependakian);
                                startActivity(kirimdata);
                            }
                        })
                        .setNegativeButton("Batalkan", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {


                            }
                        });
                AlertDialog alertDialog =builderAlert.create();
                alertDialog.show();
            }
        });

        bthapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etnamapeserta.setText("");
                etttl.setText("");
                etnotelp.setText("");
                etjk.setText("");
                etalamat.setText("");

            }
        });




    }
}
