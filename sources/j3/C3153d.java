package j3;

import Q5.x;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;

/* renamed from: j3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3153d implements z2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f33677a;

    /* renamed from: b, reason: collision with root package name */
    private final String f33678b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33679c;

    /* renamed from: d, reason: collision with root package name */
    private final long f33680d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f33675e = new a(null);
    public static final Parcelable.Creator<C3153d> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final long f33676f = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: j3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: j3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3153d createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new C3153d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3153d[] newArray(int i8) {
            return new C3153d[i8];
        }
    }

    public C3153d(String guid, String muid, String sid, long j8) {
        AbstractC3292y.i(guid, "guid");
        AbstractC3292y.i(muid, "muid");
        AbstractC3292y.i(sid, "sid");
        this.f33677a = guid;
        this.f33678b = muid;
        this.f33679c = sid;
        this.f33680d = j8;
    }

    public final String a() {
        return this.f33677a;
    }

    public final String b() {
        return this.f33678b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3153d)) {
            return false;
        }
        C3153d c3153d = (C3153d) obj;
        if (AbstractC3292y.d(this.f33677a, c3153d.f33677a) && AbstractC3292y.d(this.f33678b, c3153d.f33678b) && AbstractC3292y.d(this.f33679c, c3153d.f33679c) && this.f33680d == c3153d.f33680d) {
            return true;
        }
        return false;
    }

    public final Map f() {
        return Q.k(x.a("guid", this.f33677a), x.a("muid", this.f33678b), x.a("sid", this.f33679c));
    }

    public final String h() {
        return this.f33679c;
    }

    public int hashCode() {
        return (((((this.f33677a.hashCode() * 31) + this.f33678b.hashCode()) * 31) + this.f33679c.hashCode()) * 31) + androidx.collection.a.a(this.f33680d);
    }

    public final boolean i(long j8) {
        if (j8 - this.f33680d > f33676f) {
            return true;
        }
        return false;
    }

    public final JSONObject l() {
        JSONObject put = new JSONObject().put("guid", this.f33677a).put("muid", this.f33678b).put("sid", this.f33679c).put(CampaignEx.JSON_KEY_TIMESTAMP, this.f33680d);
        AbstractC3292y.h(put, "put(...)");
        return put;
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.f33677a + ", muid=" + this.f33678b + ", sid=" + this.f33679c + ", timestamp=" + this.f33680d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f33677a);
        out.writeString(this.f33678b);
        out.writeString(this.f33679c);
        out.writeLong(this.f33680d);
    }
}
