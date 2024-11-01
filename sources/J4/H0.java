package j4;

import C6.AbstractC1012d0;
import C6.C;
import C6.C1013e;
import C6.C1014e0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import j4.F0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import z6.AbstractC4273a;

@StabilityInferred(parameters = 0)
@y6.g
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class H0 implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f33819a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f33820b;

    /* renamed from: c, reason: collision with root package name */
    private final F0 f33821c;
    public static final b Companion = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f33817d = 8;
    public static final Parcelable.Creator<H0> CREATOR = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final y6.b[] f33818e = {null, new C1013e(C3181g0.f34126c), null};

    /* loaded from: classes4.dex */
    public static final class a implements C6.C {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33822a;

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ C1014e0 f33823b;

        static {
            a aVar = new a();
            f33822a = aVar;
            C1014e0 c1014e0 = new C1014e0("com.stripe.android.ui.core.elements.SharedDataSpec", aVar, 3);
            c1014e0.k("type", false);
            c1014e0.k("fields", true);
            c1014e0.k("selector_icon", true);
            f33823b = c1014e0;
        }

        private a() {
        }

        @Override // y6.b, y6.i, y6.InterfaceC4248a
        public A6.f a() {
            return f33823b;
        }

        @Override // C6.C
        public y6.b[] b() {
            return C.a.a(this);
        }

        @Override // C6.C
        public y6.b[] c() {
            return new y6.b[]{C6.r0.f1092a, H0.f33818e[1], AbstractC4273a.p(F0.a.f33799a)};
        }

        @Override // y6.InterfaceC4248a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public H0 d(B6.e decoder) {
            int i8;
            String str;
            ArrayList arrayList;
            F0 f02;
            AbstractC3292y.i(decoder, "decoder");
            A6.f a9 = a();
            B6.c c8 = decoder.c(a9);
            y6.b[] bVarArr = H0.f33818e;
            String str2 = null;
            if (c8.z()) {
                String o8 = c8.o(a9, 0);
                arrayList = (ArrayList) c8.p(a9, 1, bVarArr[1], null);
                str = o8;
                f02 = (F0) c8.t(a9, 2, F0.a.f33799a, null);
                i8 = 7;
            } else {
                ArrayList arrayList2 = null;
                F0 f03 = null;
                int i9 = 0;
                boolean z8 = true;
                while (z8) {
                    int y8 = c8.y(a9);
                    if (y8 != -1) {
                        if (y8 != 0) {
                            if (y8 != 1) {
                                if (y8 == 2) {
                                    f03 = (F0) c8.t(a9, 2, F0.a.f33799a, f03);
                                    i9 |= 4;
                                } else {
                                    throw new y6.l(y8);
                                }
                            } else {
                                arrayList2 = (ArrayList) c8.p(a9, 1, bVarArr[1], arrayList2);
                                i9 |= 2;
                            }
                        } else {
                            str2 = c8.o(a9, 0);
                            i9 |= 1;
                        }
                    } else {
                        z8 = false;
                    }
                }
                i8 = i9;
                str = str2;
                arrayList = arrayList2;
                f02 = f03;
            }
            c8.a(a9);
            return new H0(i8, str, arrayList, f02, null);
        }

        @Override // y6.i
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void e(B6.f encoder, H0 value) {
            AbstractC3292y.i(encoder, "encoder");
            AbstractC3292y.i(value, "value");
            A6.f a9 = a();
            B6.d c8 = encoder.c(a9);
            H0.h(value, c8, a9);
            c8.a(a9);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final y6.b serializer() {
            return a.f33822a;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final H0 createFromParcel(Parcel parcel) {
            F0 createFromParcel;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                arrayList.add(parcel.readParcelable(H0.class.getClassLoader()));
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = F0.CREATOR.createFromParcel(parcel);
            }
            return new H0(readString, arrayList, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H0[] newArray(int i8) {
            return new H0[i8];
        }
    }

    public /* synthetic */ H0(int i8, String str, ArrayList arrayList, F0 f02, C6.n0 n0Var) {
        if (1 != (i8 & 1)) {
            AbstractC1012d0.a(i8, 1, a.f33822a.a());
        }
        this.f33819a = str;
        if ((i8 & 2) == 0) {
            this.f33820b = new ArrayList();
        } else {
            this.f33820b = arrayList;
        }
        if ((i8 & 4) == 0) {
            this.f33821c = null;
        } else {
            this.f33821c = f02;
        }
    }

    public static final /* synthetic */ void h(H0 h02, B6.d dVar, A6.f fVar) {
        y6.b[] bVarArr = f33818e;
        dVar.q(fVar, 0, h02.f33819a);
        if (dVar.x(fVar, 1) || !AbstractC3292y.d(h02.f33820b, new ArrayList())) {
            dVar.n(fVar, 1, bVarArr[1], h02.f33820b);
        }
        if (dVar.x(fVar, 2) || h02.f33821c != null) {
            dVar.D(fVar, 2, F0.a.f33799a, h02.f33821c);
        }
    }

    public final ArrayList b() {
        return this.f33820b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        if (AbstractC3292y.d(this.f33819a, h02.f33819a) && AbstractC3292y.d(this.f33820b, h02.f33820b) && AbstractC3292y.d(this.f33821c, h02.f33821c)) {
            return true;
        }
        return false;
    }

    public final F0 f() {
        return this.f33821c;
    }

    public final String getType() {
        return this.f33819a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f33819a.hashCode() * 31) + this.f33820b.hashCode()) * 31;
        F0 f02 = this.f33821c;
        if (f02 == null) {
            hashCode = 0;
        } else {
            hashCode = f02.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "SharedDataSpec(type=" + this.f33819a + ", fields=" + this.f33820b + ", selectorIcon=" + this.f33821c + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f33819a);
        ArrayList arrayList = this.f33820b;
        out.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            out.writeParcelable((Parcelable) it.next(), i8);
        }
        F0 f02 = this.f33821c;
        if (f02 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            f02.writeToParcel(out, i8);
        }
    }

    public H0(String type, ArrayList fields, F0 f02) {
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(fields, "fields");
        this.f33819a = type;
        this.f33820b = fields;
        this.f33821c = f02;
    }
}
