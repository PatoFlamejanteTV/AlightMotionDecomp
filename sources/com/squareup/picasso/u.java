package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.C;
import com.squareup.picasso.s;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class u extends ThreadPoolExecutor {

    /* loaded from: classes4.dex */
    private static final class a extends FutureTask implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        private final RunnableC2598c f24601a;

        a(RunnableC2598c runnableC2598c) {
            super(runnableC2598c, null);
            this.f24601a = runnableC2598c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            s.f r8 = this.f24601a.r();
            s.f r9 = aVar.f24601a.r();
            if (r8 == r9) {
                return this.f24601a.f24466a - aVar.f24601a.f24466a;
            }
            return r9.ordinal() - r8.ordinal();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u() {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C.c());
    }

    private void b(int i8) {
        setCorePoolSize(i8);
        setMaximumPoolSize(i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            int type = networkInfo.getType();
            if (type != 0) {
                if (type != 1 && type != 6 && type != 9) {
                    b(3);
                    return;
                } else {
                    b(4);
                    return;
                }
            }
            int subtype = networkInfo.getSubtype();
            switch (subtype) {
                case 1:
                case 2:
                    b(1);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    switch (subtype) {
                        case 12:
                            break;
                        case 13:
                        case 14:
                        case 15:
                            b(3);
                            return;
                        default:
                            b(3);
                            return;
                    }
            }
            b(2);
            return;
        }
        b(3);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        a aVar = new a((RunnableC2598c) runnable);
        execute(aVar);
        return aVar;
    }
}
