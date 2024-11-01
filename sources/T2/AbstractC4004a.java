package t2;

import C2.c;
import C2.d;
import kotlin.jvm.internal.AbstractC3292y;
import v2.f;
import v3.w;
import x2.C4207a;
import x2.h;
import x2.k;

/* renamed from: t2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4004a {
    public static final c a(Throwable th) {
        C4207a c4207a;
        h hVar;
        f d8;
        String i8;
        String g8;
        AbstractC3292y.i(th, "<this>");
        k kVar = null;
        if (th instanceof C4207a) {
            c4207a = (C4207a) th;
        } else {
            c4207a = null;
        }
        if (c4207a != null) {
            return d.a(w.f40617h);
        }
        if (th instanceof h) {
            hVar = (h) th;
        } else {
            hVar = null;
        }
        if (hVar != null && (g8 = hVar.g()) != null) {
            return d.b(g8);
        }
        if (th instanceof k) {
            kVar = (k) th;
        }
        if (kVar != null && (d8 = kVar.d()) != null && (i8 = d8.i()) != null) {
            return d.b(i8);
        }
        return d.a(w.f40618h0);
    }
}
