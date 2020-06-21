package com.rogers.dogsapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity
public class DogBreed {

    @ColumnInfo(name = "id")
    @SerializedName("id")
    public String breedId;

    @ColumnInfo(name = "dog_name")
    @SerializedName("name")
    public String dogBreed;

    @ColumnInfo(name = "life_span")
    @SerializedName("life_span")
    public String lifeSpan;

    @ColumnInfo(name = "breed_group")
    @SerializedName("breed_group")
    public String breedGroup;

    @ColumnInfo(name = "bred_for")
    @SerializedName("bred_for")
    public String bredFor;

 //   @SerializedName("temperament")
    public String temperament;

    @ColumnInfo(name = "dog_url")
    @SerializedName("url")
    public String imageUri;

    @PrimaryKey(autoGenerate = true)
    public int uuid;

    public DogBreed(String breedId, String dogBreed, String lifeSpan, String breedGroup, String bredFor, String temperament, String imageUri) {
        this.breedId = breedId;
        this.dogBreed = dogBreed;
        this.lifeSpan = lifeSpan;
        this.breedGroup = breedGroup;
        this.bredFor = bredFor;
        this.temperament = temperament;
        this.imageUri = imageUri;
    }
}
