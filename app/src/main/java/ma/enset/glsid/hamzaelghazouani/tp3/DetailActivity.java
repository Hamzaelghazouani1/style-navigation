package ma.enset.glsid.hamzaelghazouani.tp3;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "DetailActivity";
    private EditText editNumber1, editNumber2;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate called");

        editNumber1 = findViewById(R.id.editNumber1);
        editNumber2 = findViewById(R.id.editNumber2);
        textResult = findViewById(R.id.textResult);
        Button buttonSum = findViewById(R.id.buttonSum);
        Button buttonReset = findViewById(R.id.buttonReset);

        buttonSum.setOnClickListener(v -> calculateSum());
        buttonReset.setOnClickListener(v -> resetFields());
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(editNumber1.getText().toString());
            double num2 = Double.parseDouble(editNumber2.getText().toString());
            double result = num1 + num2;
            textResult.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
        }
    }

    private void resetFields() {
        editNumber1.setText("");
        editNumber2.setText("");
        textResult.setText("");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }
}