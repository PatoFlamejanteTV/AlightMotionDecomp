package c5;

import S4.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Y;
import q5.C3791p;
import q5.C3794s;
import q5.C3797v;

/* loaded from: classes5.dex */
public final class r implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f15920a;

    /* renamed from: b, reason: collision with root package name */
    private String f15921b;

    /* renamed from: c, reason: collision with root package name */
    private String f15922c;

    /* renamed from: d, reason: collision with root package name */
    private int f15923d;

    /* renamed from: e, reason: collision with root package name */
    private int f15924e;

    /* renamed from: f, reason: collision with root package name */
    private int f15925f;

    /* renamed from: g, reason: collision with root package name */
    private long f15926g;

    /* renamed from: h, reason: collision with root package name */
    private long f15927h;

    /* renamed from: i, reason: collision with root package name */
    private String f15928i;

    /* renamed from: j, reason: collision with root package name */
    private long f15929j;

    /* renamed from: k, reason: collision with root package name */
    private int f15930k;

    /* renamed from: l, reason: collision with root package name */
    private long f15931l;

    /* renamed from: m, reason: collision with root package name */
    private int f15932m;

    /* renamed from: n, reason: collision with root package name */
    private String f15933n;

    /* renamed from: o, reason: collision with root package name */
    private String f15934o;

    /* renamed from: p, reason: collision with root package name */
    private String f15935p;

    /* renamed from: q, reason: collision with root package name */
    private String f15936q;

    /* renamed from: r, reason: collision with root package name */
    private int f15937r;

    /* renamed from: s, reason: collision with root package name */
    private String f15938s;

    /* renamed from: t, reason: collision with root package name */
    private String f15939t;

    /* renamed from: u, reason: collision with root package name */
    private ArrayList f15940u;

    /* renamed from: v, reason: collision with root package name */
    private String f15941v;

    /* renamed from: w, reason: collision with root package name */
    private long f15942w;

    /* renamed from: x, reason: collision with root package name */
    private long f15943x;

    /* renamed from: y, reason: collision with root package name */
    public static final b f15919y = new b(null);
    public static Parcelable.Creator<r> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new r(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r[] newArray(int i8) {
            return new r[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final r a(Context context, File file) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(file, "file");
            x.a aVar = S4.x.f9510b;
            String name = file.getName();
            AbstractC3292y.h(name, "getName(...)");
            if (aVar.a(name)) {
                r rVar = new r();
                rVar.D0(file.getName());
                P4.g e8 = new S4.x().e(file, context);
                rVar.z0(0);
                rVar.F0(100);
                rVar.G0(file.length());
                rVar.o0(file.getAbsolutePath());
                if (e8 != null) {
                    rVar.E0(e8.a());
                    rVar.J0(e8.b());
                }
                return rVar;
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                AbstractC3292y.h(packageManager, "getPackageManager(...)");
                String absolutePath = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                PackageInfo c8 = S4.r.c(packageManager, absolutePath, 128);
                if (c8 == null) {
                    return null;
                }
                r rVar2 = new r();
                rVar2.D0(file.getName());
                rVar2.E0(c8.packageName);
                rVar2.J0(new S4.f().m(c8));
                rVar2.F0(100);
                rVar2.z0(0);
                rVar2.G0(file.length());
                rVar2.o0(file.getAbsolutePath());
                rVar2.I(context, file);
                return rVar2;
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public r() {
        this.f15920a = -1;
        this.f15925f = 1;
        this.f15929j = -1L;
        this.f15931l = -1L;
        this.f15942w = -1L;
        this.f15943x = -1L;
    }

    private final void j0(Context context) {
        PackageInfo packageInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                String str = this.f15922c;
                AbstractC3292y.f(str);
                packageInfo = S4.r.d(packageManager, str, 0);
            } else {
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f15943x = new S4.f().m(packageInfo);
            }
        } catch (Exception unused) {
        }
    }

    public final void A0(String str) {
        this.f15928i = str;
    }

    public final void B0(String str) {
        this.f15935p = str;
    }

    public final void C0(int i8) {
        this.f15937r = i8;
    }

    public final void D0(String str) {
        this.f15921b = str;
    }

    public final void E0(String str) {
        this.f15922c = str;
    }

    public final void F0(int i8) {
        this.f15923d = i8;
    }

    public final void G0(long j8) {
        this.f15926g = j8;
    }

    public final void H0(String str) {
        this.f15936q = str;
    }

    public final void I(Context context, File file) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(file, "file");
        if (this.f15922c != null) {
            long j8 = this.f15929j;
            if (j8 > 0 && this.f15923d == 100) {
                this.f15942w = j8;
                j0(context);
                return;
            }
            String name = file.getName();
            AbstractC3292y.h(name, "getName(...)");
            if (l6.n.r(name, ".apk", false, 2, null) && this.f15923d == 100) {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    AbstractC3292y.h(packageManager, "getPackageManager(...)");
                    String absolutePath = file.getAbsolutePath();
                    AbstractC3292y.h(absolutePath, "getAbsolutePath(...)");
                    PackageInfo c8 = S4.r.c(packageManager, absolutePath, 128);
                    if (c8 != null) {
                        this.f15942w = new S4.f().m(c8);
                    }
                    if (c8 != null && l6.n.t(this.f15922c, c8.packageName, false, 2, null)) {
                        j0(context);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void I0(String str) {
        this.f15938s = str;
    }

    public final void J0(long j8) {
        this.f15929j = j8;
    }

    public final String Q() {
        return this.f15928i;
    }

    public final String U() {
        return this.f15935p;
    }

    public final int W() {
        return this.f15937r;
    }

    public final String X() {
        return this.f15921b;
    }

    public final String Y() {
        return this.f15922c;
    }

    public final int Z() {
        return this.f15923d;
    }

    public final void a(C2043h appInfo) {
        String P02;
        AbstractC3292y.i(appInfo, "appInfo");
        if (this.f15922c == null) {
            this.f15922c = appInfo.v0();
        }
        if (this.f15929j <= 0) {
            if (appInfo.Y0() > 0) {
                this.f15929j = appInfo.Y0();
            } else if (appInfo.m0() > 0) {
                this.f15929j = appInfo.m0();
            }
        }
        if (this.f15931l <= 0) {
            this.f15931l = appInfo.h();
        }
        if (!C3797v.f37313a.f()) {
            this.f15932m = 1;
        }
        if (this.f15935p == null) {
            this.f15935p = appInfo.o0();
        }
        if (this.f15938s == null) {
            this.f15938s = appInfo.j0();
        }
        if (this.f15934o == null && appInfo.d0() > 0) {
            this.f15934o = String.valueOf(appInfo.d0());
        }
        if (this.f15926g <= 0 && (P02 = appInfo.P0()) != null && P02.length() != 0) {
            String P03 = appInfo.P0();
            AbstractC3292y.f(P03);
            this.f15926g = Long.parseLong(P03);
        }
        String str = this.f15939t;
        if (str == null || str.length() == 0) {
            this.f15939t = appInfo.q0();
        }
    }

    public final long a0() {
        return this.f15926g;
    }

    public final boolean b(Context context) {
        AbstractC3292y.i(context, "context");
        if (this.f15921b == null) {
            return false;
        }
        File f8 = new C3794s().f(context);
        String str = this.f15921b;
        AbstractC3292y.f(str);
        if (!new File(f8, str).exists() || this.f15923d != 100) {
            return false;
        }
        return true;
    }

    public final String b0() {
        return this.f15936q;
    }

    public final ArrayList c0() {
        return this.f15940u;
    }

    public final String d0() {
        return this.f15938s;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final long e0() {
        return this.f15929j;
    }

    public final String f() {
        return this.f15941v;
    }

    public final long f0() {
        return this.f15942w;
    }

    public final long g0() {
        return this.f15943x;
    }

    public final long h() {
        return this.f15931l;
    }

    public final boolean h0() {
        if (this.f15922c != null && this.f15925f == 1 && this.f15935p != null && this.f15929j > 0 && this.f15930k < 4) {
            return true;
        }
        return false;
    }

    public final String i() {
        return this.f15939t;
    }

    public final boolean i0() {
        P4.a h8 = J4.j.f4395g.h();
        if (this.f15929j > 0 && this.f15922c != null && h8 != null && l6.n.s(h8.b(), this.f15922c, true) && h8.e() == this.f15929j) {
            return true;
        }
        return false;
    }

    public final void k0(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        this.f15922c = appInfo.v0();
        this.f15931l = appInfo.h();
        this.f15939t = appInfo.q0();
        if (!C3797v.f37313a.f()) {
            this.f15932m = 1;
        }
        if (appInfo.P0() != null) {
            String P02 = appInfo.P0();
            AbstractC3292y.f(P02);
            if (P02.length() > 0) {
                try {
                    String P03 = appInfo.P0();
                    AbstractC3292y.f(P03);
                    this.f15926g = Long.parseLong(P03);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        }
        this.f15935p = appInfo.o0();
        this.f15933n = appInfo.M0();
        this.f15936q = null;
        if (appInfo.Q0() != null) {
            ArrayList Q02 = appInfo.Q0();
            AbstractC3292y.f(Q02);
            if (Q02.size() > 0) {
                ArrayList Q03 = appInfo.Q0();
                AbstractC3292y.f(Q03);
                int size = Q03.size();
                for (int i8 = 0; i8 < size; i8++) {
                    String str = this.f15936q;
                    if (str == null) {
                        ArrayList Q04 = appInfo.Q0();
                        AbstractC3292y.f(Q04);
                        this.f15936q = (String) Q04.get(i8);
                    } else {
                        Y y8 = Y.f34578a;
                        ArrayList Q05 = appInfo.Q0();
                        AbstractC3292y.f(Q05);
                        String format = String.format("%s,%s", Arrays.copyOf(new Object[]{str, Q05.get(i8)}, 2));
                        AbstractC3292y.h(format, "format(...)");
                        this.f15936q = format;
                    }
                }
            }
        }
        this.f15934o = String.valueOf(appInfo.d0());
        if (appInfo.p0() != null) {
            try {
                String p02 = appInfo.p0();
                AbstractC3292y.f(p02);
                this.f15937r = Integer.parseInt(p02);
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
        this.f15938s = appInfo.j0();
        this.f15940u = appInfo.R0();
    }

    public final int l() {
        return this.f15930k;
    }

    public final int l0(Context context) {
        AbstractC3292y.i(context, "context");
        if (this.f15934o == null) {
            return -1;
        }
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        String str = this.f15934o;
        AbstractC3292y.f(str);
        r Z8 = a9.Z(str);
        if (Z8 == null) {
            Z8 = a9.D0(this);
        }
        a9.i();
        return Z8.f15920a;
    }

    public final int m0(Context context) {
        r rVar;
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        String str = this.f15921b;
        if (str != null) {
            AbstractC3292y.f(str);
            rVar = a9.Y(str);
        } else {
            rVar = null;
        }
        if (rVar == null) {
            rVar = a9.D0(this);
        }
        a9.i();
        return rVar.f15920a;
    }

    public final int n0(Context context) {
        AbstractC3292y.i(context, "context");
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        int z8 = a9.z(this);
        a9.i();
        return z8;
    }

    public final void o0(String str) {
        this.f15941v = str;
    }

    public final int p() {
        return this.f15924e;
    }

    public final void p0(long j8) {
        this.f15931l = j8;
    }

    public final void q0(String str) {
        this.f15939t = str;
    }

    public final void r0(int i8) {
        this.f15930k = i8;
    }

    public final int s() {
        return this.f15932m;
    }

    public final void s0(int i8) {
        this.f15924e = i8;
    }

    public final void t0(int i8) {
        this.f15932m = i8;
    }

    public String toString() {
        return "Download{id='" + this.f15920a + "', name='" + this.f15921b + "', packagename='" + this.f15922c + "', progress=" + this.f15923d + ", checkedByUser=" + this.f15924e + ", incomplete=" + this.f15925f + ", size=" + this.f15926g + ", downloadedSize=" + this.f15927h + ", md5='" + this.f15928i + "', versioncode='" + this.f15929j + "', attempts=" + this.f15930k + ", idPrograma=" + this.f15931l + ", downloadAnyway=" + this.f15932m + ", filehash=" + this.f15933n + ", fileId=" + this.f15934o + ", md5signature=" + this.f15935p + ", supportedAbis=" + this.f15936q + ", minsdk=" + this.f15937r + ", urlIcon=" + this.f15938s + ", absolutePath=" + this.f15941v + ", appName=" + this.f15939t + ", versioncodeFile=" + this.f15942w + ", versioncodeInstalled=" + this.f15943x + '}';
    }

    public final long u() {
        return this.f15927h;
    }

    public final void u0(Context context, long j8) {
        AbstractC3292y.i(context, "context");
        if (this.f15926g != j8) {
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            this.f15926g = j8;
            a9.q1(this);
            a9.i();
        }
    }

    public final File v(Context context) {
        AbstractC3292y.i(context, "context");
        if (this.f15941v != null) {
            String str = this.f15941v;
            AbstractC3292y.f(str);
            File file = new File(str);
            if (file.exists()) {
                return file;
            }
        }
        if (this.f15921b == null) {
            return null;
        }
        File f8 = new C3794s().f(context);
        String str2 = this.f15921b;
        AbstractC3292y.f(str2);
        File file2 = new File(f8, str2);
        if (!file2.exists()) {
            return null;
        }
        return file2;
    }

    public final void v0(long j8) {
        this.f15927h = j8;
    }

    public final String w() {
        return this.f15934o;
    }

    public final void w0(String str) {
        this.f15934o = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeInt(this.f15920a);
        parcel.writeString(this.f15921b);
        parcel.writeString(this.f15922c);
        parcel.writeInt(this.f15923d);
        parcel.writeInt(this.f15924e);
        parcel.writeInt(this.f15925f);
        parcel.writeLong(this.f15926g);
        parcel.writeLong(this.f15927h);
        parcel.writeString(this.f15928i);
        parcel.writeLong(this.f15929j);
        parcel.writeInt(this.f15930k);
        parcel.writeLong(this.f15931l);
        parcel.writeInt(this.f15932m);
        parcel.writeString(this.f15933n);
        parcel.writeString(this.f15934o);
        parcel.writeString(this.f15935p);
        parcel.writeString(this.f15936q);
        parcel.writeInt(this.f15937r);
        parcel.writeString(this.f15938s);
        parcel.writeString(this.f15939t);
    }

    public final String x() {
        return this.f15933n;
    }

    public final void x0(String str) {
        this.f15933n = str;
    }

    public final int y() {
        return this.f15920a;
    }

    public final void y0(int i8) {
        this.f15920a = i8;
    }

    public final int z() {
        return this.f15925f;
    }

    public final void z0(int i8) {
        this.f15925f = i8;
    }

    public r(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15920a = -1;
        this.f15925f = 1;
        this.f15929j = -1L;
        this.f15931l = -1L;
        this.f15942w = -1L;
        this.f15943x = -1L;
        this.f15920a = source.readInt();
        this.f15921b = source.readString();
        this.f15922c = source.readString();
        this.f15923d = source.readInt();
        this.f15924e = source.readInt();
        this.f15925f = source.readInt();
        this.f15926g = source.readLong();
        this.f15927h = source.readLong();
        this.f15928i = source.readString();
        this.f15929j = source.readLong();
        this.f15930k = source.readInt();
        this.f15931l = source.readLong();
        this.f15932m = source.readInt();
        this.f15933n = source.readString();
        this.f15934o = source.readString();
        this.f15935p = source.readString();
        this.f15936q = source.readString();
        this.f15937r = source.readInt();
        this.f15938s = source.readString();
        this.f15939t = source.readString();
    }
}
