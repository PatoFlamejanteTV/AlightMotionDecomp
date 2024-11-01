package com.google.android.datatransport.cct;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import s.C3936c;
import u.g;

/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f15977c;

    /* renamed from: d, reason: collision with root package name */
    static final String f15978d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f15979e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f15980f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f15981g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f15982h;

    /* renamed from: a, reason: collision with root package name */
    private final String f15983a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15984b;

    static {
        String a9 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f15977c = a9;
        String a10 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f15978d = a10;
        String a11 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f15979e = a11;
        f15980f = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(C3936c.b("proto"), C3936c.b("json"))));
        f15981g = new a(a9, null);
        f15982h = new a(a10, a11);
    }

    public a(String str, String str2) {
        this.f15983a = str;
        this.f15984b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    @Override // u.g
    public Set a() {
        return f15980f;
    }

    public byte[] b() {
        String str = this.f15984b;
        if (str == null && this.f15983a == null) {
            return null;
        }
        String str2 = this.f15983a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName(C.UTF8_NAME));
    }

    public String d() {
        return this.f15984b;
    }

    public String e() {
        return this.f15983a;
    }

    @Override // u.f
    public byte[] getExtras() {
        return b();
    }

    @Override // u.f
    public String getName() {
        return "cct";
    }
}
