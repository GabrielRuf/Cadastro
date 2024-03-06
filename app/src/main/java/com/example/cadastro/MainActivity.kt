package com.example.cadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.cadastro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            salvarBt.setOnClickListener {
                val sexo = if (sexoRg.checkedRadioButtonId == masculinoRb.id)
                    masculinoRb.text.toString() else femininoRb.text.toString()

                val pessoa = Formulario(
                    nomeEt.text.toString(),
                    telefoneEt.text.toString(),
                    emailEt.text.toString(),
                    comunicacaoCb.isChecked,
                    sexo,
                    cidadeEt.text.toString(),
                    UFSpinner.selectedItem.toString()
                )
                exibirMensagem(pessoa.toString())
            }

            limparBt.setOnClickListener {
                limparCampos()
            }
        }
    }

    private fun exibirMensagem(mensagem: String) {
        Toast.makeText(this@MainActivity, mensagem, Toast.LENGTH_SHORT).show()
    }

    private fun limparCampos() {
        with(binding) {
            nomeEt.text.clear()
            telefoneEt.text.clear()
            emailEt.text.clear()
            comunicacaoCb.isChecked = false
            sexoRg.check(masculinoRb.id)
            cidadeEt.text.clear()
            UFSpinner.setSelection(0)
        }
    }
}
