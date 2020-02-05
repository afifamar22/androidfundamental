package pip.com.moutainadventure.aplikasipendakian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class detail_pendakian extends AppCompatActivity {
    TextView txNamapeserta,txTtl,txnotelp,txumur,txjkelamin,txalamat;
    int tmpnotelp,tmpumur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pendakian);

        txNamapeserta = (TextView)findViewById(R.id.tmpNamapeserta);
        txTtl= (TextView) findViewById(R.id.tmpttl) ;
        txnotelp= (TextView) findViewById(R.id.tmpnotelp) ;
        txumur= (TextView) findViewById(R.id.tmpumur) ;
        txjkelamin= (TextView) findViewById(R.id.tmpjk) ;
        txalamat= (TextView) findViewById(R.id.tmpAlamat) ;

        Bundle getBiodata = getIntent().getExtras();
        txNamapeserta.setText(getBiodata.getString("NamaPeserta"));
        txTtl.setText(getBiodata.getString("TempatTinggalLahir"));
        tmpnotelp = getBiodata.getInt("NomorTelepon");
        txnotelp.setText(String.valueOf(tmpnotelp));
        tmpumur = getBiodata.getInt("Umur");
        txumur.setText(String.valueOf(tmpumur));
        txjkelamin.setText(getBiodata.getString("Jeniskelamin"));
        txalamat.setText(getBiodata.getString("AlamatLengkap"));

    }
}
