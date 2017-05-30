package demo.dinhconghome.nvcar.event_demo;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by nvcar on 5/29/2017.
 */

public class MainLogin extends AppCompatActivity implements View.OnClickListener {

    String id = "aaaaa";
    String pw = "asd123";

    EditText edtId,edtPw;
    Button btnLogin,btnExit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ex01);

        edtId = (EditText)findViewById(R.id.edtTenDangNhap);
        edtPw = (EditText)findViewById(R.id.edtMatKhau);
        btnLogin = (Button)findViewById(R.id.btnDangNhap);
        btnExit = (Button)findViewById(R.id.btnThoat);

        btnLogin.setOnClickListener(this);
        btnExit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnDangNhap:

                if(edtId.getText().toString().equals(id)&&edtPw.getText().toString().equals(pw)){
                    Toast.makeText(getApplicationContext(),"Success!",Toast.LENGTH_LONG).show();
                }else if(edtPw.getText().toString().equals(pw)==false) {
                    Toast.makeText(getApplicationContext(),"Fail!",Toast.LENGTH_LONG).show();
                }
                break;
            case  R.id.btnThoat:
                AlertDialog.Builder al = new AlertDialog.Builder(this);
                al.setTitle("Logout");
                al.setMessage("Bạn có muốn thoát?");
                al.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);

                    }
                });
                al.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                al.show();
                break;
        }
    }
}
