package com.example.basematch_k.Activity.Team

import android.os.Bundle
import android.view.MenuItem
import com.example.basematch_k.Custom.CustomActivity
import com.example.basematch_k.R

/** -----------------------  //
//    チーム用のチーム一覧画面   //
//  ----------------------- **/

class TeamTeamIndexActivity : CustomActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_team_index)

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