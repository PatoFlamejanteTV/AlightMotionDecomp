package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2041f;
import c6.InterfaceC2072n;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3784i;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* renamed from: com.uptodown.activities.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2705o extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30482a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30483b;

    /* renamed from: com.uptodown.activities.o$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30484a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f30485b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f30486c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f30487d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList f30488e;

        public a(ArrayList tmpUserApps, ArrayList tmpSystemApps, ArrayList tmpDisabledApps, ArrayList tmpSystemServices, ArrayList tmpPositiveApps) {
            AbstractC3292y.i(tmpUserApps, "tmpUserApps");
            AbstractC3292y.i(tmpSystemApps, "tmpSystemApps");
            AbstractC3292y.i(tmpDisabledApps, "tmpDisabledApps");
            AbstractC3292y.i(tmpSystemServices, "tmpSystemServices");
            AbstractC3292y.i(tmpPositiveApps, "tmpPositiveApps");
            this.f30484a = tmpUserApps;
            this.f30485b = tmpSystemApps;
            this.f30486c = tmpDisabledApps;
            this.f30487d = tmpSystemServices;
            this.f30488e = tmpPositiveApps;
        }

        public final ArrayList a() {
            return this.f30486c;
        }

        public final ArrayList b() {
            return this.f30485b;
        }

        public final ArrayList c() {
            return this.f30487d;
        }

        public final ArrayList d() {
            return this.f30484a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f30484a, aVar.f30484a) && AbstractC3292y.d(this.f30485b, aVar.f30485b) && AbstractC3292y.d(this.f30486c, aVar.f30486c) && AbstractC3292y.d(this.f30487d, aVar.f30487d) && AbstractC3292y.d(this.f30488e, aVar.f30488e);
        }

        public int hashCode() {
            return (((((((this.f30484a.hashCode() * 31) + this.f30485b.hashCode()) * 31) + this.f30486c.hashCode()) * 31) + this.f30487d.hashCode()) * 31) + this.f30488e.hashCode();
        }

        public String toString() {
            return "MyAppsData(tmpUserApps=" + this.f30484a + ", tmpSystemApps=" + this.f30485b + ", tmpDisabledApps=" + this.f30486c + ", tmpSystemServices=" + this.f30487d + ", tmpPositiveApps=" + this.f30488e + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.uptodown.activities.o$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30489a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30490b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C2705o f30491c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30492d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, C2705o c2705o, Context context, U5.d dVar) {
            super(2, dVar);
            this.f30490b = z8;
            this.f30491c = c2705o;
            this.f30492d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30490b, this.f30491c, this.f30492d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30489a == 0) {
                Q5.t.b(obj);
                if (this.f30490b) {
                    this.f30491c.f30482a.setValue(AbstractC3768A.a.f37253a);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList C8 = new C3784i().C(this.f30492d);
                SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                boolean g02 = aVar.g0(this.f30492d);
                boolean h02 = aVar.h0(this.f30492d);
                Iterator it = C8.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2041f c2041f = (C2041f) next;
                    S4.f fVar = new S4.f();
                    Context context = this.f30492d;
                    String Q8 = c2041f.Q();
                    AbstractC3292y.f(Q8);
                    if (fVar.p(context, Q8)) {
                        kotlin.coroutines.jvm.internal.b.a(arrayList3.add(c2041f));
                    } else if (c2041f.n0()) {
                        if (h02) {
                            arrayList4.add(c2041f);
                        }
                    } else if (c2041f.l0()) {
                        if (g02) {
                            arrayList2.add(c2041f);
                        }
                    } else {
                        kotlin.coroutines.jvm.internal.b.a(arrayList.add(c2041f));
                    }
                    UptodownApp.a aVar2 = UptodownApp.f29249C;
                    if (aVar2.w() != null) {
                        ArrayList w8 = aVar2.w();
                        AbstractC3292y.f(w8);
                        Iterator it2 = w8.iterator();
                        AbstractC3292y.h(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            AbstractC3292y.h(next2, "next(...)");
                            c5.F f8 = (c5.F) next2;
                            if (AbstractC3292y.d(f8.c(), c2041f.X())) {
                                c2041f.E0(f8);
                                arrayList5.add(c2041f);
                            }
                        }
                    }
                }
                C3784i.a aVar3 = C3784i.f37274a;
                aVar3.d(arrayList, this.f30492d);
                aVar3.d(arrayList2, this.f30492d);
                aVar3.d(arrayList4, this.f30492d);
                this.f30491c.f30482a.setValue(new AbstractC3768A.c(new a(arrayList, arrayList2, arrayList3, arrayList4, arrayList5)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C2705o() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30482a = a9;
        this.f30483b = a9;
    }

    public final void b(Context context, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3813L c() {
        return this.f30483b;
    }
}
