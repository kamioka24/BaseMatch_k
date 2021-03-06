package com.example.basematch_k.Custom

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.example.basematch_k.Activity.TopActivity

/** -------------------------  //
//   様々な関数を定義しておく場所   //
//  ------------------------- **/

open class CustomActivity : AppCompatActivity() {

    // TopActivity へ戻る
    fun backToTop() {
        val intentTop = Intent(this, TopActivity::class.java)
        startActivity(intentTop)
    }

    // オプションメニューの ← を表示させる
    fun setBackButton() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    // オプションメニューの ← を押した際に topActivity に戻る挙動


    // ページ遷移 (アクティビティの切り替え)
    fun nextActivity(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }
}