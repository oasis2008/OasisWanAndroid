package com.oasis.android.utils

import android.app.ProgressDialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.oasis.android.R

/**
 * @author Oasis Yao
 *Created on 2018/11/5.
 */
object DialogUtils {

    fun showLoadingDialog(context: Context): ProgressDialog {
        var dialog = ProgressDialog(context)
        dialog.show()

        if(dialog.window != null){
            dialog.window.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        }

        dialog.setContentView(R.layout.widget_progress_dialog_layout)
        dialog.isIndeterminate = true
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)

        return dialog
    }

    fun dismissLoadingDialog(dialog: ProgressDialog){
        if(dialog != null && dialog.isShowing){
            dialog.cancel()
        }
    }
}