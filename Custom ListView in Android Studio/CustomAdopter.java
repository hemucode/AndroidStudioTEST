package com.hemu.myfirstapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class CustomAdopter extends ArrayAdapter<String> {
    private Context context;
    private String [] Branch_name;
    private Integer [] Image_Res;

    public CustomAdopter(Context context, String [] Branch_name, Integer [] Image_Res) {
        super(context, R.layout.item, Branch_name);
        this.Branch_name = Branch_name;
        this.Image_Res = Image_Res;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item,null,false);

        TextView textView = view.findViewById(R.id.Item_text_view);
        ImageView imageView = view.findViewById(R.id.Item_Image_View);
        textView.setText(Branch_name[position]);
        imageView.setImageResource(Image_Res[position]);
        return view;

    }
}
