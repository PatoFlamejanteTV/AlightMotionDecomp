package com.uptodown.activities;

import I4.C1240t;
import J4.j;
import Q5.C1413h;
import Q5.InterfaceC1416k;
import Y4.S;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import c5.C2032B;
import c5.C2043h;
import c6.InterfaceC2072n;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.NotificationsRegistryActivity;
import com.uptodown.activities.q;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.U;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q6.InterfaceC3813L;
import q6.InterfaceC3822g;

/* loaded from: classes4.dex */
public final class NotificationsRegistryActivity extends AbstractActivityC2691a {

    /* renamed from: Q, reason: collision with root package name */
    private boolean f29934Q;

    /* renamed from: S, reason: collision with root package name */
    private C1240t f29936S;

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1416k f29932O = Q5.l.b(new Function0() { // from class: F4.Z2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Y4.S m32;
            m32 = NotificationsRegistryActivity.m3(NotificationsRegistryActivity.this);
            return m32;
        }
    });

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC1416k f29933P = new ViewModelLazy(U.b(q.class), new f(this), new e(this), new g(null, this));

    /* renamed from: R, reason: collision with root package name */
    private boolean f29935R = true;

    /* renamed from: T, reason: collision with root package name */
    private c f29937T = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29938a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29940c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i8, U5.d dVar) {
            super(2, dVar);
            this.f29940c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f29940c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29938a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
                int i9 = this.f29940c;
                this.f29938a = 1;
                if (notificationsRegistryActivity.A3(i9, this) == e8) {
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

    /* loaded from: classes4.dex */
    public static final class b implements b5.r {
        b() {
        }

        @Override // b5.r
        public void b(int i8) {
            Snackbar.make(NotificationsRegistryActivity.this.r3().f12400c, R.string.app_detail_not_found, -1).show();
        }

        @Override // b5.r
        public void c(C2043h appInfo) {
            AbstractC3292y.i(appInfo, "appInfo");
            Intent intent = new Intent(NotificationsRegistryActivity.this, (Class<?>) AppDetailActivity.class);
            intent.putExtra("appInfo", appInfo);
            NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
            notificationsRegistryActivity.startActivity(intent, UptodownApp.f29249C.a(notificationsRegistryActivity));
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements b5.v {
        c() {
        }

        @Override // b5.v
        public void a(int i8) {
            NotificationsRegistryActivity.this.y3(i8, 1);
        }

        @Override // b5.v
        public void b(int i8) {
            NotificationsRegistryActivity.this.n3(i8);
        }

        @Override // b5.v
        public void c(int i8) {
            NotificationsRegistryActivity.this.y3(i8, 0);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29943a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3822g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ NotificationsRegistryActivity f29945a;

            a(NotificationsRegistryActivity notificationsRegistryActivity) {
                this.f29945a = notificationsRegistryActivity;
            }

            @Override // q6.InterfaceC3822g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3768A abstractC3768A, U5.d dVar) {
                if (abstractC3768A instanceof AbstractC3768A.a) {
                    this.f29945a.r3().f12399b.f12236b.setVisibility(0);
                } else if (abstractC3768A instanceof AbstractC3768A.c) {
                    this.f29945a.z3(((q.a) ((AbstractC3768A.c) abstractC3768A).a()).a());
                    this.f29945a.f29935R = false;
                    this.f29945a.f29934Q = false;
                    this.f29945a.r3().f12399b.f12236b.setVisibility(8);
                } else if (!(abstractC3768A instanceof AbstractC3768A.b)) {
                    throw new Q5.p();
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
            int i8 = this.f29943a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q5.t.b(obj);
            } else {
                Q5.t.b(obj);
                InterfaceC3813L e9 = NotificationsRegistryActivity.this.t3().e();
                a aVar = new a(NotificationsRegistryActivity.this);
                this.f29943a = 1;
                if (e9.collect(aVar, this) == e8) {
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
    public static final class e extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29946a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f29946a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29946a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29947a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f29947a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29947a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29948a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29949b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29948a = function0;
            this.f29949b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29948a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29949b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29950a;

        /* renamed from: b, reason: collision with root package name */
        int f29951b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f29952c;

        /* renamed from: e, reason: collision with root package name */
        int f29954e;

        h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29952c = obj;
            this.f29954e |= Integer.MIN_VALUE;
            return NotificationsRegistryActivity.this.A3(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29955a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29957c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i8, U5.d dVar) {
            super(2, dVar);
            this.f29957c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new i(this.f29957c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29955a == 0) {
                Q5.t.b(obj);
                String format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.getDefault()).format(kotlin.coroutines.jvm.internal.b.d(System.currentTimeMillis()));
                AbstractC3292y.h(format, "format(...)");
                q t32 = NotificationsRegistryActivity.this.t3();
                NotificationsRegistryActivity notificationsRegistryActivity = NotificationsRegistryActivity.this;
                C1240t c1240t = notificationsRegistryActivity.f29936S;
                AbstractC3292y.f(c1240t);
                Object obj2 = c1240t.a().get(this.f29957c);
                AbstractC3292y.h(obj2, "get(...)");
                t32.f(notificationsRegistryActivity, (C2032B) obj2, format);
                C1240t c1240t2 = NotificationsRegistryActivity.this.f29936S;
                AbstractC3292y.f(c1240t2);
                ((C2032B) c1240t2.a().get(this.f29957c)).k(NotificationsRegistryActivity.this.getString(R.string.file_deleted_notification, format));
                C1240t c1240t3 = NotificationsRegistryActivity.this.f29936S;
                AbstractC3292y.f(c1240t3);
                ((C2032B) c1240t3.a().get(this.f29957c)).i("no_action");
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29958a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29960c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i8, U5.d dVar) {
            super(2, dVar);
            this.f29960c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new j(this.f29960c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29958a == 0) {
                Q5.t.b(obj);
                C1240t c1240t = NotificationsRegistryActivity.this.f29936S;
                AbstractC3292y.f(c1240t);
                c1240t.notifyItemChanged(this.f29960c);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A3(int r7, U5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.uptodown.activities.NotificationsRegistryActivity.h
            if (r0 == 0) goto L13
            r0 = r8
            com.uptodown.activities.NotificationsRegistryActivity$h r0 = (com.uptodown.activities.NotificationsRegistryActivity.h) r0
            int r1 = r0.f29954e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29954e = r1
            goto L18
        L13:
            com.uptodown.activities.NotificationsRegistryActivity$h r0 = new com.uptodown.activities.NotificationsRegistryActivity$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29952c
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f29954e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r8)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r7 = r0.f29951b
            java.lang.Object r2 = r0.f29950a
            com.uptodown.activities.NotificationsRegistryActivity r2 = (com.uptodown.activities.NotificationsRegistryActivity) r2
            Q5.t.b(r8)
            goto L59
        L3f:
            Q5.t.b(r8)
            n6.I r8 = n6.C3445b0.b()
            com.uptodown.activities.NotificationsRegistryActivity$i r2 = new com.uptodown.activities.NotificationsRegistryActivity$i
            r2.<init>(r7, r5)
            r0.f29950a = r6
            r0.f29951b = r7
            r0.f29954e = r4
            java.lang.Object r8 = n6.AbstractC3458i.g(r8, r2, r0)
            if (r8 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            n6.J0 r8 = n6.C3445b0.c()
            com.uptodown.activities.NotificationsRegistryActivity$j r4 = new com.uptodown.activities.NotificationsRegistryActivity$j
            r4.<init>(r7, r5)
            r0.f29950a = r5
            r0.f29954e = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r8, r4, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.NotificationsRegistryActivity.A3(int, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S m3(NotificationsRegistryActivity notificationsRegistryActivity) {
        return S.c(notificationsRegistryActivity.getLayoutInflater());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3(int i8) {
        C1240t c1240t = this.f29936S;
        if (c1240t != null) {
            AbstractC3292y.f(c1240t);
            if (c1240t.getItemCount() > i8) {
                q t32 = t3();
                C1240t c1240t2 = this.f29936S;
                AbstractC3292y.f(c1240t2);
                t32.c(this, ((C2032B) c1240t2.a().get(i8)).c());
                C1240t c1240t3 = this.f29936S;
                AbstractC3292y.f(c1240t3);
                c1240t3.a().remove(i8);
                C1240t c1240t4 = this.f29936S;
                AbstractC3292y.f(c1240t4);
                c1240t4.notifyItemRemoved(i8);
            }
        }
    }

    private final void o3(final File file, final int i8) {
        String string = getString(R.string.dialog_delete_download_msg, file.getName());
        AbstractC3292y.h(string, "getString(...)");
        T1(string, new Function0() { // from class: F4.a3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Q5.I p32;
                p32 = NotificationsRegistryActivity.p3(file, this, i8);
                return p32;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Q5.I p3(File file, NotificationsRegistryActivity notificationsRegistryActivity, int i8) {
        if (file.delete()) {
            Snackbar.make(notificationsRegistryActivity.r3().f12400c, notificationsRegistryActivity.getString(R.string.snackbar_message_apk_deleted, file.getName()), -1).show();
            AbstractC3462k.d(n6.N.a(C3445b0.b()), null, null, new a(i8, null), 3, null);
        }
        return Q5.I.f8786a;
    }

    private final void q3(String str, String str2, int i8) {
        switch (str.hashCode()) {
            case -1569440520:
                if (str.equals("positive_apps")) {
                    startActivity(new Intent(this, (Class<?>) SecurityActivity.class), UptodownApp.f29249C.a(this));
                    Q5.I i9 = Q5.I.f8786a;
                    return;
                }
                break;
            case -1335458389:
                if (str.equals("delete")) {
                    if (str2 != null) {
                        o3(new File(str2), i8);
                    } else {
                        Snackbar.make(r3().f12400c, getString(R.string.msg_no_action_available), -1).show();
                    }
                    Q5.I i10 = Q5.I.f8786a;
                    return;
                }
                break;
            case -504325460:
                if (str.equals("open_app")) {
                    if (str2 != null) {
                        try {
                            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(str2);
                            if (launchIntentForPackage != null) {
                                startActivity(launchIntentForPackage);
                            } else {
                                Snackbar.make(r3().f12400c, R.string.app_detail_not_found, -1).show();
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            Snackbar.make(r3().f12400c, R.string.app_detail_not_found, -1).show();
                        }
                    } else {
                        Snackbar.make(r3().f12400c, getString(R.string.msg_no_action_available), -1).show();
                    }
                    Q5.I i11 = Q5.I.f8786a;
                    return;
                }
                break;
            case -234430262:
                if (str.equals("updates")) {
                    startActivity(new Intent(this, (Class<?>) Updates.class), UptodownApp.f29249C.a(this));
                    Q5.I i12 = Q5.I.f8786a;
                    return;
                }
                break;
            case 1085191854:
                if (str.equals("update_uptodown")) {
                    if (str2 != null) {
                        File file = new File(str2);
                        if (file.exists()) {
                            UptodownApp.a.Z(UptodownApp.f29249C, file, this, null, 4, null);
                        } else {
                            Snackbar.make(r3().f12400c, R.string.installable_files_not_found, -1).show();
                        }
                    } else {
                        Snackbar.make(r3().f12400c, getString(R.string.msg_no_action_available), -1).show();
                    }
                    Q5.I i13 = Q5.I.f8786a;
                    return;
                }
                break;
            case 1117687366:
                if (str.equals("preregister")) {
                    if (str2 != null) {
                        new X4.i(this, Long.parseLong(str2), new b(), LifecycleOwnerKt.getLifecycleScope(this));
                        return;
                    } else {
                        Snackbar.make(r3().f12400c, getString(R.string.msg_no_action_available), -1).show();
                        Q5.I i14 = Q5.I.f8786a;
                        return;
                    }
                }
                break;
            case 1312704747:
                if (str.equals("downloads")) {
                    startActivity(new Intent(this, (Class<?>) MyDownloads.class), UptodownApp.f29249C.a(this));
                    Q5.I i15 = Q5.I.f8786a;
                    return;
                }
                break;
            case 1957569947:
                if (str.equals("install")) {
                    if (str2 != null) {
                        File file2 = new File(str2);
                        if (file2.exists()) {
                            UptodownApp.a.Z(UptodownApp.f29249C, file2, this, null, 4, null);
                        } else {
                            Snackbar.make(r3().f12400c, R.string.installable_files_not_found, -1).show();
                        }
                    } else {
                        Snackbar.make(r3().f12400c, getString(R.string.msg_no_action_available), -1).show();
                    }
                    Q5.I i16 = Q5.I.f8786a;
                    return;
                }
                break;
        }
        Snackbar.make(r3().f12400c, getString(R.string.msg_no_action_available), -1).show();
        Q5.I i17 = Q5.I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S r3() {
        return (S) this.f29932O.getValue();
    }

    private final void s3() {
        t3().d(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q t3() {
        return (q) this.f29933P.getValue();
    }

    private final void u3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            r3().f12401d.setNavigationIcon(drawable);
            r3().f12401d.setNavigationContentDescription(getString(R.string.back));
        }
        r3().f12401d.setNavigationOnClickListener(new View.OnClickListener() { // from class: F4.W2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsRegistryActivity.v3(NotificationsRegistryActivity.this, view);
            }
        });
        r3().f12401d.inflateMenu(R.menu.menu_notifications_registry);
        r3().f12401d.setOverflowIcon(ContextCompat.getDrawable(this, R.drawable.vector_menu_dots_color_adaptable));
        r3().f12401d.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() { // from class: F4.X2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                boolean w32;
                w32 = NotificationsRegistryActivity.w3(NotificationsRegistryActivity.this, menuItem);
                return w32;
            }
        });
        TextView textView = r3().f12403f;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        r3().f12402e.setTypeface(aVar.v());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        r3().f12400c.addItemDecoration(new s5.m(dimension, dimension));
        r3().f12400c.setLayoutManager(linearLayoutManager);
        r3().f12400c.setItemAnimator(new DefaultItemAnimator());
        r3().f12399b.f12236b.setOnClickListener(new View.OnClickListener() { // from class: F4.Y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationsRegistryActivity.x3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(NotificationsRegistryActivity notificationsRegistryActivity, View view) {
        notificationsRegistryActivity.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w3(NotificationsRegistryActivity notificationsRegistryActivity, MenuItem item) {
        AbstractC3292y.i(item, "item");
        if (item.getItemId() == R.id.action_delete_all) {
            notificationsRegistryActivity.t3().b(notificationsRegistryActivity);
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y3(int i8, int i9) {
        C1240t c1240t = this.f29936S;
        if (c1240t != null) {
            AbstractC3292y.f(c1240t);
            if (c1240t.getItemCount() > i8) {
                C1240t c1240t2 = this.f29936S;
                AbstractC3292y.f(c1240t2);
                Object obj = c1240t2.a().get(i8);
                AbstractC3292y.h(obj, "get(...)");
                C2032B c2032b = (C2032B) obj;
                if (c2032b.a() != null) {
                    String a9 = c2032b.a();
                    AbstractC3292y.f(a9);
                    List s02 = l6.n.s0(a9, new String[]{";"}, false, 0, 6, null);
                    if (s02.size() > i9) {
                        q3((String) s02.get(i9), c2032b.b(), i8);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            C1240t c1240t = this.f29936S;
            if (c1240t == null) {
                this.f29936S = new C1240t(arrayList, this, this.f29937T);
                r3().f12400c.setAdapter(this.f29936S);
            } else {
                if (c1240t != null) {
                    c1240t.d(arrayList);
                }
                C1240t c1240t2 = this.f29936S;
                if (c1240t2 != null) {
                    c1240t2.notifyDataSetChanged();
                }
            }
            r3().f12402e.setVisibility(8);
            return;
        }
        C1240t c1240t3 = this.f29936S;
        if (c1240t3 != null) {
            c1240t3.d(new ArrayList());
        }
        C1240t c1240t4 = this.f29936S;
        if (c1240t4 != null) {
            c1240t4.notifyDataSetChanged();
        }
        r3().f12402e.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(r3().getRoot());
        u3();
        AbstractC3462k.d(LifecycleOwnerKt.getLifecycleScope(this), C3445b0.c(), null, new d(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2691a, K4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f29935R) {
            s3();
        }
    }
}
