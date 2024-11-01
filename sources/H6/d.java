package H6;

import Q5.I;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f3272a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final J6.f f3273b;

    /* renamed from: c, reason: collision with root package name */
    public static final SharedStorage f3274c;

    /* renamed from: d, reason: collision with root package name */
    public static I6.e f3275d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3276e;

    /* renamed from: f, reason: collision with root package name */
    public static g f3277f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f3278g;

    /* renamed from: h, reason: collision with root package name */
    public static D5.h f3279h;

    /* loaded from: classes5.dex */
    public static final class a extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f3280a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function1 function1) {
            super(1);
            this.f3280a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            this.f3280a.invoke((USRegulationData) obj);
            return I.f8786a;
        }
    }

    static {
        Y7.d dVar = Y7.d.f13152a;
        f3273b = dVar.j();
        SharedStorage m8 = dVar.m();
        f3274c = m8;
        f3276e = m8.j(X7.a.SAVED_MSPA_JURISDICTION);
        f3279h = D5.h.NATIONAL;
    }

    public final String a() {
        return f3274c.j(X7.a.SAVED_REGION);
    }

    public final void b(List mspaPurpose, boolean z8, Function1 completion) {
        AbstractC3292y.i(mspaPurpose, "mspaPurpose");
        AbstractC3292y.i(completion, "completion");
        I6.e eVar = f3275d;
        if (eVar != null) {
            eVar.e(mspaPurpose, z8, new a(completion));
            return;
        }
        A5.b.a(A5.b.f238a, ChoiceError.UNEXPECTED_ERROR_OCCURRED, null, null, A5.c.CONSOLE, null, 22);
        completion.invoke(null);
    }

    public final g c() {
        g gVar = f3277f;
        if (gVar != null) {
            return gVar;
        }
        i iVar = i.f3302a;
        g a9 = iVar.a(Y7.d.f13165n);
        J6.f fVar = f3273b;
        if (!AbstractC3292y.d(fVar.f4497b.f4445J, "NATIONAL") && (!fVar.f4497b.f4446K || !d())) {
            if ((!fVar.f4497b.f4446K || a9 == g.NOT_APPLICABLE || d()) && !fVar.f4497b.f4446K && a9 == g.NOT_APPLICABLE && e()) {
                a9 = iVar.a(a());
            }
        } else {
            a9 = g.NOT_APPLICABLE;
        }
        f3277f = a9;
        return a9;
    }

    public final boolean d() {
        return AbstractC3292y.d(f3276e, "NATIONAL");
    }

    public final boolean e() {
        return AbstractC3292y.d(f3276e, "STATE_AND_NATIONAL");
    }
}
