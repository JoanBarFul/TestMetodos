package com.example.testmetodos;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    static final String LOG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        String Nom = "Joan";
        TextView textView = findViewById(R.id.textView1);
        textView.setText("Hello " + Nom + " !");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            Log.d("MainActivity", "onCreate() called");
            Button buttonNext = findViewById(R.id.button1);
            buttonNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
                    myIntent.putExtra("Nom", Nom);
                    MainActivity.this.startActivity(myIntent);
                }
            });
            return insets;
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


}