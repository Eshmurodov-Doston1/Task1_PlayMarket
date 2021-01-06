package com.example.task1_playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task1_playmarket.adapters.PlayMarketAdapter
import com.example.task1_playmarket.models.ClassIdList
import com.example.task1_playmarket.models.Program
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<ClassIdList>
    lateinit var  playMarketAdapter: PlayMarketAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        playMarketAdapter = PlayMarketAdapter(list)
        rv.adapter = playMarketAdapter
    }

    private fun loadData() {
        list = ArrayList()
        var progrm = Program("https://i.pinimg.com/originals/20/7d/fb/207dfbb24b5870603d047981f271df5e.png","Car race","78MБ")
        var progrm1= Program("https://cdn57.androidauthority.net/wp-content/uploads/2019/05/PES-2020-best-soccer-games-and-european-football-games.jpg","Pes 2013","120MБ")
        var progrm2= Program("https://lh3.googleusercontent.com/v90ExssSXgZ8azZzsitkJQGFMY_zgUzhMRSignHQL6dvKOKUsgIpnH9HP59iF0cCbl0","Mp3 Player","30MБ")
        var progrm3= Program("https://static.olx.uz/static/olxuz/naspersclassifieds-regional/olxeu-atlas-web-olxuz/static/img/fb/fb-image_redesign.png?t=20-12-24","Olx","25MБ")
        list.add(ClassIdList("Mashhurlar",listOf(progrm,progrm1,progrm2,progrm3)))
        var progrm4 = Program("https://www.androidgamecity.com/wp-content/uploads/2019/09/Top-Ten-Soccer-Games-on-Android.jpg","Pes 2019","150MБ")
        var progrm5= Program("https://www.bignox.com/blog/wp-content/uploads/2020/08/0D334DDD-8750-4980-A5E7-26DCF4BCE354.png","Game car","78MБ")
        var progrm6= Program("https://i.ytimg.com/vi/EvtPlPlvdqE/maxresdefault.jpg","Subay surf","60MБ")
        var progrm7= Program("https://www.film.ru/sites/default/files/styles/thumb_1024x450/public/filefield_paths/mortal-kombat-reboot.jpg","Mortal kombat","190MБ")
        list.add(ClassIdList("O`yinlar", listOf(progrm4,progrm5,progrm6,progrm7)))
        var progrm8 = Program("https://www.ixbt.com/img/n1/news/2020/8/1/pubg-mobile_large.png","Pubg mobile","625MБ")
        var progrm9= Program("https://img.utdstc.com/screen/13/clash-of-clans-006.jpg:800","Clash of clans","65MБ")
        var progrm10= Program("https://static.olx.uz/static/olxuz/naspersclassifieds-regional/olxeu-atlas-web-olxuz/static/img/fb/fb-image_redesign.png?t=20-12-24","Olx","25MБ")
        var progrm11= Program("https://media.cdnandroid.com/item_images/1089500/imagen-oson-0big.jpg","Oson","45MБ")
        list.add(ClassIdList("Tavsiya qilinganlar", listOf(progrm8,progrm9,progrm10,progrm11)))
        var progrm12 = Program("https://kitobxon.com/img_knigi/4461.jpg","Shumbola","20MБ")
        var progrm13= Program("https://mykitob.uz/wp-content/uploads/2018/11/otgan0kunlar.jpg","O`tgan kunlar","25MБ")
        var progrm14= Program("https://cdn.apk-cloud.com/detail/screenshot/Aj-3au9sB0FJPa3HRCXz1BpoNYU53qfA73-uLzO4_IueTodaXCTZd8Li0PdyWvwCyYub=h900.png","Mexrobdan chayon","30MБ")
        var progrm15= Program("https://i.mycdn.me/i?r=AyH4iRPQ2q0otWIFepML2LxRy4q_6piEx47kqPEHh_8bZQ","Quronu Karim","50MБ")

        list.add(ClassIdList("Kitoblar", listOf(progrm12,progrm13,progrm14,progrm15)))
    }
}