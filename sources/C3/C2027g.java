package c3;

import b3.C1969a;
import com.stripe.android.model.o;
import d3.InterfaceC2750b;
import j4.H0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import v3.w;

/* renamed from: c3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2027g {

    /* renamed from: a, reason: collision with root package name */
    private final String f15464a;

    /* renamed from: b, reason: collision with root package name */
    private final C2.c f15465b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15466c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15467d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15468e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15469f;

    /* renamed from: g, reason: collision with root package name */
    private final C2.c f15470g;

    public C2027g(String code, C2.c displayName, int i8, String str, String str2, boolean z8, C2.c cVar) {
        AbstractC3292y.i(code, "code");
        AbstractC3292y.i(displayName, "displayName");
        this.f15464a = code;
        this.f15465b = displayName;
        this.f15466c = i8;
        this.f15467d = str;
        this.f15468e = str2;
        this.f15469f = z8;
        this.f15470g = cVar;
    }

    private static final boolean b(List list, C2027g c2027g, o.p pVar) {
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((o) it.next()).f25635e == pVar) {
                    if (AbstractC3292y.d(c2027g.f15464a, pVar.f25773a)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final Q3.e a(List customerSavedPaymentMethods, Function0 onClick) {
        C2.c cVar;
        AbstractC3292y.i(customerSavedPaymentMethods, "customerSavedPaymentMethods");
        AbstractC3292y.i(onClick, "onClick");
        if (b(customerSavedPaymentMethods, this, o.p.f25755i)) {
            cVar = C2.d.a(w.f40589M);
        } else {
            cVar = this.f15465b;
        }
        return new Q3.e(this.f15464a, cVar, this.f15466c, this.f15467d, this.f15468e, this.f15469f, this.f15470g, onClick);
    }

    public final C1969a c() {
        return new C1969a(this.f15465b, true, this.f15466c, this.f15467d, this.f15468e, this.f15469f);
    }

    public final String d() {
        return this.f15464a;
    }

    public final String e() {
        return this.f15468e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2027g)) {
            return false;
        }
        C2027g c2027g = (C2027g) obj;
        if (AbstractC3292y.d(this.f15464a, c2027g.f15464a) && AbstractC3292y.d(this.f15465b, c2027g.f15465b) && this.f15466c == c2027g.f15466c && AbstractC3292y.d(this.f15467d, c2027g.f15467d) && AbstractC3292y.d(this.f15468e, c2027g.f15468e) && this.f15469f == c2027g.f15469f && AbstractC3292y.d(this.f15470g, c2027g.f15470g)) {
            return true;
        }
        return false;
    }

    public final C2.c f() {
        return this.f15465b;
    }

    public final boolean g() {
        return this.f15469f;
    }

    public final int h() {
        return this.f15466c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((this.f15464a.hashCode() * 31) + this.f15465b.hashCode()) * 31) + this.f15466c) * 31;
        String str = this.f15467d;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f15468e;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int a9 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f15469f)) * 31;
        C2.c cVar = this.f15470g;
        if (cVar != null) {
            i8 = cVar.hashCode();
        }
        return a9 + i8;
    }

    public final String i() {
        return this.f15467d;
    }

    public String toString() {
        return "SupportedPaymentMethod(code=" + this.f15464a + ", displayName=" + this.f15465b + ", iconResource=" + this.f15466c + ", lightThemeIconUrl=" + this.f15467d + ", darkThemeIconUrl=" + this.f15468e + ", iconRequiresTinting=" + this.f15469f + ", subtitle=" + this.f15470g + ")";
    }

    public /* synthetic */ C2027g(String str, C2.c cVar, int i8, String str2, String str3, boolean z8, C2.c cVar2, int i9, AbstractC3284p abstractC3284p) {
        this(str, cVar, i8, str2, str3, z8, (i9 & 64) != 0 ? null : cVar2);
    }

    public /* synthetic */ C2027g(InterfaceC2750b interfaceC2750b, H0 h02, int i8, int i9, boolean z8, C2.c cVar, int i10, AbstractC3284p abstractC3284p) {
        this(interfaceC2750b, (i10 & 2) != 0 ? null : h02, i8, i9, (i10 & 16) != 0 ? false : z8, (i10 & 32) != 0 ? null : cVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2027g(d3.InterfaceC2750b r9, j4.H0 r10, int r11, int r12, boolean r13, C2.c r14) {
        /*
            r8 = this;
            java.lang.String r0 = "paymentMethodDefinition"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r0)
            com.stripe.android.model.o$p r9 = r9.getType()
            java.lang.String r1 = r9.f25773a
            C2.c r2 = C2.d.a(r11)
            r9 = 0
            if (r10 == 0) goto L1e
            j4.F0 r11 = r10.f()
            if (r11 == 0) goto L1e
            java.lang.String r11 = r11.b()
            r4 = r11
            goto L1f
        L1e:
            r4 = r9
        L1f:
            if (r10 == 0) goto L2b
            j4.F0 r10 = r10.f()
            if (r10 == 0) goto L2b
            java.lang.String r9 = r10.a()
        L2b:
            r5 = r9
            r0 = r8
            r3 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c3.C2027g.<init>(d3.b, j4.H0, int, int, boolean, C2.c):void");
    }

    public /* synthetic */ C2027g(String str, int i8, int i9, boolean z8, String str2, String str3, C2.c cVar, int i10, AbstractC3284p abstractC3284p) {
        this(str, i8, i9, (i10 & 8) != 0 ? false : z8, str2, str3, (i10 & 64) != 0 ? null : cVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2027g(String code, int i8, int i9, boolean z8, String str, String str2, C2.c cVar) {
        this(code, C2.d.a(i8), i9, str, str2, z8, cVar);
        AbstractC3292y.i(code, "code");
    }
}
