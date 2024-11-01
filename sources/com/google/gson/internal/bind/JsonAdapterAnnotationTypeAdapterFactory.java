package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.c;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import q1.b;

/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements r {

    /* renamed from: a, reason: collision with root package name */
    private final c f18833a;

    public JsonAdapterAnnotationTypeAdapterFactory(c cVar) {
        this.f18833a = cVar;
    }

    @Override // com.google.gson.r
    public TypeAdapter a(Gson gson, TypeToken typeToken) {
        b bVar = (b) typeToken.c().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.f18833a, gson, typeToken, bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapter b(c cVar, Gson gson, TypeToken typeToken, b bVar) {
        TypeAdapter a9;
        Object a10 = cVar.b(TypeToken.a(bVar.value())).a();
        boolean nullSafe = bVar.nullSafe();
        if (a10 instanceof TypeAdapter) {
            a9 = (TypeAdapter) a10;
        } else if (a10 instanceof r) {
            a9 = ((r) a10).a(gson, typeToken);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a10.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (a9 != null && nullSafe) {
            return a9.a();
        }
        return a9;
    }
}
