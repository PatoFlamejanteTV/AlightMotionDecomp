package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import d4.C2757a;
import e4.C2819c;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements Serializable, Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0674a();

        /* renamed from: a, reason: collision with root package name */
        private final a4.k f28063a;

        /* renamed from: b, reason: collision with root package name */
        private final String f28064b;

        /* renamed from: c, reason: collision with root package name */
        private final C2757a f28065c;

        /* renamed from: d, reason: collision with root package name */
        private final String f28066d;

        /* renamed from: e, reason: collision with root package name */
        private final b f28067e;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0674a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new a((a4.k) parcel.readSerializable(), parcel.readString(), C2757a.CREATOR.createFromParcel(parcel), parcel.readString(), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Serializable, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C0675a();

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f28068a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f28069b;

            /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0675a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new b(parcel.createByteArray(), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                AbstractC3292y.i(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                AbstractC3292y.i(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.f28068a = sdkPrivateKeyEncoded;
                this.f28069b = acsPublicKeyEncoded;
            }

            private final boolean f(b bVar) {
                if (Arrays.equals(this.f28068a, bVar.f28068a) && Arrays.equals(this.f28069b, bVar.f28069b)) {
                    return true;
                }
                return false;
            }

            public final byte[] a() {
                return this.f28069b;
            }

            public final byte[] b() {
                return this.f28068a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    return f((b) obj);
                }
                return false;
            }

            public int hashCode() {
                return C2819c.b(this.f28068a, this.f28069b);
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.f28068a) + ", acsPublicKeyEncoded=" + Arrays.toString(this.f28069b) + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeByteArray(this.f28068a);
                out.writeByteArray(this.f28069b);
            }
        }

        public a(a4.k messageTransformer, String sdkReferenceId, C2757a creqData, String acsUrl, b keys) {
            AbstractC3292y.i(messageTransformer, "messageTransformer");
            AbstractC3292y.i(sdkReferenceId, "sdkReferenceId");
            AbstractC3292y.i(creqData, "creqData");
            AbstractC3292y.i(acsUrl, "acsUrl");
            AbstractC3292y.i(keys, "keys");
            this.f28063a = messageTransformer;
            this.f28064b = sdkReferenceId;
            this.f28065c = creqData;
            this.f28066d = acsUrl;
            this.f28067e = keys;
        }

        public final String a() {
            return this.f28066d;
        }

        public final b b() {
            return this.f28067e;
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
            return AbstractC3292y.d(this.f28063a, aVar.f28063a) && AbstractC3292y.d(this.f28064b, aVar.f28064b) && AbstractC3292y.d(this.f28065c, aVar.f28065c) && AbstractC3292y.d(this.f28066d, aVar.f28066d) && AbstractC3292y.d(this.f28067e, aVar.f28067e);
        }

        public final a4.k f() {
            return this.f28063a;
        }

        public final String h() {
            return this.f28064b;
        }

        public int hashCode() {
            return (((((((this.f28063a.hashCode() * 31) + this.f28064b.hashCode()) * 31) + this.f28065c.hashCode()) * 31) + this.f28066d.hashCode()) * 31) + this.f28067e.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.f28063a + ", sdkReferenceId=" + this.f28064b + ", creqData=" + this.f28065c + ", acsUrl=" + this.f28066d + ", keys=" + this.f28067e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeSerializable(this.f28063a);
            out.writeString(this.f28064b);
            this.f28065c.writeToParcel(out, i8);
            out.writeString(this.f28066d);
            this.f28067e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Serializable {
        c Q(Z3.c cVar, U5.g gVar);
    }

    Object a(C2757a c2757a, U5.d dVar);
}
