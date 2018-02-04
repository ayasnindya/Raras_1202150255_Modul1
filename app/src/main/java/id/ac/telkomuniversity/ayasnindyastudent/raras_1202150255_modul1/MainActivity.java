package id.ac.telkomuniversity.ayasnindyastudent.raras_1202150255_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mNamaMenu, mBanyakPorsi;
    Button mButtonEatbus, mButtonAbnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNamaMenu = findViewById(R.id.menu);
        mBanyakPorsi = findViewById(R.id.porsi);
        mButtonEatbus = findViewById(R.id.button1);
        mButtonAbnormal = findViewById(R.id.button2);

        mButtonEatbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("namatempat", "EATBUS");
                intent.putExtra("namamenu", mNamaMenu.getText().toString());
                intent.putExtra("jumlahporsi", mBanyakPorsi.getText().toString());
                intent.putExtra("totalharga", "50000");
                startActivity(intent);
            }
        });

        mButtonAbnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("namatempat", "ABNORMAL");
                intent.putExtra("namamenu", mNamaMenu.getText().toString());
                intent.putExtra("jumlahporsi", mBanyakPorsi.getText().toString());
                intent.putExtra("totalharga", "30000");
                startActivity(intent);
            }
        });
    }
}


