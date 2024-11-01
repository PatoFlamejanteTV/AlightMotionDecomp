package com.mbridge.msdk.e;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import com.mbridge.msdk.e.a.r;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class u<T> extends com.mbridge.msdk.e.a.p<T> {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f20200a;

    /* renamed from: b, reason: collision with root package name */
    private p.b f20201b;

    /* renamed from: c, reason: collision with root package name */
    private r.b<T> f20202c;

    /* renamed from: d, reason: collision with root package name */
    private v f20203d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.e.a.f f20204e;

    public u(String str, int i8) {
        super(i8, str);
    }

    public final void a(v vVar) {
        this.f20203d = vVar;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final com.mbridge.msdk.e.a.v b() {
        if (y.a(this.f20204e)) {
            this.f20204e = new com.mbridge.msdk.e.a.f(30000, 5, 1.0f);
        }
        return this.f20204e;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final Map<String, String> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        return hashMap;
    }

    @Override // com.mbridge.msdk.e.a.p
    public final p.b e() {
        return this.f20201b;
    }

    public u(String str, int i8, int i9) {
        super(i8, str, i9);
    }

    public final void a(p.b bVar) {
        this.f20201b = bVar;
    }

    public final void a(Map<String, String> map) {
        this.f20200a = map;
    }

    public final void a(r.b<T> bVar) {
        this.f20202c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final com.mbridge.msdk.e.a.r<T> a(com.mbridge.msdk.e.a.m mVar) {
        return this.f20203d.a(mVar);
    }

    @Override // com.mbridge.msdk.e.a.p
    protected final Map<String, String> a() {
        return this.f20200a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.e.a.p
    public final void a(T t8) {
        r.b<T> bVar = this.f20202c;
        this.f20202c = bVar;
        if (bVar != null) {
            bVar.a(t8);
        }
    }
}
