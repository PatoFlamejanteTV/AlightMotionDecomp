package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class m implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final a f28129a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final h f28130b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new b((h) parcel.readParcelable(b.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(h challengeResult) {
            super(null);
            AbstractC3292y.i(challengeResult, "challengeResult");
            this.f28130b = challengeResult;
        }

        public final h a() {
            return this.f28130b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f28130b, ((b) obj).f28130b);
        }

        public int hashCode() {
            return this.f28130b.hashCode();
        }

        public String toString() {
            return "End(challengeResult=" + this.f28130b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            out.writeParcelable(this.f28130b, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends m {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.views.d f28131b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3292y.i(parcel, "parcel");
                return new c(com.stripe.android.stripe3ds2.views.d.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.stripe.android.stripe3ds2.views.d challengeViewArgs) {
            super(null);
            AbstractC3292y.i(challengeViewArgs, "challengeViewArgs");
            this.f28131b = challengeViewArgs;
        }

        public final com.stripe.android.stripe3ds2.views.d a() {
            return this.f28131b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3292y.d(this.f28131b, ((c) obj).f28131b);
        }

        public int hashCode() {
            return this.f28131b.hashCode();
        }

        public String toString() {
            return "Start(challengeViewArgs=" + this.f28131b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3292y.i(out, "out");
            this.f28131b.writeToParcel(out, i8);
        }
    }

    private m() {
    }

    public /* synthetic */ m(AbstractC3284p abstractC3284p) {
        this();
    }
}
