package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.C2819c;

/* loaded from: classes4.dex */
public final class g extends Y3.a implements d, Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f12045d;

    /* renamed from: e, reason: collision with root package name */
    private String f12046e;

    /* renamed from: f, reason: collision with root package name */
    private int f12047f;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i8) {
            return new g[i8];
        }
    }

    private boolean z(g gVar) {
        if (C2819c.a(this.f12045d, gVar.f12045d) && C2819c.a(this.f12046e, gVar.f12046e) && this.f12047f == gVar.f12047f) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof g) || !z((g) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2819c.b(this.f12045d, this.f12046e, Integer.valueOf(this.f12047f));
    }

    @Override // Y3.d
    public String l() {
        return this.f12045d;
    }

    @Override // Y3.d
    public String w() {
        return this.f12046e;
    }

    @Override // Y3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f12045d);
        parcel.writeString(this.f12046e);
        parcel.writeInt(this.f12047f);
    }

    @Override // Y3.d
    public int x() {
        return this.f12047f;
    }

    private g(Parcel parcel) {
        super(parcel);
        this.f12045d = parcel.readString();
        this.f12046e = parcel.readString();
        this.f12047f = parcel.readInt();
    }
}
