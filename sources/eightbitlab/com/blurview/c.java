package eightbitlab.com.blurview;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import eightbitlab.com.blurview.e;

/* loaded from: classes5.dex */
final class c implements eightbitlab.com.blurview.a {

    /* renamed from: b, reason: collision with root package name */
    private final C5.a f31790b;

    /* renamed from: c, reason: collision with root package name */
    private C5.b f31791c;

    /* renamed from: d, reason: collision with root package name */
    private Bitmap f31792d;

    /* renamed from: e, reason: collision with root package name */
    final BlurView f31793e;

    /* renamed from: f, reason: collision with root package name */
    private int f31794f;

    /* renamed from: g, reason: collision with root package name */
    private final ViewGroup f31795g;

    /* renamed from: l, reason: collision with root package name */
    private boolean f31800l;

    /* renamed from: m, reason: collision with root package name */
    private Drawable f31801m;

    /* renamed from: a, reason: collision with root package name */
    private float f31789a = 16.0f;

    /* renamed from: h, reason: collision with root package name */
    private final int[] f31796h = new int[2];

    /* renamed from: i, reason: collision with root package name */
    private final int[] f31797i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f31798j = new a();

    /* renamed from: k, reason: collision with root package name */
    private boolean f31799k = true;

    /* loaded from: classes5.dex */
    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            c.this.h();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(BlurView blurView, ViewGroup viewGroup, int i8, C5.a aVar) {
        this.f31795g = viewGroup;
        this.f31793e = blurView;
        this.f31794f = i8;
        this.f31790b = aVar;
        if (aVar instanceof d) {
            ((d) aVar).f(blurView.getContext());
        }
        f(blurView.getMeasuredWidth(), blurView.getMeasuredHeight());
    }

    private void e() {
        this.f31792d = this.f31790b.e(this.f31792d, this.f31789a);
        if (!this.f31790b.c()) {
            this.f31791c.setBitmap(this.f31792d);
        }
    }

    private void g() {
        this.f31795g.getLocationOnScreen(this.f31796h);
        this.f31793e.getLocationOnScreen(this.f31797i);
        int[] iArr = this.f31797i;
        int i8 = iArr[0];
        int[] iArr2 = this.f31796h;
        int i9 = i8 - iArr2[0];
        int i10 = iArr[1] - iArr2[1];
        float height = this.f31793e.getHeight() / this.f31792d.getHeight();
        float width = this.f31793e.getWidth() / this.f31792d.getWidth();
        this.f31791c.translate((-i9) / width, (-i10) / height);
        this.f31791c.scale(1.0f / width, 1.0f / height);
    }

    @Override // C5.c
    public C5.c a(boolean z8) {
        this.f31795g.getViewTreeObserver().removeOnPreDrawListener(this.f31798j);
        if (z8) {
            this.f31795g.getViewTreeObserver().addOnPreDrawListener(this.f31798j);
        }
        return this;
    }

    @Override // C5.c
    public C5.c b(Drawable drawable) {
        this.f31801m = drawable;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void c() {
        f(this.f31793e.getMeasuredWidth(), this.f31793e.getMeasuredHeight());
    }

    @Override // C5.c
    public C5.c d(float f8) {
        this.f31789a = f8;
        return this;
    }

    @Override // eightbitlab.com.blurview.a
    public void destroy() {
        a(false);
        this.f31790b.destroy();
        this.f31800l = false;
    }

    @Override // eightbitlab.com.blurview.a
    public boolean draw(Canvas canvas) {
        if (this.f31799k && this.f31800l) {
            if (canvas instanceof C5.b) {
                return false;
            }
            float width = this.f31793e.getWidth() / this.f31792d.getWidth();
            canvas.save();
            canvas.scale(width, this.f31793e.getHeight() / this.f31792d.getHeight());
            this.f31790b.d(canvas, this.f31792d);
            canvas.restore();
            int i8 = this.f31794f;
            if (i8 != 0) {
                canvas.drawColor(i8);
            }
        }
        return true;
    }

    void f(int i8, int i9) {
        a(true);
        e eVar = new e(this.f31790b.a());
        if (eVar.b(i8, i9)) {
            this.f31793e.setWillNotDraw(true);
            return;
        }
        this.f31793e.setWillNotDraw(false);
        e.a d8 = eVar.d(i8, i9);
        this.f31792d = Bitmap.createBitmap(d8.f31810a, d8.f31811b, this.f31790b.b());
        this.f31791c = new C5.b(this.f31792d);
        this.f31800l = true;
        h();
    }

    void h() {
        if (this.f31799k && this.f31800l) {
            Drawable drawable = this.f31801m;
            if (drawable == null) {
                this.f31792d.eraseColor(0);
            } else {
                drawable.draw(this.f31791c);
            }
            this.f31791c.save();
            g();
            this.f31795g.draw(this.f31791c);
            this.f31791c.restore();
            e();
        }
    }
}
