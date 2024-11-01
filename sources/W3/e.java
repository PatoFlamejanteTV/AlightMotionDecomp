package w3;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final w.b f40694a;

    /* renamed from: b, reason: collision with root package name */
    private final C4154a f40695b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f40696c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40697d;

    /* renamed from: e, reason: collision with root package name */
    private final d f40698e;

    /* renamed from: f, reason: collision with root package name */
    private final String f40699f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40700g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f40701h;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            C4154a createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            w.b createFromParcel2 = w.b.CREATOR.createFromParcel(parcel);
            d dVar = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C4154a.CREATOR.createFromParcel(parcel);
            }
            C4154a c4154a = createFromParcel;
            int readInt = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashSet.add(parcel.readString());
            }
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                dVar = d.CREATOR.createFromParcel(parcel);
            }
            d dVar2 = dVar;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            return new e(createFromParcel2, c4154a, linkedHashSet, readString, dVar2, readString2, readString3, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(w.b appearance, C4154a c4154a, Set allowedCountries, String str, d dVar, String str2, String str3, Set autocompleteCountries) {
        AbstractC3292y.i(appearance, "appearance");
        AbstractC3292y.i(allowedCountries, "allowedCountries");
        AbstractC3292y.i(autocompleteCountries, "autocompleteCountries");
        this.f40694a = appearance;
        this.f40695b = c4154a;
        this.f40696c = allowedCountries;
        this.f40697d = str;
        this.f40698e = dVar;
        this.f40699f = str2;
        this.f40700g = str3;
        this.f40701h = autocompleteCountries;
    }

    public final d a() {
        return this.f40698e;
    }

    public final C4154a b() {
        return this.f40695b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3292y.d(this.f40694a, eVar.f40694a) && AbstractC3292y.d(this.f40695b, eVar.f40695b) && AbstractC3292y.d(this.f40696c, eVar.f40696c) && AbstractC3292y.d(this.f40697d, eVar.f40697d) && AbstractC3292y.d(this.f40698e, eVar.f40698e) && AbstractC3292y.d(this.f40699f, eVar.f40699f) && AbstractC3292y.d(this.f40700g, eVar.f40700g) && AbstractC3292y.d(this.f40701h, eVar.f40701h)) {
            return true;
        }
        return false;
    }

    public final Set f() {
        return this.f40696c;
    }

    public final w.b h() {
        return this.f40694a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.f40694a.hashCode() * 31;
        C4154a c4154a = this.f40695b;
        int i8 = 0;
        if (c4154a == null) {
            hashCode = 0;
        } else {
            hashCode = c4154a.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.f40696c.hashCode()) * 31;
        String str = this.f40697d;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i9 = (hashCode6 + hashCode2) * 31;
        d dVar = this.f40698e;
        if (dVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dVar.hashCode();
        }
        int i10 = (i9 + hashCode3) * 31;
        String str2 = this.f40699f;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.f40700g;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return ((i11 + i8) * 31) + this.f40701h.hashCode();
    }

    public final Set i() {
        return this.f40701h;
    }

    public final String l() {
        return this.f40697d;
    }

    public final String p() {
        return this.f40700g;
    }

    public final String s() {
        return this.f40699f;
    }

    public String toString() {
        return "Configuration(appearance=" + this.f40694a + ", address=" + this.f40695b + ", allowedCountries=" + this.f40696c + ", buttonTitle=" + this.f40697d + ", additionalFields=" + this.f40698e + ", title=" + this.f40699f + ", googlePlacesApiKey=" + this.f40700g + ", autocompleteCountries=" + this.f40701h + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f40694a.writeToParcel(out, i8);
        C4154a c4154a = this.f40695b;
        if (c4154a == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c4154a.writeToParcel(out, i8);
        }
        Set set = this.f40696c;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        out.writeString(this.f40697d);
        d dVar = this.f40698e;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f40699f);
        out.writeString(this.f40700g);
        Set set2 = this.f40701h;
        out.writeInt(set2.size());
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            out.writeString((String) it2.next());
        }
    }
}
