package au.edu.jcu.cp3406.quicksum;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int sum = 0;
    String history = "";
    Button button; // TODO CHECK: only used in one method, may not be best practice
    TextView historyView = findViewById(R.id.sumHistory);
    TextView textView = findViewById(R.id.sum);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        button = (Button) view;
        String strNumber = button.getText().toString(); //String Number for history
        history = history + "+" + strNumber;
        int number = Integer.parseInt(strNumber); //int number for sum
        sum += number;
        displayText(view);
    }

    public void clearSum(View view) {
        sum = 0;
        history = "";
        displayText(view);
    }

    public void displayText(View view) {
        String result = "" + sum;
        textView.setText(result);
        historyView.setText(history);
    }
}
