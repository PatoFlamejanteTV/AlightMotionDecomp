package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public class A4 extends IOException {
    public A4(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D4 a() {
        return new D4("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A4 b() {
        return new A4("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A4 c() {
        return new A4("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A4 d() {
        return new A4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A4 e() {
        return new A4("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A4 f() {
        return new A4("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static A4 g() {
        return new A4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
