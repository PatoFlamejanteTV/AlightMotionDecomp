package n2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import com.stripe.android.view.EnumC2676u;
import com.stripe.android.view.ShippingInfoWidget;
import g3.C2895E;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class u implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f35426a;

    /* renamed from: b, reason: collision with root package name */
    private final List f35427b;

    /* renamed from: c, reason: collision with root package name */
    private final C2895E f35428c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f35429d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f35430e;

    /* renamed from: f, reason: collision with root package name */
    private final int f35431f;

    /* renamed from: g, reason: collision with root package name */
    private final int f35432g;

    /* renamed from: h, reason: collision with root package name */
    private final List f35433h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f35434i;

    /* renamed from: j, reason: collision with root package name */
    private final Set f35435j;

    /* renamed from: k, reason: collision with root package name */
    private final EnumC2676u f35436k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f35437l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f35438m;

    /* renamed from: n, reason: collision with root package name */
    private final Integer f35439n;

    /* renamed from: o, reason: collision with root package name */
    private static final a f35423o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f35424p = 8;
    public static final Parcelable.Creator<u> CREATOR = new b();

    /* renamed from: q, reason: collision with root package name */
    private static final EnumC2676u f35425q = EnumC2676u.f29215b;

    /* loaded from: classes4.dex */
    private static final class a {
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
        public final u createFromParcel(Parcel parcel) {
            C2895E createFromParcel;
            boolean z8;
            boolean z9;
            boolean z10;
            String readString;
            boolean z11;
            boolean z12;
            Integer valueOf;
            AbstractC3292y.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(ShippingInfoWidget.a.valueOf(parcel.readString()));
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                arrayList2.add(ShippingInfoWidget.a.valueOf(parcel.readString()));
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = C2895E.CREATOR.createFromParcel(parcel);
            }
            C2895E c2895e = createFromParcel;
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt5);
            for (int i10 = 0; i10 != readInt5; i10++) {
                arrayList3.add(o.p.CREATOR.createFromParcel(parcel));
            }
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            int readInt6 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt6);
            int i11 = 0;
            while (true) {
                readString = parcel.readString();
                if (i11 == readInt6) {
                    break;
                }
                linkedHashSet.add(readString);
                i11++;
            }
            EnumC2676u valueOf2 = EnumC2676u.valueOf(readString);
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            android.support.v4.media.a.a(parcel.readSerializable());
            android.support.v4.media.a.a(parcel.readSerializable());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            return new u(arrayList, arrayList2, c2895e, z8, z9, readInt3, readInt4, arrayList3, z10, linkedHashSet, valueOf2, z11, z12, null, null, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final u[] newArray(int i8) {
            return new u[i8];
        }
    }

    /* loaded from: classes4.dex */
    public interface c extends Serializable {
    }

    /* loaded from: classes4.dex */
    public interface d extends Serializable {
    }

    public u(List hiddenShippingInfoFields, List optionalShippingInfoFields, C2895E c2895e, boolean z8, boolean z9, int i8, int i9, List paymentMethodTypes, boolean z10, Set allowedShippingCountryCodes, EnumC2676u billingAddressFields, boolean z11, boolean z12, c shippingInformationValidator, d dVar, Integer num) {
        AbstractC3292y.i(hiddenShippingInfoFields, "hiddenShippingInfoFields");
        AbstractC3292y.i(optionalShippingInfoFields, "optionalShippingInfoFields");
        AbstractC3292y.i(paymentMethodTypes, "paymentMethodTypes");
        AbstractC3292y.i(allowedShippingCountryCodes, "allowedShippingCountryCodes");
        AbstractC3292y.i(billingAddressFields, "billingAddressFields");
        AbstractC3292y.i(shippingInformationValidator, "shippingInformationValidator");
        this.f35426a = hiddenShippingInfoFields;
        this.f35427b = optionalShippingInfoFields;
        this.f35428c = c2895e;
        this.f35429d = z8;
        this.f35430e = z9;
        this.f35431f = i8;
        this.f35432g = i9;
        this.f35433h = paymentMethodTypes;
        this.f35434i = z10;
        this.f35435j = allowedShippingCountryCodes;
        this.f35436k = billingAddressFields;
        this.f35437l = z11;
        this.f35438m = z12;
        this.f35439n = num;
        String[] iSOCountries = Locale.getISOCountries();
        Iterator it = allowedShippingCountryCodes.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            AbstractC3292y.f(iSOCountries);
            for (String str2 : iSOCountries) {
                if (l6.n.s(str, str2, true)) {
                    break;
                }
            }
            throw new IllegalArgumentException(("'" + str + "' is not a valid country code").toString());
        }
        if (this.f35430e) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.".toString());
        }
    }

    public final Set a() {
        return this.f35435j;
    }

    public final List b() {
        return this.f35426a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (AbstractC3292y.d(this.f35426a, uVar.f35426a) && AbstractC3292y.d(this.f35427b, uVar.f35427b) && AbstractC3292y.d(this.f35428c, uVar.f35428c) && this.f35429d == uVar.f35429d && this.f35430e == uVar.f35430e && this.f35431f == uVar.f35431f && this.f35432g == uVar.f35432g && AbstractC3292y.d(this.f35433h, uVar.f35433h) && this.f35434i == uVar.f35434i && AbstractC3292y.d(this.f35435j, uVar.f35435j) && this.f35436k == uVar.f35436k && this.f35437l == uVar.f35437l && this.f35438m == uVar.f35438m && AbstractC3292y.d(null, null) && AbstractC3292y.d(null, null) && AbstractC3292y.d(this.f35439n, uVar.f35439n)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f35427b;
    }

    public final C2895E h() {
        return this.f35428c;
    }

    public int hashCode() {
        this.f35426a.hashCode();
        this.f35427b.hashCode();
        C2895E c2895e = this.f35428c;
        if (c2895e != null) {
            c2895e.hashCode();
        }
        androidx.compose.foundation.a.a(this.f35429d);
        androidx.compose.foundation.a.a(this.f35430e);
        this.f35433h.hashCode();
        androidx.compose.foundation.a.a(this.f35434i);
        this.f35435j.hashCode();
        this.f35436k.hashCode();
        androidx.compose.foundation.a.a(this.f35437l);
        androidx.compose.foundation.a.a(this.f35438m);
        throw null;
    }

    public final c i() {
        return null;
    }

    public final d l() {
        return null;
    }

    public final boolean p() {
        return this.f35429d;
    }

    public final boolean s() {
        return this.f35430e;
    }

    public String toString() {
        return "PaymentSessionConfig(hiddenShippingInfoFields=" + this.f35426a + ", optionalShippingInfoFields=" + this.f35427b + ", prepopulatedShippingInfo=" + this.f35428c + ", isShippingInfoRequired=" + this.f35429d + ", isShippingMethodRequired=" + this.f35430e + ", paymentMethodsFooterLayoutId=" + this.f35431f + ", addPaymentMethodFooterLayoutId=" + this.f35432g + ", paymentMethodTypes=" + this.f35433h + ", shouldShowGooglePay=" + this.f35434i + ", allowedShippingCountryCodes=" + this.f35435j + ", billingAddressFields=" + this.f35436k + ", canDeletePaymentMethods=" + this.f35437l + ", shouldPrefetchCustomer=" + this.f35438m + ", shippingInformationValidator=" + ((Object) null) + ", shippingMethodsFactory=" + ((Object) null) + ", windowFlags=" + this.f35439n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        List list = this.f35426a;
        out.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            out.writeString(((ShippingInfoWidget.a) it.next()).name());
        }
        List list2 = this.f35427b;
        out.writeInt(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            out.writeString(((ShippingInfoWidget.a) it2.next()).name());
        }
        C2895E c2895e = this.f35428c;
        if (c2895e == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2895e.writeToParcel(out, i8);
        }
        out.writeInt(this.f35429d ? 1 : 0);
        out.writeInt(this.f35430e ? 1 : 0);
        out.writeInt(this.f35431f);
        out.writeInt(this.f35432g);
        List list3 = this.f35433h;
        out.writeInt(list3.size());
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            ((o.p) it3.next()).writeToParcel(out, i8);
        }
        out.writeInt(this.f35434i ? 1 : 0);
        Set set = this.f35435j;
        out.writeInt(set.size());
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            out.writeString((String) it4.next());
        }
        out.writeString(this.f35436k.name());
        out.writeInt(this.f35437l ? 1 : 0);
        out.writeInt(this.f35438m ? 1 : 0);
        out.writeSerializable(null);
        out.writeSerializable(null);
        Integer num = this.f35439n;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
    }
}
