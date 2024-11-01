package com.stripe.android.networking;

import B2.C0950b;
import B2.InterfaceC0951c;
import B2.j;
import B2.z;
import Q5.r;
import Q5.s;
import Q5.t;
import Q5.x;
import R5.AbstractC1435t;
import U5.g;
import V5.b;
import android.content.Context;
import android.net.http.HttpResponseCache;
import c6.InterfaceC2072n;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.stripe.android.model.p;
import com.stripe.android.model.w;
import j3.C3153d;
import j3.C3154e;
import j3.m;
import java.io.File;
import java.security.Security;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.InterfaceC3406i;
import n6.AbstractC3462k;
import p2.InterfaceC3560b;
import v2.c;
import v2.d;
import v2.f;
import x2.AbstractC4210d;
import x2.C4208b;
import x2.C4209c;
import x2.C4212f;
import x2.i;

/* loaded from: classes4.dex */
public final class a implements m {

    /* renamed from: n, reason: collision with root package name */
    public static final C2609b f26113n = new C2609b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f26114o = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f26115a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f26116b;

    /* renamed from: c, reason: collision with root package name */
    private final c f26117c;

    /* renamed from: d, reason: collision with root package name */
    private final d f26118d;

    /* renamed from: e, reason: collision with root package name */
    private final g f26119e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f26120f;

    /* renamed from: g, reason: collision with root package name */
    private final B2.F f26121g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0951c f26122h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3406i f26123i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3560b.a f26124j;

    /* renamed from: k, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f26125k;

    /* renamed from: l, reason: collision with root package name */
    private final C3154e f26126l;

