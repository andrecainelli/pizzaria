package br.com.fiap.trabalho.rm78710.nac2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class LoggedActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged);
    }

    public void mussarela(View view) {
        Intent myintent = new Intent(this, Mussarela.class);
        startActivity(myintent);
    }

    public void frangoCatupiry(View view) {
        Intent myintent = new Intent(this, Frango.class);
        startActivity(myintent);
    }

    public void calabresa(View view) {
        Intent myintent = new Intent(this, Calabresa.class);
        startActivity(myintent);
    }

    public void margerita(View view) {
        Intent myintent = new Intent(this, Margerita.class);
        startActivity(myintent);
    }




    //Mainmenu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.configuracoes){
            Intent myintent = new Intent(LoggedActivity.this, configuracoes.class);
            startActivity(myintent);
        }
        return super.onOptionsItemSelected(item);
    }




}
