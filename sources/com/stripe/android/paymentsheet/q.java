package com.stripe.android.paymentsheet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final b f27645b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f27646a;

    /* loaded from: classes4.dex */
    public static final class a extends q {
        public static final Parcelable.Creator<a> CREATOR = new C0645a();

        /* renamed from: c, reason: collision with root package name */
        private final Throwable f27647c;

        /* renamed from: d, reason: collision with root package name */
        private final D3.f f27648d;

        /* renamed from: e, reason: collision with root package name */
        private final List f27649e;

        /* renamed from: com.stripe.android.paymentsheet.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0645a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3292y.i(parcel, "parcel");
                Throwable th = (Throwable) parcel.readSerializable();
                D3.f fVar = (D3.f) parcel.readParcelable(a.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(parcel.readParcelable(a.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new a(th, fVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Throwable th, D3.f fVar, List list) {
            super(0, null);
            this.f27647c = th;
            this.f27648d = fVar;
            this.f27649e = list;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f27647c, aVar.f27647c) && AbstractC3292y.d(this.f27648d, aVar.f27648d) && AbstractC3292y.d(this.f27649e, aVar.f27649e);
        }

        public int hashCode() {
            Throwable th = this.f27647c;
            int hashCode = (th == null ? 0 : th.hashCode()) * 31;
            D3.f fVar = this.f27648d;
            int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
            List list = this.f27649e;
            return hashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Canceled(mostRecentError=" + this.f27647c + ", paymentSelection=" + this.f27648d + ", paymentMethods=" + this.f27649e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f27647c);
            out.writeParcelable(this.f27648d, i8);
            List list = this.f27649e;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ q a(Intent intent) {
            if (intent != null) {
                return (q) intent.getParcelableExtra("extra_activity_result");
            }
            return null;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        private final D3.f f27650c;

        /* renamed from: d, reason: collision with root package name */
        private final List f27651d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                AbstractC3292y.i(parcel, "parcel");
                D3.f fVar = (D3.f) parcel.readParcelable(c.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        arrayList2.add(parcel.readParcelable(c.class.getClassLoader()));
                    }
                    arrayList = arrayList2;
                }
                return new c(fVar, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(D3.f paymentSelection, List list) {
            super(-1, null);
            AbstractC3292y.i(paymentSelection, "paymentSelection");
            this.f27650c = paymentSelection;
            this.f27651d = list;
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
            return AbstractC3292y.d(this.f27650c, cVar.f27650c) && AbstractC3292y.d(this.f27651d, cVar.f27651d);
        }

        public int hashCode() {
            int hashCode = this.f27650c.hashCode() * 31;
            List list = this.f27651d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            return "Succeeded(paymentSelection=" + this.f27650c + ", paymentMethods=" + this.f27651d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f27650c, i8);
            List list = this.f27651d;
            if (list == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeParcelable((Parcelable) it.next(), i8);
            }
        }
    }

    public /* synthetic */ q(int i8, AbstractC3284p abstractC3284p) {
        this(i8);
    }

    public final int a() {
        return this.f27646a;
    }

    public final Bundle b() {
        return BundleKt.bundleOf(Q5.x.a("extra_activity_result", this));
    }

    private q(int i8) {
        this.f27646a = i8;
    }
}
