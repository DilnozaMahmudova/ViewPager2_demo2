package uz.dilnoza.homework_3_2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.page.*

class ExampleFragment : Fragment(R.layout.page) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val bundle = requireArguments()
        image.setImageResource(bundle.getInt("IMAGE"))
        circle.setColorFilter(bundle.getInt("COLOR").toLightColor())
        lay.setBackgroundColor(bundle.getInt("COLOR"))
        text_1.text=bundle.getString("TEXT_1")
        text_2.text=bundle.getString("TEXT_2")
    }
}