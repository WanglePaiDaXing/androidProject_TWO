package com.example.administrator.experience_two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btn_Linear,btn_Relative,btn_Table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* 创建监听器 */
        btn_Linear = (Button)findViewById(R.id.btn_test);
        btn_Relative = (Button)findViewById(R.id.btn_layout2);
        btn_Table = (Button)findViewById(R.id.btn_Table);
        btn_Linear.setOnClickListener(listener_Linear);
        btn_Relative.setOnClickListener(listener_Relative);
        btn_Table.setOnClickListener(listener_Table);
    }
    /* 实现监听器 */
    Button.OnClickListener listener_Linear = new Button.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    };
    Button.OnClickListener listener_Relative = new Button.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,Main3Activity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    };
    Button.OnClickListener listener_Table = new Button.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,Main4Activity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    };
}
