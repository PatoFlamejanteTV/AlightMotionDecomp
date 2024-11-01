package Z4;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2046k;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3775H;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes5.dex */
public final class F1 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f13278a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f13279b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13280c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13281d;

    /* renamed from: e, reason: collision with root package name */
    private int f13282e;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f13283a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13284b;

        public a(ArrayList topList, boolean z8) {
            AbstractC3292y.i(topList, "topList");
            this.f13283a = topList;
            this.f13284b = z8;
        }

        public final boolean a() {
            return this.f13284b;
        }

        public final ArrayList b() {
            return this.f13283a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f13283a, aVar.f13283a) && this.f13284b == aVar.f13284b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13283a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f13284b);
        }

        public String toString() {
            return "TopByCategoryData(topList=" + this.f13283a + ", firstRequest=" + this.f13284b + ')';
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13285a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13287c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2046k f13288d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, C2046k c2046k, U5.d dVar) {
            super(2, dVar);
            this.f13287c = context;
            this.f13288d = c2046k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f13287c, this.f13288d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13285a == 0) {
                Q5.t.b(obj);
                F1.this.k(true);
                F1.this.f13282e = 0;
                F1.this.f13278a.setValue(new AbstractC3768A.c(new a(F1.this.i(this.f13287c, this.f13288d), true)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13289a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13291c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2046k f13292d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C2046k c2046k, U5.d dVar) {
            super(2, dVar);
            this.f13291c = context;
            this.f13292d = c2046k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f13291c, this.f13292d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13289a == 0) {
                Q5.t.b(obj);
                F1.this.k(true);
                ArrayList i8 = F1.this.i(this.f13291c, this.f13292d);
                if (i8.isEmpty()) {
                    F1.this.j(true);
                }
                F1.this.f13278a.setValue(new AbstractC3768A.c(new a(i8, false)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public F1() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f13278a = a9;
        this.f13279b = a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i(Context context, C2046k c2046k) {
        c5.K H8;
        C3775H c3775h = new C3775H(context);
        ArrayList arrayList = new ArrayList();
        if (c2046k.b() > 0) {
            if (c2046k.s()) {
                arrayList = c3775h.G0(c3775h.g0(c2046k.b(), 40, this.f13282e));
            } else if (c2046k.p()) {
                arrayList = c3775h.G0(c3775h.d0(c2046k.b(), 40, this.f13282e));
            } else {
                arrayList = c3775h.G0(c3775h.c0(c2046k.b(), 40, this.f13282e));
            }
        } else if (c2046k.b() == -1) {
            arrayList = c3775h.G0(c3775h.b0(40, this.f13282e));
        } else if (c2046k.b() == -2) {
            if (c2046k.i() > 0) {
                H8 = c3775h.T(c2046k.i(), 40, this.f13282e);
            } else {
                H8 = c3775h.H(40, this.f13282e);
            }
            arrayList = c3775h.G0(H8);
        } else if (c2046k.b() == -3) {
            arrayList = c3775h.G0(c3775h.D(40, this.f13282e));
        }
        this.f13282e += arrayList.size();
        return arrayList;
    }

    public final void d(Context context, C2046k category) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(category, "category");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, category, null), 2, null);
    }

    public final void e(Context context, C2046k category) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(category, "category");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, category, null), 2, null);
    }

    public final boolean f() {
        return this.f13281d;
    }

    public final InterfaceC3813L g() {
        return this.f13279b;
    }

    public final boolean h() {
        return this.f13280c;
    }

    public final void j(boolean z8) {
        this.f13281d = z8;
    }

    public final void k(boolean z8) {
        this.f13280c = z8;
    }
}
