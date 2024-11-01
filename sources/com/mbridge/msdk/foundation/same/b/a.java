package com.mbridge.msdk.foundation.same.b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f20701a;

    /* renamed from: b, reason: collision with root package name */
    private String f20702b;

    /* renamed from: c, reason: collision with root package name */
    private a f20703c;

    /* renamed from: d, reason: collision with root package name */
    private c f20704d;

    public final void a(c cVar, String str) {
        a aVar = new a();
        aVar.f20704d = cVar;
        aVar.f20702b = str;
        a(aVar);
    }

    public final String b() {
        return this.f20702b;
    }

    public final a c() {
        return this.f20703c;
    }

    public final c d() {
        return this.f20704d;
    }

    private void a(a aVar) {
        if (this.f20701a == null) {
            this.f20701a = new ArrayList();
        }
        aVar.f20703c = this;
        this.f20701a.add(aVar);
    }

    public final void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final List<a> a() {
        return this.f20701a;
    }

    public final void a(String str) {
        this.f20702b = str;
    }

    public final void a(c cVar) {
        this.f20704d = cVar;
    }
}
