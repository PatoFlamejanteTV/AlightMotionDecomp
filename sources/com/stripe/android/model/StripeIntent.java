package com.stripe.android.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import g3.EnumC2891A;
import g3.O;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface StripeIntent extends z2.f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class NextActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25351b;

        /* renamed from: c, reason: collision with root package name */
        public static final NextActionType f25352c = new NextActionType("RedirectToUrl", 0, "redirect_to_url");

        /* renamed from: d, reason: collision with root package name */
        public static final NextActionType f25353d = new NextActionType("UseStripeSdk", 1, "use_stripe_sdk");

        /* renamed from: e, reason: collision with root package name */
        public static final NextActionType f25354e = new NextActionType("DisplayOxxoDetails", 2, "oxxo_display_details");

        /* renamed from: f, reason: collision with root package name */
        public static final NextActionType f25355f = new NextActionType("AlipayRedirect", 3, "alipay_handle_redirect");

        /* renamed from: g, reason: collision with root package name */
        public static final NextActionType f25356g = new NextActionType("BlikAuthorize", 4, "blik_authorize");

        /* renamed from: h, reason: collision with root package name */
        public static final NextActionType f25357h = new NextActionType("WeChatPayRedirect", 5, "wechat_pay_redirect_to_android_app");

        /* renamed from: i, reason: collision with root package name */
        public static final NextActionType f25358i = new NextActionType("VerifyWithMicrodeposits", 6, "verify_with_microdeposits");

        /* renamed from: j, reason: collision with root package name */
        public static final NextActionType f25359j = new NextActionType("UpiAwaitNotification", 7, "upi_await_notification");

        /* renamed from: k, reason: collision with root package name */
        public static final NextActionType f25360k = new NextActionType("CashAppRedirect", 8, "cashapp_handle_redirect_or_display_qr_code");

        /* renamed from: l, reason: collision with root package name */
        public static final NextActionType f25361l = new NextActionType("DisplayBoletoDetails", 9, "boleto_display_details");

        /* renamed from: m, reason: collision with root package name */
        public static final NextActionType f25362m = new NextActionType("DisplayKonbiniDetails", 10, "konbini_display_details");

        /* renamed from: n, reason: collision with root package name */
        public static final NextActionType f25363n = new NextActionType("DisplayMultibancoDetails", 11, "multibanco_display_details");

        /* renamed from: o, reason: collision with root package name */
        public static final NextActionType f25364o = new NextActionType("SwishRedirect", 12, "swish_handle_redirect_or_display_qr_code");

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ NextActionType[] f25365p;

        /* renamed from: q, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25366q;

        /* renamed from: a, reason: collision with root package name */
        private final String f25367a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final NextActionType a(String str) {
                Object obj;
                Iterator<E> it = NextActionType.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3292y.d(((NextActionType) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (NextActionType) obj;
            }

            public /* synthetic */ a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        static {
            NextActionType[] a9 = a();
            f25365p = a9;
            f25366q = W5.b.a(a9);
            f25351b = new a(null);
        }

        private NextActionType(String str, int i8, String str2) {
            this.f25367a = str2;
        }

        private static final /* synthetic */ NextActionType[] a() {
            return new NextActionType[]{f25352c, f25353d, f25354e, f25355f, f25356g, f25357h, f25358i, f25359j, f25360k, f25361l, f25362m, f25363n, f25364o};
        }

        public static W5.a c() {
            return f25366q;
        }

        public static NextActionType valueOf(String str) {
            return (NextActionType) Enum.valueOf(NextActionType.class, str);
        }

        public static NextActionType[] values() {
            return (NextActionType[]) f25365p.clone();
        }

        public final String b() {
            return this.f25367a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25367a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Status {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25368b;

        /* renamed from: c, reason: collision with root package name */
        public static final Status f25369c = new Status("Canceled", 0, "canceled");

        /* renamed from: d, reason: collision with root package name */
        public static final Status f25370d = new Status("Processing", 1, "processing");

        /* renamed from: e, reason: collision with root package name */
        public static final Status f25371e = new Status("RequiresAction", 2, "requires_action");

        /* renamed from: f, reason: collision with root package name */
        public static final Status f25372f = new Status("RequiresConfirmation", 3, "requires_confirmation");

        /* renamed from: g, reason: collision with root package name */
        public static final Status f25373g = new Status("RequiresPaymentMethod", 4, "requires_payment_method");

        /* renamed from: h, reason: collision with root package name */
        public static final Status f25374h = new Status("Succeeded", 5, "succeeded");

        /* renamed from: i, reason: collision with root package name */
        public static final Status f25375i = new Status("RequiresCapture", 6, "requires_capture");

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ Status[] f25376j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25377k;

        /* renamed from: a, reason: collision with root package name */
        private final String f25378a;

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
                        if (AbstractC3292y.d(((Status) obj).b(), str)) {
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
            f25376j = a9;
            f25377k = W5.b.a(a9);
            f25368b = new a(null);
        }

        private Status(String str, int i8, String str2) {
            this.f25378a = str2;
        }

        private static final /* synthetic */ Status[] a() {
            return new Status[]{f25369c, f25370d, f25371e, f25372f, f25373g, f25374h, f25375i};
        }

        public static W5.a c() {
            return f25377k;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) f25376j.clone();
        }

        public final String b() {
            return this.f25378a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25378a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Usage {

        /* renamed from: b, reason: collision with root package name */
        public static final a f25379b;

        /* renamed from: c, reason: collision with root package name */
        public static final Usage f25380c = new Usage("OnSession", 0, "on_session");

        /* renamed from: d, reason: collision with root package name */
        public static final Usage f25381d = new Usage("OffSession", 1, "off_session");

        /* renamed from: e, reason: collision with root package name */
        public static final Usage f25382e = new Usage("OneTime", 2, "one_time");

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ Usage[] f25383f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ W5.a f25384g;

        /* renamed from: a, reason: collision with root package name */
        private final String f25385a;

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
            f25383f = a9;
            f25384g = W5.b.a(a9);
            f25379b = new a(null);
        }

        private Usage(String str, int i8, String str2) {
            this.f25385a = str2;
        }

        private static final /* synthetic */ Usage[] a() {
            return new Usage[]{f25380c, f25381d, f25382e};
        }

        public static W5.a c() {
            return f25384g;
        }

        public static Usage valueOf(String str) {
            return (Usage) Enum.valueOf(Usage.class, str);
        }

        public static Usage[] values() {
            return (Usage[]) f25383f.clone();
        }

        public final String b() {
            return this.f25385a;
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f25385a;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class a implements z2.f {

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f25392a = new b();
            public static final Parcelable.Creator<b> CREATOR = new C0480a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0480a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    parcel.readInt();
                    return b.f25392a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            private b() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1031794127;
            }

            public String toString() {
                return "BlikAuthorize";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {
            public static final Parcelable.Creator<c> CREATOR = new C0481a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25393a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0481a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String mobileAuthUrl) {
                super(null);
                AbstractC3292y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f25393a = mobileAuthUrl;
            }

            public final String b() {
                return this.f25393a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3292y.d(this.f25393a, ((c) obj).f25393a);
            }

            public int hashCode() {
                return this.f25393a.hashCode();
            }

            public String toString() {
                return "CashAppRedirect(mobileAuthUrl=" + this.f25393a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25393a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a implements h {
            public static final Parcelable.Creator<d> CREATOR = new C0482a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25394a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0482a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new d(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str) {
                super(null);
                this.f25394a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25394a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && AbstractC3292y.d(this.f25394a, ((d) obj).f25394a);
            }

            public int hashCode() {
                String str = this.f25394a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayBoletoDetails(hostedVoucherUrl=" + this.f25394a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25394a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a implements h {
            public static final Parcelable.Creator<e> CREATOR = new C0483a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25395a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0483a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new e(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            public e(String str) {
                super(null);
                this.f25395a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25395a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3292y.d(this.f25395a, ((e) obj).f25395a);
            }

            public int hashCode() {
                String str = this.f25395a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayKonbiniDetails(hostedVoucherUrl=" + this.f25395a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25395a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a implements h {
            public static final Parcelable.Creator<f> CREATOR = new C0484a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25396a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$f$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0484a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final f createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new f(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final f[] newArray(int i8) {
                    return new f[i8];
                }
            }

            public f(String str) {
                super(null);
                this.f25396a = str;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25396a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3292y.d(this.f25396a, ((f) obj).f25396a);
            }

            public int hashCode() {
                String str = this.f25396a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "DisplayMultibancoDetails(hostedVoucherUrl=" + this.f25396a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25396a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a implements h {
            public static final Parcelable.Creator<g> CREATOR = new C0485a();

            /* renamed from: a, reason: collision with root package name */
            private final int f25397a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25398b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25399c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$g$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0485a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final g createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new g(parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final g[] newArray(int i8) {
                    return new g[i8];
                }
            }

            public g(int i8, String str, String str2) {
                super(null);
                this.f25397a = i8;
                this.f25398b = str;
                this.f25399c = str2;
            }

            @Override // com.stripe.android.model.StripeIntent.a.h
            public String a() {
                return this.f25399c;
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
                return this.f25397a == gVar.f25397a && AbstractC3292y.d(this.f25398b, gVar.f25398b) && AbstractC3292y.d(this.f25399c, gVar.f25399c);
            }

            public int hashCode() {
                int i8 = this.f25397a * 31;
                String str = this.f25398b;
                int hashCode = (i8 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f25399c;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "DisplayOxxoDetails(expiresAfter=" + this.f25397a + ", number=" + this.f25398b + ", hostedVoucherUrl=" + this.f25399c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(this.f25397a);
                out.writeString(this.f25398b);
                out.writeString(this.f25399c);
            }
        }

        /* loaded from: classes4.dex */
        public interface h {
            String a();
        }

        /* loaded from: classes4.dex */
        public static final class i extends a {
            public static final Parcelable.Creator<i> CREATOR = new C0486a();

            /* renamed from: a, reason: collision with root package name */
            private final Uri f25400a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25401b;

            /* renamed from: com.stripe.android.model.StripeIntent$a$i$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0486a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final i createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new i((Uri) parcel.readParcelable(i.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final i[] newArray(int i8) {
                    return new i[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public i(Uri url, String str) {
                super(null);
                AbstractC3292y.i(url, "url");
                this.f25400a = url;
                this.f25401b = str;
            }

            public final String A() {
                return this.f25401b;
            }

            public final Uri b() {
                return this.f25400a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return AbstractC3292y.d(this.f25400a, iVar.f25400a) && AbstractC3292y.d(this.f25401b, iVar.f25401b);
            }

            public int hashCode() {
                int hashCode = this.f25400a.hashCode() * 31;
                String str = this.f25401b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "RedirectToUrl(url=" + this.f25400a + ", returnUrl=" + this.f25401b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeParcelable(this.f25400a, i8);
                out.writeString(this.f25401b);
            }
        }

        /* loaded from: classes4.dex */
        public static abstract class j extends a {

            /* renamed from: com.stripe.android.model.StripeIntent$a$j$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0487a extends j {
                public static final Parcelable.Creator<C0487a> CREATOR = new C0488a();

                /* renamed from: a, reason: collision with root package name */
                private final String f25402a;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$a$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0488a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final C0487a createFromParcel(Parcel parcel) {
                        AbstractC3292y.i(parcel, "parcel");
                        return new C0487a(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final C0487a[] newArray(int i8) {
                        return new C0487a[i8];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0487a(String url) {
                    super(null);
                    AbstractC3292y.i(url, "url");
                    this.f25402a = url;
                }

                public final String b() {
                    return this.f25402a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C0487a) && AbstractC3292y.d(this.f25402a, ((C0487a) obj).f25402a);
                }

                public int hashCode() {
                    return this.f25402a.hashCode();
                }

                public String toString() {
                    return "Use3DS1(url=" + this.f25402a + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3292y.i(out, "out");
                    out.writeString(this.f25402a);
                }
            }

            /* loaded from: classes4.dex */
            public static final class b extends j {
                public static final Parcelable.Creator<b> CREATOR = new C0489a();

                /* renamed from: a, reason: collision with root package name */
                private final String f25403a;

                /* renamed from: b, reason: collision with root package name */
                private final String f25404b;

                /* renamed from: c, reason: collision with root package name */
                private final String f25405c;

                /* renamed from: d, reason: collision with root package name */
                private final C0490b f25406d;

                /* renamed from: e, reason: collision with root package name */
                private final String f25407e;

                /* renamed from: f, reason: collision with root package name */
                private final String f25408f;

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$a, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0489a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final b createFromParcel(Parcel parcel) {
                        AbstractC3292y.i(parcel, "parcel");
                        return new b(parcel.readString(), parcel.readString(), parcel.readString(), C0490b.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final b[] newArray(int i8) {
                        return new b[i8];
                    }
                }

                /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b, reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0490b implements Parcelable {
                    public static final Parcelable.Creator<C0490b> CREATOR = new C0491a();

                    /* renamed from: a, reason: collision with root package name */
                    private final String f25409a;

                    /* renamed from: b, reason: collision with root package name */
                    private final String f25410b;

                    /* renamed from: c, reason: collision with root package name */
                    private final List f25411c;

                    /* renamed from: d, reason: collision with root package name */
                    private final String f25412d;

                    /* renamed from: com.stripe.android.model.StripeIntent$a$j$b$b$a, reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0491a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final C0490b createFromParcel(Parcel parcel) {
                            AbstractC3292y.i(parcel, "parcel");
                            return new C0490b(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final C0490b[] newArray(int i8) {
                            return new C0490b[i8];
                        }
                    }

                    public C0490b(String directoryServerId, String dsCertificateData, List rootCertsData, String str) {
                        AbstractC3292y.i(directoryServerId, "directoryServerId");
                        AbstractC3292y.i(dsCertificateData, "dsCertificateData");
                        AbstractC3292y.i(rootCertsData, "rootCertsData");
                        this.f25409a = directoryServerId;
                        this.f25410b = dsCertificateData;
                        this.f25411c = rootCertsData;
                        this.f25412d = str;
                    }

                    public final String a() {
                        return this.f25409a;
                    }

                    public final String b() {
                        return this.f25410b;
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C0490b)) {
                            return false;
                        }
                        C0490b c0490b = (C0490b) obj;
                        return AbstractC3292y.d(this.f25409a, c0490b.f25409a) && AbstractC3292y.d(this.f25410b, c0490b.f25410b) && AbstractC3292y.d(this.f25411c, c0490b.f25411c) && AbstractC3292y.d(this.f25412d, c0490b.f25412d);
                    }

                    public final String f() {
                        return this.f25412d;
                    }

                    public final List h() {
                        return this.f25411c;
                    }

                    public int hashCode() {
                        int hashCode = ((((this.f25409a.hashCode() * 31) + this.f25410b.hashCode()) * 31) + this.f25411c.hashCode()) * 31;
                        String str = this.f25412d;
                        return hashCode + (str == null ? 0 : str.hashCode());
                    }

                    public String toString() {
                        return "DirectoryServerEncryption(directoryServerId=" + this.f25409a + ", dsCertificateData=" + this.f25410b + ", rootCertsData=" + this.f25411c + ", keyId=" + this.f25412d + ")";
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(Parcel out, int i8) {
                        AbstractC3292y.i(out, "out");
                        out.writeString(this.f25409a);
                        out.writeString(this.f25410b);
                        out.writeStringList(this.f25411c);
                        out.writeString(this.f25412d);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(String source, String serverName, String transactionId, C0490b serverEncryption, String str, String str2) {
                    super(null);
                    AbstractC3292y.i(source, "source");
                    AbstractC3292y.i(serverName, "serverName");
                    AbstractC3292y.i(transactionId, "transactionId");
                    AbstractC3292y.i(serverEncryption, "serverEncryption");
                    this.f25403a = source;
                    this.f25404b = serverName;
                    this.f25405c = transactionId;
                    this.f25406d = serverEncryption;
                    this.f25407e = str;
                    this.f25408f = str2;
                }

                public final String b() {
                    return this.f25408f;
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
                    return AbstractC3292y.d(this.f25403a, bVar.f25403a) && AbstractC3292y.d(this.f25404b, bVar.f25404b) && AbstractC3292y.d(this.f25405c, bVar.f25405c) && AbstractC3292y.d(this.f25406d, bVar.f25406d) && AbstractC3292y.d(this.f25407e, bVar.f25407e) && AbstractC3292y.d(this.f25408f, bVar.f25408f);
                }

                public final C0490b f() {
                    return this.f25406d;
                }

                public final String h() {
                    return this.f25404b;
                }

                public int hashCode() {
                    int hashCode = ((((((this.f25403a.hashCode() * 31) + this.f25404b.hashCode()) * 31) + this.f25405c.hashCode()) * 31) + this.f25406d.hashCode()) * 31;
                    String str = this.f25407e;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.f25408f;
                    return hashCode2 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String i() {
                    return this.f25403a;
                }

                public final String l() {
                    return this.f25407e;
                }

                public final String p() {
                    return this.f25405c;
                }

                public String toString() {
                    return "Use3DS2(source=" + this.f25403a + ", serverName=" + this.f25404b + ", transactionId=" + this.f25405c + ", serverEncryption=" + this.f25406d + ", threeDS2IntentId=" + this.f25407e + ", publishableKey=" + this.f25408f + ")";
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i8) {
                    AbstractC3292y.i(out, "out");
                    out.writeString(this.f25403a);
                    out.writeString(this.f25404b);
                    out.writeString(this.f25405c);
                    this.f25406d.writeToParcel(out, i8);
                    out.writeString(this.f25407e);
                    out.writeString(this.f25408f);
                }
            }

            public /* synthetic */ j(AbstractC3284p abstractC3284p) {
                this();
            }

            private j() {
                super(null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class k extends a {
            public static final Parcelable.Creator<k> CREATOR = new C0492a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25413a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$k$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0492a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final k createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new k(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final k[] newArray(int i8) {
                    return new k[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public k(String mobileAuthUrl) {
                super(null);
                AbstractC3292y.i(mobileAuthUrl, "mobileAuthUrl");
                this.f25413a = mobileAuthUrl;
            }

            public final String b() {
                return this.f25413a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && AbstractC3292y.d(this.f25413a, ((k) obj).f25413a);
            }

            public int hashCode() {
                return this.f25413a.hashCode();
            }

            public String toString() {
                return "SwishRedirect(mobileAuthUrl=" + this.f25413a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25413a);
            }
        }

        /* loaded from: classes4.dex */
        public static final class l extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final l f25414a = new l();
            public static final Parcelable.Creator<l> CREATOR = new C0493a();

            /* renamed from: com.stripe.android.model.StripeIntent$a$l$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0493a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final l createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    parcel.readInt();
                    return l.f25414a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final l[] newArray(int i8) {
                    return new l[i8];
                }
            }

            private l() {
                super(null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public int hashCode() {
                return -1021414879;
            }

            public String toString() {
                return "UpiAwaitNotification";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes4.dex */
        public static final class m extends a {
            public static final Parcelable.Creator<m> CREATOR = new C0494a();

            /* renamed from: a, reason: collision with root package name */
            private final long f25415a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25416b;

            /* renamed from: c, reason: collision with root package name */
            private final EnumC2891A f25417c;

            /* renamed from: com.stripe.android.model.StripeIntent$a$m$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0494a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final m createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new m(parcel.readLong(), parcel.readString(), EnumC2891A.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final m[] newArray(int i8) {
                    return new m[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public m(long j8, String hostedVerificationUrl, EnumC2891A microdepositType) {
                super(null);
                AbstractC3292y.i(hostedVerificationUrl, "hostedVerificationUrl");
                AbstractC3292y.i(microdepositType, "microdepositType");
                this.f25415a = j8;
                this.f25416b = hostedVerificationUrl;
                this.f25417c = microdepositType;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof m)) {
                    return false;
                }
                m mVar = (m) obj;
                return this.f25415a == mVar.f25415a && AbstractC3292y.d(this.f25416b, mVar.f25416b) && this.f25417c == mVar.f25417c;
            }

            public int hashCode() {
                return (((androidx.collection.a.a(this.f25415a) * 31) + this.f25416b.hashCode()) * 31) + this.f25417c.hashCode();
            }

            public String toString() {
                return "VerifyWithMicrodeposits(arrivalDate=" + this.f25415a + ", hostedVerificationUrl=" + this.f25416b + ", microdepositType=" + this.f25417c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeLong(this.f25415a);
                out.writeString(this.f25416b);
                out.writeString(this.f25417c.name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class n extends a {
            public static final Parcelable.Creator<n> CREATOR = new C0495a();

            /* renamed from: a, reason: collision with root package name */
            private final O f25418a;

            /* renamed from: com.stripe.android.model.StripeIntent$a$n$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0495a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final n createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new n(O.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final n[] newArray(int i8) {
                    return new n[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(O weChat) {
                super(null);
                AbstractC3292y.i(weChat, "weChat");
                this.f25418a = weChat;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && AbstractC3292y.d(this.f25418a, ((n) obj).f25418a);
            }

            public int hashCode() {
                return this.f25418a.hashCode();
            }

            public String toString() {
                return "WeChatPayRedirect(weChat=" + this.f25418a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                this.f25418a.writeToParcel(out, i8);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }

        /* renamed from: com.stripe.android.model.StripeIntent$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0478a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final String f25388a;

            /* renamed from: b, reason: collision with root package name */
            private final String f25389b;

            /* renamed from: c, reason: collision with root package name */
            private final Uri f25390c;

            /* renamed from: d, reason: collision with root package name */
            private final String f25391d;

            /* renamed from: e, reason: collision with root package name */
            private static final C0479a f25386e = new C0479a(null);

            /* renamed from: f, reason: collision with root package name */
            public static final int f25387f = 8;
            public static final Parcelable.Creator<C0478a> CREATOR = new b();

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            private static final class C0479a {
                private C0479a() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.String b(java.lang.String r4) {
                    /*
                        r3 = this;
                        r0 = 0
                        Q5.s$a r1 = Q5.s.f8810b     // Catch: java.lang.Throwable -> L2e
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                        r1.<init>()     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r2 = "alipay://url?"
                        r1.append(r2)     // Catch: java.lang.Throwable -> L2e
                        r1.append(r4)     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2e
                        android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L2e
                        java.lang.String r1 = "return_url"
                        java.lang.String r4 = r4.getQueryParameter(r1)     // Catch: java.lang.Throwable -> L2e
                        if (r4 == 0) goto L2c
                        B4.c r1 = B4.c.f609a     // Catch: java.lang.Throwable -> L2e
                        kotlin.jvm.internal.AbstractC3292y.f(r4)     // Catch: java.lang.Throwable -> L2e
                        boolean r1 = r1.a(r4)     // Catch: java.lang.Throwable -> L2e
                        if (r1 == 0) goto L2c
                        goto L30
                    L2c:
                        r4 = r0
                        goto L30
                    L2e:
                        r4 = move-exception
                        goto L35
                    L30:
                        java.lang.Object r4 = Q5.s.b(r4)     // Catch: java.lang.Throwable -> L2e
                        goto L3f
                    L35:
                        Q5.s$a r1 = Q5.s.f8810b
                        java.lang.Object r4 = Q5.t.a(r4)
                        java.lang.Object r4 = Q5.s.b(r4)
                    L3f:
                        boolean r1 = Q5.s.g(r4)
                        if (r1 == 0) goto L46
                        goto L47
                    L46:
                        r0 = r4
                    L47:
                        java.lang.String r0 = (java.lang.String) r0
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0478a.C0479a.b(java.lang.String):java.lang.String");
                }

                public /* synthetic */ C0479a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.StripeIntent$a$a$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0478a createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new C0478a(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(C0478a.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0478a[] newArray(int i8) {
                    return new C0478a[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0478a(String data, String str, Uri webViewUrl, String str2) {
                super(null);
                AbstractC3292y.i(data, "data");
                AbstractC3292y.i(webViewUrl, "webViewUrl");
                this.f25388a = data;
                this.f25389b = str;
                this.f25390c = webViewUrl;
                this.f25391d = str2;
            }

            public final String A() {
                return this.f25391d;
            }

            public final Uri b() {
                return this.f25390c;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0478a)) {
                    return false;
                }
                C0478a c0478a = (C0478a) obj;
                return AbstractC3292y.d(this.f25388a, c0478a.f25388a) && AbstractC3292y.d(this.f25389b, c0478a.f25389b) && AbstractC3292y.d(this.f25390c, c0478a.f25390c) && AbstractC3292y.d(this.f25391d, c0478a.f25391d);
            }

            public int hashCode() {
                int hashCode = this.f25388a.hashCode() * 31;
                String str = this.f25389b;
                int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f25390c.hashCode()) * 31;
                String str2 = this.f25391d;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AlipayRedirect(data=" + this.f25388a + ", authCompleteUrl=" + this.f25389b + ", webViewUrl=" + this.f25390c + ", returnUrl=" + this.f25391d + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                out.writeString(this.f25388a);
                out.writeString(this.f25389b);
                out.writeParcelable(this.f25390c, i8);
                out.writeString(this.f25391d);
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public C0478a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
                /*
                    r2 = this;
                    java.lang.String r0 = "data"
                    kotlin.jvm.internal.AbstractC3292y.i(r3, r0)
                    java.lang.String r0 = "webViewUrl"
                    kotlin.jvm.internal.AbstractC3292y.i(r4, r0)
                    com.stripe.android.model.StripeIntent$a$a$a r0 = com.stripe.android.model.StripeIntent.a.C0478a.f25386e
                    java.lang.String r0 = com.stripe.android.model.StripeIntent.a.C0478a.C0479a.a(r0, r3)
                    android.net.Uri r4 = android.net.Uri.parse(r4)
                    java.lang.String r1 = "parse(...)"
                    kotlin.jvm.internal.AbstractC3292y.h(r4, r1)
                    r2.<init>(r3, r0, r4, r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.StripeIntent.a.C0478a.<init>(java.lang.String, java.lang.String, java.lang.String):void");
            }
        }
    }

    List F();

    List J();

    boolean K();

    Map N();

    boolean c();

    String d();

    List e();

    String getId();

    Status getStatus();

    a j();

    NextActionType k();

    String m();

    o r();

    boolean t();
}
