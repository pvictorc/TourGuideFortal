package br.com.oaklabs.tourguidefortal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {


    public PlaceAdapter(@NonNull Context context, int resource, @NonNull List<Place> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView name = (TextView) listItemView.findViewById(R.id.item_name);
        name.setText(currentPlace.getName());

        TextView address = (TextView) listItemView.findViewById(R.id.item_address);
        address.setText(currentPlace.getAddress());

        ImageView image = (ImageView) listItemView.findViewById(R.id.item_image);
        image.setImageResource(currentPlace.getImageID());

        return listItemView;
    }
}
