package com.example.intentt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private boolean isHewan1Liked = false;
    private boolean isHewan2Liked = false;
    private boolean isHewan3Liked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageButton buttonHewan1Like = findViewById(R.id.button_hewan1_like);
        buttonHewan1Like.setOnClickListener(v -> toggleLike(buttonHewan1Like, 1));

        ImageButton buttonHewan2Like = findViewById(R.id.button_hewan2_like);
        buttonHewan2Like.setOnClickListener(v -> toggleLike(buttonHewan2Like, 2));

        ImageButton buttonHewan3Like = findViewById(R.id.button_hewan3_like);
        buttonHewan3Like.setOnClickListener(v -> toggleLike(buttonHewan3Like, 3));
    }


    private void toggleLike(ImageButton button, int hewanId) {
        boolean isLiked = false;

        switch (hewanId) {
            case 1:
                isLiked = isHewan1Liked;
                isHewan1Liked = !isHewan1Liked;
                break;
            case 2:
                isLiked = isHewan2Liked;
                isHewan2Liked = !isHewan2Liked;
                break;
            case 3:
                isLiked = isHewan3Liked;
                isHewan3Liked = !isHewan3Liked;
                break;
        }


        if (isLiked) {
            button.setColorFilter(getResources().getColor(R.color.unlike_button_color));
            Toast.makeText(this, "You unliked!", Toast.LENGTH_SHORT).show();
        } else {
            button.setColorFilter(getResources().getColor(R.color.like_button_color));
            Toast.makeText(this, "You liked!", Toast.LENGTH_SHORT).show();
        }
    }

    public void openHewan1YouTubeLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=harimau"));
        startActivity(browserIntent);
    }

    public void openHewan2YouTubeLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=kucing"));
        startActivity(browserIntent);
    }

    public void openHewan3YouTubeLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=anjing"));
        startActivity(browserIntent);
    }

    public void openHewan1GoogleLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=harimau"));
        startActivity(browserIntent);
    }

    public void openHewan2GoogleLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=kucing"));
        startActivity(browserIntent);
    }

    public void openHewan3GoogleLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=anjing"));
        startActivity(browserIntent);
    }


    public void likeHewan1(View view) {
        Toast.makeText(this, "You liked Harimau!", Toast.LENGTH_SHORT).show();
    }

    public void shareHewan1(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing Harimau!");
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }


    public void likeHewan2(View view) {
        Toast.makeText(this, "You liked Kucing!", Toast.LENGTH_SHORT).show();
    }

    public void shareHewan2(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing Kucing!");
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }


    public void likeHewan3(View view) {
        Toast.makeText(this, "You liked Anjing!", Toast.LENGTH_SHORT).show();
    }

    public void shareHewan3(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing Anjing!");
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }
}
