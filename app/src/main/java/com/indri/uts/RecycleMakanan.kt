package com.indri.uts

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.indri.uts.adapter.MakananAdapter
import com.indri.uts.model.ModelMakanan

class RecycleMakanan : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_recycle_makanan)

            val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

            val items = listOf(
                ModelMakanan("Chicken Curry", "Delicious spicy chicken curry.", R.drawable.chikencurryy),
                ModelMakanan("Chicken Burger", "Tasty chicken burger with fresh vegetables.",
                    R.drawable.burger
                ),
                ModelMakanan(" Lasagna", "Healthy broccoli lasagna.", R.drawable.broccolilasagna),
                ModelMakanan("Mexican Appetizer", "Mexican style nachos with dips.", R.drawable.mexican),
                ModelMakanan("Pizza", "APizza is a savory dish from Italy made from a round, flat dough.", R.drawable.pizza),
                ModelMakanan("Sushi", "Sushi is a Japanese food consisting of rice formed with side dishes.", R.drawable.sushi)
            )

            val adapter = MakananAdapter(items)
            recyclerView.layoutManager = GridLayoutManager(this, 2)
            recyclerView.adapter = adapter
        }
    }