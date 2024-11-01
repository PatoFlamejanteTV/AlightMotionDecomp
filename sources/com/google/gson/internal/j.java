package com.google.gson.internal;

import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public abstract class j {
    public static boolean a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            return true;
        }
        return false;
    }
}
