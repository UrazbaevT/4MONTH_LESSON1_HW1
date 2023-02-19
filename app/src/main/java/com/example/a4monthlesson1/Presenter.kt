package com.example.a4monthlesson1

class Presenter{

    private val model = Injector.getModel()
    private lateinit var counterView: CounterView

    fun increment(){
        model.increment()
        counterView.showNewCount(model.count)
    }

    fun decrement(){
        model.decrement()
        counterView.showNewCount(model.count)
    }

    fun fillCounterView(counterView: CounterView){
        this.counterView = counterView
    }
}