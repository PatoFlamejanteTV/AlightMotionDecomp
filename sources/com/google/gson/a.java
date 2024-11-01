package com.google.gson;

import j$.util.Objects;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Field f18789a;

    public a(Field field) {
        Objects.requireNonNull(field);
        this.f18789a = field;
    }

    public String toString() {
        return this.f18789a.toString();
    }
}
