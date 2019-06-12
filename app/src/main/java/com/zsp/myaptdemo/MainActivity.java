package com.zsp.myaptdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.zsp.javalib.BindView;

/**
 * APT(Annotation Processing Tool)是一种处理注释的工具,
 * 它对源代码文件进行检测找出其中的Annotation，
 * 使用Annotation进行额外的处理。
 * Annotation处理器在处理Annotation时可以根据源文件中的Annotation生成额外的源文件和其它的文件(文件具体内容由Annotation处理器的编写者决定),
 * APT还会编译生成的源文件和原来的源文件，
 * 将它们一起生成class文件。
 *
 * @author Andy
 *         created at 2019/6/12 0012 14:16
 */
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
