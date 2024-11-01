package com.uptodown.activities;

import J4.j;
import Q5.InterfaceC1416k;
import Y4.C1503b0;
import Z4.C1635y1;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import c5.C2035E;
import c5.C2043h;
import c5.C2046k;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import com.uptodown.activities.MoreInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3788m;

/* loaded from: classes4.dex */
public final class MoreInfo extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private C1635y1 f29801Q;

    /* renamed from: R, reason: collision with root package name */
    private C2043h f29802R;

    /* renamed from: S, reason: collision with root package name */
    private ArrayList f29803S;

    /* renamed from: T, reason: collision with root package name */
    private ArrayList f29804T;

    /* renamed from: U, reason: collision with root package name */
    private ArrayList f29805U;

    /* renamed from: O, reason: collision with root package name */
    private final LifecycleCoroutineScope f29799O = LifecycleOwnerKt.getLifecycleScope(this);

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f29800P = Q5.l.b(new Function0() { // from class: F4.K1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.N x32;
            x32 = MoreInfo.x3(MoreInfo.this);
            return x32;
        }
    });

    /* renamed from: V, reason: collision with root package name */
    private final int f29806V = 2;

    /* loaded from: classes4.dex */
    public final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final c5.r f29807a;

        public a(c5.r rVar) {
            this.f29807a = rVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (MoreInfo.this.f29801Q != null) {
                C1635y1 c1635y1 = MoreInfo.this.f29801Q;
                AbstractC3292y.f(c1635y1);
                c5.r rVar = this.f29807a;
                if (rVar != null) {
                    str = rVar.Y();
                } else {
                    str = null;
                }
                c1635y1.S(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29809a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29811a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ MoreInfo f29812b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(MoreInfo moreInfo, U5.d dVar) {
                super(2, dVar);
                this.f29812b = moreInfo;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f29812b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29811a == 0) {
                    Q5.t.b(obj);
                    ArrayList arrayList = this.f29812b.f29803S;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        this.f29812b.B3().f12283A.setVisibility(0);
                        TextView textView = this.f29812b.B3().f12309T;
                        j.a aVar = J4.j.f4395g;
                        textView.setTypeface(aVar.u());
                        this.f29812b.B3().f12310U.setTypeface(aVar.v());
                        ArrayList arrayList2 = this.f29812b.f29803S;
                        AbstractC3292y.f(arrayList2);
                        Iterator it = arrayList2.iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        String str = null;
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            String str2 = (String) next;
                            if (str == null) {
                                str = str2;
                            } else {
                                str = str + ", " + str2;
                            }
                        }
                        this.f29812b.B3().f12310U.setText(str);
                    }
                    return Q5.I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            Object e8 = V5.b.e();
            int i9 = this.f29809a;
            if (i9 != 0) {
                if (i9 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Context applicationContext = MoreInfo.this.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3775H c3775h = new C3775H(applicationContext);
                C2043h c2043h = MoreInfo.this.f29802R;
                AbstractC3292y.f(c2043h);
                c5.K l8 = c3775h.l(c2043h.h());
                if (!l8.b() && l8.d() != null) {
                    String d8 = l8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = l8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA) && (jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                            MoreInfo.this.f29803S = new ArrayList();
                            int length = jSONArray.length();
                            for (int i10 = 0; i10 < length; i10++) {
                                ArrayList arrayList = MoreInfo.this.f29803S;
                                AbstractC3292y.f(arrayList);
                                arrayList.add(jSONArray.get(i10).toString());
                            }
                        }
                        J0 c8 = C3445b0.c();
                        a aVar = new a(MoreInfo.this, null);
                        this.f29809a = 1;
                        if (AbstractC3458i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    }
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29813a;

        /* renamed from: b, reason: collision with root package name */
        Object f29814b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29815c;

        /* renamed from: e, reason: collision with root package name */
        int f29817e;

        c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29815c = obj;
            this.f29817e |= Integer.MIN_VALUE;
            return MoreInfo.this.C3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29818a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f29820c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(T t8, U5.d dVar) {
            super(2, dVar);
            this.f29820c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f29820c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            V5.b.e();
            if (this.f29818a == 0) {
                Q5.t.b(obj);
                Context applicationContext = MoreInfo.this.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                C3775H c3775h = new C3775H(applicationContext);
                C2043h c2043h = MoreInfo.this.f29802R;
                AbstractC3292y.f(c2043h);
                c5.K n8 = c3775h.n(c2043h.h());
                if (!n8.b() && n8.d() != null) {
                    String d8 = n8.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = n8.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull("success")) {
                            i8 = jSONObject.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA) && (jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA)) != null) {
                            this.f29820c.f34573a = new ArrayList();
                            int length = jSONArray.length();
                            for (int i9 = 0; i9 < length; i9++) {
                                Object obj2 = this.f29820c.f34573a;
                                AbstractC3292y.f(obj2);
                                ((ArrayList) obj2).add(jSONArray.getString(i9));
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
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29821a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f29822b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreInfo f29823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(T t8, MoreInfo moreInfo, U5.d dVar) {
            super(2, dVar);
            this.f29822b = t8;
            this.f29823c = moreInfo;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k(final MoreInfo moreInfo, View view) {
            if (moreInfo.B3().f12358v.getVisibility() == 0) {
                moreInfo.B3().f12358v.setVisibility(8);
                moreInfo.B3().f12336k.setImageResource(R.drawable.vector_add);
            } else {
                moreInfo.B3().f12358v.setVisibility(0);
                moreInfo.B3().f12336k.setImageResource(R.drawable.vector_remove);
                moreInfo.B3().f12307R.post(new Runnable() { // from class: com.uptodown.activities.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        MoreInfo.e.p(MoreInfo.this);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(MoreInfo moreInfo) {
            moreInfo.B3().f12307R.smoothScrollTo(0, moreInfo.B3().f12298I.getTop());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f29822b, this.f29823c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29821a == 0) {
                Q5.t.b(obj);
                Collection collection = (Collection) this.f29822b.f34573a;
                if (collection != null && !collection.isEmpty()) {
                    this.f29823c.B3().f12298I.setVisibility(0);
                    TextView textView = this.f29823c.B3().f12339l0;
                    j.a aVar = J4.j.f4395g;
                    textView.setTypeface(aVar.u());
                    this.f29823c.B3().f12341m0.setTypeface(aVar.v());
                    TextView textView2 = this.f29823c.B3().f12341m0;
                    Object obj2 = this.f29822b.f34573a;
                    AbstractC3292y.f(obj2);
                    textView2.setText(String.valueOf(((ArrayList) obj2).size()));
                    RelativeLayout relativeLayout = this.f29823c.B3().f12298I;
                    final MoreInfo moreInfo = this.f29823c;
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.activities.i
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            MoreInfo.e.k(MoreInfo.this, view);
                        }
                    });
                    MoreInfo moreInfo2 = this.f29823c;
                    moreInfo2.J3((ArrayList) this.f29822b.f34573a, moreInfo2.B3().f12358v);
                } else {
                    this.f29823c.B3().f12298I.setVisibility(8);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29824a;

        /* renamed from: b, reason: collision with root package name */
        Object f29825b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29826c;

        /* renamed from: e, reason: collision with root package name */
        int f29828e;

        f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29826c = obj;
            this.f29828e |= Integer.MIN_VALUE;
            return MoreInfo.this.D3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29829a;

        g(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29829a == 0) {
                Q5.t.b(obj);
                MoreInfo.this.B3().f12366z.f12236b.setVisibility(0);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29831a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Q f29833c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Q q8, U5.d dVar) {
            super(2, dVar);
            this.f29833c = q8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f29833c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            JSONObject jSONObject;
            V5.b.e();
            if (this.f29831a == 0) {
                Q5.t.b(obj);
                try {
                    Context applicationContext = MoreInfo.this.getApplicationContext();
                    AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                    C3775H c3775h = new C3775H(applicationContext);
                    C2043h c2043h = MoreInfo.this.f29802R;
                    AbstractC3292y.f(c2043h);
                    c5.K M8 = c3775h.M(c2043h.h());
                    if (!M8.b() && M8.d() != null) {
                        String d8 = M8.d();
                        AbstractC3292y.f(d8);
                        if (d8.length() > 0) {
                            String d9 = M8.d();
                            AbstractC3292y.f(d9);
                            JSONObject jSONObject2 = new JSONObject(d9);
                            if (!jSONObject2.isNull("success")) {
                                this.f29833c.f34571a = jSONObject2.getInt("success");
                            }
                            if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                                jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            } else {
                                jSONObject = null;
                            }
                            if (this.f29833c.f34571a == 1 && jSONObject != null) {
                                MoreInfo.this.f29804T = new ArrayList();
                                if (!jSONObject.isNull("permissions_concern")) {
                                    JSONArray jSONArray = jSONObject.getJSONArray("permissions_concern");
                                    int length = jSONArray.length();
                                    for (int i8 = 0; i8 < length; i8++) {
                                        C2035E c2035e = new C2035E();
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i8);
                                        AbstractC3292y.h(jSONObject3, "getJSONObject(...)");
                                        c2035e.a(jSONObject3);
                                        ArrayList arrayList = MoreInfo.this.f29804T;
                                        AbstractC3292y.f(arrayList);
                                        arrayList.add(c2035e);
                                    }
                                }
                                MoreInfo.this.f29805U = new ArrayList();
                                if (!jSONObject.isNull("permissions")) {
                                    JSONArray jSONArray2 = jSONObject.getJSONArray("permissions");
                                    int length2 = jSONArray2.length();
                                    for (int i9 = 0; i9 < length2; i9++) {
                                        C2035E c2035e2 = new C2035E();
                                        JSONObject jSONObject4 = jSONArray2.getJSONObject(i9);
                                        AbstractC3292y.h(jSONObject4, "getJSONObject(...)");
                                        c2035e2.a(jSONObject4);
                                        ArrayList arrayList2 = MoreInfo.this.f29805U;
                                        AbstractC3292y.f(arrayList2);
                                        arrayList2.add(c2035e2);
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e8) {
                    e8.printStackTrace();
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29834a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Q f29835b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MoreInfo f29836c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Q q8, MoreInfo moreInfo, U5.d dVar) {
            super(2, dVar);
            this.f29835b = q8;
            this.f29836c = moreInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f29835b, this.f29836c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f29834a == 0) {
                Q5.t.b(obj);
                if (this.f29835b.f34571a == 1) {
                    this.f29836c.B3().f12302M.setVisibility(0);
                    ArrayList arrayList = this.f29836c.f29804T;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        MoreInfo moreInfo = this.f29836c;
                        moreInfo.Q3(moreInfo.f29804T, this.f29836c.B3().f12356u);
                        ArrayList arrayList2 = this.f29836c.f29804T;
                        AbstractC3292y.f(arrayList2);
                        i8 = arrayList2.size();
                    } else {
                        this.f29836c.B3().f12302M.setVisibility(8);
                        i8 = 0;
                    }
                    ArrayList arrayList3 = this.f29836c.f29805U;
                    if (arrayList3 != null && !arrayList3.isEmpty()) {
                        MoreInfo moreInfo2 = this.f29836c;
                        moreInfo2.Q3(moreInfo2.f29805U, this.f29836c.B3().f12362x);
                        ArrayList arrayList4 = this.f29836c.f29805U;
                        AbstractC3292y.f(arrayList4);
                        i8 += arrayList4.size();
                    }
                    C2043h c2043h = this.f29836c.f29802R;
                    if (c2043h != null && c2043h.x0() == 0) {
                        this.f29836c.B3().f12361w0.setText(String.valueOf(i8));
                    }
                } else {
                    this.f29836c.B3().f12302M.setVisibility(8);
                }
                this.f29836c.B3().f12366z.f12236b.setVisibility(8);
                this.f29836c.B3().f12307R.setVisibility(0);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29837a;

        j(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29837a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f29837a = 1;
                if (moreInfo.D3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29839a;

        k(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29839a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f29839a = 1;
                if (moreInfo.A3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29841a;

        l(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29841a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                MoreInfo moreInfo = MoreInfo.this;
                this.f29841a = 1;
                if (moreInfo.C3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object A3(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.N B3() {
        return (Y4.N) this.f29800P.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object C3(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.MoreInfo.c
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.MoreInfo$c r0 = (com.uptodown.activities.MoreInfo.c) r0
            int r1 = r0.f29817e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29817e = r1
            goto L18
        L13:
            com.uptodown.activities.MoreInfo$c r0 = new com.uptodown.activities.MoreInfo$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29815c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29817e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r8)
            goto L76
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            java.lang.Object r2 = r0.f29814b
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r4 = r0.f29813a
            com.uptodown.activities.MoreInfo r4 = (com.uptodown.activities.MoreInfo) r4
            Q5.t.b(r8)
            goto L60
        L41:
            Q5.t.b(r8)
            kotlin.jvm.internal.T r2 = new kotlin.jvm.internal.T
            r2.<init>()
            n6.I r8 = n6.C3445b0.b()
            com.uptodown.activities.MoreInfo$d r6 = new com.uptodown.activities.MoreInfo$d
            r6.<init>(r2, r5)
            r0.f29813a = r7
            r0.f29814b = r2
            r0.f29817e = r4
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r6, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r4 = r7
        L60:
            n6.J0 r8 = n6.C3445b0.c()
            com.uptodown.activities.MoreInfo$e r6 = new com.uptodown.activities.MoreInfo$e
            r6.<init>(r2, r4, r5)
            r0.f29813a = r5
            r0.f29814b = r5
            r0.f29817e = r3
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r6, r0)
            if (r8 != r1) goto L76
            return r1
        L76:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.C3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object D3(U5.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.MoreInfo.f
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.MoreInfo$f r0 = (com.uptodown.activities.MoreInfo.f) r0
            int r1 = r0.f29828e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29828e = r1
            goto L18
        L13:
            com.uptodown.activities.MoreInfo$f r0 = new com.uptodown.activities.MoreInfo$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f29826c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29828e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r9)
            goto L9d
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            java.lang.Object r2 = r0.f29825b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r4 = r0.f29824a
            com.uptodown.activities.MoreInfo r4 = (com.uptodown.activities.MoreInfo) r4
            Q5.t.b(r9)
            goto L87
        L44:
            java.lang.Object r2 = r0.f29825b
            kotlin.jvm.internal.Q r2 = (kotlin.jvm.internal.Q) r2
            java.lang.Object r5 = r0.f29824a
            com.uptodown.activities.MoreInfo r5 = (com.uptodown.activities.MoreInfo) r5
            Q5.t.b(r9)
            goto L70
        L50:
            Q5.t.b(r9)
            kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
            r9.<init>()
            n6.J0 r2 = n6.C3445b0.c()
            com.uptodown.activities.MoreInfo$g r7 = new com.uptodown.activities.MoreInfo$g
            r7.<init>(r6)
            r0.f29824a = r8
            r0.f29825b = r9
            r0.f29828e = r5
            java.lang.Object r2 = n6.AbstractC3458i.g(r2, r7, r0)
            if (r2 != r1) goto L6e
            return r1
        L6e:
            r5 = r8
            r2 = r9
        L70:
            n6.I r9 = n6.C3445b0.b()
            com.uptodown.activities.MoreInfo$h r7 = new com.uptodown.activities.MoreInfo$h
            r7.<init>(r2, r6)
            r0.f29824a = r5
            r0.f29825b = r2
            r0.f29828e = r4
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r7, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            r4 = r5
        L87:
            n6.J0 r9 = n6.C3445b0.c()
            com.uptodown.activities.MoreInfo$i r5 = new com.uptodown.activities.MoreInfo$i
            r5.<init>(r2, r4, r6)
            r0.f29824a = r6
            r0.f29825b = r6
            r0.f29828e = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r5, r0)
            if (r9 != r1) goto L9d
            return r1
        L9d:
            Q5.I r9 = Q5.I.f8786a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.D3(U5.d):java.lang.Object");
    }

    private final void E3(final TextView textView, final View view) {
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: F4.U1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                MoreInfo.F3(textView, this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(final TextView textView, final MoreInfo moreInfo, final View view) {
        if (s5.u.a(textView)) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: F4.L1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MoreInfo.G3(MoreInfo.this, textView, view, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(MoreInfo moreInfo, TextView textView, View view, View view2) {
        moreInfo.y3(textView, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(MoreInfo moreInfo, View view) {
        moreInfo.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J3(ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        AbstractC3292y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C1503b0 c8 = C1503b0.c(LayoutInflater.from(getApplicationContext()));
            AbstractC3292y.h(c8, "inflate(...)");
            c8.getRoot().setLayoutParams(layoutParams);
            c8.f12485b.setTypeface(J4.j.f4395g.v());
            TextView textView = c8.f12485b;
            Object obj = arrayList.get(i8);
            AbstractC3292y.h(obj, "get(...)");
            String upperCase = ((String) obj).toUpperCase(Locale.ROOT);
            AbstractC3292y.h(upperCase, "toUpperCase(...)");
            textView.setText(upperCase);
            AbstractC3292y.f(linearLayout);
            linearLayout.addView(c8.getRoot());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x04be A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x020c A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0145 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01ce A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0220 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0268 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02c9 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03cc A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0478 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04d2 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0550 A[Catch: all -> 0x004f, Exception -> 0x0052, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0561 A[Catch: all -> 0x004f, Exception -> 0x0052, TRY_LEAVE, TryCatch #0 {Exception -> 0x0052, blocks: (B:4:0x0003, B:6:0x001d, B:9:0x0024, B:11:0x002f, B:12:0x005e, B:14:0x0069, B:17:0x0070, B:18:0x00a6, B:20:0x00b4, B:22:0x00bf, B:24:0x00c7, B:27:0x00ce, B:28:0x013a, B:30:0x0145, B:33:0x014c, B:35:0x0183, B:38:0x018a, B:39:0x01c3, B:41:0x01ce, B:43:0x01df, B:44:0x0215, B:46:0x0220, B:49:0x0227, B:50:0x025d, B:52:0x0268, B:55:0x026f, B:56:0x02be, B:58:0x02c9, B:60:0x02d4, B:62:0x0313, B:65:0x031a, B:66:0x0369, B:68:0x0374, B:71:0x037b, B:72:0x03c1, B:74:0x03cc, B:77:0x03d3, B:78:0x042e, B:80:0x0478, B:81:0x04c7, B:83:0x04d2, B:86:0x04d9, B:88:0x04ef, B:91:0x04f6, B:92:0x050c, B:93:0x052b, B:95:0x0550, B:99:0x0561, B:100:0x04be, B:101:0x0400, B:102:0x03b8, B:103:0x0360, B:104:0x040a, B:105:0x02b5, B:106:0x0254, B:107:0x01d4, B:109:0x020c, B:110:0x01ba, B:112:0x0131, B:113:0x009d, B:114:0x0055), top: B:3:0x0003, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void K3() {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.MoreInfo.K3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(MoreInfo moreInfo, View view) {
        C2043h c2043h = moreInfo.f29802R;
        AbstractC3292y.f(c2043h);
        C2046k p8 = c2043h.p();
        AbstractC3292y.f(p8);
        moreInfo.S3(p8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(MoreInfo moreInfo, View view) {
        if (!moreInfo.isFinishing()) {
            C3788m c3788m = new C3788m();
            C2043h c2043h = moreInfo.f29802R;
            AbstractC3292y.f(c2043h);
            String c12 = c2043h.c1();
            AbstractC3292y.f(c12);
            C3788m.r(c3788m, moreInfo, c12, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(final MoreInfo moreInfo, View view) {
        if (moreInfo.B3().f12364y.getVisibility() == 0) {
            moreInfo.B3().f12364y.setVisibility(8);
            moreInfo.B3().f12346p.setImageResource(R.drawable.vector_add);
        } else {
            moreInfo.B3().f12364y.setVisibility(0);
            moreInfo.B3().f12346p.setImageResource(R.drawable.vector_remove);
            moreInfo.B3().f12307R.post(new Runnable() { // from class: F4.T1
                @Override // java.lang.Runnable
                public final void run() {
                    MoreInfo.O3(MoreInfo.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(MoreInfo moreInfo) {
        moreInfo.B3().f12307R.smoothScrollTo(0, moreInfo.B3().f12302M.getTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(MoreInfo moreInfo, View view) {
        if (!moreInfo.isFinishing()) {
            C3788m c3788m = new C3788m();
            String string = moreInfo.getString(R.string.url_iap);
            AbstractC3292y.h(string, "getString(...)");
            C3788m.r(c3788m, moreInfo, string, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q3(ArrayList arrayList, LinearLayout linearLayout) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, 0);
        AbstractC3292y.f(arrayList);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            String b9 = ((C2035E) arrayList.get(i8)).b();
            if (b9 != null && b9.length() != 0) {
                final C1503b0 c8 = C1503b0.c(LayoutInflater.from(getApplicationContext()));
                AbstractC3292y.h(c8, "inflate(...)");
                c8.getRoot().setLayoutParams(layoutParams);
                c8.f12485b.setTypeface(J4.j.f4395g.v());
                c8.f12485b.setText(((C2035E) arrayList.get(i8)).b());
                c8.f12485b.setOnClickListener(new View.OnClickListener() { // from class: F4.O1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MoreInfo.R3(C1503b0.this, view);
                    }
                });
                AbstractC3292y.f(linearLayout);
                linearLayout.addView(c8.getRoot());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(C1503b0 c1503b0, View view) {
        if (c1503b0.f12485b.getMaxLines() == 1) {
            c1503b0.f12485b.setMaxLines(Integer.MAX_VALUE);
        } else {
            c1503b0.f12485b.setMaxLines(1);
        }
    }

    private final void S3(C2046k c2046k) {
        C1635y1 a9 = C1635y1.f13904i.a(c2046k);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.slide_next_in, R.anim.slide_back_out).add(android.R.id.content, a9, (String) null).addToBackStack(String.valueOf(c2046k.b())).commit();
        this.f29801Q = a9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.N x3(MoreInfo moreInfo) {
        return Y4.N.c(moreInfo.getLayoutInflater());
    }

    private final void y3(TextView textView, View view) {
        view.setVisibility(8);
        int maxLines = textView.getMaxLines();
        int i8 = this.f29806V;
        if (maxLines == i8) {
            textView.setMaxLines(Integer.MAX_VALUE);
        } else {
            textView.setMaxLines(i8);
        }
        view.setVisibility(0);
    }

    private final String z3(String str) {
        String str2 = "";
        while (str.length() > 3) {
            Y y8 = Y.f34578a;
            String substring = str.substring(str.length() - 3);
            AbstractC3292y.h(substring, "substring(...)");
            str2 = String.format(",%s%s", Arrays.copyOf(new Object[]{substring, str2}, 2));
            AbstractC3292y.h(str2, "format(...)");
            str = str.substring(0, str.length() - 3);
            AbstractC3292y.h(str, "substring(...)");
        }
        if (str.length() > 0) {
            return str + str2;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        try {
            setContentView(B3().getRoot());
            Intent intent = getIntent();
            if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("appInfo")) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appInfo", C2043h.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appInfo");
                }
                this.f29802R = (C2043h) parcelable;
            }
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                B3().f12308S.setNavigationIcon(drawable);
                B3().f12308S.setNavigationContentDescription(getString(R.string.back));
            }
            B3().f12308S.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.M1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreInfo.H3(MoreInfo.this, view);
                }
            });
            Y4.N B32 = B3();
            TextView textView = B32.f12347p0;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.v());
            B32.f12313X.setTypeface(aVar.u());
            B32.f12321c0.setTypeface(aVar.v());
            B32.f12349q0.setTypeface(aVar.v());
            B32.f12366z.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.N1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoreInfo.I3(view);
                }
            });
            if (this.f29802R != null) {
                K3();
                C2043h c2043h = this.f29802R;
                AbstractC3292y.f(c2043h);
                if (!c2043h.k1()) {
                    AbstractC3462k.d(this.f29799O, null, null, new j(null), 3, null);
                    AbstractC3462k.d(this.f29799O, null, null, new k(null), 3, null);
                    AbstractC3462k.d(this.f29799O, null, null, new l(null), 3, null);
                } else {
                    B3().f12283A.setVisibility(8);
                    B3().f12302M.setVisibility(8);
                    B3().f12298I.setVisibility(8);
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
