package Y3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public abstract class a implements c, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12040a;

    /* renamed from: b, reason: collision with root package name */
    private String f12041b;

    /* renamed from: c, reason: collision with root package name */
    private int f12042c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Parcel parcel) {
        this.f12040a = parcel.readString();
        this.f12041b = parcel.readString();
        this.f12042c = parcel.readInt();
    }

    @Override // Y3.c
    public String p() {
        return this.f12041b;
    }

    @Override // Y3.c
    public int u() {
        return this.f12042c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12040a);
        parcel.writeString(this.f12041b);
        parcel.writeInt(this.f12042c);
    }

    @Override // Y3.c
    public String y() {
        return this.f12040a;
    }
}
