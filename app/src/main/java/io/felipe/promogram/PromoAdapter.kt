package io.felipe.promogram

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.AsyncTask
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_promo.view.*


/**
 * Created by felipe on 15/04/18.
 */
class PromoAdapter(val list: ArrayList<Promo>, val listener: (Promo) -> Unit) : RecyclerView.Adapter<PromoAdapter.PromoHolder>() {

    private val listPromo = list

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PromoHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_promo, parent, false)
        return PromoHolder(view, parent.context)
    }

    override fun getItemCount(): Int = listPromo.size

    override fun onBindViewHolder(holder: PromoHolder?, position: Int) = holder!!.bind(listPromo[position], listener)

    class PromoHolder(itemView: View?, ctx: Context) : RecyclerView.ViewHolder(itemView) {

        val content = ctx

        fun bind(promo: Promo, listener: (Promo) -> Unit) = with(itemView) {
            item_product.text = promo.product
            item_enterprise_name.text = promo.enterprise
            item_discount_percent.text = getDiscountPercent(promo)
            item_discount_price.text = "R$ " + promo.discountPrice
            item_valid_until.text = "Promoção válida até 30 de maio"
            Picasso.with(context).load(promo.photo).resize(700, 550).centerInside().into(item_image)
//            item_image.setImageBitmap(((resize(ContextCompat.getDrawable(context, promo.photo), context)) as BitmapDrawable).bitmap)

            setOnClickListener { listener(promo) }

        }

        private fun resize(image: Drawable, ctx: Context): Drawable {
            val b = (image as BitmapDrawable).bitmap
            val bitmapResized = Bitmap.createScaledBitmap(b, 700, 450, false)
            return BitmapDrawable(ctx.getResources(), bitmapResized)
        }

        fun getDiscountPercent(promo: Promo): String {
            val n = (((promo.discountPrice / promo.realPrice) * 100) - 100).toInt().toString() + "%"
            return n
        }
    }

    class someTask() : AsyncTask<Void, Void, String>() {
        override fun doInBackground(vararg params: Void?): String? {
            return null
        }

        override fun onPreExecute() {
            super.onPreExecute()
            // ...
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            // ...
        }
    }

}