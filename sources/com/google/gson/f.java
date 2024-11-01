package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes4.dex */
public abstract class f {
    public d c() {
        if (g()) {
            return (d) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public i d() {
        if (k()) {
            return (i) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public k e() {
        if (l()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public boolean g() {
        return this instanceof d;
    }

    public boolean j() {
        return this instanceof h;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return this instanceof k;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            t1.c cVar = new t1.c(stringWriter);
            cVar.J(true);
            com.google.gson.internal.l.a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }
}
