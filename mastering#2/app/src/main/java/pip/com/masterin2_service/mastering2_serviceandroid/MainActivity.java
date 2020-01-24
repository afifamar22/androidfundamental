package pip.com.masterin2_service.mastering2_serviceandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import pip.com.masterin2_service.mastering2_serviceandroid.explicit.explicitbasic;

public class MainActivity extends AppCompatActivity {
    Button ben_implicit ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ben_implicit= (Button)findViewById(R.id.explisit);

        ben_implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  memindahkan main intent implity
                Intent i = new Intent(MainActivity.this, explicitbasic.class);
                startActivity(i);
            }
        });

    }
}
