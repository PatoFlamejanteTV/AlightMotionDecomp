package com.squareup.picasso;

import K6.d;
import K6.x;
import android.net.NetworkInfo;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class q extends x {

    /* renamed from: a, reason: collision with root package name */
    private final m2.c f24547a;

    /* renamed from: b, reason: collision with root package name */
    private final z f24548b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a extends IOException {
        a(String str) {
            super(str);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends IOException {

        /* renamed from: a, reason: collision with root package name */
        final int f24549a;

        /* renamed from: b, reason: collision with root package name */
        final int f24550b;

        b(int i8, int i9) {
            super("HTTP " + i8);
            this.f24549a = i8;
            this.f24550b = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(m2.c cVar, z zVar) {
        this.f24547a = cVar;
        this.f24548b = zVar;
    }

    private static K6.x j(v vVar, int i8) {
        K6.d dVar;
        if (i8 != 0) {
            if (p.a(i8)) {
                dVar = K6.d.f4876o;
            } else {
                d.a aVar = new d.a();
                if (!p.b(i8)) {
                    aVar.c();
                }
                if (!p.c(i8)) {
                    aVar.d();
                }
                dVar = aVar.a();
            }
        } else {
            dVar = null;
        }
        x.a h8 = new x.a().h(vVar.f24606d.toString());
        if (dVar != null) {
            h8.b(dVar);
        }
        return h8.a();
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        String scheme = vVar.f24606d.getScheme();
        if (!"http".equals(scheme) && !"https".equals(scheme)) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.x
    int e() {
        return 2;
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        s.e eVar;
        K6.z a9 = this.f24547a.a(j(vVar, i8));
        K6.A a10 = a9.a();
        if (a9.q()) {
            if (a9.g() == null) {
                eVar = s.e.NETWORK;
            } else {
                eVar = s.e.DISK;
            }
            if (eVar == s.e.DISK && a10.a() == 0) {
                a10.close();
                throw new a("Received response with 0 content-length header.");
            }
            if (eVar == s.e.NETWORK && a10.a() > 0) {
                this.f24548b.f(a10.a());
            }
            return new x.a(a10.h(), eVar);
        }
        a10.close();
        throw new b(a9.h(), vVar.f24605c);
    }

    @Override // com.squareup.picasso.x
    boolean h(boolean z8, NetworkInfo networkInfo) {
        if (networkInfo != null && !networkInfo.isConnected()) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.x
    boolean i() {
        return true;
    }
}
