package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.C2819c;

/* loaded from: classes4.dex */
public final class k extends Y3.a implements p, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f12052d;

    /* renamed from: e, reason: collision with root package name */
    private String f12053e;

    /* renamed from: f, reason: collision with root package name */
    private String f12054f;

    /* renamed from: g, reason: collision with root package name */
    private String f12055g;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i8) {
            return new k[i8];
        }
    }

    private boolean z(k kVar) {
        if (C2819c.a(this.f12052d, kVar.f12052d) && C2819c.a(this.f12053e, kVar.f12053e) && C2819c.a(this.f12054f, kVar.f12054f) && C2819c.a(this.f12055g, kVar.f12055g)) {
            return true;
        }
        return false;
    }

    @Override // Y3.p
    public String a() {
        return this.f12053e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof k) || !z((k) obj))) {
            return false;
        }
        return true;
    }

    @Override // Y3.p
    public String f() {
        return this.f12052d;
    }

    @Override // Y3.p
    public String h() {
        return this.f12054f;
    }

    public int hashCode() {
        return C2819c.b(this.f12052d, this.f12053e, this.f12054f, this.f12055g);
    }

    @Override // Y3.p
    public String v() {
        return this.f12055g;
    }

    @Override // Y3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f12052d);
        parcel.writeString(this.f12053e);
        parcel.writeString(this.f12054f);
        parcel.writeString(this.f12055g);
    }

    private k(Parcel parcel) {
        super(parcel);
        this.f12052d = parcel.readString();
        this.f12053e = parcel.readString();
        this.f12054f = parcel.readString();
        this.f12055g = parcel.readString();
    }
}
