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

        // add ImageViews to ArrayList
        allImageViews.add((ImageView) findViewById(R.id.armsImageView));
        allImageViews.add((ImageView) findViewById(R.id.earsImageView));
        allImageViews.add((ImageView) findViewById(R.id.eyebrowsImageView));
        allImageViews.add((ImageView) findViewById(R.id.eyesImageView));
        allImageViews.add((ImageView) findViewById(R.id.glassesImageView));
        allImageViews.add((ImageView) findViewById(R.id.hatImageView));
        allImageViews.add((ImageView) findViewById(R.id.mouthImageView));
        allImageViews.add((ImageView) findViewById(R.id.mustacheImageView));
        allImageViews.add((ImageView) findViewById(R.id.noseImageView));
        allImageViews.add((ImageView) findViewById(R.id.shoesImageView));

        // add CheckBoxes to ArrayList
        allCheckBoxes.add((CheckBox) findViewById(R.id.armsCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.earsCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.eyebrowsCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.eyesCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.glassesCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.hatCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.mouthCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.mustacheCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.noseCheckBox));
        allCheckBoxes.add((CheckBox) findViewById(R.id.shoesCheckBox));
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

        // set ImageView
        setAllImageViews(checkBox.getText().toString());
    }

    public void setAllImageViews(String text) {
        // iterate over imageViews
        for (ImageView imageView : allImageViews) {
            // set visibility for the right imageView
            if (text.equals(imageView.getContentDescription().toString())) {
                imageView.setVisibility(imageView.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
            }
        }
    }
}
