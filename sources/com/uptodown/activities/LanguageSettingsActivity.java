package com.uptodown.activities;

import Q5.InterfaceC1416k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.activities.LanguageSettingsActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import q5.C3791p;

/* loaded from: classes4.dex */
public final class LanguageSettingsActivity extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private I4.r f29616O;

    /* renamed from: P, reason: collision with root package name */
    private a f29617P = new a();

    /* renamed from: Q, reason: collision with root package name */
    private final InterfaceC1416k f29618Q = Q5.l.b(new Function0() { // from class: F4.f0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.J h32;
            h32 = LanguageSettingsActivity.h3(LanguageSettingsActivity.this);
            return h32;
        }
    });

    /* renamed from: R, reason: collision with root package name */
    private final LifecycleCoroutineScope f29619R = LifecycleOwnerKt.getLifecycleScope(this);

    /* loaded from: classes4.dex */
    public static final class a implements b5.u {
        a() {
        }

        @Override // b5.u
        public void a(c5.y lang) {
            AbstractC3292y.i(lang, "lang");
            if (lang.a() != null) {
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                String a9 = lang.a();
                AbstractC3292y.f(a9);
                languageSettingsActivity.i3(a9);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29621a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29622b;

        /* renamed from: d, reason: collision with root package name */
        int f29624d;

        b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29622b = obj;
            this.f29624d |= Integer.MIN_VALUE;
            return LanguageSettingsActivity.this.k3(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29625a;

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29625a == 0) {
                Q5.t.b(obj);
                LanguageSettingsActivity.this.j3().f12217b.f12236b.setVisibility(0);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
        int f29627a;

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29627a == 0) {
                Q5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                String[] stringArray = LanguageSettingsActivity.this.getResources().getStringArray(R.array.languages);
                AbstractC3292y.h(stringArray, "getStringArray(...)");
                String[] stringArray2 = LanguageSettingsActivity.this.getResources().getStringArray(R.array.languageCodes);
                AbstractC3292y.h(stringArray2, "getStringArray(...)");
                String[] stringArray3 = LanguageSettingsActivity.this.getResources().getStringArray(R.array.localizedLang);
                AbstractC3292y.h(stringArray3, "getStringArray(...)");
                int length = stringArray.length;
                for (int i8 = 0; i8 < length; i8++) {
                    String str = stringArray[i8];
                    c5.y yVar = new c5.y();
                    yVar.f(str);
                    yVar.e(stringArray3[i8]);
                    yVar.d(stringArray2[i8]);
                    arrayList.add(yVar);
                }
                String p8 = SettingsPreferences.f30529b.p(LanguageSettingsActivity.this);
                if (p8 == null) {
                    p8 = "en";
                }
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                languageSettingsActivity.f29616O = new I4.r(arrayList, languageSettingsActivity.f29617P, p8);
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
        int f29629a;

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29629a == 0) {
                Q5.t.b(obj);
                RecyclerView recyclerView = LanguageSettingsActivity.this.j3().f12218c;
                I4.r rVar = LanguageSettingsActivity.this.f29616O;
                if (rVar == null) {
                    AbstractC3292y.y("adapter");
                    rVar = null;
                }
                recyclerView.setAdapter(rVar);
                LanguageSettingsActivity.this.j3().f12217b.f12236b.setVisibility(8);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29631a;

        f(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29631a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                LanguageSettingsActivity languageSettingsActivity = LanguageSettingsActivity.this;
                this.f29631a = 1;
                if (languageSettingsActivity.k3(this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y4.J h3(LanguageSettingsActivity languageSettingsActivity) {
        return Y4.J.c(languageSettingsActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3(String str) {
        C3791p a9 = C3791p.f37286s.a(this);
        a9.a();
        a9.f1();
        a9.i();
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        aVar.H0(applicationContext, str);
        setResult(PointerIconCompat.TYPE_HELP);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Y4.J j3() {
        return (Y4.J) this.f29618Q.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k3(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.LanguageSettingsActivity.b
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.LanguageSettingsActivity$b r0 = (com.uptodown.activities.LanguageSettingsActivity.b) r0
            int r1 = r0.f29624d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29624d = r1
            goto L18
        L13:
            com.uptodown.activities.LanguageSettingsActivity$b r0 = new com.uptodown.activities.LanguageSettingsActivity$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29622b
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29624d
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L48
            if (r2 == r5) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            Q5.t.b(r8)
            goto L88
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.f29621a
            com.uptodown.activities.LanguageSettingsActivity r2 = (com.uptodown.activities.LanguageSettingsActivity) r2
            Q5.t.b(r8)
            goto L74
        L40:
            java.lang.Object r2 = r0.f29621a
            com.uptodown.activities.LanguageSettingsActivity r2 = (com.uptodown.activities.LanguageSettingsActivity) r2
            Q5.t.b(r8)
            goto L60
        L48:
            Q5.t.b(r8)
            n6.J0 r8 = n6.C3445b0.c()
            com.uptodown.activities.LanguageSettingsActivity$c r2 = new com.uptodown.activities.LanguageSettingsActivity$c
            r2.<init>(r6)
            r0.f29621a = r7
            r0.f29624d = r5
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r2, r0)
            if (r8 != r1) goto L5f
            return r1
        L5f:
            r2 = r7
        L60:
            n6.I r8 = n6.C3445b0.b()
            com.uptodown.activities.LanguageSettingsActivity$d r5 = new com.uptodown.activities.LanguageSettingsActivity$d
            r5.<init>(r6)
            r0.f29621a = r2
            r0.f29624d = r4
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r5, r0)
            if (r8 != r1) goto L74
            return r1
        L74:
            n6.J0 r8 = n6.C3445b0.c()
            com.uptodown.activities.LanguageSettingsActivity$e r4 = new com.uptodown.activities.LanguageSettingsActivity$e
            r4.<init>(r6)
            r0.f29621a = r6
            r0.f29624d = r3
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r4, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.LanguageSettingsActivity.k3(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(LanguageSettingsActivity languageSettingsActivity, View view) {
        languageSettingsActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(View view) {
    }

    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(j3().getRoot());
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                j3().f12219d.setNavigationIcon(drawable);
                j3().f12219d.setNavigationContentDescription(getString(R.string.back));
            }
            j3().f12220e.setTypeface(J4.j.f4395g.u());
            j3().f12219d.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSettingsActivity.l3(LanguageSettingsActivity.this, view);
                }
            });
            j3().f12217b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LanguageSettingsActivity.m3(view);
                }
            });
            j3().f12218c.setLayoutManager(new LinearLayoutManager(this, 1, false));
            j3().f12218c.setItemAnimator(new DefaultItemAnimator());
            AbstractC3462k.d(this.f29619R, null, null, new f(null), 3, null);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
