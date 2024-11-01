package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.squareup.picasso.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
abstract class AbstractC2596a {

    /* renamed from: a, reason: collision with root package name */
    final s f24445a;

    /* renamed from: b, reason: collision with root package name */
    final v f24446b;

    /* renamed from: c, reason: collision with root package name */
    final WeakReference f24447c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f24448d;

    /* renamed from: e, reason: collision with root package name */
    final int f24449e;

    /* renamed from: f, reason: collision with root package name */
    final int f24450f;

    /* renamed from: g, reason: collision with root package name */
    final int f24451g;

    /* renamed from: h, reason: collision with root package name */
    final Drawable f24452h;

    /* renamed from: i, reason: collision with root package name */
    final String f24453i;

    /* renamed from: j, reason: collision with root package name */
    final Object f24454j;

    /* renamed from: k, reason: collision with root package name */
    boolean f24455k;

    /* renamed from: l, reason: collision with root package name */
    boolean f24456l;

    /* renamed from: com.squareup.picasso.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0441a extends WeakReference {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC2596a f24457a;

        C0441a(AbstractC2596a abstractC2596a, Object obj, ReferenceQueue referenceQueue) {
            super(obj, referenceQueue);
            this.f24457a = abstractC2596a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2596a(s sVar, Object obj, v vVar, int i8, int i9, int i10, Drawable drawable, String str, Object obj2, boolean z8) {
        C0441a c0441a;
        this.f24445a = sVar;
        this.f24446b = vVar;
        if (obj == null) {
            c0441a = null;
        } else {
            c0441a = new C0441a(this, obj, sVar.f24565j);
        }
        this.f24447c = c0441a;
        this.f24449e = i8;
        this.f24450f = i9;
        this.f24448d = z8;
        this.f24451g = i10;
        this.f24452h = drawable;
        this.f24453i = str;
        this.f24454j = obj2 == null ? this : obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f24456l = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Bitmap bitmap, s.e eVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Exception exc);

    /* JADX INFO: Access modifiers changed from: package-private */
    public String d() {
        return this.f24453i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return this.f24449e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.f24450f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s g() {
        return this.f24445a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s.f h() {
        return this.f24446b.f24622t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v i() {
        return this.f24446b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object j() {
        return this.f24454j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object k() {
        WeakReference weakReference = this.f24447c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean l() {
        return this.f24456l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean m() {
        return this.f24455k;
    }
}
