package br.com.fiap.trabalho.rm78710.nac2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class configuracoes extends AppCompatActivity {


    EditText tempo;

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(name, mode);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracoes);

        tempo = findViewById(R.id.tempo);
        sp = getSharedPreferences("tempo", MODE_PRIVATE);

        db = new BancoPizzas (this);

        Log log = new Log();
        java.util.Date currentTime = Calendar.getInstance().getTime();
        log.setDescricao("FragmentCalabresa");
        long time = currentTime.getTime();
        log.setData(time);
        db.insertLog(log);
    }

    public void salvar(View view) {

        int second = Integer.parseInt(tempo.getText().toString());
        int calc = second * 3000 || second > 30000){
            Toast.makeText(this,"Escolha entre 3 a 30 segundos", Toast.LENGTH_SHORT);{

            }else{
                SharedPreferences.Editor edit = sp.edit();
                edit.putInt("tempo", second);
                edit.commit();
                Toast.makeText(this, "Gravado com sucesso" + " " + second, Toast.LENGTH_SHORT);
            }
        }
    }
}
