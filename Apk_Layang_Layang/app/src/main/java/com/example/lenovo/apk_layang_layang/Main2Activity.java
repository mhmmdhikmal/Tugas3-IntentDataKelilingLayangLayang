package com.example.lenovo.apk_layang_layang;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    private EditText inputan1, inputan2, inputan3, inputan4;
    private Button btnH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        inputan1 = findViewById(R.id.input_pendek1);
        inputan2 = findViewById(R.id.input_pendek2);
        inputan3 = findViewById(R.id.input_panjang1);
        inputan4 = findViewById(R.id.input_panjang2);
        btnH = findViewById(R.id.btn_hitung);

        btnH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer rumus = 2;
                final String inp1 = inputan1.getText().toString().trim();
                final String inp2 = inputan2.getText().toString().trim();
                final String inp3 = inputan3.getText().toString().trim();
                final String inp4 = inputan4.getText().toString().trim();
                Integer in1 = toInt(inp1);
                Integer in2 = toInt(inp2);
                Integer in3 = toInt(inp1);
                Integer in4 = toInt(inp2);

                Integer hasil = Integer.parseInt(inp1)+Integer.parseInt(inp2)+Integer.parseInt(inp3)+Integer.parseInt(inp4);
                Intent intent = new Intent();
                intent.setData(Uri.parse(String.valueOf(hasil)));
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }

    private Integer toInt(String str) {
        try {
            return Integer.parseInt(str);
        }catch (Exception e){
            return null;
        }
    }
}
