package com.example.centerapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity


class CompleteProfil : AppCompatActivity() {
    private lateinit var button_to_confirm: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_complete_profil)
        button_to_confirm = findViewById(R.id.confirmeBtn)
        button_to_confirm.setOnClickListener { startActivity(Intent(this,AddSurvey::class.java  )) }



        val nomEditText = findViewById<View>(R.id.nom) as EditText
        val nom = nomEditText.text.toString()

        val prenomEditText = findViewById<View>(R.id.prenom) as EditText
        val prenom = prenomEditText.text.toString()

        val phoneEditText = findViewById<View>(R.id.Phone) as EditText
        val age = phoneEditText.text.toString()

        val addressEditText = findViewById<View>(R.id.address) as EditText
        val phone = addressEditText.text.toString()

        fun onRadioButtonClicked(view: View) {
            if (view is RadioButton) {
                val checked = view.isChecked
                when (view.getId()) {
                    R.id.male ->
                        if (checked) {
                        }
                    R.id.female ->
                        if (checked) {
                            // Ninjas rule
                        }
                }
            }
        }


    }

}