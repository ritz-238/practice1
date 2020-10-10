package com.ritz.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText enterItem;
    Button save;
    TextView itemText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterItem = findViewById(R.id.enter_item);
        save = findViewById(R.id.save);
        itemText = findViewById(R.id.item_text);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item = enterItem.getText().toString();
                if(item.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter text first", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, item, Toast.LENGTH_SHORT).show();
                    itemText.setText(item);
                }
            }
        });
    }
}