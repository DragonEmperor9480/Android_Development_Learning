package com.example.listviews

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemClickListener
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
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
        val listview: ListView = findViewById(R.id.lst)
        val button: Button = findViewById(R.id.btn)
        val editText: EditText = findViewById(R.id.edtxt)

        //Changing the List to mutable List
        val listOfNames = mutableListOf<String>("A", "B", "C", "D", "E")
        val Namesadapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listOfNames)

        listview.adapter = Namesadapter

        button.setOnClickListener {
            //Getting Value from EditText
            val nameAdd = editText.text.toString()

            //Adding the names to the list
            listOfNames.add(nameAdd)

            //Telling the Names Adapter that Dataset has been Changed
            Namesadapter.notifyDataSetChanged()
        }
        listview.setOnItemClickListener(object : OnItemClickListener {
            override fun onItemClick(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val nameclicked = listOfNames[position]
                Toast.makeText(this@MainActivity, nameclicked, Toast.LENGTH_SHORT).show()
            }


        })
    }
}