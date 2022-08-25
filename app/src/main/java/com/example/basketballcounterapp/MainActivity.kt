package com.example.basketballcounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // start my code

        val teamAThreePoints = findViewById<Button>(R.id.btn3A)
        val teamATwoPoints = findViewById<Button>(R.id.btn2A)
        val teamAOnePoints = findViewById<Button>(R.id.btn1A)

        val teamBThreePoints = findViewById<Button>(R.id.btn3B)
        val teamBTwoPoints = findViewById<Button>(R.id.btn2B)
        val teamBOnePoints = findViewById<Button>(R.id.btn1B)

        val resetBtn = findViewById<Button>(R.id.rstBtn)

        val teamATxt = findViewById<TextView>(R.id.resultTextA)
        val teamBTxt = findViewById<TextView>(R.id.resultTextB)

        var resultA=0
        var resultB=0

      //team a listeners
        teamAThreePoints.setOnClickListener { it
            resultA+=3
           teamATxt.text= resultA.toString()

        }
        teamATwoPoints.setOnClickListener { it
            resultA+=2
            teamATxt.text= resultA.toString()
        }
        teamAOnePoints.setOnClickListener { it
            resultA+=1
            teamATxt.text= resultA.toString()
        }

        // team B listeners
        teamBThreePoints.setOnClickListener { it
            resultB+=3
            teamBTxt.text= resultB.toString()

        }
        teamBTwoPoints.setOnClickListener { it
            resultB+=2
            teamBTxt.text= resultB.toString()
        }
        teamBOnePoints.setOnClickListener { it
            resultB+=1
            teamBTxt.text= resultB.toString()
        }

        // reset button listener
        resetBtn.setOnClickListener { it
            resultB=0
            resultA=0
            teamBTxt.text= resultB.toString()
            teamATxt.text= resultA.toString()
        }
    }

}