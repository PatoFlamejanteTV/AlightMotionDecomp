package j4;

import C6.C1006a0;
import Q5.InterfaceC1416k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

@StabilityInferred(parameters = 1)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class x0 extends AbstractC3179f0 {
    public static final x0 INSTANCE = new x0();
    public static final Parcelable.Creator<x0> CREATOR = new b();

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1416k f34321a = Q5.l.a(Q5.o.f8804b, a.f34322a);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34322a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return new C1006a0("com.stripe.android.ui.core.elements.OTPSpec", x0.INSTANCE, new Annotation[0]);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            parcel.readInt();
            return x0.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x0[] newArray(int i8) {
            return new x0[i8];
        }
    }

    private x0() {
        super(null);
    }

    private final /* synthetic */ y6.b h() {
        return (y6.b) f34321a.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof x0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return -1061058889;
    }

    public r4.G i() {
        return r4.G.Companion.a("otp");
    }

    public final r4.L l() {
        return new r4.L(i(), new r4.K(0, 1, null));
    }

    public final y6.b serializer() {
        return h();
    }

    public String toString() {
        return "OTPSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(1);
    }
}
