package E5;

import D5.t;
import H6.k;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class a implements Parcelable {
    public static final C0035a CREATOR = new C0035a();

    /* renamed from: a, reason: collision with root package name */
    public final String f1940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1941b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1942c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1943d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1944e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1945f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1946g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1947h;

    /* renamed from: i, reason: collision with root package name */
    public final String f1948i;

    /* renamed from: j, reason: collision with root package name */
    public final String f1949j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1950k;

    /* renamed from: l, reason: collision with root package name */
    public final String f1951l;

    /* renamed from: m, reason: collision with root package name */
    public final int f1952m;

    /* renamed from: n, reason: collision with root package name */
    public final b8.e f1953n;

    /* renamed from: o, reason: collision with root package name */
    public final String f1954o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1955p;

    /* renamed from: E5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0035a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            AbstractC3292y.i(parcel, "parcel");
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            if (readString == null) {
                str = "";
            } else {
                str = readString;
            }
            String readString2 = parcel.readString();
            if (readString2 == null) {
                str2 = "";
            } else {
                str2 = readString2;
            }
            String readString3 = parcel.readString();
            if (readString3 == null) {
                str3 = "";
            } else {
                str3 = readString3;
            }
            String readString4 = parcel.readString();
            if (readString4 == null) {
                str4 = "";
            } else {
                str4 = readString4;
            }
            String readString5 = parcel.readString();
            if (readString5 == null) {
                str5 = "";
            } else {
                str5 = readString5;
            }
            String readString6 = parcel.readString();
            if (readString6 == null) {
                str6 = "";
            } else {
                str6 = readString6;
            }
            String readString7 = parcel.readString();
            if (readString7 == null) {
                str7 = "";
            } else {
                str7 = readString7;
            }
            String readString8 = parcel.readString();
            if (readString8 == null) {
                str8 = "";
            } else {
                str8 = readString8;
            }
            String readString9 = parcel.readString();
            if (readString9 == null) {
                str9 = "";
            } else {
                str9 = readString9;
            }
            String readString10 = parcel.readString();
            if (readString10 == null) {
                str10 = "";
            } else {
                str10 = readString10;
            }
            String readString11 = parcel.readString();
            if (readString11 == null) {
                str11 = "";
            } else {
                str11 = readString11;
            }
            String readString12 = parcel.readString();
            if (readString12 == null) {
                str12 = "";
            } else {
                str12 = readString12;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            b8.e eVar = b8.e.IAB_VENDOR;
            if (readInt2 != 1) {
                b8.e eVar2 = b8.e.NON_IAB_VENDOR;
                if (readInt2 != 2) {
                    eVar2 = b8.e.GOOGLE_VENDOR;
                    if (readInt2 != 3) {
                        eVar2 = b8.e.PUBLISHER_VENDOR;
                        if (readInt2 != 4) {
                            eVar2 = b8.e.PURPOSE;
                            if (readInt2 != 5) {
                                eVar2 = b8.e.SPECIAL_PURPOSE;
                                if (readInt2 != 6) {
                                    eVar2 = b8.e.FEATURES;
                                    if (readInt2 != 7) {
                                        eVar2 = b8.e.SPECIAL_FEATURE;
                                        if (readInt2 != 8) {
                                            eVar2 = b8.e.GOOGLE_BASIC_CONSENT_PURPOSE;
                                            if (readInt2 != 9) {
                                                b8.e eVar3 = b8.e.PURPOSE_PARTNER;
                                                if (readInt2 == 10) {
                                                    eVar = eVar3;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                eVar = eVar2;
            }
            String readString13 = parcel.readString();
            if (readString13 == null) {
                str13 = "";
            } else {
                str13 = readString13;
            }
            String readString14 = parcel.readString();
            if (readString14 == null) {
                str14 = "";
            } else {
                str14 = readString14;
            }
            return new a(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, readInt, eVar, str13, str14);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i8) {
            return new a[i8];
        }
    }

    public a(String name, String str, String purposes, String legitimateInterests, String specialPurposes, String features, String specialFeatures, String dataDeclarations, String privacyPolicy, String cookieMaxAge, String usesNonCookieAccess, String dataRetention, int i8, b8.e switchItemType, String disclosuresUrl, String disclosuresErrorLabel) {
        AbstractC3292y.i(name, "name");
        AbstractC3292y.i(purposes, "purposes");
        AbstractC3292y.i(legitimateInterests, "legitimateInterests");
        AbstractC3292y.i(specialPurposes, "specialPurposes");
        AbstractC3292y.i(features, "features");
        AbstractC3292y.i(specialFeatures, "specialFeatures");
        AbstractC3292y.i(dataDeclarations, "dataDeclarations");
        AbstractC3292y.i(privacyPolicy, "privacyPolicy");
        AbstractC3292y.i(cookieMaxAge, "cookieMaxAge");
        AbstractC3292y.i(usesNonCookieAccess, "usesNonCookieAccess");
        AbstractC3292y.i(dataRetention, "dataRetention");
        AbstractC3292y.i(switchItemType, "switchItemType");
        AbstractC3292y.i(disclosuresUrl, "disclosuresUrl");
        AbstractC3292y.i(disclosuresErrorLabel, "disclosuresErrorLabel");
        this.f1940a = name;
        this.f1941b = str;
        this.f1942c = purposes;
        this.f1943d = legitimateInterests;
        this.f1944e = specialPurposes;
        this.f1945f = features;
        this.f1946g = specialFeatures;
        this.f1947h = dataDeclarations;
        this.f1948i = privacyPolicy;
        this.f1949j = cookieMaxAge;
        this.f1950k = usesNonCookieAccess;
        this.f1951l = dataRetention;
        this.f1952m = i8;
        this.f1953n = switchItemType;
        this.f1954o = disclosuresUrl;
        this.f1955p = disclosuresErrorLabel;
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
        if (AbstractC3292y.d(this.f1940a, aVar.f1940a) && AbstractC3292y.d(this.f1941b, aVar.f1941b) && AbstractC3292y.d(this.f1942c, aVar.f1942c) && AbstractC3292y.d(this.f1943d, aVar.f1943d) && AbstractC3292y.d(this.f1944e, aVar.f1944e) && AbstractC3292y.d(this.f1945f, aVar.f1945f) && AbstractC3292y.d(this.f1946g, aVar.f1946g) && AbstractC3292y.d(this.f1947h, aVar.f1947h) && AbstractC3292y.d(this.f1948i, aVar.f1948i) && AbstractC3292y.d(this.f1949j, aVar.f1949j) && AbstractC3292y.d(this.f1950k, aVar.f1950k) && AbstractC3292y.d(this.f1951l, aVar.f1951l) && this.f1952m == aVar.f1952m && this.f1953n == aVar.f1953n && AbstractC3292y.d(this.f1954o, aVar.f1954o) && AbstractC3292y.d(this.f1955p, aVar.f1955p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f1940a.hashCode() * 31;
        String str = this.f1941b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f1955p.hashCode() + t.a(this.f1954o, (this.f1953n.hashCode() + k.a(this.f1952m, t.a(this.f1951l, t.a(this.f1950k, t.a(this.f1949j, t.a(this.f1948i, t.a(this.f1947h, t.a(this.f1946g, t.a(this.f1945f, t.a(this.f1944e, t.a(this.f1943d, t.a(this.f1942c, (hashCode2 + hashCode) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public String toString() {
        return "PartnersDetailDialogArgs(name=" + this.f1940a + ", description=" + ((Object) this.f1941b) + ", purposes=" + this.f1942c + ", legitimateInterests=" + this.f1943d + ", specialPurposes=" + this.f1944e + ", features=" + this.f1945f + ", specialFeatures=" + this.f1946g + ", dataDeclarations=" + this.f1947h + ", privacyPolicy=" + this.f1948i + ", cookieMaxAge=" + this.f1949j + ", usesNonCookieAccess=" + this.f1950k + ", dataRetention=" + this.f1951l + ", vendorId=" + this.f1952m + ", switchItemType=" + this.f1953n + ", disclosuresUrl=" + this.f1954o + ", disclosuresErrorLabel=" + this.f1955p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3292y.i(parcel, "parcel");
        parcel.writeString(this.f1940a);
        parcel.writeString(this.f1941b);
        parcel.writeString(this.f1942c);
        parcel.writeString(this.f1943d);
        parcel.writeString(this.f1944e);
        parcel.writeString(this.f1945f);
        parcel.writeString(this.f1946g);
        parcel.writeString(this.f1947h);
        parcel.writeString(this.f1948i);
        parcel.writeString(this.f1949j);
        parcel.writeString(this.f1950k);
        parcel.writeString(this.f1951l);
        parcel.writeInt(this.f1952m);
        parcel.writeInt(this.f1953n.f15143a);
        parcel.writeString(this.f1954o);
        parcel.writeString(this.f1955p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ a(java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, b8.e r32, java.lang.String r33, java.lang.String r34, int r35) {
        /*
            Method dump skipped, instructions count: 176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.a.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, b8.e, java.lang.String, java.lang.String, int):void");
    }
}
