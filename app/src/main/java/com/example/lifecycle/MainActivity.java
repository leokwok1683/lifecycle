package com.example.lifecycle;


import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.inputName);
        Log.d("leo","onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("leo","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("leo","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("leo","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("leo","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("leo","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("leo","onRestart");
    }

    public void end(View view) {
        finish();
    }

    @Override
    public void finish() {
        super.finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==168){
        int key1 = data.getIntExtra("key1",0);
        String key2 = data.getStringExtra("key2");
        Log.d("leo",key1+":" +key2);
        Log.d("leo","onActivityResult: "+requestCode+";"+resultCode);}
    }

    public void page2(View view) {
        Intent intent = new Intent(this,Page2Activity.class);
//        startActivity(intent);
        startActivityForResult(intent,168);
    }

    public void send(View view) {
        String name = inputName.getText().toString();
        Intent intent = new Intent(this,Page2Activity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }

    public void page3(View view) {
        Intent intent = new Intent(this,Page3Activity.class);
        startActivityForResult(intent,444);
    }
}
