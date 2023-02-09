package otus.gpb.homework.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val button = findViewById<Button>(R.id.openСButton)
        button.setOnClickListener { onClickListener()}
        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "ActivityB, task=$taskId"
    }
    private fun onClickListener() {
        val intent = Intent(this, ActivityC::class.java)
        startActivity(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Toast.makeText(this, "onNewIntent B", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy B", Toast.LENGTH_SHORT).show()
    }
}