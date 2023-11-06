package com.example.figmatask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.figmatask.R.id;
import com.example.figmatask.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Fragment());
        binding.bottomnavigationview.setBackground(null);

        binding.bottomnavigationview.setOnItemSelectedListener(item -> {

            if(item.getItemId() == id.home){
                replaceFragment(new HomePage1());
            } else if (item.getItemId() == id.cart) {
                replaceFragment(new Cart());
            }
            else if (item.getItemId() == id.favourites) {
                replaceFragment(new Favourites());

            }  else if (item.getItemId() == id.notifications) {
                replaceFragment(new Notifications());


            }
            return true;
        });

    }


    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id.framelayout,fragment);
        fragmentTransaction.commit();
    }

}


