package c3;

import R5.AbstractC1435t;
import com.stripe.android.paymentsheet.w;
import d3.InterfaceC2756h;
import j4.C3168a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;
import r4.D;
import r4.h0;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2022b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2756h.a f15452a;

    /* renamed from: b, reason: collision with root package name */
    private final List f15453b;

    /* renamed from: c, reason: collision with root package name */
    private final List f15454c;

    /* renamed from: d, reason: collision with root package name */
    private final List f15455d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f15456e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f15457f;

    /* renamed from: g, reason: collision with root package name */
    private Set f15458g;

    public C2022b(InterfaceC2756h.a arguments) {
        AbstractC3292y.i(arguments, "arguments");
        this.f15452a = arguments;
        this.f15453b = new ArrayList();
        this.f15454c = new ArrayList();
        this.f15455d = new ArrayList();
        this.f15456e = new LinkedHashSet();
        this.f15458g = z2.d.f41472a.h();
        for (EnumC2021a enumC2021a : EnumC2021a.d()) {
            if (enumC2021a.f(this.f15452a.a())) {
                e(enumC2021a);
            }
        }
        if (this.f15452a.a().a() == w.d.a.f27913c) {
            d(this, null, 1, null);
        }
    }

    public static /* synthetic */ C2022b d(C2022b c2022b, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = c2022b.f15458g;
        }
        return c2022b.c(set);
    }

    public final List a() {
        h0 s8;
        List c8 = AbstractC1435t.c();
        c8.addAll(this.f15453b);
        Iterator it = this.f15456e.iterator();
        while (it.hasNext()) {
            c8.add(((EnumC2021a) it.next()).c(this.f15452a.d()));
        }
        c8.addAll(this.f15454c);
        if (this.f15457f && (s8 = new C3168a(null, this.f15458g, null, false, null, false, 61, null).s(this.f15452a.d(), this.f15452a.j())) != null) {
            c8.add(s8);
        }
        c8.addAll(this.f15455d);
        return AbstractC1435t.a(c8);
    }

    public final C2022b b(D formElement) {
        AbstractC3292y.i(formElement, "formElement");
        this.f15454c.add(formElement);
        return this;
    }

    public final C2022b c(Set availableCountries) {
        AbstractC3292y.i(availableCountries, "availableCountries");
        if (this.f15452a.a().a() != w.d.a.f27912b) {
            this.f15457f = true;
            this.f15458g = availableCountries;
        }
        return this;
    }

    public final C2022b e(EnumC2021a type) {
        AbstractC3292y.i(type, "type");
        if (type.e(this.f15452a.a())) {
            this.f15456e.add(type);
        }
        return this;
    }
}
