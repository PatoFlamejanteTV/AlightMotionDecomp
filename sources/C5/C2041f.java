package c5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* renamed from: c5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2041f implements Parcelable {

    /* renamed from: A, reason: collision with root package name */
    private ArrayList f15761A;

    /* renamed from: B, reason: collision with root package name */
    private ArrayList f15762B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f15763C;

    /* renamed from: a, reason: collision with root package name */
    private long f15764a;

    /* renamed from: b, reason: collision with root package name */
    private String f15765b;

    /* renamed from: c, reason: collision with root package name */
    private String f15766c;

    /* renamed from: d, reason: collision with root package name */
    private long f15767d;

    /* renamed from: e, reason: collision with root package name */
    private String f15768e;

    /* renamed from: f, reason: collision with root package name */
    private String f15769f;

    /* renamed from: g, reason: collision with root package name */
    private c f15770g;

    /* renamed from: h, reason: collision with root package name */
    private int f15771h;

    /* renamed from: i, reason: collision with root package name */
    private int f15772i;

    /* renamed from: j, reason: collision with root package name */
    private String f15773j;

    /* renamed from: k, reason: collision with root package name */
    private int f15774k;

    /* renamed from: l, reason: collision with root package name */
    private int f15775l;

    /* renamed from: m, reason: collision with root package name */
    private String f15776m;

    /* renamed from: n, reason: collision with root package name */
    private int f15777n;

    /* renamed from: o, reason: collision with root package name */
    private long f15778o;

    /* renamed from: p, reason: collision with root package name */
    private long f15779p;

    /* renamed from: q, reason: collision with root package name */
    private int f15780q;

    /* renamed from: r, reason: collision with root package name */
    private String f15781r;

    /* renamed from: s, reason: collision with root package name */
    private long f15782s;

    /* renamed from: t, reason: collision with root package name */
    private String f15783t;

    /* renamed from: u, reason: collision with root package name */
    private int f15784u;

    /* renamed from: v, reason: collision with root package name */
    private F f15785v;

    /* renamed from: w, reason: collision with root package name */
    private String f15786w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15787x;

    /* renamed from: y, reason: collision with root package name */
    private long f15788y;

    /* renamed from: z, reason: collision with root package name */
    private int f15789z;

    /* renamed from: D, reason: collision with root package name */
    public static final b f15760D = new b(null);
    public static Parcelable.Creator<C2041f> CREATOR = new a();

    /* renamed from: c5.f$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2041f createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new C2041f(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2041f[] newArray(int i8) {
            return new C2041f[i8];
        }
    }

    /* renamed from: c5.f$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: c5.f$c */
    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f15790a = new c("OUTDATED", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f15791b = new c("UPDATED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f15792c = new c("UNAVAILABLE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f15793d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f15794e;

        static {
            c[] a9 = a();
            f15793d = a9;
            f15794e = W5.b.a(a9);
        }

        private c(String str, int i8) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f15790a, f15791b, f15792c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f15793d.clone();
        }
    }

    /* renamed from: c5.f$d */
    /* loaded from: classes5.dex */
    public /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15795a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f15790a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f15791b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15795a = iArr;
        }
    }

    public C2041f() {
        this.f15764a = -1L;
        this.f15767d = -1L;
        this.f15770g = c.f15791b;
    }

    public final void A0(String str) {
        this.f15773j = str;
    }

    public final void B0(String str) {
        this.f15776m = str;
    }

    public final void C0(String str) {
        this.f15765b = str;
    }

    public final void D0(String str) {
        this.f15766c = str;
    }

    public final void E0(F f8) {
        this.f15785v = f8;
    }

    public final void F0(int i8) {
        this.f15784u = i8;
    }

    public final void G0(String str) {
        this.f15783t = str;
    }

    public final void H0(boolean z8) {
        this.f15787x = z8;
    }

    public final ArrayList I() {
        return this.f15762B;
    }

    public final void I0(long j8) {
        this.f15778o = j8;
    }

    public final void J0(c cVar) {
        AbstractC3292y.i(cVar, "<set-?>");
        this.f15770g = cVar;
    }

    public final void K0(int i8) {
        this.f15771h = i8;
    }

    public final void L0(int i8) {
        this.f15772i = i8;
    }

    public final void M0(String str) {
        this.f15769f = str;
    }

    public final void N0(long j8) {
        this.f15767d = j8;
    }

    public final void O0(String str) {
        this.f15786w = str;
    }

    public final void P0(String str) {
        this.f15768e = str;
    }

    public final String Q() {
        return this.f15766c;
    }

    public final F U() {
        return this.f15785v;
    }

    public final int W() {
        return this.f15784u;
    }

    public final String X() {
        return this.f15783t;
    }

    public final boolean Y() {
        return this.f15787x;
    }

    public final long Z() {
        return this.f15778o;
    }

    public final void a(String path, ArrayList appFilesStored, C3791p dbManager, C2041f appStored, ArrayList out) {
        AbstractC3292y.i(path, "path");
        AbstractC3292y.i(appFilesStored, "appFilesStored");
        AbstractC3292y.i(dbManager, "dbManager");
        AbstractC3292y.i(appStored, "appStored");
        AbstractC3292y.i(out, "out");
        C2055u c2055u = new C2055u();
        c2055u.i(new File(path).length());
        c2055u.f(path);
        Iterator it = appFilesStored.iterator();
        int i8 = -1;
        int i9 = 0;
        while (it.hasNext()) {
            int i10 = i9 + 1;
            C2055u c2055u2 = (C2055u) it.next();
            if (l6.n.t(c2055u2.a(), c2055u.a(), false, 2, null) && c2055u2.e() == c2055u.e()) {
                if (c2055u2.b() != null) {
                    c2055u.g(c2055u2.b());
                }
                if (c2055u2.d() != null) {
                    c2055u.h(c2055u2.d());
                }
                i8 = i9;
            }
            i9 = i10;
        }
        if (i8 == -1) {
            if (dbManager.B0(appStored.f15764a, c2055u) >= 0) {
                out.add(c2055u);
            }
        } else {
            appFilesStored.remove(i8);
            out.add(c2055u);
        }
    }

    public final String a0() {
        return new S4.g().c(this.f15778o);
    }

    public final long b() {
        return this.f15788y;
    }

    public final ArrayList b0() {
        return this.f15761A;
    }

    public final c c0() {
        return this.f15770g;
    }

    public final int d0() {
        return this.f15775l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e0() {
        return this.f15769f;
    }

    public final String f() {
        return this.f15781r;
    }

    public final long f0() {
        return this.f15767d;
    }

    public final String g0() {
        return this.f15786w;
    }

    public final boolean h() {
        return this.f15763C;
    }

    public final String h0() {
        return this.f15768e;
    }

    public final int i() {
        return this.f15777n;
    }

    public final boolean i0(Context context) {
        AbstractC3292y.i(context, "context");
        if (this.f15766c == null) {
            return false;
        }
        if (n0()) {
            return SettingsPreferences.f30529b.h0(context);
        }
        if (l0()) {
            return SettingsPreferences.f30529b.g0(context);
        }
        return true;
    }

    public final boolean j0() {
        long j8 = this.f15779p;
        long j9 = this.f15782s;
        long currentTimeMillis = System.currentTimeMillis();
        if (j9 != j8 && currentTimeMillis - j8 < 604800000) {
            return true;
        }
        return false;
    }

    public final int k0() {
        return this.f15771h;
    }

    public final int l() {
        return this.f15780q;
    }

    public final boolean l0() {
        if (this.f15771h == 1) {
            return true;
        }
        return false;
    }

    public final int m0() {
        return this.f15772i;
    }

    public final boolean n0() {
        if (this.f15772i == 1) {
            return true;
        }
        return false;
    }

    public final void o0(C3791p dbManager) {
        AbstractC3292y.i(dbManager, "dbManager");
        this.f15762B = new ArrayList();
        S4.v vVar = new S4.v();
        String str = this.f15766c;
        AbstractC3292y.f(str);
        ArrayList a9 = vVar.a(str);
        if (!a9.isEmpty()) {
            String str2 = this.f15766c;
            AbstractC3292y.f(str2);
            C2041f S8 = dbManager.S(str2);
            if (S8 != null) {
                ArrayList T8 = dbManager.T(S8.f15764a);
                Iterator it = a9.iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    File file = (File) next;
                    if (file.isFile()) {
                        String name = file.getName();
                        AbstractC3292y.h(name, "getName(...)");
                        if (l6.n.r(name, ".obb", false, 2, null)) {
                            String absolutePath = file.getAbsolutePath();
                            AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                            ArrayList arrayList = this.f15762B;
                            AbstractC3292y.f(arrayList);
                            a(absolutePath, T8, dbManager, S8, arrayList);
                        }
                    }
                }
            }
        }
    }

    public final long p() {
        return this.f15782s;
    }

    public final void p0(ApplicationInfo applicationInfo, C3791p dbManager) {
        AbstractC3292y.i(applicationInfo, "applicationInfo");
        AbstractC3292y.i(dbManager, "dbManager");
        this.f15761A = new ArrayList();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            String str = this.f15766c;
            AbstractC3292y.f(str);
            C2041f S8 = dbManager.S(str);
            if (S8 != null) {
                ArrayList T8 = dbManager.T(S8.f15764a);
                Iterator a9 = AbstractC3274f.a(strArr);
                while (a9.hasNext()) {
                    String str2 = (String) a9.next();
                    AbstractC3292y.f(str2);
                    if (l6.n.r(str2, ".apk", false, 2, null)) {
                        ArrayList arrayList = this.f15761A;
                        AbstractC3292y.f(arrayList);
                        a(str2, T8, dbManager, S8, arrayList);
                    }
                }
                if (!T8.isEmpty()) {
                    Iterator it = T8.iterator();
                    AbstractC3292y.h(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC3292y.h(next, "next(...)");
                        dbManager.u((C2055u) next);
                    }
                }
            }
        }
    }

    public final void q0(long j8) {
        this.f15788y = j8;
    }

    public final void r0(String str) {
        this.f15781r = str;
    }

    public final int s() {
        return this.f15789z;
    }

    public final void s0(boolean z8) {
        this.f15763C = z8;
    }

    public final void t0(int i8) {
        this.f15777n = i8;
    }

    public String toString() {
        return "App{id='" + this.f15764a + "', name='" + this.f15765b + "', packagename='" + this.f15766c + "', versionCode='" + this.f15767d + "', versionName='" + this.f15768e + "', urlFicha='" + this.f15769f + "', status=" + this.f15770g + ", isSystemApp=" + this.f15771h + ", isSystemService=" + this.f15772i + ", md5='" + this.f15773j + "', minSdkVersion=" + this.f15774k + ", targetSdkVersion=" + this.f15775l + ", md5signature='" + this.f15776m + "', exclude=" + this.f15777n + ", size=" + this.f15778o + ", lastUpdateTime=" + this.f15779p + ", excludeFromTracking=" + this.f15780q + ", defaultName='" + this.f15781r + "', firstInstallTime=" + this.f15782s + ", sha256=" + this.f15783t + ", versionDetails=" + this.f15786w + ", appID=" + this.f15788y + ", hasOldVersions=" + this.f15789z + '}';
    }

    public final long u() {
        return this.f15764a;
    }

    public final void u0(int i8) {
        this.f15780q = i8;
    }

    public final long v() {
        return this.f15779p;
    }

    public final void v0(boolean z8, boolean z9) {
        if (l0()) {
            if (!z8) {
                this.f15780q = 1;
            } else {
                this.f15780q = 0;
            }
        }
        if (n0()) {
            if (!z9) {
                this.f15780q = 1;
            } else {
                this.f15780q = 0;
            }
        }
    }

    public final String w() {
        return this.f15773j;
    }

    public final void w0(long j8) {
        this.f15782s = j8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeLong(this.f15764a);
        parcel.writeString(this.f15765b);
        parcel.writeString(this.f15766c);
        parcel.writeLong(this.f15767d);
        parcel.writeString(this.f15768e);
        parcel.writeString(this.f15769f);
        int i9 = d.f15795a[this.f15770g.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                parcel.writeInt(2);
            } else {
                parcel.writeInt(1);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f15771h);
        parcel.writeInt(this.f15772i);
        parcel.writeString(this.f15773j);
        parcel.writeInt(this.f15774k);
        parcel.writeInt(this.f15775l);
        parcel.writeString(this.f15776m);
        parcel.writeInt(this.f15777n);
        parcel.writeLong(this.f15778o);
        parcel.writeLong(this.f15779p);
        parcel.writeInt(this.f15780q);
        parcel.writeString(this.f15781r);
        parcel.writeLong(this.f15782s);
        parcel.writeString(this.f15783t);
        parcel.writeInt(this.f15784u);
        parcel.writeString(this.f15786w);
        parcel.writeLong(this.f15788y);
        parcel.writeInt(this.f15789z);
        parcel.writeInt(this.f15763C ? 1 : 0);
    }

    public final String x() {
        return this.f15776m;
    }

    public final void x0(int i8) {
        this.f15789z = i8;
    }

    public final int y() {
        return this.f15774k;
    }

    public final void y0(long j8) {
        this.f15764a = j8;
    }

    public final String z() {
        return this.f15765b;
    }

    public final void z0(long j8) {
        this.f15779p = j8;
    }

    public C2041f(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15764a = -1L;
        this.f15767d = -1L;
        c cVar = c.f15791b;
        this.f15770g = cVar;
        this.f15764a = source.readLong();
        this.f15765b = source.readString();
        this.f15766c = source.readString();
        this.f15767d = source.readLong();
        this.f15768e = source.readString();
        this.f15769f = source.readString();
        int readInt = source.readInt();
        if (readInt == 0) {
            this.f15770g = c.f15790a;
        } else if (readInt != 1) {
            this.f15770g = c.f15792c;
        } else {
            this.f15770g = cVar;
        }
        this.f15771h = source.readInt();
        this.f15772i = source.readInt();
        this.f15773j = source.readString();
        this.f15774k = source.readInt();
        this.f15775l = source.readInt();
        this.f15776m = source.readString();
        this.f15777n = source.readInt();
        this.f15778o = source.readLong();
        this.f15779p = source.readLong();
        this.f15780q = source.readInt();
        this.f15781r = source.readString();
        this.f15782s = source.readLong();
        this.f15783t = source.readString();
        this.f15784u = source.readInt();
        this.f15786w = source.readString();
        this.f15788y = source.readLong();
        this.f15789z = source.readInt();
        this.f15763C = source.readInt() == 1;
    }
}
