package com.mktoast

import android.content.Context
import android.widget.Toast

open class MkToast(val mContext: Context) {

    fun messagePrint(msg:String){
        Toast.makeText(mContext, msg, Toast.LENGTH_SHORT).show()
    }
}