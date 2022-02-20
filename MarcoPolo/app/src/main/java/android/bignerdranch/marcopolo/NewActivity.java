package android.bignerdranch.marcopolo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class NewActivity extends AppCompatActivity {
    private TextView mText;
    private String name;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        name = getIntent().getStringExtra("name");
        mText = findViewById(R.id.text_view);
        mText.setText(name);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(name.equals("Polo!"))
            //Displays Marco!
            StyleableToast.makeText(this,"Marco!",Toast.LENGTH_SHORT, R.style.cuteToast).show();
        else if(name.equals("Marco!"))
            //Displays Polo!
            StyleableToast.makeText(this,"Polo!",Toast.LENGTH_SHORT,R.style.cuteToast).show();

    }
}
