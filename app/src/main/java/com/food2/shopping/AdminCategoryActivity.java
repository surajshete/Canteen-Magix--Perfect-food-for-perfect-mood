package com.food2.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView beverages, breakfast, maharashtrian, south_indian;
    private Button LogoutBtn, CheckOrdersBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        beverages = (ImageView) findViewById(R.id.t_shirts);
        breakfast = (ImageView) findViewById(R.id.sports_t_shirts);
        maharashtrian = (ImageView) findViewById(R.id.female_dresses);
        south_indian = (ImageView) findViewById(R.id.sweathers);




        beverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.food2.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Beverages");
                startActivity(intent);
            }
        });
        breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.food2.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Breakfast");
                startActivity(intent);
            }
        });


        maharashtrian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.food2.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "maharashtrian");
                startActivity(intent);
            }
        });


        south_indian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.food2.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "south_indian");
                startActivity(intent);
            }
        });
    }
}
