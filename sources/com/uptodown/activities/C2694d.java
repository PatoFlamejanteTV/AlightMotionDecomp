package com.uptodown.activities;

import R5.AbstractC1435t;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2041f;
import c6.InterfaceC2072n;
import com.uptodown.activities.C2694d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3784i;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* renamed from: com.uptodown.activities.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2694d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30438a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30439b;

    /* renamed from: com.uptodown.activities.d$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30440a;

        public a(ArrayList tmpUserApps) {
            AbstractC3292y.i(tmpUserApps, "tmpUserApps");
            this.f30440a = tmpUserApps;
        }

        public final ArrayList a() {
            return this.f30440a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f30440a, ((a) obj).f30440a);
        }

        public int hashCode() {
            return this.f30440a.hashCode();
        }

        public String toString() {
            return "FreeUpSpaceData(tmpUserApps=" + this.f30440a + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30442b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2694d f30443c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30444d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C2694d c2694d, Context context, U5.d dVar) {
            super(2, dVar);
            this.f30442b = z8;
            this.f30443c = c2694d;
            this.f30444d = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int k(C2041f c2041f, C2041f c2041f2) {
            return AbstractC3292y.l(c2041f2.Z(), c2041f.Z());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int p(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
            return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30442b, this.f30443c, this.f30444d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30441a == 0) {
                Q5.t.b(obj);
                if (this.f30442b) {
                    this.f30443c.f30438a.setValue(AbstractC3768A.a.f37253a);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = new C3784i().C(this.f30444d).iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2041f c2041f = (C2041f) next;
                    S4.f fVar = new S4.f();
                    Context context = this.f30444d;
                    String Q8 = c2041f.Q();
                    AbstractC3292y.f(Q8);
                    if (!fVar.p(context, Q8) && !c2041f.n0() && !c2041f.l0()) {
                        arrayList.add(c2041f);
                    }
                }
                final InterfaceC2072n interfaceC2072n = new InterfaceC2072n() { // from class: com.uptodown.activities.e
                    @Override // c6.InterfaceC2072n
                    public final Object invoke(Object obj2, Object obj3) {
                        int k8;
                        k8 = C2694d.b.k((C2041f) obj2, (C2041f) obj3);
                        return Integer.valueOf(k8);
                    }
                };
                AbstractC1435t.B(arrayList, new Comparator() { // from class: com.uptodown.activities.f
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        int p8;
                        p8 = C2694d.b.p(InterfaceC2072n.this, obj2, obj3);
                        return p8;
                    }
                });
                this.f30443c.f30438a.setValue(new AbstractC3768A.c(new a(arrayList)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C2694d() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30438a = a9;
        this.f30439b = a9;
    }

    public final void b(Context context, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3813L c() {
        return this.f30439b;
    }
}
