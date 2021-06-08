package com.kalemlisipahi.kotlinfirst


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList


class MainActivity : AppCompatActivity() {

    private lateinit var myList : ArrayList<Model>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList()

        addItem()

    }

    fun addItem()
    {
        var newItem = Model("yeniiiiiiii")
        myList.add(newItem)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(myList)
    }

}