package v2;

import Q5.x;
import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f40430a;

    /* renamed from: b, reason: collision with root package name */
    private final String f40431b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40432c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40433d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f40429e = new a(null);
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String name, String str, String str2, String str3) {
        AbstractC3292y.i(name, "name");
        this.f40430a = name;
        this.f40431b = str;
        this.f40432c = str2;
        this.f40433d = str3;
    }

    public final Map a() {
        return Q.e(x.a(MimeTypes.BASE_TYPE_APPLICATION, b()));
    }

    public final Map b() {
        return Q.k(x.a("name", this.f40430a), x.a("version", this.f40431b), x.a("url", this.f40432c), x.a("partner_id", this.f40433d));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3292y.d(this.f40430a, cVar.f40430a) && AbstractC3292y.d(this.f40431b, cVar.f40431b) && AbstractC3292y.d(this.f40432c, cVar.f40432c) && AbstractC3292y.d(this.f40433d, cVar.f40433d)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String str;
        String str2 = this.f40430a;
        String str3 = this.f40431b;
        String str4 = null;
        if (str3 != null) {
            str = "/" + str3;
        } else {
            str = null;
        }
        String str5 = this.f40432c;
        if (str5 != null) {
            str4 = " (" + str5 + ")";
        }
        return AbstractC1435t.w0(AbstractC1435t.r(str2, str, str4), "", null, null, 0, null, null, 62, null);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f40430a.hashCode() * 31;
        String str = this.f40431b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode3 + hashCode) * 31;
        String str2 = this.f40432c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f40433d;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i10 + i8;
    }

    public String toString() {
        return "AppInfo(name=" + this.f40430a + ", version=" + this.f40431b + ", url=" + this.f40432c + ", partnerId=" + this.f40433d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f40430a);
        out.writeString(this.f40431b);
        out.writeString(this.f40432c);
        out.writeString(this.f40433d);
    }
}
