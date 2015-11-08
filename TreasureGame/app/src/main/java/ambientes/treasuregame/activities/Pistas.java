package ambientes.treasuregame.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import ambientes.treasuregame.R;
import ambientes.treasuregame.datos.Cuestionario;
import ambientes.treasuregame.datos.Pista;

/**
 * Actividad que controla el menú de Pistas
 */
public class Pistas extends ActionBarActivity {

    Button pistaUno;

    Button pistaDos;

    Button pistaTres;

    Button pistaCuatro;

    Button pistaCinco;

    Button pistaSeis;

    Button pistaSiete;

    Button pistaOcho;

    Button pistaNueve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pistas);

        //Intent newInt = getIntent();
        //Bundle bndl = newInt.getExtras();
        //ArrayList<Cuestionario> c = (ArrayList<Cuestionario>) bndl.get("Cuestionario");
        //ArrayList<Pista> p = (ArrayList<Pista>) bndl.get("Pistas");

        //Call the widgets
        pistaUno = (Button)findViewById(R.id.pistaUno);
        pistaDos = (Button)findViewById(R.id.pistaDos);
        pistaTres = (Button)findViewById(R.id.pistaTres);
        pistaCuatro = (Button)findViewById(R.id.pistaCuatro);
        pistaCinco = (Button)findViewById(R.id.pistaCinco);
        pistaSeis = (Button)findViewById(R.id.pistaSeis);
        pistaSiete = (Button)findViewById(R.id.pistaSiete);
        pistaOcho = (Button)findViewById(R.id.pistaOcho);
        pistaNueve = (Button)findViewById(R.id.pistaNueve);

        pistaUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_1.class);
                startActivity(i);
            }
        });

        pistaDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_2.class);
                startActivity(i);
            }
        });

        pistaTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_3.class);
                startActivity(i);
            }
        });

        pistaCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_4.class);
                startActivity(i);
            }
        });

        pistaCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_5.class);
                startActivity(i);
            }
        });

        pistaSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_6.class);
                startActivity(i);
            }
        });

        pistaSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_7.class);
                startActivity(i);
            }
        });

        pistaOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_8.class);
                startActivity(i);
            }
        });

        pistaNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_9.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onStart(){
        super.onStart();

        pistaUno = (Button)findViewById(R.id.pistaUno);
        pistaDos = (Button)findViewById(R.id.pistaDos);
        pistaTres = (Button)findViewById(R.id.pistaTres);
        pistaCuatro = (Button)findViewById(R.id.pistaCuatro);
        pistaCinco = (Button)findViewById(R.id.pistaCinco);
        pistaSeis = (Button)findViewById(R.id.pistaSeis);
        pistaSiete = (Button)findViewById(R.id.pistaSiete);
        pistaOcho = (Button)findViewById(R.id.pistaOcho);
        pistaNueve = (Button)findViewById(R.id.pistaNueve);

        pistaUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_1.class);
                startActivity(i);
            }
        });

        pistaDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_2.class);
                startActivity(i);
            }
        });

        pistaTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_3.class);
                startActivity(i);
            }
        });

        pistaCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_4.class);
                startActivity(i);
            }
        });

        pistaCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_5.class);
                startActivity(i);
            }
        });

        pistaSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_6.class);
                startActivity(i);
            }
        });

        pistaSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_7.class);
                startActivity(i);
            }
        });

        pistaOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_8.class);
                startActivity(i);
            }
        });

        pistaNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_9.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();

        pistaUno = (Button)findViewById(R.id.pistaUno);
        pistaDos = (Button)findViewById(R.id.pistaDos);
        pistaTres = (Button)findViewById(R.id.pistaTres);
        pistaCuatro = (Button)findViewById(R.id.pistaCuatro);
        pistaCinco = (Button)findViewById(R.id.pistaCinco);
        pistaSeis = (Button)findViewById(R.id.pistaSeis);
        pistaSiete = (Button)findViewById(R.id.pistaSiete);
        pistaOcho = (Button)findViewById(R.id.pistaOcho);
        pistaNueve = (Button)findViewById(R.id.pistaNueve);

        pistaUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_1.class);
                startActivity(i);
            }
        });

        pistaDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_2.class);
                startActivity(i);
            }
        });

        pistaTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_3.class);
                startActivity(i);
            }
        });

        pistaCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_4.class);
                startActivity(i);
            }
        });

        pistaCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_5.class);
                startActivity(i);
            }
        });

        pistaSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_6.class);
                startActivity(i);
            }
        });

        pistaSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_7.class);
                startActivity(i);
            }
        });

        pistaOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_8.class);
                startActivity(i);
            }
        });

        pistaNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Pistas.this, Pista_9.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pistas, menu);
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
}
