package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Login extends AppCompatActivity {
    TabLayoutMediator mediator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TabLayout tabLayout =findViewById(R.id.tabLayout);
        ViewPager2 viewPager2 =findViewById(R.id.pager);

        //Making Adapter & set adapter to a pager
        SampleAdapter adapter = new SampleAdapter(getSupportFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapter);
        //Creating mediator to change fragment
        mediator = new TabLayoutMediator(tabLayout, viewPager2, ((tab, position) -> {
            if (position == 0){
                tab.setText("Masuk");
            }
            else if (position == 1){
                tab.setText("Daftar");
            }
        }));
        mediator.attach();


    }
}