package n7;

import java.security.Permission;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import k7.C3268b;
import k7.InterfaceC3267a;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3494b implements InterfaceC3267a {

    /* renamed from: e, reason: collision with root package name */
    private static Permission f35773e = new C3268b("BC", "threadLocalEcImplicitlyCa");

    /* renamed from: f, reason: collision with root package name */
    private static Permission f35774f = new C3268b("BC", "ecImplicitlyCa");

    /* renamed from: g, reason: collision with root package name */
    private static Permission f35775g = new C3268b("BC", "threadLocalDhDefaultParams");

    /* renamed from: h, reason: collision with root package name */
    private static Permission f35776h = new C3268b("BC", "DhDefaultParams");

    /* renamed from: i, reason: collision with root package name */
    private static Permission f35777i = new C3268b("BC", "acceptableEcCurves");

    /* renamed from: j, reason: collision with root package name */
    private static Permission f35778j = new C3268b("BC", "additionalEcParameters");

    /* renamed from: a, reason: collision with root package name */
    private ThreadLocal f35779a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    private ThreadLocal f35780b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    private volatile Set f35781c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    private volatile Map f35782d = new HashMap();
}
