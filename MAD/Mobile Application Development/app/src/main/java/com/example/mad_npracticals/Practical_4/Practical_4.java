package com.example.mad_npracticals.Practical_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;


import com.example.mad_npracticals.R;

public class Practical_4 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_practical4);

        Toolbar toolbar4;
        toolbar4=findViewById(R.id.toolBar4);

        setSupportActionBar(toolbar4);
        Log.d("lifecycle","onCreate invoked");
    }

    @Override

    protected void onStart() { super.onStart(); Log.d("lifecycle","onStart invoked");
    }

    @Override

    protected void onResume() { super.onResume(); Log.d("lifecycle","onResume invoked");
    }


    @Override

    protected void onPause() { super.onPause(); Log.d("lifecycle","onPause invoked");
    }

    @Override

    protected void onStop() { super.onStop(); Log.d("lifecycle","onStop invoked");
    }

    @Override

    protected void onRestart() { super.onRestart();

        Log.d("lifecycle","onRestart invoked");

    }

    @Override

    protected void onDestroy() { super.onDestroy(); Log.d("lifecycle","onDestroy invoked");
    }

}
