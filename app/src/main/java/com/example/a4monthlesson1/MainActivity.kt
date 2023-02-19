package com.example.a4monthlesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4monthlesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView{

    private lateinit var binding:ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.fillCounterView(this)

        initClicker()
    }

    private fun initClicker() {
        with(binding){
            incrementBtn.setOnClickListener {
                presenter.increment()
            }

            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    override fun showNewCount(count: Int) {
        binding.resultTv.text = count.toString()
    }
}