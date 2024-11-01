package com.mbridge.msdk.e;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f20116a;

    /* renamed from: b, reason: collision with root package name */
    private final r f20117b;

    /* renamed from: c, reason: collision with root package name */
    private final j f20118c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f20119d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private final long[] f20120e = new long[2];

    /* renamed from: f, reason: collision with root package name */
    private volatile i f20121f;

    public g(c cVar, r rVar, j jVar) {
        this.f20116a = cVar;
        this.f20117b = rVar;
        this.f20118c = jVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(final e eVar) {
        this.f20118c.b(new Runnable() { // from class: com.mbridge.msdk.e.g.1
            private void a(i iVar, int i8) {
                while (i8 > 0) {
                    if (g.this.f20116a.a(iVar) > 0) {
                        g.this.f20117b.c();
                        g.this.f20117b.d();
                        g.this.f20117b.a(eVar);
                        return;
                    }
                    i8--;
                }
                g.this.f20121f = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(System.currentTimeMillis() + eVar.h());
                if (g.this.f20121f != null) {
                    a(g.this.f20121f, 5);
                    g.this.f20121f = null;
                }
                a(iVar, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        long incrementAndGet = this.f20119d.incrementAndGet();
        this.f20120e[0] = System.currentTimeMillis();
        this.f20120e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        long[] jArr = this.f20120e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
