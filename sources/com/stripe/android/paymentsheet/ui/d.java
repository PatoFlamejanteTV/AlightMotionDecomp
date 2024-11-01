package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27863a = new a();

        private a() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final C2.c f27864a;

        public b(C2.c cVar) {
            this.f27864a = cVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3292y.d(this.f27864a, ((b) obj).f27864a);
        }

        public int hashCode() {
            C2.c cVar = this.f27864a;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.f27864a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27865a = new c();

        private c() {
        }
    }
}
