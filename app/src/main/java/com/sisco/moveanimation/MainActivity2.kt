package com.sisco.moveanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.sisco.moveanimation.databinding.ActivityMain2Binding
import java.util.concurrent.TimeUnit

class MainActivity2 : AppCompatActivity(), Animation.AnimationListener {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.img.setOnClickListener {
            animationMove(R.anim.move_top)
            TimeUnit.MILLISECONDS.sleep(1600)
            animationMove(R.anim.move_bottom)
        }
    }

    private fun animationMove(animXml: Int) {
        val animation = AnimationUtils.loadAnimation(this, animXml)
        animation.setAnimationListener(this)
        Handler(Looper.getMainLooper()).postDelayed(
            { binding.img.startAnimation(animation) },
            1500
        )
    }

    override fun onAnimationStart(p0: Animation?) {}

    override fun onAnimationEnd(p0: Animation?) {}

    override fun onAnimationRepeat(p0: Animation?) {}
}