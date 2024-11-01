package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import androidx.core.view.ViewCompat;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public class HorizontalGridView extends BaseGridView {
    private boolean mFadingHighEdge;
    private boolean mFadingLowEdge;
    private LinearGradient mHighFadeShader;
    private int mHighFadeShaderLength;
    private int mHighFadeShaderOffset;
    private LinearGradient mLowFadeShader;
    private int mLowFadeShaderLength;
    private int mLowFadeShaderOffset;
    private Bitmap mTempBitmapHigh;
    private Bitmap mTempBitmapLow;
    private Paint mTempPaint;
    private Rect mTempRect;

    public HorizontalGridView(Context context) {
        this(context, null);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.mTempBitmapHigh;
        if (bitmap == null || bitmap.getWidth() != this.mHighFadeShaderLength || this.mTempBitmapHigh.getHeight() != getHeight()) {
            this.mTempBitmapHigh = Bitmap.createBitmap(this.mHighFadeShaderLength, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.mTempBitmapHigh;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.mTempBitmapLow;
        if (bitmap == null || bitmap.getWidth() != this.mLowFadeShaderLength || this.mTempBitmapLow.getHeight() != getHeight()) {
            this.mTempBitmapLow = Bitmap.createBitmap(this.mLowFadeShaderLength, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.mTempBitmapLow;
    }

    private boolean needsFadingHighEdge() {
        if (!this.mFadingHighEdge) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.mLayoutManager.getOpticalRight(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.mHighFadeShaderOffset) {
                return true;
            }
        }
        return false;
    }

    private boolean needsFadingLowEdge() {
        if (!this.mFadingLowEdge) {
            return false;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (this.mLayoutManager.getOpticalLeft(getChildAt(i8)) < getPaddingLeft() - this.mLowFadeShaderOffset) {
                return true;
            }
        }
        return false;
    }

    private void updateLayerType() {
        if (!this.mFadingLowEdge && !this.mFadingHighEdge) {
            setLayerType(0, null);
            setWillNotDraw(true);
        } else {
            setLayerType(2, null);
            setWillNotDraw(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        int i8;
        int width;
        int i9;
        int i10;
        boolean needsFadingLowEdge = needsFadingLowEdge();
        boolean needsFadingHighEdge = needsFadingHighEdge();
        if (!needsFadingLowEdge) {
            this.mTempBitmapLow = null;
        }
        if (!needsFadingHighEdge) {
            this.mTempBitmapHigh = null;
        }
        if (!needsFadingLowEdge && !needsFadingHighEdge) {
            super.draw(canvas);
            return;
        }
        if (this.mFadingLowEdge) {
            i8 = (getPaddingLeft() - this.mLowFadeShaderOffset) - this.mLowFadeShaderLength;
        } else {
            i8 = 0;
        }
        if (this.mFadingHighEdge) {
            width = (getWidth() - getPaddingRight()) + this.mHighFadeShaderOffset + this.mHighFadeShaderLength;
        } else {
            width = getWidth();
        }
        int save = canvas.save();
        if (this.mFadingLowEdge) {
            i9 = this.mLowFadeShaderLength;
        } else {
            i9 = 0;
        }
        int i11 = i9 + i8;
        if (this.mFadingHighEdge) {
            i10 = this.mHighFadeShaderLength;
        } else {
            i10 = 0;
        }
        canvas.clipRect(i11, 0, width - i10, getHeight());
        super.draw(canvas);
        canvas.restoreToCount(save);
        Canvas canvas2 = new Canvas();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = getHeight();
        if (needsFadingLowEdge && this.mLowFadeShaderLength > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int save2 = canvas2.save();
            canvas2.clipRect(0, 0, this.mLowFadeShaderLength, getHeight());
            float f8 = -i8;
            canvas2.translate(f8, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save2);
            this.mTempPaint.setShader(this.mLowFadeShader);
            canvas2.drawRect(0.0f, 0.0f, this.mLowFadeShaderLength, getHeight(), this.mTempPaint);
            Rect rect2 = this.mTempRect;
            rect2.left = 0;
            rect2.right = this.mLowFadeShaderLength;
            canvas.translate(i8, 0.0f);
            Rect rect3 = this.mTempRect;
            canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
            canvas.translate(f8, 0.0f);
        }
        if (needsFadingHighEdge && this.mHighFadeShaderLength > 0) {
            Bitmap tempBitmapHigh = getTempBitmapHigh();
            tempBitmapHigh.eraseColor(0);
            canvas2.setBitmap(tempBitmapHigh);
            int save3 = canvas2.save();
            canvas2.clipRect(0, 0, this.mHighFadeShaderLength, getHeight());
            canvas2.translate(-(width - this.mHighFadeShaderLength), 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(save3);
            this.mTempPaint.setShader(this.mHighFadeShader);
            canvas2.drawRect(0.0f, 0.0f, this.mHighFadeShaderLength, getHeight(), this.mTempPaint);
            Rect rect4 = this.mTempRect;
            rect4.left = 0;
            rect4.right = this.mHighFadeShaderLength;
            canvas.translate(width - r5, 0.0f);
            Rect rect5 = this.mTempRect;
            canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
            canvas.translate(-(width - this.mHighFadeShaderLength), 0.0f);
        }
    }

    public final boolean getFadingLeftEdge() {
        return this.mFadingLowEdge;
    }

    public final int getFadingLeftEdgeLength() {
        return this.mLowFadeShaderLength;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.mLowFadeShaderOffset;
    }

    public final boolean getFadingRightEdge() {
        return this.mFadingHighEdge;
    }

    public final int getFadingRightEdgeLength() {
        return this.mHighFadeShaderLength;
    }

    public final int getFadingRightEdgeOffset() {
        return this.mHighFadeShaderOffset;
    }

    protected void initAttributes(Context context, AttributeSet attributeSet) {
        initBaseGridViewAttributes(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbHorizontalGridView);
        setRowHeight(obtainStyledAttributes);
        setNumRows(obtainStyledAttributes.getInt(R.styleable.lbHorizontalGridView_numberOfRows, 1));
        obtainStyledAttributes.recycle();
        updateLayerType();
        Paint paint = new Paint();
        this.mTempPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final void setFadingLeftEdge(boolean z8) {
        if (this.mFadingLowEdge != z8) {
            this.mFadingLowEdge = z8;
            if (!z8) {
                this.mTempBitmapLow = null;
            }
            invalidate();
            updateLayerType();
        }
    }

    public final void setFadingLeftEdgeLength(int i8) {
        if (this.mLowFadeShaderLength != i8) {
            this.mLowFadeShaderLength = i8;
            if (i8 != 0) {
                this.mLowFadeShader = new LinearGradient(0.0f, 0.0f, this.mLowFadeShaderLength, 0.0f, 0, ViewCompat.MEASURED_STATE_MASK, Shader.TileMode.CLAMP);
            } else {
                this.mLowFadeShader = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i8) {
        if (this.mLowFadeShaderOffset != i8) {
            this.mLowFadeShaderOffset = i8;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z8) {
        if (this.mFadingHighEdge != z8) {
            this.mFadingHighEdge = z8;
            if (!z8) {
                this.mTempBitmapHigh = null;
            }
            invalidate();
            updateLayerType();
        }
    }

    public final void setFadingRightEdgeLength(int i8) {
        if (this.mHighFadeShaderLength != i8) {
            this.mHighFadeShaderLength = i8;
            if (i8 != 0) {
                this.mHighFadeShader = new LinearGradient(0.0f, 0.0f, this.mHighFadeShaderLength, 0.0f, ViewCompat.MEASURED_STATE_MASK, 0, Shader.TileMode.CLAMP);
            } else {
                this.mHighFadeShader = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i8) {
        if (this.mHighFadeShaderOffset != i8) {
            this.mHighFadeShaderOffset = i8;
            invalidate();
        }
    }

    public void setNumRows(int i8) {
        this.mLayoutManager.setNumRows(i8);
        requestLayout();
    }

    void setRowHeight(TypedArray typedArray) {
        int i8 = R.styleable.lbHorizontalGridView_rowHeight;
        if (typedArray.peekValue(i8) != null) {
            setRowHeight(typedArray.getLayoutDimension(i8, 0));
        }
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mTempPaint = new Paint();
        this.mTempRect = new Rect();
        this.mLayoutManager.setOrientation(0);
        initAttributes(context, attributeSet);
    }

    public void setRowHeight(int i8) {
        this.mLayoutManager.setRowHeight(i8);
        requestLayout();
    }
}
