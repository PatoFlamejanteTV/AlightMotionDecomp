package com.uptodown;

import J4.i;
import J4.j;
import Q5.I;
import Q5.t;
import S4.r;
import X4.m;
import Y4.C1529t;
import a5.C1675b;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.autofill.HintConstants;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import b5.J;
import c5.C2041f;
import c5.C2047l;
import c5.C2051p;
import c5.Q;
import c5.T;
import c6.InterfaceC2072n;
import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.inmobi.cmp.core.model.ACData;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.core.model.gbc.GoogleBasicConsents;
import com.inmobi.cmp.core.model.mspa.USRegulationData;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.UptodownApp;
import com.uptodown.activities.AppDetailActivity;
import com.uptodown.activities.AppInstalledDetailsActivity;
import com.uptodown.activities.FreeUpSpaceActivity;
import com.uptodown.activities.MainActivity;
import com.uptodown.activities.MyApps;
import com.uptodown.activities.MyDownloads;
import com.uptodown.activities.OldVersionsActivity;
import com.uptodown.activities.Updates;
import com.uptodown.activities.WishlistActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.ui.activity.TvAppDetailActivity;
import com.uptodown.workers.DownloadUpdatesWorker;
import com.uptodown.workers.GetUserDataWorker;
import com.uptodown.workers.PreRegisterWorker;
import com.uptodown.workers.SearchApksWorker;
import com.uptodown.workers.TrackingWorker;
import d5.C2758a;
import d5.C2759b;
import d5.C2760c;
import d5.ResultReceiverC2764g;
import d5.ResultReceiverC2765h;
import d5.ResultReceiverC2766i;
import e5.C2821a;
import f5.InterfaceC2867a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import l6.h;
import l6.n;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;
import n6.N;
import q5.C3770C;
import q5.C3774G;
import q5.C3784i;
import q5.C3788m;
import q5.C3791p;
import q5.C3795t;
import q5.C3797v;
import q5.C3799x;
import q5.C3800y;
import u5.C4087g;
import z0.InterfaceFutureC4260d;

/* loaded from: classes4.dex */
public final class UptodownApp extends j implements ChoiceCmpCallback {

    /* renamed from: E, reason: collision with root package name */
    private static String f29251E;

    /* renamed from: F, reason: collision with root package name */
    private static String f29252F;

    /* renamed from: G, reason: collision with root package name */
    private static String f29253G;

    /* renamed from: H, reason: collision with root package name */
    private static String f29254H;

    /* renamed from: I, reason: collision with root package name */
    private static String f29255I;

    /* renamed from: J, reason: collision with root package name */
    private static String f29256J;

    /* renamed from: K, reason: collision with root package name */
    private static String f29257K;

    /* renamed from: L, reason: collision with root package name */
    private static String f29258L;

    /* renamed from: M, reason: collision with root package name */
    private static String f29259M;

    /* renamed from: N, reason: collision with root package name */
    private static int f29260N;

    /* renamed from: O, reason: collision with root package name */
    private static int f29261O;

    /* renamed from: P, reason: collision with root package name */
    private static int f29262P;

    /* renamed from: Q, reason: collision with root package name */
    private static int f29263Q;

    /* renamed from: R, reason: collision with root package name */
    private static int f29264R;

    /* renamed from: S, reason: collision with root package name */
    private static h2.e f29265S;

    /* renamed from: T, reason: collision with root package name */
    private static h2.e f29266T;

    /* renamed from: W, reason: collision with root package name */
    private static boolean f29269W;

    /* renamed from: X, reason: collision with root package name */
    private static int f29270X;

    /* renamed from: Y, reason: collision with root package name */
    private static int f29271Y;

    /* renamed from: Z, reason: collision with root package name */
    private static boolean f29272Z;

    /* renamed from: p0, reason: collision with root package name */
    private static C2047l f29273p0;

    /* renamed from: q0, reason: collision with root package name */
    private static boolean f29274q0;

    /* renamed from: s0, reason: collision with root package name */
    private static ArrayList f29276s0;

    /* renamed from: t0, reason: collision with root package name */
    private static boolean f29277t0;

    /* renamed from: u0, reason: collision with root package name */
    private static long f29278u0;

    /* renamed from: v0, reason: collision with root package name */
    private static ArrayList f29279v0;

    /* renamed from: A, reason: collision with root package name */
    private C2760c f29284A;

    /* renamed from: B, reason: collision with root package name */
    private C2759b f29285B;

    /* renamed from: z, reason: collision with root package name */
    private C2758a f29286z;

    /* renamed from: C, reason: collision with root package name */
    public static final a f29249C = new a(null);

    /* renamed from: D, reason: collision with root package name */
    private static float f29250D = 1.0f;

    /* renamed from: U, reason: collision with root package name */
    private static final HashMap f29267U = new HashMap();

    /* renamed from: V, reason: collision with root package name */
    private static ResultReceiverC2766i f29268V = new ResultReceiverC2766i(null);

    /* renamed from: r0, reason: collision with root package name */
    private static final Object f29275r0 = new Object();

    /* renamed from: w0, reason: collision with root package name */
    private static final Object f29280w0 = new Object();

    /* renamed from: x0, reason: collision with root package name */
    private static final Object f29281x0 = new Object();

    /* renamed from: y0, reason: collision with root package name */
    private static final Object f29282y0 = new Object();

    /* renamed from: z0, reason: collision with root package name */
    private static final Object f29283z0 = new Object();

    /* renamed from: A0, reason: collision with root package name */
    private static ArrayList f29248A0 = new ArrayList();

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: com.uptodown.UptodownApp$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0693a implements InterfaceC2867a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f29287a;

            C0693a(Context context) {
                this.f29287a = context;
            }

            @Override // f5.InterfaceC2867a
            public void a(String str) {
                Bundle bundle = new Bundle();
                bundle.putString("type", "failed");
                new C3795t(this.f29287a).e("uptodown_services_init", bundle);
            }

            @Override // f5.InterfaceC2867a
            public void b() {
                Bundle bundle = new Bundle();
                bundle.putString("type", "success");
                new C3795t(this.f29287a).e("uptodown_services_init", bundle);
            }

