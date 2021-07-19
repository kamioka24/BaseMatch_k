package com.example.basematch_k

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_top.*

class TopActivity : AppCompatActivity() {

    private val playerTeamIndexActivity = PlayerTeamIndexActivity()
    private val teamTeamIndexActivity = TeamTeamIndexActivity()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)
    }

    // オプションメニューを表示させる
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_options_menu_list, menu)
        return true
    }

    // オプションメニュー選択時の処理
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // 戻り値用の変数の初期値を true で設定
        var returnVal = true

        when (item.itemId) {
            R.id.playerRegistrationButton -> nextActivity(playerTeamIndexActivity)
            R.id.playerLoginButton -> nextActivity(playerTeamIndexActivity)
            R.id.teamRegistrationButton -> nextActivity(teamTeamIndexActivity)
            R.id.teamLoginButton -> nextActivity(teamTeamIndexActivity)
        }

        return returnVal
    }

    private fun nextActivity(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }
}