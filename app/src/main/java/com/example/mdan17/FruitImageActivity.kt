package com.example.mdan17

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.mdan17.databinding.ActivityFruitImageBinding
import com.example.mdan17.databinding.ActivityMainBinding

class FruitImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFruitImageBinding
    private val fruits = arrayListOf<String>("Olma","Banan","Orik","uzum","Shaftoli")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFruitImageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val position = intent.getIntExtra("position",0)

        supportActionBar?.title = fruits[position]

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        when(position){
            0->binding.fruitImage.setImageResource(R.drawable.apple)
            0->binding.fruitImage.setImageResource(R.drawable.banan)
            0->binding.fruitImage.setImageResource(R.drawable.apricot)
            0->binding.fruitImage.setImageResource(R.drawable.uzum)
            0->binding.fruitImage.setImageResource(R.drawable.peach)

        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId==android.R.id.home){
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}