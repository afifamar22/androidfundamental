package pip.com.masterin2_service.mastering2_serviceandroid.explicit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import pip.com.masterin2_service.mastering2_serviceandroid.MainActivity;
import pip.com.masterin2_service.mastering2_serviceandroid.R;

public class explicitbasic extends AppCompatActivity {
    Button ben_backhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicitbasic);

        ben_backhome= (Button)findViewById(R.id.backhome);

        ben_backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  memindahkan main intent implity
                Intent i = new Intent(explicitbasic.this, MainActivity.class);
                startActivity(i);
            }
        });
    }
}
