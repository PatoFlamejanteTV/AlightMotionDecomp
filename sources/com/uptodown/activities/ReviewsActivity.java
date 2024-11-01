package com.uptodown.activities;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1511f0;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import b5.InterfaceC1972A;
import c5.C2043h;
import c5.M;
import c5.T;
import c6.InterfaceC2072n;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.v;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3770C;
import q5.C3795t;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class ReviewsActivity extends AbstractActivityC2691a {

    /* renamed from: T, reason: collision with root package name */
    public static final a f30062T = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    private I4.C f30065Q;

    /* renamed from: S, reason: collision with root package name */
    private final ActivityResultLauncher f30067S;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f30063O = Q5.l.b(new Function0() { // from class: F4.D3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            C1511f0 q32;
            q32 = ReviewsActivity.q3(ReviewsActivity.this);
            return q32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f30064P = new ViewModelLazy(U.b(v.class), new g(this), new f(this), new h(null, this));

    /* renamed from: R, reason: collision with root package name */
    private final e f30066R = new e();

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
        int f30068a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f30070a;

            a(ReviewsActivity reviewsActivity) {
                this.f30070a = reviewsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    this.f30070a.t3().r(true);
                    if (this.f30070a.f30065Q == null) {
                        this.f30070a.r3().f12662k.f12236b.setVisibility(0);
                    }
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    this.f30070a.t3().r(false);
                    if (this.f30070a.f30065Q == null) {
                        this.f30070a.I3(((v.a) ((AbstractC3768A.c) abstractC3768A).a()).a());
                        this.f30070a.r3().f12665n.setAdapter(this.f30070a.f30065Q);
                    } else {
                        Iterator it = ((v.a) ((AbstractC3768A.c) abstractC3768A).a()).a().iterator();
                        AbstractC3292y.h(it, "iterator(...)");
                        while (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            I4.C c8 = this.f30070a.f30065Q;
                            AbstractC3292y.f(c8);
                            c8.a((c5.M) next);
                        }
                    }
                    I4.C c9 = this.f30070a.f30065Q;
                    if (c9 != null) {
                        c9.c(false);
                    }
                    this.f30070a.r3().f12662k.f12236b.setVisibility(8);
                } else if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
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
            int i8 = this.f30068a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L f8 = ReviewsActivity.this.t3().f();
                a aVar = new a(ReviewsActivity.this);
                this.f30068a = 1;
                if (f8.collect(aVar, this) == e8) {
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
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30071a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f30073a;

            a(ReviewsActivity reviewsActivity) {
                this.f30073a = reviewsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    this.f30073a.t3().r(true);
                    this.f30073a.r3().f12662k.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                    if (((v.b) cVar.a()).b() == 1) {
                        ReviewsActivity reviewsActivity = this.f30073a;
                        Toast.makeText(reviewsActivity, reviewsActivity.getString(R.string.review_sended), 0).show();
                        this.f30073a.r3().f12653b.setText("");
                        Bundle bundle = new Bundle();
                        bundle.putString(CampaignEx.JSON_KEY_STAR, String.valueOf(((Number) this.f30073a.t3().m().getValue()).intValue()));
                        Object value = this.f30073a.t3().e().getValue();
                        AbstractC3292y.f(value);
                        bundle.putString("packagename", ((C2043h) value).v0());
                        C3795t q22 = this.f30073a.q2();
                        if (q22 != null) {
                            q22.e("app_rated", bundle);
                        }
                    } else if (((v.b) cVar.a()).a() == 403) {
                        Toast.makeText(this.f30073a, R.string.email_validation_msg, 1).show();
                    } else if (((v.b) cVar.a()).b() == 0 && ((v.b) cVar.a()).a() == 0) {
                        Toast.makeText(this.f30073a, R.string.error_review_already_submitted, 1).show();
                    } else {
                        ReviewsActivity reviewsActivity2 = this.f30073a;
                        Toast.makeText(reviewsActivity2, reviewsActivity2.getString(R.string.error_generico), 0).show();
                    }
                } else if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
                    throw new Q5.p();
                }
                return Q5.I.f8786a;
            }
        }

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30071a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L n8 = ReviewsActivity.this.t3().n();
                a aVar = new a(ReviewsActivity.this);
                this.f30071a = 1;
                if (n8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30074a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f30076a;

            a(ReviewsActivity reviewsActivity) {
                this.f30076a = reviewsActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        AbstractC3768A.c cVar = (AbstractC3768A.c) abstractC3768A;
                        if (((M.c) cVar.a()).b() == 1) {
                            I4.C c8 = this.f30076a.f30065Q;
                            if (c8 != null) {
                                c8.d(((M.c) cVar.a()).a());
                            }
                        } else {
                            Snackbar.make(this.f30076a.r3().f12665n, R.string.error_generico, -1).show();
                        }
                    } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        d(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30074a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L l8 = ReviewsActivity.this.t3().l();
                a aVar = new a(ReviewsActivity.this);
                this.f30074a = 1;
                if (l8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements InterfaceC1972A {
        e() {
        }

        @Override // b5.InterfaceC1972A
        public void a(int i8) {
            c5.M m8;
            ArrayList b9;
            I4.C c8 = ReviewsActivity.this.f30065Q;
            if (c8 != null && (b9 = c8.b()) != null) {
                m8 = (c5.M) b9.get(i8);
            } else {
                m8 = null;
            }
            if (UptodownApp.f29249C.a0() && m8 != null && !C3770C.f37260a.h(m8.l())) {
                ReviewsActivity.this.t3().o(ReviewsActivity.this, m8);
            }
        }

        @Override // b5.InterfaceC1972A
        public void b() {
            ReviewsActivity.this.V2();
        }

        @Override // b5.InterfaceC1972A
        public void c(int i8) {
            c5.M m8;
            ArrayList b9;
            I4.C c8 = ReviewsActivity.this.f30065Q;
            if (c8 != null && (b9 = c8.b()) != null) {
                m8 = (c5.M) b9.get(i8);
            } else {
                m8 = null;
            }
            Intent intent = new Intent(ReviewsActivity.this, (Class<?>) UserCommentsActivity.class);
            if (m8 != null) {
                intent.putExtra("userID", m8.x());
            }
            ReviewsActivity reviewsActivity = ReviewsActivity.this;
            reviewsActivity.startActivity(intent, UptodownApp.f29249C.a(reviewsActivity));
        }

        @Override // b5.InterfaceC1972A
        public void d(int i8) {
            c5.M m8;
            ArrayList b9;
            I4.C c8 = ReviewsActivity.this.f30065Q;
            String str = null;
            if (c8 != null && (b9 = c8.b()) != null) {
                m8 = (c5.M) b9.get(i8);
            } else {
                m8 = null;
            }
            Intent intent = new Intent(ReviewsActivity.this, (Class<?>) RepliesActivity.class);
            intent.putExtra("review", m8);
            C2043h c2043h = (C2043h) ReviewsActivity.this.t3().e().getValue();
            if (c2043h != null) {
                str = c2043h.q0();
            }
            if (str != null && str.length() != 0) {
                Object value = ReviewsActivity.this.t3().e().getValue();
                AbstractC3292y.f(value);
                intent.putExtra("appName", ((C2043h) value).q0());
            }
            ReviewsActivity reviewsActivity = ReviewsActivity.this;
            reviewsActivity.startActivity(intent, UptodownApp.f29249C.a(reviewsActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30078a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30078a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30079a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f30079a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30079a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30081b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30080a = function0;
            this.f30081b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30080a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30081b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ReviewsActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.I3
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ReviewsActivity.H3(ReviewsActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f30067S = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(ReviewsActivity reviewsActivity, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            reviewsActivity.t3().m().setValue(1);
            reviewsActivity.r3().f12655d.setImageDrawable(drawable);
            reviewsActivity.r3().f12656e.setImageDrawable(drawable2);
            reviewsActivity.r3().f12657f.setImageDrawable(drawable2);
            reviewsActivity.r3().f12658g.setImageDrawable(drawable2);
            reviewsActivity.r3().f12659h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(ReviewsActivity reviewsActivity, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            reviewsActivity.t3().m().setValue(2);
            reviewsActivity.r3().f12655d.setImageDrawable(drawable);
            reviewsActivity.r3().f12656e.setImageDrawable(drawable);
            reviewsActivity.r3().f12657f.setImageDrawable(drawable2);
            reviewsActivity.r3().f12658g.setImageDrawable(drawable2);
            reviewsActivity.r3().f12659h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(ReviewsActivity reviewsActivity, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            reviewsActivity.t3().m().setValue(3);
            reviewsActivity.r3().f12655d.setImageDrawable(drawable);
            reviewsActivity.r3().f12656e.setImageDrawable(drawable);
            reviewsActivity.r3().f12657f.setImageDrawable(drawable);
            reviewsActivity.r3().f12658g.setImageDrawable(drawable2);
            reviewsActivity.r3().f12659h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(ReviewsActivity reviewsActivity, Drawable drawable, Drawable drawable2, View view) {
        if (UptodownApp.f29249C.a0()) {
            reviewsActivity.t3().m().setValue(4);
            reviewsActivity.r3().f12655d.setImageDrawable(drawable);
            reviewsActivity.r3().f12656e.setImageDrawable(drawable);
            reviewsActivity.r3().f12657f.setImageDrawable(drawable);
            reviewsActivity.r3().f12658g.setImageDrawable(drawable);
            reviewsActivity.r3().f12659h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(ReviewsActivity reviewsActivity, Drawable drawable, View view) {
        if (UptodownApp.f29249C.a0()) {
            reviewsActivity.t3().m().setValue(5);
            reviewsActivity.r3().f12655d.setImageDrawable(drawable);
            reviewsActivity.r3().f12656e.setImageDrawable(drawable);
            reviewsActivity.r3().f12657f.setImageDrawable(drawable);
            reviewsActivity.r3().f12658g.setImageDrawable(drawable);
            reviewsActivity.r3().f12659h.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(ReviewsActivity reviewsActivity, View view) {
        if (!AbstractC3292y.d(reviewsActivity.t3().k().getValue(), "date")) {
            reviewsActivity.t3().k().setValue("date");
            reviewsActivity.r3().f12671t.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_blue_primary_button));
            reviewsActivity.r3().f12671t.setTextColor(ContextCompat.getColor(reviewsActivity, R.color.white));
            reviewsActivity.r3().f12670s.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
            reviewsActivity.r3().f12670s.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
            reviewsActivity.r3().f12672u.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
            reviewsActivity.r3().f12672u.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
            reviewsActivity.K3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(ReviewsActivity reviewsActivity, View view) {
        if (!AbstractC3292y.d(reviewsActivity.t3().k().getValue(), "best")) {
            reviewsActivity.t3().k().setValue("best");
            reviewsActivity.r3().f12670s.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_blue_primary_button));
            reviewsActivity.r3().f12670s.setTextColor(ContextCompat.getColor(reviewsActivity, R.color.white));
            reviewsActivity.r3().f12671t.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
            reviewsActivity.r3().f12671t.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
            reviewsActivity.r3().f12672u.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
            reviewsActivity.r3().f12672u.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
            reviewsActivity.K3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(ReviewsActivity reviewsActivity, ActivityResult activityResult) {
        String str;
        if (activityResult.getResultCode() == 1) {
            T e8 = T.f15689k.e(reviewsActivity);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.x(reviewsActivity)) {
                UptodownApp.a aVar = UptodownApp.f29249C;
                aVar.j0(reviewsActivity);
                aVar.i0(reviewsActivity);
                reviewsActivity.L3(reviewsActivity.r3().f12653b.getText().toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I3(ArrayList arrayList) {
        this.f30065Q = new I4.C(arrayList, this, this.f30066R);
    }

    private final void J3() {
        this.f30067S.launch(new Intent(this, (Class<?>) LoginActivity.class), UptodownApp.f29249C.b(this));
    }

    private final void K3() {
        r3().f12665n.setAdapter(null);
        this.f30065Q = null;
        t3().q(true);
        t3().s(0);
        s3();
    }

    private final void L3(String str) {
        int intValue = ((Number) t3().m().getValue()).intValue();
        if (1 <= intValue && intValue < 6) {
            t3().p(this, str);
        } else {
            Toast.makeText(this, getString(R.string.error_review_no_valoration), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1511f0 q3(ReviewsActivity reviewsActivity) {
        return C1511f0.c(reviewsActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1511f0 r3() {
        return (C1511f0) this.f30063O.getValue();
    }

    private final void s3() {
        if (t3().g()) {
            t3().d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v t3() {
        return (v) this.f30064P.getValue();
    }

    private final void u3() {
        String str;
        String str2;
        String str3;
        String str4;
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            r3().f12666o.setNavigationIcon(drawable);
            r3().f12666o.setNavigationContentDescription(getString(R.string.back));
        }
        r3().f12666o.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.J3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.v3(ReviewsActivity.this, view);
            }
        });
        C3770C c3770c = C3770C.f37260a;
        C2043h c2043h = (C2043h) t3().e().getValue();
        String str5 = null;
        if (c2043h != null) {
            str = c2043h.v0();
        } else {
            str = null;
        }
        Drawable i8 = c3770c.i(this, str);
        if (i8 != null) {
            r3().f12654c.setImageDrawable(i8);
        } else {
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C2043h c2043h2 = (C2043h) t3().e().getValue();
            if (c2043h2 != null) {
                str2 = c2043h2.k0();
            } else {
                str2 = null;
            }
            h8.l(str2).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29249C.f0(this)).i(r3().f12654c);
        }
        TextView textView = r3().f12674w;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        r3().f12668q.setTypeface(aVar.u());
        TextView textView2 = r3().f12668q;
        C2043h c2043h3 = (C2043h) t3().e().getValue();
        if (c2043h3 != null) {
            str3 = c2043h3.q0();
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        r3().f12669r.setTypeface(aVar.v());
        TextView textView3 = r3().f12669r;
        C2043h c2043h4 = (C2043h) t3().e().getValue();
        if (c2043h4 != null) {
            str4 = c2043h4.Z0();
        } else {
            str4 = null;
        }
        textView3.setText(str4);
        r3().f12667p.setTypeface(aVar.v());
        TextView textView4 = r3().f12667p;
        C2043h c2043h5 = (C2043h) t3().e().getValue();
        if (c2043h5 != null) {
            str5 = c2043h5.l();
        }
        textView4.setText(str5);
        r3().f12653b.setTypeface(aVar.v());
        r3().f12673v.setTypeface(aVar.u());
        r3().f12673v.setOnClickListener(new View.OnClickListener() { // from class: F4.M3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.z3(ReviewsActivity.this, view);
            }
        });
        final Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_star_on);
        final Drawable drawable3 = ContextCompat.getDrawable(this, R.drawable.vector_star_off);
        if (t3().i().getValue() != null) {
            Object value = t3().i().getValue();
            AbstractC3292y.f(value);
            if (((c5.M) value).s() >= 1) {
                r3().f12655d.setImageDrawable(drawable2);
            }
            Object value2 = t3().i().getValue();
            AbstractC3292y.f(value2);
            if (((c5.M) value2).s() >= 2) {
                r3().f12656e.setImageDrawable(drawable2);
            }
            Object value3 = t3().i().getValue();
            AbstractC3292y.f(value3);
            if (((c5.M) value3).s() >= 3) {
                r3().f12657f.setImageDrawable(drawable2);
            }
            Object value4 = t3().i().getValue();
            AbstractC3292y.f(value4);
            if (((c5.M) value4).s() >= 4) {
                r3().f12658g.setImageDrawable(drawable2);
            }
            Object value5 = t3().i().getValue();
            AbstractC3292y.f(value5);
            if (((c5.M) value5).s() == 5) {
                r3().f12659h.setImageDrawable(drawable2);
            }
            Object value6 = t3().i().getValue();
            AbstractC3292y.f(value6);
            String u8 = ((c5.M) value6).u();
            if (u8 != null && u8.length() != 0) {
                EditText editText = r3().f12653b;
                Object value7 = t3().i().getValue();
                AbstractC3292y.f(value7);
                editText.setText(String.valueOf(((c5.M) value7).u()));
            }
            r3().f12673v.setText(getString(R.string.edit_your_review));
        }
        r3().f12655d.setOnClickListener(new View.OnClickListener() { // from class: F4.N3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.A3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        r3().f12656e.setOnClickListener(new View.OnClickListener() { // from class: F4.O3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.B3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        r3().f12657f.setOnClickListener(new View.OnClickListener() { // from class: F4.P3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.C3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        r3().f12658g.setOnClickListener(new View.OnClickListener() { // from class: F4.Q3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.D3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        r3().f12659h.setOnClickListener(new View.OnClickListener() { // from class: F4.E3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.E3(ReviewsActivity.this, drawable2, view);
            }
        });
        r3().f12671t.setTypeface(aVar.u());
        r3().f12671t.setOnClickListener(new View.OnClickListener() { // from class: F4.F3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.F3(ReviewsActivity.this, view);
            }
        });
        r3().f12670s.setTypeface(aVar.u());
        r3().f12670s.setOnClickListener(new View.OnClickListener() { // from class: F4.G3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.G3(ReviewsActivity.this, view);
            }
        });
        r3().f12672u.setTypeface(aVar.u());
        r3().f12672u.setOnClickListener(new View.OnClickListener() { // from class: F4.H3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.w3(ReviewsActivity.this, view);
            }
        });
        r3().f12665n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        r3().f12665n.addItemDecoration(new s5.q(dimension, dimension, dimension, dimension));
        r3().f12663l.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: F4.K3
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i9, int i10, int i11, int i12) {
                ReviewsActivity.x3(ReviewsActivity.this, nestedScrollView, i9, i10, i11, i12);
            }
        });
        r3().f12662k.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.L3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.y3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(ReviewsActivity reviewsActivity, View view) {
        reviewsActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(ReviewsActivity reviewsActivity, View view) {
        if (!AbstractC3292y.d(reviewsActivity.t3().k().getValue(), "most")) {
            reviewsActivity.t3().k().setValue("most");
            reviewsActivity.r3().f12672u.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_blue_primary_button));
            reviewsActivity.r3().f12672u.setTextColor(ContextCompat.getColor(reviewsActivity, R.color.white));
            reviewsActivity.r3().f12670s.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
            reviewsActivity.r3().f12670s.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
            reviewsActivity.r3().f12671t.setBackground(ContextCompat.getDrawable(reviewsActivity, R.drawable.ripple_header_categories));
            reviewsActivity.r3().f12671t.setTextColor(ContextCompat.getColorStateList(reviewsActivity, R.color.selector_wizard_accept_button_text));
            reviewsActivity.K3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(ReviewsActivity reviewsActivity, NestedScrollView v8, int i8, int i9, int i10, int i11) {
        AbstractC3292y.i(v8, "v");
        if (i9 == v8.getChildAt(0).getMeasuredHeight() - v8.getMeasuredHeight() && !reviewsActivity.t3().h() && reviewsActivity.t3().g()) {
            reviewsActivity.t3().r(true);
            I4.C c8 = reviewsActivity.f30065Q;
            if (c8 != null) {
                c8.c(true);
            }
            reviewsActivity.s3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(ReviewsActivity reviewsActivity, View view) {
        String str;
        Object systemService = reviewsActivity.getSystemService("input_method");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(reviewsActivity.r3().f12653b.getWindowToken(), 0);
        reviewsActivity.r3().f12653b.clearFocus();
        T e8 = T.f15689k.e(reviewsActivity);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            Editable text = reviewsActivity.r3().f12653b.getText();
            AbstractC3292y.h(text, "getText(...)");
            reviewsActivity.L3(l6.n.M0(text).toString());
            return;
        }
        reviewsActivity.J3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        setContentView(r3().getRoot());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appInfo")) {
                q6.w e8 = t3().e();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable("appInfo", C2043h.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable("appInfo");
                }
                AbstractC3292y.f(parcelable3);
                e8.setValue(parcelable3);
            }
            if (extras.containsKey("myReview")) {
                q6.w i8 = t3().i();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("myReview", c5.M.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("myReview");
                }
                i8.setValue(parcelable);
                if (t3().i().getValue() != null) {
                    q6.w m8 = t3().m();
                    Object value = t3().i().getValue();
                    AbstractC3292y.f(value);
                    m8.setValue(Integer.valueOf(((c5.M) value).s()));
                }
            }
        }
        u3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
        s3();
    }
}
