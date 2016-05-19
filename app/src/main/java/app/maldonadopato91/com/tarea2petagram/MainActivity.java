package app.maldonadopato91.com.tarea2petagram;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getBaseContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        DataSet();
        RecyclerView rvMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        rvMascotas.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rvMascotas.setLayoutManager(llm);
        RVAdapter adapter = new RVAdapter(mascotas);
        rvMascotas.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_petagram, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.mFavoritos:
                Intent intent = new Intent(MainActivity.this, MascotasFavoritas.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    private void DataSet(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.ax, "Armani"));
        mascotas.add(new Mascota(R.drawable.dior, "Dior"));
        mascotas.add(new Mascota(R.drawable.gray_puppy, "Crystal"));
        mascotas.add(new Mascota(R.drawable.lambo, "Lamborghini"));
        mascotas.add(new Mascota(R.drawable.nacho, "Nacho"));
        mascotas.add(new Mascota(R.drawable.prada, "Prada"));
        mascotas.add(new Mascota(R.drawable.vidal, "Vidal"));
    }
}
