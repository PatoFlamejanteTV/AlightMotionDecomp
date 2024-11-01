package com.stripe.android;

import Q5.p;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.ActivityResultLauncher;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.u;
import com.stripe.android.view.InterfaceC2666o;
import com.stripe.android.view.InterfaceC2668p;
import com.stripe.android.view.PaymentRelayActivity;
import java.io.Serializable;
import k3.C3237c;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import x2.k;

/* loaded from: classes4.dex */
public interface a extends InterfaceC2666o {

    /* renamed from: com.stripe.android.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0445a implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        public static final C0446a f24675a = new C0446a(null);

        /* renamed from: com.stripe.android.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0446a {
            private C0446a() {
            }

            public final AbstractC0445a a(StripeIntent stripeIntent, String str) {
                AbstractC3292y.i(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof n) {
                    return new c((n) stripeIntent, str);
                }
                if (stripeIntent instanceof u) {
                    return new d((u) stripeIntent, str);
                }
                throw new p();
            }

            public /* synthetic */ C0446a(AbstractC3284p abstractC3284p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0445a {

            /* renamed from: b, reason: collision with root package name */
            private final k f24678b;

            /* renamed from: c, reason: collision with root package name */
            private final int f24679c;

            /* renamed from: d, reason: collision with root package name */
            public static final C0447a f24676d = new C0447a(null);

            /* renamed from: e, reason: collision with root package name */
            public static final int f24677e = 8;
            public static final Parcelable.Creator<b> CREATOR = new C0448b();

            /* renamed from: com.stripe.android.a$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0447a {
                private C0447a() {
                }

                public b a(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    AbstractC3292y.g(readSerializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new b((k) readSerializable, parcel.readInt());
                }

                public void b(b bVar, Parcel parcel, int i8) {
                    AbstractC3292y.i(bVar, "<this>");
                    AbstractC3292y.i(parcel, "parcel");
                    parcel.writeSerializable(bVar.f());
                    parcel.writeInt(bVar.a());
                }

                public /* synthetic */ C0447a(AbstractC3284p abstractC3284p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.a$a$b$b, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0448b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return b.f24676d.a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k exception, int i8) {
                super(null);
                AbstractC3292y.i(exception, "exception");
                this.f24678b = exception;
                this.f24679c = i8;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public int a() {
                return this.f24679c;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public C3237c b() {
                return new C3237c(null, 0, this.f24678b, false, null, null, null, 123, null);
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
                return AbstractC3292y.d(this.f24678b, bVar.f24678b) && this.f24679c == bVar.f24679c;
            }

            public final k f() {
                return this.f24678b;
            }

            public int hashCode() {
                return (this.f24678b.hashCode() * 31) + this.f24679c;
            }

            public String toString() {
                return "ErrorArgs(exception=" + this.f24678b + ", requestCode=" + this.f24679c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                f24676d.b(this, out, i8);
            }
        }

        /* renamed from: com.stripe.android.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0445a {
            public static final Parcelable.Creator<c> CREATOR = new C0449a();

            /* renamed from: b, reason: collision with root package name */
            private final n f24680b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24681c;

            /* renamed from: com.stripe.android.a$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0449a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new c(n.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n paymentIntent, String str) {
                super(null);
                AbstractC3292y.i(paymentIntent, "paymentIntent");
                this.f24680b = paymentIntent;
                this.f24681c = str;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public int a() {
                return DefaultLoadControl.DEFAULT_MAX_BUFFER_MS;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public C3237c b() {
                return new C3237c(this.f24680b.d(), 0, null, false, null, null, this.f24681c, 62, null);
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
                return AbstractC3292y.d(this.f24680b, cVar.f24680b) && AbstractC3292y.d(this.f24681c, cVar.f24681c);
            }

            public int hashCode() {
                int hashCode = this.f24680b.hashCode() * 31;
                String str = this.f24681c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "PaymentIntentArgs(paymentIntent=" + this.f24680b + ", stripeAccountId=" + this.f24681c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                this.f24680b.writeToParcel(out, i8);
                out.writeString(this.f24681c);
            }
        }

        /* renamed from: com.stripe.android.a$a$d */
        /* loaded from: classes4.dex */
        public static final class d extends AbstractC0445a {
            public static final Parcelable.Creator<d> CREATOR = new C0450a();

            /* renamed from: b, reason: collision with root package name */
            private final u f24682b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24683c;

            /* renamed from: com.stripe.android.a$a$d$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0450a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new d(u.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(u setupIntent, String str) {
                super(null);
                AbstractC3292y.i(setupIntent, "setupIntent");
                this.f24682b = setupIntent;
                this.f24683c = str;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public int a() {
                return 50001;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public C3237c b() {
                return new C3237c(this.f24682b.d(), 0, null, false, null, null, this.f24683c, 62, null);
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
                return AbstractC3292y.d(this.f24682b, dVar.f24682b) && AbstractC3292y.d(this.f24683c, dVar.f24683c);
            }

            public int hashCode() {
                int hashCode = this.f24682b.hashCode() * 31;
                String str = this.f24683c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SetupIntentArgs(setupIntent=" + this.f24682b + ", stripeAccountId=" + this.f24683c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                this.f24682b.writeToParcel(out, i8);
                out.writeString(this.f24683c);
            }
        }

        /* renamed from: com.stripe.android.a$a$e */
        /* loaded from: classes4.dex */
        public static final class e extends AbstractC0445a {
            public static final Parcelable.Creator<e> CREATOR = new C0451a();

            /* renamed from: b, reason: collision with root package name */
            private final Source f24684b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24685c;

            /* renamed from: com.stripe.android.a$a$e$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0451a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final e createFromParcel(Parcel parcel) {
                    AbstractC3292y.i(parcel, "parcel");
                    return new e(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final e[] newArray(int i8) {
                    return new e[i8];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Source source, String str) {
                super(null);
                AbstractC3292y.i(source, "source");
                this.f24684b = source;
                this.f24685c = str;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public int a() {
                return 50002;
            }

            @Override // com.stripe.android.a.AbstractC0445a
            public C3237c b() {
                return new C3237c(null, 0, null, false, null, this.f24684b, this.f24685c, 31, null);
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
                return AbstractC3292y.d(this.f24684b, eVar.f24684b) && AbstractC3292y.d(this.f24685c, eVar.f24685c);
            }

            public int hashCode() {
                int hashCode = this.f24684b.hashCode() * 31;
                String str = this.f24685c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "SourceArgs(source=" + this.f24684b + ", stripeAccountId=" + this.f24685c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3292y.i(out, "out");
                this.f24684b.writeToParcel(out, i8);
                out.writeString(this.f24685c);
            }
        }

        private AbstractC0445a() {
        }

        public abstract int a();

        public abstract C3237c b();

        public /* synthetic */ AbstractC0445a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC2668p f24686a;

        public b(InterfaceC2668p host) {
            AbstractC3292y.i(host, "host");
            this.f24686a = host;
        }

        @Override // com.stripe.android.view.InterfaceC2666o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0445a args) {
            AbstractC3292y.i(args, "args");
            this.f24686a.b(PaymentRelayActivity.class, args.b().u(), args.a());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ActivityResultLauncher f24687a;

        public c(ActivityResultLauncher launcher) {
            AbstractC3292y.i(launcher, "launcher");
            this.f24687a = launcher;
        }

        @Override // com.stripe.android.view.InterfaceC2666o
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(AbstractC0445a args) {
            AbstractC3292y.i(args, "args");
            this.f24687a.launch(args);
        }
    }
}
