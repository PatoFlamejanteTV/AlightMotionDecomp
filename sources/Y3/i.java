package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.C2819c;

/* loaded from: classes4.dex */
public final class i extends Y3.a implements o, Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private int f12048d;

    /* renamed from: e, reason: collision with root package name */
    private String f12049e;

    /* renamed from: f, reason: collision with root package name */
    private int f12050f;

    /* renamed from: g, reason: collision with root package name */
    private String f12051g;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public i[] newArray(int i8) {
            return new i[i8];
        }
    }

    private boolean z(i iVar) {
        if (this.f12048d == iVar.f12048d && C2819c.a(this.f12049e, iVar.f12049e) && this.f12050f == iVar.f12050f && C2819c.a(this.f12051g, iVar.f12051g)) {
            return true;
        }
        return false;
    }

    @Override // Y3.o
    public int b() {
        return this.f12050f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof i) || !z((i) obj))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2819c.b(Integer.valueOf(this.f12048d), this.f12049e, Integer.valueOf(this.f12050f), this.f12051g);
    }

    @Override // Y3.o
    public String i() {
        return this.f12051g;
    }

    @Override // Y3.o
    public String s() {
        return this.f12049e;
    }

    @Override // Y3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeInt(this.f12048d);
        parcel.writeString(this.f12049e);
        parcel.writeInt(this.f12050f);
        parcel.writeString(this.f12051g);
    }

    private i(Parcel parcel) {
        super(parcel);
        this.f12048d = parcel.readInt();
        this.f12049e = parcel.readString();
        this.f12050f = parcel.readInt();
        this.f12051g = parcel.readString();
    }
}
