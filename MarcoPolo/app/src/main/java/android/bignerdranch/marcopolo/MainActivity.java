package android.bignerdranch.marcopolo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button mMarco_button, mPolo_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMarco_button = (Button) findViewById(R.id.marco_button);
        mPolo_button = (Button) findViewById(R.id.polo_button);
        //Makes marco button with intent
        mMarco_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent data = new Intent(MainActivity.this, NewActivity.class);
                data.putExtra("name","Marco!");
                startActivity(data);
            }
        });
        //Makes polo button with intent
        mPolo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent data = new Intent(MainActivity.this, NewActivity.class);
                data.putExtra("name","Polo!");
                startActivity(data);;
            }
        });
    }
}