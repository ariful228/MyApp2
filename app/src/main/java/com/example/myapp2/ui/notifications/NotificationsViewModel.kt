package com.example.myapp2.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val mText: MutableLiveData<String>

    val text: LiveData<String>
        get() = mText

    init {
        mText = MutableLiveData()
        mText.value = "মহাজনের নাও \n" +
                "\n" +
                "জম-জমাট ।\n" +
                "মহাজনের নাও \n" +
                "বহে ঢেউ দুলে ফাউ ফাউ । \n" +
                "বৈঠা মারে তালে তালে, আঁতেলে-মাতালে ।\n" +
                "হাইলে নেই শক্ত বাদন, ঘুরে অতলে-পাতালে ।\n" +
                "ভীষণ ভালো লাগে, নৌকার গোলই ভিজে ভরা নদীর জলে ।\n" +
                "অমৃত স্বাদ মিলে, মহাজনের নাও, নাও, নায়ে ।\n" +
                "\n" +
                "উল্টা পিঠ ।\n" +
                "মহাজনের নাও \n" +
                "বহে ঢেউ করে ক্যেও ক্যেও ।\n" +
                "বৈঠা গেছে জলে ভেসে সকাল শেষে বিকালে,\n" +
                "হাইল বলে নাই কিছু আর নিয়ে গেছে কালে ।\n" +
                "পাটাতন ঢিলে ঢালা ,গোলই নড়ে-ভড়ে,\n" +
                "মন মাঝির নজর জলে ভাসা কায়া-তলে ।\n" +
                "\n" +
                "পথের দিশা ।\n" +
                "মহাজনের নাও \n" +
                "থামাও, ভিড়াও শুকনা কিনারে \n" +
                "মহাজনের হদিশ পাবে নাও নাও নায়ে ।"
    }
}