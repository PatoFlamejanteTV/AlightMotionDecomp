package B5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

/* loaded from: classes5.dex */
public final class a implements Parcelable {
    public static final C0013a CREATOR = new C0013a();

    /* renamed from: a, reason: collision with root package name */
    public final List f610a;

    /* renamed from: B5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0013a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            AbstractC3292y.i(parcel, "parcel");
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, a8.e.class.getClassLoader());
            return new a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(List disclosures) {
        AbstractC3292y.i(disclosures, "disclosures");
        this.f610a = disclosures;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && AbstractC3292y.d(this.f610a, ((a) obj).f610a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f610a.hashCode();
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PartnersDisclosureArgs(disclosures=");
        a9.append(this.f610a);
        a9.append(')');
        return a9.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeList(new ArrayList());
    }
}
