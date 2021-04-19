package com.example.basematch_k

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_top.*

class TopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top)

        // プレイヤーログインボタン
        playerLoginButton.setOnClickListener {
            val intent = Intent(this, PlayerTeamIndexActivity::class.java)
            startActivity(intent)
        }

        // プレイヤー新規登録ボタン
        playerRegistrationButton.setOnClickListener {
            val intent = Intent(this, PlayerTeamIndexActivity::class.java)
            startActivity(intent)
        }

        // チームログインボタン
        teamLoginButton.setOnClickListener {
            val intent = Intent(this, TeamTeamIndexActivity::class.java)
            startActivity(intent)
        }

        // チーム新規登録ボタン
        teamRegistrationButton.setOnClickListener {
            val intent = Intent(this, TeamTeamIndexActivity::class.java)
            startActivity(intent)
        }
    }
}