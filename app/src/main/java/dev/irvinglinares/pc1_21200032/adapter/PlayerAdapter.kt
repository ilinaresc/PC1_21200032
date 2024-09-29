package dev.irvinglinares.pc1_21200032.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.irvinglinares.pc1_21200032.R
import dev.irvinglinares.pc1_21200032.model.PlayerModel

class PlayerAdapter(private val playerList: List<PlayerModel>) :
    RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    class PlayerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.ivPlayer1)
        val nameTextView: TextView = itemView.findViewById(R.id.tvName1)
        val yearTextView: TextView = itemView.findViewById(R.id.tvAnio1)
        val ageTextView: TextView = itemView.findViewById(R.id.tvEdad1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_player, parent, false)
        return PlayerViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val currentPlayer = playerList[position]

        holder.imageView.setImageResource(currentPlayer.imageResId)
        holder.nameTextView.text = currentPlayer.name
        holder.yearTextView.text = currentPlayer.yearOfBirth.toString()
        holder.ageTextView.text = currentPlayer.age.toString()
    }

    override fun getItemCount(): Int {
        return playerList.size
    }
}
