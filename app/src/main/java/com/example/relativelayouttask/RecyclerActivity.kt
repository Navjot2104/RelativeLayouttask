package com.example.relativelayouttask

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.relativelayouttask.databinding.ActivityMainBinding
import com.example.relativelayouttask.databinding.RecyclerBinding

class RecyclerActivity : AppCompatActivity(),OnClick {
    lateinit var binding: RecyclerBinding
    lateinit var recyclerAdapter: RecyclerAdapter
    var Datalist= arrayListOf<recycledataclass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding=RecyclerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Datalist.add(recycledataclass(name = "My title", number = 2345))
        Datalist.add(recycledataclass(name ="My title", number = 5668))
        Datalist.add(recycledataclass("My title", number = 89002))
        recyclerAdapter=RecyclerAdapter(Datalist,this)
        binding.listview.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.listview.adapter=recyclerAdapter
        recyclerAdapter.notifyDataSetChanged()

    }

    override fun update(position: Int) {
        TODO("Not yet implemented")
    }

    override fun delete(position: Int) {
        TODO("Not yet implemented")
    }
}