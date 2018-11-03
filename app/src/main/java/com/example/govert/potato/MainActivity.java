package com.example.govert.potato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;
    private CheckBox Arms, Ears, Eyebrows, Eyes, Glasses, Hat, Mouth, Mustache, Nose, Shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Arms = findViewById(R.id.ArmsBox);
        if(Arms.isChecked()) {
            outState.putBoolean("checkedBoxArms", true);
        }
        Ears = findViewById(R.id.EarsBox);
        if(Ears.isChecked()) {
            outState.putBoolean("checkedBoxEars", true);
        }
        Eyebrows = findViewById(R.id.EyebrowsBox);
        if(Eyebrows.isChecked()) {
            outState.putBoolean("checkedBoxEyebrows", true);
        }
        Eyes = findViewById(R.id.EyesBox);
        if(Eyes.isChecked()) {
            outState.putBoolean("checkedBoxEyes", true);
        }
        Glasses = findViewById(R.id.GlassesBox);
        if(Glasses.isChecked()) {
            outState.putBoolean("checkedBoxGlasses", true);
        }
        Hat = findViewById(R.id.HatBox);
        if(Hat.isChecked()) {
            outState.putBoolean("checkedBoxHat", true);
        }
        Mouth = findViewById(R.id.MouthBox);
        if(Mouth.isChecked()) {
            outState.putBoolean("checkedBoxMouth", true);
        }
        Mustache = findViewById(R.id.MustacheBox);
        if(Mustache.isChecked()) {
            outState.putBoolean("checkedBoxMustache", true);
        }
        Nose = findViewById(R.id.NoseBox);
        if(Nose.isChecked()) {
            outState.putBoolean("checkedBoxNose", true);
        }
        Shoes = findViewById(R.id.ShoesBox);
        if(Shoes.isChecked()) {
            outState.putBoolean("checkedBoxShoes", true);
        }
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        boolean checkedBoxArms = savedInstanceState.getBoolean("checkedBoxArms");
        if(checkedBoxArms) {
            arms = findViewById(R.id.ArmsView);
            arms.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxEars = savedInstanceState.getBoolean("checkedBoxEars");
        if(checkedBoxEars) {
            ears = findViewById(R.id.EarsView);
            ears.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxEyebrows = savedInstanceState.getBoolean("checkedBoxEyebrows");
        if(checkedBoxEyebrows) {
            eyebrows = findViewById(R.id.EyebrowsView);
            eyebrows.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxEyes = savedInstanceState.getBoolean("checkedBoxEyes");
        if(checkedBoxEyes) {
            eyes = findViewById(R.id.EyesView);
            eyes.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxGlasses = savedInstanceState.getBoolean("checkedBoxGlasses");
        if(checkedBoxGlasses) {
            glasses = findViewById(R.id.GlassesView);
            glasses.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxHat = savedInstanceState.getBoolean("checkedBoxHat");
        if(checkedBoxHat) {
            hat = findViewById(R.id.HatView);
            hat.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxMouth = savedInstanceState.getBoolean("checkedBoxMouth");
        if(checkedBoxMouth) {
            mouth = findViewById(R.id.MouthView);
            mouth.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxMustache = savedInstanceState.getBoolean("checkedBoxMustache");
        if(checkedBoxMustache) {
            mustache = findViewById(R.id.MustacheView);
            mustache.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxNose = savedInstanceState.getBoolean("checkedBoxNose");
        if(checkedBoxNose) {
            nose = findViewById(R.id.NoseView);
            nose.setVisibility(View.VISIBLE);
        }
        boolean checkedBoxShoes = savedInstanceState.getBoolean("checkedBoxShoes");
        if(checkedBoxShoes) {
            shoes = findViewById(R.id.ShoesView);
            shoes.setVisibility(View.VISIBLE);
        }
    }

    public void checkClicked(View view) {
        CheckBox checkbox = (CheckBox) view;
        String s = checkbox.getText().toString();
        switch(s) {
            case "Arms":
                arms = findViewById(R.id.ArmsView);
                arms.setVisibility(arms.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Ears":
                ears = findViewById(R.id.EarsView);
                ears.setVisibility(ears.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Eyebrows":
                eyebrows = findViewById(R.id.EyebrowsView);
                eyebrows.setVisibility(eyebrows.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Eyes":
                eyes = findViewById(R.id.EyesView);
                eyes.setVisibility(eyes.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Glasses":
                glasses = findViewById(R.id.GlassesView);
                glasses.setVisibility(glasses.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Hat":
                hat = findViewById(R.id.HatView);
                hat.setVisibility(hat.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Mouth":
                mouth = findViewById(R.id.MouthView);
                mouth.setVisibility(mouth.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Mustache":
                mustache = findViewById(R.id.MustacheView);
                mustache.setVisibility(mustache.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Nose":
                nose = findViewById(R.id.NoseView);
                nose.setVisibility(nose.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
            case "Shoes":
                shoes = findViewById(R.id.ShoesView);
                shoes.setVisibility(shoes.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
                break;
        }
    }
}
