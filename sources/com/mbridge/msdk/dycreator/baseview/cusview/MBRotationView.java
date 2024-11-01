package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class MBRotationView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    Runnable f19680a;

    /* renamed from: b, reason: collision with root package name */
    private Camera f19681b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f19682c;

    /* renamed from: d, reason: collision with root package name */
    private int f19683d;

    /* renamed from: e, reason: collision with root package name */
    private int f19684e;

    /* renamed from: f, reason: collision with root package name */
    private int f19685f;

    /* renamed from: g, reason: collision with root package name */
    private int f19686g;

    /* renamed from: h, reason: collision with root package name */
    private int f19687h;

    /* renamed from: i, reason: collision with root package name */
    private int f19688i;

    /* renamed from: j, reason: collision with root package name */
    private int f19689j;

    /* renamed from: k, reason: collision with root package name */
    private int f19690k;

    /* renamed from: l, reason: collision with root package name */
    private float f19691l;

    /* renamed from: m, reason: collision with root package name */
    private float f19692m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19693n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19694o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19695p;

    public MBRotationView(Context context) {
        super(context);
        this.f19685f = 40;
        this.f19686g = 20;
        this.f19687h = 0;
        this.f19688i = 0;
        this.f19690k = 0;
        this.f19691l = 0.5f;
        this.f19692m = 0.9f;
        this.f19693n = true;
        this.f19694o = false;
        this.f19695p = false;
        this.f19680a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void a() {
        this.f19681b = new Camera();
        this.f19682c = new Matrix();
        setWillNotDraw(false);
    }

    private void b(int i8, int i9, int i10) {
        if (i10 == 0) {
            float f8 = (-i8) / 2;
            this.f19681b.translate(f8, 0.0f, 0.0f);
            float f9 = -i9;
            this.f19681b.rotateY(f9);
            this.f19681b.translate(f8, 0.0f, 0.0f);
            this.f19681b.translate(f8, 0.0f, 0.0f);
            this.f19681b.rotateY(f9);
            this.f19681b.translate(f8, 0.0f, 0.0f);
            return;
        }
        if (i10 == 1) {
            float f10 = i8 / 2;
            this.f19681b.translate(f10, 0.0f, 0.0f);
            this.f19681b.rotateY(i9);
            this.f19681b.translate(f10, 0.0f, 0.0f);
            return;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f19681b.rotateY(0.0f);
        } else {
            float f11 = (-i8) / 2;
            this.f19681b.translate(f11, 0.0f, 0.0f);
            this.f19681b.rotateY(-i9);
            this.f19681b.translate(f11, 0.0f, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (getChildCount() == 0) {
            return;
        }
        if (this.f19694o) {
            int height = getHeight() / 2;
            int i8 = ((this.f19687h * this.f19683d) / 2) / this.f19685f;
            a(canvas, i8, height, 0);
            a(canvas, i8, height, 1);
            if (Math.abs(this.f19687h) > this.f19685f / 2) {
                a(canvas, i8, height, 3);
                a(canvas, i8, height, 2);
                return;
            } else {
                a(canvas, i8, height, 2);
                a(canvas, i8, height, 3);
                return;
            }
        }
        int width = getWidth() / 2;
        int i9 = ((this.f19687h * this.f19684e) / 2) / this.f19685f;
        b(canvas, i9, width, 0);
        b(canvas, i9, width, 1);
        if (Math.abs(this.f19687h) > this.f19685f / 2) {
            b(canvas, i9, width, 3);
            b(canvas, i9, width, 2);
        } else {
            b(canvas, i9, width, 2);
            b(canvas, i9, width, 3);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int i12 = i10 - i8;
        float f8 = i12;
        float f9 = this.f19691l;
        int i13 = (int) (((1.0f - f9) * f8) / 2.0f);
        int i14 = i11 - i9;
        float f10 = i14;
        float f11 = this.f19692m;
        int i15 = (int) (((1.0f - f11) * f10) / 2.0f);
        this.f19683d = (int) (f10 * f11);
        this.f19684e = (int) (f8 * f9);
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            childAt.layout(i13, i15, i12 - i13, i14 - i15);
            childAt.setClickable(true);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = this.f19684e;
            if (i17 != i18) {
                layoutParams.width = i18;
                layoutParams.height = this.f19683d;
                childAt.setLayoutParams(layoutParams);
            }
        }
    }

    public void setAutoscroll(boolean z8) {
        if (z8) {
            postDelayed(this.f19680a, 1000 / this.f19686g);
        }
        this.f19693n = z8;
    }

    public void setHeightRatio(float f8) {
        this.f19692m = f8;
    }

    public void setRotateV(boolean z8) {
        this.f19694o = z8;
        invalidate();
    }

    public void setWidthRatio(float f8) {
        this.f19691l = f8;
    }

    private void a(int i8, int i9, int i10) {
        float f8 = (-i8) / 2.0f;
        if (i10 == 0) {
            this.f19681b.translate(0.0f, f8, 0.0f);
            float f9 = -i9;
            this.f19681b.rotateX(f9);
            this.f19681b.translate(0.0f, f8, 0.0f);
            this.f19681b.translate(0.0f, f8, 0.0f);
            this.f19681b.rotateX(f9);
            this.f19681b.translate(0.0f, f8, 0.0f);
            return;
        }
        if (i10 == 1) {
            this.f19681b.translate(0.0f, f8, 0.0f);
            this.f19681b.rotateX(i9);
            this.f19681b.translate(0.0f, f8, 0.0f);
        } else if (i10 != 2) {
            if (i10 != 3) {
                return;
            }
            this.f19681b.rotateX(0.0f);
        } else {
            this.f19681b.translate(0.0f, f8, 0.0f);
            this.f19681b.rotateX(-i9);
            this.f19681b.translate(0.0f, f8, 0.0f);
        }
    }

    public MBRotationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19685f = 40;
        this.f19686g = 20;
        this.f19687h = 0;
        this.f19688i = 0;
        this.f19690k = 0;
        this.f19691l = 0.5f;
        this.f19692m = 0.9f;
        this.f19693n = true;
        this.f19694o = false;
        this.f19695p = false;
        this.f19680a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private void b(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f19681b.save();
        this.f19682c.reset();
        float f8 = i8;
        this.f19681b.translate(f8, 0.0f, 0.0f);
        this.f19681b.rotateY(this.f19687h);
        this.f19681b.translate(f8, 0.0f, 0.0f);
        if (i8 == 0) {
            if (this.f19695p) {
                b(this.f19684e, this.f19685f, i10);
            } else {
                b(-this.f19684e, -this.f19685f, i10);
            }
        } else if (i8 > 0) {
            b(this.f19684e, this.f19685f, i10);
        } else if (i8 < 0) {
            b(-this.f19684e, -this.f19685f, i10);
        }
        this.f19681b.getMatrix(this.f19682c);
        this.f19681b.restore();
        this.f19682c.preTranslate(-i9, (-getHeight()) / 2);
        this.f19682c.postTranslate(i9, getHeight() / 2);
        canvas.concat(this.f19682c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    private void a(Canvas canvas, int i8, int i9, int i10) {
        canvas.save();
        this.f19681b.save();
        this.f19682c.reset();
        float f8 = i8;
        this.f19681b.translate(0.0f, f8, 0.0f);
        this.f19681b.rotateX(this.f19687h);
        this.f19681b.translate(0.0f, f8, 0.0f);
        if (i8 == 0) {
            if (this.f19695p) {
                a(this.f19683d, this.f19685f, i10);
            } else {
                a(-this.f19683d, -this.f19685f, i10);
            }
        } else if (i8 > 0) {
            a(this.f19683d, this.f19685f, i10);
        } else if (i8 < 0) {
            a(-this.f19683d, -this.f19685f, i10);
        }
        this.f19681b.getMatrix(this.f19682c);
        this.f19681b.restore();
        this.f19682c.preTranslate((-getWidth()) / 2, -i9);
        this.f19682c.postTranslate(getWidth() / 2, i9);
        canvas.concat(this.f19682c);
        View childAt = getChildAt(a(i10));
        if (childAt != null) {
            drawChild(canvas, childAt, 0L);
        }
        canvas.restore();
    }

    public MBRotationView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19685f = 40;
        this.f19686g = 20;
        this.f19687h = 0;
        this.f19688i = 0;
        this.f19690k = 0;
        this.f19691l = 0.5f;
        this.f19692m = 0.9f;
        this.f19693n = true;
        this.f19694o = false;
        this.f19695p = false;
        this.f19680a = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView.1
            @Override // java.lang.Runnable
            public void run() {
                MBRotationView.a(MBRotationView.this);
            }
        };
        a();
    }

    private int a(int i8) {
        int i9;
        int i10;
        int i11;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    i9 = i8 != 3 ? 0 : this.f19688i;
                } else if (this.f19695p) {
                    i10 = this.f19688i;
                    i9 = i10 - 1;
                } else {
                    i11 = this.f19688i;
                    i9 = i11 + 1;
                }
            } else if (this.f19695p) {
                i11 = this.f19688i;
                i9 = i11 + 1;
            } else {
                i10 = this.f19688i;
                i9 = i10 - 1;
            }
        } else if (this.f19695p) {
            i9 = this.f19688i - 2;
        } else {
            i9 = this.f19688i + 2;
        }
        int childCount = i9 % getChildCount();
        return childCount >= 0 ? childCount : childCount + getChildCount();
    }

    static /* synthetic */ void a(MBRotationView mBRotationView) {
        int a9;
        if (mBRotationView.getChildCount() == 0) {
            return;
        }
        int i8 = mBRotationView.f19687h - 1;
        mBRotationView.f19687h = i8;
        int i9 = mBRotationView.f19688i;
        mBRotationView.f19689j = i9;
        int i10 = mBRotationView.f19685f;
        int i11 = i9 - (i8 / i10);
        int i12 = i8 % i10;
        mBRotationView.f19687h = i12;
        mBRotationView.f19688i = i11;
        if (Math.abs(i12) > mBRotationView.f19685f / 2) {
            a9 = mBRotationView.a(2);
        } else {
            a9 = mBRotationView.a(3);
        }
        if (mBRotationView.f19690k != a9) {
            mBRotationView.f19690k = a9;
        }
        mBRotationView.invalidate();
        if (mBRotationView.f19693n) {
            mBRotationView.postDelayed(mBRotationView.f19680a, 1000 / mBRotationView.f19686g);
        }
    }
}
