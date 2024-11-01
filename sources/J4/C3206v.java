package j4;

import R5.AbstractC1435t;
import c6.InterfaceC2072n;
import com.stripe.android.view.C2673s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import q6.InterfaceC3813L;
import r4.D;
import w4.C4156a;

/* renamed from: j4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3206v implements r4.D {

    /* renamed from: a, reason: collision with root package name */
    private final r4.G f34291a;

    /* renamed from: b, reason: collision with root package name */
    private final List f34292b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f34293c;

    /* renamed from: d, reason: collision with root package name */
    private final C2.c f34294d;

    /* renamed from: e, reason: collision with root package name */
    private final r4.q0 f34295e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f34296f;

    /* renamed from: j4.v$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String textFieldValue) {
            AbstractC3292y.i(textFieldValue, "textFieldValue");
            List list = C3206v.this.f34292b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (l6.n.B(textFieldValue, ((C2673s.a) obj).b(), false, 2, null)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1435t.x(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C2673s.a) it.next()).a());
            }
            return (String) AbstractC1435t.o0(arrayList2);
        }
    }

    /* renamed from: j4.v$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3293z implements InterfaceC2072n {
        b() {
            super(2);
        }

        public final List a(boolean z8, String fieldValue) {
            AbstractC3292y.i(fieldValue, "fieldValue");
            return AbstractC1435t.e(Q5.x.a(C3206v.this.a(), new C4156a(fieldValue, z8)));
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (String) obj2);
        }
    }

    public C3206v(r4.G identifierSpec, List banks, String str) {
        AbstractC3292y.i(identifierSpec, "identifierSpec");
        AbstractC3292y.i(banks, "banks");
        this.f34291a = identifierSpec;
        this.f34292b = banks;
        this.f34293c = true;
        r4.q0 q0Var = new r4.q0(r4.G.Companion.a("au_becs_debit[bsb_number]"), new r4.s0(new C3205u(banks), false, str, 2, null));
        this.f34295e = q0Var;
        this.f34296f = A4.g.m(q0Var.i().j(), new a());
    }

    @Override // r4.D
    public r4.G a() {
        return this.f34291a;
    }

    @Override // r4.D
    public C2.c b() {
        return this.f34294d;
    }

    @Override // r4.D
    public boolean c() {
        return this.f34293c;
    }

    @Override // r4.D
    public InterfaceC3813L d() {
        return A4.g.d(this.f34295e.i().t(), this.f34295e.i().j(), new b());
    }

    @Override // r4.D
    public InterfaceC3813L e() {
        return D.a.a(this);
    }

    public final InterfaceC3813L g() {
        return this.f34296f;
    }

    public final r4.q0 h() {
        return this.f34295e;
    }
}
