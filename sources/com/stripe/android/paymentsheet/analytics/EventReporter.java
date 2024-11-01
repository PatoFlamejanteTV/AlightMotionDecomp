package com.stripe.android.paymentsheet.analytics;

import D3.f;
import androidx.annotation.Keep;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.stripe.android.paymentsheet.w;
import g3.EnumC2906e;
import g3.y;
import java.util.List;
import v3.EnumC4126f;
import y3.AbstractC4244b;

/* loaded from: classes4.dex */
public interface EventReporter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class Mode {

        /* renamed from: b, reason: collision with root package name */
        public static final Mode f27032b = new Mode("Complete", 0, CampaignEx.JSON_NATIVE_VIDEO_COMPLETE);

        /* renamed from: c, reason: collision with root package name */
        public static final Mode f27033c = new Mode(TypedValues.Custom.NAME, 1, "custom");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ Mode[] f27034d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f27035e;

        /* renamed from: a, reason: collision with root package name */
        private final String f27036a;

        static {
            Mode[] a9 = a();
            f27034d = a9;
            f27035e = W5.b.a(a9);
        }

        private Mode(String str, int i8, String str2) {
            this.f27036a = str2;
        }

        private static final /* synthetic */ Mode[] a() {
            return new Mode[]{f27032b, f27033c};
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) f27034d.clone();
        }

        @Override // java.lang.Enum
        @Keep
        public String toString() {
            return this.f27036a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27037a = new a("Edit", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f27038b = new a("Add", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f27039c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ W5.a f27040d;

        static {
            a[] a9 = a();
            f27039c = a9;
            f27040d = W5.b.a(a9);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f27037a, f27038b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f27039c.clone();
        }
    }

    void a();

    void b(EnumC2906e enumC2906e, Throwable th);

    void c(EnumC2906e enumC2906e);

    void d();

    void e(f fVar, y yVar, boolean z8, String str, w.l lVar, List list, boolean z9);

    void f(String str);

    void g();

    void h(String str);

    void i(boolean z8);

    void j(f fVar, AbstractC4244b abstractC4244b);

    void k(w.g gVar, boolean z8);

    void l(f fVar);

    void m(Throwable th);

    void n(String str);

    void o(f fVar);

    void onDismiss();

    void p(Throwable th);

    void q(a aVar, EnumC2906e enumC2906e);

    void r(String str);

    void s(a aVar, EnumC2906e enumC2906e);

    void t();

    void u(f fVar, EnumC4126f enumC4126f);

    void v();

    void w();

    void x(String str);
}
