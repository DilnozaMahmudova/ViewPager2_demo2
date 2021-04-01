package uz.dilnoza.homework_3_2


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class Adapter(
    private val color: List<Int>,
    private val image: List<Int>,
    private val text_1: List<String>,
    private val text_2: List<String>,
    activity:FragmentActivity
):FragmentStateAdapter(activity){
    override fun getItemCount()=color.size
    override fun createFragment(position: Int): Fragment=ExampleFragment().putArgument {
        putInt("COLOR",color[position])
        putInt("IMAGE",image[position])
        putString("TEXT_1",text_1[position])
        putString("TEXT_2",text_2[position])
    }


}