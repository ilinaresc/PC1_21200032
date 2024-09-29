package dev.irvinglinares.pc1_21200032

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.irvinglinares.pc1_21200032.adapter.PlayerAdapter
import dev.irvinglinares.pc1_21200032.model.PlayerModel

class ListadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val playerList = listOf(
            PlayerModel(R.drawable.haaland, "Erling Haaland", 2000, 23),
            PlayerModel(R.drawable.bellingham, "Jude Bellingham", 2003, 20),
            PlayerModel(R.drawable.pedro, "Pedro Quipe", 2002, 22)
        )

        val adapter = PlayerAdapter(playerList)
        recyclerView.adapter = adapter


        val returnButton = findViewById<Button>(R.id.btnReturn)
        returnButton.setOnClickListener {
            finish()
        }
    }
}