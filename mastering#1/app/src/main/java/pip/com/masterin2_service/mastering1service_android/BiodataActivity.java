package pip.com.masterin2_service.mastering1service_android;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BiodataActivity extends AppCompatActivity {


    //TODO 1 DEKLARASI VIEW
    EditText etnamalengkap,ettanggallahir,etumur,etkelas,etjurusan;
    Button btview,bthapus;

    AlertDialog.Builder builderAlert;
    String namalengkap,kelas,jurusan;
    int tanggallahir,umur;
    Intent kirimdata;
    Bundle pakageBiodata;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);


        //Todo 2 inisialisasi view
        etnamalengkap =(EditText) findViewById(R.id.editnamalengkap);
        ettanggallahir = (EditText) findViewById(R.id.edittanggallahir);
        etumur = (EditText) findViewById(R.id.editumur);
        etkelas = (EditText) findViewById(R.id.editkelas);
        etjurusan = (EditText) findViewById(R.id.editjurusan);
        btview = (Button) findViewById(R.id.buttonview);
        bthapus = (Button) findViewById(R.id.buttonhapus);

        //Todo 3 Implementasi View

        btview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namalengkap =etnamalengkap.getText().toString();
                kelas =etkelas.getText().toString();
                jurusan =etjurusan.getText().toString();
                tanggallahir = Integer.parseInt(ettanggallahir.getText().toString());
                umur = Integer.parseInt(etumur.getText().toString());

                builderAlert = new AlertDialog.Builder(BiodataActivity.this);
                builderAlert
                        .setTitle("informasi")
                        .setMessage("Data yang di input adalah :\nNama lengkap :"
                                + namalengkap +"\nTanggal lahir anda :" + tanggallahir + "umur :"+umur+"\nkelas :"
                                + kelas + "\njurusan :" + jurusan)
                        .setPositiveButton("Kirim", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                pakageBiodata = new Bundle();
                                pakageBiodata.putString("NamaLengkap",namalengkap);
                                pakageBiodata.putInt("Tanggallahir",tanggallahir);
                                pakageBiodata.putInt("Umur",umur);
                                pakageBiodata.putString("Kelas",kelas);
                                pakageBiodata.putString("Jurusan",jurusan);
                                kirimdata = new Intent(BiodataActivity.this,Detailbiodata.class);
                                kirimdata.putExtras(pakageBiodata);
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
                etnamalengkap.setText("");
                ettanggallahir.setText("");
                etkelas.setText("");
                etjurusan.setText("");

            }
        });




    }
}
