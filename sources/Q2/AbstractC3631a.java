package q2;

import Q5.r;
import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.stripe.android.paymentsheet.w;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import o4.C3538l;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3631a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0826a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C0826a f36660a = new C0826a();

        C0826a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(EnumC2906e brand) {
            AbstractC3292y.i(brand, "brand");
            return brand.f();
        }
    }

    public static final List a(w.g gVar) {
        AbstractC3292y.i(gVar, "<this>");
        List s8 = gVar.s();
        if (!(!s8.isEmpty())) {
            s8 = null;
        }
        if (s8 == null) {
            return null;
        }
        return AbstractC1435t.Q0(s8, 10);
    }

    public static final Map b(w.b bVar) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        AbstractC3292y.i(bVar, "<this>");
        w.o f8 = bVar.f();
        w.p b9 = bVar.f().b();
        w.p.a aVar = w.p.f28021f;
        r a9 = x.a("colorsLight", Boolean.valueOf(!AbstractC3292y.d(b9, aVar.b())));
        r a10 = x.a("colorsDark", Boolean.valueOf(!AbstractC3292y.d(bVar.f().a(), aVar.a())));
        if (f8.f().b() != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        r a11 = x.a("corner_radius", Boolean.valueOf(z8));
        if (f8.f().a() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        r a12 = x.a("border_width", Boolean.valueOf(z9));
        if (f8.h().a() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Map k8 = Q.k(a9, a10, a11, a12, x.a("font", Boolean.valueOf(z10)));
        w.e b10 = bVar.b();
        w.e.a aVar2 = w.e.f27922l;
        r a13 = x.a("colorsLight", Boolean.valueOf(!AbstractC3292y.d(b10, aVar2.b())));
        r a14 = x.a("colorsDark", Boolean.valueOf(!AbstractC3292y.d(bVar.a(), aVar2.a())));
        float f9 = bVar.h().f();
        C3538l c3538l = C3538l.f36005a;
        if (f9 == c3538l.e().e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        r a15 = x.a("corner_radius", Boolean.valueOf(!z11));
        if (bVar.h().b() == c3538l.e().c()) {
            z12 = true;
        } else {
            z12 = false;
        }
        r a16 = x.a("border_width", Boolean.valueOf(!z12));
        if (bVar.i().b() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        r a17 = x.a("font", Boolean.valueOf(z13));
        if (bVar.i().f() == c3538l.f().g()) {
            z14 = true;
        } else {
            z14 = false;
        }
        Map m8 = Q.m(a13, a14, a15, a16, a17, x.a("size_scale_factor", Boolean.valueOf(!z14)), x.a("primary_button", k8));
        boolean contains = k8.values().contains(Boolean.TRUE);
        Collection values = m8.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : values) {
            if (obj instanceof Boolean) {
                arrayList.add(obj);
            }
        }
        if (arrayList.contains(Boolean.TRUE) || contains) {
            z15 = true;
        }
        m8.put("usage", Boolean.valueOf(z15));
        return m8;
    }

    public static final Map c(w.d dVar) {
        AbstractC3292y.i(dVar, "<this>");
        return Q.k(x.a("attach_defaults", Boolean.valueOf(dVar.b())), x.a("name", dVar.s().name()), x.a(NotificationCompat.CATEGORY_EMAIL, dVar.p().name()), x.a(HintConstants.AUTOFILL_HINT_PHONE, dVar.u().name()), x.a("address", dVar.a().name()));
    }

    public static final String d(List list) {
        AbstractC3292y.i(list, "<this>");
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        return AbstractC1435t.w0(list, null, null, null, 0, null, C0826a.f36660a, 31, null);
    }
}
