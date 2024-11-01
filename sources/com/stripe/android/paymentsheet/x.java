package com.stripe.android.paymentsheet;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.internal.AbstractC3292y;
import o4.C3527a;
import o4.C3528b;
import o4.C3529c;
import o4.C3530d;
import o4.C3534h;
import o4.C3536j;
import o4.C3537k;
import o4.C3538l;

/* loaded from: classes4.dex */
public abstract class x {
    public static final void a(w.b bVar) {
        o4.n a9;
        int w8;
        int w9;
        float f8;
        float b9;
        long pack;
        AbstractC3292y.i(bVar, "<this>");
        C3537k c3537k = C3537k.f35998a;
        C3538l c3538l = C3538l.f36005a;
        c3537k.f(C3534h.b(c3538l.c(), ColorKt.Color(bVar.b().h()), ColorKt.Color(bVar.b().i()), ColorKt.Color(bVar.b().l()), ColorKt.Color(bVar.b().s()), ColorKt.Color(bVar.b().x()), 0L, ColorKt.Color(bVar.b().v()), ColorKt.Color(bVar.b().f()), ColorsKt.m1177lightColors2qZNXz8$default(ColorKt.Color(bVar.b().w()), 0L, 0L, 0L, 0L, ColorKt.Color(bVar.b().y()), ColorKt.Color(bVar.b().p()), 0L, 0L, 0L, ColorKt.Color(bVar.b().u()), 0L, 2974, null), 32, null));
        c3537k.e(C3534h.b(c3538l.b(), ColorKt.Color(bVar.a().h()), ColorKt.Color(bVar.a().i()), ColorKt.Color(bVar.a().l()), ColorKt.Color(bVar.a().s()), ColorKt.Color(bVar.a().x()), 0L, ColorKt.Color(bVar.a().v()), ColorKt.Color(bVar.a().f()), ColorsKt.m1175darkColors2qZNXz8$default(ColorKt.Color(bVar.a().w()), 0L, 0L, 0L, 0L, ColorKt.Color(bVar.a().y()), ColorKt.Color(bVar.a().p()), 0L, 0L, 0L, ColorKt.Color(bVar.a().u()), 0L, 2974, null), 32, null));
        c3537k.h(C3536j.b(c3538l.e(), bVar.h().f(), bVar.h().b(), 0.0f, 4, null));
        a9 = r4.a((r42 & 1) != 0 ? r4.f36032a : 0, (r42 & 2) != 0 ? r4.f36033b : 0, (r42 & 4) != 0 ? r4.f36034c : 0, (r42 & 8) != 0 ? r4.f36035d : bVar.i().f(), (r42 & 16) != 0 ? r4.f36036e : 0L, (r42 & 32) != 0 ? r4.f36037f : 0L, (r42 & 64) != 0 ? r4.f36038g : 0L, (r42 & 128) != 0 ? r4.f36039h : 0L, (r42 & 256) != 0 ? r4.f36040i : 0L, (r42 & 512) != 0 ? r4.f36041j : 0L, (r42 & 1024) != 0 ? r4.f36042k : bVar.i().b(), (r42 & 2048) != 0 ? r4.f36043l : null, (r42 & 4096) != 0 ? r4.f36044m : null, (r42 & 8192) != 0 ? r4.f36045n : null, (r42 & 16384) != 0 ? r4.f36046o : null, (r42 & 32768) != 0 ? r4.f36047p : null, (r42 & 65536) != 0 ? r4.f36048q : null, (r42 & 131072) != 0 ? c3538l.f().f36049r : null);
        c3537k.i(a9);
        C3529c d8 = c3538l.d();
        Integer f9 = bVar.f().b().f();
        if (f9 != null) {
            w8 = f9.intValue();
        } else {
            w8 = bVar.b().w();
        }
        C3527a c3527a = new C3527a(ColorKt.Color(w8), ColorKt.Color(bVar.f().b().i()), ColorKt.Color(bVar.f().b().h()), ColorKt.Color(bVar.f().b().p()), ColorKt.Color(bVar.f().b().l()), null);
        Integer f10 = bVar.f().a().f();
        if (f10 != null) {
            w9 = f10.intValue();
        } else {
            w9 = bVar.a().w();
        }
        C3527a c3527a2 = new C3527a(ColorKt.Color(w9), ColorKt.Color(bVar.f().a().i()), ColorKt.Color(bVar.f().a().h()), ColorKt.Color(bVar.f().a().p()), ColorKt.Color(bVar.f().a().l()), null);
        Float b10 = bVar.f().f().b();
        if (b10 != null) {
            f8 = b10.floatValue();
        } else {
            f8 = bVar.h().f();
        }
        Float a10 = bVar.f().f().a();
        if (a10 != null) {
            b9 = a10.floatValue();
        } else {
            b9 = bVar.h().b();
        }
        C3528b c3528b = new C3528b(f8, b9);
        Integer a11 = bVar.f().h().a();
        if (a11 == null) {
            a11 = bVar.i().b();
        }
        Float b11 = bVar.f().h().b();
        if (b11 != null) {
            pack = TextUnitKt.getSp(b11.floatValue());
        } else {
            long n8 = c3538l.f().n();
            float f11 = bVar.i().f();
            TextUnitKt.m5355checkArithmeticR2X_6o(n8);
            pack = TextUnitKt.pack(TextUnit.m5340getRawTypeimpl(n8), TextUnit.m5342getValueimpl(n8) * f11);
        }
        c3537k.g(d8.a(c3527a, c3527a2, c3528b, new C3530d(a11, pack, null)));
    }

    public static final void b(w.g gVar) {
        w.h a9;
        String id;
        AbstractC3292y.i(gVar, "<this>");
        if (!l6.n.T(gVar.v())) {
            w.i l8 = gVar.l();
            if (l8 != null && (id = l8.getId()) != null && l6.n.T(id)) {
                throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string.");
            }
            w.i l9 = gVar.l();
            if (l9 != null && (a9 = l9.a()) != null) {
                if (a9 instanceof w.h.b) {
                    if (l6.n.T(((w.h.b) a9).a()) || l6.n.T(gVar.l().b())) {
                        throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string.");
                    }
                    return;
                } else {
                    if (a9 instanceof w.h.a) {
                        String H8 = ((w.h.a) a9).H();
                        if (!l6.n.T(H8)) {
                            if (!l6.n.B(H8, "ek_", false, 2, null)) {
                                if (!l6.n.B(H8, "cuss_", false, 2, null)) {
                                    throw new IllegalArgumentException("Argument does not look like a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Argument looks like an Ephemeral Key secret, but expecting a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
                        }
                        throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the customerSessionClientSecret cannot be an empty string.");
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string.");
    }
}
