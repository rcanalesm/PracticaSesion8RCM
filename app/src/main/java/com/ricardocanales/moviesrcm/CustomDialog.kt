package com.ricardocanales.moviesrcm

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.lang.IllegalStateException

class CustomDialog(private val message : String, private val listener: DialogInterface.OnClickListener): DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setMessage(message)
            builder.setPositiveButton("Aceptar", listener)
            builder.setNegativeButton("Cancelar"){_,_ ->}
            builder.create()
        } ?: throw IllegalStateException("Activity is null")
    }
}