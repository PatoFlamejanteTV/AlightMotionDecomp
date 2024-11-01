package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2041f;
import c5.Q;
import c6.InterfaceC2072n;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3784i;
import q5.C3791p;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class F extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29480a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29481b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f29482a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29483b;

        public a(boolean z8, boolean z9) {
            this.f29482a = z8;
            this.f29483b = z9;
        }

        public final boolean a() {
            return this.f29483b;
        }

        public final boolean b() {
            return this.f29482a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29482a == aVar.f29482a && this.f29483b == aVar.f29483b;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f29482a) * 31) + androidx.compose.foundation.a.a(this.f29483b);
        }

        public String toString() {
            return "DownloadAllButtonData(hasUpdates=" + this.f29482a + ", allCompleted=" + this.f29483b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29484a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29485b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f29486c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f29487d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList f29488e;

        /* renamed from: f, reason: collision with root package name */
        private final a f29489f;

        public b(ArrayList updates, ArrayList disabled, ArrayList ignored, ArrayList recentlyUpdated, ArrayList positives, a downloadAllButtonData) {
            AbstractC3292y.i(updates, "updates");
            AbstractC3292y.i(disabled, "disabled");
            AbstractC3292y.i(ignored, "ignored");
            AbstractC3292y.i(recentlyUpdated, "recentlyUpdated");
            AbstractC3292y.i(positives, "positives");
            AbstractC3292y.i(downloadAllButtonData, "downloadAllButtonData");
            this.f29484a = updates;
            this.f29485b = disabled;
            this.f29486c = ignored;
            this.f29487d = recentlyUpdated;
            this.f29488e = positives;
            this.f29489f = downloadAllButtonData;
        }

        public final ArrayList a() {
            return this.f29485b;
        }

        public final a b() {
            return this.f29489f;
        }

        public final ArrayList c() {
            return this.f29486c;
        }

        public final ArrayList d() {
            return this.f29487d;
        }

        public final ArrayList e() {
            return this.f29484a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f29484a, bVar.f29484a) && AbstractC3292y.d(this.f29485b, bVar.f29485b) && AbstractC3292y.d(this.f29486c, bVar.f29486c) && AbstractC3292y.d(this.f29487d, bVar.f29487d) && AbstractC3292y.d(this.f29488e, bVar.f29488e) && AbstractC3292y.d(this.f29489f, bVar.f29489f);
        }

        public int hashCode() {
            return (((((((((this.f29484a.hashCode() * 31) + this.f29485b.hashCode()) * 31) + this.f29486c.hashCode()) * 31) + this.f29487d.hashCode()) * 31) + this.f29488e.hashCode()) * 31) + this.f29489f.hashCode();
        }

        public String toString() {
            return "UpdatesData(updates=" + this.f29484a + ", disabled=" + this.f29485b + ", ignored=" + this.f29486c + ", recentlyUpdated=" + this.f29487d + ", positives=" + this.f29488e + ", downloadAllButtonData=" + this.f29489f + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29490a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29491b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29492c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f29493d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, Context context, ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f29491b = z8;
            this.f29492c = context;
            this.f29493d = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29491b, this.f29492c, this.f29493d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:            r6 = false;     */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                V5.b.e()
                int r0 = r12.f29490a
                if (r0 != 0) goto Lcf
                Q5.t.b(r13)
                boolean r13 = r12.f29491b
                r0 = 1
                if (r13 == 0) goto Lca
                q5.p$a r13 = q5.C3791p.f37286s
                android.content.Context r1 = r12.f29492c
                q5.p r13 = r13.a(r1)
                r13.a()
                q5.s r1 = new q5.s
                r1.<init>()
                android.content.Context r2 = r12.f29492c
                java.util.ArrayList r1 = r1.e(r2)
                java.util.ArrayList r2 = r12.f29493d
                java.util.Iterator r2 = r2.iterator()
                java.lang.String r3 = "iterator(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r2, r3)
            L30:
                r4 = 1
            L31:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto Lc6
                java.lang.Object r5 = r2.next()
                java.lang.String r6 = "next(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r5, r6)
                c5.Q r5 = (c5.Q) r5
                java.lang.String r7 = r5.l()
                r8 = 0
                if (r7 == 0) goto Lc3
                java.util.Iterator r7 = r1.iterator()
                kotlin.jvm.internal.AbstractC3292y.h(r7, r3)
            L50:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L97
                java.lang.Object r9 = r7.next()
                kotlin.jvm.internal.AbstractC3292y.h(r9, r6)
                java.io.File r9 = (java.io.File) r9
                java.lang.String r10 = r5.l()
                java.lang.String r11 = r9.getName()
                boolean r10 = l6.n.s(r10, r11, r0)
                if (r10 == 0) goto L50
                int r6 = r5.u()
                r7 = 100
                if (r6 != r7) goto L77
                r6 = 1
                goto L78
            L77:
                r6 = 0
            L78:
                if (r6 == 0) goto L98
                java.lang.String r7 = r5.f()
                if (r7 == 0) goto L98
                S4.d r7 = S4.d.f9430a
                java.lang.String r10 = r9.getAbsolutePath()
                java.lang.String r7 = r7.e(r10)
                java.lang.String r10 = r5.f()
                boolean r7 = l6.n.s(r10, r7, r0)
                if (r7 != 0) goto L98
                r9.delete()
            L97:
                r6 = 0
            L98:
                if (r6 != 0) goto Lbd
                q5.s r7 = new q5.s
                r7.<init>()
                android.content.Context r9 = r12.f29492c
                java.io.File r7 = r7.g(r9)
                java.io.File r9 = new java.io.File
                java.lang.String r10 = r5.l()
                kotlin.jvm.internal.AbstractC3292y.f(r10)
                r9.<init>(r7, r10)
                boolean r7 = r9.exists()
                if (r7 != 0) goto Lbd
                r5.X(r8)
                r13.p1(r5)
            Lbd:
                if (r4 == 0) goto Lc3
                if (r6 == 0) goto Lc3
                goto L30
            Lc3:
                r4 = 0
                goto L31
            Lc6:
                r13.i()
                r0 = r4
            Lca:
                java.lang.Boolean r13 = kotlin.coroutines.jvm.internal.b.a(r0)
                return r13
            Lcf:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.F.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f29494a;

        /* renamed from: b, reason: collision with root package name */
        Object f29495b;

        /* renamed from: c, reason: collision with root package name */
        Object f29496c;

        /* renamed from: d, reason: collision with root package name */
        Object f29497d;

        /* renamed from: e, reason: collision with root package name */
        Object f29498e;

        /* renamed from: f, reason: collision with root package name */
        Object f29499f;

        /* renamed from: g, reason: collision with root package name */
        boolean f29500g;

        /* renamed from: h, reason: collision with root package name */
        int f29501h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f29502i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ F f29503j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Context f29504k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, F f8, Context context, U5.d dVar) {
            super(2, dVar);
            this.f29502i = z8;
            this.f29503j = f8;
            this.f29504k = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f29502i, this.f29503j, this.f29504k, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Object g8;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            boolean add;
            Object d8;
            boolean z8;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Object e8 = V5.b.e();
            int i8 = this.f29501h;
            int i9 = 1;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        z8 = this.f29500g;
                        ArrayList arrayList12 = (ArrayList) this.f29498e;
                        ArrayList arrayList13 = (ArrayList) this.f29497d;
                        ArrayList arrayList14 = (ArrayList) this.f29496c;
                        ArrayList arrayList15 = (ArrayList) this.f29495b;
                        ArrayList arrayList16 = (ArrayList) this.f29494a;
                        Q5.t.b(obj);
                        arrayList7 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList10 = arrayList14;
                        d8 = obj;
                        arrayList11 = arrayList15;
                        arrayList9 = arrayList16;
                        this.f29503j.f29480a.setValue(new AbstractC3768A.c(new b(arrayList9, arrayList11, arrayList10, arrayList8, arrayList7, new a(z8, ((Boolean) d8).booleanValue()))));
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ArrayList arrayList17 = (ArrayList) this.f29499f;
                arrayList4 = (ArrayList) this.f29498e;
                arrayList3 = (ArrayList) this.f29497d;
                arrayList6 = (ArrayList) this.f29496c;
                arrayList = (ArrayList) this.f29495b;
                arrayList5 = (ArrayList) this.f29494a;
                Q5.t.b(obj);
                arrayList2 = arrayList17;
                g8 = obj;
            } else {
                Q5.t.b(obj);
                if (this.f29502i) {
                    this.f29503j.f29480a.setValue(AbstractC3768A.a.f37253a);
                }
                ArrayList C8 = new C3784i().C(this.f29504k);
                C3791p a9 = C3791p.f37286s.a(this.f29504k);
                a9.a();
                ArrayList arrayList18 = new ArrayList();
                arrayList = new ArrayList();
                ArrayList arrayList19 = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                Iterator it = C8.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    C2041f c2041f = (C2041f) next;
                    if (c2041f.i0(this.f29504k)) {
                        if (c2041f.i() == i9) {
                            c2041f.J0(C2041f.c.f15790a);
                            kotlin.coroutines.jvm.internal.b.a(arrayList19.add(c2041f));
                        } else {
                            String Q8 = c2041f.Q();
                            AbstractC3292y.f(Q8);
                            Q s02 = a9.s0(Q8);
                            if (s02 == null) {
                                if (c2041f.j0()) {
                                    c2041f.J0(C2041f.c.f15791b);
                                    arrayList20.add(c2041f);
                                }
                                Q5.I i10 = Q5.I.f8786a;
                            } else if (s02.h() == i9) {
                                kotlin.coroutines.jvm.internal.b.a(arrayList19.add(c2041f));
                            } else {
                                c2041f.J0(C2041f.c.f15790a);
                                S4.f fVar = new S4.f();
                                Context context = this.f29504k;
                                String Q9 = c2041f.Q();
                                AbstractC3292y.f(Q9);
                                if (fVar.p(context, Q9)) {
                                    add = arrayList.add(c2041f);
                                } else {
                                    add = arrayList18.add(c2041f);
                                }
                                kotlin.coroutines.jvm.internal.b.a(add);
                            }
                            if (s02 != null && s02.p() == 0) {
                                s02.W(1);
                                a9.p1(s02);
                            }
                        }
                    }
                    UptodownApp.a aVar = UptodownApp.f29249C;
                    if (aVar.w() != null) {
                        ArrayList w8 = aVar.w();
                        AbstractC3292y.f(w8);
                        Iterator it2 = w8.iterator();
                        AbstractC3292y.h(it2, "iterator(...)");
                        while (it2.hasNext()) {
                            Object next2 = it2.next();
                            AbstractC3292y.h(next2, "next(...)");
                            c5.F f8 = (c5.F) next2;
                            if (AbstractC3292y.d(f8.c(), c2041f.X())) {
                                c2041f.E0(f8);
                                arrayList21.add(c2041f);
                            }
                        }
                    }
                    i9 = 1;
                }
                C3784i.a aVar2 = C3784i.f37274a;
                aVar2.d(arrayList18, this.f29504k);
                aVar2.f(arrayList20);
                aVar2.d(arrayList19, this.f29504k);
                aVar2.d(arrayList, this.f29504k);
                ArrayList<Q> t02 = a9.t0();
                a9.i();
                arrayList2 = new ArrayList();
                for (Q q8 : t02) {
                    Iterator it3 = arrayList18.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC3292y.d(q8.s(), ((C2041f) it3.next()).Q())) {
                            arrayList2.add(q8);
                        }
                    }
                }
                F f9 = this.f29503j;
                this.f29494a = arrayList18;
                this.f29495b = arrayList;
                this.f29496c = arrayList19;
                this.f29497d = arrayList20;
                this.f29498e = arrayList21;
                this.f29499f = arrayList2;
                this.f29501h = 1;
                g8 = f9.g(t02, arrayList18, this);
                if (g8 == e8) {
                    return e8;
                }
                arrayList3 = arrayList20;
                arrayList4 = arrayList21;
                arrayList5 = arrayList18;
                arrayList6 = arrayList19;
            }
            boolean booleanValue = ((Boolean) g8).booleanValue();
            F f10 = this.f29503j;
            Context context2 = this.f29504k;
            this.f29494a = arrayList5;
            this.f29495b = arrayList;
            this.f29496c = arrayList6;
            this.f29497d = arrayList3;
            this.f29498e = arrayList4;
            this.f29499f = null;
            this.f29500g = booleanValue;
            this.f29501h = 2;
            d8 = f10.d(context2, arrayList2, booleanValue, this);
            if (d8 == e8) {
                return e8;
            }
            z8 = booleanValue;
            arrayList7 = arrayList4;
            ArrayList arrayList22 = arrayList5;
            arrayList8 = arrayList3;
            arrayList9 = arrayList22;
            ArrayList arrayList23 = arrayList;
            arrayList10 = arrayList6;
            arrayList11 = arrayList23;
            this.f29503j.f29480a.setValue(new AbstractC3768A.c(new b(arrayList9, arrayList11, arrayList10, arrayList8, arrayList7, new a(z8, ((Boolean) d8).booleanValue()))));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29505a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29506b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29507c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList arrayList, ArrayList arrayList2, U5.d dVar) {
            super(2, dVar);
            this.f29506b = arrayList;
            this.f29507c = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f29506b, this.f29507c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29505a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(this.f29506b);
                int size = arrayList2.size();
                boolean z8 = false;
                for (int i8 = 0; i8 < size; i8++) {
                    Iterator it = this.f29507c.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            Q q8 = (Q) next;
                            String Q8 = ((C2041f) arrayList2.get(i8)).Q();
                            if (Q8 != null && l6.n.s(Q8, q8.s(), true) && ((C2041f) arrayList2.get(i8)).i() == 0) {
                                arrayList.add(q8);
                                break;
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    z8 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public F() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f29480a = a9;
        this.f29481b = a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Context context, ArrayList arrayList, boolean z8, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new c(z8, context, arrayList, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(ArrayList arrayList, ArrayList arrayList2, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new e(arrayList2, arrayList, null), dVar);
    }

    public final void e(Context context, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(z8, this, context, null), 2, null);
    }

    public final InterfaceC3813L f() {
        return this.f29481b;
    }
}
