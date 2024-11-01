package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected a f20705a;

    public b(String str) {
        a aVar = new a();
        aVar.a(str);
        aVar.a(c.AD_ROOT);
        List<a> a9 = a();
        if (a9 != null && a9.size() > 0) {
            aVar.a(a9);
        }
        this.f20705a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final a a(ArrayList<a> arrayList, c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        arrayList.add(aVar);
        return aVar;
    }

    protected abstract List<a> a();

    public final a b() {
        return this.f20705a;
    }
}
