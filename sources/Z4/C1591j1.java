package Z4;

import R5.AbstractC1435t;
import Z4.C1591j1;
import android.content.Context;
import android.os.Bundle;
import androidx.autofill.HintConstants;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2039d;
import c5.C2040e;
import c5.C2043h;
import c5.C2045j;
import c5.C2046k;
import c5.C2054t;
import c5.C2058x;
import c5.M;
import c5.N;
import c5.V;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q5.C3795t;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* renamed from: Z4.j1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1591j1 extends ViewModel {

    /* renamed from: A, reason: collision with root package name */
    private final q6.w f13575A;

    /* renamed from: B, reason: collision with root package name */
    private final q6.w f13576B;

    /* renamed from: C, reason: collision with root package name */
    private final q6.w f13577C;

    /* renamed from: D, reason: collision with root package name */
    private final q6.w f13578D;

    /* renamed from: E, reason: collision with root package name */
    private final q6.w f13579E;

    /* renamed from: F, reason: collision with root package name */
    private final q6.w f13580F;

    /* renamed from: G, reason: collision with root package name */
    private final q6.w f13581G;

    /* renamed from: H, reason: collision with root package name */
    private final q6.w f13582H;

    /* renamed from: I, reason: collision with root package name */
    private final q6.w f13583I;

    /* renamed from: J, reason: collision with root package name */
    private final q6.w f13584J;

    /* renamed from: K, reason: collision with root package name */
    private final q6.w f13585K;

    /* renamed from: L, reason: collision with root package name */
    private final q6.w f13586L;

    /* renamed from: M, reason: collision with root package name */
    private final q6.w f13587M;

    /* renamed from: N, reason: collision with root package name */
    private final q6.w f13588N;

    /* renamed from: O, reason: collision with root package name */
    private final q6.w f13589O;

    /* renamed from: P, reason: collision with root package name */
    private final q6.w f13590P;

    /* renamed from: Q, reason: collision with root package name */
    private final q6.w f13591Q;

    /* renamed from: R, reason: collision with root package name */
    private final q6.w f13592R;

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f13593a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f13594b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f13595c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f13596d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f13597e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f13598f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f13599g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3813L f13600h;

    /* renamed from: i, reason: collision with root package name */
    private final q6.w f13601i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3813L f13602j;

    /* renamed from: k, reason: collision with root package name */
    private final q6.w f13603k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC3813L f13604l;

    /* renamed from: m, reason: collision with root package name */
    private final q6.w f13605m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC3813L f13606n;

    /* renamed from: o, reason: collision with root package name */
    private final q6.w f13607o;

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC3813L f13608p;

    /* renamed from: q, reason: collision with root package name */
    private final q6.w f13609q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3813L f13610r;

    /* renamed from: s, reason: collision with root package name */
    private final q6.w f13611s;

    /* renamed from: t, reason: collision with root package name */
    private final InterfaceC3813L f13612t;

    /* renamed from: u, reason: collision with root package name */
    private final q6.w f13613u;

    /* renamed from: v, reason: collision with root package name */
    private final InterfaceC3813L f13614v;

    /* renamed from: w, reason: collision with root package name */
    private final q6.w f13615w;

    /* renamed from: x, reason: collision with root package name */
    private final InterfaceC3813L f13616x;

    /* renamed from: y, reason: collision with root package name */
    private final q6.w f13617y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC3813L f13618z;

    /* renamed from: Z4.j1$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f13619a;

        /* renamed from: b, reason: collision with root package name */
        private final C2039d f13620b;

        public a(ArrayList appFAQs, C2039d c2039d) {
            AbstractC3292y.i(appFAQs, "appFAQs");
            this.f13619a = appFAQs;
            this.f13620b = c2039d;
        }

        public final C2039d a() {
            return this.f13620b;
        }

        public final ArrayList b() {
            return this.f13619a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3292y.d(this.f13619a, aVar.f13619a) && AbstractC3292y.d(this.f13620b, aVar.f13620b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f13619a.hashCode() * 31;
            C2039d c2039d = this.f13620b;
            if (c2039d == null) {
                hashCode = 0;
            } else {
                hashCode = c2039d.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "AppDetailsData(appFAQs=" + this.f13619a + ", appAffiliated=" + this.f13620b + ')';
        }
    }

    /* renamed from: Z4.j1$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f13621a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f13622b;

        public b(ArrayList appScreenshot, ArrayList appVideos) {
            AbstractC3292y.i(appScreenshot, "appScreenshot");
            AbstractC3292y.i(appVideos, "appVideos");
            this.f13621a = appScreenshot;
            this.f13622b = appVideos;
        }

        public final ArrayList a() {
            return this.f13621a;
        }

        public final ArrayList b() {
            return this.f13622b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f13621a, bVar.f13621a) && AbstractC3292y.d(this.f13622b, bVar.f13622b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f13621a.hashCode() * 31) + this.f13622b.hashCode();
        }

        public String toString() {
            return "AppMediaData(appScreenshot=" + this.f13621a + ", appVideos=" + this.f13622b + ')';
        }
    }

    /* renamed from: Z4.j1$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f13623a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f13624b;

        public c(ArrayList arrayList, ArrayList arrayList2) {
            this.f13623a = arrayList;
            this.f13624b = arrayList2;
        }

        public final ArrayList a() {
            return this.f13624b;
        }

        public final ArrayList b() {
            return this.f13623a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3292y.d(this.f13623a, cVar.f13623a) && AbstractC3292y.d(this.f13624b, cVar.f13624b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            ArrayList arrayList = this.f13623a;
            int i8 = 0;
            if (arrayList == null) {
                hashCode = 0;
            } else {
                hashCode = arrayList.hashCode();
            }
            int i9 = hashCode * 31;
            ArrayList arrayList2 = this.f13624b;
            if (arrayList2 != null) {
                i8 = arrayList2.hashCode();
            }
            return i9 + i8;
        }

        public String toString() {
            return "AppRelatedCategoriesData(appTopByCategories=" + this.f13623a + ", appCategories=" + this.f13624b + ')';
        }
    }

    /* renamed from: Z4.j1$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f13625a;

        /* renamed from: b, reason: collision with root package name */
        private final c5.M f13626b;

        public d(ArrayList appReviews, c5.M m8) {
            AbstractC3292y.i(appReviews, "appReviews");
            this.f13625a = appReviews;
            this.f13626b = m8;
        }

        public final c5.M a() {
            return this.f13626b;
        }

        public final ArrayList b() {
            return this.f13625a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (AbstractC3292y.d(this.f13625a, dVar.f13625a) && AbstractC3292y.d(this.f13626b, dVar.f13626b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f13625a.hashCode() * 31;
            c5.M m8 = this.f13626b;
            if (m8 == null) {
                hashCode = 0;
            } else {
                hashCode = m8.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "AppReviewsData(appReviews=" + this.f13625a + ", appMyReview=" + this.f13626b + ')';
        }
    }

    /* renamed from: Z4.j1$e */
    /* loaded from: classes5.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f13627a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13628b;

        public e(boolean z8, boolean z9) {
            this.f13627a = z8;
            this.f13628b = z9;
        }

        public final boolean a() {
            return this.f13627a;
        }

        public final boolean b() {
            return this.f13628b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            if (this.f13627a == eVar.f13627a && this.f13628b == eVar.f13628b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f13627a) * 31) + androidx.compose.foundation.a.a(this.f13628b);
        }

        public String toString() {
            return "PreRegisterActionData(succeed=" + this.f13627a + ", isAddPreRegisterAction=" + this.f13628b + ')';
        }
    }

    /* renamed from: Z4.j1$f */
    /* loaded from: classes5.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final String f13629a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13630b;

        public f(String str, boolean z8) {
            this.f13629a = str;
            this.f13630b = z8;
        }

        public final String a() {
            return this.f13629a;
        }

        public final boolean b() {
            return this.f13630b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            if (AbstractC3292y.d(this.f13629a, fVar.f13629a) && this.f13630b == fVar.f13630b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f13629a;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return (hashCode * 31) + androidx.compose.foundation.a.a(this.f13630b);
        }

        public String toString() {
            return "PreRegisterStatusData(buttonText=" + this.f13629a + ", isPreRegister=" + this.f13630b + ')';
        }
    }

    /* renamed from: Z4.j1$g */
    /* loaded from: classes5.dex */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f13631a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13632b;

        public g(boolean z8, int i8) {
            this.f13631a = z8;
            this.f13632b = i8;
        }

        public final int a() {
            return this.f13632b;
        }

        public final boolean b() {
            return this.f13631a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            if (this.f13631a == gVar.f13631a && this.f13632b == gVar.f13632b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (androidx.compose.foundation.a.a(this.f13631a) * 31) + this.f13632b;
        }

        public String toString() {
            return "SendReviewActionData(succeed=" + this.f13631a + ", statusCode=" + this.f13632b + ')';
        }
    }

    /* renamed from: Z4.j1$h */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13633a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13635c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f13636d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f13637e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13638f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f13639g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(long j8, String str, String str2, String str3, Context context, U5.d dVar) {
            super(2, dVar);
            this.f13635c = j8;
            this.f13636d = str;
            this.f13637e = str2;
            this.f13638f = str3;
            this.f13639g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f13635c, this.f13636d, this.f13637e, this.f13638f, this.f13639g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f13633a == 0) {
                Q5.t.b(obj);
                C1591j1.this.f13607o.setValue(AbstractC3768A.a.f37253a);
                c5.G g8 = new c5.G(this.f13635c, this.f13636d, this.f13637e, this.f13638f);
                c5.K a9 = new C3775H(this.f13639g).a(this.f13635c);
                if (!a9.b() && (d8 = a9.d()) != null && d8.length() != 0) {
                    String d9 = a9.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "added");
                        new C3795t(this.f13639g).e("preregister", bundle);
                        g8.h(this.f13639g);
                        C1591j1.this.f13607o.setValue(new AbstractC3768A.c(new e(true, true)));
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.j1$i */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13640a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13643d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Context context, long j8, U5.d dVar) {
            super(2, dVar);
            this.f13642c = context;
            this.f13643d = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f13642c, this.f13643d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f13640a == 0) {
                Q5.t.b(obj);
                C1591j1.this.f13607o.setValue(AbstractC3768A.a.f37253a);
                c5.K d9 = new C3775H(this.f13642c).d(this.f13643d);
                if (!d9.b() && (d8 = d9.d()) != null && d8.length() != 0) {
                    String d10 = d9.d();
                    AbstractC3292y.f(d10);
                    JSONObject jSONObject = new JSONObject(d10);
                    if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putString("type", "removed");
                        new C3795t(this.f13642c).e("preregister", bundle);
                        c5.G g8 = new c5.G();
                        g8.j(this.f13643d);
                        g8.i(this.f13642c);
                        C1591j1.this.f13607o.setValue(new AbstractC3768A.c(new e(true, false)));
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.j1$j */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13645b = context;
            this.f13646c = j8;
            this.f13647d = c1591j1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(this.f13645b, this.f13646c, this.f13647d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f13644a == 0) {
                Q5.t.b(obj);
                c5.K h8 = new C3775H(this.f13645b).h(this.f13646c);
                boolean z8 = false;
                String str = null;
                if (!h8.b() && (d8 = h8.d()) != null && d8.length() != 0) {
                    String d9 = h8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        if (!jSONObject2.isNull("message")) {
                            str = jSONObject2.getString("message");
                        }
                        if (!jSONObject2.isNull("preRegistered") && jSONObject2.getInt("preRegistered") != 0) {
                            z8 = true;
                        }
                    }
                }
                this.f13647d.f13609q.setValue(new AbstractC3768A.c(new f(str, z8)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.j1$k */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f13648a;

        /* renamed from: b, reason: collision with root package name */
        Object f13649b;

        /* renamed from: c, reason: collision with root package name */
        int f13650c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f13651d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13652e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f13653f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f13654g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, C1591j1 c1591j1, long j8, boolean z8, U5.d dVar) {
            super(2, dVar);
            this.f13651d = context;
            this.f13652e = c1591j1;
            this.f13653f = j8;
            this.f13654g = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f13651d, this.f13652e, this.f13653f, this.f13654g, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C3775H c3775h;
            q6.w wVar;
            ArrayList arrayList;
            Object e8 = V5.b.e();
            int i8 = this.f13650c;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        wVar = (q6.w) this.f13649b;
                        arrayList = (ArrayList) this.f13648a;
                        Q5.t.b(obj);
                        wVar.setValue(obj);
                        this.f13652e.f13593a.setValue(new AbstractC3768A.c(new a(arrayList, (C2039d) this.f13652e.w().getValue())));
                        return Q5.I.f8786a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c3775h = (C3775H) this.f13648a;
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                c3775h = new C3775H(this.f13651d);
                this.f13652e.E(c3775h, this.f13653f);
                this.f13652e.c0(c3775h, this.f13653f, this.f13654g);
                this.f13652e.C(c3775h, this.f13653f);
                this.f13652e.I(c3775h, this.f13653f, this.f13651d);
                C1591j1 c1591j1 = this.f13652e;
                long j8 = this.f13653f;
                this.f13648a = c3775h;
                this.f13650c = 1;
                obj = c1591j1.B(c3775h, j8, this);
                if (obj == e8) {
                    return e8;
                }
            }
            ArrayList arrayList2 = (ArrayList) obj;
            q6.w w8 = this.f13652e.w();
            C1591j1 c1591j12 = this.f13652e;
            long j9 = this.f13653f;
            this.f13648a = arrayList2;
            this.f13649b = w8;
            this.f13650c = 2;
            Object A8 = c1591j12.A(c3775h, j9, this);
            if (A8 == e8) {
                return e8;
            }
            wVar = w8;
            arrayList = arrayList2;
            obj = A8;
            wVar.setValue(obj);
            this.f13652e.f13593a.setValue(new AbstractC3768A.c(new a(arrayList, (C2039d) this.f13652e.w().getValue())));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.j1$l */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13655a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f13656b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13657c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(C3775H c3775h, long j8, U5.d dVar) {
            super(2, dVar);
            this.f13656b = c3775h;
            this.f13657c = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f13656b, this.f13657c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f13655a == 0) {
                Q5.t.b(obj);
                c5.K k8 = this.f13656b.k(this.f13657c);
                if (!k8.b() && (d8 = k8.d()) != null && d8.length() != 0) {
                    String d9 = k8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        C2039d.a aVar = C2039d.f15748h;
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
                        return aVar.a(jSONObject2);
                    }
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.j1$m */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13658a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f13659b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13660c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(C3775H c3775h, long j8, U5.d dVar) {
            super(2, dVar);
            this.f13659b = c3775h;
            this.f13660c = j8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(this.f13659b, this.f13660c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13658a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                c5.K t8 = this.f13659b.t(this.f13660c);
                if (!t8.b() && t8.d() != null) {
                    String d8 = t8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        C2054t.b bVar = C2054t.f15948c;
                        String d9 = t8.d();
                        AbstractC3292y.f(d9);
                        arrayList.addAll(bVar.a(d9));
                    }
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.j1$n */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13661a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f13662b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13663c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13664d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C3775H c3775h, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13662b = c3775h;
            this.f13663c = j8;
            this.f13664d = c1591j1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new n(this.f13662b, this.f13663c, this.f13664d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13661a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                c5.K w8 = this.f13662b.w(this.f13663c);
                if (!w8.b() && w8.d() != null) {
                    String d8 = w8.d();
                    AbstractC3292y.f(d8);
                    JSONArray jSONArray = new JSONObject(d8).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    if (jSONArray.length() <= 2) {
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            c5.P p8 = new c5.P(null, null, 0, 7, null);
                            JSONObject jSONObject = jSONArray.getJSONObject(i8);
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            C2046k c2046k = new C2046k(0, null, null, 7, null);
                            AbstractC3292y.f(jSONObject2);
                            c2046k.x(jSONObject2);
                            c2046k.I(true);
                            p8.e(c2046k);
                            JSONArray jSONArray2 = jSONObject.getJSONArray("apps");
                            int length2 = jSONArray2.length();
                            for (int i9 = 0; i9 < length2; i9++) {
                                C2043h c2043h = new C2043h();
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i9);
                                AbstractC3292y.h(jSONObject3, "getJSONObject(...)");
                                c2043h.a(jSONObject3);
                                p8.a().add(c2043h);
                            }
                            arrayList.add(p8);
                        }
                    } else {
                        int length3 = jSONArray.length();
                        for (int i10 = 0; i10 < length3; i10++) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i10);
                            C2046k c2046k2 = new C2046k(0, null, null, 7, null);
                            c2046k2.I(true);
                            AbstractC3292y.f(jSONObject4);
                            c2046k2.x(jSONObject4);
                            arrayList.add(c2046k2);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Object m02 = AbstractC1435t.m0(arrayList);
                    ArrayList arrayList2 = null;
                    if (m02 instanceof C2046k) {
                        arrayList2 = arrayList;
                        arrayList = null;
                    } else if (!(m02 instanceof c5.P)) {
                        arrayList = null;
                    }
                    this.f13664d.f13603k.setValue(new AbstractC3768A.c(new c(arrayList, arrayList2)));
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((n) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.j1$o */
    /* loaded from: classes5.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13665a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3775H f13666b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13667c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13668d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(C3775H c3775h, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13666b = c3775h;
            this.f13667c = j8;
            this.f13668d = c1591j1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int k(c5.N n8, c5.N n9) {
            return n8.b() - n9.b();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int p(InterfaceC2072n interfaceC2072n, Object obj, Object obj2) {
            return ((Number) interfaceC2072n.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new o(this.f13666b, this.f13667c, this.f13668d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            int i8;
            int i9;
            V5.b.e();
            if (this.f13665a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                c5.K u02 = this.f13666b.u0(this.f13667c);
                if (!u02.b() && u02.d() != null) {
                    String d8 = u02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = u02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i9 = jSONObject.optInt("success", 0);
                        } else {
                            i9 = 0;
                        }
                        if (i9 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA).getJSONArray("videos");
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                                V.b bVar = c5.V.f15704c;
                                AbstractC3292y.f(jSONObject2);
                                arrayList.add(bVar.a(jSONObject2));
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                c5.K Y8 = this.f13666b.Y(this.f13667c);
                if (!Y8.b() && Y8.d() != null) {
                    String d10 = Y8.d();
                    AbstractC3292y.f(d10);
                    if (d10.length() > 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (z8) {
                        String d11 = Y8.d();
                        AbstractC3292y.f(d11);
                        JSONObject jSONObject3 = new JSONObject(d11);
                        if (!jSONObject3.isNull("success")) {
                            i8 = jSONObject3.optInt("success", 0);
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject3.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray2 = jSONObject3.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length2 = jSONArray2.length();
                            for (int i11 = 0; i11 < length2; i11++) {
                                JSONObject jSONObject4 = jSONArray2.getJSONObject(i11);
                                N.b bVar2 = c5.N.f15658e;
                                AbstractC3292y.f(jSONObject4);
                                c5.N a9 = bVar2.a(jSONObject4);
                                if (a9.a() == 0) {
                                    arrayList2.add(a9);
                                }
                                final InterfaceC2072n interfaceC2072n = new InterfaceC2072n() { // from class: Z4.k1
                                    @Override // c6.InterfaceC2072n
                                    public final Object invoke(Object obj2, Object obj3) {
                                        int k8;
                                        k8 = C1591j1.o.k((c5.N) obj2, (c5.N) obj3);
                                        return Integer.valueOf(k8);
                                    }
                                };
                                AbstractC1435t.B(arrayList2, new Comparator() { // from class: Z4.l1
                                    @Override // java.util.Comparator
                                    public final int compare(Object obj2, Object obj3) {
                                        int p8;
                                        p8 = C1591j1.o.p(InterfaceC2072n.this, obj2, obj3);
                                        return p8;
                                    }
                                });
                            }
                        }
                    }
                }
                this.f13668d.f13601i.setValue(new AbstractC3768A.c(new b(arrayList2, arrayList)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.j1$p */
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13669a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13670b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f13671c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13672d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13673e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(Context context, C3775H c3775h, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13670b = context;
            this.f13671c = c3775h;
            this.f13672d = j8;
            this.f13673e = c1591j1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new p(this.f13670b, this.f13671c, this.f13672d, this.f13673e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            int i9;
            JSONArray jSONArray;
            V5.b.e();
            if (this.f13669a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                if (l6.n.s(this.f13670b.getString(R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                    i8 = 5;
                } else {
                    i8 = 6;
                }
                int i10 = 0;
                c5.K X8 = this.f13671c.X(this.f13672d, i8, 0);
                c5.M m8 = null;
                if (!X8.b() && X8.d() != null) {
                    String d8 = X8.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i9 = jSONObject.getInt("success");
                    } else {
                        i9 = 0;
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONArray = null;
                    }
                    if (i9 == 1 && jSONArray != null) {
                        arrayList.addAll(c5.M.f15633o.e(jSONArray));
                    }
                }
                c5.K G8 = this.f13671c.G(this.f13672d);
                if (!G8.b() && G8.d() != null) {
                    String d9 = G8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject2 = new JSONObject(d9);
                    if (!jSONObject2.isNull("success")) {
                        i10 = jSONObject2.getInt("success");
                    }
                    if (i10 == 1) {
                        m8 = new c5.M();
                        M.b bVar = c5.M.f15633o;
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3292y.h(jSONObject3, "getJSONObject(...)");
                        bVar.d(m8, jSONObject3);
                    }
                } else if (G8.b()) {
                    G8.e();
                }
                this.f13673e.f13615w.setValue(m8);
                this.f13673e.f13605m.setValue(new AbstractC3768A.c(new d(arrayList, m8)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((p) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.j1$q */
    /* loaded from: classes5.dex */
    static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13674a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13675b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f13676c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13677d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(Context context, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13675b = context;
            this.f13676c = j8;
            this.f13677d = c1591j1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new q(this.f13675b, this.f13676c, this.f13677d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13674a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                c5.K S8 = new C3775H(this.f13675b).S(this.f13676c);
                if (!S8.b() && S8.d() != null) {
                    String d8 = S8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = S8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        for (int i8 = 1; !jSONObject.isNull(String.valueOf(i8)); i8++) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(String.valueOf(i8));
                            C2043h c2043h = new C2043h();
                            AbstractC3292y.f(jSONObject2);
                            c2043h.a(jSONObject2);
                            arrayList.add(c2043h);
                        }
                        if (true ^ arrayList.isEmpty()) {
                            this.f13677d.f13599g.setValue(arrayList);
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Z4.j1$r */
    /* loaded from: classes5.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13678a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f13679b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3775H f13680c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f13681d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13682e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z8, C3775H c3775h, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13679b = z8;
            this.f13680c = c3775h;
            this.f13681d = j8;
            this.f13682e = c1591j1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new r(this.f13679b, this.f13680c, this.f13681d, this.f13682e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            V5.b.e();
            if (this.f13678a == 0) {
                Q5.t.b(obj);
                if (this.f13679b) {
                    C2040e c2040e = new C2040e();
                    c5.K b9 = this.f13680c.b(this.f13681d);
                    if (!b9.b() && b9.d() != null) {
                        String d8 = b9.d();
                        AbstractC3292y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = b9.d();
                            AbstractC3292y.f(d9);
                            JSONObject jSONObject = new JSONObject(d9);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                AbstractC3292y.f(jSONObject2);
                                c2040e.d(jSONObject2);
                                ArrayList a9 = c2040e.a();
                                if (a9 != null && !a9.isEmpty()) {
                                    this.f13682e.f13597e.setValue(c2040e);
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    c5.K T02 = this.f13680c.T0(this.f13681d, 20, 0);
                    if (!T02.b() && T02.d() != null) {
                        String d10 = T02.d();
                        AbstractC3292y.f(d10);
                        if (d10.length() > 0) {
                            String d11 = T02.d();
                            AbstractC3292y.f(d11);
                            JSONObject jSONObject3 = new JSONObject(d11);
                            if (!jSONObject3.isNull("success")) {
                                i8 = jSONObject3.optInt("success", 0);
                            } else {
                                i8 = 1;
                            }
                            if (!jSONObject3.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                jSONArray = jSONObject3.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            } else {
                                jSONArray = null;
                            }
                            if (i8 == 1 && jSONArray != null) {
                                int length = jSONArray.length();
                                for (int i9 = 0; i9 < length; i9++) {
                                    C2043h c2043h = new C2043h();
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i9);
                                    AbstractC3292y.f(jSONObject4);
                                    c2043h.a(jSONObject4);
                                    arrayList.add(c2043h);
                                }
                                if (!arrayList.isEmpty()) {
                                    this.f13682e.f13595c.setValue(arrayList);
                                }
                            }
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.j1$s */
    /* loaded from: classes5.dex */
    static final class s extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13683a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.M f13685c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f13686d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(c5.M m8, Context context, U5.d dVar) {
            super(2, dVar);
            this.f13685c = m8;
            this.f13686d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new s(this.f13685c, this.f13686d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13683a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                C1591j1.this.f13617y.setValue(kotlin.coroutines.jvm.internal.b.c(-1));
                M.b bVar = c5.M.f15633o;
                c5.M m8 = this.f13685c;
                Context context = this.f13686d;
                this.f13683a = 1;
                obj = bVar.c(m8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            C1591j1.this.f13617y.setValue(kotlin.coroutines.jvm.internal.b.c(((Number) obj).intValue()));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((s) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: Z4.j1$t */
    /* loaded from: classes5.dex */
    static final class t extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13687a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13688b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f13689c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13690d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f13691e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C1591j1 f13692f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(Context context, String str, int i8, long j8, C1591j1 c1591j1, U5.d dVar) {
            super(2, dVar);
            this.f13688b = context;
            this.f13689c = str;
            this.f13690d = i8;
            this.f13691e = j8;
            this.f13692f = c1591j1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new t(this.f13688b, this.f13689c, this.f13690d, this.f13691e, this.f13692f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f13687a == 0) {
                Q5.t.b(obj);
                M.b bVar = c5.M.f15633o;
                boolean z8 = false;
                if (!bVar.b(this.f13688b, this.f13689c)) {
                    bVar.f(this.f13688b, this.f13689c, String.valueOf(System.currentTimeMillis()));
                    C3775H c3775h = new C3775H(this.f13688b);
                    c5.M m8 = new c5.M();
                    m8.c0(this.f13689c);
                    m8.b0(this.f13690d);
                    c5.K J02 = c3775h.J0(this.f13691e, m8);
                    i8 = J02.e();
                    if (!J02.b() && J02.d() != null) {
                        String d8 = J02.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                            z8 = true;
                        }
                    }
                } else {
                    i8 = 0;
                }
                this.f13692f.f13613u.setValue(new AbstractC3768A.c(new g(z8, i8)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((t) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public C1591j1() {
        AbstractC3768A.a aVar = AbstractC3768A.a.f37253a;
        q6.w a9 = AbstractC3815N.a(aVar);
        this.f13593a = a9;
        this.f13594b = a9;
        q6.w a10 = AbstractC3815N.a(new ArrayList());
        this.f13595c = a10;
        this.f13596d = a10;
        q6.w a11 = AbstractC3815N.a(new C2040e());
        this.f13597e = a11;
        this.f13598f = a11;
        q6.w a12 = AbstractC3815N.a(new ArrayList());
        this.f13599g = a12;
        this.f13600h = a12;
        q6.w a13 = AbstractC3815N.a(aVar);
        this.f13601i = a13;
        this.f13602j = a13;
        q6.w a14 = AbstractC3815N.a(aVar);
        this.f13603k = a14;
        this.f13604l = a14;
        q6.w a15 = AbstractC3815N.a(aVar);
        this.f13605m = a15;
        this.f13606n = a15;
        q6.w a16 = AbstractC3815N.a(aVar);
        this.f13607o = a16;
        this.f13608p = a16;
        q6.w a17 = AbstractC3815N.a(aVar);
        this.f13609q = a17;
        this.f13610r = a17;
        q6.w a18 = AbstractC3815N.a(new ArrayList());
        this.f13611s = a18;
        this.f13612t = a18;
        q6.w a19 = AbstractC3815N.a(aVar);
        this.f13613u = a19;
        this.f13614v = a19;
        q6.w a20 = AbstractC3815N.a(null);
        this.f13615w = a20;
        this.f13616x = a20;
        q6.w a21 = AbstractC3815N.a(-1);
        this.f13617y = a21;
        this.f13618z = a21;
        this.f13575A = AbstractC3815N.a(null);
        this.f13576B = AbstractC3815N.a(null);
        this.f13577C = AbstractC3815N.a(null);
        this.f13578D = AbstractC3815N.a(null);
        this.f13579E = AbstractC3815N.a(-1L);
        this.f13580F = AbstractC3815N.a("");
        this.f13581G = AbstractC3815N.a(-1);
        Boolean bool = Boolean.FALSE;
        this.f13582H = AbstractC3815N.a(bool);
        this.f13583I = AbstractC3815N.a(bool);
        this.f13584J = AbstractC3815N.a(bool);
        this.f13585K = AbstractC3815N.a(bool);
        Boolean bool2 = Boolean.TRUE;
        this.f13586L = AbstractC3815N.a(bool2);
        this.f13587M = AbstractC3815N.a(bool);
        this.f13588N = AbstractC3815N.a(bool);
        this.f13589O = AbstractC3815N.a(bool2);
        this.f13590P = AbstractC3815N.a(0);
        this.f13591Q = AbstractC3815N.a(0);
        this.f13592R = AbstractC3815N.a(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A(C3775H c3775h, long j8, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new l(c3775h, j8, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(C3775H c3775h, long j8, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new m(c3775h, j8, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(C3775H c3775h, long j8) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new n(c3775h, j8, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(C3775H c3775h, long j8) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new o(c3775h, j8, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(C3775H c3775h, long j8, Context context) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new p(context, c3775h, j8, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(C3775H c3775h, long j8, boolean z8) {
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new r(z8, c3775h, j8, this, null), 2, null);
    }

    public final q6.w D() {
        return this.f13579E;
    }

    public final InterfaceC3813L F() {
        return this.f13602j;
    }

    public final q6.w G() {
        return this.f13589O;
    }

    public final InterfaceC3813L H() {
        return this.f13604l;
    }

    public final InterfaceC3813L J() {
        return this.f13606n;
    }

    public final q6.w K() {
        return this.f13584J;
    }

    public final q6.w L() {
        return this.f13582H;
    }

    public final InterfaceC3813L M() {
        return this.f13594b;
    }

    public final q6.w N() {
        return this.f13583I;
    }

    public final q6.w O() {
        return this.f13586L;
    }

    public final q6.w P() {
        return this.f13581G;
    }

    public final q6.w Q() {
        return this.f13576B;
    }

    public final InterfaceC3813L R() {
        return this.f13616x;
    }

    public final InterfaceC3813L S() {
        return this.f13608p;
    }

    public final InterfaceC3813L T() {
        return this.f13610r;
    }

    public final void U(Context context, long j8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new q(context, j8, this, null), 2, null);
    }

    public final InterfaceC3813L V() {
        return this.f13600h;
    }

    public final InterfaceC3813L W() {
        return this.f13618z;
    }

    public final q6.w X() {
        return this.f13592R;
    }

    public final InterfaceC3813L Y() {
        return this.f13612t;
    }

    public final q6.w Z() {
        return this.f13580F;
    }

    public final q6.w a0() {
        return this.f13591Q;
    }

    public final InterfaceC3813L b0() {
        return this.f13614v;
    }

    public final InterfaceC3813L d0() {
        return this.f13596d;
    }

    public final q6.w e0() {
        return this.f13588N;
    }

    public final q6.w f0() {
        return this.f13577C;
    }

    public final q6.w g0() {
        return this.f13590P;
    }

    public final q6.w h0() {
        return this.f13578D;
    }

    public final boolean i0(Context context) {
        AbstractC3292y.i(context, "context");
        return C2045j.f15879n.b(context, ((Number) this.f13579E.getValue()).longValue());
    }

    public final boolean j0(Context context) {
        AbstractC3292y.i(context, "context");
        return C2058x.f15962n.b(context, ((Number) this.f13579E.getValue()).longValue());
    }

    public final void k0(Context context, c5.M review) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(review, "review");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new s(review, context, null), 2, null);
    }

    public final void l0(Context context, String reviewText, int i8, long j8) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(reviewText, "reviewText");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new t(context, reviewText, i8, j8, this, null), 2, null);
    }

    public final void s(Context context, long j8, String appName, String str, String str2) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(appName, "appName");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new h(j8, appName, str, str2, context, null), 2, null);
    }

    public final void t(Context context, long j8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new i(context, j8, null), 2, null);
    }

    public final void u(Context context, long j8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new j(context, j8, this, null), 2, null);
    }

    public final void v(Context context, long j8, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new k(context, this, j8, z8, null), 2, null);
    }

    public final q6.w w() {
        return this.f13575A;
    }

    public final q6.w x() {
        return this.f13587M;
    }

    public final InterfaceC3813L y() {
        return this.f13598f;
    }

    public final q6.w z() {
        return this.f13585K;
    }
}
