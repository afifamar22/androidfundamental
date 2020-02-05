package pip.com.masterin2_service.mastering1service_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Detailbiodata extends AppCompatActivity {
    TextView txNamalengkap,txTanggallahir,txumur,txkelas,txjurusan;
    int tmpumur,tmptanggallahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailbiodata);

        txNamalengkap = (TextView) findViewById(R.id.tmpNamaLengkap);
        txTanggallahir = (TextView) findViewById(R.id.tmpTanggallahir) ;
        txumur = (TextView) findViewById(R.id.tmpumur);
        txkelas = (TextView) findViewById(R.id.tmpkelas) ;
        txjurusan = (TextView) findViewById(R.id.tmpjurusan) ;
        
        Bundle getBiodata = getIntent().getExtras();
        txNamalengkap.setText(getBiodata.getString("NamaLengkap"));
        tmptanggallahir = getBiodata.getInt("tanggallahir");
        txTanggallahir.setText(String.valueOf(tmptanggallahir));
        tmpumur = getBiodata.getInt("Umur");
        txumur.setText(String.valueOf(tmpumur));
        txkelas.setText(getBiodata.getString("Kelas"));
        txjurusan.setText(getBiodata.getString("Jurusan"));

    }
}
