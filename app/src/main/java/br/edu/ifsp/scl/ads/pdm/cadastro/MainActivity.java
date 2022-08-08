package br.edu.ifsp.scl.ads.pdm.cadastro;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.ifsp.scl.ads.pdm.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding amb;
    private Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        amb = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(amb.getRoot());

        spinner = findViewById(R.id.ufSp);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ufs_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


    }

    public void limparDados(View view) {

    }

    public void salvarDados(View view) {
        Formulario form = new Formulario();

        form.setNome(amb.nomeEt.getText().toString());
        form.setTelefone(amb.telefoneEt.getText().toString());
        form.setEmail(amb.emailEt.getText().toString());
        form.setLista(amb.listaEmailCb.isChecked());
        form.setSexo(amb.femininoRb.isChecked() ? "Feminino" : "Masculino");
        form.setCidade(amb.cidadeEt.getText().toString());
        form.setUf(amb.ufSp.getSelectedItem().toString());

        System.out.println(form);
    }

}