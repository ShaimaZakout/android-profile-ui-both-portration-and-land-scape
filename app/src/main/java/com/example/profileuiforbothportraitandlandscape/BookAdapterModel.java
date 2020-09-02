package com.example.profileuiforbothportraitandlandscape;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookAdapterModel extends RecyclerView.Adapter<BookAdapterModel.BookViewHolder> {
    private ArrayList<BookModel> bookModels;
    private Context context;

    public BookAdapterModel(ArrayList<BookModel> bookModels, Context context) {
        this.bookModels = bookModels;
        this.context = context;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {
        ImageView bookImge;
        TextView progressNum, bookName;
        ProgressBar progressBar;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void setImageView(int settingImage) {
            bookImge = itemView.findViewById(R.id.image_holder);
            bookImge.setImageResource(settingImage);

        }

        public void setProgressNum(String s) {
            progressNum = itemView.findViewById(R.id.progress_num);
            progressNum.setText(s);
        }

        public void setProgressBar(int settingProgress) {
            progressBar = itemView.findViewById(R.id.progress);
            progressBar.setProgress(settingProgress);
        }

        public void setName(String settingName) {
            bookName = itemView.findViewById(R.id.name_holder);
            bookName.setText(settingName);
        }
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_recv, null, false)
        );

    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {

        int settingImage = bookModels.get(position).getBookImg();
        holder.setImageView(settingImage);

        String settingName = bookModels.get(position).getBookName();
        holder.setName(settingName);

        String settingProgressNum = bookModels.get(position).getProgressNum();
        holder.setProgressNum(settingProgressNum + "% completed");

        int settingProgress = bookModels.get(position).getProgress();
        holder.setProgressBar(settingProgress);
    }

    @Override
    public int getItemCount() {
        return bookModels.size();
    }


}
