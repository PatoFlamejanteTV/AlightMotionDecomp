package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c6.InterfaceC2072n;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class y extends ViewModel {

    /* renamed from: d, reason: collision with root package name */
    public static final a f30656d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30657a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30658b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30659c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30660a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30661b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f30662c;

        public b(ArrayList searchResults, boolean z8, boolean z9) {
            AbstractC3292y.i(searchResults, "searchResults");
            this.f30660a = searchResults;
            this.f30661b = z8;
            this.f30662c = z9;
        }

        public final boolean a() {
            return this.f30661b;
        }

        public final boolean b() {
            return this.f30662c;
        }

        public final ArrayList c() {
            return this.f30660a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f30660a, bVar.f30660a) && this.f30661b == bVar.f30661b && this.f30662c == bVar.f30662c;
        }

        public int hashCode() {
            return (((this.f30660a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f30661b)) * 31) + androidx.compose.foundation.a.a(this.f30662c);
        }

        public String toString() {
            return "SearchData(searchResults=" + this.f30660a + ", firstRequest=" + this.f30661b + ", hasMoreResults=" + this.f30662c + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30663a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30665c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30666d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f30667e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, String str, int i8, U5.d dVar) {
            super(2, dVar);
            this.f30665c = context;
            this.f30666d = str;
            this.f30667e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30665c, this.f30666d, this.f30667e, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x00a5, code lost:            if (r8.size() < 29) goto L29;     */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078 A[LOOP:0: B:18:0x0076->B:19:0x0078, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                V5.b.e()
                int r0 = r7.f30663a
                if (r0 != 0) goto Lbf
                Q5.t.b(r8)
                com.uptodown.activities.y r8 = com.uptodown.activities.y.this
                q6.w r8 = com.uptodown.activities.y.a(r8)
                q5.A$a r0 = q5.AbstractC3768A.a.f37253a
                r8.setValue(r0)
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                q5.H r0 = new q5.H
                android.content.Context r1 = r7.f30665c
                r0.<init>(r1)
                java.lang.String r1 = r7.f30666d
                r2 = 30
                int r3 = r7.f30667e
                c5.K r0 = r0.N0(r1, r2, r3)
                boolean r1 = r0.b()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L9a
                java.lang.String r1 = r0.d()
                if (r1 == 0) goto L9a
                org.json.JSONObject r1 = new org.json.JSONObject
                java.lang.String r0 = r0.d()
                kotlin.jvm.internal.AbstractC3292y.f(r0)
                r1.<init>(r0)
                java.lang.String r0 = "success"
                boolean r4 = r1.isNull(r0)
                if (r4 != 0) goto L52
                int r0 = r1.getInt(r0)
                goto L53
            L52:
                r0 = 0
            L53:
                java.lang.String r4 = "data"
                boolean r5 = r1.isNull(r4)
                if (r5 != 0) goto L6c
                org.json.JSONObject r1 = r1.getJSONObject(r4)
                java.lang.String r4 = "results"
                boolean r5 = r1.isNull(r4)
                if (r5 != 0) goto L6c
                org.json.JSONArray r1 = r1.getJSONArray(r4)
                goto L6d
            L6c:
                r1 = 0
            L6d:
                if (r0 != r2) goto L9a
                if (r1 == 0) goto L9a
                int r0 = r1.length()
                r4 = 0
            L76:
                if (r4 >= r0) goto L9a
                org.json.JSONObject r5 = r1.getJSONObject(r4)
                c5.h$b r6 = c5.C2043h.f15796F0
                kotlin.jvm.internal.AbstractC3292y.f(r5)
                c5.h r5 = r6.a(r5)
                r8.add(r5)
                com.squareup.picasso.s r6 = com.squareup.picasso.s.h()
                java.lang.String r5 = r5.k0()
                com.squareup.picasso.w r5 = r6.l(r5)
                r5.d()
                int r4 = r4 + 1
                goto L76
            L9a:
                int r0 = r7.f30667e
                if (r0 <= 0) goto La8
                int r0 = r8.size()
                r1 = 29
                r2 = 0
                if (r0 >= r1) goto La8
                goto La9
            La8:
                r3 = 1
            La9:
                com.uptodown.activities.y r0 = com.uptodown.activities.y.this
                q6.w r0 = com.uptodown.activities.y.a(r0)
                q5.A$c r1 = new q5.A$c
                com.uptodown.activities.y$b r4 = new com.uptodown.activities.y$b
                r4.<init>(r8, r2, r3)
                r1.<init>(r4)
                r0.setValue(r1)
                Q5.I r8 = Q5.I.f8786a
                return r8
            Lbf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.y.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public y() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.b.f37254a);
        this.f30657a = a9;
        this.f30658b = a9;
    }

    public final void b(Context context, String textToSearch, int i8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(textToSearch, "textToSearch");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, textToSearch, i8, null), 2, null);
    }

    public final InterfaceC3813L c() {
        return this.f30658b;
    }

    public final boolean d() {
        return this.f30659c;
    }

    public final void e(boolean z8) {
        this.f30659c = z8;
    }
}
