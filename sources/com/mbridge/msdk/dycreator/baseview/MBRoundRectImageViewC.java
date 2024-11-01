package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class MBRoundRectImageViewC extends MBImageView {

    /* renamed from: a, reason: collision with root package name */
    private Paint f19608a;

    public MBRoundRectImageViewC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19608a = new Paint();
    }

    private Bitmap a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                int width = getWidth();
                float height = getHeight() / bitmap.getHeight();
                Matrix matrix = new Matrix();
                matrix.postScale(width / bitmap.getWidth(), height);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e8) {
                ad.b("MBRoundRectImageViewC", e8.getMessage());
            }
        }
        return bitmap;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            Drawable drawable = getDrawable();
            if (drawable == null) {
                super.onDraw(canvas);
                return;
            }
            Bitmap a9 = a(((BitmapDrawable) drawable).getBitmap());
            if (a9 != null && !a9.isRecycled()) {
                Bitmap a10 = a(a9, 30);
                if (a10 != null && !a10.isRecycled()) {
                    Rect rect = new Rect(0, 0, a10.getWidth(), a10.getHeight());
                    this.f19608a.reset();
                    canvas.drawBitmap(a10, rect, rect, this.f19608a);
                    return;
                }
                super.onDraw(canvas);
                return;
            }
            super.onDraw(canvas);
        } catch (Exception e8) {
            ad.b("MBRoundRectImageViewC", e8.getMessage());
        }
    }

    private Bitmap a(Bitmap bitmap, int i8) {
        if (bitmap != null && !bitmap.isRecycled()) {
            try {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                float f8 = i8;
                canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), f8, f8, paint);
                return createBitmap;
            } catch (Exception e8) {
                ad.b("MBRoundRectImageViewC", e8.getMessage());
            }
        }
        return bitmap;
    }
}
