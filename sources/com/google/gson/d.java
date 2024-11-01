package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d extends f implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f18798a = new ArrayList();

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof d) || !((d) obj).f18798a.equals(this.f18798a))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f18798a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f18798a.iterator();
    }

    public void m(f fVar) {
        if (fVar == null) {
            fVar = h.f18799a;
        }
        this.f18798a.add(fVar);
    }
}
