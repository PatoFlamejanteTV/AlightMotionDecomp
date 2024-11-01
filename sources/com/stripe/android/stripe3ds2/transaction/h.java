package com.stripe.android.stripe3ds2.transaction;

import Q5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class h implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28083a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends h {
        public static final Parcelable.Creator<a> CREATOR = new C0677a();

        /* renamed from: b, reason: collision with root package name */
        private final String f28084b;

        /* renamed from: c, reason: collision with root package name */
        private final d4.g f28085c;

        /* renamed from: d, reason: collision with root package name */
        private final n f28086d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0677a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : d4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, d4.g gVar, n intentData) {
            super(null);
            AbstractC3292y.i(intentData, "intentData");
            this.f28084b = str;
            this.f28085c = gVar;
            this.f28086d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public d4.g a() {
            return this.f28085c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f28086d;
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
            return AbstractC3292y.d(this.f28084b, aVar.f28084b) && this.f28085c == aVar.f28085c && AbstractC3292y.d(this.f28086d, aVar.f28086d);
        }

        public final String h() {
            return this.f28084b;
        }

        public int hashCode() {
            String str = this.f28084b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            d4.g gVar = this.f28085c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f28086d.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.f28084b + ", initialUiType=" + this.f28085c + ", intentData=" + this.f28086d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f28084b);
            d4.g gVar = this.f28085c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f28086d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final h a(Intent intent) {
            h hVar;
            if (intent == null || (hVar = (h) IntentCompat.getParcelableExtra(intent, "extra_result", h.class)) == null) {
                return new e(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, n.f28132e.a());
            }
            return hVar;
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f28087b;

        /* renamed from: c, reason: collision with root package name */
        private final d4.g f28088c;

        /* renamed from: d, reason: collision with root package name */
        private final n f28089d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readInt() == 0 ? null : d4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String uiTypeCode, d4.g gVar, n intentData) {
            super(null);
            AbstractC3292y.i(uiTypeCode, "uiTypeCode");
            AbstractC3292y.i(intentData, "intentData");
            this.f28087b = uiTypeCode;
            this.f28088c = gVar;
            this.f28089d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public d4.g a() {
            return this.f28088c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f28089d;
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
            return AbstractC3292y.d(this.f28087b, cVar.f28087b) && this.f28088c == cVar.f28088c && AbstractC3292y.d(this.f28089d, cVar.f28089d);
        }

        public final String h() {
            return this.f28087b;
        }

        public int hashCode() {
            int hashCode = this.f28087b.hashCode() * 31;
            d4.g gVar = this.f28088c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f28089d.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.f28087b + ", initialUiType=" + this.f28088c + ", intentData=" + this.f28089d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f28087b);
            d4.g gVar = this.f28088c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f28089d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends h {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final d4.d f28090b;

        /* renamed from: c, reason: collision with root package name */
        private final d4.g f28091c;

        /* renamed from: d, reason: collision with root package name */
        private final n f28092d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(d4.d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(d4.d data, d4.g gVar, n intentData) {
            super(null);
            AbstractC3292y.i(data, "data");
            AbstractC3292y.i(intentData, "intentData");
            this.f28090b = data;
            this.f28091c = gVar;
            this.f28092d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public d4.g a() {
            return this.f28091c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f28092d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3292y.d(this.f28090b, dVar.f28090b) && this.f28091c == dVar.f28091c && AbstractC3292y.d(this.f28092d, dVar.f28092d);
        }

        public int hashCode() {
            int hashCode = this.f28090b.hashCode() * 31;
            d4.g gVar = this.f28091c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f28092d.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f28090b + ", initialUiType=" + this.f28091c + ", intentData=" + this.f28092d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28090b.writeToParcel(out, i8);
            d4.g gVar = this.f28091c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f28092d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends h {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f28093b;

        /* renamed from: c, reason: collision with root package name */
        private final d4.g f28094c;

        /* renamed from: d, reason: collision with root package name */
        private final n f28095d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : d4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable throwable, d4.g gVar, n intentData) {
            super(null);
            AbstractC3292y.i(throwable, "throwable");
            AbstractC3292y.i(intentData, "intentData");
            this.f28093b = throwable;
            this.f28094c = gVar;
            this.f28095d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public d4.g a() {
            return this.f28094c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f28095d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3292y.d(this.f28093b, eVar.f28093b) && this.f28094c == eVar.f28094c && AbstractC3292y.d(this.f28095d, eVar.f28095d);
        }

        public int hashCode() {
            int hashCode = this.f28093b.hashCode() * 31;
            d4.g gVar = this.f28094c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f28095d.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f28093b + ", initialUiType=" + this.f28094c + ", intentData=" + this.f28095d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f28093b);
            d4.g gVar = this.f28094c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f28095d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends h {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f28096b;

        /* renamed from: c, reason: collision with root package name */
        private final d4.g f28097c;

        /* renamed from: d, reason: collision with root package name */
        private final n f28098d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new f(parcel.readString(), parcel.readInt() == 0 ? null : d4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String uiTypeCode, d4.g gVar, n intentData) {
            super(null);
            AbstractC3292y.i(uiTypeCode, "uiTypeCode");
            AbstractC3292y.i(intentData, "intentData");
            this.f28096b = uiTypeCode;
            this.f28097c = gVar;
            this.f28098d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public d4.g a() {
            return this.f28097c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f28098d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC3292y.d(this.f28096b, fVar.f28096b) && this.f28097c == fVar.f28097c && AbstractC3292y.d(this.f28098d, fVar.f28098d);
        }

        public final String h() {
            return this.f28096b;
        }

        public int hashCode() {
            int hashCode = this.f28096b.hashCode() * 31;
            d4.g gVar = this.f28097c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f28098d.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.f28096b + ", initialUiType=" + this.f28097c + ", intentData=" + this.f28098d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f28096b);
            d4.g gVar = this.f28097c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f28098d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends h {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f28099b;

        /* renamed from: c, reason: collision with root package name */
        private final d4.g f28100c;

        /* renamed from: d, reason: collision with root package name */
        private final n f28101d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readInt() == 0 ? null : d4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, d4.g gVar, n intentData) {
            super(null);
            AbstractC3292y.i(intentData, "intentData");
            this.f28099b = str;
            this.f28100c = gVar;
            this.f28101d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public d4.g a() {
            return this.f28100c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f28101d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3292y.d(this.f28099b, gVar.f28099b) && this.f28100c == gVar.f28100c && AbstractC3292y.d(this.f28101d, gVar.f28101d);
        }

        public final String h() {
            return this.f28099b;
        }

        public int hashCode() {
            String str = this.f28099b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            d4.g gVar = this.f28100c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f28101d.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.f28099b + ", initialUiType=" + this.f28100c + ", intentData=" + this.f28101d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f28099b);
            d4.g gVar = this.f28100c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f28101d.writeToParcel(out, i8);
        }
    }

    private h() {
    }

    public abstract d4.g a();

    public abstract n b();

    public final Bundle f() {
        return BundleKt.bundleOf(x.a("extra_result", this));
    }

    public /* synthetic */ h(AbstractC3284p abstractC3284p) {
        this();
    }
}
