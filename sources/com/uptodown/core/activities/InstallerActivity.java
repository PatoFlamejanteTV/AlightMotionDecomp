package com.uptodown.core.activities;

import J4.j;
import Q5.I;
import R5.AbstractC1435t;
import S4.s;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import c6.InterfaceC2072n;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.core.view.WrapContentLinearLayoutManager;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;
import kotlin.jvm.internal.Y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.J0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public final class InstallerActivity extends K4.r {

    /* renamed from: q0, reason: collision with root package name */
    public static final a f30868q0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    private TextView f30869A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f30870B;

    /* renamed from: C, reason: collision with root package name */
    private ImageView f30871C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f30872D;

    /* renamed from: E, reason: collision with root package name */
    private String f30873E;

    /* renamed from: F, reason: collision with root package name */
    private ArrayList f30874F;

    /* renamed from: G, reason: collision with root package name */
    private File f30875G;

    /* renamed from: H, reason: collision with root package name */
    private String f30876H;

    /* renamed from: I, reason: collision with root package name */
    private Uri f30877I;

    /* renamed from: J, reason: collision with root package name */
    private S4.x f30878J;

    /* renamed from: K, reason: collision with root package name */
    private String f30879K;

    /* renamed from: L, reason: collision with root package name */
    private AlertDialog f30880L;

    /* renamed from: M, reason: collision with root package name */
    private AlertDialog f30881M;

    /* renamed from: N, reason: collision with root package name */
    private ArrayList f30882N;

    /* renamed from: O, reason: collision with root package name */
    private InterfaceC3488x0 f30883O;

    /* renamed from: P, reason: collision with root package name */
    private O4.h f30884P;

    /* renamed from: Q, reason: collision with root package name */
    private O4.m f30885Q;

    /* renamed from: R, reason: collision with root package name */
    private boolean f30886R;

    /* renamed from: S, reason: collision with root package name */
    private boolean f30887S;

    /* renamed from: T, reason: collision with root package name */
    private String f30888T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f30889U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f30890V;

    /* renamed from: W, reason: collision with root package name */
    private final BroadcastReceiver f30891W = new t();

    /* renamed from: X, reason: collision with root package name */
    private final n f30892X = new n();

    /* renamed from: Y, reason: collision with root package name */
    private final c f30893Y = new c();

    /* renamed from: Z, reason: collision with root package name */
    private final s f30894Z = new s();

    /* renamed from: o, reason: collision with root package name */
    private ProgressBar f30895o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f30896p;

    /* renamed from: p0, reason: collision with root package name */
    private final ActivityResultLauncher f30897p0;

    /* renamed from: q, reason: collision with root package name */
    private TextView f30898q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f30899r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f30900s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f30901t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f30902u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f30903v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f30904w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f30905x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f30906y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f30907z;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f30908a;

        /* renamed from: b, reason: collision with root package name */
        private String f30909b;

        /* renamed from: c, reason: collision with root package name */
        private File f30910c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f30911d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private ArrayList f30912e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        private ArrayList f30913f = new ArrayList();

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f30914g = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            public static final a f30916a = new a();

            a() {
                super(2);
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(P4.e o12, P4.e o22) {
                AbstractC3292y.i(o12, "o1");
                AbstractC3292y.i(o22, "o2");
                return Integer.valueOf(Boolean.compare(!o12.a(), !o22.a()));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.uptodown.core.activities.InstallerActivity$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0707b extends AbstractC3293z implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            public static final C0707b f30917a = new C0707b();

            C0707b() {
                super(2);
            }

            @Override // c6.InterfaceC2072n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(P4.e o12, P4.e o22) {
                AbstractC3292y.i(o12, "o1");
                AbstractC3292y.i(o22, "o2");
                return Integer.valueOf(Boolean.compare(!o12.a(), !o22.a()));
            }
        }

        public b() {
        }

        private final void o() {
            AbstractC1435t.B(this.f30911d, new Comparator() { // from class: K4.C0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int p8;
                    p8 = InstallerActivity.b.p((P4.e) obj, (P4.e) obj2);
                    return p8;
                }
            });
            AbstractC1435t.B(this.f30911d, new Comparator() { // from class: K4.D0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int q8;
                    q8 = InstallerActivity.b.q((P4.e) obj, (P4.e) obj2);
                    return q8;
                }
            });
            AbstractC1435t.B(this.f30912e, new Comparator() { // from class: K4.E0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int r8;
                    r8 = InstallerActivity.b.r((P4.e) obj, (P4.e) obj2);
                    return r8;
                }
            });
            ArrayList arrayList = this.f30912e;
            final a aVar = a.f30916a;
            AbstractC1435t.B(arrayList, new Comparator() { // from class: K4.F0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int s8;
                    s8 = InstallerActivity.b.s(InterfaceC2072n.this, obj, obj2);
                    return s8;
                }
            });
            AbstractC1435t.B(this.f30913f, new Comparator() { // from class: K4.G0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int t8;
                    t8 = InstallerActivity.b.t((P4.e) obj, (P4.e) obj2);
                    return t8;
                }
            });
            ArrayList arrayList2 = this.f30913f;
            final C0707b c0707b = C0707b.f30917a;
            AbstractC1435t.B(arrayList2, new Comparator() { // from class: K4.H0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int u8;
                    u8 = InstallerActivity.b.u(InterfaceC2072n.this, obj, obj2);
                    return u8;
                }
            });
            AbstractC1435t.B(this.f30914g, new Comparator() { // from class: K4.I0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int v8;
                    v8 = InstallerActivity.b.v((P4.e) obj, (P4.e) obj2);
                    return v8;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int p(P4.e o12, P4.e o22) {
            AbstractC3292y.i(o12, "o1");
            AbstractC3292y.i(o22, "o2");
            if (o12.d() == null) {
                return 1;
            }
            if (o22.d() == null) {
                return -1;
            }
            File d8 = o12.d();
            AbstractC3292y.f(d8);
            String name = d8.getName();
            AbstractC3292y.h(name, "o1.file!!.name");
            File d9 = o22.d();
            AbstractC3292y.f(d9);
            String name2 = d9.getName();
            AbstractC3292y.h(name2, "o2.file!!.name");
            return l6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int q(P4.e o12, P4.e o22) {
            AbstractC3292y.i(o12, "o1");
            AbstractC3292y.i(o22, "o2");
            if (o12.d() == null) {
                return 1;
            }
            if (o22.d() == null) {
                return -1;
            }
            return Boolean.compare(!o12.a(), !o22.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int r(P4.e d12, P4.e d22) {
            AbstractC3292y.i(d12, "d1");
            AbstractC3292y.i(d22, "d2");
            if (d12.d() == null) {
                return 1;
            }
            if (d22.d() == null) {
                return -1;
            }
            File d8 = d12.d();
            AbstractC3292y.f(d8);
            String name = d8.getName();
            AbstractC3292y.h(name, "d1.file!!.name");
            File d9 = d22.d();
            AbstractC3292y.f(d9);
            String name2 = d9.getName();
            AbstractC3292y.h(name2, "d2.file!!.name");
            return l6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int s(InterfaceC2072n tmp0, Object obj, Object obj2) {
            AbstractC3292y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int t(P4.e d12, P4.e d22) {
            AbstractC3292y.i(d12, "d1");
            AbstractC3292y.i(d22, "d2");
            if (d12.d() == null) {
                return 1;
            }
            if (d22.d() == null) {
                return -1;
            }
            File d8 = d12.d();
            AbstractC3292y.f(d8);
            String name = d8.getName();
            AbstractC3292y.h(name, "d1.file!!.name");
            File d9 = d22.d();
            AbstractC3292y.f(d9);
            String name2 = d9.getName();
            AbstractC3292y.h(name2, "d2.file!!.name");
            return l6.n.m(name, name2, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int u(InterfaceC2072n tmp0, Object obj, Object obj2) {
            AbstractC3292y.i(tmp0, "$tmp0");
            return ((Number) tmp0.invoke(obj, obj2)).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int v(P4.e f12, P4.e f22) {
            AbstractC3292y.i(f12, "f1");
            AbstractC3292y.i(f22, "f2");
            if (f12.d() == null) {
                return 1;
            }
            if (f22.d() == null) {
                return -1;
            }
            File d8 = f12.d();
            AbstractC3292y.f(d8);
            String name = d8.getName();
            AbstractC3292y.h(name, "f1.file!!.name");
            File d9 = f22.d();
            AbstractC3292y.f(d9);
            String name2 = d9.getName();
            AbstractC3292y.h(name2, "f2.file!!.name");
            return l6.n.m(name, name2, true);
        }

        private final void x() {
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            AbstractC3292y.h(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            boolean z8 = false;
            for (String str : SUPPORTED_ABIS) {
                Iterator it = this.f30911d.iterator();
                while (it.hasNext()) {
                    P4.e eVar = (P4.e) it.next();
                    if (eVar.e() != null) {
                        String e8 = eVar.e();
                        AbstractC3292y.f(e8);
                        if (l6.n.s(str, new l6.j("_").f(e8, "-"), true)) {
                            if (!z8) {
                                eVar.f(true);
                                z8 = true;
                            }
                            eVar.g(true);
                        }
                    }
                }
            }
        }

        public final ArrayList h() {
            return this.f30911d;
        }

        public final File i() {
            return this.f30910c;
        }

        public final ArrayList j() {
            return this.f30912e;
        }

        public final ArrayList k() {
            return this.f30914g;
        }

        public final ArrayList l() {
            return this.f30913f;
        }

        public final String m() {
            return this.f30908a;
        }

        public final String n() {
            return this.f30909b;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0196. Please report as an issue. */
        public final void w(ArrayList files) {
            AbstractC3292y.i(files, "files");
            String string = InstallerActivity.this.getString(J4.h.f4327E);
            AbstractC3292y.h(string, "getString(R.string.dpi_device)");
            this.f30911d = new ArrayList();
            this.f30912e = new ArrayList();
            this.f30913f = new ArrayList();
            this.f30914g = new ArrayList();
            String B12 = InstallerActivity.this.B1();
            PackageManager pm = InstallerActivity.this.getPackageManager();
            Iterator it = files.iterator();
            while (true) {
                int i8 = 0;
                if (it.hasNext()) {
                    File file = (File) it.next();
                    AbstractC3292y.h(pm, "pm");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3292y.h(absolutePath, "file.absolutePath");
                    PackageInfo c8 = S4.r.c(pm, absolutePath, 128);
                    if (c8 != null && this.f30910c == null) {
                        try {
                            if (c8.applicationInfo != null) {
                                this.f30908a = c8.packageName;
                                this.f30909b = c8.versionName + '(' + new S4.f().m(c8) + ')';
                                if (new S4.e().k(c8)) {
                                    this.f30910c = file;
                                } else {
                                    String f8 = new S4.a().f(file.getAbsolutePath());
                                    if (f8 != null && l6.n.G(f8, "name=\"com.android.vending.splits\"", false, 2, null)) {
                                        this.f30910c = file;
                                    } else {
                                        P4.e eVar = new P4.e();
                                        eVar.i(file);
                                        eVar.j(file.getName());
                                        eVar.h(file.getName());
                                        eVar.f(true);
                                        eVar.g(true);
                                        this.f30914g.add(eVar);
                                    }
                                }
                            }
                        } catch (Exception e8) {
                            e8.printStackTrace();
                        }
                    } else {
                        String f9 = new S4.a().f(file.getAbsolutePath());
                        if (f9 != null) {
                            if (l6.n.G(f9, "isFeatureSplit=\"resourceID 0xffffffff\"", false, 2, null)) {
                                P4.e eVar2 = new P4.e();
                                eVar2.i(file);
                                eVar2.j("");
                                eVar2.h(file.getName());
                                eVar2.f(true);
                                eVar2.g(true);
                                this.f30914g.add(eVar2);
                            } else if (l6.n.G(f9, "configForSplit=", false, 2, null) && !l6.n.G(f9, "configForSplit=\"\"", false, 2, null)) {
                                String name = file.getName();
                                AbstractC3292y.h(name, "file.name");
                                P4.e eVar3 = new P4.e();
                                eVar3.i(file);
                                eVar3.j(name);
                                eVar3.h(file.getName());
                                eVar3.f(true);
                                eVar3.g(true);
                                this.f30914g.add(eVar3);
                            } else if (l6.n.G(f9, "split=\"config.", false, 2, null)) {
                                String substring = f9.substring(l6.n.R(f9, "split=\"config.", 0, false, 6, null) + 14);
                                AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                                String substring2 = substring.substring(0, l6.n.R(substring, "\"", 0, false, 6, null));
                                AbstractC3292y.h(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                switch (substring2.hashCode()) {
                                    case -1619189395:
                                        if (!substring2.equals("xxxhdpi")) {
                                            P4.e eVar4 = new P4.e();
                                            try {
                                                Locale build = new Locale.Builder().setLanguage(substring2).build();
                                                eVar4.h(build.getDisplayLanguage(build));
                                            } catch (Exception e9) {
                                                e9.printStackTrace();
                                            }
                                            eVar4.i(file);
                                            eVar4.j(substring2);
                                            eVar4.f(l6.n.s(substring2, B12, true));
                                            eVar4.g(true);
                                            this.f30913f.add(eVar4);
                                            break;
                                        } else {
                                            P4.e eVar5 = new P4.e();
                                            eVar5.i(file);
                                            eVar5.j(substring2);
                                            eVar5.h(substring2);
                                            eVar5.f(l6.n.s(substring2, string, true));
                                            eVar5.g(true);
                                            this.f30912e.add(eVar5);
                                            break;
                                        }
                                    case -1073971299:
                                        if (substring2.equals("mips64")) {
                                            P4.e eVar6 = new P4.e();
                                            eVar6.i(file);
                                            eVar6.j(substring2);
                                            eVar6.h(substring2);
                                            this.f30911d.add(eVar6);
                                            break;
                                        } else {
                                            P4.e eVar42 = new P4.e();
                                            Locale build2 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar42.h(build2.getDisplayLanguage(build2));
                                            eVar42.i(file);
                                            eVar42.j(substring2);
                                            eVar42.f(l6.n.s(substring2, B12, true));
                                            eVar42.g(true);
                                            this.f30913f.add(eVar42);
                                            break;
                                        }
                                    case -806050265:
                                        if (substring2.equals("x86_64")) {
                                            P4.e eVar62 = new P4.e();
                                            eVar62.i(file);
                                            eVar62.j(substring2);
                                            eVar62.h(substring2);
                                            this.f30911d.add(eVar62);
                                            break;
                                        } else {
                                            P4.e eVar422 = new P4.e();
                                            Locale build22 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar422.h(build22.getDisplayLanguage(build22));
                                            eVar422.i(file);
                                            eVar422.j(substring2);
                                            eVar422.f(l6.n.s(substring2, B12, true));
                                            eVar422.g(true);
                                            this.f30913f.add(eVar422);
                                            break;
                                        }
                                    case -745448715:
                                        if (!substring2.equals("xxhdpi")) {
                                            P4.e eVar4222 = new P4.e();
                                            Locale build222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar4222.h(build222.getDisplayLanguage(build222));
                                            eVar4222.i(file);
                                            eVar4222.j(substring2);
                                            eVar4222.f(l6.n.s(substring2, B12, true));
                                            eVar4222.g(true);
                                            this.f30913f.add(eVar4222);
                                            break;
                                        } else {
                                            P4.e eVar52 = new P4.e();
                                            eVar52.i(file);
                                            eVar52.j(substring2);
                                            eVar52.h(substring2);
                                            eVar52.f(l6.n.s(substring2, string, true));
                                            eVar52.g(true);
                                            this.f30912e.add(eVar52);
                                            break;
                                        }
                                    case -738963905:
                                        if (substring2.equals("armeabi")) {
                                            P4.e eVar622 = new P4.e();
                                            eVar622.i(file);
                                            eVar622.j(substring2);
                                            eVar622.h(substring2);
                                            this.f30911d.add(eVar622);
                                            break;
                                        } else {
                                            P4.e eVar42222 = new P4.e();
                                            Locale build2222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar42222.h(build2222.getDisplayLanguage(build2222));
                                            eVar42222.i(file);
                                            eVar42222.j(substring2);
                                            eVar42222.f(l6.n.s(substring2, B12, true));
                                            eVar42222.g(true);
                                            this.f30913f.add(eVar42222);
                                            break;
                                        }
                                    case 117110:
                                        if (substring2.equals("x86")) {
                                            P4.e eVar6222 = new P4.e();
                                            eVar6222.i(file);
                                            eVar6222.j(substring2);
                                            eVar6222.h(substring2);
                                            this.f30911d.add(eVar6222);
                                            break;
                                        } else {
                                            P4.e eVar422222 = new P4.e();
                                            Locale build22222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar422222.h(build22222.getDisplayLanguage(build22222));
                                            eVar422222.i(file);
                                            eVar422222.j(substring2);
                                            eVar422222.f(l6.n.s(substring2, B12, true));
                                            eVar422222.g(true);
                                            this.f30913f.add(eVar422222);
                                            break;
                                        }
                                    case 3197941:
                                        if (!substring2.equals("hdpi")) {
                                            P4.e eVar4222222 = new P4.e();
                                            Locale build222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar4222222.h(build222222.getDisplayLanguage(build222222));
                                            eVar4222222.i(file);
                                            eVar4222222.j(substring2);
                                            eVar4222222.f(l6.n.s(substring2, B12, true));
                                            eVar4222222.g(true);
                                            this.f30913f.add(eVar4222222);
                                            break;
                                        } else {
                                            P4.e eVar522 = new P4.e();
                                            eVar522.i(file);
                                            eVar522.j(substring2);
                                            eVar522.h(substring2);
                                            eVar522.f(l6.n.s(substring2, string, true));
                                            eVar522.g(true);
                                            this.f30912e.add(eVar522);
                                            break;
                                        }
                                    case 3317105:
                                        if (!substring2.equals("ldpi")) {
                                            P4.e eVar42222222 = new P4.e();
                                            Locale build2222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar42222222.h(build2222222.getDisplayLanguage(build2222222));
                                            eVar42222222.i(file);
                                            eVar42222222.j(substring2);
                                            eVar42222222.f(l6.n.s(substring2, B12, true));
                                            eVar42222222.g(true);
                                            this.f30913f.add(eVar42222222);
                                            break;
                                        } else {
                                            P4.e eVar5222 = new P4.e();
                                            eVar5222.i(file);
                                            eVar5222.j(substring2);
                                            eVar5222.h(substring2);
                                            eVar5222.f(l6.n.s(substring2, string, true));
                                            eVar5222.g(true);
                                            this.f30912e.add(eVar5222);
                                            break;
                                        }
                                    case 3346896:
                                        if (!substring2.equals("mdpi")) {
                                            P4.e eVar422222222 = new P4.e();
                                            Locale build22222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar422222222.h(build22222222.getDisplayLanguage(build22222222));
                                            eVar422222222.i(file);
                                            eVar422222222.j(substring2);
                                            eVar422222222.f(l6.n.s(substring2, B12, true));
                                            eVar422222222.g(true);
                                            this.f30913f.add(eVar422222222);
                                            break;
                                        } else {
                                            P4.e eVar52222 = new P4.e();
                                            eVar52222.i(file);
                                            eVar52222.j(substring2);
                                            eVar52222.h(substring2);
                                            eVar52222.f(l6.n.s(substring2, string, true));
                                            eVar52222.g(true);
                                            this.f30912e.add(eVar52222);
                                            break;
                                        }
                                    case 3351711:
                                        if (substring2.equals("mips")) {
                                            P4.e eVar62222 = new P4.e();
                                            eVar62222.i(file);
                                            eVar62222.j(substring2);
                                            eVar62222.h(substring2);
                                            this.f30911d.add(eVar62222);
                                            break;
                                        } else {
                                            P4.e eVar4222222222 = new P4.e();
                                            Locale build222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar4222222222.h(build222222222.getDisplayLanguage(build222222222));
                                            eVar4222222222.i(file);
                                            eVar4222222222.j(substring2);
                                            eVar4222222222.f(l6.n.s(substring2, B12, true));
                                            eVar4222222222.g(true);
                                            this.f30913f.add(eVar4222222222);
                                            break;
                                        }
                                    case 110743451:
                                        if (!substring2.equals("tvdpi")) {
                                            P4.e eVar42222222222 = new P4.e();
                                            Locale build2222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar42222222222.h(build2222222222.getDisplayLanguage(build2222222222));
                                            eVar42222222222.i(file);
                                            eVar42222222222.j(substring2);
                                            eVar42222222222.f(l6.n.s(substring2, B12, true));
                                            eVar42222222222.g(true);
                                            this.f30913f.add(eVar42222222222);
                                            break;
                                        } else {
                                            P4.e eVar522222 = new P4.e();
                                            eVar522222.i(file);
                                            eVar522222.j(substring2);
                                            eVar522222.h(substring2);
                                            eVar522222.f(l6.n.s(substring2, string, true));
                                            eVar522222.g(true);
                                            this.f30912e.add(eVar522222);
                                            break;
                                        }
                                    case 114020461:
                                        if (!substring2.equals("xhdpi")) {
                                            P4.e eVar422222222222 = new P4.e();
                                            Locale build22222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar422222222222.h(build22222222222.getDisplayLanguage(build22222222222));
                                            eVar422222222222.i(file);
                                            eVar422222222222.j(substring2);
                                            eVar422222222222.f(l6.n.s(substring2, B12, true));
                                            eVar422222222222.g(true);
                                            this.f30913f.add(eVar422222222222);
                                            break;
                                        } else {
                                            P4.e eVar5222222 = new P4.e();
                                            eVar5222222.i(file);
                                            eVar5222222.j(substring2);
                                            eVar5222222.h(substring2);
                                            eVar5222222.f(l6.n.s(substring2, string, true));
                                            eVar5222222.g(true);
                                            this.f30912e.add(eVar5222222);
                                            break;
                                        }
                                    case 146933760:
                                        if (substring2.equals("armeabi_v7a")) {
                                            P4.e eVar622222 = new P4.e();
                                            eVar622222.i(file);
                                            eVar622222.j(substring2);
                                            eVar622222.h(substring2);
                                            this.f30911d.add(eVar622222);
                                            break;
                                        } else {
                                            P4.e eVar4222222222222 = new P4.e();
                                            Locale build222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar4222222222222.h(build222222222222.getDisplayLanguage(build222222222222));
                                            eVar4222222222222.i(file);
                                            eVar4222222222222.j(substring2);
                                            eVar4222222222222.f(l6.n.s(substring2, B12, true));
                                            eVar4222222222222.g(true);
                                            this.f30913f.add(eVar4222222222222);
                                            break;
                                        }
                                    case 1433054842:
                                        if (substring2.equals("arm64_v8a")) {
                                            P4.e eVar6222222 = new P4.e();
                                            eVar6222222.i(file);
                                            eVar6222222.j(substring2);
                                            eVar6222222.h(substring2);
                                            this.f30911d.add(eVar6222222);
                                            break;
                                        } else {
                                            P4.e eVar42222222222222 = new P4.e();
                                            Locale build2222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                            eVar42222222222222.h(build2222222222222.getDisplayLanguage(build2222222222222));
                                            eVar42222222222222.i(file);
                                            eVar42222222222222.j(substring2);
                                            eVar42222222222222.f(l6.n.s(substring2, B12, true));
                                            eVar42222222222222.g(true);
                                            this.f30913f.add(eVar42222222222222);
                                            break;
                                        }
                                    default:
                                        P4.e eVar422222222222222 = new P4.e();
                                        Locale build22222222222222 = new Locale.Builder().setLanguage(substring2).build();
                                        eVar422222222222222.h(build22222222222222.getDisplayLanguage(build22222222222222));
                                        eVar422222222222222.i(file);
                                        eVar422222222222222.j(substring2);
                                        eVar422222222222222.f(l6.n.s(substring2, B12, true));
                                        eVar422222222222222.g(true);
                                        this.f30913f.add(eVar422222222222222);
                                        break;
                                }
                            } else {
                                String name2 = file.getName();
                                AbstractC3292y.h(name2, "file.name");
                                P4.e eVar7 = new P4.e();
                                eVar7.i(file);
                                eVar7.j(name2);
                                eVar7.h(file.getName());
                                eVar7.f(true);
                                eVar7.g(true);
                                this.f30914g.add(eVar7);
                            }
                        }
                    }
                } else {
                    if (this.f30910c == null) {
                        Iterator it2 = this.f30914g.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                int i9 = i8 + 1;
                                P4.e eVar8 = (P4.e) it2.next();
                                File d8 = eVar8.d();
                                AbstractC3292y.f(d8);
                                if (d8.getName().equals("base.apk")) {
                                    this.f30910c = eVar8.d();
                                } else {
                                    i8 = i9;
                                }
                            } else {
                                i8 = -1;
                            }
                        }
                        if (i8 >= 0) {
                            this.f30914g.remove(i8);
                        }
                    }
                    x();
                    o();
                    return;
                }
            }
        }

        public final ArrayList y() {
            ArrayList arrayList = new ArrayList();
            File file = this.f30910c;
            if (file != null) {
                AbstractC3292y.f(file);
                arrayList.add(file);
            }
            Iterator it = this.f30911d.iterator();
            while (it.hasNext()) {
                P4.e eVar = (P4.e) it.next();
                if (eVar.a()) {
                    File d8 = eVar.d();
                    AbstractC3292y.f(d8);
                    arrayList.add(d8);
                }
            }
            Iterator it2 = this.f30912e.iterator();
            while (it2.hasNext()) {
                P4.e eVar2 = (P4.e) it2.next();
                if (eVar2.a()) {
                    File d9 = eVar2.d();
                    AbstractC3292y.f(d9);
                    arrayList.add(d9);
                }
            }
            Iterator it3 = this.f30913f.iterator();
            while (it3.hasNext()) {
                P4.e eVar3 = (P4.e) it3.next();
                if (eVar3.a()) {
                    File d10 = eVar3.d();
                    AbstractC3292y.f(d10);
                    arrayList.add(d10);
                }
            }
            Iterator it4 = this.f30914g.iterator();
            while (it4.hasNext()) {
                P4.e eVar4 = (P4.e) it4.next();
                if (eVar4.a()) {
                    File d11 = eVar4.d();
                    AbstractC3292y.f(d11);
                    arrayList.add(d11);
                }
            }
            return arrayList;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c implements O4.a {
        c() {
        }

        @Override // O4.a
        public void a(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.c2();
        }

        @Override // O4.a
        public void b(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.finish();
        }

        @Override // O4.a
        public void c(String filename, String str) {
            AbstractC3292y.i(filename, "filename");
            if (str != null) {
                InstallerActivity.this.b2(str);
                return;
            }
            InstallerActivity installerActivity = InstallerActivity.this;
            String string = installerActivity.getString(J4.h.f4332J);
            AbstractC3292y.h(string, "getString(R.string.error_unknown)");
            installerActivity.b2(string);
        }

        @Override // O4.a
        public void d(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.b2(filename + " could not be parsed.");
        }

        @Override // O4.a
        public void e(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.b2("invalid version code");
        }

        @Override // O4.a
        public void f(String str) {
            InstallerActivity.this.b2("error: not system permissions");
        }
    }

    /* loaded from: classes5.dex */
    public static final class d implements O4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30919a;

        d(b bVar) {
            this.f30919a = bVar;
        }

        @Override // O4.l
        public void a(View view, int i8) {
            ((P4.e) this.f30919a.h().get(i8)).f(!((P4.e) this.f30919a.h().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements O4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30920a;

        e(b bVar) {
            this.f30920a = bVar;
        }

        @Override // O4.l
        public void a(View view, int i8) {
            ((P4.e) this.f30920a.j().get(i8)).f(!((P4.e) this.f30920a.j().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class f implements O4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30921a;

        f(b bVar) {
            this.f30921a = bVar;
        }

        @Override // O4.l
        public void a(View view, int i8) {
            ((P4.e) this.f30921a.k().get(i8)).f(!((P4.e) this.f30921a.k().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class g implements O4.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f30922a;

        g(b bVar) {
            this.f30922a = bVar;
        }

        @Override // O4.l
        public void a(View view, int i8) {
            ((P4.e) this.f30922a.l().get(i8)).f(!((P4.e) this.f30922a.l().get(i8)).a());
        }
    }

    /* loaded from: classes5.dex */
    public static final class h implements O4.h {
        h() {
        }

        @Override // O4.h
        public void a() {
            IntentFilter intentFilter = new IntentFilter("com.uptodown.core.custom_action_installation_status");
            InstallerActivity installerActivity = InstallerActivity.this;
            ContextCompat.registerReceiver(installerActivity, installerActivity.f30891W, intentFilter, 2);
            InstallerActivity.this.c2();
        }

        @Override // O4.h
        public void b(String str) {
            InstallerActivity.this.N1(str);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i implements O4.m {
        i() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l(InstallerActivity this$0, View view) {
            AbstractC3292y.i(this$0, "this$0");
            this$0.finish();
        }

        @Override // O4.m
        public void a(File fileZipped, ArrayList files) {
            AbstractC3292y.i(fileZipped, "fileZipped");
            AbstractC3292y.i(files, "files");
            if (new L4.a(InstallerActivity.this).r()) {
                InstallerActivity.this.y1(fileZipped, files);
                return;
            }
            b bVar = new b();
            bVar.w(files);
            ArrayList y8 = bVar.y();
            InstallerActivity installerActivity = InstallerActivity.this;
            installerActivity.L1(installerActivity, y8);
        }

        @Override // O4.m
        public void b(File file) {
            AbstractC3292y.i(file, "file");
            InstallerActivity installerActivity = InstallerActivity.this;
            installerActivity.K1(installerActivity, file);
        }

        @Override // O4.m
        public void c(int i8) {
            ProgressBar progressBar = InstallerActivity.this.f30895o;
            if (progressBar != null) {
                progressBar.setProgress(i8);
            }
            TextView textView = InstallerActivity.this.f30896p;
            if (textView != null) {
                Y y8 = Y.f34578a;
                String format = String.format("%s%%", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3292y.h(format, "format(format, *args)");
                textView.setText(format);
            }
        }

        @Override // O4.m
        public void d(File file) {
            if (file != null) {
                S4.f fVar = new S4.f();
                InstallerActivity installerActivity = InstallerActivity.this;
                String absolutePath = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath, "file.absolutePath");
                Drawable h8 = fVar.h(installerActivity, absolutePath);
                ImageView imageView = InstallerActivity.this.f30871C;
                if (imageView != null) {
                    imageView.setImageDrawable(h8);
                }
                InstallerActivity.this.f30875G = file;
            }
        }

        @Override // O4.m
        public void e(File file) {
            if (InstallerActivity.this.f30874F == null) {
                InstallerActivity.this.f30874F = new ArrayList();
            }
            ArrayList arrayList = InstallerActivity.this.f30874F;
            AbstractC3292y.f(arrayList);
            arrayList.add(file);
            c(0);
            TextView textView = InstallerActivity.this.f30907z;
            if (textView != null) {
                textView.setText(J4.h.f4386s0);
            }
        }

        @Override // O4.m
        public void f() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f30907z;
            if (textView != null) {
                textView.setText(J4.h.f4330H);
            }
        }

        @Override // O4.m
        public void g() {
            c(0);
            TextView textView = InstallerActivity.this.f30907z;
            if (textView != null) {
                textView.setText(J4.h.f4384r0);
            }
        }

        @Override // O4.m
        public void h() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f30898q;
            if (textView != null) {
                InstallerActivity installerActivity = InstallerActivity.this;
                textView.setText(installerActivity.getString(J4.h.f4391x, installerActivity.getString(J4.h.f4353c)));
            }
            TextView textView2 = InstallerActivity.this.f30898q;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            TextView textView3 = InstallerActivity.this.f30870B;
            if (textView3 != null) {
                final InstallerActivity installerActivity2 = InstallerActivity.this;
                textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.J0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.i.l(InstallerActivity.this, view);
                    }
                });
            }
        }

        @Override // O4.m
        public void i() {
            TextView textView = InstallerActivity.this.f30907z;
            if (textView != null) {
                textView.setText(J4.h.f4333K);
            }
        }

        @Override // O4.m
        public void j() {
            InstallerActivity.this.getWindow().clearFlags(128);
            TextView textView = InstallerActivity.this.f30898q;
            if (textView != null) {
                InstallerActivity installerActivity = InstallerActivity.this;
                textView.setText(installerActivity.getString(J4.h.f4348Z, installerActivity.getString(J4.h.f4353c)));
            }
            InstallerActivity.this.J();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30925a;

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
            int i8 = this.f30925a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                this.f30925a = 1;
                if (installerActivity.V1(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((j) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30927a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Uri f30929c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f30930d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Uri uri, String str, U5.d dVar) {
            super(2, dVar);
            this.f30929c = uri;
            this.f30930d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(this.f30929c, this.f30930d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30927a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                Uri uri = this.f30929c;
                String str = this.f30930d;
                this.f30927a = 1;
                if (installerActivity.Z1(uri, str, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30931a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30933c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, U5.d dVar) {
            super(2, dVar);
            this.f30933c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new l(this.f30933c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30931a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                String str = this.f30933c;
                this.f30931a = 1;
                if (installerActivity.i2(str, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((l) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30934a;

        /* renamed from: b, reason: collision with root package name */
        int f30935b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30937a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30938b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f30939c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f30938b = installerActivity;
                this.f30939c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30938b, this.f30939c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30937a == 0) {
                    Q5.t.b(obj);
                    TextView textView = this.f30938b.f30898q;
                    if (textView != null) {
                        ArrayList arrayList = this.f30938b.f30882N;
                        AbstractC3292y.f(arrayList);
                        textView.setText((CharSequence) arrayList.get(this.f30939c.f34571a));
                    }
                    TextView textView2 = this.f30938b.f30898q;
                    if (textView2 != null) {
                        textView2.setVisibility(0);
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        m(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new m(dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004d A[Catch: Exception -> 0x0012, LOOP:0: B:10:0x0049->B:12:0x004d, LOOP_END, TryCatch #0 {Exception -> 0x0012, blocks: (B:6:0x000d, B:8:0x007b, B:9:0x002f, B:10:0x0049, B:12:0x004d, B:14:0x0063, B:23:0x001f), top: B:2:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[EDGE_INSN: B:13:0x0063->B:14:0x0063 BREAK  A[LOOP:0: B:10:0x0049->B:12:0x004d], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007a -> B:8:0x007b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r7.f30935b
                r2 = 1
                if (r1 == 0) goto L1c
                if (r1 != r2) goto L14
                int r1 = r7.f30934a
                Q5.t.b(r8)     // Catch: java.lang.Exception -> L12
                r8 = r1
                goto L7b
            L12:
                r8 = move-exception
                goto L81
            L14:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1c:
                Q5.t.b(r8)
                com.uptodown.core.activities.InstallerActivity r8 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r8 = com.uptodown.core.activities.InstallerActivity.Q0(r8)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3292y.f(r8)     // Catch: java.lang.Exception -> L12
                int r8 = r8.size()     // Catch: java.lang.Exception -> L12
                if (r8 <= 0) goto L84
                r8 = -1
            L2f:
                kotlin.jvm.internal.Q r1 = new kotlin.jvm.internal.Q     // Catch: java.lang.Exception -> L12
                r1.<init>()     // Catch: java.lang.Exception -> L12
                g6.c$a r3 = g6.AbstractC2923c.f32467a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r4 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r4 = com.uptodown.core.activities.InstallerActivity.Q0(r4)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3292y.f(r4)     // Catch: java.lang.Exception -> L12
                int r4 = r4.size()     // Catch: java.lang.Exception -> L12
                int r3 = r3.c(r4)     // Catch: java.lang.Exception -> L12
                r1.f34571a = r3     // Catch: java.lang.Exception -> L12
            L49:
                int r3 = r1.f34571a     // Catch: java.lang.Exception -> L12
                if (r3 != r8) goto L63
                g6.c$a r3 = g6.AbstractC2923c.f32467a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r4 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                java.util.ArrayList r4 = com.uptodown.core.activities.InstallerActivity.Q0(r4)     // Catch: java.lang.Exception -> L12
                kotlin.jvm.internal.AbstractC3292y.f(r4)     // Catch: java.lang.Exception -> L12
                int r4 = r4.size()     // Catch: java.lang.Exception -> L12
                int r3 = r3.c(r4)     // Catch: java.lang.Exception -> L12
                r1.f34571a = r3     // Catch: java.lang.Exception -> L12
                goto L49
            L63:
                n6.J0 r8 = n6.C3445b0.c()     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity$m$a r4 = new com.uptodown.core.activities.InstallerActivity$m$a     // Catch: java.lang.Exception -> L12
                com.uptodown.core.activities.InstallerActivity r5 = com.uptodown.core.activities.InstallerActivity.this     // Catch: java.lang.Exception -> L12
                r6 = 0
                r4.<init>(r5, r1, r6)     // Catch: java.lang.Exception -> L12
                r7.f30934a = r3     // Catch: java.lang.Exception -> L12
                r7.f30935b = r2     // Catch: java.lang.Exception -> L12
                java.lang.Object r8 = n6.AbstractC3458i.g(r8, r4, r7)     // Catch: java.lang.Exception -> L12
                if (r8 != r0) goto L7a
                return r0
            L7a:
                r8 = r3
            L7b:
                r3 = 7000(0x1b58, double:3.4585E-320)
                java.lang.Thread.sleep(r3)     // Catch: java.lang.Exception -> L12
                goto L2f
            L81:
                r8.printStackTrace()
            L84:
                Q5.I r8 = Q5.I.f8786a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class n extends OnBackPressedCallback {
        n() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            InstallerActivity.this.q1();
        }
    }

    /* loaded from: classes5.dex */
    static final class o extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30941a;

        o(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new o(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30941a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                InstallerActivity installerActivity = InstallerActivity.this;
                this.f30941a = 1;
                if (installerActivity.h2(2, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((o) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30943a;

        /* renamed from: b, reason: collision with root package name */
        Object f30944b;

        /* renamed from: c, reason: collision with root package name */
        Object f30945c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30946d;

        /* renamed from: f, reason: collision with root package name */
        int f30948f;

        p(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30946d = obj;
            this.f30948f |= Integer.MIN_VALUE;
            return InstallerActivity.this.Z1(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30949a;

        q(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new q(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30949a == 0) {
                Q5.t.b(obj);
                TextView textView = InstallerActivity.this.f30907z;
                if (textView != null) {
                    textView.setText(J4.h.f4382q0);
                }
                ProgressBar progressBar = InstallerActivity.this.f30895o;
                if (progressBar != null) {
                    progressBar.setIndeterminate(true);
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class r extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30951a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30952b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallerActivity f30953c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Uri f30954d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30955a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30956b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f30957c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, T t8, U5.d dVar) {
                super(2, dVar);
                this.f30956b = installerActivity;
                this.f30957c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30956b, this.f30957c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30955a == 0) {
                    Q5.t.b(obj);
                    ProgressBar progressBar = this.f30956b.f30895o;
                    if (progressBar != null) {
                        progressBar.setIndeterminate(false);
                    }
                    TextView textView = this.f30956b.f30907z;
                    if (textView != null) {
                        textView.setText("");
                    }
                    TextView textView2 = this.f30956b.f30870B;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = this.f30956b.f30869A;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    if (this.f30957c.f34573a != null) {
                        TextView textView4 = this.f30956b.f30907z;
                        if (textView4 != null) {
                            textView4.setText((CharSequence) this.f30957c.f34573a);
                        }
                    } else {
                        InstallerActivity installerActivity = this.f30956b;
                        Intent intent = new Intent();
                        intent.putExtra("realPath", this.f30956b.f30876H);
                        I i8 = I.f8786a;
                        installerActivity.setResult(10, intent);
                        this.f30956b.finish();
                    }
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, InstallerActivity installerActivity, Uri uri, U5.d dVar) {
            super(2, dVar);
            this.f30952b = str;
            this.f30953c = installerActivity;
            this.f30954d = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new r(this.f30952b, this.f30953c, this.f30954d, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00dd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r14.f30951a
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                Q5.t.b(r15)
                goto Lde
            L10:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L18:
                Q5.t.b(r15)
                kotlin.jvm.internal.T r15 = new kotlin.jvm.internal.T
                r15.<init>()
                S4.f r1 = new S4.f
                r1.<init>()
                java.lang.String r3 = r14.f30952b
                boolean r1 = r1.o(r3)
                r3 = 0
                if (r1 == 0) goto Lca
                com.uptodown.core.activities.InstallerActivity r1 = r14.f30953c     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                android.net.Uri r4 = r14.f30954d     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                java.io.InputStream r1 = r1.openInputStream(r4)     // Catch: java.lang.SecurityException -> L3b java.io.FileNotFoundException -> L3d
                goto L5b
            L3b:
                r1 = move-exception
                goto L3f
            L3d:
                r1 = move-exception
                goto L4d
            L3f:
                r1.printStackTrace()
                com.uptodown.core.activities.InstallerActivity r1 = r14.f30953c
                int r4 = J4.h.f4356d0
                java.lang.String r1 = r1.getString(r4)
                r15.f34573a = r1
                goto L5a
            L4d:
                r1.printStackTrace()
                com.uptodown.core.activities.InstallerActivity r1 = r14.f30953c
                int r4 = J4.h.f4334L
                java.lang.String r1 = r1.getString(r4)
                r15.f34573a = r1
            L5a:
                r1 = r3
            L5b:
                if (r1 == 0) goto Lca
                r4 = 8192(0x2000, float:1.148E-41)
                byte[] r5 = new byte[r4]
                kotlin.jvm.internal.Q r6 = new kotlin.jvm.internal.Q
                r6.<init>()
                S4.f r7 = new S4.f
                r7.<init>()
                com.uptodown.core.activities.InstallerActivity r8 = r14.f30953c
                java.io.File r7 = r7.g(r8)
                long r8 = r7.getUsableSpace()
                int r10 = r1.available()
                double r10 = (double) r10
                r12 = 4608308318706860032(0x3ff4000000000000, double:1.25)
                double r10 = r10 * r12
                double r8 = (double) r8
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 <= 0) goto Lbd
                java.io.File r8 = new java.io.File
                java.lang.String r9 = r14.f30952b
                r8.<init>(r7, r9)
                java.io.FileOutputStream r7 = new java.io.FileOutputStream
                r7.<init>(r8)
            L8f:
                r9 = 0
                int r10 = r1.read(r5, r9, r4)
                r6.f34571a = r10
                if (r10 <= 0) goto La4
                r7.write(r5, r9, r10)     // Catch: java.io.IOException -> L9c
                goto L8f
            L9c:
                r9 = move-exception
                java.lang.String r9 = r9.getLocalizedMessage()
                r15.f34573a = r9
                goto L8f
            La4:
                r7.close()     // Catch: java.io.IOException -> La8
                goto Lb3
            La8:
                r4 = move-exception
                java.lang.Object r5 = r15.f34573a
                if (r5 != 0) goto Lb3
                java.lang.String r4 = r4.getLocalizedMessage()
                r15.f34573a = r4
            Lb3:
                com.uptodown.core.activities.InstallerActivity r4 = r14.f30953c
                java.lang.String r5 = r8.getAbsolutePath()
                com.uptodown.core.activities.InstallerActivity.l1(r4, r5)
                goto Lc7
            Lbd:
                com.uptodown.core.activities.InstallerActivity r4 = r14.f30953c
                int r5 = J4.h.f4330H
                java.lang.String r4 = r4.getString(r5)
                r15.f34573a = r4
            Lc7:
                r1.close()
            Lca:
                n6.J0 r1 = n6.C3445b0.c()
                com.uptodown.core.activities.InstallerActivity$r$a r4 = new com.uptodown.core.activities.InstallerActivity$r$a
                com.uptodown.core.activities.InstallerActivity r5 = r14.f30953c
                r4.<init>(r5, r15, r3)
                r14.f30951a = r2
                java.lang.Object r15 = n6.AbstractC3458i.g(r1, r4, r14)
                if (r15 != r0) goto Lde
                return r0
            Lde:
                Q5.I r15 = Q5.I.f8786a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.r.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((r) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class s implements O4.k {
        s() {
        }

        @Override // O4.k
        public void a(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.c2();
        }

        @Override // O4.k
        public void b(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.finish();
        }

        @Override // O4.k
        public void c(String filename, String str) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity installerActivity = InstallerActivity.this;
            String string = installerActivity.getString(J4.h.f4380p0);
            AbstractC3292y.h(string, "getString(R.string.xapk_installation_failed)");
            installerActivity.b2(string);
        }

        @Override // O4.k
        public void d(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.b2(filename + " could not be parsed.");
        }

        @Override // O4.k
        public void e(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.b2("invalid version code");
        }

        @Override // O4.k
        public void f(String filename) {
            AbstractC3292y.i(filename, "filename");
            InstallerActivity.this.b2(filename + " not found.");
        }
    }

    /* loaded from: classes5.dex */
    public static final class t extends BroadcastReceiver {
        t() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(intent, "intent");
            int intExtra = intent.getIntExtra("com.uptodown.core.installation_status", -1);
            if (intExtra != 0) {
                if (intExtra != 1) {
                    if (intExtra == 2) {
                        InstallerActivity.this.N1(intent.getStringExtra("com.uptodown.core.error"));
                        return;
                    }
                    return;
                }
                InstallerActivity.this.c2();
                return;
            }
            InstallerActivity.this.M1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class u extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30960a;

        /* renamed from: b, reason: collision with root package name */
        Object f30961b;

        /* renamed from: c, reason: collision with root package name */
        int f30962c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30963d;

        /* renamed from: f, reason: collision with root package name */
        int f30965f;

        u(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30963d = obj;
            this.f30965f |= Integer.MIN_VALUE;
            return InstallerActivity.this.h2(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class v extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30966a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f30968c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(T t8, U5.d dVar) {
            super(2, dVar);
            this.f30968c = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new v(this.f30968c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30966a == 0) {
                Q5.t.b(obj);
                Intent intent = InstallerActivity.this.getIntent();
                if (intent != null) {
                    InstallerActivity.this.f30877I = intent.getData();
                    Bundle extras = intent.getExtras();
                    if (extras != null && extras.containsKey("realPath")) {
                        InstallerActivity.this.f30876H = extras.getString("realPath");
                        T t8 = this.f30968c;
                        String str = InstallerActivity.this.f30876H;
                        AbstractC3292y.f(str);
                        String str2 = InstallerActivity.this.f30876H;
                        AbstractC3292y.f(str2);
                        String substring = str.substring(l6.n.X(str2, "/", 0, false, 6, null) + 1);
                        AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                        t8.f34573a = substring;
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((v) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class w extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30969a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30971c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f30972d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(int i8, T t8, U5.d dVar) {
            super(2, dVar);
            this.f30971c = i8;
            this.f30972d = t8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new w(this.f30971c, this.f30972d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            String str;
            V5.b.e();
            if (this.f30969a == 0) {
                Q5.t.b(obj);
                if (InstallerActivity.this.f30887S && ((i8 = this.f30971c) == 1 || i8 == 2)) {
                    TextView textView = InstallerActivity.this.f30869A;
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    ProgressBar progressBar = InstallerActivity.this.f30895o;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                    TextView textView2 = InstallerActivity.this.f30906y;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    TextView textView3 = InstallerActivity.this.f30899r;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    TextView textView4 = InstallerActivity.this.f30905x;
                    if (textView4 != null) {
                        textView4.setText(InstallerActivity.this.getString(J4.h.f4387t));
                    }
                    if (this.f30972d.f34573a != null) {
                        TextView textView5 = InstallerActivity.this.f30902u;
                        if (textView5 != null) {
                            textView5.setText((CharSequence) this.f30972d.f34573a);
                        }
                        TextView textView6 = InstallerActivity.this.f30902u;
                        if (textView6 != null) {
                            textView6.setVisibility(0);
                        }
                    } else {
                        TextView textView7 = InstallerActivity.this.f30902u;
                        if (textView7 != null) {
                            textView7.setText("");
                        }
                    }
                    String str2 = InstallerActivity.this.f30876H;
                    if (str2 != null && str2.length() != 0) {
                        PackageManager packageManager = InstallerActivity.this.getPackageManager();
                        AbstractC3292y.h(packageManager, "packageManager");
                        String str3 = InstallerActivity.this.f30876H;
                        AbstractC3292y.f(str3);
                        PackageInfo c8 = S4.r.c(packageManager, str3, 128);
                        if (c8 != null && (str = InstallerActivity.this.f30876H) != null && str.length() != 0) {
                            S4.f fVar = new S4.f();
                            String str4 = InstallerActivity.this.f30876H;
                            AbstractC3292y.f(str4);
                            PackageManager packageManager2 = InstallerActivity.this.getPackageManager();
                            AbstractC3292y.h(packageManager2, "this@InstallerActivity.packageManager");
                            String b9 = fVar.b(c8, str4, packageManager2);
                            TextView textView8 = InstallerActivity.this.f30901t;
                            if (textView8 != null) {
                                textView8.setText(b9);
                            }
                            TextView textView9 = InstallerActivity.this.f30901t;
                            if (textView9 != null) {
                                textView9.setVisibility(0);
                            }
                        }
                        ImageView imageView = InstallerActivity.this.f30900s;
                        if (imageView != null) {
                            imageView.setVisibility(0);
                        }
                        String str5 = InstallerActivity.this.f30876H;
                        AbstractC3292y.f(str5);
                        if (l6.n.r(str5, ".xapk", false, 2, null)) {
                            ImageView imageView2 = InstallerActivity.this.f30900s;
                            if (imageView2 != null) {
                                imageView2.setImageResource(J4.d.f4140q);
                            }
                        } else {
                            ImageView imageView3 = InstallerActivity.this.f30900s;
                            if (imageView3 != null) {
                                S4.f fVar2 = new S4.f();
                                InstallerActivity installerActivity = InstallerActivity.this;
                                String str6 = installerActivity.f30876H;
                                AbstractC3292y.f(str6);
                                imageView3.setImageDrawable(fVar2.h(installerActivity, str6));
                            }
                        }
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((w) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class x extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30973a;

        /* renamed from: b, reason: collision with root package name */
        Object f30974b;

        /* renamed from: c, reason: collision with root package name */
        Object f30975c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f30976d;

        /* renamed from: f, reason: collision with root package name */
        int f30978f;

        x(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30976d = obj;
            this.f30978f |= Integer.MIN_VALUE;
            return InstallerActivity.this.i2(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class y extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30979a;

        y(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new y(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30979a == 0) {
                Q5.t.b(obj);
                InstallerActivity.this.f30875G = null;
                TextView textView = InstallerActivity.this.f30870B;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((y) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class z extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30982b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InstallerActivity f30983c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ O f30984d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30985a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30986b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InstallerActivity installerActivity, U5.d dVar) {
                super(2, dVar);
                this.f30986b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f30986b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30985a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f30986b.f30885Q;
                    if (mVar != null) {
                        mVar.h();
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30987a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30988b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InstallerActivity installerActivity, U5.d dVar) {
                super(2, dVar);
                this.f30988b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f30988b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30987a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f30988b.f30885Q;
                    if (mVar != null) {
                        mVar.j();
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f30989a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InstallerActivity f30990b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(InstallerActivity installerActivity, U5.d dVar) {
                super(2, dVar);
                this.f30990b = installerActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f30990b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f30989a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f30990b.f30885Q;
                    if (mVar != null) {
                        mVar.i();
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(String str, InstallerActivity installerActivity, O o8, U5.d dVar) {
            super(2, dVar);
            this.f30982b = str;
            this.f30983c = installerActivity;
            this.f30984d = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new z(this.f30982b, this.f30983c, this.f30984d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object g8;
            Object g9;
            Object g10;
            Object e8 = V5.b.e();
            int i8 = this.f30981a;
            try {
            } catch (Exception e9) {
                e9.printStackTrace();
                J0 c8 = C3445b0.c();
                c cVar = new c(this.f30983c, null);
                this.f30981a = 4;
                g8 = AbstractC3458i.g(c8, cVar, this);
                if (g8 == e8) {
                    return e8;
                }
            }
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                Q5.t.b(obj);
                                g8 = obj;
                                return (I) g8;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q5.t.b(obj);
                        g9 = obj;
                        return (I) g9;
                    }
                    Q5.t.b(obj);
                    g10 = obj;
                    return (I) g10;
                }
                Q5.t.b(obj);
                return I.f8786a;
            }
            Q5.t.b(obj);
            J4.j.f4395g.c(this.f30982b);
            File g11 = new S4.f().g(this.f30983c);
            File file = new File(this.f30982b);
            String name = file.getName();
            AbstractC3292y.h(name, "fileZipped.name");
            String name2 = file.getName();
            AbstractC3292y.h(name2, "fileZipped.name");
            String substring = name.substring(0, l6.n.X(name2, ".", 0, false, 6, null));
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            File file2 = new File(g11, substring);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            this.f30983c.f30878J = new S4.x();
            S4.x xVar = this.f30983c.f30878J;
            AbstractC3292y.f(xVar);
            if (xVar.c(file)) {
                File e10 = new S4.f().e();
                this.f30984d.f34569a = e10.canWrite();
            }
            if (this.f30984d.f34569a) {
                S4.x xVar2 = this.f30983c.f30878J;
                AbstractC3292y.f(xVar2);
                O4.m mVar = this.f30983c.f30885Q;
                this.f30981a = 1;
                if (xVar2.g(file, file2, mVar, this) == e8) {
                    return e8;
                }
                return I.f8786a;
            }
            if (this.f30983c.T()) {
                J0 c9 = C3445b0.c();
                a aVar = new a(this.f30983c, null);
                this.f30981a = 2;
                g10 = AbstractC3458i.g(c9, aVar, this);
                if (g10 == e8) {
                    return e8;
                }
                return (I) g10;
            }
            J0 c10 = C3445b0.c();
            b bVar = new b(this.f30983c, null);
            this.f30981a = 3;
            g9 = AbstractC3458i.g(c10, bVar, this);
            if (g9 == e8) {
                return e8;
            }
            return (I) g9;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((z) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public InstallerActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: K4.l0
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                InstallerActivity.O1(InstallerActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3292y.h(registerForActivityResult, "registerForActivityResul… {\n        finish()\n    }");
        this.f30897p0 = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30880L;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
        this$0.q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String B1() {
        String language = Locale.getDefault().getLanguage();
        AbstractC3292y.h(language, "getDefault().language");
        return language;
    }

    private final void C1() {
        TextView textView;
        ImageView imageView;
        setContentView(J4.f.f4319t);
        try {
            this.f30886R = false;
            Intent intent = getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                this.f30877I = data;
                if (data != null) {
                    S4.f fVar = new S4.f();
                    Uri uri = this.f30877I;
                    AbstractC3292y.f(uri);
                    this.f30873E = fVar.j(uri, this);
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (extras.containsKey("realPath")) {
                        this.f30876H = extras.getString("realPath");
                    }
                    if (extras.containsKey("newFeatures")) {
                        this.f30888T = extras.getString("newFeatures");
                    }
                    if (extras.containsKey("requireUserAction")) {
                        this.f30889U = extras.getBoolean("requireUserAction");
                    }
                    if (extras.containsKey("action")) {
                        this.f30879K = extras.getString("action");
                    }
                    if (extras.containsKey("notificationId")) {
                        r1(this, extras.getInt("notificationId"));
                    }
                    if (extras.containsKey("backgroundInstallation")) {
                        this.f30890V = extras.getBoolean("backgroundInstallation");
                    }
                }
            }
            ImageView imageView2 = (ImageView) findViewById(J4.e.f4273r);
            this.f30872D = imageView2;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: K4.w0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.D1(InstallerActivity.this, view);
                    }
                });
            }
            this.f30871C = (ImageView) findViewById(J4.e.f4279t);
            TextView textView2 = (TextView) findViewById(J4.e.f4242g1);
            this.f30903v = textView2;
            if (textView2 != null) {
                textView2.setTypeface(J4.j.f4395g.v());
            }
            TextView textView3 = (TextView) findViewById(J4.e.f4271q0);
            this.f30904w = textView3;
            if (textView3 != null) {
                textView3.setTypeface(J4.j.f4395g.u());
            }
            String str = this.f30873E;
            if (str != null) {
                TextView textView4 = this.f30903v;
                if (textView4 != null) {
                    textView4.setText(str);
                }
                String str2 = this.f30873E;
                AbstractC3292y.f(str2);
                if (l6.n.r(str2, ".apk", false, 2, null)) {
                    ImageView imageView3 = this.f30871C;
                    if (imageView3 != null) {
                        imageView3.setImageResource(J4.d.f4124a);
                    }
                } else {
                    String str3 = this.f30873E;
                    AbstractC3292y.f(str3);
                    if (l6.n.r(str3, ".xapk", false, 2, null) && (imageView = this.f30871C) != null) {
                        imageView.setImageResource(J4.d.f4140q);
                    }
                }
            } else {
                String str4 = this.f30876H;
                if (str4 != null && (textView = this.f30903v) != null) {
                    AbstractC3292y.f(str4);
                    String str5 = this.f30876H;
                    AbstractC3292y.f(str5);
                    String substring = str4.substring(l6.n.X(str5, "/", 0, false, 6, null) + 1);
                    AbstractC3292y.h(substring, "this as java.lang.String).substring(startIndex)");
                    textView.setText(substring);
                }
            }
            this.f30895o = (ProgressBar) findViewById(J4.e.f4159F);
            TextView textView5 = (TextView) findViewById(J4.e.f4170I1);
            this.f30896p = textView5;
            if (textView5 != null) {
                textView5.setTypeface(J4.j.f4395g.v());
            }
            TextView textView6 = (TextView) findViewById(J4.e.f4296y1);
            this.f30898q = textView6;
            if (textView6 != null) {
                textView6.setTypeface(J4.j.f4395g.v());
            }
            TextView textView7 = (TextView) findViewById(J4.e.f4146A1);
            this.f30907z = textView7;
            if (textView7 != null) {
                textView7.setTypeface(J4.j.f4395g.v());
            }
            TextView textView8 = (TextView) findViewById(J4.e.f4257l1);
            this.f30869A = textView8;
            if (textView8 != null) {
                textView8.setTypeface(J4.j.f4395g.u());
            }
            TextView textView9 = this.f30869A;
            if (textView9 != null) {
                textView9.setVisibility(8);
            }
            TextView textView10 = this.f30869A;
            if (textView10 != null) {
                textView10.setOnClickListener(new View.OnClickListener() { // from class: K4.x0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.E1(InstallerActivity.this, view);
                    }
                });
            }
            TextView textView11 = (TextView) findViewById(J4.e.f4295y0);
            this.f30870B = textView11;
            if (textView11 != null) {
                textView11.setTypeface(J4.j.f4395g.u());
            }
            TextView textView12 = this.f30870B;
            if (textView12 != null) {
                textView12.setVisibility(8);
            }
            TextView textView13 = this.f30870B;
            if (textView13 != null) {
                textView13.setOnClickListener(new View.OnClickListener() { // from class: K4.y0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.F1(InstallerActivity.this, view);
                    }
                });
            }
            String str6 = this.f30888T;
            if (str6 != null && str6.length() != 0) {
                TextView textView14 = this.f30898q;
                AbstractC3292y.f(textView14);
                textView14.setVisibility(8);
                final O o8 = new O();
                LinearLayout linearLayout = (LinearLayout) findViewById(J4.e.f4147B);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(J4.e.f4150C);
                final TextView textView15 = (TextView) findViewById(J4.e.f4215X1);
                final ImageView imageView4 = (ImageView) findViewById(J4.e.f4285v);
                j.a aVar = J4.j.f4395g;
                textView15.setTypeface(aVar.u());
                final TextView textView16 = (TextView) findViewById(J4.e.f4218Y1);
                textView16.setTypeface(aVar.v());
                textView16.setText(this.f30888T);
                textView16.setVisibility(8);
                linearLayout2.setVisibility(0);
                linearLayout.setOnClickListener(new View.OnClickListener() { // from class: K4.z0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        InstallerActivity.G1(kotlin.jvm.internal.O.this, textView15, this, imageView4, textView16, view);
                    }
                });
            }
            I1();
            String str7 = this.f30879K;
            if (str7 != null && l6.n.s(str7, "delete", true)) {
                TextView textView17 = this.f30869A;
                if (textView17 != null) {
                    textView17.setVisibility(0);
                }
                TextView textView18 = this.f30869A;
                if (textView18 != null) {
                    textView18.setText(J4.h.f4368j0);
                }
                TextView textView19 = this.f30869A;
                if (textView19 != null) {
                    textView19.setTag(this.f30876H);
                }
                TextView textView20 = this.f30869A;
                if (textView20 != null) {
                    textView20.setOnClickListener(new View.OnClickListener() { // from class: K4.A0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            InstallerActivity.H1(InstallerActivity.this, view);
                        }
                    });
                }
                TextView textView21 = this.f30870B;
                if (textView21 != null) {
                    textView21.setVisibility(0);
                    return;
                }
                return;
            }
            this.f30882N = U1();
            if (this.f30877I != null && this.f30873E != null) {
                S4.f fVar2 = new S4.f();
                String str8 = this.f30873E;
                AbstractC3292y.f(str8);
                if (fVar2.o(str8)) {
                    Uri uri2 = this.f30877I;
                    AbstractC3292y.f(uri2);
                    String str9 = this.f30873E;
                    AbstractC3292y.f(str9);
                    S1(uri2, str9);
                    return;
                }
            }
            Y1(this.f30876H);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D1(InstallerActivity this$0, View view) {
        CharSequence charSequence;
        AbstractC3292y.i(this$0, "this$0");
        TextView textView = this$0.f30904w;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        String valueOf = String.valueOf(charSequence);
        Bundle bundle = new Bundle();
        bundle.putString("appNameAndVersion", valueOf);
        Application application = this$0.getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((J4.j) application).L().send(222, bundle);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E1(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        TextView textView = this$0.f30869A;
        if (textView != null) {
            textView.setVisibility(8);
        }
        this$0.Y1(this$0.f30876H);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F1(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G1(O expanded, TextView textView, InstallerActivity this$0, ImageView imageView, TextView textView2, View view) {
        AbstractC3292y.i(expanded, "$expanded");
        AbstractC3292y.i(this$0, "this$0");
        if (!expanded.f34569a) {
            textView.setText(this$0.getString(J4.h.f4389v));
            imageView.setImageDrawable(ContextCompat.getDrawable(this$0, J4.d.f4143t));
            textView2.setVisibility(0);
            expanded.f34569a = true;
            return;
        }
        textView.setText(this$0.getString(J4.h.f4388u));
        imageView.setImageDrawable(ContextCompat.getDrawable(this$0, J4.d.f4142s));
        textView2.setVisibility(8);
        expanded.f34569a = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H1(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(view, "view");
        Object tag = view.getTag();
        AbstractC3292y.g(tag, "null cannot be cast to non-null type kotlin.String");
        String str = (String) tag;
        TextView textView = this$0.f30869A;
        if (textView != null) {
            textView.setVisibility(8);
        }
        new File(str).delete();
        this$0.finish();
    }

    private final void I1() {
        this.f30884P = new h();
        this.f30885Q = new i();
    }

    private final void J1(File file) {
        Context applicationContext = getApplicationContext();
        AbstractC3292y.h(applicationContext, "applicationContext");
        new S4.h(applicationContext, this.f30884P).t(file, this.f30889U);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O1(InstallerActivity this$0, ActivityResult activityResult) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.finish();
    }

    private final boolean P1(File file) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        return Q1(arrayList);
    }

    private final boolean Q1(ArrayList arrayList) {
        try {
            if (!new L4.a(this).N() || arrayList.size() != 1) {
                return false;
            }
            String name = ((File) arrayList.get(0)).getName();
            AbstractC3292y.h(name, "files[0].name");
            if (!l6.n.r(name, ".apk", false, 2, null)) {
                return false;
            }
            PackageManager packageManager = getPackageManager();
            AbstractC3292y.h(packageManager, "packageManager");
            String absolutePath = ((File) arrayList.get(0)).getAbsolutePath();
            AbstractC3292y.h(absolutePath, "files[0].absolutePath");
            PackageInfo c8 = S4.r.c(packageManager, absolutePath, 0);
            if (c8 == null) {
                return false;
            }
            PackageManager packageManager2 = getPackageManager();
            AbstractC3292y.h(packageManager2, "packageManager");
            String str = c8.packageName;
            AbstractC3292y.h(str, "piFileToInstall.packageName");
            if (new S4.f().m(S4.r.d(packageManager2, str, 0)) != new S4.f().m(c8)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private final void R1() {
        InterfaceC3488x0 d8;
        if (this.f30883O == null) {
            d8 = AbstractC3462k.d(N.a(C3445b0.b()), null, null, new j(null), 3, null);
            this.f30883O = d8;
        }
    }

    private final void S1(Uri uri, String str) {
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new k(uri, str, null), 3, null);
    }

    private final void T1(String str) {
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new l(str, null), 3, null);
    }

    private final ArrayList U1() {
        String str;
        String str2;
        String string = getString(J4.h.f4353c);
        AbstractC3292y.h(string, "getString(R.string.app_name)");
        ArrayList arrayList = new ArrayList();
        try {
            String[] stringArray = getResources().getStringArray(J4.b.f4121a);
            AbstractC3292y.h(stringArray, "resources.getStringArray(R.array.messages_info)");
            int length = stringArray.length;
            int i8 = 0;
            while (true) {
                str = TypedValues.Custom.S_STRING;
                if (i8 >= length) {
                    break;
                }
                String string2 = stringArray[i8];
                AbstractC3292y.h(string2, "string");
                if (string2.length() > 0) {
                    if (l6.n.G(string2, "%s", false, 2, null)) {
                        arrayList.add(l6.n.z(string2, "%s", string, false, 4, null));
                    } else {
                        arrayList.add(string2);
                    }
                }
                i8++;
            }
            String[] stringArray2 = getResources().getStringArray(J4.b.f4122b);
            AbstractC3292y.h(stringArray2, "resources.getStringArray…array.messages_info_core)");
            int length2 = stringArray2.length;
            int i9 = 0;
            while (i9 < length2) {
                String str3 = stringArray2[i9];
                AbstractC3292y.h(str3, str);
                if (str3.length() > 0) {
                    if (l6.n.G(str3, "%s", false, 2, null)) {
                        str2 = str;
                        arrayList.add(l6.n.z(str3, "%s", string, false, 4, null));
                    } else {
                        str2 = str;
                        arrayList.add(str3);
                    }
                } else {
                    str2 = str;
                }
                i9++;
                str = str2;
            }
        } catch (Resources.NotFoundException e8) {
            e8.printStackTrace();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object V1(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new m(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W1(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        Application application = this$0.getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((J4.j) application).L().send(225, null);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X1(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        Application application = this$0.getApplication();
        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
        ((J4.j) application).L().send(226, null);
        this$0.C1();
    }

    private final void Y1(String str) {
        if (str != null && new File(str).exists()) {
            if (S4.x.f9510b.a(str)) {
                T1(str);
                return;
            } else if (l6.n.r(str, ".apk", false, 2, null)) {
                K1(this, new File(str));
                return;
            } else {
                Toast.makeText(this, J4.h.f4334L, 0).show();
                finish();
                return;
            }
        }
        Toast.makeText(this, J4.h.f4334L, 0).show();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object Z1(android.net.Uri r7, java.lang.String r8, U5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.p
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$p r0 = (com.uptodown.core.activities.InstallerActivity.p) r0
            int r1 = r0.f30948f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30948f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$p r0 = new com.uptodown.core.activities.InstallerActivity$p
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30946d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30948f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L46
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.Object r7 = r0.f30945c
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.f30944b
            android.net.Uri r7 = (android.net.Uri) r7
            java.lang.Object r2 = r0.f30943a
            com.uptodown.core.activities.InstallerActivity r2 = (com.uptodown.core.activities.InstallerActivity) r2
            Q5.t.b(r9)
            goto L62
        L46:
            Q5.t.b(r9)
            n6.J0 r9 = n6.C3445b0.c()
            com.uptodown.core.activities.InstallerActivity$q r2 = new com.uptodown.core.activities.InstallerActivity$q
            r2.<init>(r5)
            r0.f30943a = r6
            r0.f30944b = r7
            r0.f30945c = r8
            r0.f30948f = r4
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r2, r0)
            if (r9 != r1) goto L61
            return r1
        L61:
            r2 = r6
        L62:
            n6.I r9 = n6.C3445b0.b()
            com.uptodown.core.activities.InstallerActivity$r r4 = new com.uptodown.core.activities.InstallerActivity$r
            r4.<init>(r8, r2, r7, r5)
            r0.f30943a = r5
            r0.f30944b = r5
            r0.f30945c = r5
            r0.f30948f = r3
            java.lang.Object r7 = n6.AbstractC3458i.g(r9, r4, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.Z1(android.net.Uri, java.lang.String, U5.d):java.lang.Object");
    }

    private final void a2() {
        TextView textView;
        String str = this.f30876H;
        if (str != null && l6.n.r(str, ".apk", false, 2, null)) {
            PackageManager pm = getPackageManager();
            AbstractC3292y.h(pm, "pm");
            String str2 = this.f30876H;
            AbstractC3292y.f(str2);
            PackageInfo c8 = S4.r.c(pm, str2, 128);
            if (c8 != null) {
                S4.f fVar = new S4.f();
                String str3 = this.f30876H;
                AbstractC3292y.f(str3);
                String b9 = fVar.b(c8, str3, pm);
                long m8 = new S4.f().m(c8);
                S4.e eVar = new S4.e();
                String str4 = this.f30876H;
                AbstractC3292y.f(str4);
                long f8 = eVar.f(str4);
                j.a aVar = J4.j.f4395g;
                String str5 = c8.packageName;
                AbstractC3292y.h(str5, "pi.packageName");
                aVar.w(str5, m8, b9, f8);
                if (!this.f30890V) {
                    ImageView imageView = this.f30871C;
                    if (imageView != null) {
                        S4.f fVar2 = new S4.f();
                        String str6 = this.f30876H;
                        AbstractC3292y.f(str6);
                        imageView.setImageDrawable(fVar2.h(this, str6));
                    }
                    TextView textView2 = this.f30904w;
                    if (textView2 != null) {
                        textView2.setText(getString(J4.h.f4351b, b9, c8.versionName));
                    }
                    TextView textView3 = this.f30904w;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                }
            }
        }
        if (!this.f30890V && (textView = this.f30903v) != null) {
            textView.setText(this.f30873E);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(String str) {
        TextView textView = this.f30907z;
        if (textView != null) {
            textView.setText(str);
        }
        ProgressBar progressBar = this.f30895o;
        if (progressBar != null) {
            progressBar.setIndeterminate(false);
        }
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d2(InstallerActivity this$0) {
        AbstractC3292y.i(this$0, "this$0");
        this$0.a2();
        if (!this$0.f30890V) {
            this$0.R1();
            ((LinearLayout) this$0.findViewById(J4.e.f4294y)).setVisibility(0);
            TextView textView = this$0.f30896p;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this$0.f30907z;
            if (textView2 != null) {
                textView2.setText(J4.h.f4341S);
            }
            ProgressBar progressBar = this$0.f30895o;
            if (progressBar != null) {
                progressBar.setIndeterminate(true);
            }
            this$0.getWindow().addFlags(128);
            ImageView imageView = this$0.f30872D;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            TextView textView3 = this$0.f30870B;
            if (textView3 != null) {
                textView3.setVisibility(8);
                return;
            }
            return;
        }
        this$0.finish();
    }

    private final void e2(final ArrayList arrayList) {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f30881M;
        if (alertDialog2 != null) {
            AbstractC3292y.f(alertDialog2);
            if (alertDialog2.isShowing()) {
                AlertDialog alertDialog3 = this.f30881M;
                AbstractC3292y.f(alertDialog3);
                alertDialog3.dismiss();
            }
        }
        Window window = null;
        View inflate = getLayoutInflater().inflate(J4.f.f4311l, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(J4.e.f4299z1);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        final CheckBox checkBox = (CheckBox) inflate.findViewById(J4.e.f4249j);
        checkBox.setTypeface(aVar.v());
        TextView textView2 = (TextView) inflate.findViewById(J4.e.f4251j1);
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: K4.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.f2(InstallerActivity.this, checkBox, arrayList, view);
            }
        });
        TextView textView3 = (TextView) inflate.findViewById(J4.e.f4283u0);
        textView3.setTypeface(aVar.u());
        textView3.setOnClickListener(new View.OnClickListener() { // from class: K4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.g2(InstallerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        this.f30881M = create;
        if (create != null) {
            window = create.getWindow();
        }
        AbstractC3292y.f(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        if (!isFinishing() && (alertDialog = this.f30881M) != null) {
            alertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f2(InstallerActivity this$0, CheckBox checkBox, ArrayList files, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(files, "$files");
        this$0.f30886R = true;
        AlertDialog alertDialog = this$0.f30881M;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        if (checkBox.isChecked()) {
            new L4.a(this$0).J(false);
        }
        this$0.L1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g2(InstallerActivity this$0, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AlertDialog alertDialog = this$0.f30881M;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this$0.q1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[PHI: r9
  0x0082: PHI (r9v5 java.lang.Object) = (r9v4 java.lang.Object), (r9v1 java.lang.Object) binds: [B:17:0x007f, B:10:0x0029] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i2(java.lang.String r8, U5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.x
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$x r0 = (com.uptodown.core.activities.InstallerActivity.x) r0
            int r1 = r0.f30978f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30978f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$x r0 = new com.uptodown.core.activities.InstallerActivity$x
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30976d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30978f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r9)
            goto L82
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.Object r8 = r0.f30975c
            kotlin.jvm.internal.O r8 = (kotlin.jvm.internal.O) r8
            java.lang.Object r2 = r0.f30974b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f30973a
            com.uptodown.core.activities.InstallerActivity r4 = (com.uptodown.core.activities.InstallerActivity) r4
            Q5.t.b(r9)
            r9 = r8
            r8 = r2
            goto L6a
        L47:
            Q5.t.b(r9)
            kotlin.jvm.internal.O r9 = new kotlin.jvm.internal.O
            r9.<init>()
            r9.f34569a = r4
            n6.J0 r2 = n6.C3445b0.c()
            com.uptodown.core.activities.InstallerActivity$y r6 = new com.uptodown.core.activities.InstallerActivity$y
            r6.<init>(r5)
            r0.f30973a = r7
            r0.f30974b = r8
            r0.f30975c = r9
            r0.f30978f = r4
            java.lang.Object r2 = n6.AbstractC3458i.g(r2, r6, r0)
            if (r2 != r1) goto L69
            return r1
        L69:
            r4 = r7
        L6a:
            n6.I r2 = n6.C3445b0.b()
            com.uptodown.core.activities.InstallerActivity$z r6 = new com.uptodown.core.activities.InstallerActivity$z
            r6.<init>(r8, r4, r9, r5)
            r0.f30973a = r5
            r0.f30974b = r5
            r0.f30975c = r5
            r0.f30978f = r3
            java.lang.Object r9 = n6.AbstractC3458i.g(r2, r6, r0)
            if (r9 != r1) goto L82
            return r1
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.i2(java.lang.String, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q1() {
        S4.x xVar = this.f30878J;
        if (xVar != null) {
            xVar.b();
        }
        J4.j.f4395g.b();
        ArrayList arrayList = this.f30874F;
        if (arrayList != null) {
            AbstractC3292y.f(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file != null && file.exists()) {
                    file.delete();
                }
            }
        }
        finish();
    }

    private final void r1(Context context, int i8) {
        Object systemService = context.getSystemService("notification");
        AbstractC3292y.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).cancel(i8);
    }

    private final void s1(final File file) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(J4.h.f4376n0));
        builder.setMessage(J4.h.f4346X);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: K4.p0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.u1(InstallerActivity.this, file, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: K4.q0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.v1(InstallerActivity.this, file, dialogInterface, i8);
            }
        });
        builder.create().show();
    }

    private final void t1(final ArrayList arrayList) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(J4.h.f4376n0));
        builder.setMessage(J4.h.f4346X);
        builder.setCancelable(false);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: K4.n0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.w1(InstallerActivity.this, arrayList, dialogInterface, i8);
            }
        });
        builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: K4.o0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                InstallerActivity.x1(InstallerActivity.this, arrayList, dialogInterface, i8);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(InstallerActivity this$0, File file, DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(file, "$file");
        L4.a aVar = new L4.a(this$0);
        aVar.M(true);
        aVar.B(true);
        this$0.K1(this$0, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(InstallerActivity this$0, File file, DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(file, "$file");
        L4.a aVar = new L4.a(this$0);
        aVar.M(true);
        aVar.B(false);
        this$0.K1(this$0, file);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(InstallerActivity this$0, ArrayList files, DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(files, "$files");
        L4.a aVar = new L4.a(this$0);
        aVar.M(true);
        aVar.B(true);
        this$0.L1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(InstallerActivity this$0, ArrayList files, DialogInterface dialogInterface, int i8) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(files, "$files");
        L4.a aVar = new L4.a(this$0);
        aVar.M(true);
        aVar.B(false);
        this$0.L1(this$0, files);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1(File file, ArrayList arrayList) {
        Window window;
        boolean z8;
        android.app.AlertDialog alertDialog = this.f30880L;
        if (alertDialog != null) {
            AbstractC3292y.f(alertDialog);
            if (alertDialog.isShowing()) {
                android.app.AlertDialog alertDialog2 = this.f30880L;
                AbstractC3292y.f(alertDialog2);
                alertDialog2.dismiss();
            }
        }
        final b bVar = new b();
        bVar.w(arrayList);
        View inflate = getLayoutInflater().inflate(J4.f.f4315p, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(J4.e.f4268p0);
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        AbstractC3292y.f(file);
        textView.setText(file.getName());
        ((TextView) inflate.findViewById(J4.e.f4281t1)).setTypeface(aVar.u());
        TextView textView2 = (TextView) inflate.findViewById(J4.e.f4161F1);
        textView2.setTypeface(aVar.v());
        textView2.setText(bVar.m());
        ((TextView) inflate.findViewById(J4.e.f4284u1)).setTypeface(aVar.u());
        TextView textView3 = (TextView) inflate.findViewById(J4.e.f4212W1);
        textView3.setTypeface(aVar.v());
        textView3.setText(bVar.n());
        ((TextView) inflate.findViewById(J4.e.f4266o1)).setTypeface(aVar.u());
        CheckBox checkBox = (CheckBox) inflate.findViewById(J4.e.f4243h);
        if (bVar.i() != null) {
            checkBox.setTypeface(aVar.v());
            File i8 = bVar.i();
            AbstractC3292y.f(i8);
            checkBox.setText(i8.getName());
        }
        TextView textView4 = (TextView) inflate.findViewById(J4.e.f4269p1);
        textView4.setTypeface(aVar.u());
        TextView textView5 = (TextView) inflate.findViewById(J4.e.f4184N0);
        textView5.setTypeface(aVar.v());
        View findViewById = inflate.findViewById(J4.e.f4216Y);
        AbstractC3292y.h(findViewById, "view.findViewById(R.id.r…quitecture_dialog_splits)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (bVar.h().size() > 0) {
            recyclerView.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView.addItemDecoration(new S4.t((int) getResources().getDimension(J4.c.f4123a)));
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(new M4.c(bVar.h(), new d(bVar)));
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                if (strArr.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    StringBuilder sb = new StringBuilder();
                    int length = strArr.length;
                    for (int i9 = 0; i9 < length; i9++) {
                        if (i9 == 0) {
                            sb = new StringBuilder('(' + strArr[i9]);
                        } else {
                            sb.append(",");
                            sb.append(strArr[i9]);
                        }
                    }
                    sb.append(")");
                    Y y8 = Y.f34578a;
                    String string = getString(J4.h.f4325C);
                    AbstractC3292y.h(string, "getString(R.string.devic…rted_abis_split_selector)");
                    String format = String.format(string, Arrays.copyOf(new Object[]{sb.toString()}, 1));
                    AbstractC3292y.h(format, "format(format, *args)");
                    textView5.setText(format);
                }
            }
            textView5.setVisibility(8);
        } else {
            recyclerView.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            inflate.findViewById(J4.e.f4238f0).setVisibility(8);
        }
        TextView textView6 = (TextView) inflate.findViewById(J4.e.f4272q1);
        j.a aVar2 = J4.j.f4395g;
        textView6.setTypeface(aVar2.u());
        TextView textView7 = (TextView) inflate.findViewById(J4.e.f4187O0);
        textView7.setTypeface(aVar2.v());
        View findViewById2 = inflate.findViewById(J4.e.f4223a0);
        AbstractC3292y.h(findViewById2, "view.findViewById(R.id.rv_dpi_dialog_splits)");
        RecyclerView recyclerView2 = (RecyclerView) findViewById2;
        if (bVar.j().size() > 0) {
            recyclerView2.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView2.addItemDecoration(new S4.t((int) getResources().getDimension(J4.c.f4123a)));
            recyclerView2.setItemAnimator(new DefaultItemAnimator());
            recyclerView2.setAdapter(new M4.c(bVar.j(), new e(bVar)));
            Y y9 = Y.f34578a;
            String string2 = getString(J4.h.f4326D);
            AbstractC3292y.h(string2, "getString(R.string.devic…rted_dpis_split_selector)");
            String format2 = String.format(string2, Arrays.copyOf(new Object[]{getString(J4.h.f4327E)}, 1));
            AbstractC3292y.h(format2, "format(format, *args)");
            textView7.setText(format2);
        } else {
            recyclerView2.setVisibility(8);
            textView6.setVisibility(8);
            textView7.setVisibility(8);
            inflate.findViewById(J4.e.f4241g0).setVisibility(8);
        }
        TextView textView8 = (TextView) inflate.findViewById(J4.e.f4278s1);
        textView8.setTypeface(aVar2.u());
        TextView textView9 = (TextView) inflate.findViewById(J4.e.f4178L0);
        textView9.setTypeface(aVar2.v());
        View findViewById3 = inflate.findViewById(J4.e.f4232d0);
        AbstractC3292y.h(findViewById3, "view.findViewById(R.id.rv_lang_dialog_splits)");
        RecyclerView recyclerView3 = (RecyclerView) findViewById3;
        if (bVar.l().size() > 0) {
            recyclerView3.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView3.addItemDecoration(new S4.t((int) getResources().getDimension(J4.c.f4123a)));
            recyclerView3.setItemAnimator(new DefaultItemAnimator());
            recyclerView3.setAdapter(new M4.c(bVar.l(), new g(bVar)));
            textView9.setText(getString(J4.h.f4324B));
        } else {
            recyclerView3.setVisibility(8);
            textView8.setVisibility(8);
            textView9.setVisibility(8);
            inflate.findViewById(J4.e.f4247i0).setVisibility(8);
        }
        TextView textView10 = (TextView) inflate.findViewById(J4.e.f4275r1);
        textView10.setTypeface(aVar2.u());
        TextView textView11 = (TextView) inflate.findViewById(J4.e.f4175K0);
        textView11.setTypeface(aVar2.v());
        View findViewById4 = inflate.findViewById(J4.e.f4226b0);
        AbstractC3292y.h(findViewById4, "view.findViewById(R.id.rv_features_dialog_splits)");
        RecyclerView recyclerView4 = (RecyclerView) findViewById4;
        if (bVar.k().size() > 0) {
            recyclerView4.setLayoutManager(new WrapContentLinearLayoutManager(this, 1, false));
            recyclerView4.addItemDecoration(new S4.t((int) getResources().getDimension(J4.c.f4123a)));
            recyclerView4.setItemAnimator(new DefaultItemAnimator());
            recyclerView4.setAdapter(new M4.c(bVar.k(), new f(bVar)));
        } else {
            recyclerView4.setVisibility(8);
            textView10.setVisibility(8);
            textView11.setVisibility(8);
            inflate.findViewById(J4.e.f4244h0).setVisibility(8);
        }
        TextView textView12 = (TextView) inflate.findViewById(J4.e.f4254k1);
        textView12.setTypeface(aVar2.u());
        textView12.setOnClickListener(new View.OnClickListener() { // from class: K4.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.z1(InstallerActivity.this, bVar, view);
            }
        });
        TextView textView13 = (TextView) inflate.findViewById(J4.e.f4292x0);
        textView13.setTypeface(aVar2.u());
        textView13.setOnClickListener(new View.OnClickListener() { // from class: K4.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InstallerActivity.A1(InstallerActivity.this, view);
            }
        });
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(inflate);
        builder.setCancelable(true);
        this.f30880L = builder.create();
        if (!isFinishing()) {
            android.app.AlertDialog alertDialog3 = this.f30880L;
            if (alertDialog3 != null && (window = alertDialog3.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            android.app.AlertDialog alertDialog4 = this.f30880L;
            if (alertDialog4 != null) {
                alertDialog4.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z1(InstallerActivity this$0, b splits, View view) {
        AbstractC3292y.i(this$0, "this$0");
        AbstractC3292y.i(splits, "$splits");
        android.app.AlertDialog alertDialog = this$0.f30880L;
        AbstractC3292y.f(alertDialog);
        alertDialog.dismiss();
        this$0.L1(this$0, splits.y());
    }

    public final void K1(Activity activity, File file) {
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(file, "file");
        L4.a aVar = new L4.a(activity);
        boolean l8 = aVar.l();
        boolean s8 = aVar.s();
        if (!this.f30886R && P1(file)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(file);
            e2(arrayList);
            return;
        }
        if (!l8 && !s8) {
            J1(file);
            return;
        }
        if (!aVar.t()) {
            s1(file);
            return;
        }
        if (!aVar.m()) {
            J1(file);
            return;
        }
        if (aVar.l()) {
            s.a aVar2 = S4.s.f9466a;
            String absolutePath = file.getAbsolutePath();
            AbstractC3292y.h(absolutePath, "file.absolutePath");
            aVar2.b(absolutePath, activity, this.f30894Z);
            return;
        }
        if (aVar.s()) {
            new S4.w(activity, this.f30893Y).f(file);
        }
    }

    public final void L1(Activity activity, ArrayList files) {
        AbstractC3292y.i(activity, "activity");
        AbstractC3292y.i(files, "files");
        L4.a aVar = new L4.a(activity);
        boolean l8 = aVar.l();
        boolean s8 = aVar.s();
        if (!this.f30886R && Q1(files)) {
            e2(files);
        } else if ((l8 || s8) && !aVar.t()) {
            t1(files);
        } else {
            new S4.h(activity, this.f30884P).v(files, this.f30889U);
        }
    }

    public final void M1() {
        try {
            unregisterReceiver(this.f30891W);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        J4.j.f4395g.b();
        finish();
    }

    public final void N1(String str) {
        try {
            unregisterReceiver(this.f30891W);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        Toast.makeText(this, str, 0).show();
        q1();
    }

    @Override // K4.r
    public void Y() {
    }

    @Override // K4.r
    public void Z() {
    }

    @Override // K4.r
    public void a0() {
    }

    @Override // K4.r
    public void b0() {
    }

    public final void c2() {
        runOnUiThread(new Runnable() { // from class: K4.v0
            @Override // java.lang.Runnable
            public final void run() {
                InstallerActivity.d2(InstallerActivity.this);
            }
        });
    }

    @Override // K4.r
    public void d0() {
    }

    @Override // K4.r
    public void h0() {
        O4.m mVar;
        if (T() && !new File("/Android/obb").canRead() && (mVar = this.f30885Q) != null) {
            mVar.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h2(int r8, U5.d r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.uptodown.core.activities.InstallerActivity.u
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.core.activities.InstallerActivity$u r0 = (com.uptodown.core.activities.InstallerActivity.u) r0
            int r1 = r0.f30965f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30965f = r1
            goto L18
        L13:
            com.uptodown.core.activities.InstallerActivity$u r0 = new com.uptodown.core.activities.InstallerActivity$u
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30963d
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f30965f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            Q5.t.b(r9)
            goto L7a
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r8 = r0.f30962c
            java.lang.Object r2 = r0.f30961b
            kotlin.jvm.internal.T r2 = (kotlin.jvm.internal.T) r2
            java.lang.Object r4 = r0.f30960a
            com.uptodown.core.activities.InstallerActivity r4 = (com.uptodown.core.activities.InstallerActivity) r4
            Q5.t.b(r9)
            goto L64
        L43:
            Q5.t.b(r9)
            kotlin.jvm.internal.T r2 = new kotlin.jvm.internal.T
            r2.<init>()
            n6.I r9 = n6.C3445b0.b()
            com.uptodown.core.activities.InstallerActivity$v r6 = new com.uptodown.core.activities.InstallerActivity$v
            r6.<init>(r2, r5)
            r0.f30960a = r7
            r0.f30961b = r2
            r0.f30962c = r8
            r0.f30965f = r4
            java.lang.Object r9 = n6.AbstractC3458i.g(r9, r6, r0)
            if (r9 != r1) goto L63
            return r1
        L63:
            r4 = r7
        L64:
            n6.J0 r9 = n6.C3445b0.c()
            com.uptodown.core.activities.InstallerActivity$w r6 = new com.uptodown.core.activities.InstallerActivity$w
            r6.<init>(r8, r2, r5)
            r0.f30960a = r5
            r0.f30961b = r5
            r0.f30965f = r3
            java.lang.Object r8 = n6.AbstractC3458i.g(r9, r6, r0)
            if (r8 != r1) goto L7a
            return r1
        L7a:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.activities.InstallerActivity.h2(int, U5.d):java.lang.Object");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        j.a aVar = J4.j.f4395g;
        if (aVar.h() == null) {
            C1();
        } else {
            setContentView(J4.f.f4320u);
            this.f30887S = true;
            Application application = getApplication();
            AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
            String str = null;
            ((J4.j) application).L().send(224, null);
            TextView textView2 = (TextView) findViewById(J4.e.f4248i1);
            this.f30899r = textView2;
            AbstractC3292y.f(textView2);
            textView2.setTypeface(aVar.u());
            this.f30900s = (ImageView) findViewById(J4.e.f4267p);
            TextView textView3 = (TextView) findViewById(J4.e.f4277s0);
            this.f30901t = textView3;
            AbstractC3292y.f(textView3);
            textView3.setTypeface(aVar.u());
            TextView textView4 = (TextView) findViewById(J4.e.f4274r0);
            this.f30902u = textView4;
            AbstractC3292y.f(textView4);
            textView4.setTypeface(aVar.v());
            TextView textView5 = (TextView) findViewById(J4.e.f4263n1);
            this.f30905x = textView5;
            AbstractC3292y.f(textView5);
            textView5.setTypeface(aVar.v());
            TextView textView6 = (TextView) findViewById(J4.e.f4295y0);
            this.f30870B = textView6;
            AbstractC3292y.f(textView6);
            textView6.setTypeface(aVar.u());
            TextView textView7 = this.f30870B;
            AbstractC3292y.f(textView7);
            textView7.setOnClickListener(new View.OnClickListener() { // from class: K4.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InstallerActivity.W1(InstallerActivity.this, view);
                }
            });
            TextView textView8 = (TextView) findViewById(J4.e.f4257l1);
            this.f30869A = textView8;
            AbstractC3292y.f(textView8);
            textView8.setTypeface(aVar.u());
            TextView textView9 = this.f30869A;
            AbstractC3292y.f(textView9);
            textView9.setOnClickListener(new View.OnClickListener() { // from class: K4.u0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    InstallerActivity.X1(InstallerActivity.this, view);
                }
            });
            this.f30895o = (ProgressBar) findViewById(J4.e.f4159F);
            TextView textView10 = (TextView) findViewById(J4.e.f4260m1);
            this.f30906y = textView10;
            AbstractC3292y.f(textView10);
            textView10.setTypeface(aVar.v());
            P4.a h8 = aVar.h();
            if (h8 != null) {
                str = h8.a();
            }
            if (str != null && (textView = this.f30906y) != null) {
                textView.setText(str);
            }
        }
        getOnBackPressedDispatcher().addCallback(this, this.f30892X);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        InterfaceC3488x0 interfaceC3488x0 = this.f30883O;
        if (interfaceC3488x0 != null) {
            InterfaceC3488x0.a.a(interfaceC3488x0, null, 1, null);
        }
        getWindow().clearFlags(128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        TextView textView;
        super.onResume();
        if (J4.j.f4395g.h() == null && (textView = this.f30905x) != null && textView.getVisibility() == 0) {
            AbstractC3462k.d(N.a(C3445b0.c()), null, null, new o(null), 3, null);
        }
    }
}
