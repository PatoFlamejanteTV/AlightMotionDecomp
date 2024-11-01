package c5;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class Q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f15675a;

    /* renamed from: b, reason: collision with root package name */
    private long f15676b;

    /* renamed from: c, reason: collision with root package name */
    private String f15677c;

    /* renamed from: d, reason: collision with root package name */
    private long f15678d;

    /* renamed from: e, reason: collision with root package name */
    private int f15679e;

    /* renamed from: f, reason: collision with root package name */
    private String f15680f;

    /* renamed from: g, reason: collision with root package name */
    private int f15681g;

    /* renamed from: h, reason: collision with root package name */
    private int f15682h;

    /* renamed from: i, reason: collision with root package name */
    private String f15683i;

    /* renamed from: j, reason: collision with root package name */
    private String f15684j;

    /* renamed from: k, reason: collision with root package name */
    private C2057w f15685k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f15674l = new b(null);
    public static Parcelable.Creator<Q> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Q createFromParcel(Parcel source) {
            AbstractC3292y.i(source, "source");
            return new Q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Q[] newArray(int i8) {
            return new Q[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final int a(Context context) {
            AbstractC3292y.i(context, "context");
            return b(context).size();
        }

        public final ArrayList b(Context context) {
            C2041f S8;
            AbstractC3292y.i(context, "context");
            C3791p a9 = C3791p.f37286s.a(context);
            a9.a();
            ArrayList arrayList = new ArrayList();
            Iterator it = a9.t0().iterator();
            AbstractC3292y.h(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                AbstractC3292y.h(next, "next(...)");
                Q q8 = (Q) next;
                if (!new S4.f().p(context, q8.s())) {
                    if (l6.n.s(q8.s(), context.getPackageName(), true) && q8.w() > 0) {
                        if (q8.w() > 633) {
                            arrayList.add(q8);
                        }
                    } else if (q8.h() == 0 && (S8 = a9.S(q8.s())) != null && S8.i() == 0 && S8.i0(context)) {
                        arrayList.add(q8);
                    }
                }
            }
            a9.i();
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public Q(String packagename) {
        AbstractC3292y.i(packagename, "packagename");
        this.f15676b = -1L;
        this.f15675a = packagename;
    }

    public final void I(int i8) {
        this.f15682h = i8;
    }

    public final void Q(C2057w c2057w) {
        this.f15685k = c2057w;
    }

    public final void U(String str) {
        this.f15680f = str;
    }

    public final void W(int i8) {
        this.f15679e = i8;
    }

    public final void X(int i8) {
        this.f15681g = i8;
    }

    public final void Y(long j8) {
        this.f15678d = j8;
    }

    public final void Z(long j8) {
        this.f15676b = j8;
    }

    public final boolean a() {
        return UptodownApp.f29249C.P(this);
    }

    public final void a0(String str) {
        this.f15677c = str;
    }

    public final String b() {
        return this.f15684j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String f() {
        return this.f15683i;
    }

    public final int h() {
        return this.f15682h;
    }

    public final C2057w i() {
        return this.f15685k;
    }

    public final String l() {
        return this.f15680f;
    }

    public final int p() {
        return this.f15679e;
    }

    public final String s() {
        return this.f15675a;
    }

    public String toString() {
        return "Update{packagename='" + this.f15675a + "', versionCode='" + this.f15676b + "', versionName='" + this.f15677c + "', size=" + this.f15678d + ", notified=" + this.f15679e + ", nameApkFile='" + this.f15680f + "', progress=" + this.f15681g + ", ignoreVersion=" + this.f15682h + ", filehash='" + this.f15683i + "', fileId='" + this.f15684j + "'}";
    }

    public final int u() {
        return this.f15681g;
    }

    public final long v() {
        return this.f15678d;
    }

    public final long w() {
        return this.f15676b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f15675a);
        parcel.writeLong(this.f15676b);
        parcel.writeString(this.f15677c);
        parcel.writeLong(this.f15678d);
        parcel.writeInt(this.f15679e);
        parcel.writeString(this.f15680f);
        parcel.writeInt(this.f15681g);
        parcel.writeInt(this.f15682h);
        parcel.writeString(this.f15683i);
        parcel.writeString(this.f15684j);
    }

    public final String x() {
        return this.f15677c;
    }

    public final void y(String str) {
        this.f15684j = str;
    }

    public final void z(String str) {
        this.f15683i = str;
    }

    public Q(Parcel source) {
        AbstractC3292y.i(source, "source");
        this.f15676b = -1L;
        String readString = source.readString();
        AbstractC3292y.f(readString);
        this.f15675a = readString;
        this.f15676b = source.readLong();
        this.f15677c = source.readString();
        this.f15678d = source.readLong();
        this.f15679e = source.readInt();
        this.f15680f = source.readString();
        this.f15681g = source.readInt();
        this.f15682h = source.readInt();
        this.f15683i = source.readString();
        this.f15684j = source.readString();
    }
}
