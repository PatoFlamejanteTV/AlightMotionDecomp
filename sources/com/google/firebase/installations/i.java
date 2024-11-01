package com.google.firebase.installations;

import android.text.TextUtils;
import e1.AbstractC2786d;
import g1.C2888b;
import g1.InterfaceC2887a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final long f18507b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f18508c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static i f18509d;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2887a f18510a;

    private i(InterfaceC2887a interfaceC2887a) {
        this.f18510a = interfaceC2887a;
    }

    public static i c() {
        return d(C2888b.a());
    }

    public static i d(InterfaceC2887a interfaceC2887a) {
        if (f18509d == null) {
            f18509d = new i(interfaceC2887a);
        }
        return f18509d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(String str) {
        return f18508c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f18510a.currentTimeMillis();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(AbstractC2786d abstractC2786d) {
        if (TextUtils.isEmpty(abstractC2786d.b()) || abstractC2786d.h() + abstractC2786d.c() < b() + f18507b) {
            return true;
        }
        return false;
    }
}
