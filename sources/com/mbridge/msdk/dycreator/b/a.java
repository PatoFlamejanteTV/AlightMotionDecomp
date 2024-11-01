package com.mbridge.msdk.dycreator.b;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private int f19544a;

    /* renamed from: b, reason: collision with root package name */
    private String f19545b;

    public a(b bVar) {
        if (bVar != null) {
            this.f19544a = bVar.a();
            this.f19545b = bVar.b();
        }
    }

    public final String toString() {
        return "DyError{errorCode=" + this.f19544a + '}';
    }

    public a(int i8, String str) {
        this.f19544a = i8;
        this.f19545b = str;
    }
}
