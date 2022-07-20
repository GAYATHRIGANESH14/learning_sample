package gayathriganesh.otpapplication

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import gayathriganesh.otpapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews() {
        // TODO header title and description
        binding.includedHeader.txtTitle.text = "Verification"
        binding.includedHeader.txtViewDetails.text = "Code sent to XXXXXX89"

    }


    fun resendCode(view: View) {
        Toast.makeText(this, "Resend", Toast.LENGTH_SHORT).show()
    }

}


