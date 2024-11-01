package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.ArrayMap;
import androidx.collection.LruCache;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2124e0;
import com.google.android.gms.internal.measurement.C2257t5;
import com.google.android.gms.internal.measurement.C2302z2;
import com.google.android.gms.internal.measurement.E7;
import com.google.android.gms.internal.measurement.I7;
import com.google.android.gms.internal.measurement.K7;
import com.google.android.gms.internal.measurement.P1;
import com.google.android.gms.internal.measurement.R1;
import com.google.android.gms.internal.measurement.S1;
import com.google.android.gms.measurement.internal.A3;
import com.google.android.gms.measurement.internal.I2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class I2 extends E5 implements InterfaceC2363i {

    /* renamed from: d, reason: collision with root package name */
    private final Map f17396d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f17397e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f17398f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f17399g;

    /* renamed from: h, reason: collision with root package name */
    private final Map f17400h;

    /* renamed from: i, reason: collision with root package name */
    private final Map f17401i;

    /* renamed from: j, reason: collision with root package name */
    final LruCache f17402j;

    /* renamed from: k, reason: collision with root package name */
    final I7 f17403k;

    /* renamed from: l, reason: collision with root package name */
    private final Map f17404l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f17405m;

    /* renamed from: n, reason: collision with root package name */
    private final Map f17406n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public I2(H5 h52) {
        super(h52);
        this.f17396d = new ArrayMap();
        this.f17397e = new ArrayMap();
        this.f17398f = new ArrayMap();
        this.f17399g = new ArrayMap();
        this.f17400h = new ArrayMap();
        this.f17404l = new ArrayMap();
        this.f17405m = new ArrayMap();
        this.f17406n = new ArrayMap();
        this.f17401i = new ArrayMap();
        this.f17402j = new K2(this, 20);
        this.f17403k = new N2(this);
    }

    private final com.google.android.gms.internal.measurement.S1 A(String str, byte[] bArr) {
        Long l8;
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.S1.O();
        }
        try {
            com.google.android.gms.internal.measurement.S1 s12 = (com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) ((S1.a) Z5.G(com.google.android.gms.internal.measurement.S1.M(), bArr)).m());
            C2415p2 K8 = a().K();
            String str2 = null;
            if (s12.Z()) {
                l8 = Long.valueOf(s12.K());
            } else {
                l8 = null;
            }
            if (s12.X()) {
                str2 = s12.Q();
            }
            K8.c("Parsed config. version, gmp_app_id", l8, str2);
            return s12;
        } catch (com.google.android.gms.internal.measurement.A4 e8) {
            a().L().c("Unable to merge remote config. appId", C2401n2.s(str), e8);
            return com.google.android.gms.internal.measurement.S1.O();
        } catch (RuntimeException e9) {
            a().L().c("Unable to merge remote config. appId", C2401n2.s(str), e9);
            return com.google.android.gms.internal.measurement.S1.O();
        }
    }

    private static A3.a B(P1.e eVar) {
        int i8 = O2.f17489b[eVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        return null;
                    }
                    return A3.a.AD_PERSONALIZATION;
                }
                return A3.a.AD_USER_DATA;
            }
            return A3.a.ANALYTICS_STORAGE;
        }
        return A3.a.AD_STORAGE;
    }

    private static Map C(com.google.android.gms.internal.measurement.S1 s12) {
        ArrayMap arrayMap = new ArrayMap();
        if (s12 != null) {
            for (com.google.android.gms.internal.measurement.W1 w12 : s12.V()) {
                arrayMap.put(w12.H(), w12.I());
            }
        }
        return arrayMap;
    }

    private final void F(String str, S1.a aVar) {
        HashSet hashSet = new HashSet();
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        if (aVar != null) {
            Iterator it = aVar.y().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.google.android.gms.internal.measurement.Q1) it.next()).H());
            }
            for (int i8 = 0; i8 < aVar.q(); i8++) {
                R1.a aVar2 = (R1.a) aVar.r(i8).x();
                if (aVar2.s().isEmpty()) {
                    a().L().a("EventConfig contained null event name");
                } else {
                    String s8 = aVar2.s();
                    String b9 = l0.q.b(aVar2.s());
                    if (!TextUtils.isEmpty(b9)) {
                        aVar2 = aVar2.r(b9);
                        aVar.s(i8, aVar2);
                    }
                    if (aVar2.x() && aVar2.t()) {
                        arrayMap.put(s8, Boolean.TRUE);
                    }
                    if (aVar2.y() && aVar2.w()) {
                        arrayMap2.put(aVar2.s(), Boolean.TRUE);
                    }
                    if (aVar2.A()) {
                        if (aVar2.q() >= 2 && aVar2.q() <= 65535) {
                            arrayMap3.put(aVar2.s(), Integer.valueOf(aVar2.q()));
                        } else {
                            a().L().c("Invalid sampling rate. Event name, sample rate", aVar2.s(), Integer.valueOf(aVar2.q()));
                        }
                    }
                }
            }
        }
        this.f17397e.put(str, hashSet);
        this.f17398f.put(str, arrayMap);
        this.f17399g.put(str, arrayMap2);
        this.f17401i.put(str, arrayMap3);
    }

    private final void G(final String str, com.google.android.gms.internal.measurement.S1 s12) {
        if (s12.j() == 0) {
            this.f17402j.remove(str);
            return;
        }
        a().K().b("EES programs found", Integer.valueOf(s12.j()));
        com.google.android.gms.internal.measurement.A2 a22 = (com.google.android.gms.internal.measurement.A2) s12.U().get(0);
        try {
            com.google.android.gms.internal.measurement.C c8 = new com.google.android.gms.internal.measurement.C();
            c8.c("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.J2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C2257t5("internal.remoteConfig", new M2(I2.this, str));
                }
            });
            c8.c("internal.appMetadata", new Callable() { // from class: l0.m
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final I2 i22 = I2.this;
                    final String str2 = str;
                    return new K7("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.H2
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            I2 i23 = I2.this;
                            String str3 = str2;
                            C2324c2 M02 = i23.n().M0(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put(CampaignEx.JSON_KEY_PACKAGE_NAME, str3);
                            hashMap.put("gmp_version", 106000L);
                            if (M02 != null) {
                                String o8 = M02.o();
                                if (o8 != null) {
                                    hashMap.put("app_version", o8);
                                }
                                hashMap.put("app_version_int", Long.valueOf(M02.U()));
                                hashMap.put("dynamite_version", Long.valueOf(M02.v0()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            c8.c("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.L2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new E7(I2.this.f17403k);
                }
            });
            c8.b(a22);
            this.f17402j.put(str, c8);
            a().K().c("EES program loaded for appId, activities", str, Integer.valueOf(a22.G().j()));
            Iterator it = a22.G().I().iterator();
            while (it.hasNext()) {
                a().K().b("EES program activity", ((C2302z2) it.next()).H());
            }
        } catch (C2124e0 unused) {
            a().G().b("Failed to load EES program. appId", str);
        }
    }

    private final void g0(String str) {
        r();
        k();
        AbstractC1396p.f(str);
        if (this.f17400h.get(str) == null) {
            C2384l O02 = n().O0(str);
            if (O02 == null) {
                this.f17396d.put(str, null);
                this.f17398f.put(str, null);
                this.f17397e.put(str, null);
                this.f17399g.put(str, null);
                this.f17400h.put(str, null);
                this.f17404l.put(str, null);
                this.f17405m.put(str, null);
                this.f17406n.put(str, null);
                this.f17401i.put(str, null);
                return;
            }
            S1.a aVar = (S1.a) A(str, O02.f17917a).x();
            F(str, aVar);
            this.f17396d.put(str, C((com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m())));
            this.f17400h.put(str, (com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m()));
            G(str, (com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m()));
            this.f17404l.put(str, aVar.w());
            this.f17405m.put(str, O02.f17918b);
            this.f17406n.put(str, O02.f17919c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ com.google.android.gms.internal.measurement.C z(I2 i22, String str) {
        i22.r();
        AbstractC1396p.f(str);
        if (!i22.W(str)) {
            return null;
        }
        if (i22.f17400h.containsKey(str) && i22.f17400h.get(str) != null) {
            i22.G(str, (com.google.android.gms.internal.measurement.S1) i22.f17400h.get(str));
        } else {
            i22.g0(str);
        }
        return (com.google.android.gms.internal.measurement.C) i22.f17402j.snapshot().get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final l0.p E(String str, A3.a aVar) {
        k();
        g0(str);
        com.google.android.gms.internal.measurement.P1 J8 = J(str);
        if (J8 == null) {
            return l0.p.UNINITIALIZED;
        }
        for (P1.a aVar2 : J8.L()) {
            if (B(aVar2.I()) == aVar) {
                int i8 = O2.f17490c[aVar2.H().ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        return l0.p.UNINITIALIZED;
                    }
                    return l0.p.GRANTED;
                }
                return l0.p.DENIED;
            }
        }
        return l0.p.UNINITIALIZED;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean H(String str, byte[] bArr, String str2, String str3) {
        r();
        k();
        AbstractC1396p.f(str);
        S1.a aVar = (S1.a) A(str, bArr).x();
        if (aVar == null) {
            return false;
        }
        F(str, aVar);
        G(str, (com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m()));
        this.f17400h.put(str, (com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m()));
        this.f17404l.put(str, aVar.w());
        this.f17405m.put(str, str2);
        this.f17406n.put(str, str3);
        this.f17396d.put(str, C((com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m())));
        n().c0(str, new ArrayList(aVar.x()));
        try {
            aVar.t();
            bArr = ((com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m())).i();
        } catch (RuntimeException e8) {
            a().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", C2401n2.s(str), e8);
        }
        C2377k n8 = n();
        AbstractC1396p.f(str);
        n8.k();
        n8.r();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (n8.B().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                n8.a().G().b("Failed to update remote config (got 0). appId", C2401n2.s(str));
            }
        } catch (SQLiteException e9) {
            n8.a().G().c("Error storing remote config. appId", C2401n2.s(str), e9);
        }
        this.f17400h.put(str, (com.google.android.gms.internal.measurement.S1) ((AbstractC2240r4) aVar.m()));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int I(String str, String str2) {
        Integer num;
        k();
        g0(str);
        Map map = (Map) this.f17401i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.P1 J(String str) {
        k();
        g0(str);
        com.google.android.gms.internal.measurement.S1 L8 = L(str);
        if (L8 != null && L8.W()) {
            return L8.L();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final A3.a K(String str, A3.a aVar) {
        k();
        g0(str);
        com.google.android.gms.internal.measurement.P1 J8 = J(str);
        if (J8 == null) {
            return null;
        }
        for (P1.c cVar : J8.K()) {
            if (aVar == B(cVar.I())) {
                return B(cVar.H());
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final com.google.android.gms.internal.measurement.S1 L(String str) {
        r();
        k();
        AbstractC1396p.f(str);
        g0(str);
        return (com.google.android.gms.internal.measurement.S1) this.f17400h.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean M(String str, A3.a aVar) {
        k();
        g0(str);
        com.google.android.gms.internal.measurement.P1 J8 = J(str);
        if (J8 == null) {
            return false;
        }
        Iterator it = J8.J().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            P1.a aVar2 = (P1.a) it.next();
            if (aVar == B(aVar2.I())) {
                if (aVar2.H() == P1.d.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean N(String str, String str2) {
        Boolean bool;
        k();
        g0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f17399g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String O(String str) {
        k();
        return (String) this.f17406n.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean P(String str, String str2) {
        Boolean bool;
        k();
        g0(str);
        if (X(str) && d6.J0(str2)) {
            return true;
        }
        if (Z(str) && d6.K0(str2)) {
            return true;
        }
        Map map = (Map) this.f17398f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String Q(String str) {
        k();
        return (String) this.f17405m.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String R(String str) {
        k();
        g0(str);
        return (String) this.f17404l.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set S(String str) {
        k();
        g0(str);
        return (Set) this.f17397e.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SortedSet T(String str) {
        k();
        g0(str);
        TreeSet treeSet = new TreeSet();
        com.google.android.gms.internal.measurement.P1 J8 = J(str);
        if (J8 == null) {
            return treeSet;
        }
        Iterator it = J8.I().iterator();
        while (it.hasNext()) {
            treeSet.add(((P1.f) it.next()).H());
        }
        return treeSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U(String str) {
        k();
        this.f17405m.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(String str) {
        k();
        this.f17400h.remove(str);
    }

    public final boolean W(String str) {
        com.google.android.gms.internal.measurement.S1 s12;
        if (TextUtils.isEmpty(str) || (s12 = (com.google.android.gms.internal.measurement.S1) this.f17400h.get(str)) == null || s12.j() == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean X(String str) {
        return "1".equals(h(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Y(String str) {
        k();
        g0(str);
        com.google.android.gms.internal.measurement.P1 J8 = J(str);
        if (J8 == null || !J8.N() || J8.M()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean Z(String str) {
        return "1".equals(h(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a0(String str) {
        k();
        g0(str);
        if (this.f17397e.get(str) != null && ((Set) this.f17397e.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b0(String str) {
        k();
        g0(str);
        if (this.f17397e.get(str) != null) {
            if (((Set) this.f17397e.get(str)).contains("device_model") || ((Set) this.f17397e.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0(String str) {
        k();
        g0(str);
        if (this.f17397e.get(str) != null && ((Set) this.f17397e.get(str)).contains("enhanced_user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d0(String str) {
        k();
        g0(str);
        if (this.f17397e.get(str) != null && ((Set) this.f17397e.get(str)).contains("google_signals")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e0(String str) {
        k();
        g0(str);
        if (this.f17397e.get(str) != null) {
            if (((Set) this.f17397e.get(str)).contains("os_version") || ((Set) this.f17397e.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f0(String str) {
        k();
        g0(str);
        if (this.f17397e.get(str) != null && ((Set) this.f17397e.get(str)).contains("user_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC2363i
    public final String h(String str, String str2) {
        k();
        g0(str);
        Map map = (Map) this.f17396d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ Z5 l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ h6 m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C2377k n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ I2 o() {
        return super.o();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ C2376j5 p() {
        return super.p();
    }

    @Override // com.google.android.gms.measurement.internal.F5
    public final /* bridge */ /* synthetic */ G5 q() {
        return super.q();
    }

    @Override // com.google.android.gms.measurement.internal.E5
    protected final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long v(String str) {
        String h8 = h(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(h8)) {
            try {
                return Long.parseLong(h8);
            } catch (NumberFormatException e8) {
                a().L().c("Unable to parse timezone offset. appId", C2401n2.s(str), e8);
                return 0L;
            }
        }
        return 0L;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ Context w() {
        return super.w();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ V.d x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2321c y() {
        return super.y();
    }
}
