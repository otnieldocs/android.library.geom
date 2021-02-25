package com.otnieldocs.androgeom

import android.content.Context
import android.content.res.TypedArray
import android.graphics.drawable.GradientDrawable
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout

class RectangleLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    private var radiusTopLeft = 0F
    private var radiusTopRight = 0F
    private var radiusBottomLeft = 0F
    private var radiusBottomRight = 0F
    private var radius = 0F

    init {
        attrs?.let {
            val typedArray = context.obtainStyledAttributes(it, R.styleable.RectangleLayout)

            initRadius(typedArray)
            initBackground(typedArray)

            typedArray.recycle()
        }
    }

    private fun initRadius(typedArray: TypedArray) {
        with(typedArray) {
            radius = getDimensionPixelSize(R.styleable.RectangleLayout_radius, 0)
                .toFloat()
            radiusTopLeft = if (radius == 0F) {
                getDimensionPixelSize(R.styleable.RectangleLayout_radiusTopLeft, 0)
                    .toFloat()
            } else radius

            radiusTopRight = if (radius == 0F) {
                getDimensionPixelSize(R.styleable.RectangleLayout_radiusTopRight, 0)
                    .toFloat()
            } else radius

            radiusBottomLeft = if (radius == 0F) {
                getDimensionPixelSize(R.styleable.RectangleLayout_radiusBottomLeft, 0)
                    .toFloat()
            } else radius

            radiusBottomRight = if (radius == 0F) {
                getDimensionPixelSize(R.styleable.RectangleLayout_radiusBottomRight, 0)
                    .toFloat()
            } else radius
        }
    }

    private fun initBackground(typedArray: TypedArray) {
        setBackgroundResource(R.drawable.rectanglelayout_bg_rounded)
        val drawable: GradientDrawable = background as GradientDrawable

        with(drawable) {
            cornerRadii = floatArrayOf(
                radiusTopLeft, radiusTopLeft,
                radiusTopRight, radiusTopRight,
                radiusBottomRight, radiusBottomRight,
                radiusBottomLeft, radiusBottomLeft
            )

            setTint(typedArray.getColor(R.styleable.RectangleLayout_backgroundColor, 0))
        }
    }
}