package com.example.examenapp

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TascaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val tvNom: TextView = itemView.findViewById(R.id.tvNom)
    private val tvCategoria: TextView = itemView.findViewById(R.id.tvCategoria)
    private val tvData: TextView = itemView.findViewById(R.id.tvData)
    private val tvEstat: TextView = itemView.findViewById(R.id.tvEstat)

    /**
     * Actualitza les vistes de la fila amb les dades de MyItem
     * i configura els listeners d'esdeveniments.
     */
    fun bind(item: Tasca ) {
        tvNom.text = item.nom
        tvCategoria.text = item.categoria
        tvData.text = item.data
        tvEstat.text = item.estat


        // Exemple de gestió de clic sobre tota la fila
        itemView.setOnClickListener {
            onItemClick(item)
        }
    }
}