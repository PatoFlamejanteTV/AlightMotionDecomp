package com.google.gson.internal;

import com.google.gson.internal.bind.TypeAdapters;
import j$.util.Objects;
import java.io.Writer;

/* loaded from: classes4.dex */
public abstract class l {
    public static void a(com.google.gson.f fVar, t1.c cVar) {
        TypeAdapters.f18908V.d(cVar, fVar);
    }

    public static Writer b(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new b(appendable);
    }

    /* loaded from: classes4.dex */
    private static final class b extends Writer {

        /* renamed from: a, reason: collision with root package name */
        private final Appendable f19009a;

        /* renamed from: b, reason: collision with root package name */
        private final a f19010b = new a();

        /* loaded from: classes4.dex */
        private static class a implements CharSequence {

            /* renamed from: a, reason: collision with root package name */
            private char[] f19011a;

            /* renamed from: b, reason: collision with root package name */
            private String f19012b;

            private a() {
            }

            void a(char[] cArr) {
                this.f19011a = cArr;
                this.f19012b = null;
            }

            @Override // java.lang.CharSequence
            public char charAt(int i8) {
                return this.f19011a[i8];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f19011a.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i8, int i9) {
                return new String(this.f19011a, i8, i9 - i8);
            }

            @Override // java.lang.CharSequence
            public String toString() {
                if (this.f19012b == null) {
                    this.f19012b = new String(this.f19011a);
                }
                return this.f19012b;
            }
        }

        b(Appendable appendable) {
            this.f19009a = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i8, int i9) {
            this.f19010b.a(cArr);
            this.f19009a.append(this.f19010b, i8, i9 + i8);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            this.f19009a.append(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(int i8) {
            this.f19009a.append((char) i8);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i8, int i9) {
            this.f19009a.append(charSequence, i8, i9);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i8, int i9) {
            Objects.requireNonNull(str);
            this.f19009a.append(str, i8, i9 + i8);
        }
    }
}
