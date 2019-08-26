package com.example.myapp2.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val mText: MutableLiveData<String>

    val text: LiveData<String>
        get() = mText

    init {
        mText = MutableLiveData()
        mText.value = "This is home fragment @Ariful"
        mText.value = "নিস্তেজ হলেও দিকি দিকি প্রাণ\n" +
                "বেঁচে আছি লোকে বলে \n" +
                "এই বাঁচা কিসের তোরে \n" +
                "ডাক দিলেই যদি না উঠে না করি আমি গান,\n" +
                "কি দরকার এই প্রাণের? কি হবে দিয়া এই প্রাণ?\n" +
                "\n" +
                "কি যে মজা, মায়া চোখে যদি দেখি মানবতা\n" +
                "কি মানুষ আমি, মায়া চোখে যদি না দেখি মানুষের ব্যথা ।\n" +
                "\n" +
                "আমরা কি পারি না? হাতে হাত রেখে গাইতে গান \n" +
                "মানবতার গান , লাল রক্ততের গান।"
    }
}