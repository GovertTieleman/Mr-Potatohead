package com.example.govert.potato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
