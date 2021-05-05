package com.example.basematch_k

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_player_team_index.*

class PlayerTeamIndexActivity : CustomActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_team_index)

        playerTeamBackButton.setOnClickListener {
            backToTop()
        }
    }
}