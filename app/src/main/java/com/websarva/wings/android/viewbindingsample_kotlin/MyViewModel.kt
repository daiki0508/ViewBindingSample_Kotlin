package com.websarva.wings.android.viewbindingsample_kotlin

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    // privateメンバ
    private val _hello = MutableLiveData<String>().apply {
        MutableLiveData<String>()
    }

    // _helloの初期化
    init {
        _hello.value = ""
    }

    // setter
    fun setText(){
        _hello.postValue("Hello_World!!")
    }

    // getter
    fun hello(): MutableLiveData<String>{
        return _hello
    }
}