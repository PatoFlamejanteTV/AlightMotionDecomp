package o1;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3515e {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f35869a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f35870b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f35871c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f35872d;

    /* renamed from: e, reason: collision with root package name */
    private final Long f35873e;

    public C3515e(Boolean bool, Double d8, Integer num, Integer num2, Long l8) {
        this.f35869a = bool;
        this.f35870b = d8;
        this.f35871c = num;
        this.f35872d = num2;
        this.f35873e = l8;
    }

    public final Integer a() {
        return this.f35872d;
    }

    public final Long b() {
        return this.f35873e;
    }

    public final Boolean c() {
        return this.f35869a;
    }

    public final Integer d() {
        return this.f35871c;
    }

    public final Double e() {
        return this.f35870b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3515e)) {
            return false;
        }
        C3515e c3515e = (C3515e) obj;
        if (AbstractC3292y.d(this.f35869a, c3515e.f35869a) && AbstractC3292y.d(this.f35870b, c3515e.f35870b) && AbstractC3292y.d(this.f35871c, c3515e.f35871c) && AbstractC3292y.d(this.f35872d, c3515e.f35872d) && AbstractC3292y.d(this.f35873e, c3515e.f35873e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Boolean bool = this.f35869a;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int i9 = hashCode * 31;
        Double d8 = this.f35870b;
        if (d8 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = d8.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Integer num = this.f35871c;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Integer num2 = this.f35872d;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        Long l8 = this.f35873e;
        if (l8 != null) {
            i8 = l8.hashCode();
        }
        return i12 + i8;
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f35869a + ", sessionSamplingRate=" + this.f35870b + ", sessionRestartTimeout=" + this.f35871c + ", cacheDuration=" + this.f35872d + ", cacheUpdatedTime=" + this.f35873e + ')';
    }
}
