package F2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.paymentsheet.w;
import g3.EnumC2906e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final w.b f2135a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2136b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2137c;

    /* renamed from: d, reason: collision with root package name */
    private final w.c f2138d;

    /* renamed from: e, reason: collision with root package name */
    private final w.d f2139e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2140f;

    /* renamed from: g, reason: collision with root package name */
    private final List f2141g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2142h;

    /* renamed from: i, reason: collision with root package name */
    private final List f2143i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f2133j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    public static final int f2134k = 8;
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            boolean z8;
            boolean z9;
            AbstractC3292y.i(parcel, "parcel");
            w.b createFromParcel = w.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            String readString = parcel.readString();
            w.c createFromParcel2 = w.c.CREATOR.createFromParcel(parcel);
            w.d createFromParcel3 = w.d.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(EnumC2906e.valueOf(parcel.readString()));
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            return new c(createFromParcel, z8, readString, createFromParcel2, createFromParcel3, readString2, arrayList, z9, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(w.b appearance, boolean z8, String str, w.c defaultBillingDetails, w.d billingDetailsCollectionConfiguration, String merchantDisplayName, List preferredNetworks, boolean z9, List paymentMethodOrder) {
        AbstractC3292y.i(appearance, "appearance");
        AbstractC3292y.i(defaultBillingDetails, "defaultBillingDetails");
        AbstractC3292y.i(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC3292y.i(merchantDisplayName, "merchantDisplayName");
        AbstractC3292y.i(preferredNetworks, "preferredNetworks");
        AbstractC3292y.i(paymentMethodOrder, "paymentMethodOrder");
        this.f2135a = appearance;
        this.f2136b = z8;
        this.f2137c = str;
        this.f2138d = defaultBillingDetails;
        this.f2139e = billingDetailsCollectionConfiguration;
        this.f2140f = merchantDisplayName;
        this.f2141g = preferredNetworks;
        this.f2142h = z9;
        this.f2143i = paymentMethodOrder;
    }

    public final boolean a() {
        return this.f2142h;
    }

    public final w.b b() {
        return this.f2135a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3292y.d(this.f2135a, cVar.f2135a) && this.f2136b == cVar.f2136b && AbstractC3292y.d(this.f2137c, cVar.f2137c) && AbstractC3292y.d(this.f2138d, cVar.f2138d) && AbstractC3292y.d(this.f2139e, cVar.f2139e) && AbstractC3292y.d(this.f2140f, cVar.f2140f) && AbstractC3292y.d(this.f2141g, cVar.f2141g) && this.f2142h == cVar.f2142h && AbstractC3292y.d(this.f2143i, cVar.f2143i)) {
            return true;
        }
        return false;
    }

    public final w.d f() {
        return this.f2139e;
    }

    public final w.c h() {
        return this.f2138d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f2135a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f2136b)) * 31;
        String str = this.f2137c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((((((hashCode2 + hashCode) * 31) + this.f2138d.hashCode()) * 31) + this.f2139e.hashCode()) * 31) + this.f2140f.hashCode()) * 31) + this.f2141g.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f2142h)) * 31) + this.f2143i.hashCode();
    }

    public final boolean i() {
        return this.f2136b;
    }

    public final String l() {
        return this.f2137c;
    }

    public final String p() {
        return this.f2140f;
    }

    public final List s() {
        return this.f2143i;
    }

    public String toString() {
        return "Configuration(appearance=" + this.f2135a + ", googlePayEnabled=" + this.f2136b + ", headerTextForSelectionScreen=" + this.f2137c + ", defaultBillingDetails=" + this.f2138d + ", billingDetailsCollectionConfiguration=" + this.f2139e + ", merchantDisplayName=" + this.f2140f + ", preferredNetworks=" + this.f2141g + ", allowsRemovalOfLastSavedPaymentMethod=" + this.f2142h + ", paymentMethodOrder=" + this.f2143i + ")";
    }

    public final List u() {
        return this.f2141g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        this.f2135a.writeToParcel(out, i8);
        out.writeInt(this.f2136b ? 1 : 0);
        out.writeString(this.f2137c);
        this.f2138d.writeToParcel(out, i8);
        this.f2139e.writeToParcel(out, i8);
        out.writeString(this.f2140f);
        List list = this.f2141g;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeString(((EnumC2906e) it.next()).name());
        }
        out.writeInt(this.f2142h ? 1 : 0);
        out.writeStringList(this.f2143i);
    }
}
