package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.transaction.c;
import com.stripe.android.stripe3ds2.transaction.f;
import javax.crypto.SecretKey;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public interface g {

    /* loaded from: classes4.dex */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        private final a4.k f28080a;

        /* renamed from: b, reason: collision with root package name */
        private final Z3.c f28081b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a f28082c;

        public a(a4.k messageTransformer, Z3.c errorReporter, c.a creqExecutorConfig) {
            AbstractC3292y.i(messageTransformer, "messageTransformer");
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(creqExecutorConfig, "creqExecutorConfig");
            this.f28080a = messageTransformer;
            this.f28081b = errorReporter;
            this.f28082c = creqExecutorConfig;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f.a a(SecretKey secretKey) {
            AbstractC3292y.i(secretKey, "secretKey");
            return new f.a(this.f28080a, secretKey, this.f28081b, this.f28082c);
        }
    }

    f a(SecretKey secretKey);
}
