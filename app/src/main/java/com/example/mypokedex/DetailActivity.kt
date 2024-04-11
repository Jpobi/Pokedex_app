package com.example.mypokedex

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailActivity : AppCompatActivity() {
    private lateinit var textViewNombre : TextView
    private lateinit var imageViewUrl : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val bundle = intent.extras
        val nombre=bundle?.getString("name")
        val imagen=bundle?.getString("url")

        textViewNombre=findViewById(R.id.textViewNombre)
        imageViewUrl=findViewById(R.id.imageViewUrl)
        textViewNombre.text=nombre

        Glide.with(this).load(imagen).into(imageViewUrl)
    }
}