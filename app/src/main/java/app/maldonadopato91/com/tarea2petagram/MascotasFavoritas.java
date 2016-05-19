package app.maldonadopato91.com.tarea2petagram;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MascotasFavoritas extends AppCompatActivity {
    private List<Mascota> mascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context context = getBaseContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);
        Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        DataSet();
        RecyclerView rvMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        rvMascotas.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(context);
        rvMascotas.setLayoutManager(llm);
        RVAdapter adapter = new RVAdapter(mascotas);
        rvMascotas.setAdapter(adapter);
    }

    private void DataSet(){
        mascotas = new ArrayList<>();
        mascotas.add(new Mascota(R.drawable.gray_puppy, "Crystal"));
        mascotas.add(new Mascota(R.drawable.lambo, "Lamborghini"));
        mascotas.add(new Mascota(R.drawable.nacho, "Nacho"));
        mascotas.add(new Mascota(R.drawable.prada, "Prada"));
        mascotas.add(new Mascota(R.drawable.vidal, "Vidal"));
    }
}
