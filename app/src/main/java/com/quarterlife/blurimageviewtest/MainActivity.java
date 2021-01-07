package com.quarterlife.blurimageviewtest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.jgabrielfreitas.core.BlurImageView;

public class MainActivity extends AppCompatActivity {
    private boolean isBlur = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_blur = findViewById(R.id.btn_blur);
        final BlurImageView imageView = findViewById(R.id.imageView);

        btn_blur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isBlur){
                    imageView.setBlur(10);
                    isBlur = true;
                } else {
                    imageView.setBlur(0);
                    isBlur = false;
                }
            }
        });
    }
}