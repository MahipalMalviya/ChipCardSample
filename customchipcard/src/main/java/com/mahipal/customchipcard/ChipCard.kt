package com.mahipal.customchipcard

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.CompoundButton
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.layout_chip_card.view.*

/**
 * Created by Mahipal on 28/April/2020
 */
class ChipCard(context: Context, private val attrs: AttributeSet) : RelativeLayout(context,attrs), CompoundButton.OnCheckedChangeListener {

    private var onChipCardSelected: OnChipCardSelected? = null

    init {
        createChipCardView()
    }

    private fun createChipCardView() {
        LayoutInflater.from(context).inflate(R.layout.layout_chip_card, this)
        val typedArray = context.theme.obtainStyledAttributes(attrs, R.styleable.ChipCard, 0, 0)

        try {
            val chipText = typedArray.getText(R.styleable.ChipCard_chipText)
            val isChecked = typedArray.getBoolean(R.styleable.ChipCard_setChecked,false)

            chip_checkbox.text = chipText
            chip_checkbox.isChecked = isChecked

        } finally {
            typedArray.recycle()
        }

        chip_checkbox?.setOnCheckedChangeListener(this)
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        when(buttonView?.id) {
            R.id.chip_checkbox -> {
                onChipCardSelected?.onChipCardSelected(this@ChipCard, isChecked)
            }
        }
    }

    interface OnChipCardSelected {
        fun onChipCardSelected(view: ChipCard?, isChecked: Boolean)
    }

    fun setOnChipSelectedListener(onChipCardSelected: OnChipCardSelected) {
        this.onChipCardSelected = onChipCardSelected
    }

    fun isChecked(): Boolean {
        return chip_checkbox.isChecked
    }

    fun setChecked(isCheck: Boolean) {
        chip_checkbox.isChecked = isCheck
    }

    fun getText(): String {
        return chip_checkbox.text.toString()
    }

}