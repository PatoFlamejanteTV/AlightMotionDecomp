package androidx.leanback.graphics;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public final class ColorOverlayDimmer {
    private final float mActiveLevel;
    private int mAlpha;
    private float mAlphaFloat;
    private final float mDimmedLevel;
    private final Paint mPaint;

    private ColorOverlayDimmer(int i8, float f8, float f9) {
        f8 = f8 > 1.0f ? 1.0f : f8;
        f8 = f8 < 0.0f ? 0.0f : f8;
        f9 = f9 > 1.0f ? 1.0f : f9;
        float f10 = f9 >= 0.0f ? f9 : 0.0f;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(Color.rgb(Color.red(i8), Color.green(i8), Color.blue(i8)));
        this.mActiveLevel = f8;
        this.mDimmedLevel = f10;
        setActiveLevel(1.0f);
    }

    public static ColorOverlayDimmer createColorOverlayDimmer(int i8, float f8, float f9) {
        return new ColorOverlayDimmer(i8, f8, f9);
    }

    public static ColorOverlayDimmer createDefault(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.styleable.LeanbackTheme);
        int color = obtainStyledAttributes.getColor(R.styleable.LeanbackTheme_overlayDimMaskColor, context.getResources().getColor(R.color.lb_view_dim_mask_color));
        float fraction = obtainStyledAttributes.getFraction(R.styleable.LeanbackTheme_overlayDimActiveLevel, 1, 1, context.getResources().getFraction(R.fraction.lb_view_active_level, 1, 0));
        float fraction2 = obtainStyledAttributes.getFraction(R.styleable.LeanbackTheme_overlayDimDimmedLevel, 1, 1, context.getResources().getFraction(R.fraction.lb_view_dimmed_level, 1, 1));
        obtainStyledAttributes.recycle();
        return new ColorOverlayDimmer(color, fraction, fraction2);
    }

    public int applyToColor(int i8) {
        float f8 = 1.0f - this.mAlphaFloat;
        return Color.argb(Color.alpha(i8), (int) (Color.red(i8) * f8), (int) (Color.green(i8) * f8), (int) (Color.blue(i8) * f8));
    }

    public void drawColorOverlay(Canvas canvas, View view, boolean z8) {
        canvas.save();
        float left = view.getLeft() + view.getTranslationX();
        float top = view.getTop() + view.getTranslationY();
        canvas.translate(left, top);
        canvas.concat(view.getMatrix());
        canvas.translate(-left, -top);
        if (z8) {
            canvas.drawRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), this.mPaint);
        } else {
            canvas.drawRect(view.getLeft() + view.getPaddingLeft(), view.getTop() + view.getPaddingTop(), view.getRight() - view.getPaddingRight(), view.getBottom() - view.getPaddingBottom(), this.mPaint);
        }
        canvas.restore();
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public float getAlphaFloat() {
        return this.mAlphaFloat;
    }

    public Paint getPaint() {
        return this.mPaint;
    }

    public boolean needsDraw() {
        if (this.mAlpha != 0) {
            return true;
        }
        return false;
    }

    public void setActiveLevel(float f8) {
        float f9 = this.mDimmedLevel;
        float f10 = f9 + (f8 * (this.mActiveLevel - f9));
        this.mAlphaFloat = f10;
        int i8 = (int) (f10 * 255.0f);
        this.mAlpha = i8;
        this.mPaint.setAlpha(i8);
    }
}
