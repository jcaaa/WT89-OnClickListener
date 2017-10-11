package sg.com.kaplan.onclicklistenerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView m1 = (ImageView) findViewById(R.id.m1);
        ImageView m2 = (ImageView) findViewById(R.id.m2);
        final TextView msg = (TextView) findViewById(R.id.textView);

        m1.setOnClickListener(new View.OnClickListener() {
            int n = 1;
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hehehe", Toast.LENGTH_SHORT).show();
                msg.setText("hehehe " + n);
                n++;
            }
        });

        m2.setOnClickListener(new View.OnClickListener() {
            int n = 1;
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "HAHAHAHAHAHHA", Toast.LENGTH_SHORT).show();
                msg.setText("haha " + n);
                n++;
            }
        });

    }
}
