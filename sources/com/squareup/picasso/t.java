package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class t extends BitmapDrawable {

    /* renamed from: h, reason: collision with root package name */
    private static final Paint f24593h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24594a;

    /* renamed from: b, reason: collision with root package name */
    private final float f24595b;

    /* renamed from: c, reason: collision with root package name */
    private final s.e f24596c;

    /* renamed from: d, reason: collision with root package name */
    Drawable f24597d;

    /* renamed from: e, reason: collision with root package name */
    long f24598e;

    /* renamed from: f, reason: collision with root package name */
    boolean f24599f;

    /* renamed from: g, reason: collision with root package name */
    int f24600g;

    t(Context context, Bitmap bitmap, Drawable drawable, s.e eVar, boolean z8, boolean z9) {
        super(context.getResources(), bitmap);
        this.f24600g = 255;
        this.f24594a = z9;
        this.f24595b = context.getResources().getDisplayMetrics().density;
        this.f24596c = eVar;
        if (eVar != s.e.MEMORY && !z8) {
            this.f24597d = drawable;
            this.f24599f = true;
            this.f24598e = SystemClock.uptimeMillis();
        }
    }

    private void a(Canvas canvas) {
        Paint paint = f24593h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f24595b * 16.0f)), paint);
        paint.setColor(this.f24596c.f24587a);
        canvas.drawPath(b(0, 0, (int) (this.f24595b * 15.0f)), paint);
    }

    private static Path b(int i8, int i9, int i10) {
        Path path = new Path();
        float f8 = i8;
        float f9 = i9;
        path.moveTo(f8, f9);
        path.lineTo(i8 + i10, f9);
        path.lineTo(f8, i9 + i10);
        return path;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ImageView imageView, Context context, Bitmap bitmap, s.e eVar, boolean z8, boolean z9) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new t(context, bitmap, drawable, eVar, z8, z9));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (!this.f24599f) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f24598e)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f24599f = false;
                this.f24597d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f24597d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f24600g * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f24600g);
            }
        }
        if (this.f24594a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24597d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f24600g = i8;
        Drawable drawable = this.f24597d;
        if (drawable != null) {
            drawable.setAlpha(i8);
        }
        super.setAlpha(i8);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f24597d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
