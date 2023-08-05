package tw.edu.pu.gm.s1100396.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText num;
    Button btn;
    int answer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num = (EditText) this.findViewById(R.id.txtnum);
        btn = this.findViewById(R.id.btn_chk);
        Random r = new Random();
        //範圍是1~50
        answer = r.nextInt(51);
    }

    public void checkAnswer(View view){
        String s1 = num.getText().toString();
        int n1 = Integer.parseInt(s1);
        String message;
        if(n1==answer)
        {
            message = "恭喜你猜對了!";
            btn.setEnabled(false);
        }
        else if (n1>answer)
        {
            message = "你猜的數字太大了!";

        }
        else
        {
            message = "你猜的數字太小了!";
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}