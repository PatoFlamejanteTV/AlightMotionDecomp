package k3;

import Q5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stripe.android.model.Source;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3237c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f34406a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34407b;

    /* renamed from: c, reason: collision with root package name */
    private final x2.k f34408c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f34409d;

    /* renamed from: e, reason: collision with root package name */
    private final String f34410e;

    /* renamed from: f, reason: collision with root package name */
    private final Source f34411f;

    /* renamed from: g, reason: collision with root package name */
    private final String f34412g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f34404h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f34405i = 8;
    public static final Parcelable.Creator<C3237c> CREATOR = new b();

    /* renamed from: k3.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public C3237c a(Parcel parcel) {
            x2.k kVar;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            Serializable readSerializable = parcel.readSerializable();
            if (readSerializable instanceof x2.k) {
                kVar = (x2.k) readSerializable;
            } else {
                kVar = null;
            }
            x2.k kVar2 = kVar;
            boolean z8 = true;
            if (parcel.readInt() != 1) {
                z8 = false;
            }
            return new C3237c(readString, readInt, kVar2, z8, parcel.readString(), (Source) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString());
        }

        public final /* synthetic */ C3237c b(Intent intent) {
            C3237c c3237c;
            if (intent != null) {
                c3237c = (C3237c) intent.getParcelableExtra("extra_args");
            } else {
                c3237c = null;
            }
            if (c3237c == null) {
                return new C3237c(null, 0, null, false, null, null, null, ModuleDescriptor.MODULE_VERSION, null);
            }
            return c3237c;
        }

        public void c(C3237c c3237c, Parcel parcel, int i8) {
            int i9;
            AbstractC3292y.i(c3237c, "<this>");
            AbstractC3292y.i(parcel, "parcel");
            parcel.writeString(c3237c.d());
            parcel.writeInt(c3237c.i());
            parcel.writeSerializable(c3237c.h());
            Integer num = 1;
            if (!c3237c.f()) {
                num = null;
            }
            if (num != null) {
                i9 = num.intValue();
            } else {
                i9 = 0;
            }
            parcel.writeInt(i9);
            parcel.writeString(c3237c.p());
            parcel.writeParcelable(c3237c.l(), i8);
            parcel.writeString(c3237c.s());
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: k3.c$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3237c createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return C3237c.f34404h.a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3237c[] newArray(int i8) {
            return new C3237c[i8];
        }
    }

    public C3237c(String str, int i8, x2.k kVar, boolean z8, String str2, Source source, String str3) {
        this.f34406a = str;
        this.f34407b = i8;
        this.f34408c = kVar;
        this.f34409d = z8;
        this.f34410e = str2;
        this.f34411f = source;
        this.f34412g = str3;
    }

    public static /* synthetic */ C3237c b(C3237c c3237c, String str, int i8, x2.k kVar, boolean z8, String str2, Source source, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = c3237c.f34406a;
        }
        if ((i9 & 2) != 0) {
            i8 = c3237c.f34407b;
        }
        int i10 = i8;
        if ((i9 & 4) != 0) {
            kVar = c3237c.f34408c;
        }
        x2.k kVar2 = kVar;
        if ((i9 & 8) != 0) {
            z8 = c3237c.f34409d;
        }
        boolean z9 = z8;
        if ((i9 & 16) != 0) {
            str2 = c3237c.f34410e;
        }
        String str4 = str2;
        if ((i9 & 32) != 0) {
            source = c3237c.f34411f;
        }
        Source source2 = source;
        if ((i9 & 64) != 0) {
            str3 = c3237c.f34412g;
        }
        return c3237c.a(str, i10, kVar2, z9, str4, source2, str3);
    }

    public final C3237c a(String str, int i8, x2.k kVar, boolean z8, String str2, Source source, String str3) {
        return new C3237c(str, i8, kVar, z8, str2, source, str3);
    }

    public final String d() {
        return this.f34406a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3237c)) {
            return false;
        }
        C3237c c3237c = (C3237c) obj;
        if (AbstractC3292y.d(this.f34406a, c3237c.f34406a) && this.f34407b == c3237c.f34407b && AbstractC3292y.d(this.f34408c, c3237c.f34408c) && this.f34409d == c3237c.f34409d && AbstractC3292y.d(this.f34410e, c3237c.f34410e) && AbstractC3292y.d(this.f34411f, c3237c.f34411f) && AbstractC3292y.d(this.f34412g, c3237c.f34412g)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f34409d;
    }

    public final x2.k h() {
        return this.f34408c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f34406a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = ((hashCode * 31) + this.f34407b) * 31;
        x2.k kVar = this.f34408c;
        if (kVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = kVar.hashCode();
        }
        int a9 = (((i9 + hashCode2) * 31) + androidx.compose.foundation.a.a(this.f34409d)) * 31;
        String str2 = this.f34410e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i10 = (a9 + hashCode3) * 31;
        Source source = this.f34411f;
        if (source == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = source.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        String str3 = this.f34412g;
        if (str3 != null) {
            i8 = str3.hashCode();
        }
        return i11 + i8;
    }

    public final int i() {
        return this.f34407b;
    }

    public final Source l() {
        return this.f34411f;
    }

    public final String p() {
        return this.f34410e;
    }

    public final String s() {
        return this.f34412g;
    }

    public String toString() {
        return "Unvalidated(clientSecret=" + this.f34406a + ", flowOutcome=" + this.f34407b + ", exception=" + this.f34408c + ", canCancelSource=" + this.f34409d + ", sourceId=" + this.f34410e + ", source=" + this.f34411f + ", stripeAccountId=" + this.f34412g + ")";
    }

    public final /* synthetic */ Bundle u() {
        return BundleKt.bundleOf(x.a("extra_args", this));
    }

    public final C3238d v() {
        boolean z8;
        x2.k kVar = this.f34408c;
        if (!(kVar instanceof Throwable)) {
            String str = this.f34406a;
            if (str != null && !n.T(str)) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!z8) {
                return new C3238d(this.f34406a, this.f34407b, this.f34409d, this.f34410e, this.f34411f, this.f34412g);
            }
            throw new IllegalArgumentException("Invalid client_secret value in result Intent.".toString());
        }
        throw kVar;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        f34404h.c(this, out, i8);
    }

    public /* synthetic */ C3237c(String str, int i8, x2.k kVar, boolean z8, String str2, Source source, String str3, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? null : str, (i9 & 2) != 0 ? 0 : i8, (i9 & 4) != 0 ? null : kVar, (i9 & 8) == 0 ? z8 : false, (i9 & 16) != 0 ? null : str2, (i9 & 32) != 0 ? null : source, (i9 & 64) != 0 ? null : str3);
    }
}
