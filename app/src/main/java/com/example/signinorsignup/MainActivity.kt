package com.example.signinorsignup

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.signinorsignup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // RecyclerView Layout Manager
        binding.recyclerView.layoutManager =
            LinearLayoutManager(this)

        // Sample Data
        val itemList = arrayListOf(

            ItemModel(
                R.drawable.head_phones,
                "Headphone",
                "High quality sound",
                "$49.99"
            ),

            ItemModel(
                R.drawable.smart_watch,
                "Smart Watch",
                "Modern smart watch",
                "$79.99"
            ),

            ItemModel(
                R.drawable.bluetooth_box,
                "Bluetooth Speaker",
                "Portable speaker",
                "$29.99"
            ),
            ItemModel(
                R.drawable.head_phones,
                "Headphone",
                "High quality sound",
                "$49.99"
            ),

            ItemModel(
                R.drawable.smart_watch,
                "Smart Watch",
                "Modern smart watch",
                "$79.99"
            ),

            ItemModel(
                R.drawable.bluetooth_box,
                "Bluetooth Speaker",
                "Portable speaker",
                "$29.99"
            ),
            ItemModel(
                R.drawable.head_phones,
                "Headphone",
                "High quality sound",
                "$49.99"
            ),

            ItemModel(
                R.drawable.smart_watch,
                "Smart Watch",
                "Modern smart watch",
                "$79.99"
            ),

            ItemModel(
                R.drawable.bluetooth_box,
                "Bluetooth Speaker",
                "Portable speaker",
                "$29.99"
            ),
            ItemModel(
                R.drawable.head_phones,
                "Headphone",
                "High quality sound",
                "$49.99"
            ),

            ItemModel(
                R.drawable.smart_watch,
                "Smart Watch",
                "Modern smart watch",
                "$79.99"
            ),

            ItemModel(
                R.drawable.bluetooth_box,
                "Bluetooth Speaker",
                "Portable speaker",
                "$29.99"
            ),

        )

        // Adapter Connection
        val adapter = ItemAdapter(itemList)

        binding.recyclerView.adapter = adapter
    }
}
