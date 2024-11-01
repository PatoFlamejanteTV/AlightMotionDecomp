package v2;

import R5.AbstractC1435t;
import R5.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f40425c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final b f40426d = new b("2020-03-02", 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    private final String f40427a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f40428b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ b a() {
            return b.f40426d;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public b(String version, Set betaCodes) {
        AbstractC3292y.i(version, "version");
        AbstractC3292y.i(betaCodes, "betaCodes");
        this.f40427a = version;
        this.f40428b = betaCodes;
    }

    public final String b() {
        List e8 = AbstractC1435t.e(this.f40427a);
        Set set = this.f40428b;
        ArrayList arrayList = new ArrayList(AbstractC1435t.x(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return AbstractC1435t.w0(AbstractC1435t.G0(e8, arrayList), ";", null, null, 0, null, null, 62, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3292y.d(this.f40427a, bVar.f40427a) && AbstractC3292y.d(this.f40428b, bVar.f40428b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f40427a.hashCode() * 31) + this.f40428b.hashCode();
    }

    public String toString() {
        return "ApiVersion(version=" + this.f40427a + ", betaCodes=" + this.f40428b + ")";
    }

    public /* synthetic */ b(String str, Set set, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? a0.f() : set);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Set betas) {
        this("2020-03-02", betas);
        AbstractC3292y.i(betas, "betas");
    }
}
