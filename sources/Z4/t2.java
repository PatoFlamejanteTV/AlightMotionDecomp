package Z4;

import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.C1522l;
import Y4.C1524n;
import Y4.C1527q;
import Z4.t2;
import Z4.v2;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import c5.T;
import c6.InterfaceC2072n;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AbstractActivityC2691a;
import com.uptodown.activities.LoginActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.NotificationsRegistryActivity;
import com.uptodown.activities.RollbackActivity;
import com.uptodown.activities.SecurityActivity;
import com.uptodown.activities.UpcomingReleasesActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.UserAvatarActivity;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.activities.UserCredentialsEditActivity;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3788m;
import q5.C3791p;
import q5.C3795t;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes5.dex */
public final class t2 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public Y4.z0 f13803a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f13804b;

    /* renamed from: c, reason: collision with root package name */
    private final int f13805c;

    /* renamed from: d, reason: collision with root package name */
    private long f13806d;

    /* renamed from: e, reason: collision with root package name */
    private final ActivityResultLauncher f13807e;

    /* renamed from: f, reason: collision with root package name */
    private final ActivityResultLauncher f13808f;

    /* renamed from: g, reason: collision with root package name */
    private final ActivityResultLauncher f13809g;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13810a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: Z4.t2$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0273a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f13812a;

            C0273a(t2 t2Var) {
                this.f13812a = t2Var;
            }

            public final Object b(int i8, U5.d dVar) {
                if (i8 == 1) {
                    this.f13812a.i0().f13141y.setText(this.f13812a.getString(R.string.reviews_counter_single));
                } else {
                    this.f13812a.i0().f13141y.setText(this.f13812a.getString(R.string.reviews_counter_multiple, String.valueOf(i8)));
                }
                return Q5.I.f8786a;
            }

            @Override // q6.InterfaceC3822g
            public /* bridge */ /* synthetic */ Object emit(Object obj, U5.d dVar) {
                return b(((Number) obj).intValue(), dVar);
            }
        }

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
            int i8 = this.f13810a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L p8 = t2.this.j0().p();
                C0273a c0273a = new C0273a(t2.this);
                this.f13810a = 1;
                if (p8.collect(c0273a, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13813a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f13815a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: Z4.t2$b$a$a, reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            public static final class C0274a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: a, reason: collision with root package name */
                Object f13816a;

                /* renamed from: b, reason: collision with root package name */
                Object f13817b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f13818c;

                /* renamed from: e, reason: collision with root package name */
                int f13820e;

                C0274a(U5.d dVar) {
                    super(dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f13818c = obj;
                    this.f13820e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            a(t2 t2Var) {
                this.f13815a = t2Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(q5.AbstractC3768A r5, U5.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Z4.t2.b.a.C0274a
                    if (r0 == 0) goto L13
                    r0 = r6
                    Z4.t2$b$a$a r0 = (Z4.t2.b.a.C0274a) r0
                    int r1 = r0.f13820e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f13820e = r1
                    goto L18
                L13:
                    Z4.t2$b$a$a r0 = new Z4.t2$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f13818c
                    java.lang.Object r1 = V5.b.e()
                    int r2 = r0.f13820e
                    r3 = 1
                    if (r2 == 0) goto L39
                    if (r2 != r3) goto L31
                    java.lang.Object r5 = r0.f13817b
                    q5.A r5 = (q5.AbstractC3768A) r5
                    java.lang.Object r0 = r0.f13816a
                    Z4.t2$b$a r0 = (Z4.t2.b.a) r0
                    Q5.t.b(r6)
                    goto L58
                L31:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L39:
                    Q5.t.b(r6)
                    q5.A$a r6 = q5.AbstractC3768A.a.f37253a
                    boolean r6 = kotlin.jvm.internal.AbstractC3292y.d(r5, r6)
                    if (r6 != 0) goto L83
                    boolean r6 = r5 instanceof q5.AbstractC3768A.c
                    if (r6 == 0) goto L74
                    r0.f13816a = r4
                    r0.f13817b = r5
                    r0.f13820e = r3
                    r2 = 1000(0x3e8, double:4.94E-321)
                    java.lang.Object r6 = n6.X.b(r2, r0)
                    if (r6 != r1) goto L57
                    return r1
                L57:
                    r0 = r4
                L58:
                    Z4.t2 r6 = r0.f13815a
                    q5.A$c r5 = (q5.AbstractC3768A.c) r5
                    java.lang.Object r0 = r5.a()
                    Z4.v2$b r0 = (Z4.v2.b) r0
                    int r0 = r0.b()
                    java.lang.Object r5 = r5.a()
                    Z4.v2$b r5 = (Z4.v2.b) r5
                    int r5 = r5.a()
                    Z4.t2.V(r6, r0, r5)
                    goto L83
                L74:
                    q5.A$b r6 = q5.AbstractC3768A.b.f37254a
                    boolean r5 = kotlin.jvm.internal.AbstractC3292y.d(r5, r6)
                    if (r5 == 0) goto L7d
                    goto L83
                L7d:
                    Q5.p r5 = new Q5.p
                    r5.<init>()
                    throw r5
                L83:
                    Q5.I r5 = Q5.I.f8786a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Z4.t2.b.a.emit(q5.A, U5.d):java.lang.Object");
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
            int i8 = this.f13813a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L o8 = t2.this.j0().o();
                a aVar = new a(t2.this);
                this.f13813a = 1;
                if (o8.collect(aVar, this) == e8) {
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

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13821a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f13823a;

            a(t2 t2Var) {
                this.f13823a = t2Var;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        if (this.f13823a.isAdded()) {
                            C3788m c3788m = new C3788m();
                            FragmentActivity requireActivity = this.f13823a.requireActivity();
                            AbstractC3292y.h(requireActivity, "requireActivity(...)");
                            c3788m.q(requireActivity, (String) ((AbstractC3768A.c) abstractC3768A).a(), this.f13823a.getString(R.string.uptodown_turbo));
                        }
                    } else if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
                        throw new Q5.p();
                    }
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
            int i8 = this.f13821a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L l8 = t2.this.j0().l();
                a aVar = new a(t2.this);
                this.f13821a = 1;
                if (l8.collect(aVar, this) == e8) {
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

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13824a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f13826a;

            a(t2 t2Var) {
                this.f13826a = t2Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void f(t2 t2Var, AbstractC3768A abstractC3768A, View view) {
                C3788m c3788m = new C3788m();
                FragmentActivity requireActivity = t2Var.requireActivity();
                AbstractC3292y.h(requireActivity, "requireActivity(...)");
                C3788m.r(c3788m, requireActivity, (String) ((AbstractC3768A.c) abstractC3768A).a(), null, 4, null);
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object emit(final AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        this.f13826a.i0().f13128l.setVisibility(0);
                        LinearLayout linearLayout = this.f13826a.i0().f13128l;
                        final t2 t2Var = this.f13826a;
                        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: Z4.u2
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                t2.d.a.f(t2.this, abstractC3768A, view);
                            }
                        });
                    } else if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
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
            int i8 = this.f13824a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L j8 = t2.this.j0().j();
                a aVar = new a(t2.this);
                this.f13824a = 1;
                if (j8.collect(aVar, this) == e8) {
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

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13827a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t2 f13829a;

            a(t2 t2Var) {
                this.f13829a = t2Var;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.a.f37253a)) {
                    if (abstractC3768A instanceof AbstractC3768A.c) {
                        if (this.f13829a.getContext() != null) {
                            if (((v2.a) ((AbstractC3768A.c) abstractC3768A).a()).a()) {
                                this.f13829a.i0().f13115H.f12920c.setImageDrawable(ContextCompat.getDrawable(this.f13829a.requireContext(), R.drawable.vector_shield_protect_bad));
                                this.f13829a.i0().f13115H.f12925h.setText(R.string.positives_title_security_badge);
                                this.f13829a.i0().f13115H.f12924g.setText(R.string.positives_msg_security_badge);
                                this.f13829a.i0().f13115H.f12923f.setBackground(ContextCompat.getDrawable(this.f13829a.requireContext(), R.drawable.ripple_cancel_button));
                            } else {
                                this.f13829a.i0().f13115H.f12920c.setImageDrawable(ContextCompat.getDrawable(this.f13829a.requireContext(), R.drawable.vector_shield_protect_ok));
                                this.f13829a.i0().f13115H.f12925h.setText(R.string.no_positives_title_security_badge);
                                this.f13829a.i0().f13115H.f12924g.setText(R.string.no_positives_msg_security_badge);
                                this.f13829a.i0().f13115H.f12923f.setBackground(ContextCompat.getDrawable(this.f13829a.requireContext(), R.drawable.ripple_blue_primary_button));
                            }
                        }
                        if (this.f13829a.i0().f13115H.f12919b.getAnimation() != null && this.f13829a.i0().f13115H.f12919b.getAnimation().getRepeatCount() != 0) {
                            this.f13829a.i0().f13115H.f12919b.getAnimation().setRepeatCount(0);
                        }
                    } else if (!AbstractC3292y.d(abstractC3768A, AbstractC3768A.b.f37254a)) {
                        throw new Q5.p();
                    }
                }
                return Q5.I.f8786a;
            }
        }

        e(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f13827a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L n8 = t2.this.j0().n();
                a aVar = new a(t2.this);
                this.f13827a = 1;
                if (n8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1413h();
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13830a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f13830a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return this.f13830a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13831a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0) {
            super(0);
            this.f13831a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f13831a.invoke();
        }
    }

    /* loaded from: classes5.dex */
    public static final class h extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13832a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13832a = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13832a);
            return m5430viewModels$lambda1.getViewModelStore();
        }
    }

    /* loaded from: classes5.dex */
    public static final class i extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f13833a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13834b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13833a = function0;
            this.f13834b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            CreationExtras creationExtras;
            Function0 function0 = this.f13833a;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13834b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
            return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
        }
    }

    /* loaded from: classes5.dex */
    public static final class j extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f13835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1416k f13836b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment, InterfaceC1416k interfaceC1416k) {
            super(0);
            this.f13835a = fragment;
            this.f13836b = interfaceC1416k;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelStoreOwner m5430viewModels$lambda1;
            ViewModelProvider.Factory defaultViewModelProviderFactory;
            m5430viewModels$lambda1 = FragmentViewModelLazyKt.m5430viewModels$lambda1(this.f13836b);
            HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = m5430viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) m5430viewModels$lambda1 : null;
            if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                return defaultViewModelProviderFactory;
            }
            ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.f13835a.getDefaultViewModelProviderFactory();
            AbstractC3292y.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13837a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c5.T f13839c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(c5.T t8, U5.d dVar) {
            super(2, dVar);
            this.f13839c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f13839c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13837a == 0) {
                Q5.t.b(obj);
                t2.this.l0(this.f13839c);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((k) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f13840a;

        l(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f13840a == 0) {
                Q5.t.b(obj);
                if (t2.this.getContext() != null) {
                    v2 j02 = t2.this.j0();
                    Context requireContext = t2.this.requireContext();
                    AbstractC3292y.h(requireContext, "requireContext(...)");
                    j02.h(requireContext);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public t2() {
        InterfaceC1416k a9 = Q5.l.a(Q5.o.f8805c, new g(new f(this)));
        this.f13804b = FragmentViewModelLazyKt.createViewModelLazy(this, kotlin.jvm.internal.U.b(v2.class), new h(a9), new i(null, a9), new j(this, a9));
        this.f13805c = 600;
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: Z4.n2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                t2.p0(t2.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResult(...)");
        this.f13807e = registerForActivityResult;
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: Z4.o2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                t2.V0(t2.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.f13808f = registerForActivityResult2;
        ActivityResultLauncher registerForActivityResult3 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: Z4.p2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                t2.e1(t2.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult3, "registerForActivityResult(...)");
        this.f13809g = registerForActivityResult3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A0(t2 t2Var, View view) {
        ActivityResultLauncher activityResultLauncher = t2Var.f13809g;
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) WishlistActivity.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) UpcomingReleasesActivity.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C0(t2 t2Var, View view) {
        if (t2Var.getContext() != null) {
            v2 j02 = t2Var.j0();
            Context requireContext = t2Var.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            j02.m(requireContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) SecurityActivity.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) NotificationsRegistryActivity.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(t2 t2Var, View view) {
        t2Var.t0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G0(t2 t2Var, View view) {
        if (t2Var.getActivity() != null) {
            String string = t2Var.getString(R.string.url_support);
            AbstractC3292y.h(string, "getString(...)");
            T.b bVar = c5.T.f15689k;
            FragmentActivity requireActivity = t2Var.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            c5.T e8 = bVar.e(requireActivity);
            if (e8 != null && e8.y()) {
                string = t2Var.getString(R.string.url_support_turbo);
            }
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity2 = t2Var.requireActivity();
            AbstractC3292y.h(requireActivity2, "requireActivity(...)");
            c3788m.q(requireActivity2, string, t2Var.getString(R.string.support_title));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H0(t2 t2Var, View view) {
        if (t2Var.getActivity() != null && !t2Var.requireActivity().isFinishing()) {
            String str = t2Var.getString(R.string.url) + "/android";
            C3788m c3788m = new C3788m();
            FragmentActivity requireActivity = t2Var.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            C3788m.r(c3788m, requireActivity, str, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(t2 t2Var, View view) {
        Context requireContext = t2Var.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        t2Var.f0(requireContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(t2 t2Var, View view) {
        t2Var.W0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K0(t2 t2Var, View view) {
        if (t2Var.getContext() != null && UptodownApp.f29249C.a0()) {
            if (new C3788m().o(t2Var.getContext())) {
                t2Var.v0();
            } else {
                t2Var.U0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(t2 t2Var, View view) {
        if (t2Var.getContext() != null) {
            Context requireContext = t2Var.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            t2Var.a0(requireContext);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M0(t2 t2Var, View view) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - t2Var.f13806d > t2Var.f13805c) {
            t2Var.f13806d = currentTimeMillis;
            Animation loadAnimation = AnimationUtils.loadAnimation(t2Var.getContext(), R.anim.rotate);
            loadAnimation.setRepeatCount(-1);
            t2Var.i0().f13115H.f12919b.startAnimation(loadAnimation);
            v2 j02 = t2Var.j0();
            Context requireContext = t2Var.requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            j02.h(requireContext);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N0(t2 t2Var, View view) {
        t2Var.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(t2 t2Var, View view) {
        t2Var.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(t2 t2Var, View view) {
        t2Var.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(t2 t2Var, View view) {
        t2Var.s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) Updates.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) MyApps.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) MyDownloads.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    private final void U0() {
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        aVar.z0(requireContext, "no");
        AppCompatDelegate.setDefaultNightMode(1);
        UptodownApp.f29249C.q0(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V0(t2 t2Var, ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode != 1003) {
            if (resultCode == 1004) {
                UptodownApp.a aVar = UptodownApp.f29249C;
                Context requireContext = t2Var.requireContext();
                AbstractC3292y.h(requireContext, "requireContext(...)");
                aVar.e(requireContext);
                if (t2Var.getActivity() != null) {
                    t2Var.requireActivity().finish();
                    t2Var.startActivity(t2Var.requireActivity().getIntent());
                    return;
                }
                return;
            }
            return;
        }
        C3791p.a aVar2 = C3791p.f37286s;
        Context requireContext2 = t2Var.requireContext();
        AbstractC3292y.h(requireContext2, "requireContext(...)");
        C3791p a9 = aVar2.a(requireContext2);
        a9.a();
        a9.q();
        a9.i();
        if (t2Var.getActivity() != null) {
            t2Var.requireActivity().finish();
            t2Var.startActivity(t2Var.requireActivity().getIntent());
        }
    }

    private final void W() {
        String str;
        if (getContext() != null) {
            T.b bVar = c5.T.f15689k;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            c5.T e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                if (e8.x(requireContext2)) {
                    l0(e8);
                    return;
                }
            }
            Context requireContext3 = requireContext();
            AbstractC3292y.h(requireContext3, "requireContext(...)");
            X(requireContext3);
        }
    }

    private final void W0() {
        Window window;
        if (isAdded()) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
            if (o22 != null) {
                o22.dismiss();
            }
            C1522l c8 = C1522l.c(getLayoutInflater());
            AbstractC3292y.h(c8, "inflate(...)");
            TextView textView = c8.f12833f;
            j.a aVar = J4.j.f4395g;
            textView.setTypeface(aVar.u());
            c8.f12834g.setTypeface(aVar.v());
            c8.f12832e.setTypeface(aVar.v());
            c8.f12831d.setTypeface(aVar.v());
            c8.f12830c.setOnClickListener(new View.OnClickListener() { // from class: Z4.d2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t2.X0(t2.this, view);
                }
            });
            c8.f12829b.setOnClickListener(new View.OnClickListener() { // from class: Z4.e2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t2.Y0(t2.this, view);
                }
            });
            c8.f12831d.setOnClickListener(new View.OnClickListener() { // from class: Z4.f2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    t2.Z0(t2.this, view);
                }
            });
            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setView(c8.getRoot());
            builder.setCancelable(true);
            FragmentActivity activity2 = getActivity();
            AbstractC3292y.g(activity2, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
            ((AbstractActivityC2691a) activity2).K2(builder.create());
            if (isAdded()) {
                FragmentActivity activity3 = getActivity();
                AbstractC3292y.g(activity3, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                if (((AbstractActivityC2691a) activity3).o2() != null) {
                    FragmentActivity activity4 = getActivity();
                    AbstractC3292y.g(activity4, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog o23 = ((AbstractActivityC2691a) activity4).o2();
                    if (o23 != null && (window = o23.getWindow()) != null) {
                        window.setBackgroundDrawable(new ColorDrawable(0));
                    }
                    FragmentActivity activity5 = getActivity();
                    AbstractC3292y.g(activity5, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
                    AlertDialog o24 = ((AbstractActivityC2691a) activity5).o2();
                    if (o24 != null) {
                        o24.show();
                    }
                }
            }
        }
    }

    private final void X(Context context) {
        j0().f(context);
        i0().f13122f.setOnClickListener(new View.OnClickListener() { // from class: Z4.c2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.Y(t2.this, view);
            }
        });
        i0().f13122f.setImageResource(R.drawable.vector_user_login);
        ImageView ivUserAvatarUserFragment = i0().f13122f;
        AbstractC3292y.h(ivUserAvatarUserFragment, "ivUserAvatarUserFragment");
        int dimension = (int) getResources().getDimension(R.dimen.margin_l);
        ivUserAvatarUserFragment.setPadding(dimension, dimension, dimension, dimension);
        i0().f13122f.setBackground(null);
        i0().f13111D.setText(getString(R.string.sign_in_sign_up));
        UsernameTextView.a aVar = UsernameTextView.f31178k;
        UsernameTextView tvUsernameUserFragment = i0().f13111D;
        AbstractC3292y.h(tvUsernameUserFragment, "tvUsernameUserFragment");
        aVar.b(tvUsernameUserFragment);
        i0().f13111D.setTextColor(ContextCompat.getColor(requireContext(), R.color.text_terciary));
        i0().f13133q.setOnClickListener(new View.OnClickListener() { // from class: Z4.m2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.Z(t2.this, view);
            }
        });
        i0().f13141y.setVisibility(8);
        i0().f13140x.setVisibility(8);
        i0().f13123g.setVisibility(8);
        i0().f13136t.setVisibility(8);
        i0().f13137u.setVisibility(8);
        i0().f13128l.setVisibility(8);
        i0().f13121e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support));
        if (getActivity() != null && !requireActivity().isFinishing() && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).i8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(t2 t2Var, View view) {
        T.b bVar = c5.T.f15689k;
        Context requireContext = t2Var.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        c5.T e8 = bVar.e(requireContext);
        if (e8 != null) {
            Intent intent = new Intent(t2Var.getContext(), (Class<?>) UserCredentialsEditActivity.class);
            intent.putExtra("user", e8);
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = t2Var.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            t2Var.startActivity(intent, aVar.a(requireActivity));
        }
        FragmentActivity activity = t2Var.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(t2 t2Var, View view) {
        t2Var.r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(t2 t2Var, View view) {
        T.b bVar = c5.T.f15689k;
        Context requireContext = t2Var.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        if (bVar.e(requireContext) != null) {
            Intent intent = new Intent(t2Var.getContext(), (Class<?>) UserCredentialsEditActivity.class);
            intent.putExtra(HintConstants.AUTOFILL_HINT_PASSWORD, HintConstants.AUTOFILL_HINT_PASSWORD);
            UptodownApp.a aVar = UptodownApp.f29249C;
            FragmentActivity requireActivity = t2Var.requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            t2Var.startActivity(intent, aVar.a(requireActivity));
        }
        FragmentActivity activity = t2Var.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(t2 t2Var, View view) {
        t2Var.r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z0(t2 t2Var, View view) {
        FragmentActivity activity = t2Var.getActivity();
        AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.BaseActivity");
        AlertDialog o22 = ((AbstractActivityC2691a) activity).o2();
        if (o22 != null) {
            o22.dismiss();
        }
    }

    private final void a0(final Context context) {
        Object obj;
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        C1524n c8 = C1524n.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        TextView textView = c8.f12863f;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        c8.f12860c.setTypeface(aVar.v());
        c8.f12859b.setTypeface(aVar.v());
        c8.f12861d.setTypeface(aVar.v());
        String j8 = SettingsPreferences.f30529b.j(context);
        if (l6.n.s(j8, "yes", true)) {
            c8.f12860c.setChecked(true);
        } else if (l6.n.s(j8, "no", true)) {
            c8.f12859b.setChecked(true);
        } else {
            c8.f12861d.setChecked(true);
        }
        c8.f12860c.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Z4.i2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                t2.b0(kotlin.jvm.internal.T.this, this, compoundButton, z8);
            }
        });
        c8.f12859b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Z4.j2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                t2.c0(kotlin.jvm.internal.T.this, this, compoundButton, z8);
            }
        });
        c8.f12861d.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: Z4.k2
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                t2.d0(kotlin.jvm.internal.T.this, context, compoundButton, z8);
            }
        });
        c8.f12862e.setTypeface(aVar.u());
        c8.f12862e.setOnClickListener(new View.OnClickListener() { // from class: Z4.l2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.e0(kotlin.jvm.internal.T.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f34573a = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing() && (obj = t8.f34573a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f34573a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a1(int i8, int i9) {
        if (i8 > 0) {
            i0().f13114G.f12078d.setVisibility(0);
            i0().f13114G.f12080f.setText(String.valueOf(i8));
        } else {
            i0().f13114G.f12078d.setVisibility(4);
        }
        if (i9 > 0) {
            i0().f13118b.f12078d.setVisibility(0);
            i0().f13118b.f12080f.setText(String.valueOf(i9));
        } else {
            i0().f13118b.f12078d.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(kotlin.jvm.internal.T t8, t2 t2Var, CompoundButton compoundButton, boolean z8) {
        if (z8) {
            Object obj = t8.f34573a;
            AbstractC3292y.f(obj);
            ((AlertDialog) obj).dismiss();
            t2Var.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c0(kotlin.jvm.internal.T t8, t2 t2Var, CompoundButton compoundButton, boolean z8) {
        if (z8) {
            Object obj = t8.f34573a;
            AbstractC3292y.f(obj);
            ((AlertDialog) obj).dismiss();
            t2Var.U0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d0(kotlin.jvm.internal.T t8, Context context, CompoundButton compoundButton, boolean z8) {
        if (z8) {
            Object obj = t8.f34573a;
            AbstractC3292y.f(obj);
            ((AlertDialog) obj).dismiss();
            SettingsPreferences.f30529b.z0(context, "system");
            AppCompatDelegate.setDefaultNightMode(-1);
            UptodownApp.f29249C.q0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(kotlin.jvm.internal.T t8, View view) {
        Object obj = t8.f34573a;
        AbstractC3292y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e1(t2 t2Var, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1 && t2Var.isAdded()) {
            FragmentActivity activity = t2Var.getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).z5(0);
        }
    }

    private final void f0(final Context context) {
        Object obj;
        final kotlin.jvm.internal.T t8 = new kotlin.jvm.internal.T();
        C1527q c8 = C1527q.c(getLayoutInflater());
        AbstractC3292y.h(c8, "inflate(...)");
        TextView textView = c8.f12902d;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        c8.f12902d.setText(getString(R.string.log_out_confirmation_msg));
        c8.f12903e.setTypeface(aVar.u());
        c8.f12903e.setOnClickListener(new View.OnClickListener() { // from class: Z4.g2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.g0(t2.this, context, t8, view);
            }
        });
        c8.f12901c.setTypeface(aVar.u());
        c8.f12901c.setOnClickListener(new View.OnClickListener() { // from class: Z4.h2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.h0(kotlin.jvm.internal.T.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(c8.getRoot());
        builder.setCancelable(true);
        t8.f34573a = builder.create();
        if (getActivity() != null && !requireActivity().isFinishing() && (obj = t8.f34573a) != null) {
            Window window = ((AlertDialog) obj).getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            ((AlertDialog) t8.f34573a).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(t2 t2Var, Context context, kotlin.jvm.internal.T t8, View view) {
        t2Var.X(context);
        Object obj = t8.f34573a;
        AbstractC3292y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(kotlin.jvm.internal.T t8, View view) {
        Object obj = t8.f34573a;
        AbstractC3292y.f(obj);
        ((AlertDialog) obj).dismiss();
    }

    private final void k0() {
        i0().f13114G.f12078d.setVisibility(4);
        i0().f13118b.f12078d.setVisibility(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(final c5.T t8) {
        if (t8.f() != null) {
            com.squareup.picasso.w l8 = com.squareup.picasso.s.h().l(c5.T.f15689k.c(t8.b()));
            UptodownApp.a aVar = UptodownApp.f29249C;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            l8.n(aVar.f0(requireContext)).i(i0().f13122f);
            i0().f13122f.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.shadow_user_icon));
        } else {
            i0().f13122f.setImageResource(R.drawable.vector_user_profile);
        }
        i0().f13122f.setOnClickListener(new View.OnClickListener() { // from class: Z4.G1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.m0(t2.this, t8, view);
            }
        });
        ImageView ivUserAvatarUserFragment = i0().f13122f;
        AbstractC3292y.h(ivUserAvatarUserFragment, "ivUserAvatarUserFragment");
        ivUserAvatarUserFragment.setPadding(0, 0, 0, 0);
        i0().f13111D.setText(t8.s());
        if (t8.y() && !AbstractC3292y.d(t8.w(), "type0")) {
            UsernameTextView.a aVar2 = UsernameTextView.f31178k;
            UsernameTextView tvUsernameUserFragment = i0().f13111D;
            AbstractC3292y.h(tvUsernameUserFragment, "tvUsernameUserFragment");
            aVar2.a(tvUsernameUserFragment, t8.y(), t8.w());
        } else {
            UsernameTextView.a aVar3 = UsernameTextView.f31178k;
            UsernameTextView tvUsernameUserFragment2 = i0().f13111D;
            AbstractC3292y.h(tvUsernameUserFragment2, "tvUsernameUserFragment");
            aVar3.b(tvUsernameUserFragment2);
        }
        if (t8.v() > 0) {
            TextView textView = i0().f13140x;
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            textView.setText(t8.a(requireContext2));
        }
        v2 j02 = j0();
        Context requireContext3 = requireContext();
        AbstractC3292y.h(requireContext3, "requireContext(...)");
        j02.i(requireContext3, t8);
        i0().f13141y.setOnClickListener(new View.OnClickListener() { // from class: Z4.R1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.n0(t2.this, t8, view);
            }
        });
        if (t8.y()) {
            C3788m.a aVar4 = C3788m.f37279a;
            ImageView ivUserAvatarUserFragment2 = i0().f13122f;
            AbstractC3292y.h(ivUserAvatarUserFragment2, "ivUserAvatarUserFragment");
            aVar4.a(ivUserAvatarUserFragment2);
            i0().f13136t.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_turbo_button));
            i0().f13123g.setVisibility(0);
            i0().f13121e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support_turbo));
        } else {
            i0().f13136t.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.ripple_blue_primary_button));
            i0().f13123g.setVisibility(8);
            i0().f13121e.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_support));
        }
        i0().f13141y.setVisibility(0);
        i0().f13140x.setVisibility(0);
        i0().f13136t.setVisibility(0);
        i0().f13137u.setVisibility(0);
        i0().f13133q.setOnClickListener(null);
        if (t8.y()) {
            v2 j03 = j0();
            Context requireContext4 = requireContext();
            AbstractC3292y.h(requireContext4, "requireContext(...)");
            j03.k(requireContext4);
        } else {
            i0().f13128l.setVisibility(8);
        }
        if (getActivity() != null && !requireActivity().isFinishing() && (getActivity() instanceof MainActivity)) {
            FragmentActivity activity = getActivity();
            AbstractC3292y.g(activity, "null cannot be cast to non-null type com.uptodown.activities.MainActivity");
            ((MainActivity) activity).i8();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(t2 t2Var, c5.T t8, View view) {
        t2Var.q0(t8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n0(t2 t2Var, c5.T t8, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", t8.getId());
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    private final void o0() {
        String str;
        if (getContext() != null) {
            T.b bVar = c5.T.f15689k;
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            c5.T e8 = bVar.e(requireContext);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null) {
                Context requireContext2 = requireContext();
                AbstractC3292y.h(requireContext2, "requireContext(...)");
                if (e8.x(requireContext2)) {
                    l0(e8);
                    UptodownApp.a aVar = UptodownApp.f29249C;
                    Context requireContext3 = requireContext();
                    AbstractC3292y.h(requireContext3, "requireContext(...)");
                    aVar.j0(requireContext3);
                    Context requireContext4 = requireContext();
                    AbstractC3292y.h(requireContext4, "requireContext(...)");
                    aVar.i0(requireContext4);
                    return;
                }
            }
            Context requireContext5 = requireContext();
            AbstractC3292y.h(requireContext5, "requireContext(...)");
            X(requireContext5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(t2 t2Var, ActivityResult activityResult) {
        int resultCode = activityResult.getResultCode();
        if (resultCode != -1) {
            if (resultCode != 1002) {
                if (resultCode != 1) {
                    if (resultCode == 2) {
                        t2Var.o0();
                        return;
                    }
                    return;
                }
                t2Var.o0();
                return;
            }
            t2Var.t0();
            return;
        }
        Context requireContext = t2Var.requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        t2Var.X(requireContext);
    }

    private final void q0(c5.T t8) {
        Intent intent = new Intent(requireContext(), (Class<?>) UserAvatarActivity.class);
        intent.putExtra("user", t8);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        startActivity(intent, aVar.a(requireActivity));
    }

    private final void r0() {
        Intent intent = new Intent(requireContext(), (Class<?>) LoginActivity.class);
        ActivityResultLauncher activityResultLauncher = this.f13807e;
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    private final void s0() {
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (aVar.a0()) {
            Intent intent = new Intent(requireContext(), (Class<?>) SecurityActivity.class);
            FragmentActivity requireActivity = requireActivity();
            AbstractC3292y.h(requireActivity, "requireActivity(...)");
            startActivity(intent, aVar.a(requireActivity));
        }
    }

    private final void t0() {
        Intent intent = new Intent(requireContext(), (Class<?>) SettingsPreferences.class);
        ActivityResultLauncher activityResultLauncher = this.f13808f;
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        activityResultLauncher.launch(intent, aVar.b(requireActivity));
    }

    private final void v0() {
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        aVar.z0(requireContext, "yes");
        AppCompatDelegate.setDefaultNightMode(2);
        UptodownApp.f29249C.q0(true);
    }

    private final void w0() {
        T.b bVar = c5.T.f15689k;
        Context requireContext = requireContext();
        AbstractC3292y.h(requireContext, "requireContext(...)");
        final c5.T e8 = bVar.e(requireContext);
        if (e8 != null && getContext() != null) {
            Context requireContext2 = requireContext();
            AbstractC3292y.h(requireContext2, "requireContext(...)");
            if (e8.x(requireContext2)) {
                l0(e8);
            }
        }
        d1();
        i0().f13122f.setOnClickListener(new View.OnClickListener() { // from class: Z4.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.x0(c5.T.this, this, view);
            }
        });
        i0().f13133q.setOnClickListener(new View.OnClickListener() { // from class: Z4.P1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.y0(t2.this, view);
            }
        });
        i0().f13136t.setOnClickListener(new View.OnClickListener() { // from class: Z4.U1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.J0(t2.this, view);
            }
        });
        i0().f13115H.f12920c.setOnClickListener(new View.OnClickListener() { // from class: Z4.V1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.N0(t2.this, view);
            }
        });
        i0().f13115H.f12926i.setOnClickListener(new View.OnClickListener() { // from class: Z4.W1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.O0(t2.this, view);
            }
        });
        i0().f13115H.f12925h.setOnClickListener(new View.OnClickListener() { // from class: Z4.X1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.P0(t2.this, view);
            }
        });
        i0().f13115H.f12924g.setOnClickListener(new View.OnClickListener() { // from class: Z4.Y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.Q0(t2.this, view);
            }
        });
        i0().f13114G.f12077c.setOnClickListener(new View.OnClickListener() { // from class: Z4.Z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.R0(t2.this, view);
            }
        });
        i0().f13130n.f12077c.setOnClickListener(new View.OnClickListener() { // from class: Z4.a2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.S0(t2.this, view);
            }
        });
        i0().f13118b.f12077c.setOnClickListener(new View.OnClickListener() { // from class: Z4.b2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.T0(t2.this, view);
            }
        });
        i0().f13134r.f12077c.setOnClickListener(new View.OnClickListener() { // from class: Z4.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.z0(t2.this, view);
            }
        });
        i0().f13116I.f12077c.setOnClickListener(new View.OnClickListener() { // from class: Z4.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.A0(t2.this, view);
            }
        });
        i0().f13113F.f12077c.setOnClickListener(new View.OnClickListener() { // from class: Z4.H1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.B0(t2.this, view);
            }
        });
        i0().f13123g.setOnClickListener(new View.OnClickListener() { // from class: Z4.I1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.C0(t2.this, view);
            }
        });
        i0().f13125i.setOnClickListener(new View.OnClickListener() { // from class: Z4.J1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.D0(t2.this, view);
            }
        });
        i0().f13124h.setOnClickListener(new View.OnClickListener() { // from class: Z4.K1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.E0(t2.this, view);
            }
        });
        i0().f13126j.setOnClickListener(new View.OnClickListener() { // from class: Z4.L1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.F0(t2.this, view);
            }
        });
        i0().f13127k.setOnClickListener(new View.OnClickListener() { // from class: Z4.M1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.G0(t2.this, view);
            }
        });
        i0().f13112E.setOnClickListener(new View.OnClickListener() { // from class: Z4.N1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.H0(t2.this, view);
            }
        });
        i0().f13137u.setOnClickListener(new View.OnClickListener() { // from class: Z4.O1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.I0(t2.this, view);
            }
        });
        i0().f13120d.setOnClickListener(new View.OnClickListener() { // from class: Z4.Q1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.K0(t2.this, view);
            }
        });
        i0().f13120d.setOnLongClickListener(new View.OnLongClickListener() { // from class: Z4.S1
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                boolean L02;
                L02 = t2.L0(t2.this, view);
                return L02;
            }
        });
        i0().f13115H.f12923f.setOnClickListener(new View.OnClickListener() { // from class: Z4.T1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                t2.M0(t2.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x0(c5.T t8, t2 t2Var, View view) {
        if (t8 != null) {
            t2Var.q0(t8);
        } else {
            t2Var.r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y0(t2 t2Var, View view) {
        t2Var.r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z0(t2 t2Var, View view) {
        Intent intent = new Intent(t2Var.requireContext(), (Class<?>) RollbackActivity.class);
        UptodownApp.a aVar = UptodownApp.f29249C;
        FragmentActivity requireActivity = t2Var.requireActivity();
        AbstractC3292y.h(requireActivity, "requireActivity(...)");
        t2Var.startActivity(intent, aVar.a(requireActivity));
    }

    public final void b1(c5.T user) {
        AbstractC3292y.i(user, "user");
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new k(user, null), 3, null);
    }

    public final void c1() {
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new l(null), 3, null);
    }

    public final void d1() {
        if (isAdded() && getContext() != null) {
            v2 j02 = j0();
            Context requireContext = requireContext();
            AbstractC3292y.h(requireContext, "requireContext(...)");
            j02.g(requireContext);
            return;
        }
        k0();
    }

    public final Y4.z0 i0() {
        Y4.z0 z0Var = this.f13803a;
        if (z0Var != null) {
            return z0Var;
        }
        AbstractC3292y.y("binding");
        return null;
    }

    public final v2 j0() {
        return (v2) this.f13804b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC3292y.i(inflater, "inflater");
        boolean z8 = false;
        u0(Y4.z0.c(inflater, viewGroup, false));
        int i8 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_l);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.user_fragment_card_size);
        int i9 = -1;
        for (int i10 = 6; !z8 && i10 > 0; i10--) {
            int i11 = i8 - ((i10 + 1) * dimensionPixelSize);
            if (i11 >= dimensionPixelSize2 * i10) {
                i0().f13119c.setColumnCount(i10);
                i0().f13119c.setRowCount(6 / i10);
                z8 = true;
                i9 = i11 / i10;
            }
        }
        if (i9 > 0) {
            i0().f13130n.f12077c.getLayoutParams().height = i9;
            i0().f13114G.f12077c.getLayoutParams().height = i9;
            i0().f13118b.f12077c.getLayoutParams().height = i9;
            i0().f13134r.f12077c.getLayoutParams().height = i9;
            i0().f13116I.f12077c.getLayoutParams().height = i9;
            i0().f13113F.f12077c.getLayoutParams().height = i9;
        }
        RelativeLayout root = i0().getRoot();
        AbstractC3292y.h(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        new C3795t(getContext()).g("UserFragment");
        d1();
        if (new C3788m().o(getContext())) {
            i0().f13120d.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_dark_mode));
        } else {
            i0().f13120d.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.vector_light_mode));
        }
        W();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        AbstractC3292y.i(view, "view");
        super.onViewCreated(view, bundle);
        UsernameTextView usernameTextView = i0().f13111D;
        j.a aVar = J4.j.f4395g;
        usernameTextView.setTypeface(aVar.u());
        i0().f13140x.setTypeface(aVar.v());
        i0().f13141y.setTypeface(aVar.u());
        i0().f13136t.setTypeface(aVar.u());
        i0().f13115H.f12926i.setTypeface(aVar.u());
        i0().f13115H.f12925h.setTypeface(aVar.v());
        i0().f13115H.f12924g.setTypeface(aVar.v());
        i0().f13130n.f12079e.setTypeface(aVar.v());
        i0().f13130n.f12079e.setText(getString(R.string.my_apps_menu_left));
        i0().f13130n.f12076b.setImageResource(R.drawable.vector_user_panel_my_apps);
        i0().f13114G.f12079e.setTypeface(aVar.v());
        i0().f13114G.f12080f.setTypeface(aVar.v());
        i0().f13114G.f12079e.setText(getString(R.string.updates));
        i0().f13114G.f12076b.setImageResource(R.drawable.vector_user_panel_updates);
        i0().f13118b.f12079e.setTypeface(aVar.v());
        i0().f13118b.f12080f.setTypeface(aVar.v());
        i0().f13118b.f12079e.setText(getString(R.string.downloads_title));
        i0().f13118b.f12076b.setImageResource(R.drawable.vector_user_panel_download);
        i0().f13134r.f12079e.setTypeface(aVar.v());
        i0().f13134r.f12079e.setText(getString(R.string.rollback_title));
        i0().f13134r.f12076b.setImageResource(R.drawable.vector_user_panel_rollback);
        i0().f13116I.f12079e.setTypeface(aVar.v());
        i0().f13116I.f12079e.setText(getString(R.string.wishlist_title));
        i0().f13116I.f12076b.setImageResource(R.drawable.vector_user_panel_wishlist);
        i0().f13113F.f12079e.setTypeface(aVar.v());
        i0().f13113F.f12079e.setText(getString(R.string.upcoming_releases_title));
        i0().f13113F.f12076b.setImageResource(R.drawable.vector_user_panel_upcoming);
        i0().f13128l.setVisibility(8);
        i0().f13110C.setTypeface(aVar.v());
        i0().f13138v.setTypeface(aVar.v());
        i0().f13142z.setTypeface(aVar.v());
        i0().f13139w.setTypeface(aVar.v());
        i0().f13108A.setTypeface(aVar.v());
        i0().f13109B.setTypeface(aVar.v());
        i0().f13112E.setTypeface(aVar.v());
        i0().f13137u.setTypeface(aVar.v());
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new a(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new b(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new c(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new e(null), 2, null);
        w0();
    }

    public final void u0(Y4.z0 z0Var) {
        AbstractC3292y.i(z0Var, "<set-?>");
        this.f13803a = z0Var;
    }
}
