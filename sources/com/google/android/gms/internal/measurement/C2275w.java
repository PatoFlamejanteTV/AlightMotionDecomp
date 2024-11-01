package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2275w implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f17056a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2259u f17057b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2275w(C2259u c2259u) {
        this.f17057b = c2259u;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i8 = this.f17056a;
        str = this.f17057b.f17015a;
        if (i8 < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        String str;
        String str2;
        int i8 = this.f17056a;
        str = this.f17057b.f17015a;
        if (i8 < str.length()) {
            str2 = this.f17057b.f17015a;
            int i9 = this.f17056a;
            this.f17056a = i9 + 1;
            return new C2259u(String.valueOf(str2.charAt(i9)));
        }
        throw new NoSuchElementException();
    }
}
