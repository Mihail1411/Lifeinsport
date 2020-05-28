package com.example.android.Lifeinsport.activity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.android.Lifeinsport.fragments.MainFragment;
import com.example.android.Lifeinsport.fragments.UFcFragment;
import com.example.android.Lifeinsport.fragments.baseballFragment;
import com.example.android.Lifeinsport.fragments.footbalFragment;
import com.example.android.Lifeinsport.fragments.motosportFragment;
import com.example.android.Lifeinsport.fragments.mygameFragment;
import com.example.android.Lifeinsport.fragments.myteamFragment;
import com.example.android.myndapplication.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import static com.example.android.myndapplication.R.id.nav_biatlon;
import static com.example.android.myndapplication.R.id.nav_footbal;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawer;
    private BottomNavigationView bottomNavigationView;
    private MainFragment mainFragment = MainFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.calendarFragment calendarFragment = com.example.android.Lifeinsport.fragments.calendarFragment.newInstance();
    private mygameFragment mygameFragment = com.example.android.Lifeinsport.fragments.mygameFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.biatlonFragment biatlonFragment = com.example.android.Lifeinsport.fragments.biatlonFragment.newInstance();
    private myteamFragment myteamFragment = com.example.android.Lifeinsport.fragments.myteamFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.tableFragment tableFragment = com.example.android.Lifeinsport.fragments. tableFragment.newInstance();

    private com.example.android.Lifeinsport.fragments.basketballFragment basketballFragment = com.example.android.Lifeinsport.fragments.basketballFragment.newInstance();
    private UFcFragment UFcFragment = com.example.android.Lifeinsport.fragments.UFcFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.valeybalFragment valeybalFragment = com.example.android.Lifeinsport.fragments.valeybalFragment.newInstance();
    private footbalFragment footbalFragment = com.example.android.Lifeinsport.fragments.footbalFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.tennisFragment tennisFragment = com.example.android.Lifeinsport.fragments.tennisFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.hockeyFragment hockeyFragment = com.example.android.Lifeinsport.fragments.hockeyFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.formulaFragment formulaFragment = com.example.android.Lifeinsport.fragments.formulaFragment.newInstance();
    private motosportFragment motosportFragment = com.example.android.Lifeinsport.fragments.motosportFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.USfootbalFragment USfootbalFragment = com.example.android.Lifeinsport.fragments.USfootbalFragment.newInstance();
    private baseballFragment baseballFragment = com.example.android.Lifeinsport.fragments.baseballFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.velosportFragment velosportFragment = com.example.android.Lifeinsport.fragments.velosportFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.boksFragment boksFragment = com.example.android.Lifeinsport.fragments.boksFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.golfFragment golfFragment = com.example.android.Lifeinsport.fragments.golfFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.dartsFragment dartsFragment = com.example.android.Lifeinsport.fragments.dartsFragment.newInstance();
    private com.example.android.Lifeinsport.fragments.cibersportFragment cibersportFragment = com.example.android.Lifeinsport.fragments.cibersportFragment.newInstance();

    public MainActivity() {
        calendarFragment = calendarFragment.newInstance();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);





        drawer = findViewById(R.id.drawer_layout);

        ImageButton menuRight = findViewById(R.id.leftRight);
        menuRight.setOnClickListener(v -> {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                drawer.openDrawer(GravityCompat.START);
            }
        });

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        bottomNavigationView = findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.action_LastNews:
                    selectedFragment = mainFragment;
                    break;

                case R.id.action_mygame:
                    selectedFragment = mygameFragment;
                    break;
                case R.id.action_table:
                    selectedFragment = tableFragment;
                    break;
                    case R.id.action_myteam:
                    selectedFragment = myteamFragment;
                    break;
                case R.id.action_calendar:
                    selectedFragment =calendarFragment;
                    break;
                case R.id.nav_basketball:
                    selectedFragment = basketballFragment;
                    break;
                case R.id.nav_UFC:
                    selectedFragment = UFcFragment;
                    break;
                case R.id.nav_valeybal:
                    selectedFragment = valeybalFragment;
                    break;

                case R.id.nav_footbal:
                    selectedFragment = footbalFragment;
                    break;
                case R.id.nav_tennis:
                    selectedFragment = tennisFragment;
                    break;
                case R.id.nav_formula:
                    selectedFragment = formulaFragment;
                    break;
                case R.id.nav_motosport:
                    selectedFragment = motosportFragment;
                    break;
                case R.id.nav_usfootball:
                    selectedFragment = USfootbalFragment;
                    break;
                case R.id.nav_baseball:
                    selectedFragment = baseballFragment;
                    break;
                case R.id.nav_velosport:
                    selectedFragment = velosportFragment;
                    break;
                case R.id.nav_boks:
                    selectedFragment = boksFragment;
                    break;
                case R.id.nav_golf:
                    selectedFragment = golfFragment;
                    break;
                case R.id.nav_biatlon:
                    selectedFragment = biatlonFragment;
                    break;
                case R.id.nav_hockey:
                    selectedFragment = hockeyFragment;
                    break;
                case R.id.nav_darts:
                    selectedFragment = dartsFragment;
                    break;


                case R.id.nav_cibersport:
                    selectedFragment = cibersportFragment;
                    break;




            }
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            if (selectedFragment != null) {
                transaction.replace(R.id.f_container, selectedFragment);
                transaction.commit();
            }
            return true;
        });

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.f_container, mainFragment);
        transaction.commit();
    }






    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        drawer.closeDrawers();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();

        switch (item.getItemId()) {
            case R.id.nav_LastNews:
                bottomNavigationView.setSelectedItemId(R.id.action_LastNews);
                ft.replace(R.id.f_container, mainFragment);
                break;
            case R.id.nav_table:
                bottomNavigationView.setSelectedItemId(R.id.action_table);
                ft.replace(R.id.f_container, tableFragment);
                break;

                case R.id.nav_mygame:
                bottomNavigationView.setSelectedItemId(R.id.action_mygame);
                ft.replace(R.id.f_container, mygameFragment);
                break;
            case R.id.nav_myteam:
                bottomNavigationView.setSelectedItemId(R.id.action_myteam);
                ft.replace(R.id.f_container, myteamFragment);
                break;
            case R.id.nav_calendar:
                bottomNavigationView.setSelectedItemId(R.id.action_calendar);
                ft.replace(R.id.f_container, calendarFragment);
                break;
            case R.id.nav_basketball:
                bottomNavigationView.setSelectedItemId(R.id.nav_basketball);
                ft.replace(R.id.f_container, basketballFragment);
                break;
            case R.id.nav_valeybal:
                bottomNavigationView.setSelectedItemId(R.id.nav_valeybal);
                ft.replace(R.id.f_container, valeybalFragment);
                break;
            case R.id.nav_UFC:
                bottomNavigationView.setSelectedItemId(R.id.nav_UFC);
                ft.replace(R.id.f_container, UFcFragment);
                break;
            case nav_footbal:
                bottomNavigationView.setSelectedItemId(nav_footbal);
                ft.replace(R.id.f_container, footbalFragment);
                break;
            case nav_biatlon:
                bottomNavigationView.setSelectedItemId(nav_biatlon);
                ft.replace(R.id.f_container, biatlonFragment);
                break;
            case R.id.nav_tennis:
                bottomNavigationView.setSelectedItemId(R.id.nav_tennis);
                ft.replace(R.id.f_container, tennisFragment);
                break;
            case R.id.nav_motosport:
                bottomNavigationView.setSelectedItemId(R.id.nav_motosport);
                ft.replace(R.id.f_container, motosportFragment);
                break;
            case R.id.nav_usfootball:
                bottomNavigationView.setSelectedItemId(R.id.nav_usfootball);
                ft.replace(R.id.f_container, USfootbalFragment);
                break;
            case R.id.nav_baseball:
                bottomNavigationView.setSelectedItemId(R.id.nav_baseball);
                ft.replace(R.id.f_container, baseballFragment);
                break;
            case R.id.nav_velosport:
                bottomNavigationView.setSelectedItemId(R.id.nav_velosport);
                ft.replace(R.id.f_container, velosportFragment);
                break;
            case R.id.nav_hockey:
                bottomNavigationView.setSelectedItemId(R.id.nav_hockey);
                ft.replace(R.id.f_container, hockeyFragment);
                break;
            case R.id.nav_boks:
                bottomNavigationView.setSelectedItemId(R.id.nav_boks);
                ft.replace(R.id.f_container, boksFragment);
                break;
            case R.id.nav_golf:
                bottomNavigationView.setSelectedItemId(R.id.nav_golf);
                ft.replace(R.id.f_container, golfFragment);
                break;
            case R.id.nav_darts:
                bottomNavigationView.setSelectedItemId(R.id.nav_darts);
                ft.replace(R.id.f_container, dartsFragment);
                break;

            case R.id.nav_cibersport:
                bottomNavigationView.setSelectedItemId(R.id.nav_cibersport);
                ft.replace(R.id.f_container, cibersportFragment);
                break;
            case R.id.nav_formula:
                bottomNavigationView.setSelectedItemId(R.id.nav_formula);
                ft.replace(R.id.f_container, formulaFragment);
                break;




        }

        ft.commit();
        return true;
    }
}
