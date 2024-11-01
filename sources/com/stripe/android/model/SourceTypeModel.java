package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import g3.EnumC2906e;
import g3.EnumC2907f;
import g3.M;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class SourceTypeModel implements z2.f {

    /* loaded from: classes4.dex */
    public static final class Card extends SourceTypeModel {
        public static final Parcelable.Creator<Card> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25323a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25324b;

        /* renamed from: c, reason: collision with root package name */
        private final EnumC2906e f25325c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25326d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25327e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25328f;

        /* renamed from: g, reason: collision with root package name */
        private final Integer f25329g;

        /* renamed from: h, reason: collision with root package name */
        private final Integer f25330h;

        /* renamed from: i, reason: collision with root package name */
        private final EnumC2907f f25331i;

        /* renamed from: j, reason: collision with root package name */
        private final String f25332j;

        /* renamed from: k, reason: collision with root package name */
        private final ThreeDSecureStatus f25333k;

        /* renamed from: l, reason: collision with root package name */
        private final M f25334l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class ThreeDSecureStatus {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25335b;

            /* renamed from: c, reason: collision with root package name */
            public static final ThreeDSecureStatus f25336c = new ThreeDSecureStatus("Required", 0, "required");

            /* renamed from: d, reason: collision with root package name */
            public static final ThreeDSecureStatus f25337d = new ThreeDSecureStatus("Optional", 1, "optional");

            /* renamed from: e, reason: collision with root package name */
            public static final ThreeDSecureStatus f25338e = new ThreeDSecureStatus("NotSupported", 2, "not_supported");

            /* renamed from: f, reason: collision with root package name */
            public static final ThreeDSecureStatus f25339f = new ThreeDSecureStatus("Recommended", 3, "recommended");

            /* renamed from: g, reason: collision with root package name */
            public static final ThreeDSecureStatus f25340g = new ThreeDSecureStatus("Unknown", 4, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ ThreeDSecureStatus[] f25341h;

            /* renamed from: i, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25342i;

            /* renamed from: a, reason: collision with root package name */
            private final String f25343a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final ThreeDSecureStatus a(String str) {
                    Object obj;
                    Iterator<E> it = ThreeDSecureStatus.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3292y.d(((ThreeDSecureStatus) obj).f25343a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (ThreeDSecureStatus) obj;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            static {
                ThreeDSecureStatus[] a9 = a();
                f25341h = a9;
                f25342i = W5.b.a(a9);
                f25335b = new a(null);
            }

            private ThreeDSecureStatus(String str, int i8, String str2) {
                this.f25343a = str2;
            }

            private static final /* synthetic */ ThreeDSecureStatus[] a() {
                return new ThreeDSecureStatus[]{f25336c, f25337d, f25338e, f25339f, f25340g};
            }

            public static W5.a c() {
                return f25342i;
            }

            public static ThreeDSecureStatus valueOf(String str) {
                return (ThreeDSecureStatus) Enum.valueOf(ThreeDSecureStatus.class, str);
            }

            public static ThreeDSecureStatus[] values() {
                return (ThreeDSecureStatus[]) f25341h.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f25343a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Card createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new Card(parcel.readString(), parcel.readString(), EnumC2906e.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : EnumC2907f.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : M.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Card[] newArray(int i8) {
                return new Card[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(String str, String str2, EnumC2906e brand, String str3, String str4, String str5, Integer num, Integer num2, EnumC2907f enumC2907f, String str6, ThreeDSecureStatus threeDSecureStatus, M m8) {
            super(null);
            AbstractC3292y.i(brand, "brand");
            this.f25323a = str;
            this.f25324b = str2;
            this.f25325c = brand;
            this.f25326d = str3;
            this.f25327e = str4;
            this.f25328f = str5;
            this.f25329g = num;
            this.f25330h = num2;
            this.f25331i = enumC2907f;
            this.f25332j = str6;
            this.f25333k = threeDSecureStatus;
            this.f25334l = m8;
        }

        public final M a() {
            return this.f25334l;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return AbstractC3292y.d(this.f25323a, card.f25323a) && AbstractC3292y.d(this.f25324b, card.f25324b) && this.f25325c == card.f25325c && AbstractC3292y.d(this.f25326d, card.f25326d) && AbstractC3292y.d(this.f25327e, card.f25327e) && AbstractC3292y.d(this.f25328f, card.f25328f) && AbstractC3292y.d(this.f25329g, card.f25329g) && AbstractC3292y.d(this.f25330h, card.f25330h) && this.f25331i == card.f25331i && AbstractC3292y.d(this.f25332j, card.f25332j) && this.f25333k == card.f25333k && this.f25334l == card.f25334l;
        }

        public int hashCode() {
            String str = this.f25323a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25324b;
            int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25325c.hashCode()) * 31;
            String str3 = this.f25326d;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25327e;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25328f;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            Integer num = this.f25329g;
            int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25330h;
            int hashCode7 = (hashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
            EnumC2907f enumC2907f = this.f25331i;
            int hashCode8 = (hashCode7 + (enumC2907f == null ? 0 : enumC2907f.hashCode())) * 31;
            String str6 = this.f25332j;
            int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
            ThreeDSecureStatus threeDSecureStatus = this.f25333k;
            int hashCode10 = (hashCode9 + (threeDSecureStatus == null ? 0 : threeDSecureStatus.hashCode())) * 31;
            M m8 = this.f25334l;
            return hashCode10 + (m8 != null ? m8.hashCode() : 0);
        }

        public String toString() {
            return "Card(addressLine1Check=" + this.f25323a + ", addressZipCheck=" + this.f25324b + ", brand=" + this.f25325c + ", country=" + this.f25326d + ", cvcCheck=" + this.f25327e + ", dynamicLast4=" + this.f25328f + ", expiryMonth=" + this.f25329g + ", expiryYear=" + this.f25330h + ", funding=" + this.f25331i + ", last4=" + this.f25332j + ", threeDSecureStatus=" + this.f25333k + ", tokenizationMethod=" + this.f25334l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25323a);
            out.writeString(this.f25324b);
            out.writeString(this.f25325c.name());
            out.writeString(this.f25326d);
            out.writeString(this.f25327e);
            out.writeString(this.f25328f);
            Integer num = this.f25329g;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25330h;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            EnumC2907f enumC2907f = this.f25331i;
            if (enumC2907f == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(enumC2907f.name());
            }
            out.writeString(this.f25332j);
            ThreeDSecureStatus threeDSecureStatus = this.f25333k;
            if (threeDSecureStatus == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(threeDSecureStatus.name());
            }
            M m8 = this.f25334l;
            if (m8 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(m8.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a extends SourceTypeModel {
        public static final Parcelable.Creator<a> CREATOR = new C0477a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25344a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25345b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25346c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25347d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25348e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25349f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25350g;

        /* renamed from: com.stripe.android.model.SourceTypeModel$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0477a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            super(null);
            this.f25344a = str;
            this.f25345b = str2;
            this.f25346c = str3;
            this.f25347d = str4;
            this.f25348e = str5;
            this.f25349f = str6;
            this.f25350g = str7;
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
            return AbstractC3292y.d(this.f25344a, aVar.f25344a) && AbstractC3292y.d(this.f25345b, aVar.f25345b) && AbstractC3292y.d(this.f25346c, aVar.f25346c) && AbstractC3292y.d(this.f25347d, aVar.f25347d) && AbstractC3292y.d(this.f25348e, aVar.f25348e) && AbstractC3292y.d(this.f25349f, aVar.f25349f) && AbstractC3292y.d(this.f25350g, aVar.f25350g);
        }

        public int hashCode() {
            String str = this.f25344a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25345b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25346c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25347d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25348e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25349f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f25350g;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f25344a + ", branchCode=" + this.f25345b + ", country=" + this.f25346c + ", fingerPrint=" + this.f25347d + ", last4=" + this.f25348e + ", mandateReference=" + this.f25349f + ", mandateUrl=" + this.f25350g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25344a);
            out.writeString(this.f25345b);
            out.writeString(this.f25346c);
            out.writeString(this.f25347d);
            out.writeString(this.f25348e);
            out.writeString(this.f25349f);
            out.writeString(this.f25350g);
        }
    }

    private SourceTypeModel() {
    }

    public /* synthetic */ SourceTypeModel(AbstractC3284p abstractC3284p) {
        this();
    }
}
