package com.mahipal.chipcardsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.mahipal.customchipcard.ChipCard
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ChipCard.OnChipCardSelected {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cc_oppo.setOnChipSelectedListener(this)
        cc_blackberry.setOnChipSelectedListener(this)
        cc_apple.setOnChipSelectedListener(this)
        cc_samsung.setOnChipSelectedListener(this)
        cc_nokia.setOnChipSelectedListener(this)

    }

    override fun onChipCardSelected(view: ChipCard?, isChecked: Boolean) {
        when(view?.id) {
            R.id.cc_oppo -> {
                if (isChecked) {
                    showToast(cc_oppo.getText() + " checked")
                } else {
                    showToast(cc_oppo.getText() + " checked removed")
                }
            }

            R.id.cc_blackberry -> {
                if (isChecked) {
                    showToast(cc_blackberry.getText() + " checked")
                } else {
                    showToast(cc_blackberry.getText() + " checked removed")
                }
            }

            R.id.cc_apple -> {
                if (isChecked) {
                    showToast(cc_apple.getText() + " checked")
                } else {
                    showToast(cc_apple.getText() + " checked removed")
                }
            }

            R.id.cc_samsung -> {
                if (isChecked) {
                    showToast(cc_samsung.getText() + " checked")
                } else {
                    showToast(cc_samsung.getText() + " checked removed")
                }
            }

            R.id.cc_nokia -> {
                if (isChecked) {
                    showToast(cc_nokia.getText() + " checked")
                } else {
                    showToast(cc_nokia.getText() + " checked removed")
                }
            }
        }
    }

    private fun showToast(message:String) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show()
    }
}
