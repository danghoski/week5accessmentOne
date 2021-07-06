package com.aghogho.week5assessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Aghogho", "Uwaneyin", R.drawable.a ))
        arrayList.add(Model("Okoro", "Faith", R.drawable.b ))
        arrayList.add(Model("David", "Mudiada", R.drawable.c ))
        arrayList.add(Model("Kelechi", "Ihanacho", R.drawable.d ))
        arrayList.add(Model("Maro", "Kevwe", R.drawable.e ))
        arrayList.add(Model("Jet", "Li", R.drawable.f ))
        arrayList.add(Model("Lionel", "Messi", R.drawable.g ))
        arrayList.add(Model("Ejiro", "Ronaldo", R.drawable.h ))
        arrayList.add(Model("Cristiano", "Ronaldo", R.drawable.i ))

        val myAdapter = MyAdapter(arrayList, this)
        recycler1.layoutManager = LinearLayoutManager(this)
        recycler1.adapter = myAdapter
    }
}