package com.example.profileuiforbothportraitandlandscape;

public class BookModel {
    int bookImg,progress;
    String bookName,progressNum;

    public BookModel(int bookImg, int progress, String bookName, String progressNum) {
        this.bookImg = bookImg;
        this.progress = progress;
        this.bookName = bookName;
        this.progressNum = progressNum;
    }

    public int getBookImg() {
        return bookImg;
    }

    public void setBookImg(int bookImg) {
        this.bookImg = bookImg;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getProgressNum() {
        return progressNum;
    }

    public void setProgressNum(String progressNum) {
        this.progressNum = progressNum;
    }
}
