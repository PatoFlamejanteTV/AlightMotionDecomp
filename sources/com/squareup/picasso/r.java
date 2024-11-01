package com.squareup.picasso;

import K6.C1322c;
import K6.e;
import K6.u;
import android.content.Context;
import java.io.File;

/* loaded from: classes4.dex */
public final class r implements m2.c {

    /* renamed from: a, reason: collision with root package name */
    final e.a f24551a;

    /* renamed from: b, reason: collision with root package name */
    private final C1322c f24552b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24553c;

    public r(Context context) {
        this(C.f(context));
    }

    @Override // m2.c
    public K6.z a(K6.x xVar) {
        return this.f24551a.a(xVar).execute();
    }

    public r(File file) {
        this(file, C.a(file));
    }

    public r(File file, long j8) {
        this(new u.b().b(new C1322c(file, j8)).a());
        this.f24553c = false;
    }

    public r(K6.u uVar) {
        this.f24553c = true;
        this.f24551a = uVar;
        this.f24552b = uVar.c();
    }
}
