package com.example.profileuiforbothportraitandlandscape;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageView profileImg;
    RecyclerView rv;
    private ArrayList<BookModel> bookModels;
    private Context context = MainActivity.this;
    BookAdapterModel adapter;
    private int images[] = {R.drawable.book4, R.drawable.book3, R.drawable.book2, R.drawable.book1};
    private String names[] = {"Midnight Dreams", "Lethal Waves", "All the Night", "Graphic Novel"};
    private int progress[] = {75, 70, 65, 60};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.rv1);
        profileImg = findViewById(R.id.circleProfile);
        bookModels = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            bookModels.add(new BookModel(images[i], progress[i], names[i], progress[i] + ""));
        }


        adapter = new BookAdapterModel(bookModels, context);
        rv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        rv.setAdapter(adapter);


        //لجعل الصورة دائرية
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.maxresdefault);
        RoundedBitmapDrawable roundedBitmap = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        roundedBitmap.setCircular(true);
        profileImg.setImageDrawable(roundedBitmap);


    }
}
