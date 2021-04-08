package Adapter

import Models.Rasm
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ilhomjon.homework462.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.rv_item_image.view.*

class RasmAdapter(val rasmList:List<Rasm>) : RecyclerView.Adapter<RasmAdapter.MyViewHolder>(){

    inner class MyViewHolder(var itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind(rasm: Rasm, position: Int) {
            itemView.txt_rv_item.text = rasm.rasmText

            Picasso.get().load("http://i.imgur.com/DvpvklR.png").into(itemView.image_rv_item);

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item_image, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(rasmList[position], position)
    }

    override fun getItemCount(): Int = rasmList.size
}