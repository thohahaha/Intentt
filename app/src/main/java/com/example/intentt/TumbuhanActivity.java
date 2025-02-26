package com.example.intentt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TumbuhanActivity extends AppCompatActivity {

    private boolean isTumbuhan1Liked = false;
    private boolean isTumbuhan2Liked = false;
    private boolean isTumbuhan3Liked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tumbuhan);

        // Set click listeners for like buttons
        ImageButton buttonTumbuhan1Like = findViewById(R.id.button_tumbuhan1_like);
        buttonTumbuhan1Like.setOnClickListener(v -> toggleLike(buttonTumbuhan1Like, 1));

        ImageButton buttonTumbuhan2Like = findViewById(R.id.button_tumbuhan2_like);
        buttonTumbuhan2Like.setOnClickListener(v -> toggleLike(buttonTumbuhan2Like, 2));

        ImageButton buttonTumbuhan3Like = findViewById(R.id.button_tumbuhan3_like);
        buttonTumbuhan3Like.setOnClickListener(v -> toggleLike(buttonTumbuhan3Like, 3));
    }

    // Method to toggle like status and change button color
    private void toggleLike(ImageButton button, int tumbuhanId) {
        boolean isLiked = false;

        switch (tumbuhanId) {
            case 1:
                isLiked = isTumbuhan1Liked;
                isTumbuhan1Liked = !isTumbuhan1Liked;
                break;
            case 2:
                isLiked = isTumbuhan2Liked;
                isTumbuhan2Liked = !isTumbuhan2Liked;
                break;
            case 3:
                isLiked = isTumbuhan3Liked;
                isTumbuhan3Liked = !isTumbuhan3Liked;
                break;
        }

        // Change button color based on like status
        if (isLiked) {
            button.setColorFilter(getResources().getColor(R.color.unlike_button_color)); // Change to unliked color
            Toast.makeText(this, "You unliked!", Toast.LENGTH_SHORT).show();
        } else {
            button.setColorFilter(getResources().getColor(R.color.like_button_color)); // Change to liked color
            Toast.makeText(this, "You liked!", Toast.LENGTH_SHORT).show();
        }
    }

    // Method to open YouTube search results
    public void openTumbuhan1YouTubeLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=pohon+mangga"));
        startActivity(browserIntent);
    }

    public void openTumbuhan2YouTubeLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=padi"));
        startActivity(browserIntent);
    }

    public void openTumbuhan3YouTubeLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/results?search_query=pohon+ringin"));
        startActivity(browserIntent);
    }

    // Method to open Google search results
    public void openTumbuhan1GoogleLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=pohon+mangga"));
        startActivity(browserIntent);
    }

    public void openTumbuhan2GoogleLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=padi"));
        startActivity(browserIntent);
    }

    public void openTumbuhan3GoogleLinks(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/search?q=pohon+ringin"));
        startActivity(browserIntent);
    }

    // Like and Share methods for Pohon Mangga
    public void likeTumbuhan1(View view) {
        Toast.makeText(this, "You liked Pohon Mangga!", Toast.LENGTH_SHORT).show();
    }

    public void shareTumbuhan1(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing Pohon Mangga!");
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

    // Like and Share methods for Padi
    public void likeTumbuhan2(View view) {
        Toast.makeText(this, "You liked Padi!", Toast.LENGTH_SHORT).show();
    }

    public void shareTumbuhan2(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing Padi!");
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

    // Like and Share methods for Pohon Ringin
    public void likeTumbuhan3(View view) {
        Toast.makeText(this, "You liked Pohon Ringin!", Toast.LENGTH_SHORT).show();
    }

    public void shareTumbuhan3(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this amazing Pohon Ringin!");
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }
}
