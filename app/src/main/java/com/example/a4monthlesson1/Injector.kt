package com.example.a4monthlesson1

class Injector{

    companion object{

        fun getPresenter(): Presenter{
            return Presenter()
        }

        fun getModel(): Model{
            return Model()
        }

    }

}