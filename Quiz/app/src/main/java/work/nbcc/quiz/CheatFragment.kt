package work.nbcc.quiz


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import kotlinx.android.synthetic.main.fragment_cheat.*
import work.nbcc.quiz.databinding.FragmentCheatBinding
import work.nbcc.quiz.databinding.FragmentMainBinding
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class CheatFragment : Fragment() {

    private lateinit var binding: FragmentCheatBinding
    private lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_main,
            container, false
        )
        

        return binding.root
    }


}
