package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {
    private static final String TAG = "MotionTelltales";
    Matrix mInvertMatrix;
    MotionLayout mMotionLayout;
    private Paint mPaintTelltales;
    int mTailColor;
    float mTailScale;
    int mVelocityMode;
    float[] velocity;

    public MotionTelltales(Context context) {
        super(context);
        this.mPaintTelltales = new Paint();
        this.velocity = new float[2];
        this.mInvertMatrix = new Matrix();
        this.mVelocityMode = 0;
        this.mTailColor = -65281;
        this.mTailScale = 0.25f;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.MotionTelltales_telltales_tailColor) {
                    this.mTailColor = obtainStyledAttributes.getColor(index, this.mTailColor);
                } else if (index == R.styleable.MotionTelltales_telltales_velocityMode) {
                    this.mVelocityMode = obtainStyledAttributes.getInt(index, this.mVelocityMode);
                } else if (index == R.styleable.MotionTelltales_telltales_tailScale) {
                    this.mTailScale = obtainStyledAttributes.getFloat(index, this.mTailScale);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mPaintTelltales.setColor(this.mTailColor);
        this.mPaintTelltales.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.mInvertMatrix);
        if (this.mMotionLayout == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.mMotionLayout = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i8 = 0; i8 < 5; i8++) {
            float f8 = fArr[i8];
            for (int i9 = 0; i9 < 5; i9++) {
                float f9 = fArr[i9];
                this.mMotionLayout.getViewVelocity(this, f9, f8, this.velocity, this.mVelocityMode);
                this.mInvertMatrix.mapVectors(this.velocity);
                float f10 = width * f9;
                float f11 = height * f8;
                float[] fArr2 = this.velocity;
                float f12 = fArr2[0];
                float f13 = this.mTailScale;
                float f14 = f11 - (fArr2[1] * f13);
                this.mInvertMatrix.mapVectors(fArr2);
                canvas.drawLine(f10, f11, f10 - (f12 * f13), f14, this.mPaintTelltales);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaintTelltales = new Paint();
        this.velocity = new float[2];
        this.mInvertMatrix = new Matrix();
        this.mVelocityMode = 0;
        this.mTailColor = -65281;
        this.mTailScale = 0.25f;
        init(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mPaintTelltales = new Paint();
        this.velocity = new float[2];
        this.mInvertMatrix = new Matrix();
        this.mVelocityMode = 0;
        this.mTailColor = -65281;
        this.mTailScale = 0.25f;
        init(context, attributeSet);
    }
}
