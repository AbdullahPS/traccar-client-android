/*
 * Copyright 2017 - 2020 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.client;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    //Intent intent = new Intent(MainActivity.this, MainApplication.class);

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

     setContentView(R.layout.main);
        //final EditText username = (EditText) findViewById(R.id.username);
       // final EditText password = (EditText) findViewById(R.id.password);
      //  final ImageView logo = (ImageView) findViewById(R.id.logo);
       // logo.startAnimation(AnimationUtils.loadAnimation(MainActivity.this,R.anim.side_slide));
        String [] usernames={"one","two","three","four"};
      //  final Button login = (Button) findViewById(R.id.loginButton);
//        login.setEnabled(true);

     //   login.setOnClickListener(v -> setContentView(R.layout.main));



    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    void checkInput (String us, String pa){
      /*  boolean isUser =false;
        for (int i=0;i<usernames.length;i++){
            if (usernames[i].equals(us));
                isUser=true;*/



        }

    }



