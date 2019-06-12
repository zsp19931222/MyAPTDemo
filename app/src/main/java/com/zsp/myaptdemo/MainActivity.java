package com.zsp.myaptdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.zsp.javalib.BindView;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv)
    TextView textView;
    @BindView(R.id.btn)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InjectHelper.inject(this);
        textView.setText("注解器使用");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "编译时注解使用", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
