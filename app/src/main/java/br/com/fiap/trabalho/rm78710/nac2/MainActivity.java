package br.com.fiap.trabalho.rm78710.nac2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText login;
    EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);

    }

    public void entrar(View view) {
        if(login.getText().toString().equals("fiap") && password.getText().toString().equals("fiap")){
            Toast.makeText(getApplicationContext(), R.string.redirecionando, Toast.LENGTH_LONG).show();
            Intent myintent = new Intent(MainActivity.this, LoggedActivity.class);
            startActivity(myintent);
        }else{
            Toast.makeText(getApplicationContext(), R.string.dadosInvalidos, Toast.LENGTH_LONG).show();
        }
    }




}
