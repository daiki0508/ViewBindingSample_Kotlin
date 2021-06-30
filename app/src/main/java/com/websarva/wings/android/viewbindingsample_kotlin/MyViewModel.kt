package com.websarva.wings.android.viewbindingsample_kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    private val _hello = MutableLiveData<String>().apply {
        MutableLiveData<String>()
    }

    fun setText(){
        _hello.postValue("Hello_World!!")
    }

    val hello: MutableLiveData<String> = _hello
    init {
        hello.value = ""
    }
}