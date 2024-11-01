package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.FloatLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.view.GravityCompat;

/* loaded from: classes.dex */
public class MotionLabel extends View implements FloatLayout {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    static String TAG = "MotionLabel";
    private boolean mAutoSize;
    private int mAutoSizeTextType;
    float mBackgroundPanX;
    float mBackgroundPanY;
    private float mBaseTextSize;
    private float mDeltaLeft;
    private float mFloatHeight;
    private float mFloatWidth;
    private String mFontFamily;
    private int mGravity;
    private Layout mLayout;
    boolean mNotBuilt;
    Matrix mOutlinePositionMatrix;
    private int mPaddingBottom;
    private int mPaddingLeft;
    private int mPaddingRight;
    private int mPaddingTop;
    TextPaint mPaint;
    Path mPath;
    RectF mRect;
    float mRotate;
    private float mRound;
    private float mRoundPercent;
    private int mStyleIndex;
    Paint mTempPaint;
    Rect mTempRect;
    private String mText;
    private Drawable mTextBackground;
    private Bitmap mTextBackgroundBitmap;
    private Rect mTextBounds;
    private int mTextFillColor;
    private int mTextOutlineColor;
    private float mTextOutlineThickness;
    private float mTextPanX;
    private float mTextPanY;
    private BitmapShader mTextShader;
    private Matrix mTextShaderMatrix;
    private float mTextSize;
    private int mTextureEffect;
    private float mTextureHeight;
    private float mTextureWidth;
    private CharSequence mTransformed;
    private int mTypefaceIndex;
    private boolean mUseOutline;
    ViewOutlineProvider mViewOutlineProvider;
    float mZoom;
    Paint paintCache;
    float paintTextSize;

