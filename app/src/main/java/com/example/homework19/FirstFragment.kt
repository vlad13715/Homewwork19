package com.example.homework19

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.homework19.databinding.FragmentFirstBinding

private var adapter: NewsAdapter? = null
private var binding: FragmentFirstBinding? = null

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        startNewsAdapter()
    }

    private fun startNewsAdapter() {
        adapter = NewsAdapter()
        adapter?.newsList = listOf(
            News(
                "В Австралии хотят защитить «право отключаться» от работы",
                "Сенат Австралии на днях принял законопроект, дающий сотрудникам «право отключаться» после работы и игнорировать электронные письма или звонки от своих начальников в личное время."
            ),
            News("Медиапиратство возвращается","Согласно новому отраслевому отчету информационной компании MUSO, в 2023 году количество посещений сайтов, связанных с медиапиратством, увеличилось. И, по мере роста пиратских сайтов, база подписчиков стриминговых сервисов сокращается. Такие ресурсы, как Disney+ и Hulu, неуклонно теряют клиентов, а количество платных подписок к концу года сократилось на целых 7%."),
            News("Начался масштабный эксперимент по переходу на четырехдневную рабочую неделю","В Германии стартовал большой эксперимент по переходу на четырехдневную рабочую неделю. Масштабное исследование будет продолжаться шесть месяцев и позволит сотрудникам 45 компаний по всей стране работать на один день меньше в неделю и без сокращения заработной платы.")
        )
        binding?.rvNews?.adapter= adapter
        binding?.rvNews?.layoutManager=LinearLayoutManager(requireContext())


    }

}