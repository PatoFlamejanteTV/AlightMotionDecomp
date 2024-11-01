package com.google.firebase.installations;

import A0.m;

/* loaded from: classes3.dex */
public class d extends m {

    /* renamed from: a, reason: collision with root package name */
    private final a f18499a;

    /* loaded from: classes3.dex */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public d(a aVar) {
        this.f18499a = aVar;
    }

    public d(String str, a aVar) {
        super(str);
        this.f18499a = aVar;
    }
}
