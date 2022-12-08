package com.mktoast

import android.content.Context
import android.widget.Toast

class MkToast(val mContext: Context) {

    fun messagePrint(){
        Toast.makeText(mContext, "Hello how are you", Toast.LENGTH_SHORT).show()
    }
}