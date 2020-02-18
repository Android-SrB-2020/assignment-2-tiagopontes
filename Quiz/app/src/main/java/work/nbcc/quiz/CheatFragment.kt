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

    private lateinit var navController: NavController

    private val questionBank = listOf(
        Question(R.string.question_1, false),
        Question(R.string.question_2, true),
        Question(R.string.question_3, true),
        Question(R.string.question_4, false),
        Question(R.string.question_5, false),
        Question(R.string.question_6, true),
        Question(R.string.question_7, false),
        Question(R.string.question_8, true),
        Question(R.string.question_9, false),
        Question(R.string.question_10, false),
        Question(R.string.question_11, false),
        Question(R.string.question_12, true),
        Question(R.string.question_13, false),
        Question(R.string.question_14, true),
        Question(R.string.question_15, false),
        Question(R.string.question_16, false),
        Question(R.string.question_17, true),
        Question(R.string.question_18, false),
        Question(R.string.question_19, false),
        Question(R.string.question_20, true))

    var questionIndex: Int = 0

    private lateinit var binding: FragmentCheatBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cheat,
            container, false
        )

        binding.questionLabel.setText(questionBank[questionIndex].textResId)


        binding.apply {

            cheatButton.setOnClickListener{
                binding.answerLabel.visibility = View.VISIBLE
            }

            cancelButton.setOnClickListener{
                activity?.onBackPressed()
            }
        }


        return binding.root
    }
}
