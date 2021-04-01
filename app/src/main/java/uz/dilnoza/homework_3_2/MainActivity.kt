package uz.dilnoza.homework_3_2

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: Adapter
    private val color = arrayListOf(
        Color.parseColor("#E74C3A"),
        Color.parseColor("#F39C11"),
        Color.parseColor("#23B574")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = arrayListOf(R.drawable.pic13,
            R.drawable.pic22, R.drawable.pic3)
        val text_1 = arrayListOf("Save Money",
            "Trusted Network", "Notifications")
        val text_2 = arrayListOf(
            "Share rides to \n save or make money",
            "Share rides with \n friends, classmate or coworkers ",
            "Notified when the best match \n found by us"
        )
        adapter= Adapter(color, image,text_1,text_2,this)
        pager.adapter=adapter
        TabLayoutMediator(tabLay,pager){tab, position-> }.attach()
        pager.registerOnPageChangeCallback(pageChangeCallback)

    }
    private val pageChangeCallback=object:ViewPager2.OnPageChangeCallback(){
        override fun onPageSelected(position: Int) {
            if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
                window.navigationBarColor=color[position].toDarkenColor()
                window.statusBarColor=color[position].toDarkenColor()
            }
        }
    }
}
