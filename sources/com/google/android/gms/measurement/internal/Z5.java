package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import R.b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2123e;
import com.google.android.gms.internal.measurement.C2126e2;
import com.google.android.gms.internal.measurement.C2128e4;
import com.google.android.gms.internal.measurement.C2144g2;
import com.google.android.gms.internal.measurement.C2153h2;
import com.google.android.gms.internal.measurement.C2162i2;
import com.google.android.gms.internal.measurement.C2171j2;
import com.google.android.gms.internal.measurement.C2176j7;
import com.google.android.gms.internal.measurement.C2185k7;
import com.google.android.gms.internal.measurement.C2189l2;
import com.google.android.gms.internal.measurement.C2207n2;
import com.google.android.gms.internal.measurement.C2215o2;
import com.google.android.gms.internal.measurement.C2231q2;
import com.google.android.gms.internal.measurement.C2238r2;
import com.google.android.gms.internal.measurement.C2246s2;
import com.google.android.gms.internal.measurement.Q6;
import com.google.android.gms.internal.measurement.q7;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
public final class Z5 extends E5 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Z5(H5 h52) {
        super(h52);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle B(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2189l2 c2189l2 = (C2189l2) it.next();
            String W8 = c2189l2.W();
            if (c2189l2.Z()) {
                bundle.putDouble(W8, c2189l2.G());
            } else if (c2189l2.a0()) {
                bundle.putFloat(W8, c2189l2.N());
            } else if (c2189l2.d0()) {
                bundle.putString(W8, c2189l2.X());
            } else if (c2189l2.b0()) {
                bundle.putLong(W8, c2189l2.S());
            }
        }
        return bundle;
    }

    private final Bundle C(Map map, boolean z8) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof ArrayList) {
                if (z8) {
                    ArrayList arrayList = (ArrayList) obj;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj2 = arrayList.get(i8);
                        i8++;
                        arrayList2.add(C((Map) obj2, false));
                    }
                    bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2189l2 F(C2171j2 c2171j2, String str) {
        for (C2189l2 c2189l2 : c2171j2.V()) {
            if (c2189l2.W().equals(str)) {
                return c2189l2;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static com.google.android.gms.internal.measurement.X4 G(com.google.android.gms.internal.measurement.X4 x42, byte[] bArr) {
        C2128e4 a9 = C2128e4.a();
        if (a9 != null) {
            return x42.z(bArr, a9);
        }
        return x42.v(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object J(C2171j2 c2171j2, String str, Object obj) {
        Object f02 = f0(c2171j2, str);
        if (f02 == null) {
            return obj;
        }
        return f02;
    }

    private static String N(boolean z8, boolean z9, boolean z10) {
        StringBuilder sb = new StringBuilder();
        if (z8) {
            sb.append("Dynamic ");
        }
        if (z9) {
            sb.append("Sequence ");
        }
        if (z10) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List O(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i8 = 0; i8 < length; i8++) {
            long j8 = 0;
            for (int i9 = 0; i9 < 64; i9++) {
                int i10 = (i8 << 6) + i9;
                if (i10 < bitSet.length()) {
                    if (bitSet.get(i10)) {
                        j8 |= 1 << i9;
                    }
                }
            }
            arrayList.add(Long.valueOf(j8));
        }
        return arrayList;
    }

    private static void R(Uri.Builder builder, String str, String str2, Set set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void S(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                R(builder, str3, string, set);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void T(C2171j2.a aVar, String str, Object obj) {
        List I8 = aVar.I();
        int i8 = 0;
        while (true) {
            if (i8 < I8.size()) {
                if (str.equals(((C2189l2) I8.get(i8)).W())) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        C2189l2.a x8 = C2189l2.U().x(str);
        if (obj instanceof Long) {
            x8.s(((Long) obj).longValue());
        } else if (obj instanceof String) {
            x8.A((String) obj);
        } else if (obj instanceof Double) {
            x8.r(((Double) obj).doubleValue());
        }
        if (i8 >= 0) {
            aVar.s(i8, x8);
        } else {
            aVar.x(x8);
        }
    }

    private static void W(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            sb.append("  ");
        }
    }

    private final void X(StringBuilder sb, int i8, com.google.android.gms.internal.measurement.J1 j12) {
        if (j12 == null) {
            return;
        }
        W(sb, i8);
        sb.append("filter {\n");
        if (j12.N()) {
            a0(sb, i8, "complement", Boolean.valueOf(j12.M()));
        }
        if (j12.P()) {
            a0(sb, i8, "param_name", d().f(j12.L()));
        }
        if (j12.Q()) {
            int i9 = i8 + 1;
            com.google.android.gms.internal.measurement.M1 K8 = j12.K();
            if (K8 != null) {
                W(sb, i9);
                sb.append("string_filter");
                sb.append(" {\n");
                if (K8.O()) {
                    a0(sb, i9, "match_type", K8.G().name());
                }
                if (K8.N()) {
                    a0(sb, i9, "expression", K8.J());
                }
                if (K8.M()) {
                    a0(sb, i9, "case_sensitive", Boolean.valueOf(K8.L()));
                }
                if (K8.j() > 0) {
                    W(sb, i8 + 2);
                    sb.append("expression_list {\n");
                    for (String str : K8.K()) {
                        W(sb, i8 + 3);
                        sb.append(str);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                W(sb, i9);
                sb.append("}\n");
            }
        }
        if (j12.O()) {
            Y(sb, i8 + 1, "number_filter", j12.J());
        }
        W(sb, i8);
        sb.append("}\n");
    }

    private static void Y(StringBuilder sb, int i8, String str, com.google.android.gms.internal.measurement.K1 k12) {
        if (k12 == null) {
            return;
        }
        W(sb, i8);
        sb.append(str);
        sb.append(" {\n");
        if (k12.N()) {
            a0(sb, i8, "comparison_type", k12.G().name());
        }
        if (k12.P()) {
            a0(sb, i8, "match_as_float", Boolean.valueOf(k12.M()));
        }
        if (k12.O()) {
            a0(sb, i8, "comparison_value", k12.J());
        }
        if (k12.R()) {
            a0(sb, i8, "min_comparison_value", k12.L());
        }
        if (k12.Q()) {
            a0(sb, i8, "max_comparison_value", k12.K());
        }
        W(sb, i8);
        sb.append("}\n");
    }

    private static void Z(StringBuilder sb, int i8, String str, C2231q2 c2231q2) {
        Integer num;
        Integer num2;
        Long l8;
        if (c2231q2 == null) {
            return;
        }
        W(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (c2231q2.I() != 0) {
            W(sb, 4);
            sb.append("results: ");
            int i9 = 0;
            for (Long l9 : c2231q2.V()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(l9);
                i9 = i10;
            }
            sb.append('\n');
        }
        if (c2231q2.O() != 0) {
            W(sb, 4);
            sb.append("status: ");
            int i11 = 0;
            for (Long l10 : c2231q2.X()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(l10);
                i11 = i12;
            }
            sb.append('\n');
        }
        if (c2231q2.j() != 0) {
            W(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i13 = 0;
            for (C2162i2 c2162i2 : c2231q2.U()) {
                int i14 = i13 + 1;
                if (i13 != 0) {
                    sb.append(", ");
                }
                if (c2162i2.M()) {
                    num2 = Integer.valueOf(c2162i2.j());
                } else {
                    num2 = null;
                }
                sb.append(num2);
                sb.append(":");
                if (c2162i2.L()) {
                    l8 = Long.valueOf(c2162i2.I());
                } else {
                    l8 = null;
                }
                sb.append(l8);
                i13 = i14;
            }
            sb.append("}\n");
        }
        if (c2231q2.L() != 0) {
            W(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i15 = 0;
            for (C2238r2 c2238r2 : c2231q2.W()) {
                int i16 = i15 + 1;
                if (i15 != 0) {
                    sb.append(", ");
                }
                if (c2238r2.N()) {
                    num = Integer.valueOf(c2238r2.J());
                } else {
                    num = null;
                }
                sb.append(num);
                sb.append(": [");
                Iterator it = c2238r2.M().iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i17 = i18;
                }
                sb.append("]");
                i15 = i16;
            }
            sb.append("}\n");
        }
        W(sb, 3);
        sb.append("}\n");
    }

    private static void a0(StringBuilder sb, int i8, String str, Object obj) {
        if (obj == null) {
            return;
        }
        W(sb, i8 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    private final void b0(StringBuilder sb, int i8, List list) {
        String str;
        String str2;
        Long l8;
        if (list == null) {
            return;
        }
        int i9 = i8 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2189l2 c2189l2 = (C2189l2) it.next();
            if (c2189l2 != null) {
                W(sb, i9);
                sb.append("param {\n");
                Double d8 = null;
                if (c2189l2.c0()) {
                    str = d().f(c2189l2.W());
                } else {
                    str = null;
                }
                a0(sb, i9, "name", str);
                if (c2189l2.d0()) {
                    str2 = c2189l2.X();
                } else {
                    str2 = null;
                }
                a0(sb, i9, "string_value", str2);
                if (c2189l2.b0()) {
                    l8 = Long.valueOf(c2189l2.S());
                } else {
                    l8 = null;
                }
                a0(sb, i9, "int_value", l8);
                if (c2189l2.Z()) {
                    d8 = Double.valueOf(c2189l2.G());
                }
                a0(sb, i9, "double_value", d8);
                if (c2189l2.Q() > 0) {
                    b0(sb, i9, c2189l2.Y());
                }
                W(sb, i9);
                sb.append("}\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d0(E e8, M5 m52) {
        AbstractC1396p.l(e8);
        AbstractC1396p.l(m52);
        if (TextUtils.isEmpty(m52.f17458b) && TextUtils.isEmpty(m52.f17473q)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e0(List list, int i8) {
        if (i8 < (list.size() << 6)) {
            if (((1 << (i8 % 64)) & ((Long) list.get(i8 / 64)).longValue()) != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f0(C2171j2 c2171j2, String str) {
        C2189l2 F8 = F(c2171j2, str);
        if (F8 != null) {
            if (F8.d0()) {
                return F8.X();
            }
            if (F8.b0()) {
                return Long.valueOf(F8.S());
            }
            if (F8.Z()) {
                return Double.valueOf(F8.G());
            }
            if (F8.Q() > 0) {
                return i0(F8.Y());
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g0(String str) {
        if (str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle[] i0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2189l2 c2189l2 = (C2189l2) it.next();
            if (c2189l2 != null) {
                Bundle bundle = new Bundle();
                for (C2189l2 c2189l22 : c2189l2.Y()) {
                    if (c2189l22.d0()) {
                        bundle.putString(c2189l22.W(), c2189l22.X());
                    } else if (c2189l22.b0()) {
                        bundle.putLong(c2189l22.W(), c2189l22.S());
                    } else if (c2189l22.Z()) {
                        bundle.putDouble(c2189l22.W(), c2189l22.G());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(C2215o2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i8 = 0; i8 < aVar.Z(); i8++) {
            if (str.equals(aVar.H0(i8).U())) {
                return i8;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long A(byte[] bArr) {
        AbstractC1396p.l(bArr);
        g().k();
        MessageDigest V02 = d6.V0();
        if (V02 == null) {
            a().G().a("Failed to get MD5");
            return 0L;
        }
        return d6.B(V02.digest(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Parcelable D(byte[] bArr, Parcelable.Creator creator) {
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            obtain.unmarshall(bArr, 0, bArr.length);
            obtain.setDataPosition(0);
            return (Parcelable) creator.createFromParcel(obtain);
        } catch (b.a unused) {
            a().G().a("Failed to load parcelable from buffer");
            return null;
        } finally {
            obtain.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2171j2 E(B b9) {
        C2171j2.a w8 = C2171j2.S().w(b9.f17146e);
        Iterator it = b9.f17147f.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C2189l2.a x8 = C2189l2.U().x(str);
            Object I8 = b9.f17147f.I(str);
            AbstractC1396p.l(I8);
            U(x8, I8);
            w8.x(x8);
        }
        if (b().q(G.f17311j1) && !TextUtils.isEmpty(b9.f17144c) && b9.f17147f.I("_o") == null) {
            w8.y((C2189l2) ((AbstractC2240r4) C2189l2.U().x("_o").A(b9.f17144c).m()));
        }
        return (C2171j2) ((AbstractC2240r4) w8.m());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final E H(C2123e c2123e) {
        String str;
        Object obj;
        Bundle C8 = C(c2123e.g(), true);
        if (C8.containsKey("_o") && (obj = C8.get("_o")) != null) {
            str = obj.toString();
        } else {
            str = MBridgeConstans.DYNAMIC_VIEW_WX_APP;
        }
        String str2 = str;
        String b9 = l0.q.b(c2123e.e());
        if (b9 == null) {
            b9 = c2123e.e();
        }
        return new E(b9, new D(C8), str2, c2123e.a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final B5 I(String str, C2215o2.a aVar, C2171j2.a aVar2, String str2) {
        int indexOf;
        if (C2176j7.a() && b().F(str, G.f17247I0)) {
            long currentTimeMillis = x().currentTimeMillis();
            String[] split = b().D(str, G.f17304h0).split(",");
            HashSet hashSet = new HashSet(split.length);
            for (String str3 : split) {
                Objects.requireNonNull(str3);
                if (!hashSet.add(str3)) {
                    throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
                }
            }
            Set unmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
            G5 q8 = q();
            String R8 = q8.o().R(str);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(q8.b().D(str, G.f17283a0));
            if (!TextUtils.isEmpty(R8)) {
                builder.authority(R8 + "." + q8.b().D(str, G.f17286b0));
            } else {
                builder.authority(q8.b().D(str, G.f17286b0));
            }
            builder.path(q8.b().D(str, G.f17289c0));
            R(builder, "gmp_app_id", aVar.d1(), unmodifiableSet);
            R(builder, "gmp_version", "106000", unmodifiableSet);
            String a12 = aVar.a1();
            C2349g b9 = b();
            C2317b2 c2317b2 = G.f17253L0;
            if (b9.F(str, c2317b2) && o().a0(str)) {
                a12 = "";
            }
            R(builder, "app_instance_id", a12, unmodifiableSet);
            R(builder, "rdid", aVar.f1(), unmodifiableSet);
            R(builder, "bundle_id", aVar.Z0(), unmodifiableSet);
            String H8 = aVar2.H();
            String a9 = l0.q.a(H8);
            if (!TextUtils.isEmpty(a9)) {
                H8 = a9;
            }
            R(builder, "app_event_name", H8, unmodifiableSet);
            R(builder, "app_version", String.valueOf(aVar.N()), unmodifiableSet);
            String e12 = aVar.e1();
            if (b().F(str, c2317b2) && o().e0(str) && !TextUtils.isEmpty(e12) && (indexOf = e12.indexOf(".")) != -1) {
                e12 = e12.substring(0, indexOf);
            }
            R(builder, "os_version", e12, unmodifiableSet);
            R(builder, CampaignEx.JSON_KEY_TIMESTAMP, String.valueOf(aVar2.F()), unmodifiableSet);
            String str4 = "1";
            if (aVar.L()) {
                R(builder, "lat", "1", unmodifiableSet);
            }
            R(builder, "privacy_sandbox_version", String.valueOf(aVar.q()), unmodifiableSet);
            R(builder, "trigger_uri_source", "1", unmodifiableSet);
            R(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
            R(builder, "request_uuid", str2, unmodifiableSet);
            List<C2189l2> I8 = aVar2.I();
            Bundle bundle = new Bundle();
            for (C2189l2 c2189l2 : I8) {
                String W8 = c2189l2.W();
                if (c2189l2.Z()) {
                    bundle.putString(W8, String.valueOf(c2189l2.G()));
                } else if (c2189l2.a0()) {
                    bundle.putString(W8, String.valueOf(c2189l2.N()));
                } else if (c2189l2.d0()) {
                    bundle.putString(W8, c2189l2.X());
                } else if (c2189l2.b0()) {
                    bundle.putString(W8, String.valueOf(c2189l2.S()));
                }
            }
            S(builder, b().D(str, G.f17301g0).split("\\|"), bundle, unmodifiableSet);
            List<C2246s2> J8 = aVar.J();
            Bundle bundle2 = new Bundle();
            for (C2246s2 c2246s2 : J8) {
                String U8 = c2246s2.U();
                if (c2246s2.W()) {
                    bundle2.putString(U8, String.valueOf(c2246s2.G()));
                } else if (c2246s2.X()) {
                    bundle2.putString(U8, String.valueOf(c2246s2.L()));
                } else if (c2246s2.a0()) {
                    bundle2.putString(U8, c2246s2.V());
                } else if (c2246s2.Y()) {
                    bundle2.putString(U8, String.valueOf(c2246s2.P()));
                }
            }
            S(builder, b().D(str, G.f17298f0).split("\\|"), bundle2, unmodifiableSet);
            if (!aVar.K()) {
                str4 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            R(builder, "dma", str4, unmodifiableSet);
            if (!aVar.c1().isEmpty()) {
                R(builder, "dma_cps", aVar.c1(), unmodifiableSet);
            }
            if (b().q(G.f17257N0) && aVar.M()) {
                C2126e2 o02 = aVar.o0();
                if (!o02.b0().isEmpty()) {
                    R(builder, "dl_gclid", o02.b0(), unmodifiableSet);
                }
                if (!o02.a0().isEmpty()) {
                    R(builder, "dl_gbraid", o02.a0(), unmodifiableSet);
                }
                if (!o02.X().isEmpty()) {
                    R(builder, "dl_gs", o02.X(), unmodifiableSet);
                }
                if (o02.G() > 0) {
                    R(builder, "dl_ss_ts", String.valueOf(o02.G()), unmodifiableSet);
                }
                if (!o02.e0().isEmpty()) {
                    R(builder, "mr_gclid", o02.e0(), unmodifiableSet);
                }
                if (!o02.d0().isEmpty()) {
                    R(builder, "mr_gbraid", o02.d0(), unmodifiableSet);
                }
                if (!o02.c0().isEmpty()) {
                    R(builder, "mr_gs", o02.c0(), unmodifiableSet);
                }
                if (o02.K() > 0) {
                    R(builder, "mr_click_ts", String.valueOf(o02.K()), unmodifiableSet);
                }
            }
            return new B5(builder.build().toString(), currentTimeMillis, 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String K(com.google.android.gms.internal.measurement.I1 i12) {
        if (i12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (i12.T()) {
            a0(sb, 0, "filter_id", Integer.valueOf(i12.J()));
        }
        a0(sb, 0, "event_name", d().c(i12.N()));
        String N8 = N(i12.P(), i12.Q(), i12.R());
        if (!N8.isEmpty()) {
            a0(sb, 0, "filter_type", N8);
        }
        if (i12.S()) {
            Y(sb, 1, "event_count_filter", i12.M());
        }
        if (i12.j() > 0) {
            sb.append("  filters {\n");
            Iterator it = i12.O().iterator();
            while (it.hasNext()) {
                X(sb, 2, (com.google.android.gms.internal.measurement.J1) it.next());
            }
        }
        W(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String L(com.google.android.gms.internal.measurement.L1 l12) {
        if (l12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (l12.O()) {
            a0(sb, 0, "filter_id", Integer.valueOf(l12.j()));
        }
        a0(sb, 0, "property_name", d().g(l12.K()));
        String N8 = N(l12.L(), l12.M(), l12.N());
        if (!N8.isEmpty()) {
            a0(sb, 0, "filter_type", N8);
        }
        X(sb, 1, l12.H());
        sb.append("}\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String M(C2207n2 c2207n2) {
        Long l8;
        Long l9;
        C2144g2 t22;
        if (c2207n2 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (q7.a() && b().q(G.f17344y0) && c2207n2.j() > 0) {
            g();
            if (d6.H0(c2207n2.H(0).x2())) {
                if (c2207n2.T()) {
                    a0(sb, 0, "upload_subdomain", c2207n2.Q());
                }
                if (c2207n2.S()) {
                    a0(sb, 0, "sgtm_join_id", c2207n2.P());
                }
            }
        }
        for (C2215o2 c2215o2 : c2207n2.R()) {
            if (c2215o2 != null) {
                W(sb, 1);
                sb.append("bundle {\n");
                if (c2215o2.R0()) {
                    a0(sb, 1, "protocol_version", Integer.valueOf(c2215o2.w1()));
                }
                if (C2185k7.a() && b().F(c2215o2.x2(), G.f17342x0) && c2215o2.U0()) {
                    a0(sb, 1, "session_stitching_token", c2215o2.i0());
                }
                a0(sb, 1, "platform", c2215o2.g0());
                if (c2215o2.M0()) {
                    a0(sb, 1, "gmp_version", Long.valueOf(c2215o2.f2()));
                }
                if (c2215o2.Z0()) {
                    a0(sb, 1, "uploading_gmp_version", Long.valueOf(c2215o2.r2()));
                }
                if (c2215o2.K0()) {
                    a0(sb, 1, "dynamite_version", Long.valueOf(c2215o2.Y1()));
                }
                if (c2215o2.D0()) {
                    a0(sb, 1, "config_version", Long.valueOf(c2215o2.Q1()));
                }
                a0(sb, 1, "gmp_app_id", c2215o2.d0());
                a0(sb, 1, "admob_app_id", c2215o2.w2());
                a0(sb, 1, MBridgeConstans.APP_ID, c2215o2.x2());
                a0(sb, 1, "app_version", c2215o2.W());
                if (c2215o2.s0()) {
                    a0(sb, 1, "app_version_major", Integer.valueOf(c2215o2.u0()));
                }
                a0(sb, 1, "firebase_instance_id", c2215o2.c0());
                if (c2215o2.I0()) {
                    a0(sb, 1, "dev_cert_hash", Long.valueOf(c2215o2.U1()));
                }
                a0(sb, 1, "app_store", c2215o2.V());
                if (c2215o2.Y0()) {
                    a0(sb, 1, "upload_timestamp_millis", Long.valueOf(c2215o2.p2()));
                }
                if (c2215o2.V0()) {
                    a0(sb, 1, "start_timestamp_millis", Long.valueOf(c2215o2.l2()));
                }
                if (c2215o2.L0()) {
                    a0(sb, 1, "end_timestamp_millis", Long.valueOf(c2215o2.c2()));
                }
                if (c2215o2.Q0()) {
                    a0(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(c2215o2.j2()));
                }
                if (c2215o2.P0()) {
                    a0(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(c2215o2.h2()));
                }
                a0(sb, 1, "app_instance_id", c2215o2.U());
                a0(sb, 1, "resettable_device_id", c2215o2.h0());
                a0(sb, 1, "ds_id", c2215o2.b0());
                if (c2215o2.O0()) {
                    a0(sb, 1, "limited_ad_tracking", Boolean.valueOf(c2215o2.p0()));
                }
                a0(sb, 1, "os_version", c2215o2.f0());
                a0(sb, 1, "device_model", c2215o2.a0());
                a0(sb, 1, "user_default_language", c2215o2.j0());
                if (c2215o2.X0()) {
                    a0(sb, 1, "time_zone_offset_minutes", Integer.valueOf(c2215o2.G1()));
                }
                if (c2215o2.C0()) {
                    a0(sb, 1, "bundle_sequential_index", Integer.valueOf(c2215o2.a1()));
                }
                if (q7.a()) {
                    g();
                    if (d6.H0(c2215o2.x2()) && b().q(G.f17344y0) && c2215o2.H0()) {
                        a0(sb, 1, "delivery_index", Integer.valueOf(c2215o2.j1()));
                    }
                }
                if (c2215o2.T0()) {
                    a0(sb, 1, "service_upload", Boolean.valueOf(c2215o2.q0()));
                }
                a0(sb, 1, "health_monitor", c2215o2.e0());
                if (c2215o2.S0()) {
                    a0(sb, 1, "retry_counter", Integer.valueOf(c2215o2.B1()));
                }
                if (c2215o2.F0()) {
                    a0(sb, 1, "consent_signals", c2215o2.Y());
                }
                if (c2215o2.N0()) {
                    a0(sb, 1, "is_dma_region", Boolean.valueOf(c2215o2.o0()));
                }
                if (c2215o2.G0()) {
                    a0(sb, 1, "core_platform_services", c2215o2.Z());
                }
                if (c2215o2.E0()) {
                    a0(sb, 1, "consent_diagnostics", c2215o2.X());
                }
                if (c2215o2.W0()) {
                    a0(sb, 1, "target_os_version", Long.valueOf(c2215o2.n2()));
                }
                if (C2176j7.a() && b().F(c2215o2.x2(), G.f17247I0)) {
                    a0(sb, 1, "ad_services_version", Integer.valueOf(c2215o2.j()));
                    if (c2215o2.t0() && (t22 = c2215o2.t2()) != null) {
                        W(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        a0(sb, 2, "eligible", Boolean.valueOf(t22.R()));
                        a0(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(t22.U()));
                        a0(sb, 2, "pre_r", Boolean.valueOf(t22.V()));
                        a0(sb, 2, "r_extensions_too_old", Boolean.valueOf(t22.W()));
                        a0(sb, 2, "adservices_extension_too_old", Boolean.valueOf(t22.P()));
                        a0(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(t22.N()));
                        a0(sb, 2, "measurement_manager_disabled", Boolean.valueOf(t22.T()));
                        W(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (Q6.a() && b().q(G.f17273V0) && c2215o2.r0()) {
                    C2126e2 s22 = c2215o2.s2();
                    W(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (s22.h0()) {
                        a0(sb, 2, "deep_link_gclid", s22.b0());
                    }
                    if (s22.g0()) {
                        a0(sb, 2, "deep_link_gbraid", s22.a0());
                    }
                    if (s22.f0()) {
                        a0(sb, 2, "deep_link_gad_source", s22.X());
                    }
                    if (s22.i0()) {
                        a0(sb, 2, "deep_link_session_millis", Long.valueOf(s22.G()));
                    }
                    if (s22.m0()) {
                        a0(sb, 2, "market_referrer_gclid", s22.e0());
                    }
                    if (s22.l0()) {
                        a0(sb, 2, "market_referrer_gbraid", s22.d0());
                    }
                    if (s22.k0()) {
                        a0(sb, 2, "market_referrer_gad_source", s22.c0());
                    }
                    if (s22.j0()) {
                        a0(sb, 2, "market_referrer_click_millis", Long.valueOf(s22.K()));
                    }
                    W(sb, 2);
                    sb.append("}\n");
                }
                List<C2246s2> m02 = c2215o2.m0();
                if (m02 != null) {
                    for (C2246s2 c2246s2 : m02) {
                        if (c2246s2 != null) {
                            W(sb, 2);
                            sb.append("user_property {\n");
                            Double d8 = null;
                            if (c2246s2.Z()) {
                                l8 = Long.valueOf(c2246s2.R());
                            } else {
                                l8 = null;
                            }
                            a0(sb, 2, "set_timestamp_millis", l8);
                            a0(sb, 2, "name", d().g(c2246s2.U()));
                            a0(sb, 2, "string_value", c2246s2.V());
                            if (c2246s2.Y()) {
                                l9 = Long.valueOf(c2246s2.P());
                            } else {
                                l9 = null;
                            }
                            a0(sb, 2, "int_value", l9);
                            if (c2246s2.W()) {
                                d8 = Double.valueOf(c2246s2.G());
                            }
                            a0(sb, 2, "double_value", d8);
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2153h2> k02 = c2215o2.k0();
                c2215o2.x2();
                if (k02 != null) {
                    for (C2153h2 c2153h2 : k02) {
                        if (c2153h2 != null) {
                            W(sb, 2);
                            sb.append("audience_membership {\n");
                            if (c2153h2.P()) {
                                a0(sb, 2, "audience_id", Integer.valueOf(c2153h2.j()));
                            }
                            if (c2153h2.Q()) {
                                a0(sb, 2, "new_audience", Boolean.valueOf(c2153h2.O()));
                            }
                            Z(sb, 2, "current_data", c2153h2.M());
                            if (c2153h2.R()) {
                                Z(sb, 2, "previous_data", c2153h2.N());
                            }
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<C2171j2> l02 = c2215o2.l0();
                if (l02 != null) {
                    for (C2171j2 c2171j2 : l02) {
                        if (c2171j2 != null) {
                            W(sb, 2);
                            sb.append("event {\n");
                            a0(sb, 2, "name", d().c(c2171j2.U()));
                            if (c2171j2.Y()) {
                                a0(sb, 2, "timestamp_millis", Long.valueOf(c2171j2.R()));
                            }
                            if (c2171j2.X()) {
                                a0(sb, 2, "previous_timestamp_millis", Long.valueOf(c2171j2.Q()));
                            }
                            if (c2171j2.W()) {
                                a0(sb, 2, "count", Integer.valueOf(c2171j2.j()));
                            }
                            if (c2171j2.O() != 0) {
                                b0(sb, 2, c2171j2.V());
                            }
                            W(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                W(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List P(List list, List list2) {
        int i8;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                a().L().b("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    a().L().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i9 = size2;
            i8 = size;
            size = i9;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:            r5 = new java.util.ArrayList();     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:            if (r4 == false) goto L23;     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:            r3 = (android.os.Parcelable[]) r3;        r4 = r3.length;        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:            if (r7 >= r4) goto L47;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:            r8 = r3[r7];     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:            if ((r8 instanceof android.os.Bundle) == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:            r5.add(Q((android.os.Bundle) r8, false));     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:            r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:            r0.put(r2, r5);     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:            if ((r3 instanceof java.util.ArrayList) == false) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:            r3 = (java.util.ArrayList) r3;        r4 = r3.size();        r7 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:            if (r7 >= r4) goto L51;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:            r8 = r3.get(r7);        r7 = r7 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:            if ((r8 instanceof android.os.Bundle) == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0069, code lost:            r5.add(Q((android.os.Bundle) r8, false));     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:            if ((r3 instanceof android.os.Bundle) == false) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:            r5.add(Q((android.os.Bundle) r3, false));     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map Q(android.os.Bundle r11, boolean r12) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            boolean r4 = r3 instanceof android.os.Parcelable[]
            if (r4 != 0) goto L30
            boolean r5 = r3 instanceof java.util.ArrayList
            if (r5 != 0) goto L30
            boolean r5 = r3 instanceof android.os.Bundle
            if (r5 == 0) goto L2a
            goto L30
        L2a:
            if (r3 == 0) goto Ld
            r0.put(r2, r3)
            goto Ld
        L30:
            if (r12 == 0) goto Ld
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            if (r4 == 0) goto L52
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            int r4 = r3.length
            r7 = 0
        L3e:
            if (r7 >= r4) goto L80
            r8 = r3[r7]
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L4f
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Q(r8, r6)
            r5.add(r8)
        L4f:
            int r7 = r7 + 1
            goto L3e
        L52:
            boolean r4 = r3 instanceof java.util.ArrayList
            if (r4 == 0) goto L73
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r7 = 0
        L5d:
            if (r7 >= r4) goto L80
            java.lang.Object r8 = r3.get(r7)
            int r7 = r7 + 1
            boolean r9 = r8 instanceof android.os.Bundle
            if (r9 == 0) goto L5d
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.util.Map r8 = r10.Q(r8, r6)
            r5.add(r8)
            goto L5d
        L73:
            boolean r4 = r3 instanceof android.os.Bundle
            if (r4 == 0) goto L80
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.util.Map r3 = r10.Q(r3, r6)
            r5.add(r3)
        L80:
            r0.put(r2, r5)
            goto Ld
        L84:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.Z5.Q(android.os.Bundle, boolean):java.util.Map");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void U(C2189l2.a aVar, Object obj) {
        AbstractC1396p.l(obj);
        aVar.D().B().y().C();
        if (obj instanceof String) {
            aVar.A((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.s(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            aVar.r(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C2189l2.a U8 = C2189l2.U();
                    for (String str : bundle.keySet()) {
                        C2189l2.a x8 = C2189l2.U().x(str);
                        Object obj2 = bundle.get(str);
                        if (obj2 instanceof Long) {
                            x8.s(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            x8.A((String) obj2);
                        } else if (obj2 instanceof Double) {
                            x8.r(((Double) obj2).doubleValue());
                        }
                        U8.t(x8);
                    }
                    if (U8.q() > 0) {
                        arrayList.add((C2189l2) ((AbstractC2240r4) U8.m()));
                    }
                }
            }
            aVar.w(arrayList);
            return;
        }
        a().G().b("Ignoring invalid (type) event param value", obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void V(C2246s2.a aVar, Object obj) {
        AbstractC1396p.l(obj);
        aVar.A().w().q();
        if (obj instanceof String) {
            aVar.y((String) obj);
            return;
        }
        if (obj instanceof Long) {
            aVar.s(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.r(((Double) obj).doubleValue());
        } else {
            a().G().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ C2401n2 a() {
        return super.a();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2349g b() {
        return super.b();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2467x c() {
        return super.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c0(long j8, long j9) {
        if (j8 != 0 && j9 > 0 && Math.abs(x().currentTimeMillis() - j8) <= j9) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2359h2 d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ C2484z2 e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3, com.google.android.gms.measurement.internal.InterfaceC2478y3
    public final /* bridge */ /* synthetic */ P2 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ d6 g() {
        return super.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] h0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e8) {
            a().G().b("Failed to gzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final byte[] j0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e8) {
            a().G().b("Failed to ungzip content", e8);
            throw e8;
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2464w3
    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List k0() {
        Map e8 = G.e(this.f17229b.w());
        if (e8 == null || e8.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) G.f17266S.a(null)).intValue();
        for (Map.Entry entry : e8.entrySet()) {
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            a().L().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                        continue;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e9) {
                    a().L().b("Experiment ID NumberFormatException", e9);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long z(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return A(str.getBytes(Charset.forName(com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME)));
    }
}
