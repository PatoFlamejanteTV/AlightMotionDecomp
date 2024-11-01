package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.o;
import g3.InterfaceC2900J;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class q implements InterfaceC2900J, Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public static final int f25874b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final o.p f25875a;

    /* loaded from: classes4.dex */
    public static final class a extends q {

        /* renamed from: c, reason: collision with root package name */
        private Boolean f25878c;

        /* renamed from: d, reason: collision with root package name */
        public static final C0521a f25876d = new C0521a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f25877e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.q$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0521a {
            private C0521a() {
            }

            public /* synthetic */ C0521a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                Boolean valueOf;
                AbstractC3292y.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new a(valueOf);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(Boolean bool) {
            super(o.p.f25761o, null);
            this.f25878c = bool;
        }

        @Override // com.stripe.android.model.q
        public List a() {
            String str;
            Boolean bool = this.f25878c;
            if (bool != null) {
                str = bool.toString();
            } else {
                str = null;
            }
            return AbstractC1435t.e(Q5.x.a("confirmed", str));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f25878c, ((a) obj).f25878c);
        }

        public int hashCode() {
            Boolean bool = this.f25878c;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public String toString() {
            return "BacsDebit(confirmed=" + this.f25878c + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            int i9;
            AbstractC3292y.i(out, "out");
            Boolean bool = this.f25878c;
            if (bool == null) {
                i9 = 0;
            } else {
                out.writeInt(1);
                i9 = bool.booleanValue();
            }
            out.writeInt(i9);
        }
    }

    public /* synthetic */ q(o.p pVar, AbstractC3284p abstractC3284p) {
        this(pVar);
    }

    @Override // g3.InterfaceC2900J
    public final Map B() {
        Map map;
        List<Q5.r> a9 = a();
        Map h8 = Q.h();
        for (Q5.r rVar : a9) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 != null) {
                map = Q.e(Q5.x.a(str, b9));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        if (!h8.isEmpty()) {
            return Q.e(Q5.x.a(this.f25875a.f25773a, h8));
        }
        return Q.h();
    }

    public abstract List a();

    private q(o.p pVar) {
        this.f25875a = pVar;
    }
}
