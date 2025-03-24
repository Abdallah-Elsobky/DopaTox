package com.example.dopatox.ui.utlis

import android.app.Activity
import android.content.Context
import androidx.core.content.res.ResourcesCompat
import com.example.dopatox.R
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle
import www.sanju.motiontoast.R as TR

fun errorToast(context: Context, message: String) {
    MotionToast.darkToast(
        context as Activity,
        context.getString(R.string.error),
        message,
        MotionToastStyle.ERROR,
        MotionToast.GRAVITY_BOTTOM,
        MotionToast.SHORT_DURATION,
        ResourcesCompat.getFont(context, TR.font.montserrat_bold)
    )
}

fun successToast(context: Context, message: String) {
    MotionToast.darkToast(
        context as Activity,
        context.getString(R.string.success),
        message,
        MotionToastStyle.SUCCESS,
        MotionToast.GRAVITY_BOTTOM,
        MotionToast.SHORT_DURATION,
        ResourcesCompat.getFont(context, TR.font.montserrat_bold)
    )
}

fun warningToast(context: Context, message: String) {
    MotionToast.darkToast(
        context as Activity,
        context.getString(R.string.warning),
        message,
        MotionToastStyle.WARNING,
        MotionToast.GRAVITY_BOTTOM,
        MotionToast.SHORT_DURATION,
        ResourcesCompat.getFont(context, TR.font.montserrat_bold)
    )
}