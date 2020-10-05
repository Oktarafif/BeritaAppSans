package id.rafif.beritaapp.ui.rvadapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import coil.size.Scale
import id.idn.fahru.beritaapp.databinding.ItemRvMainBinding
import id.rafif.beritaapp.helpers.toRelativeDate
import id.rafif.beritaapp.model.remote.ArticlesItem
import java.lang.System.load

/**
 * Created by Imam Fahrur Rofi on 01/06/2020.
 */
class ItemRvMainViewHolder(private val itemRvMainBinding: ItemRvMainBinding) :
    RecyclerView.ViewHolder(itemRvMainBinding.root) {
    fun bind(item: ArticlesItem) {
        itemRvMainBinding.run {
            textTitle.text = item.title
            imageRvMain.apply {
                load(item.urlToImage) {
                    scale(Scale.FILL)
                }
                contentDescription = item.title
            }
            item.publishedAt?.let {
                textDate.text = it.toRelativeDate
            }
        }
    }
}