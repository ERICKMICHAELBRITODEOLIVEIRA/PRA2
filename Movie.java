package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "movies")
public class Movie {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "movieId")
    private int id;
    @NonNull
    @ColumnInfo(name = "movieCreationDate")
    private String creationDate;
    @NonNull
    @ColumnInfo(name = "movieTitle")
    private String title;
    @NonNull
    @ColumnInfo(name = "movieStrikingScene")
    private String strikingScene;
    @NonNull
    @ColumnInfo(name = "movieScore")
    private int score;

public Movie (String creationDate, String title, String StrikingScene, int score) {
        creationDate = creationDate;
        title = title;
        strikingScene = strikingScene;
        score = score;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        creationDate = creationDate;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        title = title;
    }

    public String getStrikingScene() {
        return strikingScene;
    }
    public void setStrikingScene(String StrikingScene) {
        strikingScene = strikingScene;
    }

    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        score = score;
    }

}
