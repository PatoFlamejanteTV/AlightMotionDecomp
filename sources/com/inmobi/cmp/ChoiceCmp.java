package com.inmobi.cmp;

import D5.s;
import Q5.I;
import Q5.t;
import U7.m;
import U7.o;
import U7.p;
import U7.q;
import U7.r;
import U7.u;
import U7.w;
import W7.n;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import b.C1957l;
import c.C2001i;
import c6.InterfaceC2072n;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.inmobi.cmp.core.model.GDPRData;
import com.inmobi.cmp.data.model.ChoiceStyle;
import com.inmobi.cmp.data.storage.SharedStorage;
import com.inmobi.cmp.model.ChoiceError;
import com.inmobi.cmp.model.NonIABData;
import com.inmobi.cmp.model.PingReturn;
import com.inmobi.cmp.presentation.components.CmpActivity;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.J;
import n6.M;
import n6.N;
import n6.U0;

/* loaded from: classes4.dex */
public final class ChoiceCmp {

    /* renamed from: a */
    public static ChoiceCmpCallback f19048a = null;

    /* renamed from: b */
    public static String f19049b = "";

    /* renamed from: c */
    public static String f19050c = "";

    /* renamed from: d */
    public static C1957l f19051d;

    /* renamed from: e */
    public static M f19052e;
    public static final ChoiceCmp INSTANCE = new ChoiceCmp();

    /* renamed from: f */
    public static final J f19053f = new i(J.f35662m0);

    /* renamed from: g */
    public static final Pattern f19054g = Pattern.compile("^(p-)?([a-zA-Z0-9_-]{13})$");

