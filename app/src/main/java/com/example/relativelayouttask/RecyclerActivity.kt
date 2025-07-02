package com.example.relativelayouttask

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.relativelayouttask.databinding.ActivityMainBinding
import com.example.relativelayouttask.databinding.RecyclerBinding

class RecyclerActivity : AppCompatActivity() {
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
        Datalist.add(recycledataclass(title="My title",description="My description"))
        Datalist.add(recycledataclass(title="My title",description="MY description"))
        Datalist.add(recycledataclass(title="My title",description="MY description"))
recyclerAdapter=RecyclerAdapter(Datalist)
        binding.recycler.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recycler.adapter=recyclerAdapter
        recyclerAdapter.notifyDataSetChanged()

    }
}