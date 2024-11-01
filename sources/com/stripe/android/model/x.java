package com.stripe.android.model;

import R5.AbstractC1435t;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;

/* loaded from: classes4.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f26018a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26019b;

    /* renamed from: c, reason: collision with root package name */
    private final String f26020c;

    /* renamed from: d, reason: collision with root package name */
    private final b f26021d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new x(parcel.readString(), parcel.readString(), parcel.readString(), b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x[] newArray(int i8) {
            return new x[i8];
        }
    }

    public x(String source, String directoryServerName, String serverTransactionId, b directoryServerEncryption) {
        AbstractC3292y.i(source, "source");
        AbstractC3292y.i(directoryServerName, "directoryServerName");
        AbstractC3292y.i(serverTransactionId, "serverTransactionId");
        AbstractC3292y.i(directoryServerEncryption, "directoryServerEncryption");
        this.f26018a = source;
        this.f26019b = directoryServerName;
        this.f26020c = serverTransactionId;
        this.f26021d = directoryServerEncryption;
    }

    public final b a() {
        return this.f26021d;
    }

    public final String b() {
        return this.f26019b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AbstractC3292y.d(this.f26018a, xVar.f26018a) && AbstractC3292y.d(this.f26019b, xVar.f26019b) && AbstractC3292y.d(this.f26020c, xVar.f26020c) && AbstractC3292y.d(this.f26021d, xVar.f26021d);
    }

    public final String f() {
        return this.f26018a;
    }

    public int hashCode() {
        return (((((this.f26018a.hashCode() * 31) + this.f26019b.hashCode()) * 31) + this.f26020c.hashCode()) * 31) + this.f26021d.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.f26018a + ", directoryServerName=" + this.f26019b + ", serverTransactionId=" + this.f26020c + ", directoryServerEncryption=" + this.f26021d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f26018a);
        out.writeString(this.f26019b);
        out.writeString(this.f26020c);
        this.f26021d.writeToParcel(out, i8);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f26024a;

        /* renamed from: b, reason: collision with root package name */
        private final PublicKey f26025b;

        /* renamed from: c, reason: collision with root package name */
        private final List f26026c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26027d;

        /* renamed from: e, reason: collision with root package name */
        private static final a f26022e = new a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f26023f = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0529b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate c(String str) {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = str.getBytes(C3338d.f34755b);
                AbstractC3292y.h(bytes, "getBytes(...)");
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                AbstractC3292y.g(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) generateCertificate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List d(List list) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC1435t.x(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(b.f26022e.c((String) it.next()));
                }
                return arrayList;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.x$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0529b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new b(readString, publicKey, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String directoryServerId, PublicKey directoryServerPublicKey, List rootCerts, String str) {
            AbstractC3292y.i(directoryServerId, "directoryServerId");
            AbstractC3292y.i(directoryServerPublicKey, "directoryServerPublicKey");
            AbstractC3292y.i(rootCerts, "rootCerts");
            this.f26024a = directoryServerId;
            this.f26025b = directoryServerPublicKey;
            this.f26026c = rootCerts;
            this.f26027d = str;
        }

        public final String b() {
            return this.f26024a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f26024a, bVar.f26024a) && AbstractC3292y.d(this.f26025b, bVar.f26025b) && AbstractC3292y.d(this.f26026c, bVar.f26026c) && AbstractC3292y.d(this.f26027d, bVar.f26027d);
        }

        public final PublicKey f() {
            return this.f26025b;
        }

        public final String h() {
            return this.f26027d;
        }

        public int hashCode() {
            int hashCode = ((((this.f26024a.hashCode() * 31) + this.f26025b.hashCode()) * 31) + this.f26026c.hashCode()) * 31;
            String str = this.f26027d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final List i() {
            return this.f26026c;
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.f26024a + ", directoryServerPublicKey=" + this.f26025b + ", rootCerts=" + this.f26026c + ", keyId=" + this.f26027d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f26024a);
            out.writeSerializable(this.f26025b);
            List list = this.f26026c;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeSerializable((Serializable) it.next());
            }
            out.writeString(this.f26027d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public b(java.lang.String r3, java.lang.String r4, java.util.List r5, java.lang.String r6) {
            /*
                r2 = this;
                java.lang.String r0 = "directoryServerId"
                kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                java.lang.String r0 = "dsCertificateData"
                kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                java.lang.String r0 = "rootCertsData"
                kotlin.jvm.internal.AbstractC3292y.i(r5, r0)
                com.stripe.android.model.x$b$a r0 = com.stripe.android.model.x.b.f26022e
                java.security.cert.X509Certificate r4 = com.stripe.android.model.x.b.a.a(r0, r4)
                java.security.PublicKey r4 = r4.getPublicKey()
                java.lang.String r1 = "getPublicKey(...)"
                kotlin.jvm.internal.AbstractC3292y.h(r4, r1)
                java.util.List r5 = com.stripe.android.model.x.b.a.b(r0, r5)
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.x.b.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(StripeIntent.a.j.b sdkData) {
        this(sdkData.i(), sdkData.h(), sdkData.p(), new b(sdkData.f().a(), sdkData.f().b(), sdkData.f().h(), sdkData.f().f()));
        AbstractC3292y.i(sdkData, "sdkData");
    }
}