    /* loaded from: classes4.dex */
    public static final class a extends l implements InterfaceC2072n {
        public a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new a((U5.d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            t.b(obj);
            ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
            ChoiceCmpCallback callback = choiceCmp.getCallback();
            if (callback != null) {
                callback.onCmpLoaded(choiceCmp.ping$app_release(true, CmpStatus.LOADED, DisplayStatus.HIDDEN));
            }
            Y7.d dVar = Y7.d.f13152a;
            if (Y7.d.f13153b != null) {
                ChoiceCmp.access$showCmpDialog(choiceCmp, dVar.b());
            }
            return I.f8786a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19055a;

        /* renamed from: c */
        public int f19057c;

        public b(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19055a = obj;
            this.f19057c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.b(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19058a;

        /* renamed from: c */
        public int f19060c;

        public c(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19058a = obj;
            this.f19060c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.c(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19061a;

        /* renamed from: c */
        public int f19063c;

        public d(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19061a = obj;
            this.f19063c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.d(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19064a;

        /* renamed from: c */
        public int f19066c;

        public e(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19064a = obj;
            this.f19066c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.e(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19067a;

        /* renamed from: c */
        public int f19069c;

        public f(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19067a = obj;
            this.f19069c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.f(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19070a;

        /* renamed from: c */
        public int f19072c;

        public g(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19070a = obj;
            this.f19072c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.g(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        public /* synthetic */ Object f19073a;

        /* renamed from: c */
        public int f19075c;

        public h(U5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f19073a = obj;
            this.f19075c |= Integer.MIN_VALUE;
            return ChoiceCmp.this.h(this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Y7.a {
        @Override // Y7.a
        public void a() {
            C1957l c1957l = ChoiceCmp.f19051d;
            if (c1957l == null) {
                AbstractC3292y.y("viewModel");
                c1957l = null;
            }
            if (!c1957l.f14884l) {
                ChoiceCmp.INSTANCE.a();
            }
        }

        @Override // Y7.a
        public void b() {
            M m8 = ChoiceCmp.f19052e;
            if (m8 != null) {
                N.d(m8, null, 1, null);
            }
            ChoiceCmp.f19052e = null;
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends l implements InterfaceC2072n {

        /* renamed from: a */
        public int f19076a;

        public k(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new k(dVar);
        }

        @Override // c6.InterfaceC2072n
        public Object invoke(Object obj, Object obj2) {
            return new k((U5.d) obj2).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f19076a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ChoiceCmp choiceCmp = ChoiceCmp.INSTANCE;
                this.f19076a = 1;
                if (ChoiceCmp.access$loadCmpInfo(choiceCmp, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$loadCmpInfo(com.inmobi.cmp.ChoiceCmp r6, U5.d r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof b.C1946a
            if (r0 == 0) goto L16
            r0 = r7
            b.a r0 = (b.C1946a) r0
            int r1 = r0.f14855c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f14855c = r1
            goto L1b
        L16:
            b.a r0 = new b.a
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r6 = r0.f14853a
            java.lang.Object r7 = V5.b.e()
            int r1 = r0.f14855c
            java.lang.String r2 = "viewModel"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r3) goto L32
            Q5.t.b(r6)
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            Q5.t.b(r6)
            goto L5e
        L3e:
            Q5.t.b(r6)
            b.l r6 = com.inmobi.cmp.ChoiceCmp.f19051d
            if (r6 != 0) goto L49
            kotlin.jvm.internal.AbstractC3292y.y(r2)
            r6 = r5
        L49:
            r0.f14855c = r4
            r6.getClass()
            n6.I r1 = n6.C3445b0.b()
            b.d r4 = new b.d
            r4.<init>(r6, r5)
            java.lang.Object r6 = n6.AbstractC3458i.g(r1, r4, r0)
            if (r6 != r7) goto L5e
            goto L80
        L5e:
            D5.g r6 = (D5.g) r6
            b.l r1 = com.inmobi.cmp.ChoiceCmp.f19051d
            if (r1 != 0) goto L68
            kotlin.jvm.internal.AbstractC3292y.y(r2)
            goto L69
        L68:
            r5 = r1
        L69:
            r5.getClass()
            java.lang.String r1 = "cmpIab"
            kotlin.jvm.internal.AbstractC3292y.i(r6, r1)
            r5.f14888p = r6
            com.inmobi.cmp.ChoiceCmp r6 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f14855c = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r7) goto L7e
            goto L80
        L7e:
            Q5.I r7 = Q5.I.f8786a
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.access$loadCmpInfo(com.inmobi.cmp.ChoiceCmp, U5.d):java.lang.Object");
    }

    public static final void access$showCmpDialog(ChoiceCmp choiceCmp, Context context) {
        choiceCmp.getClass();
        C1957l c1957l = f19051d;
        C1957l c1957l2 = null;
        if (c1957l == null) {
            AbstractC3292y.y("viewModel");
            c1957l = null;
        }
        if (c1957l.l()) {
            if (choiceCmp.isViewModelAvailable$app_release()) {
                C1957l c1957l3 = f19051d;
                if (c1957l3 == null) {
                    AbstractC3292y.y("viewModel");
                    c1957l3 = null;
                }
                if (c1957l3.o()) {
                    C1957l c1957l4 = f19051d;
                    if (c1957l4 == null) {
                        AbstractC3292y.y("viewModel");
                        c1957l4 = null;
                    }
                    J6.a coreConfig = c1957l4.f14875c.f4497b;
                    AbstractC3292y.i(coreConfig, "coreConfig");
                    StringBuilder sb = new StringBuilder();
                    sb.append((Object) coreConfig.f4445J);
                    sb.append(coreConfig.f4449N);
                    sb.append(coreConfig.f4450O);
                    String b9 = R7.b.b(sb.toString());
                    SharedStorage sharedStorage = c1957l4.f14873a;
                    X7.a aVar = X7.a.MSPA_PURPOSE_HASH;
                    if (!AbstractC3292y.d(b9, sharedStorage.j(aVar)) || c1957l4.j()) {
                        if (c1957l4.m()) {
                            c1957l4.f14873a.e(X7.a.GBC_PURPOSE_HASH, c1957l4.e());
                        }
                        SharedStorage sharedStorage2 = c1957l4.f14873a;
                        J6.a coreConfig2 = c1957l4.f14875c.f4497b;
                        AbstractC3292y.i(coreConfig2, "coreConfig");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((Object) coreConfig2.f4445J);
                        sb2.append(coreConfig2.f4449N);
                        sb2.append(coreConfig2.f4450O);
                        sharedStorage2.e(aVar, R7.b.b(sb2.toString()));
                        c1957l4.f14873a.b(X7.a.MSPA_PURPOSE_CONSENT);
                        c1957l4.f14873a.b(X7.a.MSPA_SENSITIVE_PURPOSE_CONSENT);
                        C1957l c1957l5 = f19051d;
                        if (c1957l5 == null) {
                            AbstractC3292y.y("viewModel");
                            c1957l5 = null;
                        }
                        if (!c1957l5.k()) {
                            H6.i.f3302a.b(Y7.d.f13152a.h());
                        }
                        C1957l c1957l6 = f19051d;
                        if (c1957l6 == null) {
                            AbstractC3292y.y("viewModel");
                        } else {
                            c1957l2 = c1957l6;
                        }
                        if (c1957l2.f14875c.f4497b.f4453R) {
                            context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN").putExtra("EXTRA_FORCE", false));
                            return;
                        }
                        return;
                    }
                }
            }
            A5.b.a(A5.b.f238a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, A5.c.CONSOLE, null, 22);
            return;
        }
        choiceCmp.a(context, false);
    }

    public static final void forceDisplayUI(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        ChoiceCmp choiceCmp = INSTANCE;
        if (choiceCmp.isViewModelAvailable$app_release()) {
            choiceCmp.a(activity, true);
        } else {
            A5.b.a(A5.b.f238a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
        }
    }

    public static final GDPRData getGDPRData(Set<Integer> set) {
        if (INSTANCE.isViewModelAvailable$app_release()) {
            return new GDPRData(set);
        }
        return null;
    }

    public static /* synthetic */ GDPRData getGDPRData$default(Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = null;
        }
        return getGDPRData(set);
    }

    public static final NonIABData getNonIABData(Set<Integer> set) {
        boolean z8;
        Map<Integer, Boolean> map;
        C1957l c1957l = null;
        if (!INSTANCE.isViewModelAvailable$app_release()) {
            return null;
        }
        C1957l c1957l2 = f19051d;
        if (c1957l2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            c1957l = c1957l2;
        }
        if (c1957l.f14873a.i(X7.a.TCF_GDPR_APPLIES) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        String j8 = c1957l.f14873a.j(X7.a.NON_IAB_CONSENT_ENCODED);
        Map<Integer, Boolean> map2 = c1957l.f14874b.f1407A.getMap();
        if (set == null) {
            map = map2;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Integer, Boolean> entry : map2.entrySet()) {
                if (set.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        }
        return new NonIABData(z8, false, false, j8, map);
    }

    public static /* synthetic */ NonIABData getNonIABData$default(Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = null;
        }
        return getNonIABData(set);
    }

    public static final void showCCPAScreen(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            C1957l c1957l = f19051d;
            C1957l c1957l2 = null;
            if (c1957l == null) {
                AbstractC3292y.y("viewModel");
                c1957l = null;
            }
            if (c1957l.l()) {
                C1957l c1957l3 = f19051d;
                if (c1957l3 == null) {
                    AbstractC3292y.y("viewModel");
                    c1957l3 = null;
                }
                if (c1957l3.f14875c.f4497b.f4456b.contains("USP")) {
                    C1957l c1957l4 = f19051d;
                    if (c1957l4 == null) {
                        AbstractC3292y.y("viewModel");
                    } else {
                        c1957l2 = c1957l4;
                    }
                    if (c1957l2.k()) {
                        activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_CCPA_SCREEN"));
                        return;
                    }
                }
                A5.b.a(A5.b.f238a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, A5.c.CONSOLE, null, 22);
                return;
            }
        }
        A5.b.a(A5.b.f238a, ChoiceError.INVALID_LOCATION, null, null, A5.c.CONSOLE, null, 22);
    }

    public static final void showGBCScreen(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            if (C2001i.f15173b) {
                activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_GBC_SCREEN"));
                return;
            } else {
                A5.b.a(A5.b.f238a, ChoiceError.GBC_NOT_APPLICABLE, null, null, null, null, 30);
                return;
            }
        }
        A5.b.a(A5.b.f238a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
    }

    public static final void showUSRegulationScreen(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        if (INSTANCE.isViewModelAvailable$app_release()) {
            C1957l c1957l = f19051d;
            C1957l c1957l2 = null;
            if (c1957l == null) {
                AbstractC3292y.y("viewModel");
                c1957l = null;
            }
            if (c1957l.l()) {
                C1957l c1957l3 = f19051d;
                if (c1957l3 == null) {
                    AbstractC3292y.y("viewModel");
                    c1957l3 = null;
                }
                if (c1957l3.o()) {
                    C1957l c1957l4 = f19051d;
                    if (c1957l4 == null) {
                        AbstractC3292y.y("viewModel");
                    } else {
                        c1957l2 = c1957l4;
                    }
                    if (!c1957l2.k()) {
                        H6.i.f3302a.b(Y7.d.f13152a.h());
                    }
                    activity.startActivity(new Intent(activity, (Class<?>) CmpActivity.class).addFlags(268435456).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).putExtra("EXTRA_ACTION", "ACTION_SHOW_US_REGULATION_SCREEN").putExtra("EXTRA_FORCE", true));
                    return;
                }
                A5.b.a(A5.b.f238a, ChoiceError.US_PRIVACY_NOT_APPLICABLE, null, null, A5.c.CONSOLE, null, 22);
                return;
            }
        }
        A5.b.a(A5.b.f238a, ChoiceError.INVALID_LOCATION, null, null, A5.c.CONSOLE, null, 22);
    }

    public static final void startChoice(Application application, String packageId, String pCode, ChoiceCmpCallback callback, ChoiceStyle resources) {
        String str;
        Typeface font;
        Typeface font2;
        q qVar;
        U7.c cVar;
        m mVar;
        o oVar;
        U7.k kVar;
        AbstractC3292y.i(application, "app");
        AbstractC3292y.i(packageId, "packageId");
        AbstractC3292y.i(pCode, "pCode");
        AbstractC3292y.i(callback, "callback");
        AbstractC3292y.i(resources, "choiceStyle");
        ChoiceCmp choiceCmp = INSTANCE;
        f19048a = callback;
        f19049b = packageId;
        choiceCmp.getClass();
        Matcher matcher = f19054g.matcher(pCode);
        if (matcher.matches()) {
            str = matcher.group(2);
        } else {
            str = null;
        }
        if (str == null) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_PCODE, null, null, null, null, 30);
            str = null;
        }
        if (str == null) {
            str = null;
        }
        if (str == null) {
            return;
        }
        f19050c = str;
        Y7.d dVar = Y7.d.f13152a;
        AbstractC3292y.i(application, "<set-?>");
        Y7.d.f13153b = application;
        AbstractC3292y.i(resources, "resources");
        Y7.d.f13155d = resources;
        Integer boldFont = resources.getBoldFont();
        if (boldFont == null) {
            font = null;
        } else {
            font = ResourcesCompat.getFont(dVar.b(), boldFont.intValue());
        }
        Integer regularFont = resources.getRegularFont();
        if (regularFont == null) {
            font2 = null;
        } else {
            font2 = ResourcesCompat.getFont(dVar.b(), regularFont.intValue());
        }
        Y7.d.f13156e = new S7.b(font, font2);
        if (f19051d == null) {
            SharedStorage m8 = dVar.m();
            s n8 = dVar.n();
            J6.f j8 = dVar.j();
            if (Y7.d.f13168q == null) {
                Y7.d.f13168q = new r(dVar.b(), dVar.i(), dVar.a(), dVar.m(), dVar.l(), new n(dVar.a()));
            }
            q qVar2 = Y7.d.f13168q;
            if (qVar2 == null) {
                AbstractC3292y.y("gvlRepository_");
                qVar = null;
            } else {
                qVar = qVar2;
            }
            if (Y7.d.f13169r == null) {
                Y7.d.f13169r = new U7.d(dVar.i(), dVar.m(), dVar.l(), new W7.b(dVar.b(), dVar.a()));
            }
            U7.c cVar2 = Y7.d.f13169r;
            if (cVar2 == null) {
                AbstractC3292y.y("cmpRepository_");
                cVar = null;
            } else {
                cVar = cVar2;
            }
            u k8 = dVar.k();
            w p8 = dVar.p();
            if (Y7.d.f13174w == null) {
                Y7.d.f13174w = new U7.n(dVar.i(), dVar.l(), new W7.g());
            }
            m mVar2 = Y7.d.f13174w;
            if (mVar2 == null) {
                AbstractC3292y.y("geoIPRepository_");
                mVar = null;
            } else {
                mVar = mVar2;
            }
            if (Y7.d.f13175x == null) {
                Y7.d.f13175x = new p(dVar.i(), dVar.m(), dVar.l(), new W7.h());
            }
            o oVar2 = Y7.d.f13175x;
            if (oVar2 == null) {
                AbstractC3292y.y("googleVendorsRepository_");
                oVar = null;
            } else {
                oVar = oVar2;
            }
            if (Y7.d.f13150A == null) {
                Y7.d.f13150A = new U7.l(dVar.a(), dVar.i(), dVar.m(), dVar.l(), new W7.f());
            }
            U7.k kVar2 = Y7.d.f13150A;
            if (kVar2 == null) {
                AbstractC3292y.y("gbcRepository");
                kVar = null;
            } else {
                kVar = kVar2;
            }
            f19051d = new C1957l(m8, n8, j8, qVar, cVar, k8, p8, mVar, oVar, kVar, dVar.c());
            choiceCmp.a();
        }
        j applicationLifecycleCallback = new j();
        AbstractC3292y.i(application, "application");
        AbstractC3292y.i(applicationLifecycleCallback, "applicationLifecycleCallback");
        application.registerActivityLifecycleCallbacks(new Y7.b(applicationLifecycleCallback));
    }

    public static /* synthetic */ void startChoice$default(Application application, String str, String str2, ChoiceCmpCallback choiceCmpCallback, ChoiceStyle choiceStyle, int i8, Object obj) {
        if ((i8 & 16) != 0) {
            choiceStyle = new ChoiceStyle();
        }
        startChoice(application, str, str2, choiceCmpCallback, choiceStyle);
    }

    public final void a(Context context, boolean z8) {
        C1957l c1957l = f19051d;
        C1957l c1957l2 = null;
        if (c1957l == null) {
            AbstractC3292y.y("viewModel");
            c1957l = null;
        }
        if (!c1957l.l()) {
            C1957l c1957l3 = f19051d;
            if (c1957l3 == null) {
                AbstractC3292y.y("viewModel");
                c1957l3 = null;
            }
            if (c1957l3.f14875c.f4497b.f4456b.contains("GDPR") && c1957l3.b()) {
                C1957l c1957l4 = f19051d;
                if (c1957l4 == null) {
                    AbstractC3292y.y("viewModel");
                } else {
                    c1957l2 = c1957l4;
                }
                if (c1957l2.s() || z8) {
                    context.startActivity(new Intent(context, (Class<?>) CmpActivity.class).addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL).addFlags(268435456).putExtra("EXTRA_ACTION", "ACTION_SHOW_CMP_DIALOG").putExtra("EXTRA_FORCE", z8));
                    return;
                }
                return;
            }
        }
        A5.b.a(A5.b.f238a, ChoiceError.GDPR_NA, null, null, A5.c.CONSOLE, null, 22);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.cmp.ChoiceCmp.b
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.cmp.ChoiceCmp$b r0 = (com.inmobi.cmp.ChoiceCmp.b) r0
            int r1 = r0.f19057c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19057c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$b r0 = new com.inmobi.cmp.ChoiceCmp$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19055a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f19057c
            java.lang.String r3 = "viewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            Q5.t.b(r8)
            goto L85
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            Q5.t.b(r8)
            goto L5b
        L3b:
            Q5.t.b(r8)
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f19051d
            if (r8 != 0) goto L46
            kotlin.jvm.internal.AbstractC3292y.y(r3)
            r8 = r6
        L46:
            r0.f19057c = r5
            r8.getClass()
            n6.I r2 = n6.C3445b0.b()
            b.g r5 = new b.g
            r5.<init>(r8, r6)
            java.lang.Object r8 = n6.AbstractC3458i.g(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            L5.c r8 = (L5.c) r8
            Y7.d r2 = Y7.d.f13152a
            java.lang.String r2 = "gbcPurpose"
            kotlin.jvm.internal.AbstractC3292y.i(r8, r2)
            Y7.d.f13163l = r8
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f19051d
            if (r8 != 0) goto L6e
            kotlin.jvm.internal.AbstractC3292y.y(r3)
            goto L6f
        L6e:
            r6 = r8
        L6f:
            r6.getClass()
            c.i r8 = c.C2001i.f15172a
            boolean r8 = r6.m()
            c.C2001i.f15173b = r8
            com.inmobi.cmp.ChoiceCmp r8 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f19057c = r4
            java.lang.Object r8 = r8.h(r0)
            if (r8 != r1) goto L85
            return r1
        L85:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.b(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(U5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.inmobi.cmp.ChoiceCmp.c
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.cmp.ChoiceCmp$c r0 = (com.inmobi.cmp.ChoiceCmp.c) r0
            int r1 = r0.f19060c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19060c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$c r0 = new com.inmobi.cmp.ChoiceCmp$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f19058a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f19060c
            java.lang.String r3 = "viewModel"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            Q5.t.b(r8)
            goto L84
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            Q5.t.b(r8)
            goto L5b
        L3b:
            Q5.t.b(r8)
            b.l r8 = com.inmobi.cmp.ChoiceCmp.f19051d
            if (r8 != 0) goto L46
            kotlin.jvm.internal.AbstractC3292y.y(r3)
            r8 = r6
        L46:
            r0.f19060c = r5
            r8.getClass()
            n6.I r2 = n6.C3445b0.b()
            b.h r5 = new b.h
            r5.<init>(r8, r6)
            java.lang.Object r8 = n6.AbstractC3458i.g(r2, r5, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            O5.b r8 = (O5.b) r8
            b.l r2 = com.inmobi.cmp.ChoiceCmp.f19051d
            if (r2 != 0) goto L65
            kotlin.jvm.internal.AbstractC3292y.y(r3)
            r2 = r6
        L65:
            r2.f14886n = r8
            Y7.d r2 = Y7.d.f13152a
            if (r8 != 0) goto L6c
            goto L6e
        L6c:
            java.lang.String r6 = r8.f7877b
        L6e:
            if (r6 != 0) goto L72
            java.lang.String r6 = ""
        L72:
            java.lang.String r8 = "region"
            kotlin.jvm.internal.AbstractC3292y.i(r6, r8)
            Y7.d.f13165n = r6
            com.inmobi.cmp.ChoiceCmp r8 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f19060c = r4
            java.lang.Object r8 = r8.g(r0)
            if (r8 != r1) goto L84
            return r1
        L84:
            Q5.I r8 = Q5.I.f8786a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.c(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(U5.d r14) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.d(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(U5.d r11) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.e(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.cmp.ChoiceCmp.f
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.cmp.ChoiceCmp$f r0 = (com.inmobi.cmp.ChoiceCmp.f) r0
            int r1 = r0.f19069c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19069c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$f r0 = new com.inmobi.cmp.ChoiceCmp$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19067a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f19069c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r7)
            goto L71
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            Q5.t.b(r7)
            goto L5b
        L38:
            Q5.t.b(r7)
            b.l r7 = com.inmobi.cmp.ChoiceCmp.f19051d
            r2 = 0
            if (r7 != 0) goto L46
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.AbstractC3292y.y(r7)
            r7 = r2
        L46:
            r0.f19069c = r4
            r7.getClass()
            n6.I r4 = n6.C3445b0.b()
            b.j r5 = new b.j
            r5.<init>(r7, r2)
            java.lang.Object r7 = n6.AbstractC3458i.g(r4, r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            H6.a r7 = (H6.a) r7
            Y7.d r2 = Y7.d.f13152a
            java.lang.String r2 = "mspaConfig"
            kotlin.jvm.internal.AbstractC3292y.i(r7, r2)
            Y7.d.f13164m = r7
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f19069c = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.f(U5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(U5.d r9) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.g(U5.d):java.lang.Object");
    }

    public final String getAppPackageId() {
        return f19049b;
    }

    public final ChoiceCmpCallback getCallback() {
        return f19048a;
    }

    public final D5.e getGoogleVendorList$app_release() {
        C1957l c1957l = f19051d;
        if (c1957l == null) {
            AbstractC3292y.y("viewModel");
            c1957l = null;
        }
        return c1957l.f14885m;
    }

    public final String getPCode() {
        return f19050c;
    }

    public final J6.f getPortalConfig$app_release() {
        C1957l c1957l = null;
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        C1957l c1957l2 = f19051d;
        if (c1957l2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            c1957l = c1957l2;
        }
        return c1957l.f14875c;
    }

    public final s getTcModel$app_release() {
        C1957l c1957l = null;
        if (!isViewModelAvailable$app_release()) {
            return null;
        }
        C1957l c1957l2 = f19051d;
        if (c1957l2 == null) {
            AbstractC3292y.y("viewModel");
        } else {
            c1957l = c1957l2;
        }
        return c1957l.f14874b;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(U5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.inmobi.cmp.ChoiceCmp.h
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.cmp.ChoiceCmp$h r0 = (com.inmobi.cmp.ChoiceCmp.h) r0
            int r1 = r0.f19075c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19075c = r1
            goto L18
        L13:
            com.inmobi.cmp.ChoiceCmp$h r0 = new com.inmobi.cmp.ChoiceCmp$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19073a
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.f19075c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            Q5.t.b(r7)
            goto L68
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            Q5.t.b(r7)
            goto L5b
        L38:
            Q5.t.b(r7)
            b.l r7 = com.inmobi.cmp.ChoiceCmp.f19051d
            r2 = 0
            if (r7 != 0) goto L46
            java.lang.String r7 = "viewModel"
            kotlin.jvm.internal.AbstractC3292y.y(r7)
            r7 = r2
        L46:
            r0.f19075c = r4
            r7.getClass()
            n6.I r4 = n6.C3445b0.b()
            b.k r5 = new b.k
            r5.<init>(r7, r2)
            java.lang.Object r7 = n6.AbstractC3458i.g(r4, r5, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            S7.r r7 = (S7.r) r7
            com.inmobi.cmp.ChoiceCmp r7 = com.inmobi.cmp.ChoiceCmp.INSTANCE
            r0.f19075c = r3
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L68
            return r1
        L68:
            Q5.I r7 = Q5.I.f8786a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.h(U5.d):java.lang.Object");
    }

    public final boolean isViewModelAvailable$app_release() {
        C1957l c1957l = f19051d;
        if (c1957l != null && c1957l.f14884l) {
            return true;
        }
        return false;
    }

    public final PingReturn ping$app_release(boolean z8, CmpStatus cmpStatus, DisplayStatus displayStatus) {
        Integer valueOf;
        Integer valueOf2;
        AbstractC3292y.i(cmpStatus, "cmpStatus");
        AbstractC3292y.i(displayStatus, "displayStatus");
        if (f19051d != null) {
            C1957l c1957l = f19051d;
            C1957l c1957l2 = null;
            if (c1957l == null) {
                AbstractC3292y.y("viewModel");
                c1957l = null;
            }
            Boolean valueOf3 = Boolean.valueOf(c1957l.b());
            s tcModel$app_release = getTcModel$app_release();
            if (tcModel$app_release == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(tcModel$app_release.f1427n);
            }
            String valueOf4 = String.valueOf(valueOf);
            s tcModel$app_release2 = getTcModel$app_release();
            if (tcModel$app_release2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(tcModel$app_release2.f1426m);
            }
            C1957l c1957l3 = f19051d;
            if (c1957l3 == null) {
                AbstractC3292y.y("viewModel");
                c1957l3 = null;
            }
            Integer valueOf5 = Integer.valueOf(c1957l3.i());
            C1957l c1957l4 = f19051d;
            if (c1957l4 == null) {
                AbstractC3292y.y("viewModel");
            } else {
                c1957l2 = c1957l4;
            }
            return new PingReturn(valueOf3, z8, cmpStatus, displayStatus, MBridgeConstans.NATIVE_VIDEO_VERSION, valueOf4, valueOf2, valueOf5, Integer.valueOf(c1957l2.h()));
        }
        A5.b.a(A5.b.f238a, ChoiceError.MISSING_INITIALIZATION, null, null, null, null, 30);
        return new PingReturn(null, false, CmpStatus.ERROR, DisplayStatus.HIDDEN, MBridgeConstans.NATIVE_VIDEO_VERSION, null, null, null, null);
    }

    public final void setAppPackageId(String str) {
        AbstractC3292y.i(str, "<set-?>");
        f19049b = str;
    }

    public final void setCallback(ChoiceCmpCallback choiceCmpCallback) {
        f19048a = choiceCmpCallback;
    }

    public final void setPCode(String str) {
        AbstractC3292y.i(str, "<set-?>");
        f19050c = str;
    }

    public final void a() {
        M m8 = f19052e;
        if (m8 == null) {
            m8 = N.a(U0.b(null, 1, null));
        }
        M m9 = m8;
        f19052e = m9;
        if (m9 == null) {
            return;
        }
        AbstractC3462k.d(m9, f19053f, null, new k(null), 2, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 651
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final java.lang.Object a(U5.d r26) {
        /*
            Method dump skipped, instructions count: 2882
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.cmp.ChoiceCmp.a(U5.d):java.lang.Object");
    }

    /* loaded from: classes4.dex */
    public static final class i extends U5.a implements J {
        public i(J.a aVar) {
            super(aVar);
        }

        @Override // n6.J
        public void handleException(U5.g gVar, Throwable th) {
        }
    }
}
