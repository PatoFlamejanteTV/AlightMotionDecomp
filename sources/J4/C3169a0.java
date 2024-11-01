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

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: j4.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3169a0 extends AbstractC3179f0 {
    public static final C3169a0 INSTANCE = new C3169a0();

    /* renamed from: a, reason: collision with root package name */
    private static final r4.G f34085a = r4.G.Companion.a("empty");

    /* renamed from: b, reason: collision with root package name */
    public static final int f34086b = r4.G.f37990d;
    public static final Parcelable.Creator<C3169a0> CREATOR = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1416k f34087c = Q5.l.a(Q5.o.f8804b, a.f34088a);

    /* renamed from: j4.a0$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34088a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y6.b invoke() {
            return new C1006a0("com.stripe.android.ui.core.elements.EmptyFormSpec", C3169a0.INSTANCE, new Annotation[0]);
        }
    }

    /* renamed from: j4.a0$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3169a0 createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            parcel.readInt();
            return C3169a0.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C3169a0[] newArray(int i8) {
            return new C3169a0[i8];
        }
    }

    private C3169a0() {
        super(null);
    }

    private final /* synthetic */ y6.b h() {
        return (y6.b) f34087c.getValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof C3169a0)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 780162941;
    }

    public final y6.b serializer() {
        return h();
    }

    public String toString() {
        return "EmptyFormSpec";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeInt(1);
    }
}
