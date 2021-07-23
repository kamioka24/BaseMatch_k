package com.example.basematch_k

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.basematch_k.custom.CustomActivity
import kotlinx.android.synthetic.main.activity_top.*

/** -------------  //
//     Top画面     //
//  ------------ **/

class TopActivity : CustomActivity() {

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
            else -> super.onOptionsItemSelected(item)
        }
        return returnVal
    }
}