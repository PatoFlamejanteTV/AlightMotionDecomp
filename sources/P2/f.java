package P2;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.p;
import g3.C2912k;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class f implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2912k.e f8029a;

    /* renamed from: b, reason: collision with root package name */
    private final p f8030b;

    /* loaded from: classes4.dex */
    public static final class a extends f {
        public static final Parcelable.Creator<a> CREATOR = new C0158a();

        /* renamed from: c, reason: collision with root package name */
        private final C2912k.e f8031c;

        /* renamed from: d, reason: collision with root package name */
        private final p f8032d;

        /* renamed from: e, reason: collision with root package name */
        private final p f8033e;

        /* renamed from: P2.f$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0158a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a((C2912k.e) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()), (p) parcel.readParcelable(a.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2912k.e paymentDetails, p paymentMethodCreateParams, p originalParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            AbstractC3292y.i(paymentDetails, "paymentDetails");
            AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3292y.i(originalParams, "originalParams");
            this.f8031c = paymentDetails;
            this.f8032d = paymentMethodCreateParams;
            this.f8033e = originalParams;
        }

        @Override // P2.f
        public C2912k.e a() {
            return this.f8031c;
        }

        @Override // P2.f
        public p b() {
            return this.f8032d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f8031c, i8);
            out.writeParcelable(this.f8032d, i8);
            out.writeParcelable(this.f8033e, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends f {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final C2912k.e f8034c;

        /* renamed from: d, reason: collision with root package name */
        private final p f8035d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b((C2912k.e) parcel.readParcelable(b.class.getClassLoader()), (p) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2912k.e paymentDetails, p paymentMethodCreateParams) {
            super(paymentDetails, paymentMethodCreateParams, null);
            AbstractC3292y.i(paymentDetails, "paymentDetails");
            AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            this.f8034c = paymentDetails;
            this.f8035d = paymentMethodCreateParams;
        }

        @Override // P2.f
        public C2912k.e a() {
            return this.f8034c;
        }

        @Override // P2.f
        public p b() {
            return this.f8035d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f8034c, i8);
            out.writeParcelable(this.f8035d, i8);
        }
    }

    public /* synthetic */ f(C2912k.e eVar, p pVar, AbstractC3284p abstractC3284p) {
        this(eVar, pVar);
    }

    public abstract C2912k.e a();

    public abstract p b();

    private f(C2912k.e eVar, p pVar) {
        this.f8029a = eVar;
        this.f8030b = pVar;
    }
}
