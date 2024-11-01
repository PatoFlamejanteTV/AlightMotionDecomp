package Y3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.C2819c;

/* loaded from: classes4.dex */
public final class e extends Y3.a implements b, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: d, reason: collision with root package name */
    private String f12043d;

    /* renamed from: e, reason: collision with root package name */
    private int f12044e;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i8) {
            return new e[i8];
        }
    }

    private boolean z(e eVar) {
        if (C2819c.a(this.f12043d, eVar.f12043d) && this.f12044e == eVar.f12044e) {
            return true;
        }
        return false;
    }

    @Override // Y3.b
    public int b() {
        return this.f12044e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof e) || !z((e) obj))) {
            return false;
        }
        return true;
    }

    @Override // Y3.b
    public String f() {
        return this.f12043d;
    }

    public int hashCode() {
        return C2819c.b(this.f12043d, Integer.valueOf(this.f12044e));
    }

    @Override // Y3.a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeString(this.f12043d);
        parcel.writeInt(this.f12044e);
    }

    private e(Parcel parcel) {
        super(parcel);
        this.f12043d = parcel.readString();
        this.f12044e = parcel.readInt();
    }
}
