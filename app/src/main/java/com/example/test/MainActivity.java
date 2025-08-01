package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout morning_pray = findViewById(R.id.morning_pray);
        LinearLayout evening_pray = findViewById(R.id.evening_pray);
        LinearLayout travel = findViewById(R.id.travel);
        LinearLayout mosque = findViewById(R.id.mosque);
        LinearLayout wake_up = findViewById(R.id.wake_up);
        LinearLayout sleep_pray = findViewById(R.id.sleep_pray);
        LinearLayout tasbeeh = findViewById(R.id.tasbeeh);
        LinearLayout elec_sebha = findViewById(R.id.elec_sebha);
        LinearLayout athkar_pray = findViewById(R.id.athkar_pray);
        LinearLayout after_pray = findViewById(R.id.after_pray);
        LinearLayout athan = findViewById(R.id.athan);
        LinearLayout istekhara = findViewById(R.id.istekhara);
        LinearLayout casket = findViewById(R.id.casket);
        LinearLayout loan = findViewById(R.id.loan);




        // morning_pray------------------------------------------------
        morning_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent morning_intent = new Intent(MainActivity.this, morning.class);
                startActivity(morning_intent);
                Toast.makeText(MainActivity.this, "اذكار الصباح", Toast.LENGTH_SHORT).show();
            }
        });
        // evening_pray------------------------------------------------
        evening_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent evening_intent = new Intent(MainActivity.this, evening.class);
                startActivity(evening_intent);
                Toast.makeText(MainActivity.this, "اذكار المساء", Toast.LENGTH_SHORT).show();
            }
        });
        // travel------------------------------------------------
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent travel_intent = new Intent(MainActivity.this, travel.class);
                startActivity(travel_intent);
                Toast.makeText(MainActivity.this, "دعاء السفر", Toast.LENGTH_SHORT).show();
            }
        });
        // mosque------------------------------------------------
        mosque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mosque_intent = new Intent(MainActivity.this, mosque.class);
                startActivity(mosque_intent);
                Toast.makeText(MainActivity.this, "دعاء الذهاب للمسجد", Toast.LENGTH_SHORT).show();
            }
        });
        // wake_up------------------------------------------------
        wake_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wake_up_intent = new Intent(MainActivity.this, wake_up.class);
                startActivity(wake_up_intent);
                Toast.makeText(MainActivity.this, "دعاء الاستيقاظ", Toast.LENGTH_SHORT).show();
            }
        });
        // sleep_pray------------------------------------------------
        sleep_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sleep_pray_intent = new Intent(MainActivity.this, sleep_pray.class);
                startActivity(sleep_pray_intent);
                Toast.makeText(MainActivity.this, "دعاء قبل النوم", Toast.LENGTH_SHORT).show();
            }
        });
        // tasbeeh------------------------------------------------
        tasbeeh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tasbeeh_intent = new Intent(MainActivity.this, tasbeeh.class);
                startActivity(tasbeeh_intent);
                Toast.makeText(MainActivity.this, "تسابيح", Toast.LENGTH_SHORT).show();
            }
        });
        // elec_sebha------------------------------------------------
        elec_sebha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elec_sebha_intent = new Intent(MainActivity.this, elec_sebha.class);
                startActivity(elec_sebha_intent);
                Toast.makeText(MainActivity.this, "مسبحة الكترونية", Toast.LENGTH_SHORT).show();
            }
        });
        // athkar_pray------------------------------------------------
        athkar_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent athkar_pray_intent = new Intent(MainActivity.this, athkar_pray.class);
                startActivity(athkar_pray_intent);
                Toast.makeText(MainActivity.this, "اذكار الصلاة", Toast.LENGTH_SHORT).show();
            }
        });
        // after_pray------------------------------------------------
        after_pray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent after_pray_intent = new Intent(MainActivity.this, after_pray.class);
                startActivity(after_pray_intent);
                Toast.makeText(MainActivity.this, "بعد الصلاة", Toast.LENGTH_SHORT).show();
            }
        });
        // athan------------------------------------------------
        athan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent athan_intent = new Intent(MainActivity.this, athan.class);
                startActivity(athan_intent);
                Toast.makeText(MainActivity.this, "سماع الاذان", Toast.LENGTH_SHORT).show();
            }
        });
        // istekhara------------------------------------------------
        istekhara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent istekhara_intent = new Intent(MainActivity.this, istekhara.class);
                startActivity(istekhara_intent);
                Toast.makeText(MainActivity.this, "دعاء الاستخارة", Toast.LENGTH_SHORT).show();
            }
        });
        // casket------------------------------------------------
        casket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent casket_intent = new Intent(MainActivity.this, casket.class);
                startActivity(casket_intent);
                Toast.makeText(MainActivity.this, "صلاة الجنازة", Toast.LENGTH_SHORT).show();
            }
        });
        // loan------------------------------------------------
        loan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loan_intent = new Intent(MainActivity.this, loan.class);
                startActivity(loan_intent);
                Toast.makeText(MainActivity.this, "دعاء قضاء الدين", Toast.LENGTH_SHORT).show();
            }
        });








    }
}