package app.maldonadopato91.com.tarea2petagram;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MascotaViewHolder>{


    List<Mascota> mascotas;

    RVAdapter(List<Mascota> mascotas){
        this.mascotas = mascotas;
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_mascota, viewGroup, false);
        MascotaViewHolder mvh = new MascotaViewHolder(v);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MascotaViewHolder mascotaViewHolder, int i) {
        mascotaViewHolder.ivMascotaFoto.setImageResource(mascotas.get(i).getFotoMascota());
        mascotaViewHolder.tvNombreMascota.setText(mascotas.get(i).getNombreMasco());
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        CardView cvMascota;
        TextView tvNombreMascota;
        ImageView ivMascotaFoto;

        MascotaViewHolder(View itemView) {
            super(itemView);
            cvMascota = (CardView)itemView.findViewById(R.id.cvMascota);
            tvNombreMascota = (TextView)itemView.findViewById(R.id.tvNombreMascota);
            ivMascotaFoto = (ImageView)itemView.findViewById(R.id.ivMascotaFoto);
        }
    }

}
