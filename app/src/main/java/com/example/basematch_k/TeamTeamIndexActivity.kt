package com.example.basematch_k

import android.os.Bundle
import android.view.MenuItem
import com.example.basematch_k.custom.CustomActivity
import kotlinx.android.synthetic.main.activity_team_team_index.*

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