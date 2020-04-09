package itkido.me.myfirstkotlinproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnGetText = findViewById<Button>(R.id.btnGetText);

        val txtTextEditOutput = findViewById<TextView>(R.id.txtTextEditOutput)

        // finding the edit text
        val editText = findViewById<EditText>(R.id.editText)

        btnGetText.setOnClickListener {
            txtTextEditOutput.text = editText.text
        }


    }
}