    /* renamed from: m, reason: collision with root package name */
    private final j.b f26127m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f26129b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(Set set) {
            super(1);
            this.f26129b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5465invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5465invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f26125k.q(this.f26129b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26130a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26131b;

        /* renamed from: d, reason: collision with root package name */
        int f26133d;

        B(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26131b = obj;
            this.f26133d |= Integer.MIN_VALUE;
            Object P8 = a.this.P(null, null, null, this);
            return P8 == b.e() ? P8 : s.a(P8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f26134a = new C();

        C() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5466invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5466invoke(((s) obj).j());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26135a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26136b;

        /* renamed from: d, reason: collision with root package name */
        int f26138d;

        D(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26136b = obj;
            this.f26138d |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, this);
            return d8 == b.e() ? d8 : s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26139a;

        /* renamed from: c, reason: collision with root package name */
        int f26141c;

        E(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26139a = obj;
            this.f26141c |= Integer.MIN_VALUE;
            Object z8 = a.this.z(null, this);
            return z8 == b.e() ? z8 : s.a(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends AbstractC3293z implements Function1 {
        F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5467invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5467invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f26051Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class G extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26143a;

        /* renamed from: c, reason: collision with root package name */
        int f26145c;

        G(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26143a = obj;
            this.f26145c |= Integer.MIN_VALUE;
            Object g8 = a.this.g(null, null, null, this);
            return g8 == b.e() ? g8 : s.a(g8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f26147b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(Set set) {
            super(1);
            this.f26147b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5468invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5468invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26066g, this.f26147b, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26148a;

        /* renamed from: c, reason: collision with root package name */
        int f26150c;

        I(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26148a = obj;
            this.f26150c |= Integer.MIN_VALUE;
            Object l8 = a.this.l(null, null, null, this);
            return l8 == b.e() ? l8 : s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26151a;

        /* renamed from: b, reason: collision with root package name */
        Object f26152b;

        /* renamed from: c, reason: collision with root package name */
        Object f26153c;

        /* renamed from: d, reason: collision with root package name */
        Object f26154d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f26155e;

        /* renamed from: g, reason: collision with root package name */
        int f26157g;

        J(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26155e = obj;
            this.f26157g |= Integer.MIN_VALUE;
            return a.this.a0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class K extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26158a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26159b;

        /* renamed from: d, reason: collision with root package name */
        int f26161d;

        K(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26159b = obj;
            this.f26161d |= Integer.MIN_VALUE;
            Object d02 = a.this.d0(null, null, this);
            return d02 == b.e() ? d02 : s.a(d02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class L extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26162a;

        /* renamed from: c, reason: collision with root package name */
        int f26164c;

        L(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26162a = obj;
            this.f26164c |= Integer.MIN_VALUE;
            Object v8 = a.this.v(null, null, this);
            return v8 == b.e() ? v8 : s.a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class M extends AbstractC3293z implements Function1 {
        M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5469invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5469invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26087v, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class N extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26166a;

        /* renamed from: c, reason: collision with root package name */
        int f26168c;

        N(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26166a = obj;
            this.f26168c |= Integer.MIN_VALUE;
            Object u8 = a.this.u(null, null, this);
            return u8 == b.e() ? u8 : s.a(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class O extends AbstractC3293z implements Function1 {
        O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5470invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5470invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26029A, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class P extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26170a;

        /* renamed from: c, reason: collision with root package name */
        int f26172c;

        P(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26170a = obj;
            this.f26172c |= Integer.MIN_VALUE;
            Object e8 = a.this.e(null, null, this);
            return e8 == b.e() ? e8 : s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Q extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26173a;

        /* renamed from: c, reason: collision with root package name */
        int f26175c;

        Q(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26173a = obj;
            this.f26175c |= Integer.MIN_VALUE;
            Object s8 = a.this.s(null, null, null, this);
            return s8 == b.e() ? s8 : s.a(s8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class R extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f26177b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        R(Set set) {
            super(1);
            this.f26177b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5471invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5471invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26065f, this.f26177b, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class S extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26178a;

        /* renamed from: c, reason: collision with root package name */
        int f26180c;

        S(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26178a = obj;
            this.f26180c |= Integer.MIN_VALUE;
            Object b9 = a.this.b(null, null, this);
            return b9 == b.e() ? b9 : s.a(b9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class T extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26181a;

        /* renamed from: c, reason: collision with root package name */
        int f26183c;

        T(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26181a = obj;
            this.f26183c |= Integer.MIN_VALUE;
            Object f02 = a.this.f0(null, null, null, this);
            return f02 == b.e() ? f02 : s.a(f02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class U extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PaymentAnalyticsEvent f26184a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f26185b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        U(PaymentAnalyticsEvent paymentAnalyticsEvent, a aVar) {
            super(1);
            this.f26184a = paymentAnalyticsEvent;
            this.f26185b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5472invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5472invoke(Object obj) {
            PaymentAnalyticsEvent paymentAnalyticsEvent = this.f26184a;
            if (paymentAnalyticsEvent != null) {
                a aVar = this.f26185b;
                aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class V extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26186a;

        /* renamed from: c, reason: collision with root package name */
        int f26188c;

        V(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26186a = obj;
            this.f26188c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, null, this);
            return c8 == b.e() ? c8 : s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class W extends AbstractC3293z implements Function1 {
        W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5473invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5473invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26081s, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class X extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26190a;

        /* renamed from: c, reason: collision with root package name */
        int f26192c;

        X(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26190a = obj;
            this.f26192c |= Integer.MIN_VALUE;
            Object x8 = a.this.x(null, null, null, this);
            return x8 == b.e() ? x8 : s.a(x8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Y extends AbstractC3293z implements Function1 {
        Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5474invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5474invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26091x, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Z extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26194a;

        /* renamed from: c, reason: collision with root package name */
        int f26196c;

        Z(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26194a = obj;
            this.f26196c |= Integer.MIN_VALUE;
            Object f8 = a.this.f(null, null, null, this);
            return f8 == b.e() ? f8 : s.a(f8);
        }
    }

    /* renamed from: com.stripe.android.networking.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0530a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f26197a;

        C0530a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new C0530a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.f26197a == 0) {
                t.b(obj);
                HttpResponseCache.install(new File(a.this.f26115a.getCacheDir(), "stripe_api_repository_cache"), 10485760L);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((C0530a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26199a;

        /* renamed from: c, reason: collision with root package name */
        int f26201c;

        a0(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26199a = obj;
            this.f26201c |= Integer.MIN_VALUE;
            Object n8 = a.this.n(null, null, null, null, this);
            return n8 == b.e() ? n8 : s.a(n8);
        }
    }

    /* renamed from: com.stripe.android.networking.a$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2609b {
        private C2609b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map e(List list) {
            Map map = null;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                map = R5.Q.e(x.a("expand", list));
            }
            if (map == null) {
                return R5.Q.h();
            }
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String str) {
            return "https://api.stripe.com/v1/" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String str, Object... objArr) {
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
            Locale locale = Locale.ENGLISH;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            AbstractC3292y.h(format, "format(...)");
            return f(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String o(String str) {
            return "https://api.stripe.com/edge-internal/" + str;
        }

        private final String q(String str) {
            return "https://merchant-ui-api.stripe.com/elements/" + str;
        }

        public final /* synthetic */ String h(String paymentIntentId, String financialConnectionsSessionId) {
            AbstractC3292y.i(paymentIntentId, "paymentIntentId");
            AbstractC3292y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String i(String setupIntentId, String financialConnectionsSessionId) {
            AbstractC3292y.i(setupIntentId, "setupIntentId");
            AbstractC3292y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String j(String paymentIntentId) {
            AbstractC3292y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String k(String setupIntentId) {
            AbstractC3292y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String l(String paymentIntentId) {
            AbstractC3292y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String m(String setupIntentId) {
            AbstractC3292y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String n() {
            return f("connections/link_account_sessions_for_deferred_payment");
        }

        public final /* synthetic */ String p() {
            return f("consumers/sessions/log_out");
        }

        public final String r() {
            return q("mobile-card-element-config");
        }

        public final /* synthetic */ String s(String paymentMethodId) {
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            return f("payment_methods/" + paymentMethodId);
        }

        public final /* synthetic */ String t() {
            return f("payment_methods");
        }

        public final /* synthetic */ String u(String paymentIntentId) {
            AbstractC3292y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String v(String paymentIntentId) {
            AbstractC3292y.i(paymentIntentId, "paymentIntentId");
            return g("setup_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String w(String customerId) {
            AbstractC3292y.i(customerId, "customerId");
            return g("customers/%s", customerId);
        }

        public final /* synthetic */ String x(String paymentIntentId) {
            AbstractC3292y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String y(String setupIntentId) {
            AbstractC3292y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String z() {
            return f("consumers/payment_details/share");
        }

        public /* synthetic */ C2609b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26202a;

        /* renamed from: c, reason: collision with root package name */
        int f26204c;

        b0(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26202a = obj;
            this.f26204c |= Integer.MIN_VALUE;
            Object j8 = a.this.j(null, null, this);
            return j8 == b.e() ? j8 : s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.stripe.android.networking.a$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC2610c {

        /* renamed from: com.stripe.android.networking.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0531a extends AbstractC2610c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0531a f26205a = new C0531a();

            private C0531a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0531a);
            }

            public int hashCode() {
                return 2054089437;
            }

            public String toString() {
                return "Failure";
            }
        }

        /* renamed from: com.stripe.android.networking.a$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC2610c {

            /* renamed from: a, reason: collision with root package name */
            private final String f26206a;

            public b(String str) {
                super(null);
                this.f26206a = str;
            }

            public final String a() {
                return this.f26206a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3292y.d(this.f26206a, ((b) obj).f26206a);
            }

            public int hashCode() {
                String str = this.f26206a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + this.f26206a + ")";
            }
        }

        private AbstractC2610c() {
        }

        public /* synthetic */ AbstractC2610c(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c0 extends AbstractC3293z implements Function1 {
        c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5475invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5475invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f26125k, PaymentAnalyticsEvent.f26055U, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2611d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26208a;

        /* renamed from: c, reason: collision with root package name */
        int f26210c;

        C2611d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26208a = obj;
            this.f26210c |= Integer.MIN_VALUE;
            Object a9 = a.this.a(null, null, null, null, null, this);
            return a9 == b.e() ? a9 : s.a(a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d0 extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26211a;

        /* renamed from: c, reason: collision with root package name */
        int f26213c;

        d0(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26211a = obj;
            this.f26213c |= Integer.MIN_VALUE;
            Object p8 = a.this.p(null, null, null, this);
            return p8 == b.e() ? p8 : s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2612e extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2612e f26214a = new C2612e();

        C2612e() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5476invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5476invoke(((s) obj).j());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e0 extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.t f26216b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(com.stripe.android.model.t tVar) {
            super(1);
            this.f26216b = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5477invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5477invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f26125k.t(this.f26216b.i().f25773a, this.f26216b.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2613f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26217a;

        /* renamed from: c, reason: collision with root package name */
        int f26219c;

        C2613f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26217a = obj;
            this.f26219c |= Integer.MIN_VALUE;
            Object i8 = a.this.i(null, null, null, null, null, this);
            return i8 == b.e() ? i8 : s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2614g extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2614g f26220a = new C2614g();

        C2614g() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5478invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5478invoke(((s) obj).j());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2615h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26221a;

        /* renamed from: c, reason: collision with root package name */
        int f26223c;

        C2615h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26221a = obj;
            this.f26223c |= Integer.MIN_VALUE;
            Object o8 = a.this.o(null, null, null, this);
            return o8 == b.e() ? o8 : s.a(o8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2616i extends AbstractC3293z implements Function1 {
        C2616i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5479invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5479invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f26085u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2617j extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26225a;

        /* renamed from: c, reason: collision with root package name */
        int f26227c;

        C2617j(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26225a = obj;
            this.f26227c |= Integer.MIN_VALUE;
            Object r8 = a.this.r(null, null, null, this);
            return r8 == b.e() ? r8 : s.a(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2618k extends AbstractC3293z implements Function1 {
        C2618k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5480invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5480invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f26095z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$l, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2619l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26229a;

        /* renamed from: c, reason: collision with root package name */
        int f26231c;

        C2619l(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26229a = obj;
            this.f26231c |= Integer.MIN_VALUE;
            Object y8 = a.this.y(null, null, this);
            return y8 == b.e() ? y8 : s.a(y8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$m, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2620m extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26232a;

        /* renamed from: b, reason: collision with root package name */
        Object f26233b;

        /* renamed from: c, reason: collision with root package name */
        Object f26234c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f26235d;

        /* renamed from: f, reason: collision with root package name */
        int f26237f;

        C2620m(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26235d = obj;
            this.f26237f |= Integer.MIN_VALUE;
            Object m8 = a.this.m(null, null, null, this);
            return m8 == b.e() ? m8 : s.a(m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$n, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2621n extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26238a;

        /* renamed from: c, reason: collision with root package name */
        int f26240c;

        C2621n(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26238a = obj;
            this.f26240c |= Integer.MIN_VALUE;
            Object M8 = a.this.M(null, null, null, this);
            return M8 == b.e() ? M8 : s.a(M8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$o, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2622o extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.b f26241a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f26242b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2622o(com.stripe.android.model.b bVar, a aVar) {
            super(1);
            this.f26241a = bVar;
            this.f26242b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5481invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5481invoke(Object obj) {
            String type;
            p h8 = this.f26241a.h();
            if (h8 == null || (type = h8.u()) == null) {
                w p8 = this.f26241a.p();
                type = p8 != null ? p8.getType() : null;
            }
            a aVar = this.f26242b;
            aVar.S(aVar.f26125k.r(type, this.f26242b.V(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$p, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2623p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26243a;

        /* renamed from: c, reason: collision with root package name */
        int f26245c;

        C2623p(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26243a = obj;
            this.f26245c |= Integer.MIN_VALUE;
            Object h8 = a.this.h(null, null, null, this);
            return h8 == b.e() ? h8 : s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$q, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2624q extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.c f26247b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2624q(com.stripe.android.model.c cVar) {
            super(1);
            this.f26247b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5482invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5482invoke(Object obj) {
            a aVar = a.this;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = aVar.f26125k;
            p h8 = this.f26247b.h();
            aVar.S(paymentAnalyticsRequestFactory.w(h8 != null ? h8.u() : null, a.this.V(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$r, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2625r extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26248a;

        /* renamed from: c, reason: collision with root package name */
        int f26250c;

        C2625r(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26248a = obj;
            this.f26250c |= Integer.MIN_VALUE;
            Object t8 = a.this.t(null, null, this);
            return t8 == b.e() ? t8 : s.a(t8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$s, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2626s extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2626s f26251a = new C2626s();

        C2626s() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5483invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5483invoke(((s) obj).j());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$t, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2627t extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26252a;

        /* renamed from: c, reason: collision with root package name */
        int f26254c;

        C2627t(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26252a = obj;
            this.f26254c |= Integer.MIN_VALUE;
            Object q8 = a.this.q(null, null, null, this);
            return q8 == b.e() ? q8 : s.a(q8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$u, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2628u extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2628u f26255a = new C2628u();

        C2628u() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5484invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5484invoke(((s) obj).j());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$v, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2629v extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26256a;

        /* renamed from: c, reason: collision with root package name */
        int f26258c;

        C2629v(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26256a = obj;
            this.f26258c |= Integer.MIN_VALUE;
            Object w8 = a.this.w(null, null, this);
            return w8 == b.e() ? w8 : s.a(w8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$w, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2630w extends AbstractC3293z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f26260b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2630w(p pVar) {
            super(1);
            this.f26260b = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5485invoke(((s) obj).j());
            return Q5.I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5485invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f26125k.s(this.f26260b.p(), this.f26260b.i()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$x, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2631x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26261a;

        /* renamed from: c, reason: collision with root package name */
        int f26263c;

        C2631x(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26261a = obj;
            this.f26263c |= Integer.MIN_VALUE;
            Object A8 = a.this.A(null, null, null, this);
            return A8 == b.e() ? A8 : s.a(A8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$y, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2632y extends AbstractC3293z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2632y f26264a = new C2632y();

        C2632y() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5486invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5486invoke(((s) obj).j());
            return Q5.I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$z, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2633z extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26265a;

        /* renamed from: c, reason: collision with root package name */
        int f26267c;

        C2633z(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26265a = obj;
            this.f26267c |= Integer.MIN_VALUE;
            Object B8 = a.this.B(null, null, null, this);
            return B8 == b.e() ? B8 : s.a(B8);
        }
    }

    public a(Context context, Function0 publishableKeyProvider, c cVar, d logger, g workContext, Set productUsageTokens, B2.F stripeNetworkClient, InterfaceC0951c analyticsRequestExecutor, InterfaceC3406i fraudDetectionDataRepository, InterfaceC3560b.a cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, C3154e fraudDetectionDataParamsUtils, Set betas, String apiVersion, String sdkVersion) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(logger, "logger");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        AbstractC3292y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        AbstractC3292y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        AbstractC3292y.i(betas, "betas");
        AbstractC3292y.i(apiVersion, "apiVersion");
        AbstractC3292y.i(sdkVersion, "sdkVersion");
        this.f26115a = context;
        this.f26116b = publishableKeyProvider;
        this.f26117c = cVar;
        this.f26118d = logger;
        this.f26119e = workContext;
        this.f26120f = productUsageTokens;
        this.f26121g = stripeNetworkClient;
        this.f26122h = analyticsRequestExecutor;
        this.f26123i = fraudDetectionDataRepository;
        this.f26124j = cardAccountRangeRepositoryFactory;
        this.f26125k = paymentAnalyticsRequestFactory;
        this.f26126l = fraudDetectionDataParamsUtils;
        this.f26127m = new j.b(cVar, apiVersion, sdkVersion);
        T();
        AbstractC3462k.d(n6.N.a(workContext), null, null, new C0530a(null), 3, null);
    }

    private final r K(Set set) {
        return x.a("payment_user_agent", k(set));
    }

    static /* synthetic */ r L(a aVar, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = R5.a0.f();
        }
        return aVar.K(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(com.stripe.android.model.b r12, B2.j.c r13, java.util.List r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2621n
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$n r0 = (com.stripe.android.networking.a.C2621n) r0
            int r1 = r0.f26240c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26240c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$n r0 = new com.stripe.android.networking.a$n
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26238a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26240c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto Lb9
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            Q5.t.b(r15)
            j3.e r15 = r11.f26126l
            java.util.Map r2 = r12.B()
            boolean r4 = r13.h()
            if (r4 == 0) goto L4d
            java.lang.String r4 = "client_secret"
            java.util.Map r2 = R5.Q.l(r2, r4)
        L4d:
            com.stripe.android.model.p r4 = r12.h()
            com.stripe.android.model.w r5 = r12.p()
            java.util.Map r2 = r11.b0(r2, r4, r5)
            com.stripe.android.networking.a$b r4 = com.stripe.android.networking.a.f26113n
            java.util.Map r14 = com.stripe.android.networking.a.C2609b.a(r4, r14)
            java.util.Map r14 = R5.Q.q(r2, r14)
            j3.d r2 = r11.W()
            java.util.Map r7 = r15.b(r14, r2)
            Q5.s$a r14 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L7f
            com.stripe.android.model.n$c r14 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L7f
            java.lang.String r15 = r12.d()     // Catch: java.lang.Throwable -> L7f
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r14 = Q5.s.b(r14)     // Catch: java.lang.Throwable -> L7f
            goto L8a
        L7f:
            r14 = move-exception
            Q5.s$a r15 = Q5.s.f8810b
            java.lang.Object r14 = Q5.t.a(r14)
            java.lang.Object r14 = Q5.s.b(r14)
        L8a:
            java.lang.Throwable r15 = Q5.s.e(r14)
            if (r15 != 0) goto Lba
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r15.l(r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r13 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.u r14 = new h3.u
            r14.<init>()
            com.stripe.android.networking.a$o r15 = new com.stripe.android.networking.a$o
            r15.<init>(r12, r11)
            r0.f26240c = r3
            java.lang.Object r12 = r11.P(r13, r14, r15, r0)
            if (r12 != r1) goto Lb9
            return r1
        Lb9:
            return r12
        Lba:
            java.lang.Object r12 = Q5.t.a(r15)
            java.lang.Object r12 = Q5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.M(com.stripe.android.model.b, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    private final Map N(String str, List list) {
        return R5.Q.q(R5.Q.e(x.a("client_secret", str)), f26113n.e(list));
    }

    private final AbstractC2610c O() {
        Object b9;
        try {
            s.a aVar = s.f8810b;
            String property = Security.getProperty("networkaddress.cache.ttl");
            Security.setProperty("networkaddress.cache.ttl", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            b9 = s.b(new AbstractC2610c.b(property));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        AbstractC2610c.C0531a c0531a = AbstractC2610c.C0531a.f26205a;
        if (s.g(b9)) {
            b9 = c0531a;
        }
        return (AbstractC2610c) b9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x0054, B:17:0x0059, B:18:0x007f, B:22:0x003b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x0054, B:17:0x0059, B:18:0x007f, B:22:0x003b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(B2.j r9, A2.a r10, kotlin.jvm.functions.Function1 r11, U5.d r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.stripe.android.networking.a.B
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.networking.a$B r0 = (com.stripe.android.networking.a.B) r0
            int r1 = r0.f26133d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26133d = r1
            goto L18
        L13:
            com.stripe.android.networking.a$B r0 = new com.stripe.android.networking.a$B
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f26131b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26133d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f26130a
            r10 = r9
            A2.a r10 = (A2.a) r10
            Q5.t.b(r12)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r9 = move-exception
            goto L80
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            Q5.t.b(r12)
            Q5.s$a r12 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L2e
            r0.f26130a = r10     // Catch: java.lang.Throwable -> L2e
            r0.f26133d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r12 = r8.a0(r9, r11, r0)     // Catch: java.lang.Throwable -> L2e
            if (r12 != r1) goto L48
            return r1
        L48:
            B2.H r12 = (B2.H) r12     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r9 = B2.A.a(r12)     // Catch: java.lang.Throwable -> L2e
            z2.f r9 = r10.a(r9)     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L59
            java.lang.Object r9 = Q5.s.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L8a
        L59:
            x2.b r9 = new x2.b     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = r10.getSimpleName()     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r11.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r12 = "Unable to parse response with "
            r11.append(r12)     // Catch: java.lang.Throwable -> L2e
            r11.append(r10)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Throwable -> L2e
            r6 = 23
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L80:
            Q5.s$a r10 = Q5.s.f8810b
            java.lang.Object r9 = Q5.t.a(r9)
            java.lang.Object r9 = Q5.s.b(r9)
        L8a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.P(B2.j, A2.a, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    static /* synthetic */ Object Q(a aVar, j jVar, A2.a aVar2, Function1 function1, U5.d dVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function1 = C.f26134a;
        }
        return aVar.P(jVar, aVar2, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        S(PaymentAnalyticsRequestFactory.v(this.f26125k, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    private final void T() {
        this.f26123i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String V(Object obj) {
        Object obj2;
        Object b9;
        if (s.g(obj)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        B2.H h8 = (B2.H) obj2;
        Throwable e8 = s.e(obj);
        if (e8 != null) {
            return AbstractC4210d.a(e8);
        }
        if (h8 == null || !h8.e()) {
            return null;
        }
        try {
            Z(h8);
            b9 = s.b(Q5.I.f8786a);
        } catch (Throwable th) {
            s.a aVar = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Throwable e9 = s.e(b9);
        if (e9 == null) {
            return null;
        }
        return AbstractC4210d.a(e9);
    }

    private final C3153d W() {
        return this.f26123i.a();
    }

    private final void Z(B2.H h8) {
        String str;
        z d8 = h8.d();
        if (d8 != null) {
            str = d8.a();
        } else {
            str = null;
        }
        String str2 = str;
        int b9 = h8.b();
        f e8 = j3.l.e(new A2.b().a(B2.A.a(h8)), this.f26115a);
        if (b9 != 429) {
            switch (b9) {
                case 400:
                case MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR /* 404 */:
                    throw new C4212f(e8, str2, b9, null, null, 24, null);
                case 401:
                    throw new C4209c(e8, str2);
                case 402:
                    throw new M2.a(e8, str2);
                case 403:
                    throw new i(e8, str2);
                default:
                    throw new C4208b(e8, str2, b9, null, null, 24, null);
            }
        }
        throw new x2.j(e8, str2, null, null, 12, null);
    }

    private final Map b0(Map map, p pVar, w wVar) {
        Map map2;
        Set f8;
        Set f9;
        Object obj = map.get("payment_method_data");
        Map map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (pVar == null || (f9 = pVar.i()) == null) {
                f9 = R5.a0.f();
            }
            Map o8 = R5.Q.o(map, x.a("payment_method_data", R5.Q.o(map2, K(f9))));
            if (o8 != null) {
                return o8;
            }
        }
        Object obj2 = map.get("source_data");
        if (obj2 instanceof Map) {
            map3 = (Map) obj2;
        }
        if (map3 != null) {
            if (wVar == null || (f8 = wVar.a()) == null) {
                f8 = R5.a0.f();
            }
            return R5.Q.o(map, x.a("source_data", R5.Q.o(map3, K(f8))));
        }
        return map;
    }

    static /* synthetic */ Map c0(a aVar, Map map, p pVar, w wVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            wVar = null;
        }
        return aVar.b0(map, pVar, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d0(com.stripe.android.model.b r5, B2.j.c r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.a.K
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.a$K r0 = (com.stripe.android.networking.a.K) r0
            int r1 = r0.f26161d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26161d = r1
            goto L18
        L13:
            com.stripe.android.networking.a$K r0 = new com.stripe.android.networking.a$K
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26159b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26161d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f26158a
            com.stripe.android.model.b r5 = (com.stripe.android.model.b) r5
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r6 = r7.j()
            goto L5a
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            Q5.t.b(r7)
            boolean r7 = r6.h()
            if (r7 == 0) goto L8b
            com.stripe.android.model.p r7 = r5.h()
            if (r7 != 0) goto L4b
            goto L8b
        L4b:
            com.stripe.android.model.p r7 = r5.h()
            r0.f26158a = r5
            r0.f26161d = r3
            java.lang.Object r6 = r4.w(r7, r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            boolean r7 = Q5.s.h(r6)
            if (r7 == 0) goto L86
            com.stripe.android.model.o r6 = (com.stripe.android.model.o) r6     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.b$a r7 = com.stripe.android.model.b.f25433o     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r5.d()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.f25631a     // Catch: java.lang.Throwable -> L7a
            kotlin.jvm.internal.AbstractC3292y.f(r6)     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.r r5 = r5.i()     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.b r5 = r7.a(r0, r6, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r5 = Q5.s.b(r5)     // Catch: java.lang.Throwable -> L7a
            goto L8a
        L7a:
            r5 = move-exception
            Q5.s$a r6 = Q5.s.f8810b
            java.lang.Object r5 = Q5.t.a(r5)
            java.lang.Object r5 = Q5.s.b(r5)
            goto L8a
        L86:
            java.lang.Object r5 = Q5.s.b(r6)
        L8a:
            return r5
        L8b:
            java.lang.Object r5 = Q5.s.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.d0(com.stripe.android.model.b, B2.j$c, U5.d):java.lang.Object");
    }

    private final void e0(AbstractC2610c abstractC2610c) {
        if (abstractC2610c instanceof AbstractC2610c.b) {
            String a9 = ((AbstractC2610c.b) abstractC2610c).a();
            if (a9 == null) {
                a9 = "-1";
            }
            Security.setProperty("networkaddress.cache.ttl", a9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f0(g3.v r12, B2.j.c r13, com.stripe.android.networking.PaymentAnalyticsEvent r14, U5.d r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.f0(g3.v, B2.j$c, com.stripe.android.networking.PaymentAnalyticsEvent, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A(java.lang.String r12, com.stripe.android.model.d r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2631x
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$x r0 = (com.stripe.android.networking.a.C2631x) r0
            int r1 = r0.f26263c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26263c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$x r0 = new com.stripe.android.networking.a$x
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26261a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26263c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            B2.j$b r4 = r11.f26127m
            java.lang.String r5 = r11.Y(r12)
            java.util.Map r7 = r13.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.p r13 = new h3.p
            r13.<init>()
            com.stripe.android.networking.a$y r14 = com.stripe.android.networking.a.C2632y.f26264a
            r0.f26263c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.A(java.lang.String, com.stripe.android.model.d, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object B(java.util.Set r12, java.lang.String r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2633z
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$z r0 = (com.stripe.android.networking.a.C2633z) r0
            int r1 = r0.f26267c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26267c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$z r0 = new com.stripe.android.networking.a$z
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26265a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26267c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            B2.j$b r4 = r11.f26127m
            java.lang.String r5 = r11.U(r13)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r14
            B2.j r13 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.v r14 = new h3.v
            r14.<init>()
            com.stripe.android.networking.a$A r15 = new com.stripe.android.networking.a$A
            r15.<init>(r12)
            r0.f26267c = r3
            java.lang.Object r12 = r11.P(r13, r14, r15, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.B(java.util.Set, java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    public final void S(C0950b params) {
        AbstractC3292y.i(params, "params");
        this.f26122h.a(params);
    }

    public final String U(String paymentMethodId) {
        AbstractC3292y.i(paymentMethodId, "paymentMethodId");
        return f26113n.g("payment_methods/%s/detach", paymentMethodId);
    }

    public final /* synthetic */ String X(String paymentIntentId) {
        AbstractC3292y.i(paymentIntentId, "paymentIntentId");
        return f26113n.g("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    public final /* synthetic */ String Y(String setupIntentId) {
        AbstractC3292y.i(setupIntentId, "setupIntentId");
        return f26113n.g("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(java.lang.String r14, java.lang.String r15, java.lang.String r16, B2.j.c r17, java.util.List r18, U5.d r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof com.stripe.android.networking.a.C2611d
            if (r2 == 0) goto L16
            r2 = r1
            com.stripe.android.networking.a$d r2 = (com.stripe.android.networking.a.C2611d) r2
            int r3 = r2.f26210c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f26210c = r3
            goto L1b
        L16:
            com.stripe.android.networking.a$d r2 = new com.stripe.android.networking.a$d
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f26208a
            java.lang.Object r3 = V5.b.e()
            int r4 = r2.f26210c
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            Q5.t.b(r1)
            Q5.s r1 = (Q5.s) r1
            java.lang.Object r1 = r1.j()
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            Q5.t.b(r1)
            B2.j$b r6 = r0.f26127m
            com.stripe.android.networking.a$b r1 = com.stripe.android.networking.a.f26113n
            r4 = r15
            r7 = r16
            java.lang.String r7 = r1.h(r15, r7)
            java.lang.String r4 = "client_secret"
            r8 = r14
            Q5.r r4 = Q5.x.a(r4, r14)
            java.util.Map r4 = R5.Q.e(r4)
            r8 = r18
            java.util.Map r1 = com.stripe.android.networking.a.C2609b.a(r1, r8)
            java.util.Map r9 = R5.Q.q(r4, r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            B2.j r1 = B2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            h3.u r4 = new h3.u
            r4.<init>()
            com.stripe.android.networking.a$e r6 = com.stripe.android.networking.a.C2612e.f26214a
            r2.f26210c = r5
            java.lang.Object r1 = r13.P(r1, r4, r6, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.a(java.lang.String, java.lang.String, java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:34|35))(4:36|37|38|(1:40)(1:41))|13|14|15|(4:17|(1:19)|20|21)(2:23|(2:25|26)(1:27))))|45|6|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:            r0 = th;     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a0(B2.j r6, kotlin.jvm.functions.Function1 r7, U5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.a.J
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.networking.a$J r0 = (com.stripe.android.networking.a.J) r0
            int r1 = r0.f26157g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26157g = r1
            goto L18
        L13:
            com.stripe.android.networking.a$J r0 = new com.stripe.android.networking.a$J
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26155e
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26157g
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r6 = r0.f26154d
            com.stripe.android.networking.a$c r6 = (com.stripe.android.networking.a.AbstractC2610c) r6
            java.lang.Object r7 = r0.f26153c
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r1 = r0.f26152b
            B2.j r1 = (B2.j) r1
            java.lang.Object r0 = r0.f26151a
            com.stripe.android.networking.a r0 = (com.stripe.android.networking.a) r0
            Q5.t.b(r8)     // Catch: java.lang.Throwable -> L3e
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L6a
        L3e:
            r8 = move-exception
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L75
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4d:
            Q5.t.b(r8)
            com.stripe.android.networking.a$c r8 = r5.O()
            Q5.s$a r2 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L73
            B2.F r2 = r5.f26121g     // Catch: java.lang.Throwable -> L73
            r0.f26151a = r5     // Catch: java.lang.Throwable -> L73
            r0.f26152b = r6     // Catch: java.lang.Throwable -> L73
            r0.f26153c = r7     // Catch: java.lang.Throwable -> L73
            r0.f26154d = r8     // Catch: java.lang.Throwable -> L73
            r0.f26157g = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.a(r6, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L69
            return r1
        L69:
            r1 = r5
        L6a:
            B2.H r0 = (B2.H) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r0 = move-exception
            goto L75
        L73:
            r0 = move-exception
            r1 = r5
        L75:
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
        L7f:
            Q5.s r2 = Q5.s.a(r0)
            r7.invoke(r2)
            java.lang.Throwable r7 = Q5.s.e(r0)
            if (r7 != 0) goto L9b
            B2.H r0 = (B2.H) r0
            boolean r6 = r0.e()
            if (r6 == 0) goto L97
            r1.Z(r0)
        L97:
            r1.e0(r8)
            return r0
        L9b:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto Lab
            x2.a$a r8 = x2.C4207a.f40944f
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.h()
            x2.a r7 = r8.a(r7, r6)
        Lab:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.a0(B2.j, kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(g3.v r5, B2.j.c r6, U5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.a.S
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.a$S r0 = (com.stripe.android.networking.a.S) r0
            int r1 = r0.f26180c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26180c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$S r0 = new com.stripe.android.networking.a$S
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26178a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26180c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r7)
            Q5.s r7 = (Q5.s) r7
            java.lang.Object r5 = r7.j()
            goto L44
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            Q5.t.b(r7)
            r0.f26180c = r3
            r7 = 0
            java.lang.Object r5 = r4.f0(r5, r6, r7, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.b(g3.v, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.String r12, B2.j.c r13, java.util.List r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.V
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$V r0 = (com.stripe.android.networking.a.V) r0
            int r1 = r0.f26188c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26188c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$V r0 = new com.stripe.android.networking.a$V
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26186a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26188c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L97
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            Q5.s$a r15 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.n$c r15 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r15 = r15.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r15 = Q5.s.b(r15)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r15 = move-exception
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r15 = Q5.t.a(r15)
            java.lang.Object r15 = Q5.s.b(r15)
        L55:
            java.lang.Throwable r2 = Q5.s.e(r15)
            if (r2 != 0) goto L98
            java.lang.String r15 = (java.lang.String) r15
            boolean r2 = r13.h()
            if (r2 == 0) goto L6b
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f26113n
            java.util.Map r12 = com.stripe.android.networking.a.C2609b.a(r12, r14)
        L69:
            r7 = r12
            goto L70
        L6b:
            java.util.Map r12 = r11.N(r12, r14)
            goto L69
        L70:
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r12.x(r15)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r12 = B2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            h3.u r13 = new h3.u
            r13.<init>()
            com.stripe.android.networking.a$W r14 = new com.stripe.android.networking.a$W
            r14.<init>()
            r0.f26188c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L97
            return r1
        L97:
            return r12
        L98:
            java.lang.Object r12 = Q5.t.a(r2)
            java.lang.Object r12 = Q5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.c(java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(p2.C3559a r18, B2.j.c r19, U5.d r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.D
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$D r2 = (com.stripe.android.networking.a.D) r2
            int r3 = r2.f26138d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f26138d = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$D r2 = new com.stripe.android.networking.a$D
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f26136b
            java.lang.Object r8 = V5.b.e()
            int r2 = r4.f26138d
            if (r2 == 0) goto L41
            if (r2 != r1) goto L39
            java.lang.Object r1 = r4.f26135a
            com.stripe.android.networking.a r1 = (com.stripe.android.networking.a) r1
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto L9f
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            Q5.t.b(r0)
            B2.j$b r9 = r7.f26127m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f26113n
            java.lang.String r2 = "card-metadata"
            java.lang.String r10 = com.stripe.android.networking.a.C2609b.d(r0, r2)
            r15 = 5
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r19
            B2.j$c r11 = B2.j.c.b(r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "key"
            java.lang.String r2 = r19.f()
            Q5.r r0 = Q5.x.a(r0, r2)
            java.lang.String r2 = r18.a()
            java.lang.String r3 = "bin_prefix"
            Q5.r r2 = Q5.x.a(r3, r2)
            r3 = 2
            Q5.r[] r3 = new Q5.r[r3]
            r5 = 0
            r3[r5] = r0
            r3[r1] = r2
            java.util.Map r12 = R5.Q.k(r3)
            r14 = 8
            r15 = 0
            r13 = 0
            B2.j r2 = B2.j.b.b(r9, r10, r11, r12, r13, r14, r15)
            h3.e r3 = new h3.e
            r0 = r18
            r3.<init>(r0)
            r4.f26135a = r7
            r4.f26138d = r1
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r17
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L9e
            return r8
        L9e:
            r1 = r7
        L9f:
            java.lang.Throwable r2 = Q5.s.e(r0)
            if (r2 == 0) goto Laa
            com.stripe.android.networking.PaymentAnalyticsEvent r2 = com.stripe.android.networking.PaymentAnalyticsEvent.f26034C0
            r1.R(r2)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.d(p2.a, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(B2.j.c r17, java.util.Map r18, U5.d r19) {
        /*
            r16 = this;
            r7 = r16
            r0 = r19
            boolean r1 = r0 instanceof com.stripe.android.networking.a.P
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$P r1 = (com.stripe.android.networking.a.P) r1
            int r2 = r1.f26172c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26172c = r2
        L16:
            r4 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$P r1 = new com.stripe.android.networking.a$P
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r4.f26170a
            java.lang.Object r8 = V5.b.e()
            int r1 = r4.f26172c
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto L6b
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            Q5.t.b(r0)
            B2.j$b r9 = r7.f26127m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f26113n
            java.lang.String r10 = r0.r()
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r17
            r12 = r18
            B2.j r1 = B2.j.b.b(r9, r10, r11, r12, r13, r14, r15)
            h3.s r3 = new h3.s
            r3.<init>()
            r4.f26172c = r2
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L6b
            return r8
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.e(B2.j$c, java.util.Map, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object f(java.lang.String r6, B2.j.c r7, java.util.List r8, U5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.a.Z
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.a$Z r0 = (com.stripe.android.networking.a.Z) r0
            int r1 = r0.f26196c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26196c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$Z r0 = new com.stripe.android.networking.a$Z
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26194a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26196c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r6 = r9.j()
            goto L71
        L3b:
            Q5.t.b(r9)
            com.stripe.android.model.n$c$a r9 = com.stripe.android.model.n.c.f25592c
            boolean r9 = r9.a(r6)
            if (r9 == 0) goto L4f
            r0.f26196c = r4
            java.lang.Object r6 = r5.c(r6, r7, r8, r0)
            if (r6 != r1) goto L71
            return r1
        L4f:
            com.stripe.android.model.u$b$a r9 = com.stripe.android.model.u.b.f25937c
            boolean r9 = r9.a(r6)
            if (r9 == 0) goto L60
            r0.f26196c = r3
            java.lang.Object r6 = r5.x(r6, r7, r8, r0)
            if (r6 != r1) goto L71
            return r1
        L60:
            Q5.s$a r6 = Q5.s.f8810b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid client secret."
            r6.<init>(r7)
            java.lang.Object r6 = Q5.t.a(r6)
            java.lang.Object r6 = Q5.s.b(r6)
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.f(java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(com.stripe.android.model.l r12, java.util.Set r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.G
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$G r0 = (com.stripe.android.networking.a.G) r0
            int r1 = r0.f26145c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26145c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$G r0 = new com.stripe.android.networking.a$G
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26143a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26145c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L62
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r15.t()
            java.util.Map r7 = r12.B()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            h3.w r14 = new h3.w
            r14.<init>()
            com.stripe.android.networking.a$H r15 = new com.stripe.android.networking.a$H
            r15.<init>(r13)
            r0.f26145c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L62
            return r1
        L62:
            boolean r13 = Q5.s.h(r12)
            if (r13 == 0) goto L6e
            g3.D r12 = (g3.C2894D) r12
            java.util.List r12 = r12.a()
        L6e:
            java.lang.Object r12 = Q5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.g(com.stripe.android.model.l, java.util.Set, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object h(com.stripe.android.model.c r19, B2.j.c r20, java.util.List r21, U5.d r22) {
        /*
            r18 = this;
            r7 = r18
            r0 = r22
            boolean r1 = r0 instanceof com.stripe.android.networking.a.C2623p
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$p r1 = (com.stripe.android.networking.a.C2623p) r1
            int r2 = r1.f26245c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26245c = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$p r1 = new com.stripe.android.networking.a$p
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.f26243a
            java.lang.Object r9 = V5.b.e()
            int r1 = r8.f26245c
            r10 = 1
            if (r1 == 0) goto L3e
            if (r1 != r10) goto L36
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto Lb9
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            Q5.t.b(r0)
            Q5.s$a r0 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L55
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r19.d()     // Catch: java.lang.Throwable -> L55
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = Q5.s.b(r0)     // Catch: java.lang.Throwable -> L55
            goto L60
        L55:
            r0 = move-exception
            Q5.s$a r1 = Q5.s.f8810b
            java.lang.Object r0 = Q5.t.a(r0)
            java.lang.Object r0 = Q5.s.b(r0)
        L60:
            java.lang.Throwable r1 = Q5.s.e(r0)
            if (r1 != 0) goto Lba
            java.lang.String r0 = (java.lang.String) r0
            r18.T()
            B2.j$b r11 = r7.f26127m
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f26113n
            java.lang.String r0 = r12.m(r0)
            j3.e r13 = r7.f26126l
            java.util.Map r2 = r19.B()
            com.stripe.android.model.p r3 = r19.h()
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r18
            java.util.Map r1 = c0(r1, r2, r3, r4, r5, r6)
            r2 = r21
            java.util.Map r2 = com.stripe.android.networking.a.C2609b.a(r12, r2)
            java.util.Map r1 = R5.Q.q(r1, r2)
            j3.d r2 = r18.W()
            java.util.Map r14 = r13.b(r1, r2)
            r16 = 8
            r17 = 0
            r15 = 0
            r12 = r0
            r13 = r20
            B2.j r0 = B2.j.b.d(r11, r12, r13, r14, r15, r16, r17)
            h3.x r1 = new h3.x
            r1.<init>()
            com.stripe.android.networking.a$q r2 = new com.stripe.android.networking.a$q
            r3 = r19
            r2.<init>(r3)
            r8.f26245c = r10
            java.lang.Object r0 = r7.P(r0, r1, r2, r8)
            if (r0 != r9) goto Lb9
            return r9
        Lb9:
            return r0
        Lba:
            java.lang.Object r0 = Q5.t.a(r1)
            java.lang.Object r0 = Q5.s.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.h(com.stripe.android.model.c, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object i(java.lang.String r14, java.lang.String r15, java.lang.String r16, B2.j.c r17, java.util.List r18, U5.d r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof com.stripe.android.networking.a.C2613f
            if (r2 == 0) goto L16
            r2 = r1
            com.stripe.android.networking.a$f r2 = (com.stripe.android.networking.a.C2613f) r2
            int r3 = r2.f26219c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f26219c = r3
            goto L1b
        L16:
            com.stripe.android.networking.a$f r2 = new com.stripe.android.networking.a$f
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f26217a
            java.lang.Object r3 = V5.b.e()
            int r4 = r2.f26219c
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            Q5.t.b(r1)
            Q5.s r1 = (Q5.s) r1
            java.lang.Object r1 = r1.j()
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            Q5.t.b(r1)
            B2.j$b r6 = r0.f26127m
            com.stripe.android.networking.a$b r1 = com.stripe.android.networking.a.f26113n
            r4 = r15
            r7 = r16
            java.lang.String r7 = r1.i(r15, r7)
            java.lang.String r4 = "client_secret"
            r8 = r14
            Q5.r r4 = Q5.x.a(r4, r14)
            java.util.Map r4 = R5.Q.e(r4)
            r8 = r18
            java.util.Map r1 = com.stripe.android.networking.a.C2609b.a(r1, r8)
            java.util.Map r9 = R5.Q.q(r4, r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            B2.j r1 = B2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            h3.x r4 = new h3.x
            r4.<init>()
            com.stripe.android.networking.a$g r6 = com.stripe.android.networking.a.C2614g.f26220a
            r2.f26219c = r5
            java.lang.Object r1 = r13.P(r1, r4, r6, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.i(java.lang.String, java.lang.String, java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object j(g3.C2898H r12, B2.j.c r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.b0
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$b0 r0 = (com.stripe.android.networking.a.b0) r0
            int r1 = r0.f26204c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26204c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$b0 r0 = new com.stripe.android.networking.a$b0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26202a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26204c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r12 = r14.j()
            goto L64
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r14)
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f26113n
            java.lang.String r2 = "3ds2/authenticate"
            java.lang.String r5 = com.stripe.android.networking.a.C2609b.b(r14, r2)
            java.util.Map r7 = r12.B()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.D r13 = new h3.D
            r13.<init>()
            com.stripe.android.networking.a$c0 r14 = new com.stripe.android.networking.a$c0
            r14.<init>()
            r0.f26204c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L64
            return r1
        L64:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.j(g3.H, B2.j$c, U5.d):java.lang.Object");
    }

    @Override // j3.m
    public String k(Set attribution) {
        AbstractC3292y.i(attribution, "attribution");
        return AbstractC1435t.w0(R5.a0.m(R5.a0.m(R5.a0.d("stripe-android/20.51.0"), this.f26120f), attribution), ";", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object l(java.lang.String r17, java.lang.String r18, B2.j.c r19, U5.d r20) {
        /*
            r16 = this;
            r7 = r16
            r0 = r20
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.I
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$I r2 = (com.stripe.android.networking.a.I) r2
            int r3 = r2.f26150c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f26150c = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$I r2 = new com.stripe.android.networking.a$I
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f26148a
            java.lang.Object r8 = V5.b.e()
            int r2 = r4.f26150c
            if (r2 == 0) goto L3d
            if (r2 != r1) goto L35
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto L90
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            Q5.t.b(r0)
            B2.j$b r9 = r7.f26127m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f26113n
            java.lang.String r10 = r0.p()
            java.lang.String r0 = "request_surface"
            java.lang.String r2 = "android_payment_element"
            Q5.r r0 = Q5.x.a(r0, r2)
            java.lang.String r2 = "consumer_session_client_secret"
            r3 = r17
            Q5.r r2 = Q5.x.a(r2, r3)
            java.util.Map r2 = R5.Q.e(r2)
            java.lang.String r3 = "credentials"
            Q5.r r2 = Q5.x.a(r3, r2)
            r3 = 2
            Q5.r[] r3 = new Q5.r[r3]
            r5 = 0
            r3[r5] = r0
            r3[r1] = r2
            java.util.Map r12 = R5.Q.k(r3)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r19
            B2.j r2 = B2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            h3.h r3 = new h3.h
            r3.<init>()
            r4.f26150c = r1
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L90
            return r8
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.l(java.lang.String, java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(com.stripe.android.model.b r6, B2.j.c r7, java.util.List r8, U5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.a.C2620m
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.a$m r0 = (com.stripe.android.networking.a.C2620m) r0
            int r1 = r0.f26237f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26237f = r1
            goto L18
        L13:
            com.stripe.android.networking.a$m r0 = new com.stripe.android.networking.a$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26235d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26237f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r6 = r9.j()
            goto L85
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f26234c
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r6 = r0.f26233b
            r7 = r6
            B2.j$c r7 = (B2.j.c) r7
            java.lang.Object r6 = r0.f26232a
            com.stripe.android.networking.a r6 = (com.stripe.android.networking.a) r6
            Q5.t.b(r9)
            Q5.s r9 = (Q5.s) r9
            java.lang.Object r9 = r9.j()
            goto L65
        L52:
            Q5.t.b(r9)
            r0.f26232a = r5
            r0.f26233b = r7
            r0.f26234c = r8
            r0.f26237f = r4
            java.lang.Object r9 = r5.d0(r6, r7, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r6 = r5
        L65:
            java.lang.Throwable r2 = Q5.s.e(r9)
            if (r2 != 0) goto L7d
            com.stripe.android.model.b r9 = (com.stripe.android.model.b) r9
            r2 = 0
            r0.f26232a = r2
            r0.f26233b = r2
            r0.f26234c = r2
            r0.f26237f = r3
            java.lang.Object r6 = r6.M(r9, r7, r8, r0)
            if (r6 != r1) goto L85
            return r1
        L7d:
            java.lang.Object r6 = Q5.t.a(r2)
            java.lang.Object r6 = Q5.s.b(r6)
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.m(com.stripe.android.model.b, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object n(java.lang.String r17, java.lang.String r18, java.util.Map r19, B2.j.c r20, U5.d r21) {
        /*
            r16 = this;
            r7 = r16
            r0 = r21
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.a0
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$a0 r2 = (com.stripe.android.networking.a.a0) r2
            int r3 = r2.f26201c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f26201c = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$a0 r2 = new com.stripe.android.networking.a$a0
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f26199a
            java.lang.Object r8 = V5.b.e()
            int r2 = r4.f26201c
            if (r2 == 0) goto L3e
            if (r2 != r1) goto L36
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto Lae
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            Q5.t.b(r0)
            B2.j$b r9 = r7.f26127m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f26113n
            java.lang.String r10 = r0.z()
            java.lang.String r0 = "request_surface"
            java.lang.String r2 = "android_payment_element"
            Q5.r r0 = Q5.x.a(r0, r2)
            java.lang.String r2 = "consumer_session_client_secret"
            r3 = r17
            Q5.r r2 = Q5.x.a(r2, r3)
            java.util.Map r2 = R5.Q.e(r2)
            java.lang.String r3 = "credentials"
            Q5.r r2 = Q5.x.a(r3, r2)
            java.lang.String r3 = "id"
            r5 = r18
            Q5.r r3 = Q5.x.a(r3, r5)
            r5 = 0
            Q5.r r5 = L(r7, r5, r1, r5)
            r6 = 4
            Q5.r[] r6 = new Q5.r[r6]
            r11 = 0
            r6[r11] = r0
            r6[r1] = r2
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r5
            java.util.Map r0 = R5.Q.k(r6)
            if (r19 != 0) goto L89
            java.util.Map r2 = R5.Q.h()
            goto L8b
        L89:
            r2 = r19
        L8b:
            java.util.Map r12 = R5.Q.q(r0, r2)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r20
            B2.j r2 = B2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            h3.g r3 = h3.C2945g.f32578b
            r4.f26201c = r1
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto Lae
            return r8
        Lae:
            boolean r1 = Q5.s.h(r0)
            if (r1 == 0) goto Lba
            g3.n r0 = (g3.C2915n) r0
            java.lang.String r0 = r0.getId()
        Lba:
            java.lang.Object r0 = Q5.s.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.n(java.lang.String, java.lang.String, java.util.Map, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(java.lang.String r12, java.lang.String r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2615h
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$h r0 = (com.stripe.android.networking.a.C2615h) r0
            int r1 = r0.f26223c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26223c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$h r0 = new com.stripe.android.networking.a$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26221a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26223c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L6b
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r15.j(r12)
            java.lang.String r12 = "source"
            Q5.r r12 = Q5.x.a(r12, r13)
            java.util.Map r7 = R5.Q.e(r12)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.u r13 = new h3.u
            r13.<init>()
            com.stripe.android.networking.a$i r14 = new com.stripe.android.networking.a$i
            r14.<init>()
            r0.f26223c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L6b
            return r1
        L6b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.o(java.lang.String, java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(java.lang.String r12, com.stripe.android.model.t r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.d0
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$d0 r0 = (com.stripe.android.networking.a.d0) r0
            int r1 = r0.f26213c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26213c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$d0 r0 = new com.stripe.android.networking.a$d0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26211a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26213c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L65
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r15.s(r12)
            java.util.Map r7 = r13.B()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.v r14 = new h3.v
            r14.<init>()
            com.stripe.android.networking.a$e0 r15 = new com.stripe.android.networking.a$e0
            r15.<init>(r13)
            r0.f26213c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L65
            return r1
        L65:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.p(java.lang.String, com.stripe.android.model.t, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(java.lang.String r12, com.stripe.android.model.d r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2627t
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$t r0 = (com.stripe.android.networking.a.C2627t) r0
            int r1 = r0.f26254c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26254c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$t r0 = new com.stripe.android.networking.a$t
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26252a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26254c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            B2.j$b r4 = r11.f26127m
            java.lang.String r5 = r11.X(r12)
            java.util.Map r7 = r13.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.p r13 = new h3.p
            r13.<init>()
            com.stripe.android.networking.a$u r14 = com.stripe.android.networking.a.C2628u.f26255a
            r0.f26254c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.q(java.lang.String, com.stripe.android.model.d, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object r(java.lang.String r12, java.lang.String r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2617j
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$j r0 = (com.stripe.android.networking.a.C2617j) r0
            int r1 = r0.f26227c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26227c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$j r0 = new com.stripe.android.networking.a$j
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26225a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26227c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L68
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r15.k(r12)
            java.lang.String r12 = "source"
            Q5.r r12 = Q5.x.a(r12, r13)
            java.util.Map r7 = R5.Q.e(r12)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.x r13 = new h3.x
            r13.<init>()
            com.stripe.android.networking.a$k r14 = new com.stripe.android.networking.a$k
            r14.<init>()
            r0.f26227c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L68
            return r1
        L68:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.r(java.lang.String, java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(java.lang.String r12, java.util.Set r13, B2.j.c r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.Q
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$Q r0 = (com.stripe.android.networking.a.Q) r0
            int r1 = r0.f26175c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26175c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$Q r0 = new com.stripe.android.networking.a$Q
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26173a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26175c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r15.w(r12)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r14
            B2.j r12 = B2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            h3.k r14 = new h3.k
            r14.<init>()
            com.stripe.android.networking.a$R r15 = new com.stripe.android.networking.a$R
            r15.<init>(r13)
            r0.f26175c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L5f
            return r1
        L5f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.s(java.lang.String, java.util.Set, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object t(g3.s r12, B2.j.c r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.C2625r
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$r r0 = (com.stripe.android.networking.a.C2625r) r0
            int r1 = r0.f26250c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26250c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$r r0 = new com.stripe.android.networking.a$r
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26248a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26250c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r12 = r14.j()
            goto L5f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r14)
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r14.n()
            java.util.Map r7 = r12.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.p r13 = new h3.p
            r13.<init>()
            com.stripe.android.networking.a$s r14 = com.stripe.android.networking.a.C2626s.f26251a
            r0.f26250c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5f
            return r1
        L5f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.t(g3.s, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object u(java.lang.String r12, B2.j.c r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.N
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$N r0 = (com.stripe.android.networking.a.N) r0
            int r1 = r0.f26168c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26168c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$N r0 = new com.stripe.android.networking.a$N
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26166a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26168c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r12 = r14.j()
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r14)
            Q5.s$a r14 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.u$b r14 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4a
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r14 = Q5.s.b(r14)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r14 = move-exception
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r14 = Q5.t.a(r14)
            java.lang.Object r14 = Q5.s.b(r14)
        L55:
            java.lang.Throwable r2 = Q5.s.e(r14)
            if (r2 != 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r2.v(r14)
            java.util.List r14 = R5.AbstractC1435t.m()
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.x r13 = new h3.x
            r13.<init>()
            com.stripe.android.networking.a$O r14 = new com.stripe.android.networking.a$O
            r14.<init>()
            r0.f26168c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            return r12
        L8d:
            java.lang.Object r12 = Q5.t.a(r2)
            java.lang.Object r12 = Q5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.u(java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object v(java.lang.String r12, B2.j.c r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.L
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$L r0 = (com.stripe.android.networking.a.L) r0
            int r1 = r0.f26164c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26164c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$L r0 = new com.stripe.android.networking.a$L
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26162a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26164c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r12 = r14.j()
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r14)
            Q5.s$a r14 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.n$c r14 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4a
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r14 = Q5.s.b(r14)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r14 = move-exception
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r14 = Q5.t.a(r14)
            java.lang.Object r14 = Q5.s.b(r14)
        L55:
            java.lang.Throwable r2 = Q5.s.e(r14)
            if (r2 != 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r2.u(r14)
            java.util.List r14 = R5.AbstractC1435t.m()
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r12 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.u r13 = new h3.u
            r13.<init>()
            com.stripe.android.networking.a$M r14 = new com.stripe.android.networking.a$M
            r14.<init>()
            r0.f26164c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            return r12
        L8d:
            java.lang.Object r12 = Q5.t.a(r2)
            java.lang.Object r12 = Q5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.v(java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object w(com.stripe.android.model.p r12, B2.j.c r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.C2629v
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$v r0 = (com.stripe.android.networking.a.C2629v) r0
            int r1 = r0.f26258c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26258c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$v r0 = new com.stripe.android.networking.a$v
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26256a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26258c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r12 = r14.j()
            goto L87
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r14)
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r14.t()
            java.util.Map r14 = r12.B()
            java.util.Set r2 = r12.i()
            Q5.r r2 = r11.K(r2)
            java.util.Map r14 = R5.Q.o(r14, r2)
            j3.d r2 = r11.W()
            if (r2 == 0) goto L60
            java.util.Map r2 = r2.f()
            goto L61
        L60:
            r2 = 0
        L61:
            if (r2 != 0) goto L67
            java.util.Map r2 = R5.Q.h()
        L67:
            java.util.Map r7 = R5.Q.q(r14, r2)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r13 = B2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            h3.v r14 = new h3.v
            r14.<init>()
            com.stripe.android.networking.a$w r2 = new com.stripe.android.networking.a$w
            r2.<init>(r12)
            r0.f26258c = r3
            java.lang.Object r12 = r11.P(r13, r14, r2, r0)
            if (r12 != r1) goto L87
            return r1
        L87:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.w(com.stripe.android.model.p, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object x(java.lang.String r12, B2.j.c r13, java.util.List r14, U5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.X
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$X r0 = (com.stripe.android.networking.a.X) r0
            int r1 = r0.f26192c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26192c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$X r0 = new com.stripe.android.networking.a$X
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26190a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26192c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r15)
            Q5.s r15 = (Q5.s) r15
            java.lang.Object r12 = r15.j()
            goto L88
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            Q5.t.b(r15)
            Q5.s$a r15 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.u$b r15 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r15 = r15.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r15 = Q5.s.b(r15)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r15 = move-exception
            Q5.s$a r2 = Q5.s.f8810b
            java.lang.Object r15 = Q5.t.a(r15)
            java.lang.Object r15 = Q5.s.b(r15)
        L55:
            java.lang.Throwable r2 = Q5.s.e(r15)
            if (r2 != 0) goto L89
            java.lang.String r15 = (java.lang.String) r15
            r11.T()
            B2.j$b r4 = r11.f26127m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f26113n
            java.lang.String r5 = r2.y(r15)
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            B2.j r12 = B2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            h3.x r13 = new h3.x
            r13.<init>()
            com.stripe.android.networking.a$Y r14 = new com.stripe.android.networking.a$Y
            r14.<init>()
            r0.f26192c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L88
            return r1
        L88:
            return r12
        L89:
            java.lang.Object r12 = Q5.t.a(r2)
            java.lang.Object r12 = Q5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.x(java.lang.String, B2.j$c, java.util.List, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object y(java.lang.String r17, B2.j.c r18, U5.d r19) {
        /*
            r16 = this;
            r7 = r16
            r0 = r19
            boolean r1 = r0 instanceof com.stripe.android.networking.a.C2619l
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$l r1 = (com.stripe.android.networking.a.C2619l) r1
            int r2 = r1.f26231c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26231c = r2
        L16:
            r4 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$l r1 = new com.stripe.android.networking.a$l
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r4.f26229a
            java.lang.Object r8 = V5.b.e()
            int r1 = r4.f26231c
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            Q5.t.b(r0)
            Q5.s r0 = (Q5.s) r0
            java.lang.Object r0 = r0.j()
            goto L77
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            Q5.t.b(r0)
            B2.j$b r9 = r7.f26127m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f26113n
            java.lang.String r1 = "3ds2/challenge_complete"
            java.lang.String r10 = com.stripe.android.networking.a.C2609b.b(r0, r1)
            java.lang.String r0 = "source"
            r1 = r17
            Q5.r r0 = Q5.x.a(r0, r1)
            java.util.Map r12 = R5.Q.e(r0)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r18
            B2.j r1 = B2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            h3.D r3 = new h3.D
            r3.<init>()
            r4.f26231c = r2
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L77
            return r8
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.y(java.lang.String, B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // j3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object z(B2.j.c r13, U5.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.E
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$E r0 = (com.stripe.android.networking.a.E) r0
            int r1 = r0.f26141c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26141c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$E r0 = new com.stripe.android.networking.a$E
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26139a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f26141c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            Q5.t.b(r14)
            Q5.s r14 = (Q5.s) r14
            java.lang.Object r13 = r14.j()
            goto L75
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            Q5.t.b(r14)
            B2.j$b r4 = r12.f26127m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f26113n
            java.lang.String r2 = "fpx/bank_statuses"
            java.lang.String r5 = com.stripe.android.networking.a.C2609b.b(r14, r2)
            r10 = 5
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            B2.j$c r6 = B2.j.c.b(r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "account_holder_type"
            java.lang.String r14 = "individual"
            Q5.r r13 = Q5.x.a(r13, r14)
            java.util.Map r7 = R5.Q.e(r13)
            r9 = 8
            r10 = 0
            r8 = 0
            B2.j r13 = B2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            h3.q r14 = new h3.q
            r14.<init>()
            com.stripe.android.networking.a$F r2 = new com.stripe.android.networking.a$F
            r2.<init>()
            r0.f26141c = r3
            java.lang.Object r13 = r12.P(r13, r14, r2, r0)
            if (r13 != r1) goto L75
            return r1
        L75:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.z(B2.j$c, U5.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ a(android.content.Context r20, kotlin.jvm.functions.Function0 r21, v2.c r22, v2.d r23, U5.g r24, java.util.Set r25, B2.F r26, B2.InterfaceC0951c r27, n2.InterfaceC3406i r28, p2.InterfaceC3560b.a r29, com.stripe.android.networking.PaymentAnalyticsRequestFactory r30, j3.C3154e r31, java.util.Set r32, java.lang.String r33, java.lang.String r34, int r35, kotlin.jvm.internal.AbstractC3284p r36) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.<init>(android.content.Context, kotlin.jvm.functions.Function0, v2.c, v2.d, U5.g, java.util.Set, B2.F, B2.c, n2.i, p2.b$a, com.stripe.android.networking.PaymentAnalyticsRequestFactory, j3.e, java.util.Set, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context appContext, Function0 publishableKeyProvider, g workContext, Set productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0951c analyticsRequestExecutor, d logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        AbstractC3292y.i(appContext, "appContext");
        AbstractC3292y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3292y.i(workContext, "workContext");
        AbstractC3292y.i(productUsageTokens, "productUsageTokens");
        AbstractC3292y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3292y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3292y.i(logger, "logger");
    }
}
