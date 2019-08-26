package com.example.myapp2.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val mText: MutableLiveData<String>

    val text: LiveData<String>
        get() = mText

    init {
        mText = MutableLiveData()
        mText.value = "This is dashboard fragment & it is test for deploy"
        mText.value = "আরকালা মন।\n" +
                "\n" +
                "মন তরে ধরবো হেথায়?\n" +
                "ফাঁকি দিয়ে উড়লি কোথায়?\n" +
                "নষ্ট করে আলো আধার,কিসে বহে সধের নাহার?\n" +
                "তুষ্ট হলি অচেতনে, কি হারিয়ে গোপনে?\n" +
                "\n" +
                "মন মন মনরে, কেন তুই খাঁচার বানে ?\n" +
                "উড়িস বারে বার টানে টানে।\n" +
                "কেন এই তৃভূবনে ? কি এই জীবনের মানে?\n" +
                "অশান্ত মনরে কিছুতেই তর ভরেনারে।\n" +
                "\n" +
                "কেন তর মাযাজাল? কুরে কুরে খাচ্ছে কাল।\n" +
                "গুনেধরা বাড়ী কি থাকবে চিরকাল?\n" +
                "মন তরে ধরবো হেথায়?\n" +
                "শীকল দেব পায়ের গোছায়।\n" +
                "\n" +
                "সত্যই সঠিক সমাধান।\n" +
                "সবার পক্ষে মধু দাদু কে স্বাগত জানালাম।"

    }
}