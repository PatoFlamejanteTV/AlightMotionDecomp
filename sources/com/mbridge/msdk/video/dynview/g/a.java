package com.mbridge.msdk.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes4.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f23289a;

    /* renamed from: b, reason: collision with root package name */
    private float f23290b;

    /* renamed from: c, reason: collision with root package name */
    private float f23291c;

    /* renamed from: d, reason: collision with root package name */
    private int f23292d;

    /* renamed from: e, reason: collision with root package name */
    private int f23293e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f23294f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f23295g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f23296h;

    /* renamed from: i, reason: collision with root package name */
    private Paint f23297i;

    /* renamed from: j, reason: collision with root package name */
    private Matrix f23298j;

    /* renamed from: com.mbridge.msdk.video.dynview.g.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0432a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f23299a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f23300b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f23301c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f23302d;

        /* renamed from: e, reason: collision with root package name */
        private int f23303e;

        /* renamed from: f, reason: collision with root package name */
        private int f23304f;

        /* renamed from: g, reason: collision with root package name */
        private int f23305g;

        /* renamed from: h, reason: collision with root package name */
        private float f23306h;

        /* renamed from: i, reason: collision with root package name */
        private float f23307i;

        private C0432a() {
            this.f23304f = 100;
            this.f23305g = 10;
            this.f23299a = new RectShape();
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f23300b = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f23301c = bitmap;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b a(boolean z8) {
            this.f23302d = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.g.a.b
        public final b b(float f8) {
            this.f23307i = f8;
            return this;
        }

        public final b a(int i8) {
            this.f23303e = i8;
            return this;
        }

        public final b a(float f8) {
            this.f23306h = f8;
            return this;
        }

        public final a a() {
            return new a(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(Bitmap bitmap);

        b a(boolean z8);

        b b(float f8);

        b b(Bitmap bitmap);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || path == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            float max = Math.max(this.f23290b / bitmap.getWidth(), this.f23291c / bitmap.getHeight());
            if (this.f23298j == null) {
                this.f23298j = new Matrix();
            }
            this.f23298j.reset();
            this.f23298j.preScale(max, max);
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(this.f23298j);
        this.f23297i.setShader(bitmapShader);
        canvas.drawPath(path, this.f23297i);
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f23289a == 1) {
            float f8 = this.f23291c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f23292d + f8) - this.f23293e);
            path.lineTo(this.f23290b, (f8 - this.f23292d) - this.f23293e);
            path.lineTo(this.f23290b, 0.0f);
            if (this.f23296h) {
                try {
                    a(canvas, path);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f23294f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f23294f);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f23292d + f8 + this.f23293e);
            path2.lineTo(0.0f, this.f23291c);
            path2.lineTo(this.f23290b, this.f23291c);
            path2.lineTo(this.f23290b, (f8 - this.f23292d) + this.f23293e);
            if (this.f23296h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f23295g;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                try {
                    a(canvas, path2, this.f23295g);
                    return;
                } catch (Exception e11) {
                    e11.printStackTrace();
                    return;
                }
            }
            return;
        }
        float f9 = this.f23290b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f23291c);
        path3.lineTo((f9 - this.f23292d) - this.f23293e, this.f23291c);
        path3.lineTo((this.f23292d + f9) - this.f23293e, 0.0f);
        if (this.f23296h) {
            try {
                a(canvas, path3);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f23294f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f23294f);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f23292d + f9 + this.f23293e, 0.0f);
        path4.lineTo(this.f23290b, 0.0f);
        path4.lineTo(this.f23290b, this.f23291c);
        path4.lineTo((f9 - this.f23292d) + this.f23293e, this.f23291c);
        if (this.f23296h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f23295g;
        if (bitmap4 != null && !bitmap4.isRecycled()) {
            try {
                a(canvas, path4, this.f23295g);
            } catch (Exception e15) {
                e15.printStackTrace();
            }
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0432a c0432a) {
        super(c0432a.f23299a);
        this.f23296h = false;
        this.f23294f = c0432a.f23300b;
        this.f23295g = c0432a.f23301c;
        this.f23296h = c0432a.f23302d;
        this.f23289a = c0432a.f23303e;
        this.f23292d = c0432a.f23304f;
        this.f23293e = c0432a.f23305g;
        this.f23290b = c0432a.f23306h;
        this.f23291c = c0432a.f23307i;
        Paint paint = new Paint();
        this.f23297i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f23297i.setAntiAlias(true);
        this.f23298j = new Matrix();
    }

    private void a(Canvas canvas, Path path) {
        this.f23297i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.f23297i);
    }

    public static C0432a a() {
        return new C0432a();
    }
}
