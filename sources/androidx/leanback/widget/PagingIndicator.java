package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.leanback.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class PagingIndicator extends View {
    private static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();
    private static final Property<Dot, Float> DOT_ALPHA;
    private static final Property<Dot, Float> DOT_DIAMETER;
    private static final Property<Dot, Float> DOT_TRANSLATION_X;
    private static final long DURATION_ALPHA = 167;
    private static final long DURATION_DIAMETER = 417;
    private static final long DURATION_TRANSLATION_X = 417;
    private final AnimatorSet mAnimator;
    Bitmap mArrow;
    final int mArrowDiameter;
    private final int mArrowGap;
    Paint mArrowPaint;
    final int mArrowRadius;
    final Rect mArrowRect;
    final float mArrowToBgRatio;
    final Paint mBgPaint;
    private int mCurrentPage;
    int mDotCenterY;
    final int mDotDiameter;

    @ColorInt
    int mDotFgSelectColor;
    private final int mDotGap;
    final int mDotRadius;
    private int[] mDotSelectedNextX;
    private int[] mDotSelectedPrevX;
    private int[] mDotSelectedX;
    private Dot[] mDots;
    final Paint mFgPaint;
    private final AnimatorSet mHideAnimator;
    boolean mIsLtr;
    private int mPageCount;
    private int mPreviousPage;
    private final int mShadowRadius;
    private final AnimatorSet mShowAnimator;

    /* loaded from: classes3.dex */
    public class Dot {
        static final float LEFT = -1.0f;
        static final float LTR = 1.0f;
        static final float RIGHT = 1.0f;
        static final float RTL = -1.0f;
        float mAlpha;
        float mArrowImageRadius;
        float mCenterX;
        float mDiameter;
        float mDirection = 1.0f;

        @ColorInt
        int mFgColor;
        float mLayoutDirection;
        float mRadius;
        float mTranslationX;

        public Dot() {
            this.mLayoutDirection = PagingIndicator.this.mIsLtr ? 1.0f : -1.0f;
        }

        public void adjustAlpha() {
            this.mFgColor = Color.argb(Math.round(this.mAlpha * 255.0f), Color.red(PagingIndicator.this.mDotFgSelectColor), Color.green(PagingIndicator.this.mDotFgSelectColor), Color.blue(PagingIndicator.this.mDotFgSelectColor));
        }

        void deselect() {
            this.mTranslationX = 0.0f;
            this.mCenterX = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.mDiameter = pagingIndicator.mDotDiameter;
            float f8 = pagingIndicator.mDotRadius;
            this.mRadius = f8;
            this.mArrowImageRadius = f8 * pagingIndicator.mArrowToBgRatio;
            this.mAlpha = 0.0f;
            adjustAlpha();
        }

        void draw(Canvas canvas) {
            float f8 = this.mCenterX + this.mTranslationX;
            canvas.drawCircle(f8, r1.mDotCenterY, this.mRadius, PagingIndicator.this.mBgPaint);
            if (this.mAlpha > 0.0f) {
                PagingIndicator.this.mFgPaint.setColor(this.mFgColor);
                canvas.drawCircle(f8, r1.mDotCenterY, this.mRadius, PagingIndicator.this.mFgPaint);
                PagingIndicator pagingIndicator = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator.mArrow;
                Rect rect = pagingIndicator.mArrowRect;
                float f9 = this.mArrowImageRadius;
                int i8 = PagingIndicator.this.mDotCenterY;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f8 - f9), (int) (i8 - f9), (int) (f8 + f9), (int) (i8 + f9)), PagingIndicator.this.mArrowPaint);
            }
        }

        public float getAlpha() {
            return this.mAlpha;
        }

        public float getDiameter() {
            return this.mDiameter;
        }

        public float getTranslationX() {
            return this.mTranslationX;
        }

        void onRtlPropertiesChanged() {
            float f8;
            if (PagingIndicator.this.mIsLtr) {
                f8 = 1.0f;
            } else {
                f8 = -1.0f;
            }
            this.mLayoutDirection = f8;
        }

        void select() {
            this.mTranslationX = 0.0f;
            this.mCenterX = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.mDiameter = pagingIndicator.mArrowDiameter;
            float f8 = pagingIndicator.mArrowRadius;
            this.mRadius = f8;
            this.mArrowImageRadius = f8 * pagingIndicator.mArrowToBgRatio;
            this.mAlpha = 1.0f;
            adjustAlpha();
        }

        public void setAlpha(float f8) {
            this.mAlpha = f8;
            adjustAlpha();
            PagingIndicator.this.invalidate();
        }

        public void setDiameter(float f8) {
            this.mDiameter = f8;
            float f9 = f8 / 2.0f;
            this.mRadius = f9;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.mArrowImageRadius = f9 * pagingIndicator.mArrowToBgRatio;
            pagingIndicator.invalidate();
        }

        public void setTranslationX(float f8) {
            this.mTranslationX = f8 * this.mDirection * this.mLayoutDirection;
            PagingIndicator.this.invalidate();
        }
    }

    static {
        Class<Float> cls = Float.class;
        DOT_ALPHA = new Property<Dot, Float>(cls, "alpha") { // from class: androidx.leanback.widget.PagingIndicator.1
            @Override // android.util.Property
            public Float get(Dot dot) {
                return Float.valueOf(dot.getAlpha());
            }

            @Override // android.util.Property
            public void set(Dot dot, Float f8) {
                dot.setAlpha(f8.floatValue());
            }
        };
        DOT_DIAMETER = new Property<Dot, Float>(cls, "diameter") { // from class: androidx.leanback.widget.PagingIndicator.2
            @Override // android.util.Property
            public Float get(Dot dot) {
                return Float.valueOf(dot.getDiameter());
            }

            @Override // android.util.Property
            public void set(Dot dot, Float f8) {
                dot.setDiameter(f8.floatValue());
            }
        };
        DOT_TRANSLATION_X = new Property<Dot, Float>(cls, "translation_x") { // from class: androidx.leanback.widget.PagingIndicator.3
            @Override // android.util.Property
            public Float get(Dot dot) {
                return Float.valueOf(dot.getTranslationX());
            }

            @Override // android.util.Property
            public void set(Dot dot, Float f8) {
                dot.setTranslationX(f8.floatValue());
            }
        };
    }

    public PagingIndicator(Context context) {
        this(context, null, 0);
    }

    private void adjustDotPosition() {
        int i8;
        float f8;
        int i9 = 0;
        while (true) {
            i8 = this.mCurrentPage;
            f8 = -1.0f;
            if (i9 >= i8) {
                break;
            }
            this.mDots[i9].deselect();
            Dot dot = this.mDots[i9];
            if (i9 != this.mPreviousPage) {
                f8 = 1.0f;
            }
            dot.mDirection = f8;
            dot.mCenterX = this.mDotSelectedPrevX[i9];
            i9++;
        }
        this.mDots[i8].select();
        Dot[] dotArr = this.mDots;
        int i10 = this.mCurrentPage;
        Dot dot2 = dotArr[i10];
        if (this.mPreviousPage >= i10) {
            f8 = 1.0f;
        }
        dot2.mDirection = f8;
        dot2.mCenterX = this.mDotSelectedX[i10];
        while (true) {
            i10++;
            if (i10 < this.mPageCount) {
                this.mDots[i10].deselect();
                Dot dot3 = this.mDots[i10];
                dot3.mDirection = 1.0f;
                dot3.mCenterX = this.mDotSelectedNextX[i10];
            } else {
                return;
            }
        }
    }

    private void calculateDotPositions() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i8 = (paddingLeft + width) / 2;
        int i9 = this.mPageCount;
        int[] iArr = new int[i9];
        this.mDotSelectedX = iArr;
        int[] iArr2 = new int[i9];
        this.mDotSelectedPrevX = iArr2;
        int[] iArr3 = new int[i9];
        this.mDotSelectedNextX = iArr3;
        int i10 = 1;
        if (this.mIsLtr) {
            int i11 = i8 - (requiredWidth / 2);
            int i12 = this.mDotRadius;
            int i13 = this.mDotGap;
            int i14 = this.mArrowGap;
            iArr[0] = ((i11 + i12) - i13) + i14;
            iArr2[0] = i11 + i12;
            iArr3[0] = ((i11 + i12) - (i13 * 2)) + (i14 * 2);
            while (i10 < this.mPageCount) {
                int[] iArr4 = this.mDotSelectedX;
                int[] iArr5 = this.mDotSelectedPrevX;
                int i15 = i10 - 1;
                int i16 = iArr5[i15];
                int i17 = this.mArrowGap;
                iArr4[i10] = i16 + i17;
                iArr5[i10] = iArr5[i15] + this.mDotGap;
                this.mDotSelectedNextX[i10] = iArr4[i15] + i17;
                i10++;
            }
        } else {
            int i18 = i8 + (requiredWidth / 2);
            int i19 = this.mDotRadius;
            int i20 = this.mDotGap;
            int i21 = this.mArrowGap;
            iArr[0] = ((i18 - i19) + i20) - i21;
            iArr2[0] = i18 - i19;
            iArr3[0] = ((i18 - i19) + (i20 * 2)) - (i21 * 2);
            while (i10 < this.mPageCount) {
                int[] iArr6 = this.mDotSelectedX;
                int[] iArr7 = this.mDotSelectedPrevX;
                int i22 = i10 - 1;
                int i23 = iArr7[i22];
                int i24 = this.mArrowGap;
                iArr6[i10] = i23 - i24;
                iArr7[i10] = iArr7[i22] - this.mDotGap;
                this.mDotSelectedNextX[i10] = iArr6[i22] - i24;
                i10++;
            }
        }
        this.mDotCenterY = paddingTop + this.mArrowRadius;
        adjustDotPosition();
    }

    private Animator createDotAlphaAnimator(float f8, float f9) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, DOT_ALPHA, f8, f9);
        ofFloat.setDuration(DURATION_ALPHA);
        ofFloat.setInterpolator(DECELERATE_INTERPOLATOR);
        return ofFloat;
    }

    private Animator createDotDiameterAnimator(float f8, float f9) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, DOT_DIAMETER, f8, f9);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(DECELERATE_INTERPOLATOR);
        return ofFloat;
    }

    private Animator createDotTranslationXAnimator() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object) null, DOT_TRANSLATION_X, (-this.mArrowGap) + this.mDotGap, 0.0f);
        ofFloat.setDuration(417L);
        ofFloat.setInterpolator(DECELERATE_INTERPOLATOR);
        return ofFloat;
    }

    private int getColorFromTypedArray(TypedArray typedArray, int i8, int i9) {
        return typedArray.getColor(i8, getResources().getColor(i9));
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.mArrowDiameter + getPaddingBottom() + this.mShadowRadius;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getDimensionFromTypedArray(TypedArray typedArray, int i8, int i9) {
        return typedArray.getDimensionPixelOffset(i8, getResources().getDimensionPixelOffset(i9));
    }

    private int getRequiredWidth() {
        return (this.mDotRadius * 2) + (this.mArrowGap * 2) + ((this.mPageCount - 3) * this.mDotGap);
    }

    private Bitmap loadArrow() {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.mIsLtr) {
            return decodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(decodeResource, 0, 0, decodeResource.getWidth(), decodeResource.getHeight(), matrix, false);
    }

    private void setSelectedPage(int i8) {
        if (i8 == this.mCurrentPage) {
            return;
        }
        this.mCurrentPage = i8;
        adjustDotPosition();
    }

    @VisibleForTesting
    int[] getDotSelectedLeftX() {
        return this.mDotSelectedPrevX;
    }

    @VisibleForTesting
    int[] getDotSelectedRightX() {
        return this.mDotSelectedNextX;
    }

    @VisibleForTesting
    int[] getDotSelectedX() {
        return this.mDotSelectedX;
    }

    @VisibleForTesting
    int getPageCount() {
        return this.mPageCount;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i8 = 0; i8 < this.mPageCount; i8++) {
            this.mDots[i8].draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i9);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                desiredHeight = View.MeasureSpec.getSize(i9);
            }
        } else {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i9));
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                desiredWidth = View.MeasureSpec.getSize(i8);
            }
        } else {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i8));
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    public void onPageSelected(int i8, boolean z8) {
        if (this.mCurrentPage == i8) {
            return;
        }
        if (this.mAnimator.isStarted()) {
            this.mAnimator.end();
        }
        int i9 = this.mCurrentPage;
        this.mPreviousPage = i9;
        if (z8) {
            this.mHideAnimator.setTarget(this.mDots[i9]);
            this.mShowAnimator.setTarget(this.mDots[i8]);
            this.mAnimator.start();
        }
        setSelectedPage(i8);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        boolean z8;
        super.onRtlPropertiesChanged(i8);
        if (i8 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (this.mIsLtr != z8) {
            this.mIsLtr = z8;
            this.mArrow = loadArrow();
            Dot[] dotArr = this.mDots;
            if (dotArr != null) {
                for (Dot dot : dotArr) {
                    dot.onRtlPropertiesChanged();
                }
            }
            calculateDotPositions();
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        setMeasuredDimension(i8, i9);
        calculateDotPositions();
    }

    public void setArrowBackgroundColor(@ColorInt int i8) {
        this.mDotFgSelectColor = i8;
    }

    public void setArrowColor(@ColorInt int i8) {
        if (this.mArrowPaint == null) {
            this.mArrowPaint = new Paint();
        }
        this.mArrowPaint.setColorFilter(new PorterDuffColorFilter(i8, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(@ColorInt int i8) {
        this.mBgPaint.setColor(i8);
    }

    public void setPageCount(int i8) {
        if (i8 > 0) {
            this.mPageCount = i8;
            this.mDots = new Dot[i8];
            for (int i9 = 0; i9 < this.mPageCount; i9++) {
                this.mDots[i9] = new Dot();
            }
            calculateDotPositions();
            setSelectedPage(0);
            return;
        }
        throw new IllegalArgumentException("The page count should be a positive integer");
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AnimatorSet animatorSet = new AnimatorSet();
        this.mAnimator = animatorSet;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PagingIndicator, i8, 0);
        int dimensionFromTypedArray = getDimensionFromTypedArray(obtainStyledAttributes, R.styleable.PagingIndicator_lbDotRadius, R.dimen.lb_page_indicator_dot_radius);
        this.mDotRadius = dimensionFromTypedArray;
        this.mDotDiameter = dimensionFromTypedArray * 2;
        int dimensionFromTypedArray2 = getDimensionFromTypedArray(obtainStyledAttributes, R.styleable.PagingIndicator_arrowRadius, R.dimen.lb_page_indicator_arrow_radius);
        this.mArrowRadius = dimensionFromTypedArray2;
        int i9 = dimensionFromTypedArray2 * 2;
        this.mArrowDiameter = i9;
        this.mDotGap = getDimensionFromTypedArray(obtainStyledAttributes, R.styleable.PagingIndicator_dotToDotGap, R.dimen.lb_page_indicator_dot_gap);
        this.mArrowGap = getDimensionFromTypedArray(obtainStyledAttributes, R.styleable.PagingIndicator_dotToArrowGap, R.dimen.lb_page_indicator_arrow_gap);
        int colorFromTypedArray = getColorFromTypedArray(obtainStyledAttributes, R.styleable.PagingIndicator_dotBgColor, R.color.lb_page_indicator_dot);
        Paint paint = new Paint(1);
        this.mBgPaint = paint;
        paint.setColor(colorFromTypedArray);
        this.mDotFgSelectColor = getColorFromTypedArray(obtainStyledAttributes, R.styleable.PagingIndicator_arrowBgColor, R.color.lb_page_indicator_arrow_background);
        if (this.mArrowPaint == null) {
            int i10 = R.styleable.PagingIndicator_arrowColor;
            if (obtainStyledAttributes.hasValue(i10)) {
                setArrowColor(obtainStyledAttributes.getColor(i10, 0));
            }
        }
        obtainStyledAttributes.recycle();
        this.mIsLtr = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.mShadowRadius = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.mFgPaint = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color);
        this.mArrow = loadArrow();
        this.mArrowRect = new Rect(0, 0, this.mArrow.getWidth(), this.mArrow.getHeight());
        this.mArrowToBgRatio = this.mArrow.getWidth() / i9;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.mShowAnimator = animatorSet2;
        animatorSet2.playTogether(createDotAlphaAnimator(0.0f, 1.0f), createDotDiameterAnimator(dimensionFromTypedArray * 2, dimensionFromTypedArray2 * 2), createDotTranslationXAnimator());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.mHideAnimator = animatorSet3;
        animatorSet3.playTogether(createDotAlphaAnimator(1.0f, 0.0f), createDotDiameterAnimator(dimensionFromTypedArray2 * 2, dimensionFromTypedArray * 2), createDotTranslationXAnimator());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }
}
