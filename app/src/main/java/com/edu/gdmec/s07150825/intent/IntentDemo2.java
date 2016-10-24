package com.edu.gdmec.s07150825.intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by hasee on 2016/10/24.
 */
public class IntentDemo2 extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo2);
    }

    public void upper(View v){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        final String value=bundle.getString("values").toUpperCase();
        Intent intentresult=new Intent();
        intentresult.putExtra("result",value);
        setResult(RESULT_OK,intentresult);
        finish();
    }

}
