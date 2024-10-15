package com.example.testmetodos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {
    private static final String LOG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.second_activity);
        String Nom = getIntent().getStringExtra("Nom");
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setText("Bye " + Nom + " !");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Log.d("SecondActivity", "onCreate() called");

            return insets;
        });
        Button buttonNext = findViewById(R.id.button2);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(SecondActivity.this, MainActivity.class);
                SecondActivity.this.startActivity(myIntent);
                finish();
                EditText editText = findViewById(R.id.inputText);
                Toast.makeText(getApplicationContext(), editText.getText(), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG, "onResume() called");
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG, "onStart() called");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(LOG, "onStop() called");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(LOG, "onDestroy() called");
    }
    @Override
    public void onPause(){
        super.onPause();
        Log.d(LOG, "onPause() called");
    }
    @Override
    public void onRestart(){
        super.onRestart();
        Log.d(LOG, "onRestart() called");
    }

    public void returnReplay(){
        Log.d(LOG, "returnReplay() called");
    }





}
