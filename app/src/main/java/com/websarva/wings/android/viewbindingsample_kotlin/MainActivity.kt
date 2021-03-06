package com.websarva.wings.android.viewbindingsample_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.websarva.wings.android.viewbindingsample_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // viewModelのインスタンス
    private val myViewModel: MyViewModel by lazy {
        ViewModelProvider(this).get(MyViewModel::class.java)
    }
    // binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        // ViewModel hello()の監視
        myViewModel.hello().observe(this, {
            binding.textView.text = myViewModel.hello().value
        })

        // ボタンタップ時の処理
        binding.button.setOnClickListener {
            myViewModel.setText()
        }
    }
}