            @Override // f5.InterfaceC2867a
            public void c() {
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29288a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29289b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29290c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Activity activity, String str, U5.d dVar) {
                super(2, dVar);
                this.f29289b = activity;
                this.f29290c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f29289b, this.f29290c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29288a == 0) {
                    t.b(obj);
                    ((WishlistActivity) this.f29289b).a5(this.f29290c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29291a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f29292b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InstallerActivity installerActivity, U5.d dVar) {
                super(2, dVar);
                this.f29292b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f29292b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29291a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    InstallerActivity installerActivity = this.f29292b;
                    this.f29291a = 1;
                    if (installerActivity.h2(1, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class d extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29293a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29294b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Activity activity, String str, U5.d dVar) {
                super(2, dVar);
                this.f29294b = activity;
                this.f29295c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f29294b, this.f29295c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29293a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    OldVersionsActivity oldVersionsActivity = (OldVersionsActivity) this.f29294b;
                    String str = this.f29295c;
                    this.f29293a = 1;
                    if (oldVersionsActivity.H3(str, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class e extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29296a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29297b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29298c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f29299d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Activity activity, String str, boolean z8, U5.d dVar) {
                super(2, dVar);
                this.f29297b = activity;
                this.f29298c = str;
                this.f29299d = z8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f29297b, this.f29298c, this.f29299d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29296a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    MainActivity mainActivity = (MainActivity) this.f29297b;
                    String str = this.f29298c;
                    this.f29296a = 1;
                    if (mainActivity.a8(str, this) == e8) {
                        return e8;
                    }
                }
                if (this.f29299d) {
                    ((MainActivity) this.f29297b).g8();
                }
                ((MainActivity) this.f29297b).j8(this.f29298c);
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class f extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29300a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29301b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(Activity activity, U5.d dVar) {
                super(2, dVar);
                this.f29301b = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new f(this.f29301b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f29300a == 0) {
                    t.b(obj);
                    ((MyDownloads) this.f29301b).y4(false);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class g extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29302a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29303b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29304c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(Activity activity, String str, U5.d dVar) {
                super(2, dVar);
                this.f29303b = activity;
                this.f29304c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new g(this.f29303b, this.f29304c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29302a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    MyApps myApps = (MyApps) this.f29303b;
                    String str = this.f29304c;
                    this.f29302a = 1;
                    if (myApps.L4("app_updated", str, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class h extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29305a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f29306b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f29307c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29308d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(boolean z8, Activity activity, String str, U5.d dVar) {
                super(2, dVar);
                this.f29306b = z8;
                this.f29307c = activity;
                this.f29308d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new h(this.f29306b, this.f29307c, this.f29308d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29305a;
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    if (this.f29306b) {
                        Updates updates = (Updates) this.f29307c;
                        String str = this.f29308d;
                        this.f29305a = 1;
                        if (updates.U4("app_updated", str, this) == e8) {
                            return e8;
                        }
                    } else {
                        Updates updates2 = (Updates) this.f29307c;
                        String str2 = this.f29308d;
                        this.f29305a = 2;
                        if (updates2.U4("app_installed", str2, this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class i extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29309a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f29310b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f29311c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f29312d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(boolean z8, Activity activity, String str, U5.d dVar) {
                super(2, dVar);
                this.f29310b = z8;
                this.f29311c = activity;
                this.f29312d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new i(this.f29310b, this.f29311c, this.f29312d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29309a;
                if (i8 != 0) {
                    if (i8 != 1 && i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj);
                } else {
                    t.b(obj);
                    if (this.f29310b) {
                        FreeUpSpaceActivity freeUpSpaceActivity = (FreeUpSpaceActivity) this.f29311c;
                        String str = this.f29312d;
                        this.f29309a = 1;
                        if (freeUpSpaceActivity.j3("app_updated", str, this) == e8) {
                            return e8;
                        }
                    } else {
                        FreeUpSpaceActivity freeUpSpaceActivity2 = (FreeUpSpaceActivity) this.f29311c;
                        String str2 = this.f29312d;
                        this.f29309a = 2;
                        if (freeUpSpaceActivity2.j3("app_installed", str2, this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class j extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29313a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f29314b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Activity f29315c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(boolean z8, Activity activity, U5.d dVar) {
                super(2, dVar);
                this.f29314b = z8;
                this.f29315c = activity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new j(this.f29314b, this.f29315c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29313a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    if (this.f29314b) {
                        AppInstalledDetailsActivity appInstalledDetailsActivity = (AppInstalledDetailsActivity) this.f29315c;
                        this.f29313a = 1;
                        if (appInstalledDetailsActivity.U4("app_updated", this) == e8) {
                            return e8;
                        }
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* loaded from: classes4.dex */
        static final class k extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f29316a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Activity f29317b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f29318c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Activity activity, String str, U5.d dVar) {
                super(2, dVar);
                this.f29317b = activity;
                this.f29318c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new k(this.f29317b, this.f29318c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.f29316a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    TvAppDetailActivity tvAppDetailActivity = (TvAppDetailActivity) this.f29317b;
                    String str = this.f29318c;
                    this.f29316a = 1;
                    if (tvAppDetailActivity.m(str, this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((k) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        private a() {
        }

        private final void K0(Context context, boolean z8) {
            Data build = new Data.Builder().putBoolean("isCompressed", z8).build();
            AbstractC3292y.h(build, "build(...)");
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(TrackingWorker.class).addTag("TrackingWorkerSingle").setBackoffCriteria(BackoffPolicy.LINEAR, 1L, TimeUnit.MINUTES).setInputData(build).setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
        }

        public static /* synthetic */ boolean M0(a aVar, Context context, boolean z8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return aVar.L0(context, z8);
        }

        public static /* synthetic */ void Z(a aVar, File file, Context context, String str, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                str = null;
            }
            aVar.Y(file, context, str);
        }

        private final int d(float f8) {
            return (int) (f8 * UptodownApp.f29250D);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:            r7 = com.uptodown.UptodownApp.f29276s0;        kotlin.jvm.internal.AbstractC3292y.f(r7);        r7.remove(r3);     */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:            r2 = true;     */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final boolean d0(java.lang.String r7) {
            /*
                r6 = this;
                java.lang.Object r0 = com.uptodown.UptodownApp.p0()
                monitor-enter(r0)
                java.util.ArrayList r1 = com.uptodown.UptodownApp.E0()     // Catch: java.lang.Throwable -> L3e
                r2 = 0
                if (r1 == 0) goto L43
                java.util.ArrayList r1 = com.uptodown.UptodownApp.E0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3292y.f(r1)     // Catch: java.lang.Throwable -> L3e
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L3e
                r3 = 0
            L18:
                if (r3 >= r1) goto L43
                java.util.ArrayList r4 = com.uptodown.UptodownApp.E0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3292y.f(r4)     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L3e
                c5.f r4 = (c5.C2041f) r4     // Catch: java.lang.Throwable -> L3e
                java.lang.String r4 = r4.Q()     // Catch: java.lang.Throwable -> L3e
                r5 = 1
                boolean r4 = l6.n.s(r7, r4, r5)     // Catch: java.lang.Throwable -> L3e
                if (r4 == 0) goto L40
                java.util.ArrayList r7 = com.uptodown.UptodownApp.E0()     // Catch: java.lang.Throwable -> L3e
                kotlin.jvm.internal.AbstractC3292y.f(r7)     // Catch: java.lang.Throwable -> L3e
                r7.remove(r3)     // Catch: java.lang.Throwable -> L3e
                r2 = 1
                goto L43
            L3e:
                r7 = move-exception
                goto L45
            L40:
                int r3 = r3 + 1
                goto L18
            L43:
                monitor-exit(r0)
                return r2
            L45:
                monitor-exit(r0)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.UptodownApp.a.d0(java.lang.String):boolean");
        }

        private final void k0(Context context) {
            Constraints build = new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build();
            TimeUnit timeUnit = TimeUnit.MINUTES;
            WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) TrackingWorker.class, 30L, timeUnit).addTag("TrackingWorkerPeriodic").setBackoffCriteria(BackoffPolicy.LINEAR, 1L, timeUnit).setConstraints(build).build());
        }

        public final int A() {
            return UptodownApp.f29262P;
        }

        public final void A0(ArrayList arrayList) {
            UptodownApp.f29279v0 = arrayList;
        }

        public final int B() {
            return UptodownApp.f29263Q;
        }

        public final void B0(boolean z8) {
            UptodownApp.f29269W = z8;
        }

        public final String C() {
            return UptodownApp.f29257K;
        }

        public final void C0(int i8) {
            UptodownApp.f29261O = i8;
        }

        public final String D() {
            return UptodownApp.f29256J;
        }

        public final void D0(int i8) {
            UptodownApp.f29260N = i8;
        }

        public final ResultReceiverC2766i E() {
            return UptodownApp.f29268V;
        }

        public final void E0(int i8) {
            UptodownApp.f29262P = i8;
        }

        public final ArrayList F() {
            ArrayList arrayList;
            synchronized (UptodownApp.f29283z0) {
                arrayList = UptodownApp.f29248A0;
            }
            return arrayList;
        }

        public final void F0(int i8) {
            UptodownApp.f29263Q = i8;
        }

        public final ArrayList G() {
            ArrayList arrayList;
            synchronized (UptodownApp.f29275r0) {
                arrayList = UptodownApp.f29276s0;
            }
            return arrayList;
        }

        public final void G0(String str) {
            UptodownApp.f29257K = str;
        }

        public final int H() {
            return UptodownApp.f29264R;
        }

        public final void H0(String str) {
            UptodownApp.f29256J = str;
        }

        public final WorkInfo.State I(String str, Context context) {
            WorkInfo.State state = WorkInfo.State.SUCCEEDED;
            if (context != null) {
                WorkManager workManager = WorkManager.getInstance(context);
                AbstractC3292y.h(workManager, "getInstance(...)");
                AbstractC3292y.f(str);
                InterfaceFutureC4260d workInfosByTag = workManager.getWorkInfosByTag(str);
                AbstractC3292y.h(workInfosByTag, "getWorkInfosByTag(...)");
                Iterator it = ((List) workInfosByTag.get()).iterator();
                while (it.hasNext() && (state = ((WorkInfo) it.next()).getState()) != WorkInfo.State.RUNNING && state != WorkInfo.State.ENQUEUED) {
                }
            }
            return state;
        }

        public final void I0(ArrayList arrayList) {
            synchronized (UptodownApp.f29275r0) {
                UptodownApp.f29276s0 = arrayList;
                I i8 = I.f8786a;
            }
        }

        public final HashMap J() {
            return UptodownApp.f29267U;
        }

        public final void J0(int i8) {
            UptodownApp.f29264R = i8;
        }

        public final void K(Context context) {
            AbstractC3292y.i(context, "context");
            if (SettingsPreferences.f30529b.j0(context)) {
                new C2821a(context).c("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ2YWx1ZSI6IjRhOTRiN2I1MTk1NGVkNGMyMjZjZGM1MGMxZDE5Yjk2MTY4MzY5OTE1NCJ9.1j7HuORIuuZDp0wTf1f9A__sAHEnqaGDiuCNY5OQXYN", new C0693a(context));
            }
        }

        public final boolean L() {
            return UptodownApp.f29272Z;
        }

        public final boolean L0(Context context, boolean z8) {
            AbstractC3292y.i(context, "context");
            if (!W("TrackingWorkerSingle", context) && !V("TrackingWorkerPeriodic", context) && !V("GenerateQueueWorker", context) && !V("DownloadUpdatesWorker", context)) {
                K0(context, z8);
                return true;
            }
            return false;
        }

        public final boolean M() {
            return false;
        }

        public final boolean N() {
            return UptodownApp.f29274q0;
        }

        public final Object N0(String str, boolean z8, U5.d dVar) {
            if (Q()) {
                j.a aVar = J4.j.f4395g;
                if (aVar.f() != null) {
                    Activity f8 = aVar.f();
                    if (f8 instanceof OldVersionsActivity) {
                        if (((OldVersionsActivity) f8).n2()) {
                            Object g8 = AbstractC3458i.g(C3445b0.c(), new d(f8, str, null), dVar);
                            if (g8 == V5.b.e()) {
                                return g8;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof AppDetailActivity) {
                        AppDetailActivity appDetailActivity = (AppDetailActivity) f8;
                        if (appDetailActivity.n2()) {
                            Object x32 = appDetailActivity.x3(str, dVar);
                            if (x32 == V5.b.e()) {
                                return x32;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof MainActivity) {
                        if (((MainActivity) f8).n2()) {
                            Object g9 = AbstractC3458i.g(C3445b0.c(), new e(f8, str, z8, null), dVar);
                            if (g9 == V5.b.e()) {
                                return g9;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof MyDownloads) {
                        if (((MyDownloads) f8).n2()) {
                            Object g10 = AbstractC3458i.g(C3445b0.c(), new f(f8, null), dVar);
                            if (g10 == V5.b.e()) {
                                return g10;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof MyApps) {
                        if (((MyApps) f8).n2()) {
                            Object g11 = AbstractC3458i.g(C3445b0.c(), new g(f8, str, null), dVar);
                            if (g11 == V5.b.e()) {
                                return g11;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof Updates) {
                        if (((Updates) f8).n2()) {
                            Object g12 = AbstractC3458i.g(C3445b0.c(), new h(z8, f8, str, null), dVar);
                            if (g12 == V5.b.e()) {
                                return g12;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof FreeUpSpaceActivity) {
                        if (((FreeUpSpaceActivity) f8).n2()) {
                            Object g13 = AbstractC3458i.g(C3445b0.c(), new i(z8, f8, str, null), dVar);
                            if (g13 == V5.b.e()) {
                                return g13;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof AppInstalledDetailsActivity) {
                        if (((AppInstalledDetailsActivity) f8).n2()) {
                            Object g14 = AbstractC3458i.g(C3445b0.c(), new j(z8, f8, null), dVar);
                            if (g14 == V5.b.e()) {
                                return g14;
                            }
                            return I.f8786a;
                        }
                    } else if (f8 instanceof TvAppDetailActivity) {
                        if (((TvAppDetailActivity) f8).k()) {
                            Object g15 = AbstractC3458i.g(C3445b0.c(), new k(f8, str, null), dVar);
                            if (g15 == V5.b.e()) {
                                return g15;
                            }
                            return I.f8786a;
                        }
                    } else if ((f8 instanceof WishlistActivity) && ((WishlistActivity) f8).n2()) {
                        Object g16 = AbstractC3458i.g(C3445b0.c(), new b(f8, str, null), dVar);
                        if (g16 == V5.b.e()) {
                            return g16;
                        }
                        return I.f8786a;
                    }
                    return I.f8786a;
                }
            }
            j.a aVar2 = J4.j.f4395g;
            if (aVar2.f() != null && (aVar2.f() instanceof InstallerActivity)) {
                Activity f9 = aVar2.f();
                AbstractC3292y.g(f9, "null cannot be cast to non-null type com.uptodown.core.activities.InstallerActivity");
                Object g17 = AbstractC3458i.g(C3445b0.b(), new c((InstallerActivity) f9, null), dVar);
                if (g17 == V5.b.e()) {
                    return g17;
                }
                return I.f8786a;
            }
            return I.f8786a;
        }

        public final boolean O(Context context) {
            AbstractC3292y.i(context, "context");
            return W("DownloadUpdatesWorker", context);
        }

        public final boolean P(Q update) {
            boolean z8;
            AbstractC3292y.i(update, "update");
            synchronized (UptodownApp.f29283z0) {
                Iterator it = UptodownApp.f29248A0.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        if (AbstractC3292y.d(((Q) next).b(), update.b())) {
                            z8 = true;
                            break;
                        }
                    } else {
                        z8 = false;
                        break;
                    }
                }
            }
            return z8;
        }

        public final boolean Q() {
            if (UptodownApp.f29270X > UptodownApp.f29271Y) {
                return true;
            }
            return false;
        }

        public final boolean R(String packagename) {
            AbstractC3292y.i(packagename, "packagename");
            synchronized (UptodownApp.f29275r0) {
                if (UptodownApp.f29276s0 != null) {
                    ArrayList arrayList = UptodownApp.f29276s0;
                    AbstractC3292y.f(arrayList);
                    int size = arrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        ArrayList arrayList2 = UptodownApp.f29276s0;
                        AbstractC3292y.f(arrayList2);
                        if (n.s(packagename, ((C2041f) arrayList2.get(i8)).Q(), true)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        public final boolean S() {
            return false;
        }

        public final boolean T(Context context) {
            AbstractC3292y.i(context, "context");
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3292y.h(packageManager, "getPackageManager(...)");
                return new S4.f().r(r.d(packageManager, "com.npg.smarttvnpg", 4096));
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public final boolean U(Context context) {
            AbstractC3292y.i(context, "context");
            Object systemService = context.getSystemService("uimode");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
            if (((UiModeManager) systemService).getCurrentModeType() != 4 && !T(context)) {
                return false;
            }
            return true;
        }

        public final boolean V(String str, Context context) {
            AbstractC3292y.i(context, "context");
            WorkManager workManager = WorkManager.getInstance(context);
            AbstractC3292y.h(workManager, "getInstance(...)");
            AbstractC3292y.f(str);
            InterfaceFutureC4260d workInfosByTag = workManager.getWorkInfosByTag(str);
            AbstractC3292y.h(workInfosByTag, "getWorkInfosByTag(...)");
            Iterator it = ((List) workInfosByTag.get()).iterator();
            while (it.hasNext()) {
                if (((WorkInfo) it.next()).getState() == WorkInfo.State.RUNNING) {
                    return true;
                }
            }
            return false;
        }

        public final boolean W(String str, Context context) {
            if (context != null) {
                WorkManager workManager = WorkManager.getInstance(context);
                AbstractC3292y.h(workManager, "getInstance(...)");
                AbstractC3292y.f(str);
                InterfaceFutureC4260d workInfosByTag = workManager.getWorkInfosByTag(str);
                AbstractC3292y.h(workInfosByTag, "getWorkInfosByTag(...)");
                Iterator it = ((List) workInfosByTag.get()).iterator();
                while (it.hasNext()) {
                    WorkInfo.State state = ((WorkInfo) it.next()).getState();
                    if (state == WorkInfo.State.RUNNING || state == WorkInfo.State.ENQUEUED) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public final void X(File item, Context context, String str) {
            AbstractC3292y.i(item, "item");
            AbstractC3292y.i(context, "context");
            new J4.i(context).a(item, str, new C3784i().z(context));
        }

        public final void Y(File item, Context context, String str) {
            AbstractC3292y.i(item, "item");
            AbstractC3292y.i(context, "context");
            new J4.i(context).c(item, str, new C3784i().z(context));
        }

        public final Bundle a(Activity activity) {
            AbstractC3292y.i(activity, "<this>");
            Bundle bundle = ActivityOptions.makeCustomAnimation(activity, R.anim.left_to_right_in, R.anim.fade_out).toBundle();
            AbstractC3292y.h(bundle, "toBundle(...)");
            return bundle;
        }

        public final boolean a0() {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - UptodownApp.f29278u0 > 600) {
                UptodownApp.f29278u0 = currentTimeMillis;
                return true;
            }
            return false;
        }

        public final ActivityOptionsCompat b(Activity activity) {
            AbstractC3292y.i(activity, "<this>");
            ActivityOptionsCompat makeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(activity, R.anim.left_to_right_in, R.anim.fade_out);
            AbstractC3292y.h(makeCustomAnimation, "makeCustomAnimation(...)");
            return makeCustomAnimation;
        }

        public final void b0(Q update) {
            AbstractC3292y.i(update, "update");
            synchronized (UptodownApp.f29283z0) {
                try {
                    Iterator it = UptodownApp.f29248A0.iterator();
                    int i8 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            int i9 = i8 + 1;
                            if (AbstractC3292y.d(((Q) it.next()).b(), update.b())) {
                                break;
                            } else {
                                i8 = i9;
                            }
                        } else {
                            i8 = -1;
                            break;
                        }
                    }
                    if (i8 >= 0 && i8 < UptodownApp.f29248A0.size()) {
                        UptodownApp.f29248A0.remove(i8);
                    }
                    I i10 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final ArrayList c(C2041f app) {
            ArrayList arrayList;
            AbstractC3292y.i(app, "app");
            synchronized (UptodownApp.f29275r0) {
                try {
                    if (UptodownApp.f29276s0 != null) {
                        ArrayList arrayList2 = UptodownApp.f29276s0;
                        AbstractC3292y.f(arrayList2);
                        arrayList2.add(app);
                    } else {
                        UptodownApp.f29276s0 = new ArrayList();
                        ArrayList arrayList3 = UptodownApp.f29276s0;
                        AbstractC3292y.f(arrayList3);
                        arrayList3.add(app);
                    }
                    arrayList = UptodownApp.f29276s0;
                    AbstractC3292y.f(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return arrayList;
        }

        public final void c0(String packagename, Context context) {
            AbstractC3292y.i(packagename, "packagename");
            AbstractC3292y.i(context, "context");
            if (d0(packagename)) {
                Bundle bundle = new Bundle();
                bundle.putString("packagename", packagename);
                C3770C.f37260a.f().send(106, bundle);
            }
            if (O(context)) {
                DownloadUpdatesWorker.f31198k.a(packagename);
            }
        }

        public final void e(Context context) {
            AbstractC3292y.i(context, "context");
            int i8 = context.getResources().getDisplayMetrics().widthPixels;
            if (!n.s(context.getString(R.string.screen_type), HintConstants.AUTOFILL_HINT_PHONE, true)) {
                i8 = 1024;
            }
            J0((int) (i8 - (4 * context.getResources().getDimension(R.dimen.margin_m))));
            D0((int) (H() / 2.048d));
            C0((int) (i8 / 2.048d));
            float f8 = context.getResources().getDisplayMetrics().density;
            int i9 = context.getResources().getDisplayMetrics().heightPixels;
            float dimension = context.getResources().getDimension(R.dimen.icon_size_xl);
            float dimension2 = context.getResources().getDimension(R.dimen.icon_size_m);
            float dimension3 = context.getResources().getDimension(R.dimen.gallery_height);
            float dimension4 = context.getResources().getDimension(R.dimen.user_avatar_profile_size);
            float dimension5 = context.getResources().getDimension(R.dimen.user_avatar_review_size);
            float dimension6 = context.getResources().getDimension(R.dimen.gallery_feature_horizontal_height);
            UptodownApp.f29250D = s5.i.f39141a.c(context) / f8;
            StringBuilder sb = new StringBuilder();
            sb.append(':');
            sb.append(d(dimension));
            y0(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(':');
            sb2.append(d(dimension2));
            z0(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(':');
            sb3.append(d(dimension4));
            m0(sb3.toString());
            StringBuilder sb4 = new StringBuilder();
            sb4.append(':');
            sb4.append(d(dimension5));
            n0(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append(':');
            sb5.append(d(dimension3));
            H0(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(':');
            sb6.append(d(i9));
            G0(sb6.toString());
            StringBuilder sb7 = new StringBuilder();
            sb7.append(':');
            sb7.append(d(y()));
            w0(sb7.toString());
            StringBuilder sb8 = new StringBuilder();
            sb8.append(':');
            sb8.append(d(z()));
            v0(sb8.toString());
            StringBuilder sb9 = new StringBuilder();
            sb9.append(':');
            sb9.append(d(dimension6));
            x0(sb9.toString());
        }

        public final C4087g e0(Context context) {
            AbstractC3292y.i(context, "context");
            return new C4087g((int) context.getResources().getDimension(R.dimen.border_radius_m), null, 2, 0 == true ? 1 : 0);
        }

        public final boolean f(Context context) {
            AbstractC3292y.i(context, "context");
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            if ((aVar.f(context) == 0 && C3797v.f37313a.f()) || aVar.f(context) == 1) {
                return true;
            }
            return false;
        }

        public final C4087g f0(Context context) {
            AbstractC3292y.i(context, "context");
            int i8 = 2;
            C4087g.a aVar = null;
            byte b9 = 0;
            byte b10 = 0;
            byte b11 = 0;
            if (SettingsPreferences.f30529b.k(context) > 0 && C3797v.f37313a.c()) {
                return new C4087g((int) context.getResources().getDimension(R.dimen.border_radius_m), aVar, i8, b11 == true ? 1 : 0);
            }
            return new C4087g((int) context.getResources().getDimension(R.dimen.border_radius_xs), b10 == true ? 1 : 0, i8, b9 == true ? 1 : 0);
        }

        public final void g() {
            synchronized (UptodownApp.f29275r0) {
                UptodownApp.f29276s0 = null;
                I i8 = I.f8786a;
            }
        }

        public final C4087g g0(Context context) {
            AbstractC3292y.i(context, "context");
            int i8 = 2;
            C4087g.a aVar = null;
            byte b9 = 0;
            byte b10 = 0;
            byte b11 = 0;
            if (SettingsPreferences.f30529b.k(context) > 0 && C3797v.f37313a.c()) {
                return new C4087g((int) context.getResources().getDimension(R.dimen.border_radius_s), aVar, i8, b11 == true ? 1 : 0);
            }
            return new C4087g((int) context.getResources().getDimension(R.dimen.border_radius_xs), b10 == true ? 1 : 0, i8, b9 == true ? 1 : 0);
        }

        public final boolean h() {
            return UptodownApp.f29277t0;
        }

        public final C4087g h0(Context context) {
            AbstractC3292y.i(context, "context");
            return new C4087g((int) context.getResources().getDimension(R.dimen.border_radius_s), null, 2, 0 == true ? 1 : 0);
        }

        public final Object i() {
            return UptodownApp.f29282y0;
        }

        public final void i0(Context context) {
            AbstractC3292y.i(context, "context");
            if (!W("GetUserDataWorker", context)) {
                WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) GetUserDataWorker.class, 24L, TimeUnit.HOURS).addTag("GetUserDataWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
        }

        public final Object j() {
            return UptodownApp.f29280w0;
        }

        public final void j0(Context context) {
            AbstractC3292y.i(context, "context");
            if (!W("PreRegisterWorker", context)) {
                WorkManager.getInstance(context).enqueue(new PeriodicWorkRequest.Builder((Class<? extends ListenableWorker>) PreRegisterWorker.class, 4L, TimeUnit.HOURS).addTag("PreRegisterWorker").setConstraints(new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).build()).build());
            }
        }

        public final Object k() {
            return UptodownApp.f29281x0;
        }

        public final String l() {
            return UptodownApp.f29258L;
        }

        public final void l0(Context context) {
            AbstractC3292y.i(context, "context");
            if (!W("TrackingWorkerPeriodic", context)) {
                k0(context);
            }
        }

        public final String m() {
            return UptodownApp.f29259M;
        }

        public final void m0(String str) {
            UptodownApp.f29258L = str;
        }

        public final h2.e n() {
            return UptodownApp.f29265S;
        }

        public final void n0(String str) {
            UptodownApp.f29259M = str;
        }

        public final h2.e o() {
            return UptodownApp.f29266T;
        }

        public final void o0(h2.e eVar) {
            UptodownApp.f29265S = eVar;
        }

        public final C2047l p() {
            return UptodownApp.f29273p0;
        }

        public final void p0(h2.e eVar) {
            UptodownApp.f29266T = eVar;
        }

        public final String q() {
            return UptodownApp.f29254H;
        }

        public final void q0(boolean z8) {
            UptodownApp.f29272Z = z8;
        }

        public final String r() {
            return UptodownApp.f29253G;
        }

        public final void r0(C2047l c2047l) {
            UptodownApp.f29273p0 = c2047l;
        }

        public final String s() {
            return UptodownApp.f29255I;
        }

        public final void s0(boolean z8) {
            UptodownApp.f29274q0 = z8;
        }

        public final String t() {
            return UptodownApp.f29252F;
        }

        public final void t0(boolean z8) {
            UptodownApp.f29277t0 = z8;
        }

        public final String u() {
            return UptodownApp.f29251E;
        }

        public final void u0(Q update) {
            AbstractC3292y.i(update, "update");
            synchronized (UptodownApp.f29283z0) {
                try {
                    Iterator it = UptodownApp.f29248A0.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            AbstractC3292y.h(next, "next(...)");
                            if (AbstractC3292y.d(((Q) next).b(), update.b())) {
                                break;
                            }
                        } else {
                            UptodownApp.f29248A0.add(update);
                            break;
                        }
                    }
                    I i8 = I.f8786a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final C2041f v() {
            C2041f c2041f;
            synchronized (UptodownApp.f29275r0) {
                if (UptodownApp.f29276s0 != null) {
                    ArrayList arrayList = UptodownApp.f29276s0;
                    AbstractC3292y.f(arrayList);
                    if (arrayList.size() > 0) {
                        ArrayList arrayList2 = UptodownApp.f29276s0;
                        AbstractC3292y.f(arrayList2);
                        c2041f = (C2041f) arrayList2.remove(0);
                    }
                }
                c2041f = null;
            }
            return c2041f;
        }

        public final void v0(String str) {
            UptodownApp.f29254H = str;
        }

        public final ArrayList w() {
            return UptodownApp.f29279v0;
        }

        public final void w0(String str) {
            UptodownApp.f29253G = str;
        }

        public final boolean x() {
            return UptodownApp.f29269W;
        }

        public final void x0(String str) {
            UptodownApp.f29255I = str;
        }

        public final int y() {
            return UptodownApp.f29261O;
        }

        public final void y0(String str) {
            UptodownApp.f29252F = str;
        }

        public final int z() {
            return UptodownApp.f29260N;
        }

        public final void z0(String str) {
            UptodownApp.f29251E = str;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements J {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K4.r f29320b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f29321c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29322d;

        b(K4.r rVar, File file, boolean z8) {
            this.f29320b = rVar;
            this.f29321c = file;
            this.f29322d = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final I d(K4.r rVar, File file, boolean z8) {
            new i(rVar).c(file, null, z8);
            return I.f8786a;
        }

        @Override // b5.J
        public void a() {
        }

        @Override // b5.J
        public void b(c5.J reportVT) {
            AbstractC3292y.i(reportVT, "reportVT");
            if (reportVT.h() > 0) {
                UptodownApp uptodownApp = UptodownApp.this;
                final K4.r rVar = this.f29320b;
                final File file = this.f29321c;
                final boolean z8 = this.f29322d;
                uptodownApp.m1(reportVT, new Function0() { // from class: E4.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        I d8;
                        d8 = UptodownApp.b.d(K4.r.this, file, z8);
                        return d8;
                    }
                }, this.f29320b);
                return;
            }
            new i(this.f29320b).c(this.f29321c, null, this.f29322d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29323a;

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
            if (this.f29323a == 0) {
                t.b(obj);
                C3791p a9 = C3791p.f37286s.a(UptodownApp.this);
                a9.a();
                Iterator it = a9.c0().iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    c5.r rVar = (c5.r) next;
                    if (rVar.Y() == null || rVar.a0() <= 0 || rVar.e0() == 0) {
                        a9.z(rVar);
                    }
                }
                a9.i();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29325a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ K4.r f29326b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UptodownApp f29327c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c5.J f29328d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f29329e;

        /* loaded from: classes4.dex */
        public static final class a extends ClickableSpan {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UptodownApp f29330a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c5.J f29331b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K4.r f29332c;

            a(UptodownApp uptodownApp, c5.J j8, K4.r rVar) {
                this.f29330a = uptodownApp;
                this.f29331b = j8;
                this.f29332c = rVar;
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View widget) {
                AbstractC3292y.i(widget, "widget");
                this.f29330a.r1(this.f29331b.l(), this.f29332c);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                AbstractC3292y.i(ds, "ds");
                super.updateDrawState(ds);
                ds.setColor(ContextCompat.getColor(this.f29332c, R.color.main_blue));
                ds.setTypeface(j.f4395g.u());
                ds.setUnderlineText(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(K4.r rVar, UptodownApp uptodownApp, c5.J j8, Function0 function0, U5.d dVar) {
            super(2, dVar);
            this.f29326b = rVar;
            this.f29327c = uptodownApp;
            this.f29328d = j8;
            this.f29329e = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence q(h hVar) {
            return (CharSequence) hVar.a().get(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(Function0 function0, K4.r rVar, View view) {
            function0.invoke();
            AlertDialog O8 = rVar.O();
            if (O8 != null) {
                O8.dismiss();
            }
            UptodownApp.f29249C.s0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(K4.r rVar, View view) {
            AlertDialog O8 = rVar.O();
            if (O8 != null) {
                O8.dismiss();
            }
            UptodownApp.f29249C.s0(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(UptodownApp uptodownApp, c5.J j8, K4.r rVar, View view) {
            uptodownApp.r1(j8.l(), rVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f29326b, this.f29327c, this.f29328d, this.f29329e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29325a == 0) {
                t.b(obj);
                if (!this.f29326b.isFinishing()) {
                    AlertDialog O8 = this.f29326b.O();
                    if (O8 != null) {
                        O8.dismiss();
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.f29326b);
                    C1529t c8 = C1529t.c(this.f29326b.getLayoutInflater());
                    AbstractC3292y.h(c8, "inflate(...)");
                    final UptodownApp uptodownApp = this.f29327c;
                    final c5.J j8 = this.f29328d;
                    final K4.r rVar = this.f29326b;
                    final Function0 function0 = this.f29329e;
                    c8.f12993f.setTypeface(j.f4395g.v());
                    c8.f12993f.setText(uptodownApp.getString(R.string.positives_detected_in_downloaded_file));
                    String obj2 = c8.f12993f.getText().toString();
                    List<C2051p> d8 = C2051p.f15893f.d(obj2, "\\[xx](.*?)\\[/xx]");
                    SpannableString spannableString = new SpannableString(new l6.j("\\[xx](.*?)\\[/xx]").g(obj2, new Function1() { // from class: com.uptodown.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            CharSequence q8;
                            q8 = UptodownApp.d.q((h) obj3);
                            return q8;
                        }
                    }));
                    for (C2051p c2051p : d8) {
                        SpannableString spannableString2 = spannableString;
                        int R8 = n.R(spannableString, c2051p.d(), 0, false, 6, null);
                        int length = c2051p.d().length() + R8;
                        if (R8 >= 0) {
                            spannableString2.setSpan(new a(uptodownApp, j8, rVar), R8, length, 33);
                        }
                        spannableString = spannableString2;
                    }
                    c8.f12993f.setText(spannableString);
                    c8.f12993f.setMovementMethod(LinkMovementMethod.getInstance());
                    TextView textView = c8.f12995h;
                    j.a aVar = j.f4395g;
                    textView.setTypeface(aVar.u());
                    c8.f12995h.setText(String.valueOf(j8.h()));
                    c8.f12994g.setTypeface(aVar.v());
                    TextView textView2 = c8.f12994g;
                    C3770C c3770c = C3770C.f37260a;
                    Y y8 = Y.f34578a;
                    String string = uptodownApp.getString(R.string.virustotal_report_msg);
                    AbstractC3292y.h(string, "getString(...)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(j8.i())}, 1));
                    AbstractC3292y.h(format, "format(...)");
                    textView2.setText(c3770c.c(format));
                    c8.f12992e.setTypeface(aVar.v());
                    c8.f12992e.setText(uptodownApp.getString(R.string.virustotal_report_previous_scan, j8.f()));
                    c8.f12991d.setTypeface(aVar.u());
                    c8.f12991d.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.b
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.d.r(Function0.this, rVar, view);
                        }
                    });
                    c8.f12990c.setTypeface(aVar.u());
                    c8.f12990c.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.d.u(K4.r.this, view);
                        }
                    });
                    c8.f12989b.setOnClickListener(new View.OnClickListener() { // from class: com.uptodown.d
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UptodownApp.d.v(UptodownApp.this, j8, rVar, view);
                        }
                    });
                    builder.setCancelable(false);
                    builder.setView(c8.getRoot());
                    this.f29326b.p0(builder.create());
                    if (!this.f29326b.isFinishing() && this.f29326b.O() != null) {
                        AlertDialog O9 = this.f29326b.O();
                        AbstractC3292y.f(O9);
                        Window window = O9.getWindow();
                        if (window != null) {
                            window.setBackgroundDrawable(new ColorDrawable(0));
                        }
                        AlertDialog O10 = this.f29326b.O();
                        AbstractC3292y.f(O10);
                        O10.show();
                        UptodownApp.f29249C.s0(true);
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29333a;

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
            int i8 = this.f29333a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                UptodownApp uptodownApp = UptodownApp.this;
                this.f29333a = 1;
                if (uptodownApp.k1(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29335a;

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
            int i8 = this.f29335a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                UptodownApp uptodownApp = UptodownApp.this;
                this.f29335a = 1;
                if (uptodownApp.t1(uptodownApp, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29337a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29338b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, U5.d dVar) {
            super(2, dVar);
            this.f29338b = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f29338b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f29337a == 0) {
                t.b(obj);
                ArrayList C8 = new C3784i().C(this.f29338b);
                new C3784i().f(C8, this.f29338b);
                return new C3784i().g(C8, this.f29338b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k1(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void l1() {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService("notification");
            AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            String string = getString(R.string.app_name);
            AbstractC3292y.h(string, "getString(...)");
            String string2 = getString(R.string.notification_channel_description);
            AbstractC3292y.h(string2, "getString(...)");
            NotificationChannel a9 = androidx.browser.trusted.h.a("CHANNEL_ID_UPTODOWN", string, 3);
            a9.setSound(null, null);
            a9.setDescription(string2);
            a9.enableLights(true);
            ((NotificationManager) systemService).createNotificationChannel(a9);
        }
    }

    private final void n1(boolean z8, String str) {
        Bundle bundle = new Bundle();
        if (z8) {
            bundle.putString("type", "accepted");
        } else {
            bundle.putString("type", "rejected");
        }
        bundle.putString("consent_version", str);
        new C3795t(this).e("user_consent_mintegral", bundle);
    }

    private final void o1() {
        T e8 = T.f15689k.e(this);
        if (e8 == null || !e8.y()) {
            String packageName = getPackageName();
            AbstractC3292y.h(packageName, "getPackageName(...)");
            ChoiceCmp.startChoice$default(this, packageName, "p-PLc5NudJ4X36X", this, null, 16, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1(String str, K4.r rVar) {
        if (str != null && !rVar.isFinishing()) {
            String s8 = new C3784i().s(str);
            String string = rVar.getString(R.string.virustotal_safety_report_title);
            AbstractC3292y.h(string, "getString(...)");
            new C3788m().q(rVar, s8, string);
        }
    }

    private final void s1() {
        AbstractC3458i.d(N.a(C3445b0.b()), null, null, new f(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t1(Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new g(context, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    private final void u1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C2758a c2758a = new C2758a();
        this.f29286z = c2758a;
        registerReceiver(c2758a, intentFilter);
    }

    private final void v1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        C2759b c2759b = new C2759b();
        this.f29285B = c2759b;
        registerReceiver(c2759b, intentFilter);
    }

    private final void w1() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addDataScheme("package");
        C2760c c2760c = new C2760c();
        this.f29284A = c2760c;
        registerReceiver(c2760c, intentFilter);
    }

    private final void x1(Context context) {
        if (!f29249C.W("SearchApksWorker", context)) {
            WorkManager.getInstance(context).enqueue(new OneTimeWorkRequest.Builder(SearchApksWorker.class).addTag("SearchApksWorker").build());
        }
    }

    private final void y1() {
        try {
            C2758a c2758a = this.f29286z;
            if (c2758a != null) {
                unregisterReceiver(c2758a);
                this.f29286z = null;
            }
            C2760c c2760c = this.f29284A;
            if (c2760c != null) {
                unregisterReceiver(c2760c);
                this.f29284A = null;
            }
            C2759b c2759b = this.f29285B;
            if (c2759b != null) {
                unregisterReceiver(c2759b);
                this.f29285B = null;
            }
        } catch (IllegalArgumentException e8) {
            e8.printStackTrace();
        }
    }

    @Override // J4.j
    public void I(File file, O4.f listener, K4.r coreBaseActivity) {
        String str;
        AbstractC3292y.i(file, "file");
        AbstractC3292y.i(listener, "listener");
        AbstractC3292y.i(coreBaseActivity, "coreBaseActivity");
        boolean z8 = new C3784i().z(this);
        T e8 = T.f15689k.e(this);
        C3791p a9 = C3791p.f37286s.a(this);
        a9.a();
        String name = file.getName();
        AbstractC3292y.h(name, "getName(...)");
        c5.r Y8 = a9.Y(name);
        a9.i();
        if (e8 != null && e8.y()) {
            if (Y8 != null) {
                str = Y8.w();
            } else {
                str = null;
            }
            if (str == null || str.length() == 0) {
                new m(this, null, S4.d.f9430a.e(file.getAbsolutePath()), new b(coreBaseActivity, file, z8), N.a(C3445b0.b()));
                return;
            }
        }
        new i(this).c(file, null, z8);
        I i8 = I.f8786a;
    }

    @Override // J4.j
    public void O(String event) {
        AbstractC3292y.i(event, "event");
        Bundle bundle = new Bundle();
        if (event.length() > 30) {
            event = event.substring(0, 30);
            AbstractC3292y.h(event, "substring(...)");
        }
        bundle.putString(CampaignEx.JSON_NATIVE_VIDEO_ERROR, event);
        new C3795t(this).e("nsd", bundle);
    }

    public final void m1(c5.J reportVT, Function0 installAction, K4.r coreBaseActivity) {
        AbstractC3292y.i(reportVT, "reportVT");
        AbstractC3292y.i(installAction, "installAction");
        AbstractC3292y.i(coreBaseActivity, "coreBaseActivity");
        AbstractC3458i.d(LifecycleOwnerKt.getLifecycleScope(coreBaseActivity), C3445b0.c(), null, new d(coreBaseActivity, this, reportVT, installAction, null), 2, null);
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCCPAConsentGiven(String consentString) {
        AbstractC3292y.i(consentString, "consentString");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpError(ChoiceError error) {
        AbstractC3292y.i(error, "error");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpLoaded(PingReturn info) {
        AbstractC3292y.i(info, "info");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onCmpUIShown(PingReturn info) {
        AbstractC3292y.i(info, "info");
    }

    @Override // J4.j, android.app.Application
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        new C3795t(this).b();
        a aVar = f29249C;
        aVar.K(this);
        new C1675b().b();
        new C3799x(this).b();
        u1();
        w1();
        v1();
        int i8 = getResources().getConfiguration().uiMode & 48;
        SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
        String j8 = aVar2.j(this);
        if (n.s(j8, "yes", true)) {
            if (i8 != 32) {
                AppCompatDelegate.setDefaultNightMode(2);
            }
        } else if (n.s(j8, "no", true)) {
            if (i8 != 16) {
                AppCompatDelegate.setDefaultNightMode(1);
            }
        } else {
            AppCompatDelegate.setDefaultNightMode(-1);
        }
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        if (aVar2.p(applicationContext) == null) {
            String language = Locale.getDefault().getLanguage();
            Context applicationContext2 = getApplicationContext();
            AbstractC3292y.h(applicationContext2, "getApplicationContext(...)");
            AbstractC3292y.f(language);
            aVar2.H0(applicationContext2, language);
        }
        s1();
        Context applicationContext3 = getApplicationContext();
        AbstractC3292y.h(applicationContext3, "getApplicationContext(...)");
        if (aVar2.i0(applicationContext3)) {
            Context applicationContext4 = getApplicationContext();
            AbstractC3292y.h(applicationContext4, "getApplicationContext(...)");
            if (633 != aVar2.J(applicationContext4)) {
                Context applicationContext5 = getApplicationContext();
                AbstractC3292y.h(applicationContext5, "getApplicationContext(...)");
                aVar2.Z0(applicationContext5, false);
                Context applicationContext6 = getApplicationContext();
                AbstractC3292y.h(applicationContext6, "getApplicationContext(...)");
                aVar2.e1(applicationContext6, null);
            }
        }
        aVar.e(this);
        l1();
        aVar.l0(this);
        if (T.f15689k.e(this) != null) {
            aVar.j0(this);
            aVar.i0(this);
        }
        L4.a aVar3 = new L4.a(this);
        aVar3.h();
        if (aVar3.l() || aVar3.s()) {
            j.f4395g.L(new ResultReceiverC2765h(null));
        }
        if (aVar3.p()) {
            x1(this);
        }
        V(new ResultReceiverC2764g(null));
        ResultReceiver L8 = L();
        AbstractC3292y.g(L8, "null cannot be cast to non-null type com.uptodown.receivers.InstallerActivityReceiver");
        ((ResultReceiverC2764g) L8).f(getApplicationContext());
        C3800y c3800y = C3800y.f37330a;
        Context applicationContext7 = getApplicationContext();
        AbstractC3292y.h(applicationContext7, "getApplicationContext(...)");
        c3800y.h(applicationContext7);
        j.f4395g.b();
        AbstractC3458i.d(N.a(C3445b0.b()), null, null, new e(null), 3, null);
        new C3774G().d(this);
        o1();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onGoogleBasicConsentChange(GoogleBasicConsents consents) {
        AbstractC3292y.i(consents, "consents");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onGoogleVendorConsentGiven(ACData acData) {
        AbstractC3292y.i(acData, "acData");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onIABVendorConsentGiven(GDPRData gdprData) {
        boolean z8;
        AbstractC3292y.i(gdprData, "gdprData");
        Boolean bool = gdprData.getVendor().getConsents().get("867");
        if (bool != null) {
            z8 = bool.booleanValue();
        } else {
            z8 = false;
        }
        C3774G c3774g = new C3774G();
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "getApplicationContext(...)");
        c3774g.a(applicationContext, z8);
        n1(z8, "gdpr");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onNonIABVendorConsentGiven(NonIABData nonIABData) {
        AbstractC3292y.i(nonIABData, "nonIABData");
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onReceiveUSRegulationsConsent(USRegulationData usRegulationData) {
        boolean z8;
        boolean z9;
        boolean z10;
        AbstractC3292y.i(usRegulationData, "usRegulationData");
        boolean z11 = false;
        if (usRegulationData.getSaleOptOut() == 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (usRegulationData.getSharingOptOut() == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (usRegulationData.getPersonalDataConsents() == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z8 && z9 && z10) {
            z11 = true;
        }
        new C3774G().b(!z11);
        n1(z11, "mspa");
    }

    @Override // android.app.Application
    public void onTerminate() {
        super.onTerminate();
        new C3799x(this).c();
        y1();
    }

    @Override // com.inmobi.cmp.ChoiceCmpCallback
    public void onUserMovedToOtherState() {
    }

    public final void p1() {
        f29271Y++;
    }

    public final void q1() {
        f29270X++;
    }
}
