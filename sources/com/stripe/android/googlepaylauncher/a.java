package com.stripe.android.googlepaylauncher;

import Q5.p;
import com.stripe.android.googlepaylauncher.f;
import com.stripe.android.googlepaylauncher.j;
import kotlin.jvm.internal.AbstractC3292y;
import n2.m;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.googlepaylauncher.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public /* synthetic */ class C0469a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25044a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f25045b;

        static {
            int[] iArr = new int[f.b.values().length];
            try {
                iArr[f.b.f25075b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.b.f25076c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f25044a = iArr;
            int[] iArr2 = new int[j.b.EnumC0474b.values().length];
            try {
                iArr2[j.b.EnumC0474b.f25148b.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[j.b.EnumC0474b.f25149c.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f25045b = iArr2;
        }
    }

    public static final m.a a(f fVar) {
        m.a.b bVar;
        AbstractC3292y.i(fVar, "<this>");
        boolean f8 = fVar.f();
        int i8 = C0469a.f25044a[fVar.a().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                bVar = m.a.b.f35364c;
            } else {
                throw new p();
            }
        } else {
            bVar = m.a.b.f35363b;
        }
        return new m.a(f8, bVar, fVar.b());
    }

    public static final m.a b(j.b bVar) {
        m.a.b bVar2;
        AbstractC3292y.i(bVar, "<this>");
        boolean f8 = bVar.f();
        int i8 = C0469a.f25045b[bVar.a().ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                bVar2 = m.a.b.f35364c;
            } else {
                throw new p();
            }
        } else {
            bVar2 = m.a.b.f35363b;
        }
        return new m.a(f8, bVar2, bVar.b());
    }
}
