import android.content.Context
import android.graphics.RenderEffect
import android.graphics.Shader
import android.os.Build
import android.util.TypedValue
import android.view.View
import com.example.dopatox.R
import com.example.dopatox.domain.model.BoardItem

import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.dopatox.domain.model.BadgeItem
import kotlin.collections.mutableMapOf

object Constants {

    fun runAnimation(context: Context, animId: Int): Animation =
        AnimationUtils.loadAnimation(context, animId)

    val boards: List<BoardItem>
        get() = listOf(
            BoardItem(
                R.drawable.frame_1,
                "Break free from digital addiction. Live more.",
                "Encouraging you to break away from unhealthy screen habits and experience a more satisfying, realistic journey.",
            ),
            BoardItem(
                R.drawable.frame_2,
                "Smart habits start here. Balance digital life.",
                "The app helps you build a healthier digital routine and find harmony between online and offline life.",
            ),
            BoardItem(
                R.drawable.frame_3,
                "Less screen, more life. Are you ready?",
                "A motivational challenge to inspire you to reduce screen time and engage in beneficial activities.",
            )
        )

    val shareText = "\uD83D\uDCF5 Feeling overwhelmed by your phone?\n" +
            "Try Dopatox — the smart way to limit screen time and build healthier habits!\n" +
            "Get it now: https://www.dopatox.site"

    val timeLimits = mutableMapOf<Int, Pair<String, Float>>(
        0 to Pair("30 minutes", 0.5f),
        1 to Pair("1 hour", 1f),
        2 to Pair("1.5 hours", 1.5f),
        3 to Pair("2 hours", 2f),
        4 to Pair("2.5 hours", 2.5f),
        5 to Pair("3 hours", 3f),
        6 to Pair("3.5 hours", 3.5f),
        7 to Pair("4 hours", 4f),
        8 to Pair("4.5 hours", 4.5f),
        9 to Pair("5 hours", 5f),
        10 to Pair("no limit", 24f)

    )

    val demoBadges = listOf(
        BadgeItem(R.drawable.gold_medal, "Instagram", "3 Hours", "20 MAR"),
        BadgeItem(R.drawable.silver_medal, "Facebook", "1 Hours", "30 MAR"),
        BadgeItem(R.drawable.bronze_medal, "Twitter", "2 Hours", "15 MAR"),
        BadgeItem(R.drawable.gold_medal, "Instagram", "3 Hours", "20 MAR"),
        BadgeItem(R.drawable.silver_medal, "Facebook", "1 Hours", "30 MAR"),
        BadgeItem(R.drawable.bronze_medal, "Twitter", "2 Hours", "15 MAR"),
        BadgeItem(R.drawable.gold_medal, "Instagram", "3 Hours", "20 MAR"),
        BadgeItem(R.drawable.silver_medal, "Facebook", "1 Hours", "30 MAR"),
        BadgeItem(R.drawable.bronze_medal, "Twitter", "2 Hours", "15 MAR"),
        BadgeItem(R.drawable.gold_medal, "Instagram", "3 Hours", "20 MAR"),
        BadgeItem(R.drawable.silver_medal, "Facebook", "1 Hours", "30 MAR"),
        BadgeItem(R.drawable.bronze_medal, "Twitter", "2 Hours", "15 MAR"),
        BadgeItem(R.drawable.gold_medal, "Instagram", "3 Hours", "20 MAR"),
        BadgeItem(R.drawable.silver_medal, "Facebook", "1 Hours", "30 MAR"),
        BadgeItem(R.drawable.bronze_medal, "Twitter", "2 Hours", "15 MAR"),
    )

    fun getHours(time: Long): Int {
        return (time / 1000 / 60 / 60).toInt()
    }

    fun getMinutes(time: Long): Int {
        return ((time / 1000 / 60) % 60).toInt()
    }

    fun Context.getColorFromAttr(attrColor: Int): Int {
        val typedValue = TypedValue()
        theme.resolveAttribute(attrColor, typedValue, true)
        return typedValue.data
    }


    fun blurView(view: View, degree: Float) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
            val blurEffect = RenderEffect.createBlurEffect(degree, degree, Shader.TileMode.CLAMP)
            view.setRenderEffect(blurEffect)
        }
    }

    fun showBlur(view: View) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S)
            view.setRenderEffect(null)
    }

}
