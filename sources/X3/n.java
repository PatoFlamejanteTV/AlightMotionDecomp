package X3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f11199a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11200b;

    /* renamed from: c, reason: collision with root package name */
    private final b f11201c;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new n(parcel.readString(), parcel.readString(), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final n[] newArray(int i8) {
            return new n[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f11202a = new b("LOW", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f11203b = new b("MEDIUM", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f11204c = new b("HIGH", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f11205d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f11206e;

        static {
            b[] a9 = a();
            f11205d = a9;
            f11206e = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f11202a, f11203b, f11204c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f11205d.clone();
        }
    }

    public n(String id, String message, b severity) {
        AbstractC3292y.i(id, "id");
        AbstractC3292y.i(message, "message");
        AbstractC3292y.i(severity, "severity");
        this.f11199a = id;
        this.f11200b = message;
        this.f11201c = severity;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3292y.d(this.f11199a, nVar.f11199a) && AbstractC3292y.d(this.f11200b, nVar.f11200b) && this.f11201c == nVar.f11201c) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.f11199a;
    }

    public int hashCode() {
        return (((this.f11199a.hashCode() * 31) + this.f11200b.hashCode()) * 31) + this.f11201c.hashCode();
    }

    public String toString() {
        return "Warning(id=" + this.f11199a + ", message=" + this.f11200b + ", severity=" + this.f11201c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f11199a);
        out.writeString(this.f11200b);
        out.writeString(this.f11201c.name());
    }
}
