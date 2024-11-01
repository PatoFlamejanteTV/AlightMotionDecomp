package N3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class g implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final P2.d f6578a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6579b;

    /* renamed from: c, reason: collision with root package name */
    private final Y2.k f6580c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6577d = P2.d.f8014i;
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g createFromParcel(Parcel parcel) {
            Y2.k valueOf;
            AbstractC3292y.i(parcel, "parcel");
            P2.d dVar = (P2.d) parcel.readParcelable(g.class.getClassLoader());
            b valueOf2 = b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Y2.k.valueOf(parcel.readString());
            }
            return new g(dVar, valueOf2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g[] newArray(int i8) {
            return new g[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f6581a = new b("LoggedIn", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f6582b = new b("NeedsVerification", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f6583c = new b("LoggedOut", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f6584d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f6585e;

        static {
            b[] a9 = a();
            f6584d = a9;
            f6585e = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f6581a, f6582b, f6583c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f6584d.clone();
        }
    }

    public g(P2.d configuration, b loginState, Y2.k kVar) {
        AbstractC3292y.i(configuration, "configuration");
        AbstractC3292y.i(loginState, "loginState");
        this.f6578a = configuration;
        this.f6579b = loginState;
        this.f6580c = kVar;
    }

    public final P2.d a() {
        return this.f6578a;
    }

    public final Y2.k b() {
        return this.f6580c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (AbstractC3292y.d(this.f6578a, gVar.f6578a) && this.f6579b == gVar.f6579b && this.f6580c == gVar.f6580c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f6578a.hashCode() * 31) + this.f6579b.hashCode()) * 31;
        Y2.k kVar = this.f6580c;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "LinkState(configuration=" + this.f6578a + ", loginState=" + this.f6579b + ", signupMode=" + this.f6580c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeParcelable(this.f6578a, i8);
        out.writeString(this.f6579b.name());
        Y2.k kVar = this.f6580c;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(kVar.name());
        }
    }
}