    public MotionLabel(Context context) {
        super(context);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.paintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, null);
    }

    private void adjustTexture(float f8, float f9, float f10, float f11) {
        if (this.mTextShaderMatrix == null) {
            return;
        }
        this.mFloatWidth = f10 - f8;
        this.mFloatHeight = f11 - f9;
        updateShaderMatrix();
    }

    private float getHorizontalOffset() {
        float f8;
        float f9;
        if (Float.isNaN(this.mBaseTextSize)) {
            f8 = 1.0f;
        } else {
            f8 = this.mTextSize / this.mBaseTextSize;
        }
        TextPaint textPaint = this.mPaint;
        String str = this.mText;
        float measureText = f8 * textPaint.measureText(str, 0, str.length());
        if (Float.isNaN(this.mFloatWidth)) {
            f9 = getMeasuredWidth();
        } else {
            f9 = this.mFloatWidth;
        }
        return ((((f9 - getPaddingLeft()) - getPaddingRight()) - measureText) * (this.mTextPanX + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f8;
        float f9;
        if (Float.isNaN(this.mBaseTextSize)) {
            f8 = 1.0f;
        } else {
            f8 = this.mTextSize / this.mBaseTextSize;
        }
        Paint.FontMetrics fontMetrics = this.mPaint.getFontMetrics();
        if (Float.isNaN(this.mFloatHeight)) {
            f9 = getMeasuredHeight();
        } else {
            f9 = this.mFloatHeight;
        }
        float paddingTop = (f9 - getPaddingTop()) - getPaddingBottom();
        float f10 = fontMetrics.descent;
        float f11 = fontMetrics.ascent;
        return (((paddingTop - ((f10 - f11) * f8)) * (1.0f - this.mTextPanY)) / 2.0f) - (f8 * f11);
    }

    private void init(Context context, AttributeSet attributeSet) {
        setUpTheme(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == R.styleable.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == R.styleable.MotionLabel_android_fontFamily) {
                    this.mFontFamily = obtainStyledAttributes.getString(index);
                } else if (index == R.styleable.MotionLabel_scaleFromTextSize) {
                    this.mBaseTextSize = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mBaseTextSize);
                } else if (index == R.styleable.MotionLabel_android_textSize) {
                    this.mTextSize = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.mTextSize);
                } else if (index == R.styleable.MotionLabel_android_textStyle) {
                    this.mStyleIndex = obtainStyledAttributes.getInt(index, this.mStyleIndex);
                } else if (index == R.styleable.MotionLabel_android_typeface) {
                    this.mTypefaceIndex = obtainStyledAttributes.getInt(index, this.mTypefaceIndex);
                } else if (index == R.styleable.MotionLabel_android_textColor) {
                    this.mTextFillColor = obtainStyledAttributes.getColor(index, this.mTextFillColor);
                } else if (index == R.styleable.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.mRound);
                    this.mRound = dimension;
                    setRound(dimension);
                } else if (index == R.styleable.MotionLabel_borderRoundPercent) {
                    float f8 = obtainStyledAttributes.getFloat(index, this.mRoundPercent);
                    this.mRoundPercent = f8;
                    setRoundPercent(f8);
                } else if (index == R.styleable.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == R.styleable.MotionLabel_android_autoSizeTextType) {
                    this.mAutoSizeTextType = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R.styleable.MotionLabel_textOutlineColor) {
                    this.mTextOutlineColor = obtainStyledAttributes.getInt(index, this.mTextOutlineColor);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textOutlineThickness) {
                    this.mTextOutlineThickness = obtainStyledAttributes.getDimension(index, this.mTextOutlineThickness);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textBackground) {
                    this.mTextBackground = obtainStyledAttributes.getDrawable(index);
                    this.mUseOutline = true;
                } else if (index == R.styleable.MotionLabel_textBackgroundPanX) {
                    this.mBackgroundPanX = obtainStyledAttributes.getFloat(index, this.mBackgroundPanX);
                } else if (index == R.styleable.MotionLabel_textBackgroundPanY) {
                    this.mBackgroundPanY = obtainStyledAttributes.getFloat(index, this.mBackgroundPanY);
                } else if (index == R.styleable.MotionLabel_textPanX) {
                    this.mTextPanX = obtainStyledAttributes.getFloat(index, this.mTextPanX);
                } else if (index == R.styleable.MotionLabel_textPanY) {
                    this.mTextPanY = obtainStyledAttributes.getFloat(index, this.mTextPanY);
                } else if (index == R.styleable.MotionLabel_textBackgroundRotate) {
                    this.mRotate = obtainStyledAttributes.getFloat(index, this.mRotate);
                } else if (index == R.styleable.MotionLabel_textBackgroundZoom) {
                    this.mZoom = obtainStyledAttributes.getFloat(index, this.mZoom);
                } else if (index == R.styleable.MotionLabel_textureHeight) {
                    this.mTextureHeight = obtainStyledAttributes.getDimension(index, this.mTextureHeight);
                } else if (index == R.styleable.MotionLabel_textureWidth) {
                    this.mTextureWidth = obtainStyledAttributes.getDimension(index, this.mTextureWidth);
                } else if (index == R.styleable.MotionLabel_textureEffect) {
                    this.mTextureEffect = obtainStyledAttributes.getInt(index, this.mTextureEffect);
                }
            }
            obtainStyledAttributes.recycle();
        }
        setupTexture();
        setupPath();
    }

    private void setTypefaceFromAttrs(String str, int i8, int i9) {
        Typeface typeface;
        Typeface create;
        int i10;
        if (str != null) {
            typeface = Typeface.create(str, i9);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z8 = true;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            } else {
                typeface = Typeface.SERIF;
            }
        } else {
            typeface = Typeface.SANS_SERIF;
        }
        float f8 = 0.0f;
        if (i9 > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(i9);
            } else {
                create = Typeface.create(typeface, i9);
            }
            setTypeface(create);
            if (create != null) {
                i10 = create.getStyle();
            } else {
                i10 = 0;
            }
            int i11 = (~i10) & i9;
            TextPaint textPaint = this.mPaint;
            if ((i11 & 1) == 0) {
                z8 = false;
            }
            textPaint.setFakeBoldText(z8);
            TextPaint textPaint2 = this.mPaint;
            if ((i11 & 2) != 0) {
                f8 = -0.25f;
            }
            textPaint2.setTextSkewX(f8);
            return;
        }
        this.mPaint.setFakeBoldText(false);
        this.mPaint.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    private void setUpTheme(Context context, @Nullable AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(androidx.appcompat.R.attr.colorPrimary, typedValue, true);
        TextPaint textPaint = this.mPaint;
        int i8 = typedValue.data;
        this.mTextFillColor = i8;
        textPaint.setColor(i8);
    }

    private void setupTexture() {
        if (this.mTextBackground != null) {
            this.mTextShaderMatrix = new Matrix();
            int intrinsicWidth = this.mTextBackground.getIntrinsicWidth();
            int intrinsicHeight = this.mTextBackground.getIntrinsicHeight();
            int i8 = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.mTextureWidth)) {
                    intrinsicWidth = 128;
                } else {
                    intrinsicWidth = (int) this.mTextureWidth;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.mTextureHeight)) {
                    i8 = (int) this.mTextureHeight;
                }
                intrinsicHeight = i8;
            }
            if (this.mTextureEffect != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.mTextBackgroundBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mTextBackgroundBitmap);
            this.mTextBackground.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.mTextBackground.setFilterBitmap(true);
            this.mTextBackground.draw(canvas);
            if (this.mTextureEffect != 0) {
                this.mTextBackgroundBitmap = blur(this.mTextBackgroundBitmap, 4);
            }
            Bitmap bitmap = this.mTextBackgroundBitmap;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.mTextShader = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void updateShaderMatrix() {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14 = 0.0f;
        if (Float.isNaN(this.mBackgroundPanX)) {
            f8 = 0.0f;
        } else {
            f8 = this.mBackgroundPanX;
        }
        if (Float.isNaN(this.mBackgroundPanY)) {
            f9 = 0.0f;
        } else {
            f9 = this.mBackgroundPanY;
        }
        if (Float.isNaN(this.mZoom)) {
            f10 = 1.0f;
        } else {
            f10 = this.mZoom;
        }
        if (!Float.isNaN(this.mRotate)) {
            f14 = this.mRotate;
        }
        this.mTextShaderMatrix.reset();
        float width = this.mTextBackgroundBitmap.getWidth();
        float height = this.mTextBackgroundBitmap.getHeight();
        if (Float.isNaN(this.mTextureWidth)) {
            f11 = this.mFloatWidth;
        } else {
            f11 = this.mTextureWidth;
        }
        if (Float.isNaN(this.mTextureHeight)) {
            f12 = this.mFloatHeight;
        } else {
            f12 = this.mTextureHeight;
        }
        if (width * f12 < height * f11) {
            f13 = f11 / width;
        } else {
            f13 = f12 / height;
        }
        float f15 = f10 * f13;
        this.mTextShaderMatrix.postScale(f15, f15);
        float f16 = width * f15;
        float f17 = f11 - f16;
        float f18 = f15 * height;
        float f19 = f12 - f18;
        if (!Float.isNaN(this.mTextureHeight)) {
            f19 = this.mTextureHeight / 2.0f;
        }
        if (!Float.isNaN(this.mTextureWidth)) {
            f17 = this.mTextureWidth / 2.0f;
        }
        this.mTextShaderMatrix.postTranslate((((f8 * f17) + f11) - f16) * 0.5f, (((f9 * f19) + f12) - f18) * 0.5f);
        this.mTextShaderMatrix.postRotate(f14, f11 / 2.0f, f12 / 2.0f);
        this.mTextShader.setLocalMatrix(this.mTextShaderMatrix);
    }

    Bitmap blur(Bitmap bitmap, int i8) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i9 = 0; i9 < i8 && width >= 32 && height >= 32; i9++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    void buildShape(float f8) {
        if (!this.mUseOutline && f8 == 1.0f) {
            return;
        }
        this.mPath.reset();
        String str = this.mText;
        int length = str.length();
        this.mPaint.getTextBounds(str, 0, length, this.mTextBounds);
        this.mPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.mPath);
        if (f8 != 1.0f) {
            Log.v(TAG, Debug.getLoc() + " scale " + f8);
            Matrix matrix = new Matrix();
            matrix.postScale(f8, f8);
            this.mPath.transform(matrix);
        }
        Rect rect = this.mTextBounds;
        rect.right--;
        rect.left++;
        rect.bottom++;
        rect.top--;
        RectF rectF = new RectF();
        rectF.bottom = getHeight();
        rectF.right = getWidth();
        this.mNotBuilt = false;
    }

    public float getRound() {
        return this.mRound;
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getScaleFromTextSize() {
        return this.mBaseTextSize;
    }

    public float getTextBackgroundPanX() {
        return this.mBackgroundPanX;
    }

    public float getTextBackgroundPanY() {
        return this.mBackgroundPanY;
    }

    public float getTextBackgroundRotate() {
        return this.mRotate;
    }

    public float getTextBackgroundZoom() {
        return this.mZoom;
    }

    public int getTextOutlineColor() {
        return this.mTextOutlineColor;
    }

    public float getTextPanX() {
        return this.mTextPanX;
    }

    public float getTextPanY() {
        return this.mTextPanY;
    }

    public float getTextureHeight() {
        return this.mTextureHeight;
    }

    public float getTextureWidth() {
        return this.mTextureWidth;
    }

    public Typeface getTypeface() {
        return this.mPaint.getTypeface();
    }

    @Override // android.view.View
    public void layout(int i8, int i9, int i10, int i11) {
        super.layout(i8, i9, i10, i11);
        boolean isNaN = Float.isNaN(this.mBaseTextSize);
        float f8 = isNaN ? 1.0f : this.mTextSize / this.mBaseTextSize;
        this.mFloatWidth = i10 - i8;
        this.mFloatHeight = i11 - i9;
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.paintTextSize = this.mTempPaint.getTextSize();
            }
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            int width = this.mTempRect.width();
            int height = (int) (this.mTempRect.height() * 1.3f);
            float f9 = (this.mFloatWidth - this.mPaddingRight) - this.mPaddingLeft;
            float f10 = (this.mFloatHeight - this.mPaddingBottom) - this.mPaddingTop;
            if (isNaN) {
                float f11 = width;
                float f12 = height;
                if (f11 * f10 > f12 * f9) {
                    this.mPaint.setTextSize((this.paintTextSize * f9) / f11);
                } else {
                    this.mPaint.setTextSize((this.paintTextSize * f10) / f12);
                }
            } else {
                float f13 = width;
                float f14 = height;
                f8 = f13 * f10 > f14 * f9 ? f9 / f13 : f10 / f14;
            }
        }
        if (this.mUseOutline || !isNaN) {
            adjustTexture(i8, i9, i10, i11);
            buildShape(f8);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f8;
        if (Float.isNaN(this.mBaseTextSize)) {
            f8 = 1.0f;
        } else {
            f8 = this.mTextSize / this.mBaseTextSize;
        }
        super.onDraw(canvas);
        if (!this.mUseOutline && f8 == 1.0f) {
            canvas.drawText(this.mText, this.mDeltaLeft + this.mPaddingLeft + getHorizontalOffset(), this.mPaddingTop + getVerticalOffset(), this.mPaint);
            return;
        }
        if (this.mNotBuilt) {
            buildShape(f8);
        }
        if (this.mOutlinePositionMatrix == null) {
            this.mOutlinePositionMatrix = new Matrix();
        }
        if (this.mUseOutline) {
            this.paintCache.set(this.mPaint);
            this.mOutlinePositionMatrix.reset();
            float horizontalOffset = this.mPaddingLeft + getHorizontalOffset();
            float verticalOffset = this.mPaddingTop + getVerticalOffset();
            this.mOutlinePositionMatrix.postTranslate(horizontalOffset, verticalOffset);
            this.mOutlinePositionMatrix.preScale(f8, f8);
            this.mPath.transform(this.mOutlinePositionMatrix);
            if (this.mTextShader != null) {
                this.mPaint.setFilterBitmap(true);
                this.mPaint.setShader(this.mTextShader);
            } else {
                this.mPaint.setColor(this.mTextFillColor);
            }
            this.mPaint.setStyle(Paint.Style.FILL);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            if (this.mTextShader != null) {
                this.mPaint.setShader(null);
            }
            this.mPaint.setColor(this.mTextOutlineColor);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
            canvas.drawPath(this.mPath, this.mPaint);
            this.mOutlinePositionMatrix.reset();
            this.mOutlinePositionMatrix.postTranslate(-horizontalOffset, -verticalOffset);
            this.mPath.transform(this.mOutlinePositionMatrix);
            this.mPaint.set(this.paintCache);
            return;
        }
        float horizontalOffset2 = this.mPaddingLeft + getHorizontalOffset();
        float verticalOffset2 = this.mPaddingTop + getVerticalOffset();
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.preTranslate(horizontalOffset2, verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        canvas.drawPath(this.mPath, this.mPaint);
        this.mOutlinePositionMatrix.reset();
        this.mOutlinePositionMatrix.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.mPath.transform(this.mOutlinePositionMatrix);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        this.mAutoSize = false;
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.mAutoSizeTextType != 0) {
                this.mAutoSize = true;
            }
        } else {
            TextPaint textPaint = this.mPaint;
            String str = this.mText;
            textPaint.getTextBounds(str, 0, str.length(), this.mTextBounds);
            if (mode != 1073741824) {
                size = (int) (this.mTextBounds.width() + 0.99999f);
            }
            size += this.mPaddingLeft + this.mPaddingRight;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.mPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.mPaddingTop + this.mPaddingBottom + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i8) {
        if ((i8 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 0) {
            i8 |= GravityCompat.START;
        }
        if ((i8 & 112) == 0) {
            i8 |= 48;
        }
        if (i8 != this.mGravity) {
            invalidate();
        }
        this.mGravity = i8;
        int i9 = i8 & 112;
        if (i9 != 48) {
            if (i9 != 80) {
                this.mTextPanY = 0.0f;
            } else {
                this.mTextPanY = 1.0f;
            }
        } else {
            this.mTextPanY = -1.0f;
        }
        int i10 = i8 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 8388611) {
                    if (i10 != 8388613) {
                        this.mTextPanX = 0.0f;
                        return;
                    }
                }
            }
            this.mTextPanX = 1.0f;
            return;
        }
        this.mTextPanX = -1.0f;
    }

    @RequiresApi(21)
    public void setRound(float f8) {
        boolean z8;
        if (Float.isNaN(f8)) {
            this.mRound = f8;
            float f9 = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f9);
            return;
        }
        if (this.mRound != f8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mRound = f8;
        if (f8 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.mRound);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mPath.reset();
            Path path = this.mPath;
            RectF rectF = this.mRect;
            float f10 = this.mRound;
            path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z8) {
            invalidateOutline();
        }
    }

    @RequiresApi(21)
    public void setRoundPercent(float f8) {
        boolean z8;
        if (this.mRoundPercent != f8) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mRoundPercent = f8;
        if (f8 != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionLabel.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), (Math.min(r3, r4) * MotionLabel.this.mRoundPercent) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z8) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f8) {
        this.mBaseTextSize = f8;
    }

    public void setText(CharSequence charSequence) {
        this.mText = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f8) {
        this.mBackgroundPanX = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundPanY(float f8) {
        this.mBackgroundPanY = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundRotate(float f8) {
        this.mRotate = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextBackgroundZoom(float f8) {
        this.mZoom = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextFillColor(int i8) {
        this.mTextFillColor = i8;
        invalidate();
    }

    public void setTextOutlineColor(int i8) {
        this.mTextOutlineColor = i8;
        this.mUseOutline = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f8) {
        this.mTextOutlineThickness = f8;
        this.mUseOutline = true;
        if (Float.isNaN(f8)) {
            this.mTextOutlineThickness = 1.0f;
            this.mUseOutline = false;
        }
        invalidate();
    }

    public void setTextPanX(float f8) {
        this.mTextPanX = f8;
        invalidate();
    }

    public void setTextPanY(float f8) {
        this.mTextPanY = f8;
        invalidate();
    }

    public void setTextSize(float f8) {
        float f9;
        this.mTextSize = f8;
        Log.v(TAG, Debug.getLoc() + "  " + f8 + " / " + this.mBaseTextSize);
        TextPaint textPaint = this.mPaint;
        if (!Float.isNaN(this.mBaseTextSize)) {
            f8 = this.mBaseTextSize;
        }
        textPaint.setTextSize(f8);
        if (Float.isNaN(this.mBaseTextSize)) {
            f9 = 1.0f;
        } else {
            f9 = this.mTextSize / this.mBaseTextSize;
        }
        buildShape(f9);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f8) {
        this.mTextureHeight = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTextureWidth(float f8) {
        this.mTextureWidth = f8;
        updateShaderMatrix();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.mPaint.getTypeface() != typeface) {
            this.mPaint.setTypeface(typeface);
            if (this.mLayout != null) {
                this.mLayout = null;
                requestLayout();
                invalidate();
            }
        }
    }

    void setupPath() {
        this.mPaddingLeft = getPaddingLeft();
        this.mPaddingRight = getPaddingRight();
        this.mPaddingTop = getPaddingTop();
        this.mPaddingBottom = getPaddingBottom();
        setTypefaceFromAttrs(this.mFontFamily, this.mTypefaceIndex, this.mStyleIndex);
        this.mPaint.setColor(this.mTextFillColor);
        this.mPaint.setStrokeWidth(this.mTextOutlineThickness);
        this.mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.mPaint.setFlags(128);
        setTextSize(this.mTextSize);
        this.mPaint.setAntiAlias(true);
    }

    @Override // androidx.constraintlayout.motion.widget.FloatLayout
    public void layout(float f8, float f9, float f10, float f11) {
        int i8 = (int) (f8 + 0.5f);
        this.mDeltaLeft = f8 - i8;
        int i9 = (int) (f10 + 0.5f);
        int i10 = i9 - i8;
        int i11 = (int) (f11 + 0.5f);
        int i12 = (int) (0.5f + f9);
        int i13 = i11 - i12;
        float f12 = f10 - f8;
        this.mFloatWidth = f12;
        float f13 = f11 - f9;
        this.mFloatHeight = f13;
        adjustTexture(f8, f9, f10, f11);
        if (getMeasuredHeight() == i13 && getMeasuredWidth() == i10) {
            super.layout(i8, i12, i9, i11);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
            super.layout(i8, i12, i9, i11);
        }
        if (this.mAutoSize) {
            if (this.mTempRect == null) {
                this.mTempPaint = new Paint();
                this.mTempRect = new Rect();
                this.mTempPaint.set(this.mPaint);
                this.paintTextSize = this.mTempPaint.getTextSize();
            }
            this.mFloatWidth = f12;
            this.mFloatHeight = f13;
            Paint paint = this.mTempPaint;
            String str = this.mText;
            paint.getTextBounds(str, 0, str.length(), this.mTempRect);
            float height = this.mTempRect.height() * 1.3f;
            float f14 = (f12 - this.mPaddingRight) - this.mPaddingLeft;
            float f15 = (f13 - this.mPaddingBottom) - this.mPaddingTop;
            float width = this.mTempRect.width();
            if (width * f15 > height * f14) {
                this.mPaint.setTextSize((this.paintTextSize * f14) / width);
            } else {
                this.mPaint.setTextSize((this.paintTextSize * f15) / height);
            }
            if (this.mUseOutline || !Float.isNaN(this.mBaseTextSize)) {
                buildShape(Float.isNaN(this.mBaseTextSize) ? 1.0f : this.mTextSize / this.mBaseTextSize);
            }
        }
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.paintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }

    public MotionLabel(Context context, @Nullable AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mPaint = new TextPaint();
        this.mPath = new Path();
        this.mTextFillColor = 65535;
        this.mTextOutlineColor = 65535;
        this.mUseOutline = false;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mTextSize = 48.0f;
        this.mBaseTextSize = Float.NaN;
        this.mTextOutlineThickness = 0.0f;
        this.mText = "Hello World";
        this.mNotBuilt = true;
        this.mTextBounds = new Rect();
        this.mPaddingLeft = 1;
        this.mPaddingRight = 1;
        this.mPaddingTop = 1;
        this.mPaddingBottom = 1;
        this.mGravity = 8388659;
        this.mAutoSizeTextType = 0;
        this.mAutoSize = false;
        this.mTextureHeight = Float.NaN;
        this.mTextureWidth = Float.NaN;
        this.mTextPanX = 0.0f;
        this.mTextPanY = 0.0f;
        this.paintCache = new Paint();
        this.mTextureEffect = 0;
        this.mBackgroundPanX = Float.NaN;
        this.mBackgroundPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attributeSet);
    }
}
