package com.life4.cooltoast


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.drawable.DrawableCompat


class CoolToast : Toast(null) {


    companion object {

        val LENGTH_SHORT = 0
        val LENGTH_LONG = 1

        val SUCCESS = 1
        val WARNING = 2
        val ERROR = 3
        val INFO = 4
        val DEFAULT = 5
        val CONFUSING = 6
        val REMINDER = 7


        fun makeText(context: Context, message: CharSequence, type: Int, duration: Int): Toast {

            var toast: Toast? = null
            toast = Toast(context)
            toast.duration = duration
            val layout =
                LayoutInflater.from(context).inflate(R.layout.cooltoast_layout, null, false)
            val linearLayout = layout.findViewById<LinearLayout>(R.id.toast_type)
            val messageText = layout.findViewById<TextView>(R.id.toast_text)
            val image = layout.findViewById<ImageView>(R.id.toast_icon)
            messageText.text = message.toString()

            when (type) {
                1 -> {
                    linearLayout.setBackgroundResource(R.drawable.success_shape)
                    image.setImageResource(R.drawable.ic_round_check)
                }
                2 -> {
                    linearLayout.setBackgroundResource(R.drawable.warning_shape)
                    image.setImageResource(R.drawable.ic_baseline_warning)
                }
                3 -> {
                    linearLayout.setBackgroundResource(R.drawable.error_shape)
                    image.setImageResource(R.drawable.ic_round_clear)
                }
                4 -> {
                    linearLayout.setBackgroundResource(R.drawable.info_shape)
                    image.setImageResource(R.drawable.ic_round_help)
                }
                5 -> {
                    linearLayout.setBackgroundResource(R.drawable.default_shape)
                    image.visibility = View.GONE
                }
                6 -> {
                    linearLayout.setBackgroundResource(R.drawable.confusing_shape)
                    image.setImageResource(R.drawable.ic_baseline_outlet)
                }
                7 -> {
                    linearLayout.setBackgroundResource(R.drawable.reminder_shape)
                    image.setImageResource(R.drawable.ic_round_notifications)
                }
                else -> {
                    linearLayout.setBackgroundResource(R.drawable.default_shape)
                    image.visibility = View.GONE
                }

            }


            toast.view = layout
            return toast
        }

        fun makeText(
            context: Context,
            message: CharSequence,
            color: Int,
            icon: Int,
            duration: Int
        ): Toast {
            var toast: Toast? = null
            toast = Toast(context)
            toast.duration = duration
            val layout =
                LayoutInflater.from(context).inflate(R.layout.cooltoast_layout, null, false)
            val linearLayout = layout.findViewById<LinearLayout>(R.id.toast_type)
            val messageText = layout.findViewById<TextView>(R.id.toast_text)
            val image = layout.findViewById<ImageView>(R.id.toast_icon)
            messageText.text = message.toString()
            image.setImageResource(icon)

            val unwrappedDrawable =
                AppCompatResources.getDrawable(context, R.drawable.default_shape)
            val wrappedDrawable = unwrappedDrawable?.let { DrawableCompat.wrap(it) };
            if (wrappedDrawable != null) {
                DrawableCompat.setTint(wrappedDrawable, color)
            }
            linearLayout.setBackgroundResource(R.drawable.default_shape)

            toast.view = layout
            return toast

        }

    }


}

