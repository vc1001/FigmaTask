package com.example.figmatask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.figmatask.R.id;
import com.example.figmatask.databinding.ActivityMainBinding;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        replaceFragement(new Fragment());
        binding.bottomnavigationview.setBackground(null);

        binding.bottomnavigationview.setOnItemSelectedListener(item -> {

            if(item.getItemId() == id.home){
                replaceFragement(new HomePage1());
            } else if (item.getItemId() == id.cart) {
                replaceFragement(new Cart());
            }
            else if (item.getItemId() == id.favourites) {
                replaceFragement(new Favourites());

            }  else if (item.getItemId() == id.notifications) {
                replaceFragement(new Notifications());


            }
            return true;
        });

    }


    private void replaceFragement(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(id.framelayout,fragment);
        fragmentTransaction.commit();
    }

}


