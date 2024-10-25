package id.ac.polbeng.tamarablezinky.uts

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.tamarablezinky.uts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Ambil referensi ke widget UI
        val etSisi: EditText = findViewById(R.id.etSisi)
        val btnHitung: Button = findViewById(R.id.btnHitung)
        val tvHasil: TextView = findViewById(R.id.tvHasil)

        btnHitung.setOnClickListener {
            // Ambil input sisi
            val sisiStr = etSisi.text.toString()

            // Validasi input, pastikan tidak kosong
            if (sisiStr.isNotEmpty()) {
                val sisi = sisiStr.toDouble()

                // Hitung volume dan luas kubus
                val volume = sisi * sisi * sisi
                val luas = 6 * (sisi * sisi)

                // Tampilkan hasil
                tvHasil.text = "Volume Kubus: $volume\nLuas Permukaan Kubus: $luas"
            } else {
                // Jika input kosong, tampilkan pesan kesalahan
                Toast.makeText(this, "Mohon masukkan panjang sisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
