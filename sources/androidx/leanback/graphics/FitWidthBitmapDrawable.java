package androidx.leanback.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.IntProperty;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class FitWidthBitmapDrawable extends Drawable {
    public static final Property<FitWidthBitmapDrawable, Integer> PROPERTY_VERTICAL_OFFSET;
    BitmapState mBitmapState;
    final Rect mDest;
    boolean mMutated;

    static {
        if (Build.VERSION.SDK_INT >= 24) {
            PROPERTY_VERTICAL_OFFSET = getVerticalOffsetIntProperty();
        } else {
            PROPERTY_VERTICAL_OFFSET = new Property<FitWidthBitmapDrawable, Integer>(Integer.class, "verticalOffset") { // from class: androidx.leanback.graphics.FitWidthBitmapDrawable.1
                @Override // android.util.Property
                public Integer get(FitWidthBitmapDrawable fitWidthBitmapDrawable) {
                    return Integer.valueOf(fitWidthBitmapDrawable.getVerticalOffset());
                }

                @Override // android.util.Property
                public void set(FitWidthBitmapDrawable fitWidthBitmapDrawable, Integer num) {
                    fitWidthBitmapDrawable.setVerticalOffset(num.intValue());
                }
            };
        }
    }

    public FitWidthBitmapDrawable() {
        this.mDest = new Rect();
        this.mMutated = false;
        this.mBitmapState = new BitmapState();
    }

    @RequiresApi(24)
    static IntProperty<FitWidthBitmapDrawable> getVerticalOffsetIntProperty() {
        return new IntProperty<FitWidthBitmapDrawable>("verticalOffset") { // from class: androidx.leanback.graphics.FitWidthBitmapDrawable.2
            @Override // android.util.Property
            public Integer get(FitWidthBitmapDrawable fitWidthBitmapDrawable) {
                return Integer.valueOf(fitWidthBitmapDrawable.getVerticalOffset());
            }

            @Override // android.util.IntProperty
            public void setValue(FitWidthBitmapDrawable fitWidthBitmapDrawable, int i8) {
                fitWidthBitmapDrawable.setVerticalOffset(i8);
            }
        };
    }

    private Rect validateSource() {
        BitmapState bitmapState = this.mBitmapState;
        Rect rect = bitmapState.mSource;
        if (rect == null) {
            return bitmapState.mDefaultSource;
        }
        return rect;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mBitmapState.mBitmap != null) {
            Rect bounds = getBounds();
            Rect rect = this.mDest;
            rect.left = 0;
            rect.top = this.mBitmapState.mOffset;
            rect.right = bounds.width();
            Rect validateSource = validateSource();
            Rect rect2 = this.mDest;
            rect2.bottom = rect2.top + ((int) (validateSource.height() * (bounds.width() / validateSource.width())));
            int save = canvas.save();
            canvas.clipRect(bounds);
            BitmapState bitmapState = this.mBitmapState;
            canvas.drawBitmap(bitmapState.mBitmap, validateSource, this.mDest, bitmapState.mPaint);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mBitmapState.mPaint.getAlpha();
    }

    public Bitmap getBitmap() {
        return this.mBitmapState.mBitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.mBitmapState;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.mBitmapState.mBitmap;
        if (bitmap != null && !bitmap.hasAlpha() && this.mBitmapState.mPaint.getAlpha() >= 255) {
            return -1;
        }
        return -3;
    }

    public Rect getSource() {
        return this.mBitmapState.mSource;
    }

    public int getVerticalOffset() {
        return this.mBitmapState.mOffset;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mBitmapState = new BitmapState(this.mBitmapState);
            this.mMutated = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        if (i8 != this.mBitmapState.mPaint.getAlpha()) {
            this.mBitmapState.mPaint.setAlpha(i8);
            invalidateSelf();
        }
    }

    public void setBitmap(Bitmap bitmap) {
        BitmapState bitmapState = this.mBitmapState;
        bitmapState.mBitmap = bitmap;
        if (bitmap != null) {
            bitmapState.mDefaultSource.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        } else {
            bitmapState.mDefaultSource.set(0, 0, 0, 0);
        }
        this.mBitmapState.mSource = null;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.mBitmapState.mPaint.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setSource(Rect rect) {
        this.mBitmapState.mSource = rect;
    }

    public void setVerticalOffset(int i8) {
        this.mBitmapState.mOffset = i8;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class BitmapState extends Drawable.ConstantState {
        Bitmap mBitmap;
        final Rect mDefaultSource;
        int mOffset;
        Paint mPaint;
        Rect mSource;

        BitmapState() {
            this.mDefaultSource = new Rect();
            this.mPaint = new Paint();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new FitWidthBitmapDrawable(this);
        }

        BitmapState(BitmapState bitmapState) {
            Rect rect = new Rect();
            this.mDefaultSource = rect;
            this.mBitmap = bitmapState.mBitmap;
            this.mPaint = new Paint(bitmapState.mPaint);
            this.mSource = bitmapState.mSource != null ? new Rect(bitmapState.mSource) : null;
            rect.set(bitmapState.mDefaultSource);
            this.mOffset = bitmapState.mOffset;
        }
    }

    FitWidthBitmapDrawable(BitmapState bitmapState) {
        this.mDest = new Rect();
        this.mMutated = false;
        this.mBitmapState = bitmapState;
    }
}
