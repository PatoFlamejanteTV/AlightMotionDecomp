package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2114d {

    /* renamed from: a, reason: collision with root package name */
    private C2123e f16676a;

    /* renamed from: b, reason: collision with root package name */
    private C2123e f16677b;

    /* renamed from: c, reason: collision with root package name */
    private List f16678c;

    public C2114d() {
        this.f16676a = new C2123e("", 0L, null);
        this.f16677b = new C2123e("", 0L, null);
        this.f16678c = new ArrayList();
    }

    public final C2123e a() {
        return this.f16676a;
    }

    public final void b(C2123e c2123e) {
        this.f16676a = c2123e;
        this.f16677b = (C2123e) c2123e.clone();
        this.f16678c.clear();
    }

    public final void c(String str, long j8, Map map) {
        HashMap hashMap = new HashMap();
        for (String str2 : map.keySet()) {
            hashMap.put(str2, C2123e.c(str2, this.f16676a.b(str2), map.get(str2)));
        }
        this.f16678c.add(new C2123e(str, j8, hashMap));
    }

    public final /* synthetic */ Object clone() {
        C2114d c2114d = new C2114d((C2123e) this.f16676a.clone());
        Iterator it = this.f16678c.iterator();
        while (it.hasNext()) {
            c2114d.f16678c.add((C2123e) ((C2123e) it.next()).clone());
        }
        return c2114d;
    }

    public final C2123e d() {
        return this.f16677b;
    }

    public final void e(C2123e c2123e) {
        this.f16677b = c2123e;
    }

    public final List f() {
        return this.f16678c;
    }

    private C2114d(C2123e c2123e) {
        this.f16676a = c2123e;
        this.f16677b = (C2123e) c2123e.clone();
        this.f16678c = new ArrayList();
    }
}
