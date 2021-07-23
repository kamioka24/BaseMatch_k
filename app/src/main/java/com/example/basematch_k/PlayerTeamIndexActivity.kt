package com.example.basematch_k

import android.os.Bundle
import android.view.MenuItem
import com.example.basematch_k.custom.CustomActivity
import kotlinx.android.synthetic.main.activity_player_team_index.*

/** -------------------------  //
//   プレイヤー用のチーム一覧画面   //
//  ------------------------- **/

class PlayerTeamIndexActivity : CustomActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_team_index)

        setBackButton()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var returnVal = true

        when (item.itemId) {
            android.R.id.home -> backToTop()
            else -> super.onOptionsItemSelected(item)
        }

        return returnVal
    }
}