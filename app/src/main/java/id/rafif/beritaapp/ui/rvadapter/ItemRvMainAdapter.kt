package id.rafif.beritaapp.ui.rvadapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.idn.fahru.beritaapp.databinding.ItemRvMainBinding
import id.rafif.beritaapp.model.remote.ArticlesItem
import id.rafif.beritaapp.ui.rvadapter.viewholder.ItemRvMainViewHolder

/**
 * Created by Imam Fahrur Rofi on 02/06/2020.
 */
class ItemRvMainAdapter : RecyclerView.Adapter<ItemRvMainViewHolder>() {
    private val listData = ArrayList<ArticlesItem>()

    fun addData(items : List<ArticlesItem>) {
        listData.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemRvMainViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val itemRvMainBinding = ItemRvMainBinding.inflate(layoutInflater, parent, false)
        return ItemRvMainViewHolder(itemRvMainBinding)
    }

    override fun getItemCount() = listData.size

    override fun onBindViewHolder(holder: ItemRvMainViewHolder, position: Int) {
        holder.bind(listData.get(position))
    }

}