package com.squareup.picasso;

import U6.L;
import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.s;
import com.squareup.picasso.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.squareup.picasso.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C2597b extends x {

    /* renamed from: d, reason: collision with root package name */
    private static final int f24458d = 22;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24459a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f24460b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private AssetManager f24461c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2597b(Context context) {
        this.f24459a = context;
    }

    static String j(v vVar) {
        return vVar.f24606d.toString().substring(f24458d);
    }

    @Override // com.squareup.picasso.x
    public boolean c(v vVar) {
        Uri uri = vVar.f24606d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // com.squareup.picasso.x
    public x.a f(v vVar, int i8) {
        if (this.f24461c == null) {
            synchronized (this.f24460b) {
                try {
                    if (this.f24461c == null) {
                        this.f24461c = this.f24459a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new x.a(L.l(this.f24461c.open(j(vVar))), s.e.DISK);
    }
}
