package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.MBImageView;

/* loaded from: classes4.dex */
public class RoundImageView extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f24391a;

    /* renamed from: b, reason: collision with root package name */
    private int f24392b;

    /* renamed from: c, reason: collision with root package name */
    private Paint f24393c;

    /* renamed from: d, reason: collision with root package name */
    private int f24394d;

    /* renamed from: e, reason: collision with root package name */
    private Matrix f24395e;

    /* renamed from: f, reason: collision with root package name */
    private BitmapShader f24396f;

    /* renamed from: g, reason: collision with root package name */
    private int f24397g;

    /* renamed from: h, reason: collision with root package name */
    private RectF f24398h;

    public RoundImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24395e = new Matrix();
        Paint paint = new Paint();
        this.f24393c = paint;
        paint.setAntiAlias(true);
        this.f24392b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f24391a = 1;
    }

    private Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            ad.b("View", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.widget.MBImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap a9;
        try {
            if (getDrawable() == null) {
                return;
            }
            try {
                Drawable drawable = getDrawable();
                if (drawable != null && (a9 = a(drawable)) != null && !a9.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    this.f24396f = new BitmapShader(a9, tileMode, tileMode);
                    int i8 = this.f24391a;
                    float f8 = 1.0f;
                    if (i8 == 0) {
                        f8 = (this.f24397g * 1.0f) / Math.min(a9.getWidth(), a9.getHeight());
                    } else if (i8 == 1) {
                        f8 = Math.max((getWidth() * 1.0f) / a9.getWidth(), (getHeight() * 1.0f) / a9.getHeight());
                    }
                    this.f24395e.setScale(f8, f8);
                    this.f24396f.setLocalMatrix(this.f24395e);
                    this.f24393c.setShader(this.f24396f);
                }
            } catch (Throwable th) {
                ad.b("RoundImageView", th.getMessage());
            }
            if (this.f24391a == 1) {
                RectF rectF = this.f24398h;
                int i9 = this.f24392b;
                canvas.drawRoundRect(rectF, i9, i9, this.f24393c);
            } else {
                int i10 = this.f24394d;
                canvas.drawCircle(i10, i10, i10, this.f24393c);
            }
        } catch (Throwable th2) {
            ad.b("RoundImageView", th2.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f24391a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.f24397g = min;
            this.f24394d = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("state_instance"));
            this.f24391a = bundle.getInt("state_type");
            this.f24392b = bundle.getInt("state_border_radius");
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("state_instance", super.onSaveInstanceState());
        bundle.putInt("state_type", this.f24391a);
        bundle.putInt("state_border_radius", this.f24392b);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        if (this.f24391a == 1) {
            this.f24398h = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i8) {
        int a9 = ai.a(getContext(), i8);
        if (this.f24392b != a9) {
            this.f24392b = a9;
            invalidate();
        }
    }

    public void setType(int i8) {
        if (this.f24391a != i8) {
            this.f24391a = i8;
            if (i8 != 1 && i8 != 0) {
                this.f24391a = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24395e = new Matrix();
        Paint paint = new Paint();
        this.f24393c = paint;
        paint.setAntiAlias(true);
        this.f24392b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f24391a = 1;
    }

    public RoundImageView(Context context) {
        super(context);
        this.f24395e = new Matrix();
        Paint paint = new Paint();
        this.f24393c = paint;
        paint.setAntiAlias(true);
        this.f24392b = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.f24391a = 1;
    }
}
