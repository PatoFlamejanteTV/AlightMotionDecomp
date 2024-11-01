package Y3;

import Y3.q;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleCompat;
import e4.C2819c;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements q, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private p f12056a;

    /* renamed from: b, reason: collision with root package name */
    private d f12057b;

    /* renamed from: c, reason: collision with root package name */
    private o f12058c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f12059d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f12060e;

    /* renamed from: f, reason: collision with root package name */
    private String f12061f;

    /* loaded from: classes4.dex */
    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i8) {
            return new m[i8];
        }
    }

    private boolean l(m mVar) {
        if (C2819c.a(this.f12056a, mVar.f12056a) && C2819c.a(this.f12061f, mVar.f12061f) && C2819c.a(this.f12057b, mVar.f12057b) && C2819c.a(this.f12058c, mVar.f12058c) && C2819c.a(this.f12059d, mVar.f12059d) && C2819c.a(this.f12060e, mVar.f12060e)) {
            return true;
        }
        return false;
    }

    @Override // Y3.q
    public b a(q.a aVar) {
        return (b) this.f12059d.get(aVar);
    }

    @Override // Y3.q
    public d b() {
        return this.f12057b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof m) || !l((m) obj))) {
            return false;
        }
        return true;
    }

    @Override // Y3.q
    public o f() {
        return this.f12058c;
    }

    @Override // Y3.q
    public String h() {
        return this.f12061f;
    }

    public int hashCode() {
        return C2819c.b(this.f12056a, this.f12061f, this.f12057b, this.f12058c, this.f12059d, this.f12060e);
    }

    public p i() {
        return this.f12056a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f12061f);
        parcel.writeParcelable((k) this.f12056a, 0);
        parcel.writeParcelable((g) this.f12057b, 0);
        parcel.writeParcelable((i) this.f12058c, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f12059d.entrySet()) {
            bundle.putParcelable(((q.a) entry.getKey()).name(), (e) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry2 : this.f12060e.entrySet()) {
            bundle2.putParcelable((String) entry2.getKey(), (e) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public m() {
        this.f12059d = new EnumMap(q.a.class);
        this.f12060e = new HashMap();
    }

    private m(Parcel parcel) {
        this.f12061f = parcel.readString();
        this.f12056a = (p) parcel.readParcelable(k.class.getClassLoader());
        this.f12057b = (d) parcel.readParcelable(g.class.getClassLoader());
        this.f12058c = (o) parcel.readParcelable(i.class.getClassLoader());
        this.f12059d = new HashMap();
        Bundle readBundle = parcel.readBundle(m.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                b bVar = (b) BundleCompat.getParcelable(readBundle, str, b.class);
                if (bVar != null) {
                    this.f12059d.put(q.a.valueOf(str), bVar);
                }
            }
        }
        this.f12060e = new HashMap();
        Bundle readBundle2 = parcel.readBundle(m.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                b bVar2 = (b) BundleCompat.getParcelable(readBundle2, str2, b.class);
                if (bVar2 != null) {
                    this.f12060e.put(str2, bVar2);
                }
            }
        }
    }
}
