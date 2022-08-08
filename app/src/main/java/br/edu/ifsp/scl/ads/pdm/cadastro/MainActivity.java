package br.edu.ifsp.scl.ads.pdm.cadastro;

import static android.view.Gravity.CENTER_HORIZONTAL;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

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

        spinner = amb.ufSp;
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ufs_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void limparDados(View view) {
        amb.nomeEt.setText("");
        amb.telefoneEt.setText("");
        amb.emailEt.setText("");
        amb.cidadeEt.setText("");
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

        Toast toast = Toast.makeText(getApplicationContext(), form.toString(), Toast.LENGTH_LONG);
        toast.setGravity(CENTER_HORIZONTAL, 0, 0);
        limparDados(view);
        toast.show();
        System.out.println(form);
    }

}