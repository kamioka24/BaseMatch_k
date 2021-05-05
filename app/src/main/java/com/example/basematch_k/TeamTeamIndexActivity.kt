package com.example.basematch_k

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_team_team_index.*

class TeamTeamIndexActivity : CustomActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_team_index)

        teamTeamBackButton.setOnClickListener {
            backToTop()
        }
    }
}