package X3;

import R5.AbstractC1435t;
import X3.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d implements m {

    /* renamed from: b, reason: collision with root package name */
    private static final a f11020b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final List f11021c = AbstractC1435t.p(new l.c(), new l.d(), new l.b(), new l.a(false, 1, null), new l.e());

    /* renamed from: a, reason: collision with root package name */
    private final List f11022a;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public d(List securityChecks) {
        AbstractC3292y.i(securityChecks, "securityChecks");
        this.f11022a = securityChecks;
    }

    @Override // X3.m
    public List a() {
        List list = this.f11022a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((l) obj).a()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((l) it.next()).b());
        }
        return arrayList2;
    }

    public /* synthetic */ d(List list, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? f11021c : list);
    }
}
