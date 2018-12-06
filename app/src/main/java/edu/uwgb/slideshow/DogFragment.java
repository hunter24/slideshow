package edu.uwgb.slideshow;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class DogFragment extends Fragment{

    private View view;
    private Button likes;
    private Button dislikes;
    private int current_image;
    int[] images = {R.drawable.dog1, R.drawable.dog2, R.drawable.dog3, R.drawable.dog4, R.drawable.dog5};

      @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.view = inflater.inflate(R.layout.fragment_dog, container, false);
        buttonclick();
        buttonclick1();
        return view;
      }

    public void buttonclick() {
        final ImageView imgview = (ImageView) view.findViewById(R.id.imageView);
        likes = (Button) view.findViewById(R.id.likesbutton);
        likes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image++;
                        current_image = current_image % images.length;
                        imgview.setImageResource(images[current_image]);
                    }
                }
        );
    }
    public void buttonclick1() {
        final ImageView imgview = (ImageView) view.findViewById(R.id.imageView);
        dislikes = (Button) view.findViewById(R.id.dislikesbutton);
        dislikes.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        current_image++;
                        current_image = current_image % images.length;
                        imgview.setImageResource(images[current_image]);
                    }
                }
        );
    }

    }


