package aula01.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import aula01.kotlin.databinding.ActivityMainBinding
import org.mariuszgromada.math.mxparser.Expression

class MainActivity : AppCompatActivity() {

    private  lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val count = binding.count
        val result = binding.result

        binding.n0.setOnClickListener{
            if (result.text == "") {
            count.text = "${count.text}0"
            }else{
                count.text = "0"
                result.text = ""
            }
        }
        binding.n1.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}1"
            }else{
                count.text = "1"
                result.text = ""
            }
        }
        binding.n2.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}2"
            }else{
                count.text = "2"
                result.text = ""
            }
        }
        binding.n3.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}3"
            }else{
                count.text = "3"
                result.text = ""
            }
        }
        binding.n4.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}4"
            }else{
                count.text = "4"
                result.text = ""
            }
        }
        binding.n5.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}5"
            }else{
                count.text = "5"
                result.text = ""
            }
        }
        binding.n6.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}6"
            }else{
                count.text = "6"
                result.text = ""
            }
        }
        binding.n7.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}7"
            }else{
                count.text = "7"
                result.text = ""
            }
        }
        binding.n8.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}8"
            }else{
                count.text = "8"
                result.text = ""
            }
        }
        binding.n9.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}9"
            }else{
                count.text = "9"
                result.text = ""
            }
        }
        binding.point.setOnClickListener{
            if(result.text == "" && count.text != "") {
                count.text = "${count.text}."
            }else{
                Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
            }
        }
        binding.parentOpen.setOnClickListener{
            if (result.text == "") {
                count.text = "${count.text}("
            }else{
                count.text = "("
                result.text = ""
            }
        }
        binding.parentClose.setOnClickListener{
            if (result.text == "" && count.text.contains("(")) {
                count.text = "${count.text})"
            }else{
                Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
            }
        }
        binding.division.setOnClickListener{
            if (result.text == "") {
                if(count.text != ""){
                    count.text = "${count.text} / "
                }else{
                    Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
                }
            }else{
                count.text = "${result.text} / "
                result.text = ""
            }
        }
        binding.multiplication.setOnClickListener{
            if (result.text == "") {
                if(count.text != ""){
                    count.text = "${count.text} * "
                }else{
                    Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
                }
            }else{
                count.text = "${result.text} * "
                result.text = ""
            }
        }
        binding.subtraction.setOnClickListener{
            if (result.text == "") {
                if(count.text != ""){
                    count.text = "${count.text} - "
                }else{
                    Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
                }
            }else{
                count.text = "${result.text} - "
                result.text = ""
            }
        }
        binding.adiction.setOnClickListener{
            if (result.text == "") {
                if(count.text != ""){
                    count.text = "${count.text} + "
                }else{
                    Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
                }
            }else{
                count.text = "${result.text} + "
                result.text = ""
            }
        }
        binding.delete.setOnClickListener{
            if (count.text != "") {
                count.text = count.text.dropLast(1)
            }else{
                Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
            }
        }
        binding.CE.setOnClickListener{
            count.text = ""
            result.text = ""
        }
        binding.done.setOnClickListener{
            val r = Expression(count.text.toString()).calculate()
            if(r.isNaN() || count.text == "") {
                Toast.makeText(this, "Operação inválida, tente novamente", Toast.LENGTH_LONG).show()
            }else {
                count.text = "${count.text} = "
                result.text = "${r.toString()}"
            }
        }
    }
}