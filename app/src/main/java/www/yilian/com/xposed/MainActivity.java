package www.yilian.com.xposed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contentTv = findViewById(R.id.content_tv);
        contentTv.setText(getContent());
    }

    private String getContent(){
        return "Hello，我是原始字符串";
    }
}
