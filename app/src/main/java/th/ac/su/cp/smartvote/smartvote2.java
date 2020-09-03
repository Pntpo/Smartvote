package th.ac.su.cp.smartvote;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class smartvote2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartvote2);


        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editnumber = findViewById(R.id.editnumber);
                String number = editnumber.getText().toString();
                AlertDialog.Builder p = new AlertDialog.Builder(smartvote2.this);
                p.setTitle("ผลการตรวจสอบสิทธิ์เลือกตั้ง");

                if (number.equals("1111111111111") || number.equals("2222222222222")) {
                    p.setMessage("คุณเป็นผู้มีสิทธิ์เลือกตั้ง");
                    p.setPositiveButton("ok", null);
                    p.show();

                } else if (number.length() != 13) {
                    Toast c = Toast.makeText(smartvote2.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG);
                    c.show();

                } else {
                    p.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                    p.setPositiveButton("ok", null);
                    p.show();
                }

            }
        });


    }
}