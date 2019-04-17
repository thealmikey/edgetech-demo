package com.almikey.edgetechdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.content.Intent
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity2 : AppCompatActivity() {

    val upload_file_const = 7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.personal_info2)


        val countrySpinner: Spinner = findViewById(R.id.countrySpinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.countries,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            countrySpinner.adapter = adapter
        }

        val netWorthSpinner: Spinner = findViewById(R.id.networthSpinner)
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.income_class,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            netWorthSpinner.adapter = adapter
        }



    }

    private fun openFile(CODE: Int) {
        val i = Intent(Intent.ACTION_GET_CONTENT)
        i.type = "*/*"
        startActivityForResult(intent, CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}
