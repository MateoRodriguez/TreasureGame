package ambientes.treasuregame.activities;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import ambientes.treasuregame.R;
import ambientes.treasuregame.datos.Cuestionario;
import ambientes.treasuregame.datos.Pista;


public class MainActivity extends ActionBarActivity {

    /**
     * Cuestionario
     */
    private Cuestionario cuestionario;

    /**
     * Lista de pistas
     */
    private ArrayList<Pista> pistas;

    /**
     * Variable para llamar al boton en el layout.
     */
    Button btnPlay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadData();

        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                Intent i = new Intent(MainActivity.this, Pistas.class);

                ArrayList<Cuestionario> c = new ArrayList<>();
                c.add(cuestionario);
                //i.putExtra("Cuestionario", c);
                //i.putExtra("Pistas", pistas);

                startActivity(i);
            }
        });
    }


    @Override
    public void onStart(){
        super.onStart();

        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Pistas.class);

                ArrayList<Cuestionario> c = new ArrayList<>();
                c.add(cuestionario);
                //i.putExtra("Cuestionario", cuestionario);
                //i.putExtra("Pistas", pistas);

                startActivity(i);
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();
        btnPlay = (Button)findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, Pistas.class);

                ArrayList<Cuestionario> c = new ArrayList<>();
                c.add(cuestionario);
                //i.putExtra("Cuestionario", c);
                //i.putExtra("Pistas", pistas);

                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Crea los datos iniciales y basicos: un cuestionario y las pistas asociadas.
     */
    private void loadData(){
        cuestionario = new Cuestionario("Treasure Game");
        pistas = new ArrayList<Pista>();



        Pista pista1 = new Pista(0000, false);
        Pista pista2 = new Pista(1111, false);
        Pista pista3 = new Pista(1110, false);
        Pista pista4 = new Pista(1101, false);
        Pista pista5 = new Pista(1100, false);
        Pista pista6 = new Pista(1011, false);
        Pista pista7 = new Pista(1010, false);
        Pista pista8 = new Pista(1001, false);
        Pista pista9 = new Pista(1000, false);

        //Asignar la pista sucesora a cada pista
        pista2.setAnterior(pista1);
        pista3.setAnterior(pista2);
        pista4.setAnterior(pista3);
        pista5.setAnterior(pista4);
        pista6.setAnterior(pista5);

        pista7.setAnterior(pista4);
        pista8.setAnterior(pista7);
        pista9.setAnterior(pista8);

        //Agregar cada pista al arraylist
        pistas.add(pista1);
        pistas.add(pista2);
        pistas.add(pista3);
        pistas.add(pista4);
        pistas.add(pista5);
        pistas.add(pista6);
        pistas.add(pista7);
        pistas.add(pista8);
        pistas.add(pista9);

        cuestionario.setPistas(pistas);
        //Toast.makeText(getApplicationContext(), "Sale a load data", Toast.LENGTH_LONG).show();

    }
}
