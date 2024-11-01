package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.s;

/* loaded from: classes4.dex */
class h extends AbstractC2596a {

    /* renamed from: m, reason: collision with root package name */
    private final Object f24516m;

    /* renamed from: n, reason: collision with root package name */
    private m2.b f24517n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(s sVar, v vVar, int i8, int i9, Object obj, String str, m2.b bVar) {
        super(sVar, null, vVar, i8, i9, 0, null, str, obj, false);
        this.f24516m = new Object();
        this.f24517n = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2596a
    public void a() {
        super.a();
        this.f24517n = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2596a
    public void b(Bitmap bitmap, s.e eVar) {
        m2.b bVar = this.f24517n;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2596a
    public void c(Exception exc) {
        m2.b bVar = this.f24517n;
        if (bVar != null) {
            bVar.a(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.squareup.picasso.AbstractC2596a
    public Object k() {
        return this.f24516m;
    }
}
