package work.nbcc.quiz


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import work.nbcc.quiz.databinding.FragmentAboutBinding
import work.nbcc.quiz.databinding.FragmentMainBinding

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {


    private lateinit var binding: FragmentAboutBinding
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_about, container, false)
    }



}
