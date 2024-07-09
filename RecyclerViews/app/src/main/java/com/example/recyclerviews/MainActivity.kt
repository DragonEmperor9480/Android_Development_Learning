package com.example.recyclerviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listOfcontact = mutableListOf<ContactItem>()
        listOfcontact.add(
            ContactItem(
                imgRes = R.drawable.ic_launcher_background,
                Heading  = "Hello World",
                SubHeading =  "Hello to Everyone"

            )
        )

        listOfcontact.add(
            ContactItem(
                imgRes = R.drawable.ic_launcher_foreground,
                Heading  = "Hello World",
                SubHeading =  "Hello to Everyone"

            )
        )

        listOfcontact.add(
            ContactItem(
                imgRes = R.drawable.ic_launcher_background,
                Heading  = "Hello World",
                SubHeading =  "Hello to Everyone"

            )
        )

        listOfcontact.add(
            ContactItem(
                imgRes = R.drawable.ic_launcher_foreground,
                Heading  = "Hello World",
                SubHeading =  "Hello to Everyone"

            )
        )

        listOfcontact.add(
            ContactItem(
                imgRes = R.drawable.ic_launcher_background,
                Heading  = "Hello World",
                SubHeading =  "Hello to Everyone"

            )
        )
    }
}