package com.example.govert.potato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // initialize ArrayLists for ImageViews and CheckBoxes
    private ArrayList<ImageView> allImageViews = new ArrayList<>();
    private ArrayList<CheckBox> allCheckBoxes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get ImageViews
        ImageView armsImageView = findViewById(R.id.armsImageView);
        ImageView earsImageView = findViewById(R.id.earsImageView);
        ImageView eyebrowsImageView = findViewById(R.id.eyebrowsImageView);
        ImageView eyesImageView = findViewById(R.id.eyesImageView);
        ImageView glassesImageView = findViewById(R.id.glassesImageView);
        ImageView hatImageView = findViewById(R.id.hatImageView);
        ImageView mouthImageView = findViewById(R.id.mouthImageView);
        ImageView mustacheImageView = findViewById(R.id.mustacheImageView);
        ImageView noseImageView = findViewById(R.id.noseImageView);
        ImageView shoesImageView = findViewById(R.id.shoesImageView);

        // add ImageViews to ArrayList
        allImageViews.add(armsImageView);
        allImageViews.add(earsImageView);
        allImageViews.add(eyebrowsImageView);
        allImageViews.add(eyesImageView);
        allImageViews.add(glassesImageView);
        allImageViews.add(hatImageView);
        allImageViews.add(mouthImageView);
        allImageViews.add(mustacheImageView);
        allImageViews.add(noseImageView);
        allImageViews.add(shoesImageView);

        // get CheckBoxes
        CheckBox Arms = findViewById(R.id.armsCheckBox);
        CheckBox Ears = findViewById(R.id.earsCheckBox);
        CheckBox Eyebrows = findViewById(R.id.eyebrowsCheckBox);
        CheckBox Eyes = findViewById(R.id.eyesCheckBox);
        CheckBox Glasses = findViewById(R.id.glassesCheckBox);
        CheckBox Hat = findViewById(R.id.hatCheckBox);
        CheckBox Mouth = findViewById(R.id.mouthCheckBox);
        CheckBox Mustache = findViewById(R.id.mustacheCheckBox);
        CheckBox Nose = findViewById(R.id.noseCheckBox);
        CheckBox Shoes = findViewById(R.id.shoesCheckBox);

        // add CheckBoxes to ArrayList
        allCheckBoxes.add(Arms);
        allCheckBoxes.add(Ears);
        allCheckBoxes.add(Eyebrows);
        allCheckBoxes.add(Eyes);
        allCheckBoxes.add(Glasses);
        allCheckBoxes.add(Hat);
        allCheckBoxes.add(Mouth);
        allCheckBoxes.add(Mustache);
        allCheckBoxes.add(Nose);
        allCheckBoxes.add(Shoes);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // save CheckBoxes
        for (CheckBox checkBox : allCheckBoxes) {
            if (checkBox.isChecked()) {
                outState.putBoolean(checkBox.getText().toString(), true);
            }
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        // load CheckBoxes
        for (CheckBox checkBox : allCheckBoxes) {
            // get text
            String text = checkBox.getText().toString();
            if (savedInstanceState.getBoolean(text)) {
                // set ImageViews
                setAllImageViews(text);
                }
            }
    }

    public void checkClicked(View view) {
        // get checkBox
        CheckBox checkBox = (CheckBox) view;

        // get text
        String text = checkBox.getText().toString();

        // set ImageView
        setAllImageViews(text);
    }

    public void setAllImageViews(String text) {
        // iterate over imageViews
        for (ImageView imageView : allImageViews) {
            // get contentDescription text
            String contentDescription = imageView.getContentDescription().toString();

            // set visibility for the right imageView
            if (text.equals(contentDescription)) {
                imageView.setVisibility(imageView.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
            }
        }
    }
}
