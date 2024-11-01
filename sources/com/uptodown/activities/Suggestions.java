package com.uptodown.activities;

import J4.j;
import Q5.InterfaceC1416k;
import Y4.m0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import c5.C2052q;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.activities.Suggestions;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3793r;

/* loaded from: classes4.dex */
public final class Suggestions extends AbstractActivityC2691a {

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30150O = Q5.l.b(new Function0() { // from class: F4.m4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.m0 h32;
            h32 = Suggestions.h3(Suggestions.this);
            return h32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private boolean f30151P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30152a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30152a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Suggestions suggestions = Suggestions.this;
                String obj2 = suggestions.k3().f12852b.getText().toString();
                String obj3 = Suggestions.this.k3().f12853c.getText().toString();
                this.f30152a = 1;
                if (suggestions.p3(obj2, obj3, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30154a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30156c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30157d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30158a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Q f30159b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Suggestions f30160c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ T f30161d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Q q8, Suggestions suggestions, T t8, U5.d dVar) {
                super(2, dVar);
                this.f30159b = q8;
                this.f30160c = suggestions;
                this.f30161d = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30159b, this.f30160c, this.f30161d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30158a == 0) {
                    Q5.t.b(obj);
                    try {
                        if (this.f30159b.f34571a == 1) {
                            Toast makeText = Toast.makeText(this.f30160c.getApplicationContext(), this.f30160c.getString(R.string.sugerencia_enviada), 1);
                            makeText.setGravity(17, 0, 0);
                            makeText.show();
                            this.f30160c.i3();
                        } else {
                            T t8 = this.f30161d;
                            if (t8.f34573a == null) {
                                t8.f34573a = this.f30160c.getResources().getString(R.string.error_generico);
                            }
                            Toast makeText2 = Toast.makeText(this.f30160c.getApplicationContext(), (CharSequence) this.f30161d.f34573a, 1);
                            makeText2.setGravity(17, 0, 0);
                            makeText2.show();
                        }
                        this.f30160c.f30151P = false;
                        this.f30160c.k3().f12854d.f12236b.setVisibility(8);
                    } catch (Exception e8) {
                        e8.printStackTrace();
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, U5.d dVar) {
            super(2, dVar);
            this.f30156c = str;
            this.f30157d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30156c, this.f30157d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30154a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                Q q8 = new Q();
                T t8 = new T();
                t8.f34573a = "";
                C2052q c2052q = new C2052q();
                Context applicationContext = Suggestions.this.getApplicationContext();
                AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
                c2052q.i(applicationContext);
                c5.z zVar = new c5.z();
                C3793r c3793r = new C3793r();
                Context applicationContext2 = Suggestions.this.getApplicationContext();
                AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
                zVar.g(c3793r.d(applicationContext2));
                C3793r c3793r2 = new C3793r();
                Context applicationContext3 = Suggestions.this.getApplicationContext();
                AbstractC3292y.h(applicationContext3, "getApplicationContext(...)");
                zVar.e(c3793r2.a(applicationContext3));
                C3793r c3793r3 = new C3793r();
                Context applicationContext4 = Suggestions.this.getApplicationContext();
                AbstractC3292y.h(applicationContext4, "getApplicationContext(...)");
                zVar.h(c3793r3.e(applicationContext4));
                C3793r c3793r4 = new C3793r();
                Context applicationContext5 = Suggestions.this.getApplicationContext();
                AbstractC3292y.h(applicationContext5, "getApplicationContext(...)");
                zVar.f(c3793r4.b(applicationContext5));
                Context applicationContext6 = Suggestions.this.getApplicationContext();
                AbstractC3292y.h(applicationContext6, "getApplicationContext(...)");
                c5.K P02 = new C3775H(applicationContext6).P0(this.f30156c, this.f30157d, c2052q, zVar);
                if (P02.d() != null) {
                    String d8 = P02.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        q8.f34571a = jSONObject.getInt("success");
                    }
                    if (q8.f34571a == 0) {
                        t8.f34573a = P02.g(jSONObject);
                    }
                }
                J0 c8 = C3445b0.c();
                a aVar = new a(q8, Suggestions.this, t8, null);
                this.f30154a = 1;
                if (AbstractC3458i.g(c8, aVar, this) == e8) {
                    return e8;
                }
            }
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m0 h3(Suggestions suggestions) {
        return m0.c(suggestions.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i3() {
        k3().f12852b.setText("");
        k3().f12853c.setText("");
    }

    private final boolean j3() {
        Editable text = k3().f12852b.getText();
        if (text != null && text.length() != 0) {
            Editable text2 = k3().f12853c.getText();
            if (text2 != null && text2.length() != 0) {
                return true;
            }
            Toast makeText = Toast.makeText(this, getString(R.string.falta_texto_sugerencia), 1);
            makeText.setGravity(17, 0, 0);
            makeText.show();
            return false;
        }
        Toast makeText2 = Toast.makeText(this, getString(R.string.falta_email_sugerencia), 1);
        makeText2.setGravity(17, 0, 0);
        makeText2.show();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m0 k3() {
        return (m0) this.f30150O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l3(Suggestions suggestions, View view) {
        suggestions.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(Suggestions suggestions, View view, boolean z8) {
        if (z8) {
            suggestions.k3().f12852b.setHint("");
        } else {
            suggestions.k3().f12852b.setHint(suggestions.getString(R.string.hint_email_registro));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(Suggestions suggestions, View view, boolean z8) {
        if (z8) {
            suggestions.k3().f12853c.setHint("");
        } else {
            suggestions.k3().f12853c.setHint(suggestions.getString(R.string.hint_text_suggestion));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(Suggestions suggestions, View view) {
        if (!suggestions.f30151P) {
            suggestions.k3().f12854d.f12236b.setVisibility(0);
            suggestions.f30151P = true;
            if (suggestions.j3()) {
                AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new a(null), 3, null);
            } else {
                suggestions.f30151P = false;
                suggestions.k3().f12854d.f12236b.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p3(String str, String str2, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(str, str2, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(k3().getRoot());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_suggestions);
        if (toolbar != null) {
            Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
            if (drawable != null) {
                toolbar.setNavigationIcon(drawable);
                toolbar.setNavigationContentDescription(getString(R.string.back));
            }
            toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.n4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Suggestions.l3(Suggestions.this, view);
                }
            });
            k3().f12857g.setTypeface(J4.j.f4395g.u());
        }
        EditText editText = k3().f12852b;
        j.a aVar = J4.j.f4395g;
        editText.setTypeface(aVar.v());
        k3().f12852b.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.o4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                Suggestions.m3(Suggestions.this, view, z8);
            }
        });
        k3().f12853c.setTypeface(aVar.v());
        k3().f12853c.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: F4.p4
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                Suggestions.n3(Suggestions.this, view, z8);
            }
        });
        k3().f12856f.setTypeface(aVar.u());
        k3().f12856f.setOnClickListener(new View.OnClickListener() { // from class: F4.q4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Suggestions.o3(Suggestions.this, view);
            }
        });
    }
}
