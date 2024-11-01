package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2044i;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class J extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29576a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29577b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f29578c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f29579d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f29580e;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29581a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29582b;

        public a(ArrayList avatars, ArrayList turboAvatars) {
            AbstractC3292y.i(avatars, "avatars");
            AbstractC3292y.i(turboAvatars, "turboAvatars");
            this.f29581a = avatars;
            this.f29582b = turboAvatars;
        }

        public final ArrayList a() {
            return this.f29581a;
        }

        public final ArrayList b() {
            return this.f29582b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f29581a, aVar.f29581a) && AbstractC3292y.d(this.f29582b, aVar.f29582b);
        }

        public int hashCode() {
            return (this.f29581a.hashCode() * 31) + this.f29582b.hashCode();
        }

        public String toString() {
            return "AvatarsData(avatars=" + this.f29581a + ", turboAvatars=" + this.f29582b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29583a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29584b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29585c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f29586d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ J f29587e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, ArrayList arrayList, ArrayList arrayList2, J j8, U5.d dVar) {
            super(2, dVar);
            this.f29584b = context;
            this.f29585c = arrayList;
            this.f29586d = arrayList2;
            this.f29587e = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f29584b, this.f29585c, this.f29586d, this.f29587e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29583a == 0) {
                Q5.t.b(obj);
                c5.K p02 = new C3775H(this.f29584b).p0();
                if (!p02.b() && p02.d() != null) {
                    String d8 = p02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = p02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("basic")) {
                                JSONArray jSONArray = jSONObject2.getJSONArray("basic");
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                                    C2044i.a aVar = C2044i.f15873f;
                                    AbstractC3292y.f(jSONObject3);
                                    this.f29585c.add(aVar.a(jSONObject3));
                                }
                            }
                            if (!jSONObject2.isNull("turbo")) {
                                JSONArray jSONArray2 = jSONObject2.getJSONArray("turbo");
                                int length2 = jSONArray2.length();
                                for (int i9 = 0; i9 < length2; i9++) {
                                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i9);
                                    C2044i.a aVar2 = C2044i.f15873f;
                                    AbstractC3292y.f(jSONObject4);
                                    this.f29586d.add(aVar2.a(jSONObject4));
                                }
                            }
                        }
                    }
                }
                this.f29587e.f29576a.setValue(new AbstractC3768A.c(new a(this.f29585c, this.f29586d)));
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
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29588a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29590c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C2044i f29591d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C2044i c2044i, U5.d dVar) {
            super(2, dVar);
            this.f29590c = context;
            this.f29591d = c2044i;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29590c, this.f29591d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                V5.b.e()
                int r0 = r4.f29588a
                if (r0 != 0) goto La9
                Q5.t.b(r5)
                com.uptodown.activities.J r5 = com.uptodown.activities.J.this
                q6.w r5 = com.uptodown.activities.J.b(r5)
                r0 = 0
                java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r1)
                q5.H r5 = new q5.H
                android.content.Context r1 = r4.f29590c
                r5.<init>(r1)
                c5.i r1 = r4.f29591d
                long r1 = r1.d()
                c5.K r5 = r5.Q0(r1)
                boolean r1 = r5.b()
                r2 = 1
                if (r1 != 0) goto L88
                java.lang.String r1 = r5.d()
                if (r1 == 0) goto L88
                java.lang.String r1 = r5.d()
                kotlin.jvm.internal.AbstractC3292y.f(r1)
                int r1 = r1.length()
                if (r1 <= 0) goto L88
                org.json.JSONObject r1 = new org.json.JSONObject
                java.lang.String r5 = r5.d()
                kotlin.jvm.internal.AbstractC3292y.f(r5)
                r1.<init>(r5)
                java.lang.String r5 = "success"
                boolean r3 = r1.isNull(r5)
                if (r3 != 0) goto L88
                int r5 = r1.getInt(r5)
                if (r5 != r2) goto L89
                com.uptodown.activities.J r1 = com.uptodown.activities.J.this
                q6.w r1 = r1.f()
                java.lang.Object r1 = r1.getValue()
                c5.T r1 = (c5.T) r1
                if (r1 == 0) goto L74
                c5.i r3 = r4.f29591d
                java.lang.String r3 = r3.e()
                r1.Q(r3)
            L74:
                com.uptodown.activities.J r1 = com.uptodown.activities.J.this
                q6.w r1 = r1.f()
                java.lang.Object r1 = r1.getValue()
                c5.T r1 = (c5.T) r1
                if (r1 == 0) goto L89
                android.content.Context r3 = r4.f29590c
                r1.I(r3)
                goto L89
            L88:
                r5 = 0
            L89:
                if (r5 != r2) goto L99
                com.uptodown.activities.J r5 = com.uptodown.activities.J.this
                q6.w r5 = com.uptodown.activities.J.b(r5)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r2)
                r5.setValue(r0)
                goto La6
            L99:
                com.uptodown.activities.J r5 = com.uptodown.activities.J.this
                q6.w r5 = com.uptodown.activities.J.b(r5)
                java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r0)
                r5.setValue(r0)
            La6:
                Q5.I r5 = Q5.I.f8786a
                return r5
            La9:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.J.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public J() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f29576a = a9;
        this.f29577b = a9;
        q6.w a10 = AbstractC3815N.a(Boolean.FALSE);
        this.f29578c = a10;
        this.f29579d = a10;
        this.f29580e = AbstractC3815N.a(null);
    }

    public final void c(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, new ArrayList(), new ArrayList(), this, null), 2, null);
    }

    public final InterfaceC3813L d() {
        return this.f29577b;
    }

    public final InterfaceC3813L e() {
        return this.f29579d;
    }

    public final q6.w f() {
        return this.f29580e;
    }

    public final void g(Context context, C2044i avatar) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(avatar, "avatar");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, avatar, null), 2, null);
    }
}
