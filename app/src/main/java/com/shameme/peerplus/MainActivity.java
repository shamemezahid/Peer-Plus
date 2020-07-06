package com.shameme.peerplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavItemSelector);
        bottomNavigationView.setSelectedItemId(R.id.nav_posts);
        Fragment currentFragment = new PostsFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainer,currentFragment).commit();



    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavItemSelector = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment currentFragment = null;
                    switch (item.getItemId()){
                        case R.id.nav_resources:
                            currentFragment = new ResourcesFragment();
                            break;
                        case R.id.nav_posts:
                            currentFragment = new PostsFragment();
                            break;
                        case R.id.nav_people:
                            currentFragment = new PeopleFragment();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainer,currentFragment).commit();
                    return true;
                }
            };

}