package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.I;
import c5.M;
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
public final class u extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30585a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30586b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f30587c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f30588d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f30589e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f30590f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f30591g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f30592h;

    /* renamed from: i, reason: collision with root package name */
    private q6.w f30593i;

    /* renamed from: j, reason: collision with root package name */
    private q6.w f30594j;

    /* renamed from: k, reason: collision with root package name */
    private q6.w f30595k;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30596a;

        public a(ArrayList replies) {
            AbstractC3292y.i(replies, "replies");
            this.f30596a = replies;
        }

        public final ArrayList a() {
            return this.f30596a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f30596a, ((a) obj).f30596a);
        }

        public int hashCode() {
            return this.f30596a.hashCode();
        }

        public String toString() {
            return "RepliesData(replies=" + this.f30596a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c5.I f30597a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30598b;

        public b(c5.I reply, int i8) {
            AbstractC3292y.i(reply, "reply");
            this.f30597a = reply;
            this.f30598b = i8;
        }

        public final int a() {
            return this.f30598b;
        }

        public final c5.I b() {
            return this.f30597a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f30597a, bVar.f30597a) && this.f30598b == bVar.f30598b;
        }

        public int hashCode() {
            return (this.f30597a.hashCode() * 31) + this.f30598b;
        }

        public String toString() {
            return "ReplyLikedData(reply=" + this.f30597a + ", likedSuccess=" + this.f30598b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final int f30599a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30600b;

        /* renamed from: c, reason: collision with root package name */
        private final String f30601c;

        /* renamed from: d, reason: collision with root package name */
        private final long f30602d;

        /* renamed from: e, reason: collision with root package name */
        private final String f30603e;

        public c(int i8, int i9, String text, long j8, String str) {
            AbstractC3292y.i(text, "text");
            this.f30599a = i8;
            this.f30600b = i9;
            this.f30601c = text;
            this.f30602d = j8;
            this.f30603e = str;
        }

        public final String a() {
            return this.f30603e;
        }

        public final int b() {
            return this.f30600b;
        }

        public final int c() {
            return this.f30599a;
        }

        public final String d() {
            return this.f30601c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f30599a == cVar.f30599a && this.f30600b == cVar.f30600b && AbstractC3292y.d(this.f30601c, cVar.f30601c) && this.f30602d == cVar.f30602d && AbstractC3292y.d(this.f30603e, cVar.f30603e);
        }

        public int hashCode() {
            int hashCode = ((((((this.f30599a * 31) + this.f30600b) * 31) + this.f30601c.hashCode()) * 31) + androidx.collection.a.a(this.f30602d)) * 31;
            String str = this.f30603e;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SendReplyData(success=" + this.f30599a + ", statusCode=" + this.f30600b + ", text=" + this.f30601c + ", reviewID=" + this.f30602d + ", msg=" + this.f30603e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30604a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30605b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f30606c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f30607d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, long j8, u uVar, U5.d dVar) {
            super(2, dVar);
            this.f30605b = context;
            this.f30606c = j8;
            this.f30607d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30605b, this.f30606c, this.f30607d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONArray jSONArray;
            V5.b.e();
            if (this.f30604a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                int i8 = 0;
                c5.K V8 = new C3775H(this.f30605b).V(this.f30606c, 10, 0);
                if (!V8.b() && V8.d() != null) {
                    String d8 = V8.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONArray = null;
                    }
                    if (i8 == 1 && jSONArray != null) {
                        arrayList = c5.I.f15600l.c(jSONArray);
                    }
                } else {
                    arrayList = new ArrayList();
                }
                this.f30607d.f30585a.setValue(new AbstractC3768A.c(new a(arrayList)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30608a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.I f30609b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30610c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f30611d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c5.I i8, Context context, u uVar, U5.d dVar) {
            super(2, dVar);
            this.f30609b = i8;
            this.f30610c = context;
            this.f30611d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f30609b, this.f30610c, this.f30611d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30608a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                I.b bVar = c5.I.f15600l;
                c5.I i9 = this.f30609b;
                Context context = this.f30610c;
                this.f30608a = 1;
                obj = bVar.b(i9, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f30611d.f30589e.setValue(new AbstractC3768A.c(new b(this.f30609b, ((Number) obj).intValue())));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.M f30613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30614c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ u f30615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c5.M m8, Context context, u uVar, U5.d dVar) {
            super(2, dVar);
            this.f30613b = m8;
            this.f30614c = context;
            this.f30615d = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f30613b, this.f30614c, this.f30615d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30612a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                M.b bVar = c5.M.f15633o;
                c5.M m8 = this.f30613b;
                Context context = this.f30614c;
                this.f30612a = 1;
                obj = bVar.c(m8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f30615d.f30587c.setValue(new AbstractC3768A.c(new M.c(this.f30613b, ((Number) obj).intValue())));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30616a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30618c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f30619d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u f30620e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, String str, long j8, u uVar, U5.d dVar) {
            super(2, dVar);
            this.f30617b = context;
            this.f30618c = str;
            this.f30619d = j8;
            this.f30620e = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f30617b, this.f30618c, this.f30619d, this.f30620e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            int i8;
            V5.b.e();
            if (this.f30616a == 0) {
                Q5.t.b(obj);
                c5.M.f15633o.f(this.f30617b, this.f30618c, String.valueOf(System.currentTimeMillis()));
                c5.K I02 = new C3775H(this.f30617b).I0(this.f30619d, this.f30618c);
                int i9 = 0;
                String str2 = null;
                if (!I02.b() && I02.d() != null) {
                    String d8 = I02.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i9 = jSONObject.getInt("success");
                    }
                    if (i9 == 0) {
                        str2 = I02.g(jSONObject);
                    }
                    i8 = i9;
                    str = str2;
                } else {
                    str = null;
                    i8 = 0;
                }
                this.f30620e.f30591g.setValue(new AbstractC3768A.c(new c(i8, I02.e(), this.f30618c, this.f30619d, str)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public u() {
        AbstractC3768A.a aVar = AbstractC3768A.a.f37253a;
        q6.w a9 = AbstractC3815N.a(aVar);
        this.f30585a = a9;
        this.f30586b = a9;
        q6.w a10 = AbstractC3815N.a(aVar);
        this.f30587c = a10;
        this.f30588d = a10;
        q6.w a11 = AbstractC3815N.a(aVar);
        this.f30589e = a11;
        this.f30590f = a11;
        q6.w a12 = AbstractC3815N.a(aVar);
        this.f30591g = a12;
        this.f30592h = a12;
        this.f30593i = AbstractC3815N.a("");
        this.f30594j = AbstractC3815N.a("");
        this.f30595k = AbstractC3815N.a(null);
    }

    public final void e(Context context, long j8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(context, j8, this, null), 2, null);
    }

    public final q6.w f() {
        return this.f30593i;
    }

    public final InterfaceC3813L g() {
        return this.f30586b;
    }

    public final InterfaceC3813L h() {
        return this.f30590f;
    }

    public final InterfaceC3813L i() {
        return this.f30588d;
    }

    public final q6.w j() {
        return this.f30595k;
    }

    public final InterfaceC3813L k() {
        return this.f30592h;
    }

    public final q6.w l() {
        return this.f30594j;
    }

    public final void m(Context context, c5.I reply) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(reply, "reply");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(reply, context, this, null), 2, null);
    }

    public final void n(Context context, c5.M review) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(review, "review");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new f(review, context, this, null), 2, null);
    }

    public final void o(Context context, String text, long j8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(text, "text");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new g(context, text, j8, this, null), 2, null);
    }
}
