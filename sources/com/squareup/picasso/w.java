package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.s;
import com.squareup.picasso.v;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f24640m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final s f24641a;

    /* renamed from: b, reason: collision with root package name */
    private final v.b f24642b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24643c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24644d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f24645e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f24646f;

    /* renamed from: g, reason: collision with root package name */
    private int f24647g;

    /* renamed from: h, reason: collision with root package name */
    private int f24648h;

    /* renamed from: i, reason: collision with root package name */
    private int f24649i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f24650j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f24651k;

    /* renamed from: l, reason: collision with root package name */
    private Object f24652l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(s sVar, Uri uri, int i8) {
        if (!sVar.f24569n) {
            this.f24641a = sVar;
            this.f24642b = new v.b(uri, i8, sVar.f24566k);
            return;
        }
        throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
    }

    private v c(long j8) {
        int andIncrement = f24640m.getAndIncrement();
        v a9 = this.f24642b.a();
        a9.f24603a = andIncrement;
        a9.f24604b = j8;
        boolean z8 = this.f24641a.f24568m;
        if (z8) {
            C.u("Main", "created", a9.g(), a9.toString());
        }
        v p8 = this.f24641a.p(a9);
        if (p8 != a9) {
            p8.f24603a = andIncrement;
            p8.f24604b = j8;
            if (z8) {
                C.u("Main", "changed", p8.d(), "into " + p8);
            }
        }
        return p8;
    }

    private Drawable h() {
        int i8 = this.f24646f;
        if (i8 != 0) {
            return this.f24641a.f24559d.getDrawable(i8);
        }
        return this.f24650j;
    }

    public w a() {
        this.f24642b.b(17);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w b() {
        this.f24652l = null;
        return this;
    }

    public void d() {
        e(null);
    }

    public void e(m2.b bVar) {
        long nanoTime = System.nanoTime();
        if (!this.f24644d) {
            if (this.f24642b.c()) {
                if (!this.f24642b.d()) {
                    this.f24642b.f(s.f.LOW);
                }
                v c8 = c(nanoTime);
                String h8 = C.h(c8, new StringBuilder());
                if (o.a(this.f24648h) && this.f24641a.m(h8) != null) {
                    if (this.f24641a.f24568m) {
                        C.u("Main", "completed", c8.g(), "from " + s.e.MEMORY);
                    }
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                this.f24641a.o(new h(this.f24641a, c8, this.f24648h, this.f24649i, this.f24652l, h8, bVar));
                return;
            }
            return;
        }
        throw new IllegalStateException("Fit cannot be used with fetch.");
    }

    public w f() {
        this.f24644d = true;
        return this;
    }

    public Bitmap g() {
        long nanoTime = System.nanoTime();
        C.d();
        if (!this.f24644d) {
            if (!this.f24642b.c()) {
                return null;
            }
            v c8 = c(nanoTime);
            j jVar = new j(this.f24641a, c8, this.f24648h, this.f24649i, this.f24652l, C.h(c8, new StringBuilder()));
            s sVar = this.f24641a;
            return RunnableC2598c.g(sVar, sVar.f24560e, sVar.f24561f, sVar.f24562g, jVar).t();
        }
        throw new IllegalStateException("Fit cannot be used with get.");
    }

    public void i(ImageView imageView) {
        j(imageView, null);
    }

    public void j(ImageView imageView, m2.b bVar) {
        Bitmap m8;
        long nanoTime = System.nanoTime();
        C.c();
        if (imageView != null) {
            if (!this.f24642b.c()) {
                this.f24641a.b(imageView);
                if (this.f24645e) {
                    t.d(imageView, h());
                    return;
                }
                return;
            }
            if (this.f24644d) {
                if (!this.f24642b.e()) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width != 0 && height != 0) {
                        this.f24642b.g(width, height);
                    } else {
                        if (this.f24645e) {
                            t.d(imageView, h());
                        }
                        this.f24641a.e(imageView, new f(this, imageView, bVar));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            v c8 = c(nanoTime);
            String g8 = C.g(c8);
            if (o.a(this.f24648h) && (m8 = this.f24641a.m(g8)) != null) {
                this.f24641a.b(imageView);
                s sVar = this.f24641a;
                Context context = sVar.f24559d;
                s.e eVar = s.e.MEMORY;
                t.c(imageView, context, m8, eVar, this.f24643c, sVar.f24567l);
                if (this.f24641a.f24568m) {
                    C.u("Main", "completed", c8.g(), "from " + eVar);
                }
                if (bVar != null) {
                    bVar.b();
                    return;
                }
                return;
            }
            if (this.f24645e) {
                t.d(imageView, h());
            }
            this.f24641a.g(new k(this.f24641a, imageView, c8, this.f24648h, this.f24649i, this.f24647g, this.f24651k, g8, this.f24652l, bVar, this.f24643c));
            return;
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public void k(A a9) {
        Bitmap m8;
        long nanoTime = System.nanoTime();
        C.c();
        if (a9 != null) {
            if (!this.f24644d) {
                Drawable drawable = null;
                if (!this.f24642b.c()) {
                    this.f24641a.c(a9);
                    if (this.f24645e) {
                        drawable = h();
                    }
                    a9.b(drawable);
                    return;
                }
                v c8 = c(nanoTime);
                String g8 = C.g(c8);
                if (o.a(this.f24648h) && (m8 = this.f24641a.m(g8)) != null) {
                    this.f24641a.c(a9);
                    a9.c(m8, s.e.MEMORY);
                    return;
                } else {
                    if (this.f24645e) {
                        drawable = h();
                    }
                    a9.b(drawable);
                    this.f24641a.g(new B(this.f24641a, a9, c8, this.f24648h, this.f24649i, this.f24651k, g8, this.f24652l, this.f24647g));
                    return;
                }
            }
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        throw new IllegalArgumentException("Target must not be null.");
    }

    public w l(int i8) {
        if (this.f24645e) {
            if (i8 != 0) {
                if (this.f24650j == null) {
                    this.f24646f = i8;
                    return this;
                }
                throw new IllegalStateException("Placeholder image already set.");
            }
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        throw new IllegalStateException("Already explicitly declared as no placeholder.");
    }

    public w m(int i8, int i9) {
        this.f24642b.g(i8, i9);
        return this;
    }

    public w n(m2.e eVar) {
        this.f24642b.h(eVar);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w o() {
        this.f24644d = false;
        return this;
    }
}
