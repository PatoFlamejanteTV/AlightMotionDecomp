package com.google.gson.internal;

import java.math.BigDecimal;

/* loaded from: classes4.dex */
public final class f extends Number {

    /* renamed from: a, reason: collision with root package name */
    private final String f18980a;

    public f(String str) {
        this.f18980a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f18980a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        String str = this.f18980a;
        String str2 = ((f) obj).f18980a;
        if (str == str2 || str.equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f18980a);
    }

    public int hashCode() {
        return this.f18980a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f18980a);
            } catch (NumberFormatException unused) {
                return new BigDecimal(this.f18980a).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.f18980a);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f18980a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f18980a).longValue();
        }
    }

    public String toString() {
        return this.f18980a;
    }
}
