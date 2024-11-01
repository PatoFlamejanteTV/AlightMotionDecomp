package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.core.os.EnvironmentCompat;
import g3.C2897G;
import g3.O;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class Source implements z2.f, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25229a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f25230b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25231c;

    /* renamed from: d, reason: collision with root package name */
    private final CodeVerification f25232d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f25233e;

    /* renamed from: f, reason: collision with root package name */
    private final String f25234f;

    /* renamed from: g, reason: collision with root package name */
    private final Flow f25235g;

    /* renamed from: h, reason: collision with root package name */
    private final Boolean f25236h;

    /* renamed from: i, reason: collision with root package name */
    private final d f25237i;

    /* renamed from: j, reason: collision with root package name */
    private final e f25238j;

    /* renamed from: k, reason: collision with root package name */
    private final Redirect f25239k;

    /* renamed from: l, reason: collision with root package name */
    private final Status f25240l;

    /* renamed from: m, reason: collision with root package name */
    private final Map f25241m;

    /* renamed from: n, reason: collision with root package name */
    private final SourceTypeModel f25242n;

    /* renamed from: o, reason: collision with root package name */
    private final String f25243o;

    /* renamed from: p, reason: collision with root package name */
    private final String f25244p;

    /* renamed from: q, reason: collision with root package name */
    private final Usage f25245q;

    /* renamed from: r, reason: collision with root package name */
    private final O f25246r;

    /* renamed from: s, reason: collision with root package name */
    private final c f25247s;

    /* renamed from: t, reason: collision with root package name */
    private final C2897G f25248t;

    /* renamed from: u, reason: collision with root package name */
    private final String f25249u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f25227v = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f25228w = 8;
    public static final Parcelable.Creator<Source> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class CodeVerification implements z2.f {
        public static final Parcelable.Creator<CodeVerification> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f25250a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f25251b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25252b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f25253c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f25254d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f25255e = new Status("Failed", 2, "failed");

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ Status[] f25256f;

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25257g;

            /* renamed from: a, reason: collision with root package name */
            private final String f25258a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final Status a(String str) {
                    Object obj;
                    Iterator<E> it = Status.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3292y.d(((Status) obj).f25258a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (Status) obj;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            static {
                Status[] a9 = a();
                f25256f = a9;
                f25257g = W5.b.a(a9);
                f25252b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f25258a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f25253c, f25254d, f25255e};
            }

            public static W5.a c() {
                return f25257g;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f25256f.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f25258a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CodeVerification createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new CodeVerification(parcel.readInt(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CodeVerification[] newArray(int i8) {
                return new CodeVerification[i8];
            }
        }

        public CodeVerification(int i8, Status status) {
            this.f25250a = i8;
            this.f25251b = status;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CodeVerification)) {
                return false;
            }
            CodeVerification codeVerification = (CodeVerification) obj;
            return this.f25250a == codeVerification.f25250a && this.f25251b == codeVerification.f25251b;
        }

        public int hashCode() {
            int i8 = this.f25250a * 31;
            Status status = this.f25251b;
            return i8 + (status == null ? 0 : status.hashCode());
        }

        public String toString() {
            return "CodeVerification(attemptsRemaining=" + this.f25250a + ", status=" + this.f25251b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeInt(this.f25250a);
            Status status = this.f25251b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Flow {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25259b;

        /* renamed from: c, reason: collision with root package name */
        public static final Flow f25260c = new Flow("Redirect", 0, "redirect");

        /* renamed from: d, reason: collision with root package name */
        public static final Flow f25261d = new Flow("Receiver", 1, "receiver");

        /* renamed from: e, reason: collision with root package name */
        public static final Flow f25262e = new Flow("CodeVerification", 2, "code_verification");

        /* renamed from: f, reason: collision with root package name */
        public static final Flow f25263f = new Flow("None", 3, "none");

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ Flow[] f25264g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25265h;

        /* renamed from: a, reason: collision with root package name */
        private final String f25266a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Flow a(String str) {
                Object obj;
                Iterator<E> it = Flow.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((Flow) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Flow) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            Flow[] a9 = a();
            f25264g = a9;
            f25265h = W5.b.a(a9);
            f25259b = new a(null);
        }

        private Flow(String str, int i8, String str2) {
            this.f25266a = str2;
        }

        private static final /* synthetic */ Flow[] a() {
            return new Flow[]{f25260c, f25261d, f25262e, f25263f};
        }

        public static W5.a c() {
            return f25265h;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) f25264g.clone();
        }

        public final String b() {
            return this.f25266a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25266a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class Redirect implements z2.f {
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25267a;

        /* renamed from: b, reason: collision with root package name */
        private final Status f25268b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25269c;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class Status {

            /* renamed from: b, reason: collision with root package name */
            public static final a f25270b;

            /* renamed from: c, reason: collision with root package name */
            public static final Status f25271c = new Status("Pending", 0, "pending");

            /* renamed from: d, reason: collision with root package name */
            public static final Status f25272d = new Status("Succeeded", 1, "succeeded");

            /* renamed from: e, reason: collision with root package name */
            public static final Status f25273e = new Status("NotRequired", 2, "not_required");

            /* renamed from: f, reason: collision with root package name */
            public static final Status f25274f = new Status("Failed", 3, "failed");

            /* renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ Status[] f25275g;

            /* renamed from: h, reason: collision with root package name */
            private static final /* synthetic */ W5.a f25276h;

            /* renamed from: a, reason: collision with root package name */
            private final String f25277a;

            /* loaded from: classes4.dex */
            public static final class a {
                private a() {
                }

                public final Status a(String str) {
                    Object obj;
                    Iterator<E> it = Status.c().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (AbstractC3292y.d(((Status) obj).f25277a, str)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    return (Status) obj;
                }

                public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            static {
                Status[] a9 = a();
                f25275g = a9;
                f25276h = W5.b.a(a9);
                f25270b = new a(null);
            }

            private Status(String str, int i8, String str2) {
                this.f25277a = str2;
            }

            private static final /* synthetic */ Status[] a() {
                return new Status[]{f25271c, f25272d, f25273e, f25274f};
            }

            public static W5.a c() {
                return f25276h;
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) f25275g.clone();
            }

            @Override // java.lang.Enum
            @Keep
            public String toString() {
                return this.f25277a;
            }
        }

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Redirect createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new Redirect(parcel.readString(), parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Redirect[] newArray(int i8) {
                return new Redirect[i8];
            }
        }

        public Redirect(String str, Status status, String str2) {
            this.f25267a = str;
            this.f25268b = status;
            this.f25269c = str2;
        }

        public final String A() {
            return this.f25267a;
        }

        public final String a() {
            return this.f25269c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Redirect)) {
                return false;
            }
            Redirect redirect = (Redirect) obj;
            return AbstractC3292y.d(this.f25267a, redirect.f25267a) && this.f25268b == redirect.f25268b && AbstractC3292y.d(this.f25269c, redirect.f25269c);
        }

        public int hashCode() {
            String str = this.f25267a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Status status = this.f25268b;
            int hashCode2 = (hashCode + (status == null ? 0 : status.hashCode())) * 31;
            String str2 = this.f25269c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Redirect(returnUrl=" + this.f25267a + ", status=" + this.f25268b + ", url=" + this.f25269c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25267a);
            Status status = this.f25268b;
            if (status == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(status.name());
            }
            out.writeString(this.f25269c);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25278b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f25279c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f25280d = new Status("Chargeable", 1, "chargeable");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f25281e = new Status("Consumed", 2, "consumed");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f25282f = new Status("Failed", 3, "failed");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f25283g = new Status("Pending", 4, "pending");

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ Status[] f25284h;

        /* renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25285i;

        /* renamed from: a, reason: collision with root package name */
        private final String f25286a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Status a(String str) {
                Object obj;
                Iterator<E> it = Status.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((Status) obj).f25286a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Status) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            Status[] a9 = a();
            f25284h = a9;
            f25285i = W5.b.a(a9);
            f25278b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f25286a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f25279c, f25280d, f25281e, f25282f, f25283g};
        }

        public static W5.a c() {
            return f25285i;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25284h.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25286a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25287b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f25288c = new Usage("Reusable", 0, "reusable");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f25289d = new Usage("SingleUse", 1, "single_use");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f25290e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25291f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25292a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final Usage a(String str) {
                Object obj;
                Iterator<E> it = Usage.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((Usage) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (Usage) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            Usage[] a9 = a();
            f25290e = a9;
            f25291f = W5.b.a(a9);
            f25287b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f25292a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f25288c, f25289d};
        }

        public static W5.a c() {
            return f25291f;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f25290e.clone();
        }

        public final String b() {
            return this.f25292a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25292a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final String a(String str) {
            String str2;
            if (str == null) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            switch (str.hashCode()) {
                case -1920743119:
                    str2 = "bancontact";
                    if (!str.equals("bancontact")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -1414960566:
                    str2 = "alipay";
                    if (!str.equals("alipay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -896955097:
                    str2 = "sofort";
                    if (!str.equals("sofort")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -825238221:
                    str2 = "three_d_secure";
                    if (!str.equals("three_d_secure")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -791770330:
                    str2 = "wechat";
                    if (!str.equals("wechat")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case -284840886:
                    str.equals(EnvironmentCompat.MEDIA_UNKNOWN);
                    return EnvironmentCompat.MEDIA_UNKNOWN;
                case 100648:
                    str2 = "eps";
                    if (!str.equals("eps")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 109234:
                    str2 = "p24";
                    if (!str.equals("p24")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 3046160:
                    str2 = "card";
                    if (!str.equals("card")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 38358441:
                    str2 = "giropay";
                    if (!str.equals("giropay")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 100048981:
                    str2 = "ideal";
                    if (!str.equals("ideal")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1251821346:
                    str2 = "multibanco";
                    if (!str.equals("multibanco")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                case 1636477296:
                    str2 = "sepa_debit";
                    if (!str.equals("sepa_debit")) {
                        return EnvironmentCompat.MEDIA_UNKNOWN;
                    }
                    break;
                default:
                    return EnvironmentCompat.MEDIA_UNKNOWN;
            }
            return str2;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Source createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Status status;
            LinkedHashMap linkedHashMap;
            AbstractC3292y.i(parcel, "parcel");
            String readString = parcel.readString();
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString2 = parcel.readString();
            CodeVerification createFromParcel = parcel.readInt() == 0 ? null : CodeVerification.CREATOR.createFromParcel(parcel);
            Long valueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String readString3 = parcel.readString();
            Flow valueOf4 = parcel.readInt() == 0 ? null : Flow.valueOf(parcel.readString());
            int i8 = 0;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            d createFromParcel2 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            e createFromParcel3 = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            Redirect createFromParcel4 = parcel.readInt() == 0 ? null : Redirect.CREATOR.createFromParcel(parcel);
            Status valueOf5 = parcel.readInt() == 0 ? null : Status.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                status = valueOf5;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (i8 != readInt) {
                    linkedHashMap2.put(parcel.readString(), parcel.readValue(Source.class.getClassLoader()));
                    i8++;
                    readInt = readInt;
                    valueOf5 = valueOf5;
                }
                status = valueOf5;
                linkedHashMap = linkedHashMap2;
            }
            return new Source(readString, valueOf2, readString2, createFromParcel, valueOf3, readString3, valueOf4, valueOf, createFromParcel2, createFromParcel3, createFromParcel4, status, linkedHashMap, (SourceTypeModel) parcel.readParcelable(Source.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : O.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C2897G.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Source[] newArray(int i8) {
            return new Source[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements z2.f {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25293a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25294b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25295c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25296d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25297e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25298f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25299g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25300h;

        /* renamed from: i, reason: collision with root package name */
        private final String f25301i;

        /* renamed from: j, reason: collision with root package name */
        private final String f25302j;

        /* renamed from: k, reason: collision with root package name */
        private final String f25303k;

        /* renamed from: l, reason: collision with root package name */
        private final String f25304l;

        /* renamed from: m, reason: collision with root package name */
        private final String f25305m;

        /* renamed from: n, reason: collision with root package name */
        private final String f25306n;

        /* renamed from: o, reason: collision with root package name */
        private final String f25307o;

        /* renamed from: p, reason: collision with root package name */
        private final String f25308p;

        /* renamed from: q, reason: collision with root package name */
        private final Set f25309q;

        /* renamed from: r, reason: collision with root package name */
        private final Set f25310r;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                int i8 = 0;
                while (i8 != readInt) {
                    linkedHashSet.add(parcel.readString());
                    i8++;
                    readInt = readInt;
                }
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
                int i9 = 0;
                while (i9 != readInt2) {
                    linkedHashSet2.add(parcel.readString());
                    i9++;
                    readInt2 = readInt2;
                }
                return new c(readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, linkedHashSet, linkedHashSet2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Set paymentMethodCategories, Set customPaymentMethods) {
            AbstractC3292y.i(paymentMethodCategories, "paymentMethodCategories");
            AbstractC3292y.i(customPaymentMethods, "customPaymentMethods");
            this.f25293a = str;
            this.f25294b = str2;
            this.f25295c = str3;
            this.f25296d = str4;
            this.f25297e = str5;
            this.f25298f = str6;
            this.f25299g = str7;
            this.f25300h = str8;
            this.f25301i = str9;
            this.f25302j = str10;
            this.f25303k = str11;
            this.f25304l = str12;
            this.f25305m = str13;
            this.f25306n = str14;
            this.f25307o = str15;
            this.f25308p = str16;
            this.f25309q = paymentMethodCategories;
            this.f25310r = customPaymentMethods;
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
            return AbstractC3292y.d(this.f25293a, cVar.f25293a) && AbstractC3292y.d(this.f25294b, cVar.f25294b) && AbstractC3292y.d(this.f25295c, cVar.f25295c) && AbstractC3292y.d(this.f25296d, cVar.f25296d) && AbstractC3292y.d(this.f25297e, cVar.f25297e) && AbstractC3292y.d(this.f25298f, cVar.f25298f) && AbstractC3292y.d(this.f25299g, cVar.f25299g) && AbstractC3292y.d(this.f25300h, cVar.f25300h) && AbstractC3292y.d(this.f25301i, cVar.f25301i) && AbstractC3292y.d(this.f25302j, cVar.f25302j) && AbstractC3292y.d(this.f25303k, cVar.f25303k) && AbstractC3292y.d(this.f25304l, cVar.f25304l) && AbstractC3292y.d(this.f25305m, cVar.f25305m) && AbstractC3292y.d(this.f25306n, cVar.f25306n) && AbstractC3292y.d(this.f25307o, cVar.f25307o) && AbstractC3292y.d(this.f25308p, cVar.f25308p) && AbstractC3292y.d(this.f25309q, cVar.f25309q) && AbstractC3292y.d(this.f25310r, cVar.f25310r);
        }

        public int hashCode() {
            String str = this.f25293a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25294b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25295c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25296d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25297e;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25298f;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.f25299g;
            int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.f25300h;
            int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.f25301i;
            int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.f25302j;
            int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.f25303k;
            int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.f25304l;
            int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.f25305m;
            int hashCode13 = (hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.f25306n;
            int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.f25307o;
            int hashCode15 = (hashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.f25308p;
            return ((((hashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.f25309q.hashCode()) * 31) + this.f25310r.hashCode();
        }

        public String toString() {
            return "Klarna(firstName=" + this.f25293a + ", lastName=" + this.f25294b + ", purchaseCountry=" + this.f25295c + ", clientToken=" + this.f25296d + ", payNowAssetUrlsDescriptive=" + this.f25297e + ", payNowAssetUrlsStandard=" + this.f25298f + ", payNowName=" + this.f25299g + ", payNowRedirectUrl=" + this.f25300h + ", payLaterAssetUrlsDescriptive=" + this.f25301i + ", payLaterAssetUrlsStandard=" + this.f25302j + ", payLaterName=" + this.f25303k + ", payLaterRedirectUrl=" + this.f25304l + ", payOverTimeAssetUrlsDescriptive=" + this.f25305m + ", payOverTimeAssetUrlsStandard=" + this.f25306n + ", payOverTimeName=" + this.f25307o + ", payOverTimeRedirectUrl=" + this.f25308p + ", paymentMethodCategories=" + this.f25309q + ", customPaymentMethods=" + this.f25310r + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25293a);
            out.writeString(this.f25294b);
            out.writeString(this.f25295c);
            out.writeString(this.f25296d);
            out.writeString(this.f25297e);
            out.writeString(this.f25298f);
            out.writeString(this.f25299g);
            out.writeString(this.f25300h);
            out.writeString(this.f25301i);
            out.writeString(this.f25302j);
            out.writeString(this.f25303k);
            out.writeString(this.f25304l);
            out.writeString(this.f25305m);
            out.writeString(this.f25306n);
            out.writeString(this.f25307o);
            out.writeString(this.f25308p);
            Set set = this.f25309q;
            out.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                out.writeString((String) it.next());
            }
            Set set2 = this.f25310r;
            out.writeInt(set2.size());
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                out.writeString((String) it2.next());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements z2.f {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25311a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25312b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25313c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25314d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.a f25315e;

        /* renamed from: f, reason: collision with root package name */
        private final String f25316f;

        /* renamed from: g, reason: collision with root package name */
        private final String f25317g;

        /* renamed from: h, reason: collision with root package name */
        private final String f25318h;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? com.stripe.android.model.a.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a aVar, String str, String str2, String str3, com.stripe.android.model.a aVar2, String str4, String str5, String str6) {
            this.f25311a = aVar;
            this.f25312b = str;
            this.f25313c = str2;
            this.f25314d = str3;
            this.f25315e = aVar2;
            this.f25316f = str4;
            this.f25317g = str5;
            this.f25318h = str6;
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
            return AbstractC3292y.d(this.f25311a, dVar.f25311a) && AbstractC3292y.d(this.f25312b, dVar.f25312b) && AbstractC3292y.d(this.f25313c, dVar.f25313c) && AbstractC3292y.d(this.f25314d, dVar.f25314d) && AbstractC3292y.d(this.f25315e, dVar.f25315e) && AbstractC3292y.d(this.f25316f, dVar.f25316f) && AbstractC3292y.d(this.f25317g, dVar.f25317g) && AbstractC3292y.d(this.f25318h, dVar.f25318h);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f25311a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f25312b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25313c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25314d;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            com.stripe.android.model.a aVar2 = this.f25315e;
            int hashCode5 = (hashCode4 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
            String str4 = this.f25316f;
            int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25317g;
            int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f25318h;
            return hashCode7 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Owner(address=" + this.f25311a + ", email=" + this.f25312b + ", name=" + this.f25313c + ", phone=" + this.f25314d + ", verifiedAddress=" + this.f25315e + ", verifiedEmail=" + this.f25316f + ", verifiedName=" + this.f25317g + ", verifiedPhone=" + this.f25318h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            com.stripe.android.model.a aVar = this.f25311a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25312b);
            out.writeString(this.f25313c);
            out.writeString(this.f25314d);
            com.stripe.android.model.a aVar2 = this.f25315e;
            if (aVar2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar2.writeToParcel(out, i8);
            }
            out.writeString(this.f25316f);
            out.writeString(this.f25317g);
            out.writeString(this.f25318h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements z2.f {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f25319a;

        /* renamed from: b, reason: collision with root package name */
        private final long f25320b;

        /* renamed from: c, reason: collision with root package name */
        private final long f25321c;

        /* renamed from: d, reason: collision with root package name */
        private final long f25322d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new e(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(String str, long j8, long j9, long j10) {
            this.f25319a = str;
            this.f25320b = j8;
            this.f25321c = j9;
            this.f25322d = j10;
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
            return AbstractC3292y.d(this.f25319a, eVar.f25319a) && this.f25320b == eVar.f25320b && this.f25321c == eVar.f25321c && this.f25322d == eVar.f25322d;
        }

        public int hashCode() {
            String str = this.f25319a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + androidx.collection.a.a(this.f25320b)) * 31) + androidx.collection.a.a(this.f25321c)) * 31) + androidx.collection.a.a(this.f25322d);
        }

        public String toString() {
            return "Receiver(address=" + this.f25319a + ", amountCharged=" + this.f25320b + ", amountReceived=" + this.f25321c + ", amountReturned=" + this.f25322d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeString(this.f25319a);
            out.writeLong(this.f25320b);
            out.writeLong(this.f25321c);
            out.writeLong(this.f25322d);
        }
    }

    public Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String type, String typeRaw, Usage usage, O o8, c cVar, C2897G c2897g, String str4) {
        AbstractC3292y.i(type, "type");
        AbstractC3292y.i(typeRaw, "typeRaw");
        this.f25229a = str;
        this.f25230b = l8;
        this.f25231c = str2;
        this.f25232d = codeVerification;
        this.f25233e = l9;
        this.f25234f = str3;
        this.f25235g = flow;
        this.f25236h = bool;
        this.f25237i = dVar;
        this.f25238j = eVar;
        this.f25239k = redirect;
        this.f25240l = status;
        this.f25241m = map;
        this.f25242n = sourceTypeModel;
        this.f25243o = type;
        this.f25244p = typeRaw;
        this.f25245q = usage;
        this.f25246r = o8;
        this.f25247s = cVar;
        this.f25248t = c2897g;
        this.f25249u = str4;
    }

    public final Flow a() {
        return this.f25235g;
    }

    public final Redirect b() {
        return this.f25239k;
    }

    public final String d() {
        return this.f25231c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Source)) {
            return false;
        }
        Source source = (Source) obj;
        return AbstractC3292y.d(this.f25229a, source.f25229a) && AbstractC3292y.d(this.f25230b, source.f25230b) && AbstractC3292y.d(this.f25231c, source.f25231c) && AbstractC3292y.d(this.f25232d, source.f25232d) && AbstractC3292y.d(this.f25233e, source.f25233e) && AbstractC3292y.d(this.f25234f, source.f25234f) && this.f25235g == source.f25235g && AbstractC3292y.d(this.f25236h, source.f25236h) && AbstractC3292y.d(this.f25237i, source.f25237i) && AbstractC3292y.d(this.f25238j, source.f25238j) && AbstractC3292y.d(this.f25239k, source.f25239k) && this.f25240l == source.f25240l && AbstractC3292y.d(this.f25241m, source.f25241m) && AbstractC3292y.d(this.f25242n, source.f25242n) && AbstractC3292y.d(this.f25243o, source.f25243o) && AbstractC3292y.d(this.f25244p, source.f25244p) && this.f25245q == source.f25245q && AbstractC3292y.d(this.f25246r, source.f25246r) && AbstractC3292y.d(this.f25247s, source.f25247s) && AbstractC3292y.d(this.f25248t, source.f25248t) && AbstractC3292y.d(this.f25249u, source.f25249u);
    }

    public final SourceTypeModel f() {
        return this.f25242n;
    }

    public String getId() {
        return this.f25229a;
    }

    public int hashCode() {
        String str = this.f25229a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f25230b;
        int hashCode2 = (hashCode + (l8 == null ? 0 : l8.hashCode())) * 31;
        String str2 = this.f25231c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CodeVerification codeVerification = this.f25232d;
        int hashCode4 = (hashCode3 + (codeVerification == null ? 0 : codeVerification.hashCode())) * 31;
        Long l9 = this.f25233e;
        int hashCode5 = (hashCode4 + (l9 == null ? 0 : l9.hashCode())) * 31;
        String str3 = this.f25234f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Flow flow = this.f25235g;
        int hashCode7 = (hashCode6 + (flow == null ? 0 : flow.hashCode())) * 31;
        Boolean bool = this.f25236h;
        int hashCode8 = (hashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        d dVar = this.f25237i;
        int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.f25238j;
        int hashCode10 = (hashCode9 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Redirect redirect = this.f25239k;
        int hashCode11 = (hashCode10 + (redirect == null ? 0 : redirect.hashCode())) * 31;
        Status status = this.f25240l;
        int hashCode12 = (hashCode11 + (status == null ? 0 : status.hashCode())) * 31;
        Map map = this.f25241m;
        int hashCode13 = (hashCode12 + (map == null ? 0 : map.hashCode())) * 31;
        SourceTypeModel sourceTypeModel = this.f25242n;
        int hashCode14 = (((((hashCode13 + (sourceTypeModel == null ? 0 : sourceTypeModel.hashCode())) * 31) + this.f25243o.hashCode()) * 31) + this.f25244p.hashCode()) * 31;
        Usage usage = this.f25245q;
        int hashCode15 = (hashCode14 + (usage == null ? 0 : usage.hashCode())) * 31;
        O o8 = this.f25246r;
        int hashCode16 = (hashCode15 + (o8 == null ? 0 : o8.hashCode())) * 31;
        c cVar = this.f25247s;
        int hashCode17 = (hashCode16 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        C2897G c2897g = this.f25248t;
        int hashCode18 = (hashCode17 + (c2897g == null ? 0 : c2897g.hashCode())) * 31;
        String str4 = this.f25249u;
        return hashCode18 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Source(id=" + this.f25229a + ", amount=" + this.f25230b + ", clientSecret=" + this.f25231c + ", codeVerification=" + this.f25232d + ", created=" + this.f25233e + ", currency=" + this.f25234f + ", flow=" + this.f25235g + ", isLiveMode=" + this.f25236h + ", owner=" + this.f25237i + ", receiver=" + this.f25238j + ", redirect=" + this.f25239k + ", status=" + this.f25240l + ", sourceTypeData=" + this.f25241m + ", sourceTypeModel=" + this.f25242n + ", type=" + this.f25243o + ", typeRaw=" + this.f25244p + ", usage=" + this.f25245q + ", _weChat=" + this.f25246r + ", _klarna=" + this.f25247s + ", sourceOrder=" + this.f25248t + ", statementDescriptor=" + this.f25249u + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25229a);
        Long l8 = this.f25230b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeString(this.f25231c);
        CodeVerification codeVerification = this.f25232d;
        if (codeVerification == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            codeVerification.writeToParcel(out, i8);
        }
        Long l9 = this.f25233e;
        if (l9 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l9.longValue());
        }
        out.writeString(this.f25234f);
        Flow flow = this.f25235g;
        if (flow == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(flow.name());
        }
        Boolean bool = this.f25236h;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        d dVar = this.f25237i;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        e eVar = this.f25238j;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        Redirect redirect = this.f25239k;
        if (redirect == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            redirect.writeToParcel(out, i8);
        }
        Status status = this.f25240l;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        Map map = this.f25241m;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
        }
        out.writeParcelable(this.f25242n, i8);
        out.writeString(this.f25243o);
        out.writeString(this.f25244p);
        Usage usage = this.f25245q;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        O o8 = this.f25246r;
        if (o8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            o8.writeToParcel(out, i8);
        }
        c cVar = this.f25247s;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        C2897G c2897g = this.f25248t;
        if (c2897g == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c2897g.writeToParcel(out, i8);
        }
        out.writeString(this.f25249u);
    }

    public /* synthetic */ Source(String str, Long l8, String str2, CodeVerification codeVerification, Long l9, String str3, Flow flow, Boolean bool, d dVar, e eVar, Redirect redirect, Status status, Map map, SourceTypeModel sourceTypeModel, String str4, String str5, Usage usage, O o8, c cVar, C2897G c2897g, String str6, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? null : l8, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : codeVerification, (i8 & 16) != 0 ? null : l9, (i8 & 32) != 0 ? null : str3, (i8 & 64) != 0 ? null : flow, (i8 & 128) != 0 ? null : bool, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : eVar, (i8 & 1024) != 0 ? null : redirect, (i8 & 2048) != 0 ? null : status, (i8 & 4096) != 0 ? null : map, (i8 & 8192) != 0 ? null : sourceTypeModel, str4, str5, (65536 & i8) != 0 ? null : usage, (131072 & i8) != 0 ? null : o8, (262144 & i8) != 0 ? null : cVar, (524288 & i8) != 0 ? null : c2897g, (i8 & 1048576) != 0 ? null : str6);
    }
}
