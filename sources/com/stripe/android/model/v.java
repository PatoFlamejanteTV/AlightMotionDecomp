package com.stripe.android.model;

import R5.AbstractC1435t;
import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import g3.InterfaceC2900J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class v implements InterfaceC2900J, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final List f25963a;

    /* renamed from: b, reason: collision with root package name */
    private final d f25964b;

    /* renamed from: c, reason: collision with root package name */
    private static final a f25961c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f25962d = 8;
    public static final Parcelable.Creator<v> CREATOR = new b();

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
        public final v createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            AbstractC3292y.i(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(c.CREATOR.createFromParcel(parcel));
                }
            }
            return new v(arrayList, parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final v[] newArray(int i8) {
            return new v[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC0527c f25966a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f25967b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25968c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25969d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25970e;

        /* renamed from: f, reason: collision with root package name */
        private final Integer f25971f;

        /* renamed from: g, reason: collision with root package name */
        private static final a f25965g = new a(null);
        public static final Parcelable.Creator<c> CREATOR = new b();

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
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(parcel.readInt() == 0 ? null : EnumC0527c.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.stripe.android.model.v$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class EnumC0527c {

            /* renamed from: b, reason: collision with root package name */
            public static final EnumC0527c f25972b = new EnumC0527c("Sku", 0, "sku");

            /* renamed from: c, reason: collision with root package name */
            public static final EnumC0527c f25973c = new EnumC0527c("Tax", 1, "tax");

            /* renamed from: d, reason: collision with root package name */
            public static final EnumC0527c f25974d = new EnumC0527c("Shipping", 2, "shipping");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ EnumC0527c[] f25975e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25976f;

            /* renamed from: a, reason: collision with root package name */
            private final String f25977a;

            static {
                EnumC0527c[] a9 = a();
                f25975e = a9;
                f25976f = W5.b.a(a9);
            }

            private EnumC0527c(String str, int i8, String str2) {
                this.f25977a = str2;
            }

            private static final /* synthetic */ EnumC0527c[] a() {
                return new EnumC0527c[]{f25972b, f25973c, f25974d};
            }

            public static EnumC0527c valueOf(String str) {
                return (EnumC0527c) Enum.valueOf(EnumC0527c.class, str);
            }

            public static EnumC0527c[] values() {
                return (EnumC0527c[]) f25975e.clone();
            }

            public final String b() {
                return this.f25977a;
            }
        }

        public c(EnumC0527c enumC0527c, Integer num, String str, String str2, String str3, Integer num2) {
            this.f25966a = enumC0527c;
            this.f25967b = num;
            this.f25968c = str;
            this.f25969d = str2;
            this.f25970e = str3;
            this.f25971f = num2;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map map4;
            Map map5;
            Map h8 = Q.h();
            Integer num = this.f25967b;
            Map map6 = null;
            if (num != null) {
                map = Q.e(Q5.x.a(RewardPlus.AMOUNT, Integer.valueOf(num.intValue())));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f25968c;
            if (str != null) {
                map2 = Q.e(Q5.x.a("currency", str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f25969d;
            if (str2 != null) {
                map3 = Q.e(Q5.x.a("description", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f25970e;
            if (str3 != null) {
                map4 = Q.e(Q5.x.a("parent", str3));
            } else {
                map4 = null;
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            Map q11 = Q.q(q10, map4);
            Integer num2 = this.f25971f;
            if (num2 != null) {
                map5 = Q.e(Q5.x.a("quantity", Integer.valueOf(num2.intValue())));
            } else {
                map5 = null;
            }
            if (map5 == null) {
                map5 = Q.h();
            }
            Map q12 = Q.q(q11, map5);
            EnumC0527c enumC0527c = this.f25966a;
            if (enumC0527c != null) {
                map6 = Q.e(Q5.x.a("type", enumC0527c.b()));
            }
            if (map6 == null) {
                map6 = Q.h();
            }
            return Q.q(q12, map6);
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
            return this.f25966a == cVar.f25966a && AbstractC3292y.d(this.f25967b, cVar.f25967b) && AbstractC3292y.d(this.f25968c, cVar.f25968c) && AbstractC3292y.d(this.f25969d, cVar.f25969d) && AbstractC3292y.d(this.f25970e, cVar.f25970e) && AbstractC3292y.d(this.f25971f, cVar.f25971f);
        }

        public int hashCode() {
            EnumC0527c enumC0527c = this.f25966a;
            int hashCode = (enumC0527c == null ? 0 : enumC0527c.hashCode()) * 31;
            Integer num = this.f25967b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.f25968c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25969d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25970e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.f25971f;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Item(type=" + this.f25966a + ", amount=" + this.f25967b + ", currency=" + this.f25968c + ", description=" + this.f25969d + ", parent=" + this.f25970e + ", quantity=" + this.f25971f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            EnumC0527c enumC0527c = this.f25966a;
            if (enumC0527c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC0527c.name());
            }
            Integer num = this.f25967b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.f25968c);
            out.writeString(this.f25969d);
            out.writeString(this.f25970e);
            Integer num2 = this.f25971f;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2900J, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25979a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25980b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25981c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25982d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25983e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f25978f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new b();

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
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String str, String str2, String str3, String str4) {
            AbstractC3292y.i(address, "address");
            this.f25979a = address;
            this.f25980b = str;
            this.f25981c = str2;
            this.f25982d = str3;
            this.f25983e = str4;
        }

        @Override // g3.InterfaceC2900J
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map e8 = Q.e(Q5.x.a("address", this.f25979a.B()));
            String str = this.f25980b;
            Map map4 = null;
            if (str != null) {
                map = Q.e(Q5.x.a("carrier", str));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(e8, map);
            String str2 = this.f25981c;
            if (str2 != null) {
                map2 = Q.e(Q5.x.a("name", str2));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str3 = this.f25982d;
            if (str3 != null) {
                map3 = Q.e(Q5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str4 = this.f25983e;
            if (str4 != null) {
                map4 = Q.e(Q5.x.a("tracking_number", str4));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
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
            return AbstractC3292y.d(this.f25979a, dVar.f25979a) && AbstractC3292y.d(this.f25980b, dVar.f25980b) && AbstractC3292y.d(this.f25981c, dVar.f25981c) && AbstractC3292y.d(this.f25982d, dVar.f25982d) && AbstractC3292y.d(this.f25983e, dVar.f25983e);
        }

        public int hashCode() {
            int hashCode = this.f25979a.hashCode() * 31;
            String str = this.f25980b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25981c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25982d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25983e;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f25979a + ", carrier=" + this.f25980b + ", name=" + this.f25981c + ", phone=" + this.f25982d + ", trackingNumber=" + this.f25983e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f25979a.writeToParcel(out, i8);
            out.writeString(this.f25980b);
            out.writeString(this.f25981c);
            out.writeString(this.f25982d);
            out.writeString(this.f25983e);
        }
    }

    public v(List list, d dVar) {
        this.f25963a = list;
        this.f25964b = dVar;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map h8 = Q.h();
        List list = this.f25963a;
        Map map2 = null;
        if (list != null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((c) it.next()).B());
            }
            map = Q.e(Q5.x.a("items", arrayList));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(h8, map);
        d dVar = this.f25964b;
        if (dVar != null) {
            map2 = Q.e(Q5.x.a("shipping", dVar.B()));
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        return Q.q(q8, map2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return AbstractC3292y.d(this.f25963a, vVar.f25963a) && AbstractC3292y.d(this.f25964b, vVar.f25964b);
    }

    public int hashCode() {
        List list = this.f25963a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        d dVar = this.f25964b;
        return hashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "SourceOrderParams(items=" + this.f25963a + ", shipping=" + this.f25964b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        List list = this.f25963a;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).writeToParcel(out, i8);
            }
        }
        d dVar = this.f25964b;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
    }
}
