package io.felipe.promogram

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_promo.layoutManager = LinearLayoutManager(this)
        recycler_promo.adapter = PromoAdapter(getPromoList(), {})
    }

    private fun getPromoList(): ArrayList<Promo> {
        val list = ArrayList<Promo>()
        var promo: Promo
//        promo = Promo(1L, "Tênis OLYMPIKUS Conenct Masculino azul", 149.99, 199.99, "Grupo FB", "30/05", R.drawable.imagem_tenis_preto_1)
//        list.add(promo)
        promo = Promo(3L, "Tênis OLYMPIKUS Intence Feminino azul", 139.99, 199.99, "Grupo FB", "30/05",R.drawable.imagem_tenis_fem_cinza_1)
        list.add(promo)
        promo = Promo(4L, "Tênis OLYMPIKUS Intence Feminino azul", 139.99, 199.99, "Grupo FB", "30/05",R.drawable.imagem_tenis_fem_cinza_2)
        list.add(promo)
        promo = Promo(5L, "Tênis OXTO Los Angeles branco", 79.99, 99.99, "Grupo FB", "30/05",R.drawable.imagem_tenis_branco_1)
        list.add(promo)
        promo = Promo(6L, "Tênis OXTO Los Angeles branco", 79.99, 99.99, "Grupo FB", "30/05",R.drawable.imagem_tenis_branco_2)
        list.add(promo)
        promo = Promo(7L, "Tênis OXTO Preto", 129.99, 199.99, "Grupo FB", "30/05",R.drawable.imagem_tenis_preto_1)
        list.add(promo)
        promo = Promo(8L, "Tênis OXTO Preto", 129.99, 199.99, "Grupo FB", "30/05",R.drawable.imagem_tenis_preto_2)
        list.add(promo)
        promo = Promo(1L, "Tênis OXTO branco", 99.99, 100.00, "Grupo FB", "30/05", R.drawable.imagem_tenis_branco_1)
        list.add(promo)
        promo = Promo(11L, "Camisa polo azul com preto", 89.90, 119.90, "Aleatory", "30/06", R.drawable.imagem_camisa_1)
        list.add(promo)
        promo = Promo(12L, "Camisa polo branca com verde", 89.90, 119.90, "Aleatory", "30/06", R.drawable.imagem_camisa_2)
        list.add(promo)
        promo = Promo(13L, "Calça jeans", 120.00, 240.00, "Aleatory", "30/06", R.drawable.imagem_calca_1)
        list.add(promo)
        promo = Promo(14L, "Calça jeans infantil", 90.00, 180.00, "Aleatory", "30/06", R.drawable.imagem_calca_2)
        list.add(promo)
        return list
    }
}
