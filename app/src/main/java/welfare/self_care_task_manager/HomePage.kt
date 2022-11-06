package welfare.self_care_task_manager

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.view.setPadding
import androidx.navigation.Navigation

/**
 * A simple [Fragment] subclass.
 * Use the [HomePage.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomePage : Fragment() {
    private lateinit var activity: Activity


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity = requireActivity()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnLast = view.findViewById<ImageButton>(R.id.toLastCard)
        val btnNext = view.findViewById<ImageButton>(R.id.toNextCard)
        btnLast.setOnClickListener {
            Toast.makeText(view.context, "param1", Toast.LENGTH_SHORT).show()
        }
        btnNext.setOnClickListener {
            Toast.makeText(view.context, "param2", Toast.LENGTH_SHORT).show()
        }

        val toCassatte = view.findViewById<ImageButton>(R.id.toCassatte)
        toCassatte.setOnClickListener {
            Toast.makeText(view.context, "YO", Toast.LENGTH_SHORT).show()
        }

        // Call an API to retrieve the ongoing to-do list
        val textInScroll = view.findViewById<LinearLayout>(R.id.innerLayout)
        for (i in 1 until 50) {
            val textView = TextView(view.context)
            textView.text = "Hello world new Text!"
            textView.setPadding(10)
            textView.gravity = Gravity.CENTER
            textInScroll.addView(textView)
        }
    }
}