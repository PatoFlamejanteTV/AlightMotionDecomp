package com.uptodown.activities;

import R5.AbstractC1435t;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2041f;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3784i;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class w extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30648a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30649b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30650a;

        public a(ArrayList rollbackApps) {
            AbstractC3292y.i(rollbackApps, "rollbackApps");
            this.f30650a = rollbackApps;
        }

        public final ArrayList a() {
            return this.f30650a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f30650a, ((a) obj).f30650a);
        }

        public int hashCode() {
            return this.f30650a.hashCode();
        }

        public String toString() {
            return "RollbackData(rollbackApps=" + this.f30650a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30651a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30652b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f30653c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30654d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, w wVar, Context context, U5.d dVar) {
            super(2, dVar);
            this.f30652b = z8;
            this.f30653c = wVar;
            this.f30654d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30652b, this.f30653c, this.f30654d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30651a == 0) {
                Q5.t.b(obj);
                if (this.f30652b) {
                    this.f30653c.f30648a.setValue(AbstractC3768A.a.f37253a);
                }
                this.f30653c.f30648a.setValue(new AbstractC3768A.c(new a(this.f30653c.e(this.f30654d, new C3784i().C(this.f30654d)))));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(((C2041f) obj).z(), ((C2041f) obj2).z());
        }
    }

    public w() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30648a = a9;
        this.f30649b = a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList e(Context context, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!l6.n.s(context.getPackageName(), ((C2041f) arrayList.get(i8)).Q(), true)) {
                S4.f fVar = new S4.f();
                String Q8 = ((C2041f) arrayList.get(i8)).Q();
                AbstractC3292y.f(Q8);
                if (!fVar.p(context, Q8) && !((C2041f) arrayList.get(i8)).l0() && ((C2041f) arrayList.get(i8)).s() == 1) {
                    arrayList2.add(arrayList.get(i8));
                }
            }
        }
        if (arrayList2.size() > 1) {
            AbstractC1435t.B(arrayList2, new c());
        }
        return arrayList2;
    }

    public final void c(Context context, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3813L d() {
        return this.f30649b;
    }
}
