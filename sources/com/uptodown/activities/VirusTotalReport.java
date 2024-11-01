package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.E0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import c5.C2041f;
import c5.C2043h;
import c5.C2056v;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.N;
import com.uptodown.activities.VirusTotalReport;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3770C;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class VirusTotalReport extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    public static final a f30321Q = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30322O = Q5.l.b(new Function0() { // from class: F4.p5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.E0 h32;
            h32 = VirusTotalReport.h3(VirusTotalReport.this);
            return h32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30323P = new ViewModelLazy(U.b(N.class), new d(this), new c(this), new e(null, this));

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30324a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ VirusTotalReport f30326a;

            a(VirusTotalReport virusTotalReport) {
                this.f30326a = virusTotalReport;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f30326a.i3().f12153j.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    if (((N.a) ((AbstractC3768A.c) abstractC3768A).a()).a() != null) {
                        this.f30326a.p3();
                        this.f30326a.q3();
                        this.f30326a.r3();
                    } else {
                        this.f30326a.i3().f12158o.setVisibility(8);
                        this.f30326a.i3().f12164u.setVisibility(0);
                        this.f30326a.i3().f12153j.f12236b.setVisibility(8);
                    }
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
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
            Object e8 = V5.b.e();
            int i8 = this.f30324a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = VirusTotalReport.this.k3().e();
                a aVar = new a(VirusTotalReport.this);
                this.f30324a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30327a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f30327a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30327a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30328a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f30328a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30328a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30330b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30329a = function0;
            this.f30330b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30329a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30330b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E0 h3(VirusTotalReport virusTotalReport) {
        return E0.c(virusTotalReport.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final E0 i3() {
        return (E0) this.f30322O.getValue();
    }

    private final void j3() {
        N k32 = k3();
        Object value = k3().c().getValue();
        AbstractC3292y.f(value);
        k32.b(this, ((C2043h) value).d0(), ((Number) k3().f().getValue()).longValue(), ((Boolean) k3().i().getValue()).booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final N k3() {
        return (N) this.f30323P.getValue();
    }

    private final void l3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            i3().f12159p.setNavigationIcon(drawable);
            i3().f12159p.setNavigationContentDescription(getString(R.string.back));
        }
        i3().f12159p.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.q5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.m3(VirusTotalReport.this, view);
            }
        });
        TextView textView = i3().f12142D;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        if (k3().c().getValue() != null) {
            Object value = k3().c().getValue();
            AbstractC3292y.f(value);
            String k02 = ((C2043h) value).k0();
            if (k02 != null && k02.length() != 0) {
                com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
                Object value2 = k3().c().getValue();
                AbstractC3292y.f(value2);
                h8.l(((C2043h) value2).k0()).n(UptodownApp.f29249C.f0(this)).i(i3().f12145b.f12119b);
            } else {
                i3().f12145b.f12119b.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_app_icon_placeholder));
            }
        } else if (k3().d().getValue() != null) {
            C3770C c3770c = C3770C.f37260a;
            Object value3 = k3().d().getValue();
            AbstractC3292y.f(value3);
            i3().f12145b.f12119b.setImageDrawable(c3770c.i(this, ((C2041f) value3).Q()));
        }
        i3().f12145b.f12120c.setTypeface(aVar.u());
        if (k3().c().getValue() != null) {
            TextView textView2 = i3().f12145b.f12120c;
            Object value4 = k3().c().getValue();
            AbstractC3292y.f(value4);
            textView2.setText(((C2043h) value4).q0());
        } else if (k3().d().getValue() != null) {
            TextView textView3 = i3().f12145b.f12120c;
            Object value5 = k3().d().getValue();
            AbstractC3292y.f(value5);
            textView3.setText(((C2041f) value5).z());
        }
        i3().f12145b.f12121d.setTypeface(aVar.v());
        CharSequence charSequence = (CharSequence) k3().g().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            i3().f12145b.f12121d.setText((CharSequence) k3().g().getValue());
        } else if (k3().c().getValue() != null) {
            TextView textView4 = i3().f12145b.f12121d;
            Object value6 = k3().c().getValue();
            AbstractC3292y.f(value6);
            textView4.setText(((C2043h) value6).Z0());
        } else if (k3().d().getValue() != null) {
            TextView textView5 = i3().f12145b.f12121d;
            Object value7 = k3().d().getValue();
            AbstractC3292y.f(value7);
            textView5.setText(((C2041f) value7).h0());
        }
        i3().f12161r.setTypeface(aVar.v());
        i3().f12160q.setTypeface(aVar.u());
        i3().f12160q.setOnClickListener(new View.OnClickListener() { // from class: F4.r5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.n3(VirusTotalReport.this, view);
            }
        });
        i3().f12139A.setTypeface(aVar.v());
        i3().f12169z.setTypeface(aVar.u());
        i3().f12141C.setTypeface(aVar.v());
        i3().f12140B.setTypeface(aVar.u());
        i3().f12167x.setTypeface(aVar.v());
        i3().f12166w.setTypeface(aVar.v());
        i3().f12165v.setTypeface(aVar.v());
        i3().f12143E.setTypeface(aVar.v());
        i3().f12164u.setTypeface(aVar.v());
        i3().f12153j.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.s5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusTotalReport.o3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(VirusTotalReport virusTotalReport, View view) {
        virusTotalReport.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(VirusTotalReport virusTotalReport, View view) {
        if (virusTotalReport.k3().h().getValue() != null) {
            Object value = virusTotalReport.k3().h().getValue();
            AbstractC3292y.f(value);
            virusTotalReport.F2(((c5.J) value).l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p3() {
        String str;
        String str2;
        c5.J j8 = (c5.J) k3().h().getValue();
        String str3 = null;
        if (j8 != null) {
            str = j8.l();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView = i3().f12139A;
            Object value = k3().h().getValue();
            AbstractC3292y.f(value);
            textView.setText(((c5.J) value).l());
        } else {
            i3().f12156m.setVisibility(8);
        }
        C2043h c2043h = (C2043h) k3().c().getValue();
        if (c2043h != null) {
            str2 = c2043h.o0();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            TextView textView2 = i3().f12141C;
            C2043h c2043h2 = (C2043h) k3().c().getValue();
            if (c2043h2 != null) {
                str3 = c2043h2.o0();
            }
            textView2.setText(str3);
        } else {
            TextView textView3 = i3().f12141C;
            C2041f c2041f = (C2041f) k3().d().getValue();
            if (c2041f != null) {
                str3 = c2041f.x();
            }
            textView3.setText(str3);
        }
        i3().f12153j.f12236b.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x017e, code lost:            if (r1.size() > 0) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3() {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.VirusTotalReport.q3():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r3() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.margin_s), 0, 0);
        Object value = k3().h().getValue();
        AbstractC3292y.f(value);
        if (((c5.J) value).b() != null) {
            Object value2 = k3().h().getValue();
            AbstractC3292y.f(value2);
            ArrayList b9 = ((c5.J) value2).b();
            AbstractC3292y.f(b9);
            if (b9.size() > 0) {
                Object value3 = k3().h().getValue();
                AbstractC3292y.f(value3);
                ArrayList b10 = ((c5.J) value3).b();
                AbstractC3292y.f(b10);
                int size = b10.size();
                for (int i8 = 0; i8 < size; i8++) {
                    View inflate = getLayoutInflater().inflate(R.layout.scan_positive, (ViewGroup) i3().f12152i, false);
                    AbstractC3292y.g(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
                    RelativeLayout relativeLayout = (RelativeLayout) inflate;
                    relativeLayout.setLayoutParams(layoutParams);
                    TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_antivirus_name);
                    TextView textView2 = (TextView) relativeLayout.findViewById(R.id.tv_virus_name);
                    Object value4 = k3().h().getValue();
                    AbstractC3292y.f(value4);
                    ArrayList b11 = ((c5.J) value4).b();
                    AbstractC3292y.f(b11);
                    textView.setText(((C2056v) b11.get(i8)).b());
                    Object value5 = k3().h().getValue();
                    AbstractC3292y.f(value5);
                    ArrayList b12 = ((c5.J) value5).b();
                    AbstractC3292y.f(b12);
                    textView2.setText(((C2056v) b12.get(i8)).f());
                    i3().f12152i.addView(relativeLayout);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Parcelable parcelable5;
        Object parcelable6;
        super.onCreate(bundle);
        setContentView(i3().getRoot());
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            if (extras != null && extras.containsKey("appInfo")) {
                q6.w c8 = k3().c();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable6 = extras.getParcelable("appInfo", C2043h.class);
                    parcelable5 = (Parcelable) parcelable6;
                } else {
                    parcelable5 = extras.getParcelable("appInfo");
                }
                c8.setValue(parcelable5);
            }
            if (extras != null && extras.containsKey("app_selected")) {
                q6.w d8 = k3().d();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable("app_selected", C2041f.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable("app_selected");
                }
                d8.setValue(parcelable3);
            }
            if (extras != null && extras.containsKey("old_version")) {
                k3().g().setValue(extras.getString("old_version"));
            }
            if (extras != null && extras.containsKey("oldVersionId")) {
                k3().i().setValue(Boolean.TRUE);
                k3().f().setValue(Long.valueOf(extras.getLong("oldVersionId")));
            }
            if (extras != null && extras.containsKey("appReportVT")) {
                q6.w h8 = k3().h();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("appReportVT", c5.J.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("appReportVT");
                }
                h8.setValue(parcelable);
            }
        }
        l3();
        if (k3().h().getValue() != null) {
            q3();
            r3();
            p3();
        } else {
            j3();
        }
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(null), 2, null);
    }
}
